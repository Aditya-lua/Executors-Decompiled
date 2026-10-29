package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class n {
    @SuppressLint({"ThreadPoolCreation"})
    public static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new v9.b(str));
    }

    public static Executor b() {
        return a("Firebase-Messaging-File-Io");
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ScheduledExecutorService c() {
        return new ScheduledThreadPoolExecutor(1, new v9.b("Firebase-Messaging-Init"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService d() {
        return fg.b.a().a(new v9.b("Firebase-Messaging-Intent-Handle"), fg.c.HIGH_SPEED);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new v9.b("Firebase-Messaging-Network-Io"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new v9.b("Firebase-Messaging-Task"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ScheduledExecutorService g() {
        return new ScheduledThreadPoolExecutor(1, new v9.b("Firebase-Messaging-Topics-Io"));
    }
}
