package com.withpersona.sdk2.inquiry.shared.ui;

import android.content.Context;
import android.util.AttributeSet;
import av.a2;
import av.d2;
import av.g1;
import av.k;
import av.l0;
import av.n2;
import av.p0;
import av.q0;
import com.airbnb.lottie.LottieAnimationView;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import eu.b;
import ew.v;
import fu.c;
import g7.i;
import g7.n0;
import g7.o0;
import gu.f;
import gu.l;
import gu.m;
import java.io.InputStream;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kr.w;
import kr.x;
import m7.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", BuildConfig.FLAVOR, "srcColor", "destColor", BuildConfig.FLAVOR, "F", "(II)V", BuildConfig.FLAVOR, "url", "Lav/d2;", "G", "(Ljava/lang/String;)Lav/d2;", "onDetachedFromWindow", "()V", BuildConfig.FLAVOR, "s", "Ljava/util/Map;", "srcColorToDestColor", "Lav/p0;", "t", "Lav/p0;", "scope", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThemeableLottieAnimationView extends LottieAnimationView {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<Integer, Integer> srcColorToDestColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1", f = "ThemeableLottieAnimationView.kt", l = {66, 79}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11115t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f11116u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f11117v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ThemeableLottieAnimationView f11118w;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1$1", f = "ThemeableLottieAnimationView.kt", l = {}, m = "invokeSuspend")
        public static final class C0192a extends m implements Function2<p0, b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11119t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ ThemeableLottieAnimationView f11120u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f11121v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0192a(ThemeableLottieAnimationView themeableLottieAnimationView, String str, b<? super C0192a> bVar) {
                super(2, bVar);
                this.f11120u = themeableLottieAnimationView;
                this.f11121v = str;
            }

            @Override // gu.a
            public final b<Unit> create(Object obj, b<?> bVar) {
                return new C0192a(this.f11120u, this.f11121v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
                return ((C0192a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                c.e();
                if (this.f11119t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f11120u.z(this.f11121v, null);
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ThemeableLottieAnimationView themeableLottieAnimationView, b<? super a> bVar) {
            super(2, bVar);
            this.f11117v = str;
            this.f11118w = themeableLottieAnimationView;
        }

        public static final String p(String str) {
            try {
                InputStream inputStreamOpenStream = new URL(str).openStream();
                try {
                    Intrinsics.checkNotNull(inputStreamOpenStream);
                    String strV2 = v.c(v.j(inputStreamOpenStream)).V2();
                    lu.c.a(inputStreamOpenStream, null);
                    return strV2;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        lu.c.a(inputStreamOpenStream, th2);
                        throw th3;
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // gu.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            return new a(this.f11117v, this.f11118w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (av.i.g(r1, r3, r6) == r0) goto L17;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = c.e();
            int i10 = this.f11116u;
            if (i10 != 0) {
                if (i10 == 1) {
                    o.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f21506a;
            }
            o.b(obj);
            l0 l0VarB = g1.b();
            final String str = this.f11117v;
            Function0 function0 = new Function0() { // from class: kr.y
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThemeableLottieAnimationView.a.p(str);
                }
            };
            this.f11116u = 1;
            obj = a2.b(l0VarB, function0, this);
            if (obj != objE) {
            }
            return objE;
            String str2 = (String) obj;
            if (str2 != null) {
                n2 n2VarC = g1.c();
                C0192a c0192a = new C0192a(this.f11118w, str2, null);
                this.f11115t = l.a(str2);
                this.f11116u = 2;
            }
            return Unit.f21506a;
        }
    }

    public ThemeableLottieAnimationView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.srcColorToDestColor = new LinkedHashMap();
        this.scope = q0.a(g1.a());
        j(new n0() { // from class: kr.v
            @Override // g7.n0
            public final void a(g7.i iVar) {
                ThemeableLottieAnimationView.D(this.f21795a, iVar);
            }
        });
    }

    public static final void D(ThemeableLottieAnimationView themeableLottieAnimationView, i iVar) {
        themeableLottieAnimationView.k(new e("**"), o0.f17499a, new w(themeableLottieAnimationView));
        themeableLottieAnimationView.k(new e("**"), o0.b, new x(themeableLottieAnimationView));
    }

    public final void F(int srcColor, int destColor) {
        this.srcColorToDestColor.put(Integer.valueOf(srcColor), Integer.valueOf(destColor));
    }

    @NotNull
    public final d2 G(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return k.d(this.scope, null, null, new a(url, this, null), 3, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q0.f(this.scope, null, 1, null);
    }
}
