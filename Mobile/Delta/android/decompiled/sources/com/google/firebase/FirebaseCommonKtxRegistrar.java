package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import iu.l0;
import iu.v1;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;
import mf.e0;
import mf.g;
import mf.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lmf/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T> f8743a = new a<>();

        @Override // mf.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 create(mf.d dVar) {
            Object objF = dVar.f(e0.a(kf.a.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objF, "get(...)");
            return v1.b((Executor) objF);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T> f8744a = new b<>();

        @Override // mf.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 create(mf.d dVar) {
            Object objF = dVar.f(e0.a(kf.c.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objF, "get(...)");
            return v1.b((Executor) objF);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c<T> f8745a = new c<>();

        @Override // mf.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 create(mf.d dVar) {
            Object objF = dVar.f(e0.a(kf.b.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objF, "get(...)");
            return v1.b((Executor) objF);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d<T> f8746a = new d<>();

        @Override // mf.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 create(mf.d dVar) {
            Object objF = dVar.f(e0.a(kf.d.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objF, "get(...)");
            return v1.b((Executor) objF);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<mf.c<?>> getComponents() {
        mf.c cVarD = mf.c.e(e0.a(kf.a.class, l0.class)).b(r.k(e0.a(kf.a.class, Executor.class))).f(a.f8743a).d();
        Intrinsics.checkNotNullExpressionValue(cVarD, "build(...)");
        mf.c cVarD2 = mf.c.e(e0.a(kf.c.class, l0.class)).b(r.k(e0.a(kf.c.class, Executor.class))).f(b.f8744a).d();
        Intrinsics.checkNotNullExpressionValue(cVarD2, "build(...)");
        mf.c cVarD3 = mf.c.e(e0.a(kf.b.class, l0.class)).b(r.k(e0.a(kf.b.class, Executor.class))).f(c.f8745a).d();
        Intrinsics.checkNotNullExpressionValue(cVarD3, "build(...)");
        mf.c cVarD4 = mf.c.e(e0.a(kf.d.class, l0.class)).b(r.k(e0.a(kf.d.class, Executor.class))).f(d.f8746a).d();
        Intrinsics.checkNotNullExpressionValue(cVarD4, "build(...)");
        return p.n(cVarD, cVarD2, cVarD3, cVarD4);
    }
}
