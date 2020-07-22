package com.galid.mybatisboard.config;

import com.galid.mybatisboard.domain.User;
import com.galid.mybatisboard.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DaoUserDetailsService implements UserDetailsService {
    private final UserMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);

        User user = mapper.findByAuthId(username)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 ID 입니다."));

        return new org.springframework.security.core.userdetails.User(user.getAuthId(), user.getPassword(), List.of(new SimpleGrantedAuthority("USER")));
    }
}
