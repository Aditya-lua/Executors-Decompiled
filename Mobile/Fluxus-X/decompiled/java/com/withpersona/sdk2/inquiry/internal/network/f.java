package com.withpersona.sdk2.inquiry.internal.network;

import com.github.luben.zstd.BuildConfig;
import com.squareup.workflow1.ui.backstack.BackStackContainer;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
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
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.Arrays;
import java.util.Set;
import kr.p;
import nn.b0;
import nn.d0;
import nn.e0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.p0;
import p001kotlin.collections.q0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import sw.y;
import up.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\fH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\fH\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b,\u0010-J\u0014\u0010/\u001a\u00070\u0002¢\u0006\u0002\b.H\u0007¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\b2\u00100R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b3\u00100R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b4\u00100R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u00105\u001a\u0004\b6\u0010\u000b¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/f;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "serverEndpoint", "webRtcServerEndpoint", "fallbackModeServerEndpoint", BuildConfig.FLAVOR, "redactAppIdentifyingInformation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "i", "()Z", "Lsw/y;", "retrofit", "Lup/w;", "e", "(Lsw/y;)Lup/w;", "Lup/y;", "k", "(Lsw/y;)Lup/y;", "Lgs/c;", "n", "(Lsw/y;)Lgs/c;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "d", "(Lsw/y;)Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "Lqq/a;", "l", "(Lsw/y;)Lqq/a;", "Lpo/c;", "a", "(Lsw/y;)Lpo/c;", "webRtcRetrofit", "Ljs/a;", "q", "(Lsw/y;)Ljs/a;", "fallbackModeRetrofit", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "b", "(Lsw/y;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "Luo/b;", "c", "(Lsw/y;)Luo/b;", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "o", "(Lsw/y;)Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "Lcom/withpersona/sdk2/inquiry/network/core/ServerEndpoint;", "m", "()Ljava/lang/String;", "Ljava/lang/String;", "getServerEndpoint", "getWebRtcServerEndpoint", "getFallbackModeServerEndpoint", "Z", "getRedactAppIdentifyingInformation", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\f0\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\f0\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/f$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lnn/b0;", "viewBindings", "Lnn/d0;", "e", "(Ljava/util/Set;)Lnn/d0;", "d", "()Ljava/util/Set;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "a", "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding;", "b", "Lhn/h$e;", "c", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Object> a() {
            return q0.g(CreateInquiryRequest.Data.INSTANCE, GpsCollectionRequirement.INSTANCE, GpsPrecisionRequirement.INSTANCE, ComponentParam.Adapter.f11413a, InquiryFieldMap.INSTANCE, NextStep.GovernmentId.SelectPage.INSTANCE, NextStep.GovernmentId.PassportNfcOption.INSTANCE, NextStep.GovernmentId.CaptureFileType.INSTANCE, NextStep.GovernmentId.VideoCaptureMethod.INSTANCE, NextStep.Selfie.CaptureFileType.INSTANCE, NextStep.Selfie.VideoCaptureMethod.INSTANCE, Button.ButtonType.INSTANCE, InputText.InputType.INSTANCE, InputText.AutofillHint.INSTANCE, InputFileUpload.PrefillItemAdapter.INSTANCE, RemoteImage.ContentType.INSTANCE, GovernmentIdNfcScan.DataGroupTypes.INSTANCE, GovernmentIdNfcScan.TipsButtonLocation.INSTANCE, UiComponentError.Companion, StyleElements.PositionType.INSTANCE, StyleElements.DPSize.INSTANCE, StyleElements.Size.INSTANCE, StyleElements.FontName.INSTANCE, StyleElements.FontWeight.INSTANCE, StyleElements.FontStyle.INSTANCE, StyleElements.Axis.INSTANCE, JsonLogicBoolean.INSTANCE, NumberAdapter.INSTANCE, RgbaHexColorAdapter.INSTANCE, PendingPageTextPosition.INSTANCE);
        }

        @NotNull
        public final Set<JsonAdapterBinding<?>> b() {
            return q0.d();
        }

        @NotNull
        public final Set<hn.h.e> c() {
            return p0.c(InquiryField.INSTANCE.createAdapter());
        }

        @NotNull
        public final Set<b0<?>> d() {
            return q0.g(BackStackContainer.INSTANCE, wp.c.INSTANCE, p.INSTANCE);
        }

        @NotNull
        public final d0 e(@NotNull Set<b0<?>> viewBindings) {
            Intrinsics.checkNotNullParameter(viewBindings, "viewBindings");
            b0[] b0VarArr = (b0[]) viewBindings.toArray(new b0[0]);
            return e0.b((b0[]) Arrays.copyOf(b0VarArr, b0VarArr.length));
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
    public static final Set<hn.h.e> h() {
        return INSTANCE.c();
    }

    @NotNull
    public static final Set<b0<?>> j() {
        return INSTANCE.d();
    }

    @NotNull
    public static final d0 p(@NotNull Set<b0<?>> set) {
        return INSTANCE.e(set);
    }

    @NotNull
    public final po.c a(@NotNull y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(po.c.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (po.c) objB;
    }

    @NotNull
    public final FallbackModeService b(@NotNull y fallbackModeRetrofit) {
        Intrinsics.checkNotNullParameter(fallbackModeRetrofit, "fallbackModeRetrofit");
        Object objB = fallbackModeRetrofit.d().c(this.fallbackModeServerEndpoint).e().b(FallbackModeService.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (FallbackModeService) objB;
    }

    @NotNull
    public final uo.b c(@NotNull y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(uo.b.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (uo.b) objB;
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
    public final up.y k(@NotNull y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(up.y.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (up.y) objB;
    }

    @NotNull
    public final qq.a l(@NotNull y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(qq.a.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (qq.a) objB;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getServerEndpoint() {
        return this.serverEndpoint;
    }

    @NotNull
    public final gs.c n(@NotNull y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(gs.c.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (gs.c) objB;
    }

    @NotNull
    public final UploadService o(@NotNull y retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(UploadService.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (UploadService) objB;
    }

    @NotNull
    public final js.a q(@NotNull y webRtcRetrofit) {
        Intrinsics.checkNotNullParameter(webRtcRetrofit, "webRtcRetrofit");
        Object objB = webRtcRetrofit.d().c(this.webRtcServerEndpoint).e().b(js.a.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (js.a) objB;
    }
}
