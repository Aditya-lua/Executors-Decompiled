package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kf.a;
import kf.d;
import mf.c;
import mf.e0;
import mf.g;
import mf.x;
import nf.o;
import yf.b;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x<ScheduledExecutorService> f8769a = new x<>(new b() { // from class: nf.q
        @Override // yf.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });
    public static final x<ScheduledExecutorService> b = new x<>(new b() { // from class: nf.r
        @Override // yf.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x<ScheduledExecutorService> f8770c = new x<>(new b() { // from class: nf.s
        @Override // yf.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x<ScheduledExecutorService> f8771d = new x<>(new b() { // from class: nf.t
        @Override // yf.b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
        }
    });

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    public static ThreadFactory j(String str, int i10) {
        return new nf.b(str, i10, null);
    }

    public static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new nf.b(str, i10, threadPolicy);
    }

    public static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, f8771d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.f(e0.a(a.class, ScheduledExecutorService.class), e0.a(a.class, ExecutorService.class), e0.a(a.class, Executor.class)).f(new g() { // from class: nf.u
            @Override // mf.g
            public final Object create(mf.d dVar) {
                return ExecutorsRegistrar.f8769a.get();
            }
        }).d(), c.f(e0.a(kf.b.class, ScheduledExecutorService.class), e0.a(kf.b.class, ExecutorService.class), e0.a(kf.b.class, Executor.class)).f(new g() { // from class: nf.v
            @Override // mf.g
            public final Object create(mf.d dVar) {
                return ExecutorsRegistrar.f8770c.get();
            }
        }).d(), c.f(e0.a(kf.c.class, ScheduledExecutorService.class), e0.a(kf.c.class, ExecutorService.class), e0.a(kf.c.class, Executor.class)).f(new g() { // from class: nf.w
            @Override // mf.g
            public final Object create(mf.d dVar) {
                return ExecutorsRegistrar.b.get();
            }
        }).d(), c.e(e0.a(d.class, Executor.class)).f(new g() { // from class: nf.x
            @Override // mf.g
            public final Object create(mf.d dVar) {
                return a0.INSTANCE;
            }
        }).d());
    }
}
