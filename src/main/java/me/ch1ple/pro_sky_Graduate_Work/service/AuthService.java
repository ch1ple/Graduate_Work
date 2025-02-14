package me.ch1ple.pro_sky_Graduate_Work.service;

import me.ch1ple.pro_sky_Graduate_Work.dto.user.Register;

public interface AuthService {
    boolean login(String userName, String password);

    boolean register(Register register);
}
