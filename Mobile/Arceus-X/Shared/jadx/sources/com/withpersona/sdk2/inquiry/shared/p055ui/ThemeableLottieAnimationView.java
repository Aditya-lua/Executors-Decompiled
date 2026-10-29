package com.withpersona.sdk2.inquiry.shared.p055ui;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import java.io.InputStream;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p121f7.C5452i;
import p121f7.InterfaceC5463n0;
import p121f7.InterfaceC5465o0;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.AbstractC7900n2;
import p256ku.C7835a2;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p266l7.C8006e;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11958c;
import p526wq.C12539v;
import p526wq.C12540w;
import p560xu.C12919b0;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "srcColor", "destColor", "", "F", "(II)V", "", "url", "Lku/d2;", "G", "(Ljava/lang/String;)Lku/d2;", "onDetachedFromWindow", "()V", "", "s", "Ljava/util/Map;", "srcColorToDestColor", "Lku/p0;", "t", "Lku/p0;", "scope", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class ThemeableLottieAnimationView extends LottieAnimationView {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Map<Integer, Integer> srcColorToDestColor;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 scope;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1", m39664f = "ThemeableLottieAnimationView.kt", m39665l = {66, 79}, m39666m = "invokeSuspend")
    public static final class C4018a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f16983t;

        /* JADX INFO: renamed from: u */
        public int f16984u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f16985v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ ThemeableLottieAnimationView f16986w;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$a$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1$1", m39664f = "ThemeableLottieAnimationView.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f16987t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ ThemeableLottieAnimationView f16988u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ String f16989v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ThemeableLottieAnimationView themeableLottieAnimationView, String str, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f16988u = themeableLottieAnimationView;
                this.f16989v = str;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f16988u, this.f16989v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f16987t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                this.f16988u.m8438z(this.f16989v, null);
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4018a(String str, ThemeableLottieAnimationView themeableLottieAnimationView, InterfaceC9557b<? super C4018a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16985v = str;
            this.f16986w = themeableLottieAnimationView;
        }

        /* JADX INFO: renamed from: r */
        public static final String m20477r(String str) {
            try {
                InputStream inputStreamOpenStream = new URL(str).openStream();
                try {
                    Intrinsics.checkNotNull(inputStreamOpenStream);
                    String strMo48008R2 = C12919b0.m47961c(C12919b0.m47968j(inputStreamOpenStream)).mo48008R2();
                    C11958c.m44629a(inputStreamOpenStream, null);
                    return strMo48008R2;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C11958c.m44629a(inputStreamOpenStream, th2);
                        throw th3;
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C4018a(this.f16985v, this.f16986w, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (p256ku.C7872i.m32684g(r1, r3, r6) == r0) goto L17;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16984u;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7348o.m30470b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
            final String str = this.f16985v;
            Function0 function0 = new Function0() { // from class: wq.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThemeableLottieAnimationView.C4018a.m20477r(str);
                }
            };
            this.f16984u = 1;
            obj = C7835a2.m32562b(abstractC7888l0M32644b, function0, this);
            if (obj != objM38805e) {
            }
            return objM38805e;
            String str2 = (String) obj;
            if (str2 != null) {
                AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
                a aVar = new a(this.f16986w, str2, null);
                this.f16983t = C10350l.m39676a(str2);
                this.f16984u = 2;
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C4018a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public ThemeableLottieAnimationView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.srcColorToDestColor = new LinkedHashMap();
        this.scope = C7910q0.m32885a(C7864g1.m32643a());
        m8422j(new InterfaceC5463n0() { // from class: wq.u
            @Override // p121f7.InterfaceC5463n0
            /* JADX INFO: renamed from: a */
            public final void mo21732a(C5452i c5452i) {
                ThemeableLottieAnimationView.m20472D(this.f44766a, c5452i);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static final void m20472D(ThemeableLottieAnimationView themeableLottieAnimationView, C5452i c5452i) {
        themeableLottieAnimationView.m8423k(new C8006e("**"), InterfaceC5465o0.f21161a, new C12539v(themeableLottieAnimationView));
        themeableLottieAnimationView.m8423k(new C8006e("**"), InterfaceC5465o0.f21162b, new C12540w(themeableLottieAnimationView));
    }

    /* JADX INFO: renamed from: F */
    public final void m20474F(int srcColor, int destColor) {
        this.srcColorToDestColor.put(Integer.valueOf(srcColor), Integer.valueOf(destColor));
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final InterfaceC7850d2 m20475G(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return C7882k.m32780d(this.scope, null, null, new C4018a(url, this, null), 3, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C7910q0.m32890f(this.scope, null, 1, null);
    }
}
