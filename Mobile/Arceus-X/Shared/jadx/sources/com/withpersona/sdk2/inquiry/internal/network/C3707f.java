package com.withpersona.sdk2.inquiry.internal.network;

import bo.InterfaceC1477c;
import com.squareup.workflow1.p052ui.backstack.BackStackContainer;
import com.withpersona.sdk2.inquiry.governmentid.network.InterfaceC3570b;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.p053ui.DisableableContainer;
import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import com.withpersona.sdk2.inquiry.network.core.NumberAdapter;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.network.dto.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.RgbaHexColorAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import com.withpersona.sdk2.inquiry.p057ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.shared.p055ui.ScreenWithTransitionContainer;
import gp.InterfaceC6203w;
import gp.InterfaceC6205y;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7700p0;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p016an.C0370d0;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0368c0;
import p059cq.InterfaceC4196a;
import p176ho.InterfaceC6474a;
import p231jv.C7397y;
import p392qr.InterfaceC10703c;
import p471um.AbstractC11873h;
import tr.InterfaceC11741a;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\fH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\fH\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b,\u0010-J\u0014\u0010/\u001a\u00070\u0002¢\u0006\u0002\b.H\u0007¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\b2\u00100R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b3\u00100R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b4\u00100R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u00105\u001a\u0004\b6\u0010\u000b¨\u00067"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/f;", "", "", "serverEndpoint", "webRtcServerEndpoint", "fallbackModeServerEndpoint", "", "redactAppIdentifyingInformation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "i", "()Z", "Ljv/y;", "retrofit", "Lgp/w;", "e", "(Ljv/y;)Lgp/w;", "Lgp/y;", "k", "(Ljv/y;)Lgp/y;", "Lqr/c;", "n", "(Ljv/y;)Lqr/c;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "d", "(Ljv/y;)Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "Lcq/a;", "l", "(Ljv/y;)Lcq/a;", "Lbo/c;", "a", "(Ljv/y;)Lbo/c;", "webRtcRetrofit", "Ltr/a;", "q", "(Ljv/y;)Ltr/a;", "fallbackModeRetrofit", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "b", "(Ljv/y;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "Lho/a;", "c", "(Ljv/y;)Lho/a;", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "o", "(Ljv/y;)Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "Lcom/withpersona/sdk2/inquiry/network/core/ServerEndpoint;", "m", "()Ljava/lang/String;", "Ljava/lang/String;", "getServerEndpoint", "getWebRtcServerEndpoint", "getFallbackModeServerEndpoint", "Z", "getRedactAppIdentifyingInformation", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3707f {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String serverEndpoint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String webRtcServerEndpoint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String fallbackModeServerEndpoint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean redactAppIdentifyingInformation;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.f$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\f0\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\f0\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/f$a;", "", "<init>", "()V", "", "Lan/a0;", "viewBindings", "Lan/c0;", "e", "(Ljava/util/Set;)Lan/c0;", "d", "()Ljava/util/Set;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "a", "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding;", "b", "Lum/h$e;", "c", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.network.f.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Set<Object> m18770a() {
            return C7702q0.m31911g(CreateInquiryRequest.Data.INSTANCE, GpsCollectionRequirement.INSTANCE, GpsPrecisionRequirement.INSTANCE, ComponentParam.Adapter.f17777a, InquiryFieldMap.INSTANCE, NextStep.GovernmentId.SelectPage.INSTANCE, NextStep.GovernmentId.PassportNfcOption.INSTANCE, NextStep.GovernmentId.CaptureFileType.INSTANCE, NextStep.GovernmentId.VideoCaptureMethod.INSTANCE, NextStep.Selfie.CaptureFileType.INSTANCE, NextStep.Selfie.VideoCaptureMethod.INSTANCE, Button.ButtonType.INSTANCE, InputText.InputType.INSTANCE, InputText.AutofillHint.INSTANCE, InputFileUpload.PrefillItemAdapter.INSTANCE, RemoteImage.ContentType.INSTANCE, GovernmentIdNfcScan.DataGroupTypes.INSTANCE, GovernmentIdNfcScan.TipsButtonLocation.INSTANCE, UiComponentError.Companion, StyleElements.PositionType.INSTANCE, StyleElements.DPSize.INSTANCE, StyleElements.Size.INSTANCE, StyleElements.FontName.INSTANCE, StyleElements.FontWeight.INSTANCE, StyleElements.FontStyle.INSTANCE, StyleElements.Axis.INSTANCE, JsonLogicBoolean.INSTANCE, NumberAdapter.INSTANCE, RgbaHexColorAdapter.INSTANCE, PendingPageTextPosition.INSTANCE);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Set<JsonAdapterBinding<?>> m18771b() {
            return C7702q0.m31908d();
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Set<AbstractC11873h.e> m18772c() {
            return C7700p0.m31904c(InquiryField.INSTANCE.createAdapter());
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Set<InterfaceC0364a0<?>> m18773d() {
            return C7702q0.m31911g(BackStackContainer.INSTANCE, DisableableContainer.INSTANCE, ScreenWithTransitionContainer.INSTANCE);
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final InterfaceC0368c0 m18774e(@NotNull Set<InterfaceC0364a0<?>> viewBindings) {
            Intrinsics.checkNotNullParameter(viewBindings, "viewBindings");
            InterfaceC0364a0[] interfaceC0364a0Arr = (InterfaceC0364a0[]) viewBindings.toArray(new InterfaceC0364a0[0]);
            return C0370d0.m1399b((InterfaceC0364a0[]) Arrays.copyOf(interfaceC0364a0Arr, interfaceC0364a0Arr.length));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C3707f(@NotNull String serverEndpoint, @NotNull String webRtcServerEndpoint, @NotNull String fallbackModeServerEndpoint, boolean z10) {
        Intrinsics.checkNotNullParameter(serverEndpoint, "serverEndpoint");
        Intrinsics.checkNotNullParameter(webRtcServerEndpoint, "webRtcServerEndpoint");
        Intrinsics.checkNotNullParameter(fallbackModeServerEndpoint, "fallbackModeServerEndpoint");
        this.serverEndpoint = serverEndpoint;
        this.webRtcServerEndpoint = webRtcServerEndpoint;
        this.fallbackModeServerEndpoint = fallbackModeServerEndpoint;
        this.redactAppIdentifyingInformation = z10;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Set<Object> m18753f() {
        return INSTANCE.m18770a();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Set<JsonAdapterBinding<?>> m18754g() {
        return INSTANCE.m18771b();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final Set<AbstractC11873h.e> m18755h() {
        return INSTANCE.m18772c();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final Set<InterfaceC0364a0<?>> m18756j() {
        return INSTANCE.m18773d();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static final InterfaceC0368c0 m18757p(@NotNull Set<InterfaceC0364a0<?>> set) {
        return INSTANCE.m18774e(set);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC1477c m18758a(@NotNull C7397y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objM30660b = retrofit.m30660b(InterfaceC1477c.class);
        Intrinsics.checkNotNullExpressionValue(objM30660b, "create(...)");
        return (InterfaceC1477c) objM30660b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final FallbackModeService m18759b(@NotNull C7397y fallbackModeRetrofit) {
        Intrinsics.checkNotNullParameter(fallbackModeRetrofit, "fallbackModeRetrofit");
        Object objM30660b = fallbackModeRetrofit.m30662d().m30672c(this.fallbackModeServerEndpoint).m30674e().m30660b(FallbackModeService.class);
        Intrinsics.checkNotNullExpressionValue(objM30660b, "create(...)");
        return (FallbackModeService) objM30660b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC6474a m18760c(@NotNull C7397y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objM30660b = retrofit.m30660b(InterfaceC6474a.class);
        Intrinsics.checkNotNullExpressionValue(objM30660b, "create(...)");
        return (InterfaceC6474a) objM30660b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC3570b m18761d(@NotNull C7397y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objM30660b = retrofit.m30660b(InterfaceC3570b.class);
        Intrinsics.checkNotNullExpressionValue(objM30660b, "create(...)");
        return (InterfaceC3570b) objM30660b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC6203w m18762e(@NotNull C7397y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objM30660b = retrofit.m30660b(InterfaceC6203w.class);
        Intrinsics.checkNotNullExpressionValue(objM30660b, "create(...)");
        return (InterfaceC6203w) objM30660b;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getRedactAppIdentifyingInformation() {
        return this.redactAppIdentifyingInformation;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final InterfaceC6205y m18764k(@NotNull C7397y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objM30660b = retrofit.m30660b(InterfaceC6205y.class);
        Intrinsics.checkNotNullExpressionValue(objM30660b, "create(...)");
        return (InterfaceC6205y) objM30660b;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final InterfaceC4196a m18765l(@NotNull C7397y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objM30660b = retrofit.m30660b(InterfaceC4196a.class);
        Intrinsics.checkNotNullExpressionValue(objM30660b, "create(...)");
        return (InterfaceC4196a) objM30660b;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getServerEndpoint() {
        return this.serverEndpoint;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final InterfaceC10703c m18767n(@NotNull C7397y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objM30660b = retrofit.m30660b(InterfaceC10703c.class);
        Intrinsics.checkNotNullExpressionValue(objM30660b, "create(...)");
        return (InterfaceC10703c) objM30660b;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final UploadService m18768o(@NotNull C7397y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objM30660b = retrofit.m30660b(UploadService.class);
        Intrinsics.checkNotNullExpressionValue(objM30660b, "create(...)");
        return (UploadService) objM30660b;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final InterfaceC11741a m18769q(@NotNull C7397y webRtcRetrofit) {
        Intrinsics.checkNotNullParameter(webRtcRetrofit, "webRtcRetrofit");
        Object objM30660b = webRtcRetrofit.m30662d().m30672c(this.webRtcServerEndpoint).m30674e().m30660b(InterfaceC11741a.class);
        Intrinsics.checkNotNullExpressionValue(objM30660b, "create(...)");
        return (InterfaceC11741a) objM30660b;
    }
}
