package com.google.firebase;

import androidx.annotation.Keep;
import av.l0;
import av.v1;
import com.github.luben.zstd.BuildConfig;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import of.e0;
import of.g;
import of.r;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.p;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", BuildConfig.FLAVOR, "Lof/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T> f8583a = new a<>();

        @Override // of.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 create(of.d dVar) {
            Object objF = dVar.f(e0.a(mf.a.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objF, "get(...)");
            return v1.b((Executor) objF);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T> f8584a = new b<>();

        @Override // of.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 create(of.d dVar) {
            Object objF = dVar.f(e0.a(mf.c.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objF, "get(...)");
            return v1.b((Executor) objF);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c<T> f8585a = new c<>();

        @Override // of.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 create(of.d dVar) {
            Object objF = dVar.f(e0.a(mf.b.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objF, "get(...)");
            return v1.b((Executor) objF);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d<T> f8586a = new d<>();

        @Override // of.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 create(of.d dVar) {
            Object objF = dVar.f(e0.a(mf.d.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objF, "get(...)");
            return v1.b((Executor) objF);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<of.c<?>> getComponents() {
        of.c cVarD = of.c.e(e0.a(mf.a.class, l0.class)).b(r.k(e0.a(mf.a.class, Executor.class))).f(a.f8583a).d();
        Intrinsics.checkNotNullExpressionValue(cVarD, "build(...)");
        of.c cVarD2 = of.c.e(e0.a(mf.c.class, l0.class)).b(r.k(e0.a(mf.c.class, Executor.class))).f(b.f8584a).d();
        Intrinsics.checkNotNullExpressionValue(cVarD2, "build(...)");
        of.c cVarD3 = of.c.e(e0.a(mf.b.class, l0.class)).b(r.k(e0.a(mf.b.class, Executor.class))).f(c.f8585a).d();
        Intrinsics.checkNotNullExpressionValue(cVarD3, "build(...)");
        of.c cVarD4 = of.c.e(e0.a(mf.d.class, l0.class)).b(r.k(e0.a(mf.d.class, Executor.class))).f(d.f8586a).d();
        Intrinsics.checkNotNullExpressionValue(cVarD4, "build(...)");
        return p.n(cVarD, cVarD2, cVarD3, cVarD4);
    }
}
