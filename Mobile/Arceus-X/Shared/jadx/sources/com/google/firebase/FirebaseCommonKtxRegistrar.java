package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p247kf.InterfaceC7579a;
import p247kf.InterfaceC7580b;
import p247kf.InterfaceC7581c;
import p247kf.InterfaceC7582d;
import p256ku.AbstractC7888l0;
import p256ku.C7931v1;
import p292mf.C8492c;
import p292mf.C8497e0;
import p292mf.C8511r;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lmf/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$a */
    @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class C2971a<T> implements InterfaceC8500g {

        /* JADX INFO: renamed from: a */
        public static final C2971a<T> f11155a = new C2971a<>();

        /* JADX DEBUG: Method merged with bridge method: create(Lmf/d;)Ljava/lang/Object; */
        @Override // p292mf.InterfaceC8500g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC7888l0 create(InterfaceC8494d interfaceC8494d) {
            Object objMo34309f = interfaceC8494d.mo34309f(C8497e0.m34315a(InterfaceC7579a.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objMo34309f, "get(...)");
            return C7931v1.m32925b((Executor) objMo34309f);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$b */
    @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class C2972b<T> implements InterfaceC8500g {

        /* JADX INFO: renamed from: a */
        public static final C2972b<T> f11156a = new C2972b<>();

        /* JADX DEBUG: Method merged with bridge method: create(Lmf/d;)Ljava/lang/Object; */
        @Override // p292mf.InterfaceC8500g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC7888l0 create(InterfaceC8494d interfaceC8494d) {
            Object objMo34309f = interfaceC8494d.mo34309f(C8497e0.m34315a(InterfaceC7581c.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objMo34309f, "get(...)");
            return C7931v1.m32925b((Executor) objMo34309f);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$c */
    @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class C2973c<T> implements InterfaceC8500g {

        /* JADX INFO: renamed from: a */
        public static final C2973c<T> f11157a = new C2973c<>();

        /* JADX DEBUG: Method merged with bridge method: create(Lmf/d;)Ljava/lang/Object; */
        @Override // p292mf.InterfaceC8500g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC7888l0 create(InterfaceC8494d interfaceC8494d) {
            Object objMo34309f = interfaceC8494d.mo34309f(C8497e0.m34315a(InterfaceC7580b.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objMo34309f, "get(...)");
            return C7931v1.m32925b((Executor) objMo34309f);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$d */
    @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class C2974d<T> implements InterfaceC8500g {

        /* JADX INFO: renamed from: a */
        public static final C2974d<T> f11158a = new C2974d<>();

        /* JADX DEBUG: Method merged with bridge method: create(Lmf/d;)Ljava/lang/Object; */
        @Override // p292mf.InterfaceC8500g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC7888l0 create(InterfaceC8494d interfaceC8494d) {
            Object objMo34309f = interfaceC8494d.mo34309f(C8497e0.m34315a(InterfaceC7582d.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objMo34309f, "get(...)");
            return C7931v1.m32925b((Executor) objMo34309f);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<C8492c<?>> getComponents() {
        C8492c c8492cM34293d = C8492c.m34276e(C8497e0.m34315a(InterfaceC7579a.class, AbstractC7888l0.class)).m34291b(C8511r.m34360k(C8497e0.m34315a(InterfaceC7579a.class, Executor.class))).m34295f(C2971a.f11155a).m34293d();
        Intrinsics.checkNotNullExpressionValue(c8492cM34293d, "build(...)");
        C8492c c8492cM34293d2 = C8492c.m34276e(C8497e0.m34315a(InterfaceC7581c.class, AbstractC7888l0.class)).m34291b(C8511r.m34360k(C8497e0.m34315a(InterfaceC7581c.class, Executor.class))).m34295f(C2972b.f11156a).m34293d();
        Intrinsics.checkNotNullExpressionValue(c8492cM34293d2, "build(...)");
        C8492c c8492cM34293d3 = C8492c.m34276e(C8497e0.m34315a(InterfaceC7580b.class, AbstractC7888l0.class)).m34291b(C8511r.m34360k(C8497e0.m34315a(InterfaceC7580b.class, Executor.class))).m34295f(C2973c.f11157a).m34293d();
        Intrinsics.checkNotNullExpressionValue(c8492cM34293d3, "build(...)");
        C8492c c8492cM34293d4 = C8492c.m34276e(C8497e0.m34315a(InterfaceC7582d.class, AbstractC7888l0.class)).m34291b(C8511r.m34360k(C8497e0.m34315a(InterfaceC7582d.class, Executor.class))).m34295f(C2974d.f11158a).m34293d();
        Intrinsics.checkNotNullExpressionValue(c8492cM34293d4, "build(...)");
        return C7699p.m31895n(c8492cM34293d, c8492cM34293d2, c8492cM34293d3, c8492cM34293d4);
    }
}
