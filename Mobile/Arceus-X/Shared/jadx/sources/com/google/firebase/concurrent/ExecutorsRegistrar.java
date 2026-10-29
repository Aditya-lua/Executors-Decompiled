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
import nf.ScheduledExecutorServiceC9458o;
import nf.ThreadFactoryC9445b;
import p247kf.InterfaceC7579a;
import p247kf.InterfaceC7580b;
import p247kf.InterfaceC7581c;
import p247kf.InterfaceC7582d;
import p292mf.C8492c;
import p292mf.C8497e0;
import p292mf.C8517x;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;
import p575yf.InterfaceC13188b;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a */
    public static final C8517x<ScheduledExecutorService> f11182a = new C8517x<>(new InterfaceC13188b() { // from class: nf.q
        @Override // p575yf.InterfaceC13188b
        public final Object get() {
            return ExecutorsRegistrar.m14403m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.m14401k("Firebase Background", 10, ExecutorsRegistrar.m14399i())));
        }
    });

    /* JADX INFO: renamed from: b */
    public static final C8517x<ScheduledExecutorService> f11183b = new C8517x<>(new InterfaceC13188b() { // from class: nf.r
        @Override // p575yf.InterfaceC13188b
        public final Object get() {
            return ExecutorsRegistrar.m14403m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.m14401k("Firebase Lite", 0, ExecutorsRegistrar.m14402l())));
        }
    });

    /* JADX INFO: renamed from: c */
    public static final C8517x<ScheduledExecutorService> f11184c = new C8517x<>(new InterfaceC13188b() { // from class: nf.s
        @Override // p575yf.InterfaceC13188b
        public final Object get() {
            return ExecutorsRegistrar.m14403m(Executors.newCachedThreadPool(ExecutorsRegistrar.m14400j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d */
    public static final C8517x<ScheduledExecutorService> f11185d = new C8517x<>(new InterfaceC13188b() { // from class: nf.t
        @Override // p575yf.InterfaceC13188b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.m14400j("Firebase Scheduler", 0));
        }
    });

    /* JADX INFO: renamed from: i */
    public static StrictMode.ThreadPolicy m14399i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    /* JADX INFO: renamed from: j */
    public static ThreadFactory m14400j(String str, int i10) {
        return new ThreadFactoryC9445b(str, i10, null);
    }

    /* JADX INFO: renamed from: k */
    public static ThreadFactory m14401k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC9445b(str, i10, threadPolicy);
    }

    /* JADX INFO: renamed from: l */
    public static StrictMode.ThreadPolicy m14402l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: renamed from: m */
    public static ScheduledExecutorService m14403m(ExecutorService executorService) {
        return new ScheduledExecutorServiceC9458o(executorService, f11185d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8492c<?>> getComponents() {
        return Arrays.asList(C8492c.m34277f(C8497e0.m34315a(InterfaceC7579a.class, ScheduledExecutorService.class), C8497e0.m34315a(InterfaceC7579a.class, ExecutorService.class), C8497e0.m34315a(InterfaceC7579a.class, Executor.class)).m34295f(new InterfaceC8500g() { // from class: nf.u
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return ExecutorsRegistrar.f11182a.get();
            }
        }).m34293d(), C8492c.m34277f(C8497e0.m34315a(InterfaceC7580b.class, ScheduledExecutorService.class), C8497e0.m34315a(InterfaceC7580b.class, ExecutorService.class), C8497e0.m34315a(InterfaceC7580b.class, Executor.class)).m34295f(new InterfaceC8500g() { // from class: nf.v
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return ExecutorsRegistrar.f11184c.get();
            }
        }).m34293d(), C8492c.m34277f(C8497e0.m34315a(InterfaceC7581c.class, ScheduledExecutorService.class), C8497e0.m34315a(InterfaceC7581c.class, ExecutorService.class), C8497e0.m34315a(InterfaceC7581c.class, Executor.class)).m34295f(new InterfaceC8500g() { // from class: nf.w
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return ExecutorsRegistrar.f11183b.get();
            }
        }).m34293d(), C8492c.m34276e(C8497e0.m34315a(InterfaceC7582d.class, Executor.class)).m34295f(new InterfaceC8500g() { // from class: nf.x
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return EnumC9444a0.INSTANCE;
            }
        }).m34293d());
    }
}
