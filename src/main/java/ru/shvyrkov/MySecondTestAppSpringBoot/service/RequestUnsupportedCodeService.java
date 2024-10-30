package ru.shvyrkov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.shvyrkov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;

@Service
public class RequestUnsupportedCodeService implements UnsupportedCodeService {
    @Override
    public void isSupported(int uid) throws UnsupportedCodeException {
        if (uid == 123) {
            throw new UnsupportedCodeException("Unsupported UID: " + uid);
        }
    }
}
