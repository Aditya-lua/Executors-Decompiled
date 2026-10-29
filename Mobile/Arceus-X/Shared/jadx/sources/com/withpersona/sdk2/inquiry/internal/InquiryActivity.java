package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import androidx.fragment.app.AbstractC0934h;
import androidx.fragment.app.FragmentManager;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.C0995z0;
import com.withpersona.sdk2.inquiry.internal.InquiryActivity;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p032bp.C1483e;
import p058cp.C4195c;
import p088e.ActivityC4722p;
import p088e.C4738x;
import p093e4.InterfaceC4810f0;
import p203j.ActivityC6992b;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p237k4.CreationExtras;
import p585yq.C13443b;
import p610zo.C13957e0;
import p610zo.C13987x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;", "Lj/b;", "<init>", "()V", "Landroid/content/Context;", "base", "", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onPause", "onResume", "J1", "", "L1", "()Z", "Lcom/withpersona/sdk2/inquiry/internal/h;", "E", "Ljt/h;", "H1", "()Lcom/withpersona/sdk2/inquiry/internal/h;", "args", "Lzo/x;", "F", "I1", "()Lzo/x;", "viewModel", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class InquiryActivity extends ActivityC6992b {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h args = C7342i.m30456b(new Function0() { // from class: zo.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InquiryActivity.m18069G1(this.f48833a);
        }
    });

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h viewModel = new C0995z0(C7731d0.m32002b(C13987x.class), new C3632b(this), new C3631a(this), new C3633c(null, this));

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryActivity$a */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/a1$c;", "b", "()Landroidx/lifecycle/a1$c;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3631a extends AbstractC7746m implements Function0<C0941a1.c> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ActivityC4722p f14421i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3631a(ActivityC4722p activityC4722p) {
            super(0);
            this.f14421i = activityC4722p;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0941a1.c invoke() {
            return this.f14421i.mo4647X();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryActivity$b */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3632b extends AbstractC7746m implements Function0<C0944b1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ActivityC4722p f14422i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3632b(ActivityC4722p activityC4722p) {
            super(0);
            this.f14422i = activityC4722p;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0944b1 invoke() {
            return this.f14422i.mo4712w();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryActivity$c */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3633c extends AbstractC7746m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f14423i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ ActivityC4722p f14424j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3633c(Function0 function0, ActivityC4722p activityC4722p) {
            super(0);
            this.f14423i = function0;
            this.f14424j = activityC4722p;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f14423i;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f14424j.mo4653Z() : creationExtras;
        }
    }

    /* JADX INFO: renamed from: G1 */
    public static final C3689h m18069G1(InquiryActivity inquiryActivity) {
        return new C3689h(inquiryActivity.getIntent().getExtras());
    }

    /* JADX INFO: renamed from: K1 */
    public static final void m18070K1(InquiryActivity inquiryActivity, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intent intent = new Intent();
        intent.putExtras(bundle);
        Unit unit = Unit.f29331a;
        inquiryActivity.setResult(-1, intent);
        inquiryActivity.finish();
    }

    /* JADX INFO: renamed from: H1 */
    public final C3689h m18071H1() {
        return (C3689h) this.args.getValue();
    }

    /* JADX INFO: renamed from: I1 */
    public final C13987x m18072I1() {
        return (C13987x) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: J1 */
    public final void m18073J1(Bundle savedInstanceState) {
        if (m18074L1()) {
            Intent intent = new Intent();
            intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
            intent.putExtra("INQUIRY_ID_KEY", m18071H1().m18536m());
            String strM18546w = m18071H1().m18546w();
            intent.putExtra("SESSION_TOKEN_KEY", strM18546w != null ? C3689h.INSTANCE.m18550a(strM18546w) : null);
            Unit unit = Unit.f29331a;
            setResult(0, intent);
            Integer numM18518C = m18071H1().m18518C();
            if (numM18518C != null) {
                setTheme(numM18518C.intValue());
            }
            C1483e c1483eM7601c = C1483e.m7601c(LayoutInflater.from(this));
            Intrinsics.checkNotNullExpressionValue(c1483eM7601c, "inflate(...)");
            setContentView(c1483eM7601c.getRoot());
            if (savedInstanceState == null) {
                FragmentManager fragmentManagerM23360l1 = m23360l1();
                Intrinsics.checkNotNullExpressionValue(fragmentManagerM23360l1, "getSupportFragmentManager(...)");
                AbstractC0934h abstractC0934hM4452r = fragmentManagerM23360l1.m4452r();
                int i10 = C13957e0.f48743f;
                C3690i c3690i = new C3690i();
                c3690i.m4625O1(getIntent().getExtras());
                abstractC0934hM4452r.m4781n(i10, c3690i);
                abstractC0934hM4452r.mo4508g();
            }
            m23360l1().m4460t1(m18071H1().m18543t(), this, new InterfaceC4810f0() { // from class: zo.m
                @Override // p093e4.InterfaceC4810f0
                /* JADX INFO: renamed from: a */
                public final void mo4490a(String str, Bundle bundle) {
                    InquiryActivity.m18070K1(this.f48837a, str, bundle);
                }
            });
        }
    }

    /* JADX INFO: renamed from: L1 */
    public final boolean m18074L1() {
        String strM18546w = m18071H1().m18546w();
        if (strM18546w == null || !StringsKt.m32150Z(strM18546w, '\n', false, 2, null)) {
            return true;
        }
        Intent intent = new Intent();
        intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        intent.putExtra("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
        ErrorCode errorCode = ErrorCode.SessionTokenError;
        Intrinsics.m31981d(errorCode, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("ERROR_CODE_KEY", (Parcelable) errorCode);
        Unit unit = Unit.f29331a;
        setResult(0, intent);
        finish();
        return false;
    }

    @Override // p203j.ActivityC6992b, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        C13443b.m49046a(this);
    }

    @Override // p093e4.ActivityC4831q, p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Exception {
        C4738x.m23112c(this, null, null, 3, null);
        super.onCreate(savedInstanceState);
        try {
            m18073J1(savedInstanceState);
        } catch (Exception e10) {
            if (!m18071H1().m18525b()) {
                throw e10;
            }
            if (m18071H1().m18528e()) {
                C4195c.m21692c(this).m21686c(e10);
            }
            Intent intent = new Intent();
            intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            intent.putExtra("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
            ErrorCode errorCode = ErrorCode.ExceptionError;
            Intrinsics.m31981d(errorCode, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("ERROR_CODE_KEY", (Parcelable) errorCode);
            Unit unit = Unit.f29331a;
            setResult(0, intent);
            finish();
        }
    }

    @Override // p093e4.ActivityC4831q, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            C4195c.m21694e(this);
        }
    }

    @Override // p093e4.ActivityC4831q, android.app.Activity
    public void onResume() {
        super.onResume();
        m18072I1().m50540F();
    }
}
