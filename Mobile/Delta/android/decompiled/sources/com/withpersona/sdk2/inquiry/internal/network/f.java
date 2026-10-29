package com.withpersona.sdk2.inquiry.internal.network;

import an.a0;
import an.c0;
import an.d0;
import com.squareup.workflow1.ui.backstack.BackStackContainer;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.ui.DisableableContainer;
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
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransitionContainer;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import gp.w;
import java.util.Arrays;
import java.util.Set;
import jv.y;
import kotlin.Metadata;
import kotlin.collections.p0;
import kotlin.collections.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\fH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\fH\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b,\u0010-J\u0014\u0010/\u001a\u00070\u0002¢\u0006\u0002\b.H\u0007¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\b2\u00100R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b3\u00100R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b4\u00100R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u00105\u001a\u0004\b6\u0010\u000b¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/f;", "", "", "serverEndpoint", "webRtcServerEndpoint", "fallbackModeServerEndpoint", "", "redactAppIdentifyingInformation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "i", "()Z", "Ljv/y;", "retrofit", "Lgp/w;", "e", "(Ljv/y;)Lgp/w;", "Lgp/y;", "k", "(Ljv/y;)Lgp/y;", "Lqr/c;", "n", "(Ljv/y;)Lqr/c;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "d", "(Ljv/y;)Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "Lcq/a;", "l", "(Ljv/y;)Lcq/a;", "Lbo/c;", "a", "(Ljv/y;)Lbo/c;", "webRtcRetrofit", "Ltr/a;", "q", "(Ljv/y;)Ltr/a;", "fallbackModeRetrofit", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "b", "(Ljv/y;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "Lho/a;", "c", "(Ljv/y;)Lho/a;", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "o", "(Ljv/y;)Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "Lcom/withpersona/sdk2/inquiry/network/core/ServerEndpoint;", "m", "()Ljava/lang/String;", "Ljava/lang/String;", "getServerEndpoint", "getWebRtcServerEndpoint", "getFallbackModeServerEndpoint", "Z", "getRedactAppIdentifyingInformation", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String serverEndpoint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String webRtcServerEndpoint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fallbackModeServerEndpoint;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean redactAppIdentifyingInformation;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\f0\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\f0\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/f$a;", "", "<init>", "()V", "", "Lan/a0;", "viewBindings", "Lan/c0;", "e", "(Ljava/util/Set;)Lan/c0;", "d", "()Ljava/util/Set;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "a", "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding;", "b", "Lum/h$e;", "c", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Object> a() {
            return q0.g(CreateInquiryRequest.Data.INSTANCE, GpsCollectionRequirement.INSTANCE, GpsPrecisionRequirement.INSTANCE, ComponentParam.Adapter.f13930a, InquiryFieldMap.INSTANCE, NextStep.GovernmentId.SelectPage.INSTANCE, NextStep.GovernmentId.PassportNfcOption.INSTANCE, NextStep.GovernmentId.CaptureFileType.INSTANCE, NextStep.GovernmentId.VideoCaptureMethod.INSTANCE, NextStep.Selfie.CaptureFileType.INSTANCE, NextStep.Selfie.VideoCaptureMethod.INSTANCE, Button.ButtonType.INSTANCE, InputText.InputType.INSTANCE, InputText.AutofillHint.INSTANCE, InputFileUpload.PrefillItemAdapter.INSTANCE, RemoteImage.ContentType.INSTANCE, GovernmentIdNfcScan.DataGroupTypes.INSTANCE, GovernmentIdNfcScan.TipsButtonLocation.INSTANCE, UiComponentError.Companion, StyleElements.PositionType.INSTANCE, StyleElements.DPSize.INSTANCE, StyleElements.Size.INSTANCE, StyleElements.FontName.INSTANCE, StyleElements.FontWeight.INSTANCE, StyleElements.FontStyle.INSTANCE, StyleElements.Axis.INSTANCE, JsonLogicBoolean.INSTANCE, NumberAdapter.INSTANCE, RgbaHexColorAdapter.INSTANCE, PendingPageTextPosition.INSTANCE);
        }

        @NotNull
        public final Set<JsonAdapterBinding<?>> b() {
            return q0.d();
        }

        @NotNull
        public final Set<um.h.e> c() {
            return p0.c(InquiryField.INSTANCE.createAdapter());
        }

        @NotNull
        public final Set<a0<?>> d() {
            return q0.g(BackStackContainer.INSTANCE, DisableableContainer.INSTANCE, ScreenWithTransitionContainer.INSTANCE);
        }

        @NotNull
        public final c0 e(@NotNull Set<a0<?>> viewBindings) {
            Intrinsics.checkNotNullParameter(viewBindings, "viewBindings");
            a0[] a0VarArr = (a0[]) viewBindings.toArray(new a0[0]);
            return d0.b((a0[]) Arrays.copyOf(a0VarArr, a0VarArr.length));
        }

        public Companion() {
        }
    }

    public f(@NotNull String serverEndpoint, @NotNull String webRtcServerEndpoint, @NotNull String fallbackModeServerEndpoint, boolean z10) {
        Intrinsics.checkNotNullParameter(serverEndpoint, "serverEndpoint");
        Intrinsics.checkNotNullParameter(webRtcServerEndpoint, "webRtcServerEndpoint");
        Intrinsics.checkNotNullParameter(fallbackModeServerEndpoint, "fallbackModeServerEndpoint");
        this.serverEndpoint = serverEndpoint;
        this.webRtcServerEndpoint = webRtcServerEndpoint;
        this.fallbackModeServerEndpoint = fallbackModeServerEndpoint;
        this.redactAppIdentifyingInformation = z10;
    }

    @NotNull
    public static final Set<Object> f() {
        return INSTANCE.a();
    }

    @NotNull
    public static final Set<JsonAdapterBinding<?>> g() {
        return INSTANCE.b();
    }

    @NotNull
    public static final Set<um.h.e> h() {
        return INSTANCE.c();
    }

    @NotNull
    public static final Set<a0<?>> j() {
        return INSTANCE.d();
    }

    @NotNull
    public static final c0 p(@NotNull Set<a0<?>> set) {
        return INSTANCE.e(set);
    }

    @NotNull
    public final bo.c a(@NotNull y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(bo.c.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (bo.c) objB;
    }

    @NotNull
    public final FallbackModeService b(@NotNull y fallbackModeRetrofit) {
        Intrinsics.checkNotNullParameter(fallbackModeRetrofit, "fallbackModeRetrofit");
        Object objB = fallbackModeRetrofit.d().c(this.fallbackModeServerEndpoint).e().b(FallbackModeService.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (FallbackModeService) objB;
    }

    @NotNull
    public final ho.a c(@NotNull y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(ho.a.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (ho.a) objB;
    }

    @NotNull
    public final com.withpersona.sdk2.inquiry.governmentid.network.b d(@NotNull y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(com.withpersona.sdk2.inquiry.governmentid.network.b.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (com.withpersona.sdk2.inquiry.governmentid.network.b) objB;
    }

    @NotNull
    public final w e(@NotNull y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(w.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (w) objB;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getRedactAppIdentifyingInformation() {
        return this.redactAppIdentifyingInformation;
    }

    @NotNull
    public final gp.y k(@NotNull y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(gp.y.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (gp.y) objB;
    }

    @NotNull
    public final cq.a l(@NotNull y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(cq.a.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (cq.a) objB;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getServerEndpoint() {
        return this.serverEndpoint;
    }

    @NotNull
    public final qr.c n(@NotNull y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(qr.c.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (qr.c) objB;
    }

    @NotNull
    public final UploadService o(@NotNull y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(UploadService.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (UploadService) objB;
    }

    @NotNull
    public final tr.a q(@NotNull y webRtcRetrofit) {
        Intrinsics.checkNotNullParameter(webRtcRetrofit, "webRtcRetrofit");
        Object objB = webRtcRetrofit.d().c(this.webRtcServerEndpoint).e().b(tr.a.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (tr.a) objB;
    }
}
