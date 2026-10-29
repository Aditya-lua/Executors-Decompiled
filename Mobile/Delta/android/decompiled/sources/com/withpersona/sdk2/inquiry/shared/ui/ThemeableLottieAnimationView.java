package com.withpersona.sdk2.inquiry.shared.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import f7.i;
import f7.n0;
import f7.o0;
import java.io.InputStream;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.g1;
import ku.k;
import ku.p0;
import ku.q0;
import l7.e;
import nt.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.f;
import pt.m;
import wq.v;
import wq.w;
import xu.b0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "srcColor", "destColor", "", "F", "(II)V", "", "url", "Lku/d2;", "G", "(Ljava/lang/String;)Lku/d2;", "onDetachedFromWindow", "()V", "", "s", "Ljava/util/Map;", "srcColorToDestColor", "Lku/p0;", "t", "Lku/p0;", "scope", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThemeableLottieAnimationView extends LottieAnimationView {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<Integer, Integer> srcColorToDestColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1", f = "ThemeableLottieAnimationView.kt", l = {66, 79}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f13241t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f13242u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f13243v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ThemeableLottieAnimationView f13244w;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1$1", f = "ThemeableLottieAnimationView.kt", l = {}, m = "invokeSuspend")
        public static final class C0249a extends m implements Function2<p0, b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f13245t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ ThemeableLottieAnimationView f13246u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f13247v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0249a(ThemeableLottieAnimationView themeableLottieAnimationView, String str, b<? super C0249a> bVar) {
                super(2, bVar);
                this.f13246u = themeableLottieAnimationView;
                this.f13247v = str;
            }

            @Override // pt.a
            public final b<Unit> create(Object obj, b<?> bVar) {
                return new C0249a(this.f13246u, this.f13247v, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                c.e();
                if (this.f13245t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f13246u.z(this.f13247v, null);
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
                return ((C0249a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ThemeableLottieAnimationView themeableLottieAnimationView, b<? super a> bVar) {
            super(2, bVar);
            this.f13243v = str;
            this.f13244w = themeableLottieAnimationView;
        }

        public static final String r(String str) {
            try {
                InputStream inputStreamOpenStream = new URL(str).openStream();
                try {
                    Intrinsics.checkNotNull(inputStreamOpenStream);
                    String strR2 = b0.c(b0.j(inputStreamOpenStream)).R2();
                    ut.c.a(inputStreamOpenStream, null);
                    return strR2;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ut.c.a(inputStreamOpenStream, th2);
                        throw th3;
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // pt.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            return new a(this.f13243v, this.f13244w, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (ku.i.g(r1, r3, r6) == r0) goto L17;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r6.f13242u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f13241t
                java.lang.String r0 = (java.lang.String) r0
                jt.o.b(r7)
                goto L58
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                jt.o.b(r7)
                goto L39
            L22:
                jt.o.b(r7)
                ku.l0 r7 = ku.g1.b()
                java.lang.String r1 = r6.f13243v
                wq.x r4 = new wq.x
                r4.<init>()
                r6.f13242u = r3
                java.lang.Object r7 = ku.a2.b(r7, r4, r6)
                if (r7 != r0) goto L39
                goto L57
            L39:
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L58
                ku.n2 r1 = ku.g1.c()
                com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$a$a r3 = new com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$a$a
                com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView r4 = r6.f13244w
                r5 = 0
                r3.<init>(r4, r7, r5)
                java.lang.Object r7 = pt.l.a(r7)
                r6.f13241t = r7
                r6.f13242u = r2
                java.lang.Object r7 = ku.i.g(r1, r3, r6)
                if (r7 != r0) goto L58
            L57:
                return r0
            L58:
                kotlin.Unit r7 = kotlin.Unit.f22483a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public ThemeableLottieAnimationView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.srcColorToDestColor = new LinkedHashMap();
        this.scope = q0.a(g1.a());
        j(new n0() { // from class: wq.u
            @Override // f7.n0
            public final void a(f7.i iVar) {
                ThemeableLottieAnimationView.D(this.f34529a, iVar);
            }
        });
    }

    public static final void D(ThemeableLottieAnimationView themeableLottieAnimationView, i iVar) {
        themeableLottieAnimationView.k(new e("**"), o0.f16420a, new v(themeableLottieAnimationView));
        themeableLottieAnimationView.k(new e("**"), o0.b, new w(themeableLottieAnimationView));
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
