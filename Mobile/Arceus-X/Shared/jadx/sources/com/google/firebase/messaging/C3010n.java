package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import gg.C6094b;
import gg.EnumC6095c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p488v9.ThreadFactoryC12109b;

/* JADX INFO: renamed from: com.google.firebase.messaging.n */
/* JADX INFO: loaded from: classes2.dex */
public class C3010n {
    @SuppressLint({"ThreadPoolCreation"})
    /* JADX INFO: renamed from: a */
    public static Executor m14623a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC12109b(str));
    }

    /* JADX INFO: renamed from: b */
    public static Executor m14624b() {
        return m14623a("Firebase-Messaging-File-Io");
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* JADX INFO: renamed from: c */
    public static ScheduledExecutorService m14625c() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC12109b("Firebase-Messaging-Init"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* JADX INFO: renamed from: d */
    public static ExecutorService m14626d() {
        return C6094b.m26971a().mo26970a(new ThreadFactoryC12109b("Firebase-Messaging-Intent-Handle"), EnumC6095c.HIGH_SPEED);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* JADX INFO: renamed from: e */
    public static ExecutorService m14627e() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC12109b("Firebase-Messaging-Network-Io"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* JADX INFO: renamed from: f */
    public static ExecutorService m14628f() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC12109b("Firebase-Messaging-Task"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* JADX INFO: renamed from: g */
    public static ScheduledExecutorService m14629g() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC12109b("Firebase-Messaging-Topics-Io"));
    }
}
