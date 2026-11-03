package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.R;
import com.withpersona.sdk2.inquiry.FieldMapping;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003 <=B\u0081\u0001\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010!R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;", "Ltr/h;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "sessionToken", "trackingEventsUrl", "inquiryId", "shareToken", "", "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "fieldMappings", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "transitionData", "Lep/w;", "service", "Lco/a;", "fallbackModeManager", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "uiStepSavedStateHelper", "Leo/e;", "featureFlagManager", "Landroid/content/Context;", "applicationContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;Lep/w;Lco/a;Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Leo/e;Landroid/content/Context;)V", "Llu/h;", "run", "()Llu/h;", "s", "r", "b", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "c", "d", "o", "e", "f", "Ljava/util/List;", "g", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "h", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "i", "Lep/w;", "j", "Lco/a;", "k", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "l", "Leo/e;", "m", "Landroid/content/Context;", "", "q", "()Z", "useMultipartTransition", "TransitionData", "a", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransitionWorker implements tr.h<b> {

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
    public final ep.w service;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final co.a fallbackModeManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UiStepSavedStateHelper uiStepSavedStateHelper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final eo.e featureFlagManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0015¨\u0006&"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "fromComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/Map;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "f", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/String;", "g", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransitionData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TransitionData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final UiComponent fromComponent;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final Map<String, ComponentParam> componentParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TransitionData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TransitionData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UiComponent uiComponent = (UiComponent) parcel.readParcelable(TransitionData.class.getClassLoader());
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(TransitionData.class.getClassLoader()));
                }
                return new TransitionData(uiComponent, linkedHashMap, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TransitionData[] newArray(int i10) {
                return new TransitionData[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TransitionData(@NotNull UiComponent fromComponent, @NotNull Map<String, ? extends ComponentParam> componentParams, @NotNull String fromStep) {
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
        public final UiComponent getFromComponent() {
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JY\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;", "", "", "sessionToken", "trackingEventsUrl", "inquiryId", "shareToken", "", "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "fieldMappings", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "transitionData", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;)Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        TransitionWorker a(@NotNull String sessionToken, @Nullable String trackingEventsUrl, @NotNull String inquiryId, @Nullable String shareToken, @NotNull List<FieldMapping> fieldMappings, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull TransitionData transitionData);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b$b;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.TransitionWorker$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.TransitionWorker$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "nextState", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final InquiryState nextState;

            public Success(@Nullable InquiryState inquiryState) {
                super(null);
                this.nextState = inquiryState;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InquiryState getNextState() {
                return this.nextState;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.c(this.nextState, ((Success) other).nextState);
            }

            public int hashCode() {
                InquiryState inquiryState = this.nextState;
                if (inquiryState == null) {
                    return 0;
                }
                return inquiryState.hashCode();
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

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1", f = "TransitionWorker.kt", l = {46, 48}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends nt.m implements Function2<lu.i<? super b>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11479t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f11480u;

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            c cVar = TransitionWorker.this.new c(bVar);
            cVar.f11480u = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (lu.j.q(r0, r6, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (lu.j.q(r0, r6, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            return r1;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f11480u
                lu.i r0 = (lu.i) r0
                java.lang.Object r1 = mt.c.e()
                int r2 = r5.f11479t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                gt.o.b(r6)
                goto L58
            L1f:
                gt.o.b(r6)
                com.withpersona.sdk2.inquiry.internal.TransitionWorker r6 = com.withpersona.sdk2.inquiry.internal.TransitionWorker.this
                co.a r6 = com.withpersona.sdk2.inquiry.internal.TransitionWorker.d(r6)
                boolean r6 = r6.b()
                if (r6 == 0) goto L43
                com.withpersona.sdk2.inquiry.internal.TransitionWorker r6 = com.withpersona.sdk2.inquiry.internal.TransitionWorker.this
                lu.h r6 = com.withpersona.sdk2.inquiry.internal.TransitionWorker.m(r6)
                java.lang.Object r2 = nt.l.a(r0)
                r5.f11480u = r2
                r5.f11479t = r4
                java.lang.Object r6 = lu.j.q(r0, r6, r5)
                if (r6 != r1) goto L58
                goto L57
            L43:
                com.withpersona.sdk2.inquiry.internal.TransitionWorker r6 = com.withpersona.sdk2.inquiry.internal.TransitionWorker.this
                lu.h r6 = com.withpersona.sdk2.inquiry.internal.TransitionWorker.n(r6)
                java.lang.Object r2 = nt.l.a(r0)
                r5.f11480u = r2
                r5.f11479t = r3
                java.lang.Object r6 = lu.j.q(r0, r6, r5)
                if (r6 != r1) goto L58
            L57:
                return r1
            L58:
                kotlin.Unit r6 = kotlin.Unit.f22938a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.TransitionWorker.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lu.i<? super b> iVar, lt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$runFallbackTransition$1", f = "TransitionWorker.kt", l = {117, 122, R.styleable.AppCompatTheme_windowMinWidthMajor}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends nt.m implements Function2<lu.i<? super b>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11482t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11483u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f11484v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f11485w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f11486x;

        public d(lt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            d dVar = TransitionWorker.this.new d(bVar);
            dVar.f11486x = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0111, code lost:
        
            if (r1.emit(r4, r17) == r2) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0138, code lost:
        
            if (r1.emit(r5, r17) == r2) goto L31;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 318
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.TransitionWorker.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lu.i<? super b> iVar, lt.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$runTransition$1", f = "TransitionWorker.kt", l = {64, 70, 77, 80, 96}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class e extends nt.m implements Function2<lu.i<? super b>, lt.b<? super Unit>, Object> {
        public /* synthetic */ Object A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11488t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11489u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f11490v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f11491w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f11492x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f11493y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f11494z;

        public e(lt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            e eVar = TransitionWorker.this.new e(bVar);
            eVar.A = obj;
            return eVar;
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
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.io.FileNotFoundException {
            /*
                Method dump skipped, instruction units count: 498
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.TransitionWorker.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lu.i<? super b> iVar, lt.b<? super Unit> bVar) {
            return ((e) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public TransitionWorker(@NotNull String sessionToken, @Nullable String str, @NotNull String inquiryId, @Nullable String str2, @NotNull List<FieldMapping> fieldMappings, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull TransitionData transitionData, @NotNull ep.w service, @NotNull co.a fallbackModeManager, @NotNull UiStepSavedStateHelper uiStepSavedStateHelper, @NotNull eo.e featureFlagManager, @NotNull Context applicationContext) {
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

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> hVar) {
        return super.a(hVar);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
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
        return this.featureFlagManager.a(eo.t.f16210a);
    }

    public final lu.h<b> r() {
        return lu.j.w(new d(null));
    }

    @Override // tr.h
    @NotNull
    public lu.h<b> run() {
        return lu.j.w(new c(null));
    }

    public final lu.h<b> s() {
        return lu.j.w(new e(null));
    }
}
