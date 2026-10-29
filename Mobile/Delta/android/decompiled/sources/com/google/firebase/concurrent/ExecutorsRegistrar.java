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
import jf.a;
import jf.d;
import lf.c;
import lf.e0;
import lf.g;
import lf.x;
import mf.o;
import xf.b;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x<ScheduledExecutorService> f8695a = new x<>(new b() { // from class: mf.q
        @Override // xf.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });
    public static final x<ScheduledExecutorService> b = new x<>(new b() { // from class: mf.r
        @Override // xf.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x<ScheduledExecutorService> f8696c = new x<>(new b() { // from class: mf.s
        @Override // xf.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x<ScheduledExecutorService> f8697d = new x<>(new b() { // from class: mf.t
        @Override // xf.b
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
        return new mf.b(str, i10, null);
    }

    public static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new mf.b(str, i10, threadPolicy);
    }

    public static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, f8697d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.f(e0.a(a.class, ScheduledExecutorService.class), e0.a(a.class, ExecutorService.class), e0.a(a.class, Executor.class)).f(new g() { // from class: mf.u
            @Override // lf.g
            public final Object create(lf.d dVar) {
                return ExecutorsRegistrar.f8695a.get();
            }
        }).d(), c.f(e0.a(jf.b.class, ScheduledExecutorService.class), e0.a(jf.b.class, ExecutorService.class), e0.a(jf.b.class, Executor.class)).f(new g() { // from class: mf.v
            @Override // lf.g
            public final Object create(lf.d dVar) {
                return ExecutorsRegistrar.f8696c.get();
            }
        }).d(), c.f(e0.a(jf.c.class, ScheduledExecutorService.class), e0.a(jf.c.class, ExecutorService.class), e0.a(jf.c.class, Executor.class)).f(new g() { // from class: mf.w
            @Override // lf.g
            public final Object create(lf.d dVar) {
                return ExecutorsRegistrar.b.get();
            }
        }).d(), c.e(e0.a(d.class, Executor.class)).f(new g() { // from class: mf.x
            @Override // lf.g
            public final Object create(lf.d dVar) {
                return a0.INSTANCE;
            }
        }).d());
    }
}
