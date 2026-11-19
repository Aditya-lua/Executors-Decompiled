package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.FieldMapping;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest;
import hr.InquirySessionConfig;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mv.c0;
import np.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import qr.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003 $<B\u0081\u0001\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010!R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/x;", "Lls/j;", "Lcom/withpersona/sdk2/inquiry/internal/x$b;", BuildConfig.FLAVOR, "sessionToken", "trackingEventsUrl", "inquiryId", "shareToken", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "fieldMappings", "Lhr/g;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/x$c;", "transitionData", "Lup/w;", "service", "Lso/a;", "fallbackModeManager", "Lnp/q0;", "uiStepSavedStateHelper", "Lto/e;", "featureFlagManager", "Landroid/content/Context;", "applicationContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lhr/g;Lcom/withpersona/sdk2/inquiry/internal/x$c;Lup/w;Lso/a;Lnp/q0;Lto/e;Landroid/content/Context;)V", "Ldv/h;", "run", "()Ldv/h;", "s", "r", "b", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "c", "d", "o", "e", "f", "Ljava/util/List;", "g", "Lhr/g;", "h", "Lcom/withpersona/sdk2/inquiry/internal/x$c;", "i", "Lup/w;", "j", "Lso/a;", "k", "Lnp/q0;", "l", "Lto/e;", "m", "Landroid/content/Context;", BuildConfig.FLAVOR, "q", "()Z", "useMultipartTransition", "a", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x implements ls.j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String trackingEventsUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String shareToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<FieldMapping> fieldMappings;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InquirySessionConfig inquirySessionConfig;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TransitionData transitionData;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final up.w service;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final so.a fallbackModeManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final q0 uiStepSavedStateHelper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final to.e featureFlagManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JY\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/x$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "sessionToken", "trackingEventsUrl", "inquiryId", "shareToken", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "fieldMappings", "Lhr/g;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/x$c;", "transitionData", "Lcom/withpersona/sdk2/inquiry/internal/x;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lhr/g;Lcom/withpersona/sdk2/inquiry/internal/x$c;)Lcom/withpersona/sdk2/inquiry/internal/x;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        x a(@NotNull String sessionToken, @Nullable String trackingEventsUrl, @NotNull String inquiryId, @Nullable String shareToken, @NotNull List<FieldMapping> fieldMappings, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull TransitionData transitionData);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/x$b;", BuildConfig.FLAVOR, "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/internal/x$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/x$b$b;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.x$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/x$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/x$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.c(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.x$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/x$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/x$b;", "Lcom/withpersona/sdk2/inquiry/internal/j;", "nextState", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/j;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/j;", "()Lcom/withpersona/sdk2/inquiry/internal/j;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final j nextState;

            public Success(@Nullable j jVar) {
                super(null);
                this.nextState = jVar;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final j getNextState() {
                return this.nextState;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.c(this.nextState, ((Success) other).nextState);
            }

            public int hashCode() {
                j jVar = this.nextState;
                if (jVar == null) {
                    return 0;
                }
                return jVar.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(nextState=" + this.nextState + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.x$c, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0015¨\u0006&"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/x$c;", "Landroid/os/Parcelable;", "Lqr/x5;", "fromComponent", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "<init>", "(Lqr/x5;Ljava/util/Map;Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lqr/x5;", "f", "()Lqr/x5;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/String;", "g", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransitionData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TransitionData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final x5 fromComponent;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final Map<String, ComponentParam> componentParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.x$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TransitionData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TransitionData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                x5 x5Var = (x5) parcel.readParcelable(TransitionData.class.getClassLoader());
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(TransitionData.class.getClassLoader()));
                }
                return new TransitionData(x5Var, linkedHashMap, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TransitionData[] newArray(int i10) {
                return new TransitionData[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TransitionData(@NotNull x5 fromComponent, @NotNull Map<String, ? extends ComponentParam> componentParams, @NotNull String fromStep) {
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(componentParams, "componentParams");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            this.fromComponent = fromComponent;
            this.componentParams = componentParams;
            this.fromStep = fromStep;
        }

        @NotNull
        public final Map<String, ComponentParam> a() {
            return this.componentParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransitionData)) {
                return false;
            }
            TransitionData transitionData = (TransitionData) other;
            return Intrinsics.c(this.fromComponent, transitionData.fromComponent) && Intrinsics.c(this.componentParams, transitionData.componentParams) && Intrinsics.c(this.fromStep, transitionData.fromStep);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final x5 getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }

        public int hashCode() {
            return (((this.fromComponent.hashCode() * 31) + this.componentParams.hashCode()) * 31) + this.fromStep.hashCode();
        }

        @NotNull
        public String toString() {
            return "TransitionData(fromComponent=" + this.fromComponent + ", componentParams=" + this.componentParams + ", fromStep=" + this.fromStep + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.fromComponent, flags);
            Map<String, ComponentParam> map = this.componentParams;
            dest.writeInt(map.size());
            for (Map.Entry<String, ComponentParam> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
            dest.writeString(this.fromStep);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/internal/x$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1", f = "TransitionWorker.kt", l = {46, 48}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function2<dv.i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10923t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f10924u;

        public d(eu.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            d dVar = x.this.new d(bVar);
            dVar.f10924u = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (dv.j.q(r0, r6, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (dv.j.q(r0, r6, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            return r1;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            dv.i iVar = (dv.i) this.f10924u;
            Object objE = fu.c.e();
            int i10 = this.f10923t;
            if (i10 == 0) {
                zt.o.b(obj);
                if (x.this.fallbackModeManager.b()) {
                    dv.h hVarR = x.this.r();
                    this.f10924u = gu.l.a(iVar);
                    this.f10923t = 1;
                } else {
                    dv.h hVarS = x.this.s();
                    this.f10924u = gu.l.a(iVar);
                    this.f10923t = 2;
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/internal/x$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$runFallbackTransition$1", f = "TransitionWorker.kt", l = {117, 122, 124}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function2<dv.i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10926t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10927u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f10928v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f10929w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f10930x;

        public e(eu.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            e eVar = x.this.new e(bVar);
            eVar.f10930x = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0111, code lost:
        
            if (r1.emit(r4, r17) == r2) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0138, code lost:
        
            if (r1.emit(r5, r17) == r2) goto L31;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objA;
            TransitionInquiryRequest transitionInquiryRequest;
            Object obj2;
            dv.i iVar = (dv.i) this.f10930x;
            Object objE = fu.c.e();
            int i10 = this.f10929w;
            if (i10 != 0) {
                if (i10 == 1) {
                    obj2 = this.f10927u;
                    TransitionInquiryRequest transitionInquiryRequest2 = (TransitionInquiryRequest) this.f10926t;
                    zt.o.b(obj);
                    transitionInquiryRequest = transitionInquiryRequest2;
                    objA = obj;
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
            zt.o.b(obj);
            TransitionInquiryRequest.Companion companion = TransitionInquiryRequest.INSTANCE;
            x5 fromComponent = x.this.transitionData.getFromComponent();
            Map<String, ComponentParam> mapA = x.this.transitionData.a();
            String fromStep = x.this.transitionData.getFromStep();
            String str = x.this.shareToken;
            List<FieldMapping> list = x.this.fieldMappings;
            ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(list, 10));
            for (FieldMapping fieldMapping : list) {
                arrayList.add(new TransitionInquiryRequest.FieldMapping(fieldMapping.getSourceFieldName(), fieldMapping.getDestinationFieldName()));
            }
            TransitionInquiryRequest transitionInquiryRequestA = companion.a(fromComponent, mapA, fromStep, str, arrayList);
            List<c0.c> listC = x.this.q() ? transitionInquiryRequestA.c(x.this.getInquiryId(), x.this.applicationContext.getContentResolver()) : transitionInquiryRequestA;
            so.a aVar = x.this.fallbackModeManager;
            String sessionToken = x.this.getSessionToken();
            this.f10930x = iVar;
            this.f10926t = gu.l.a(transitionInquiryRequestA);
            this.f10927u = gu.l.a(listC);
            this.f10929w = 1;
            objA = aVar.a(sessionToken, listC, this);
            if (objA != objE) {
                List<c0.c> list2 = listC;
                transitionInquiryRequest = transitionInquiryRequestA;
                obj2 = list2;
            }
            return objE;
            sw.x xVar = (sw.x) objA;
            if (xVar.g()) {
                b.Success success = new b.Success(null);
                this.f10930x = gu.l.a(iVar);
                this.f10926t = gu.l.a(transitionInquiryRequest);
                this.f10927u = gu.l.a(obj2);
                this.f10928v = gu.l.a(xVar);
                this.f10929w = 3;
            } else {
                b.Error error = new b.Error(NetworkUtilsKt.toErrorInfo(xVar));
                this.f10930x = gu.l.a(iVar);
                this.f10926t = gu.l.a(transitionInquiryRequest);
                this.f10927u = gu.l.a(obj2);
                this.f10928v = gu.l.a(xVar);
                this.f10929w = 2;
            }
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((e) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/internal/x$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$runTransition$1", f = "TransitionWorker.kt", l = {Barcode.FORMAT_EAN_8, 70, 77, 80, 96}, m = "invokeSuspend")
    public static final class f extends gu.m implements Function2<dv.i<? super b>, eu.b<? super Unit>, Object> {
        public /* synthetic */ Object A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10932t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10933u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f10934v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f10935w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f10936x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f10937y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f10938z;

        public f(eu.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            f fVar = x.this.new f(bVar);
            fVar.A = obj;
            return fVar;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0180  */
        /* JADX WARN: Code duplicated, block: B:43:0x0196  */
        /* JADX WARN: Code duplicated, block: B:44:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:50:0x01ea  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0105, code lost:
        
            if (r4 == r2) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x012e, code lost:
        
            if (r4 == r2) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x015c, code lost:
        
            if (r1.emit(r4, r16) == r2) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x01e4, code lost:
        
            if (r1.emit(r9, r16) == r2) goto L47;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws FileNotFoundException {
            TransitionInquiryRequest transitionInquiryRequestA;
            Object objI;
            Object objG;
            sw.x xVar;
            TransitionInquiryRequest transitionInquiryRequest;
            sw.x xVar2;
            Object objA;
            CheckInquiryResponse checkInquiryResponse;
            CheckInquiryResponse.PollingMode pollingMode;
            j jVarW;
            dv.i iVar = (dv.i) this.A;
            Object objE = fu.c.e();
            int i10 = this.f10938z;
            if (i10 == 0) {
                zt.o.b(obj);
                TransitionInquiryRequest.Companion companion = TransitionInquiryRequest.INSTANCE;
                x5 fromComponent = x.this.transitionData.getFromComponent();
                Map<String, ComponentParam> mapA = x.this.transitionData.a();
                String fromStep = x.this.transitionData.getFromStep();
                String str = x.this.shareToken;
                List<FieldMapping> list = x.this.fieldMappings;
                ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(list, 10));
                for (FieldMapping fieldMapping : list) {
                    arrayList.add(new TransitionInquiryRequest.FieldMapping(fieldMapping.getSourceFieldName(), fieldMapping.getDestinationFieldName()));
                }
                transitionInquiryRequestA = companion.a(fromComponent, mapA, fromStep, str, arrayList);
                if (x.this.q()) {
                    up.w wVar = x.this.service;
                    String sessionToken = x.this.getSessionToken();
                    String inquiryId = x.this.getInquiryId();
                    List<c0.c> listC = transitionInquiryRequestA.c(x.this.getInquiryId(), x.this.applicationContext.getContentResolver());
                    this.A = iVar;
                    this.f10932t = gu.l.a(transitionInquiryRequestA);
                    this.f10938z = 1;
                    objG = wVar.g(sessionToken, inquiryId, listC, this);
                } else {
                    up.w wVar2 = x.this.service;
                    String sessionToken2 = x.this.getSessionToken();
                    String inquiryId2 = x.this.getInquiryId();
                    this.A = iVar;
                    this.f10932t = gu.l.a(transitionInquiryRequestA);
                    this.f10938z = 2;
                    objI = wVar2.i(sessionToken2, inquiryId2, transitionInquiryRequestA, this);
                }
                return objE;
            }
            if (i10 == 1) {
                transitionInquiryRequestA = (TransitionInquiryRequest) this.f10932t;
                zt.o.b(obj);
                objG = obj;
                xVar = (sw.x) objG;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        xVar2 = (sw.x) this.f10933u;
                        transitionInquiryRequest = (TransitionInquiryRequest) this.f10932t;
                        zt.o.b(obj);
                        objA = xVar2.a();
                        if (objA != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        checkInquiryResponse = (CheckInquiryResponse) objA;
                        CheckInquiryResponse.WaitForTransitionConfig waitForTransitionConfig = checkInquiryResponse.getData().getAttributes().getWaitForTransitionConfig();
                        pollingMode = waitForTransitionConfig.getPollingMode();
                        if (pollingMode == CheckInquiryResponse.PollingMode.None) {
                            jVarW = up.a.w(checkInquiryResponse, x.this.getSessionToken(), x.this.inquirySessionConfig, x.this.trackingEventsUrl);
                        } else {
                            jVarW = null;
                        }
                        b.Success success = new b.Success(jVarW);
                        this.A = gu.l.a(iVar);
                        this.f10932t = gu.l.a(transitionInquiryRequest);
                        this.f10933u = gu.l.a(xVar2);
                        this.f10934v = gu.l.a(checkInquiryResponse);
                        this.f10935w = gu.l.a(waitForTransitionConfig);
                        this.f10936x = gu.l.a(pollingMode);
                        this.f10937y = gu.l.a(jVarW);
                        this.f10938z = 5;
                    } else {
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
                zt.o.b(obj);
            } else {
                transitionInquiryRequestA = (TransitionInquiryRequest) this.f10932t;
                zt.o.b(obj);
                objI = obj;
                xVar = (sw.x) objI;
            }
            return Unit.f21506a;
            transitionInquiryRequest = transitionInquiryRequestA;
            xVar2 = xVar;
            if (xVar2.g()) {
                q0 q0Var = x.this.uiStepSavedStateHelper;
                this.A = iVar;
                this.f10932t = gu.l.a(transitionInquiryRequest);
                this.f10933u = xVar2;
                this.f10938z = 4;
                if (q0Var.c(this) != objE) {
                    objA = xVar2.a();
                    if (objA != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    checkInquiryResponse = (CheckInquiryResponse) objA;
                    CheckInquiryResponse.WaitForTransitionConfig waitForTransitionConfig2 = checkInquiryResponse.getData().getAttributes().getWaitForTransitionConfig();
                    pollingMode = waitForTransitionConfig2.getPollingMode();
                    if (pollingMode == CheckInquiryResponse.PollingMode.None) {
                        jVarW = up.a.w(checkInquiryResponse, x.this.getSessionToken(), x.this.inquirySessionConfig, x.this.trackingEventsUrl);
                    } else {
                        jVarW = null;
                    }
                    b.Success success2 = new b.Success(jVarW);
                    this.A = gu.l.a(iVar);
                    this.f10932t = gu.l.a(transitionInquiryRequest);
                    this.f10933u = gu.l.a(xVar2);
                    this.f10934v = gu.l.a(checkInquiryResponse);
                    this.f10935w = gu.l.a(waitForTransitionConfig2);
                    this.f10936x = gu.l.a(pollingMode);
                    this.f10937y = gu.l.a(jVarW);
                    this.f10938z = 5;
                }
            } else {
                b.Error error = new b.Error(NetworkUtilsKt.toErrorInfo(xVar2));
                this.A = gu.l.a(iVar);
                this.f10932t = gu.l.a(transitionInquiryRequest);
                this.f10933u = gu.l.a(xVar2);
                this.f10938z = 3;
            }
            return objE;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((f) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public x(@NotNull String sessionToken, @Nullable String str, @NotNull String inquiryId, @Nullable String str2, @NotNull List<FieldMapping> fieldMappings, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull TransitionData transitionData, @NotNull up.w service, @NotNull so.a fallbackModeManager, @NotNull q0 uiStepSavedStateHelper, @NotNull to.e featureFlagManager, @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(fieldMappings, "fieldMappings");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        Intrinsics.checkNotNullParameter(transitionData, "transitionData");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(uiStepSavedStateHelper, "uiStepSavedStateHelper");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.sessionToken = sessionToken;
        this.trackingEventsUrl = str;
        this.inquiryId = inquiryId;
        this.shareToken = str2;
        this.fieldMappings = fieldMappings;
        this.inquirySessionConfig = inquirySessionConfig;
        this.transitionData = transitionData;
        this.service = service;
        this.fallbackModeManager = fallbackModeManager;
        this.uiStepSavedStateHelper = uiStepSavedStateHelper;
        this.featureFlagManager = featureFlagManager;
        this.applicationContext = applicationContext;
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> jVar) {
        return super.c(jVar);
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getInquiryId() {
        return this.inquiryId;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final boolean q() {
        return this.featureFlagManager.a(to.t.f32630a);
    }

    public final dv.h<b> r() {
        return dv.j.w(new e(null));
    }

    @Override // ls.j
    @NotNull
    public dv.h<b> run() {
        return dv.j.w(new d(null));
    }

    public final dv.h<b> s() {
        return dv.j.w(new f(null));
    }
}
