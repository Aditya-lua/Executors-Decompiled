package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.appsflyer.C1759R;
import com.withpersona.sdk2.inquiry.FieldMapping;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.p057ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.p057ui.network.TransitionInquiryRequest;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import fo.InterfaceC5720a;
import gp.C6181a;
import gp.InterfaceC6203w;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7701q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152go.C6159e;
import p152go.C6174t;
import p229jt.C7348o;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p499vr.InterfaceC12257h;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003 <=B\u0081\u0001\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010!R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006>"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;", "Lvr/h;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "sessionToken", "trackingEventsUrl", "inquiryId", "shareToken", "", "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "fieldMappings", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "transitionData", "Lgp/w;", NotificationCompat.CATEGORY_SERVICE, "Lfo/a;", "fallbackModeManager", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "uiStepSavedStateHelper", "Lgo/e;", "featureFlagManager", "Landroid/content/Context;", "applicationContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;Lgp/w;Lfo/a;Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Lgo/e;Landroid/content/Context;)V", "Lnu/h;", "run", "()Lnu/h;", "s", "r", "b", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "c", "d", "o", "e", "f", "Ljava/util/List;", "g", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "h", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "i", "Lgp/w;", "j", "Lfo/a;", "k", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "l", "Lgo/e;", "m", "Landroid/content/Context;", "", "q", "()Z", "useMultipartTransition", "TransitionData", "a", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class TransitionWorker implements InterfaceC12257h<AbstractC3663b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String trackingEventsUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final String shareToken;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<FieldMapping> fieldMappings;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InquirySessionConfig inquirySessionConfig;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final TransitionData transitionData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6203w service;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5720a fallbackModeManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final UiStepSavedStateHelper uiStepSavedStateHelper;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    @Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0015¨\u0006&"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "fromComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/Map;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "f", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/String;", "g", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class TransitionData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TransitionData> CREATOR = new C3661a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final UiComponent fromComponent;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final Map<String, ComponentParam> componentParams;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.TransitionWorker$TransitionData$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3661a implements Parcelable.Creator<TransitionData> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
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

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TransitionData[] newArray(int i10) {
                return new TransitionData[i10];
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.ui.network.ComponentParam> */
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
        /* JADX INFO: renamed from: a */
        public final Map<String, ComponentParam> m18315a() {
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
            return Intrinsics.m31980c(this.fromComponent, transitionData.fromComponent) && Intrinsics.m31980c(this.componentParams, transitionData.componentParams) && Intrinsics.m31980c(this.fromStep, transitionData.fromStep);
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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.TransitionWorker$a */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JY\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;", "", "", "sessionToken", "trackingEventsUrl", "inquiryId", "shareToken", "", "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "fieldMappings", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "transitionData", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;)Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC3662a {
        @NotNull
        /* JADX INFO: renamed from: a */
        TransitionWorker mo18320a(@NotNull String sessionToken, @Nullable String trackingEventsUrl, @NotNull String inquiryId, @Nullable String shareToken, @NotNull List<FieldMapping> fieldMappings, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull TransitionData transitionData);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.TransitionWorker$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b$b;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class AbstractC3663b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.TransitionWorker$b$a, reason: from toString */
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Error extends AbstractC3663b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
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
                return (other instanceof Error) && Intrinsics.m31980c(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.TransitionWorker$b$b, reason: from toString */
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "nextState", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Success extends AbstractC3663b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
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
                return (other instanceof Success) && Intrinsics.m31980c(this.nextState, ((Success) other).nextState);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.TransitionWorker.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ AbstractC3663b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC3663b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.TransitionWorker$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1", m39664f = "TransitionWorker.kt", m39665l = {46, 48}, m39666m = "invokeSuspend")
    public static final class C3664c extends AbstractC10351m implements Function2<InterfaceC9577i<? super AbstractC3663b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14678t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f14679u;

        public C3664c(InterfaceC9557b<? super C3664c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            C3664c c3664c = TransitionWorker.this.new C3664c(interfaceC9557b);
            c3664c.f14679u = obj;
            return c3664c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (nu.C9579j.m37800q(r0, r6, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (nu.C9579j.m37800q(r0, r6, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            return r1;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f14679u;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14678t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                if (TransitionWorker.this.fallbackModeManager.mo22892b()) {
                    InterfaceC9575h interfaceC9575hM18313r = TransitionWorker.this.m18313r();
                    this.f14679u = C10350l.m39676a(interfaceC9577i);
                    this.f14678t = 1;
                } else {
                    InterfaceC9575h interfaceC9575hM18314s = TransitionWorker.this.m18314s();
                    this.f14679u = C10350l.m39676a(interfaceC9577i);
                    this.f14678t = 2;
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super AbstractC3663b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3664c) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.TransitionWorker$d */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$runFallbackTransition$1", m39664f = "TransitionWorker.kt", m39665l = {117, 122, C1759R.styleable.AppCompatTheme_windowMinWidthMajor}, m39666m = "invokeSuspend")
    public static final class C3665d extends AbstractC10351m implements Function2<InterfaceC9577i<? super AbstractC3663b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f14681t;

        /* JADX INFO: renamed from: u */
        public Object f14682u;

        /* JADX INFO: renamed from: v */
        public Object f14683v;

        /* JADX INFO: renamed from: w */
        public int f14684w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f14685x;

        public C3665d(InterfaceC9557b<? super C3665d> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            C3665d c3665d = TransitionWorker.this.new C3665d(interfaceC9557b);
            c3665d.f14685x = obj;
            return c3665d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0111, code lost:
        
            if (r1.emit(r4, r17) == r2) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0138, code lost:
        
            if (r1.emit(r5, r17) == r2) goto L31;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objMo22891a;
            TransitionInquiryRequest transitionInquiryRequest;
            Object obj2;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f14685x;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14684w;
            if (i10 != 0) {
                if (i10 == 1) {
                    obj2 = this.f14682u;
                    TransitionInquiryRequest transitionInquiryRequest2 = (TransitionInquiryRequest) this.f14681t;
                    C7348o.m30470b(obj);
                    transitionInquiryRequest = transitionInquiryRequest2;
                    objMo22891a = obj;
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            TransitionInquiryRequest.Companion companion = TransitionInquiryRequest.INSTANCE;
            UiComponent fromComponent = TransitionWorker.this.transitionData.getFromComponent();
            Map<String, ComponentParam> mapM18315a = TransitionWorker.this.transitionData.m18315a();
            String fromStep = TransitionWorker.this.transitionData.getFromStep();
            String str = TransitionWorker.this.shareToken;
            List<FieldMapping> list = TransitionWorker.this.fieldMappings;
            ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
            for (FieldMapping fieldMapping : list) {
                arrayList.add(new TransitionInquiryRequest.FieldMapping(fieldMapping.getSourceFieldName(), fieldMapping.getDestinationFieldName()));
            }
            TransitionInquiryRequest transitionInquiryRequestM21622a = companion.m21622a(fromComponent, mapM18315a, fromStep, str, arrayList);
            List<MultipartBody.Part> listM21613c = TransitionWorker.this.m18312q() ? transitionInquiryRequestM21622a.m21613c(TransitionWorker.this.getInquiryId(), TransitionWorker.this.applicationContext.getContentResolver()) : transitionInquiryRequestM21622a;
            InterfaceC5720a interfaceC5720a = TransitionWorker.this.fallbackModeManager;
            String sessionToken = TransitionWorker.this.getSessionToken();
            this.f14685x = interfaceC9577i;
            this.f14681t = C10350l.m39676a(transitionInquiryRequestM21622a);
            this.f14682u = C10350l.m39676a(listM21613c);
            this.f14684w = 1;
            objMo22891a = interfaceC5720a.mo22891a(sessionToken, listM21613c, this);
            if (objMo22891a != objM38805e) {
                List<MultipartBody.Part> list2 = listM21613c;
                transitionInquiryRequest = transitionInquiryRequestM21622a;
                obj2 = list2;
            }
            return objM38805e;
            C7396x c7396x = (C7396x) objMo22891a;
            if (c7396x.m30657g()) {
                AbstractC3663b.Success success = new AbstractC3663b.Success(null);
                this.f14685x = C10350l.m39676a(interfaceC9577i);
                this.f14681t = C10350l.m39676a(transitionInquiryRequest);
                this.f14682u = C10350l.m39676a(obj2);
                this.f14683v = C10350l.m39676a(c7396x);
                this.f14684w = 3;
            } else {
                AbstractC3663b.Error error = new AbstractC3663b.Error(NetworkUtilsKt.toErrorInfo(c7396x));
                this.f14685x = C10350l.m39676a(interfaceC9577i);
                this.f14681t = C10350l.m39676a(transitionInquiryRequest);
                this.f14682u = C10350l.m39676a(obj2);
                this.f14683v = C10350l.m39676a(c7396x);
                this.f14684w = 2;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super AbstractC3663b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3665d) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.TransitionWorker$e */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$runTransition$1", m39664f = "TransitionWorker.kt", m39665l = {64, 70, 77, 80, 96}, m39666m = "invokeSuspend")
    public static final class C3666e extends AbstractC10351m implements Function2<InterfaceC9577i<? super AbstractC3663b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public /* synthetic */ Object f14687A;

        /* JADX INFO: renamed from: t */
        public Object f14689t;

        /* JADX INFO: renamed from: u */
        public Object f14690u;

        /* JADX INFO: renamed from: v */
        public Object f14691v;

        /* JADX INFO: renamed from: w */
        public Object f14692w;

        /* JADX INFO: renamed from: x */
        public Object f14693x;

        /* JADX INFO: renamed from: y */
        public Object f14694y;

        /* JADX INFO: renamed from: z */
        public int f14695z;

        public C3666e(InterfaceC9557b<? super C3666e> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            C3666e c3666e = TransitionWorker.this.new C3666e(interfaceC9557b);
            c3666e.f14687A = obj;
            return c3666e;
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
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws FileNotFoundException {
            TransitionInquiryRequest transitionInquiryRequestM21622a;
            Object objM27316e;
            Object objM27317f;
            C7396x c7396x;
            TransitionInquiryRequest transitionInquiryRequest;
            C7396x c7396x2;
            Object objM30653a;
            CheckInquiryResponse checkInquiryResponse;
            CheckInquiryResponse.PollingMode pollingMode;
            InquiryState inquiryStateM27241w;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f14687A;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14695z;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                TransitionInquiryRequest.Companion companion = TransitionInquiryRequest.INSTANCE;
                UiComponent fromComponent = TransitionWorker.this.transitionData.getFromComponent();
                Map<String, ComponentParam> mapM18315a = TransitionWorker.this.transitionData.m18315a();
                String fromStep = TransitionWorker.this.transitionData.getFromStep();
                String str = TransitionWorker.this.shareToken;
                List<FieldMapping> list = TransitionWorker.this.fieldMappings;
                ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
                for (FieldMapping fieldMapping : list) {
                    arrayList.add(new TransitionInquiryRequest.FieldMapping(fieldMapping.getSourceFieldName(), fieldMapping.getDestinationFieldName()));
                }
                transitionInquiryRequestM21622a = companion.m21622a(fromComponent, mapM18315a, fromStep, str, arrayList);
                if (TransitionWorker.this.m18312q()) {
                    InterfaceC6203w interfaceC6203w = TransitionWorker.this.service;
                    String sessionToken = TransitionWorker.this.getSessionToken();
                    String inquiryId = TransitionWorker.this.getInquiryId();
                    List<MultipartBody.Part> listM21613c = transitionInquiryRequestM21622a.m21613c(TransitionWorker.this.getInquiryId(), TransitionWorker.this.applicationContext.getContentResolver());
                    this.f14687A = interfaceC9577i;
                    this.f14689t = C10350l.m39676a(transitionInquiryRequestM21622a);
                    this.f14695z = 1;
                    objM27317f = interfaceC6203w.m27317f(sessionToken, inquiryId, listM21613c, this);
                } else {
                    InterfaceC6203w interfaceC6203w2 = TransitionWorker.this.service;
                    String sessionToken2 = TransitionWorker.this.getSessionToken();
                    String inquiryId2 = TransitionWorker.this.getInquiryId();
                    this.f14687A = interfaceC9577i;
                    this.f14689t = C10350l.m39676a(transitionInquiryRequestM21622a);
                    this.f14695z = 2;
                    objM27316e = interfaceC6203w2.m27316e(sessionToken2, inquiryId2, transitionInquiryRequestM21622a, this);
                }
                return objM38805e;
            }
            if (i10 == 1) {
                transitionInquiryRequestM21622a = (TransitionInquiryRequest) this.f14689t;
                C7348o.m30470b(obj);
                objM27317f = obj;
                c7396x = (C7396x) objM27317f;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        c7396x2 = (C7396x) this.f14690u;
                        transitionInquiryRequest = (TransitionInquiryRequest) this.f14689t;
                        C7348o.m30470b(obj);
                        objM30653a = c7396x2.m30653a();
                        if (objM30653a != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        checkInquiryResponse = (CheckInquiryResponse) objM30653a;
                        CheckInquiryResponse.WaitForTransitionConfig waitForTransitionConfig = checkInquiryResponse.getData().getAttributes().getWaitForTransitionConfig();
                        pollingMode = waitForTransitionConfig.getPollingMode();
                        if (pollingMode == CheckInquiryResponse.PollingMode.None) {
                            inquiryStateM27241w = C6181a.m27241w(checkInquiryResponse, TransitionWorker.this.getSessionToken(), TransitionWorker.this.inquirySessionConfig, TransitionWorker.this.trackingEventsUrl);
                        } else {
                            inquiryStateM27241w = null;
                        }
                        AbstractC3663b.Success success = new AbstractC3663b.Success(inquiryStateM27241w);
                        this.f14687A = C10350l.m39676a(interfaceC9577i);
                        this.f14689t = C10350l.m39676a(transitionInquiryRequest);
                        this.f14690u = C10350l.m39676a(c7396x2);
                        this.f14691v = C10350l.m39676a(checkInquiryResponse);
                        this.f14692w = C10350l.m39676a(waitForTransitionConfig);
                        this.f14693x = C10350l.m39676a(pollingMode);
                        this.f14694y = C10350l.m39676a(inquiryStateM27241w);
                        this.f14695z = 5;
                    } else {
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
                C7348o.m30470b(obj);
            } else {
                transitionInquiryRequestM21622a = (TransitionInquiryRequest) this.f14689t;
                C7348o.m30470b(obj);
                objM27316e = obj;
                c7396x = (C7396x) objM27316e;
            }
            return Unit.f29331a;
            transitionInquiryRequest = transitionInquiryRequestM21622a;
            c7396x2 = c7396x;
            if (c7396x2.m30657g()) {
                UiStepSavedStateHelper uiStepSavedStateHelper = TransitionWorker.this.uiStepSavedStateHelper;
                this.f14687A = interfaceC9577i;
                this.f14689t = C10350l.m39676a(transitionInquiryRequest);
                this.f14690u = c7396x2;
                this.f14695z = 4;
                if (uiStepSavedStateHelper.m18328c(this) != objM38805e) {
                    objM30653a = c7396x2.m30653a();
                    if (objM30653a != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    checkInquiryResponse = (CheckInquiryResponse) objM30653a;
                    CheckInquiryResponse.WaitForTransitionConfig waitForTransitionConfig2 = checkInquiryResponse.getData().getAttributes().getWaitForTransitionConfig();
                    pollingMode = waitForTransitionConfig2.getPollingMode();
                    if (pollingMode == CheckInquiryResponse.PollingMode.None) {
                        inquiryStateM27241w = C6181a.m27241w(checkInquiryResponse, TransitionWorker.this.getSessionToken(), TransitionWorker.this.inquirySessionConfig, TransitionWorker.this.trackingEventsUrl);
                    } else {
                        inquiryStateM27241w = null;
                    }
                    AbstractC3663b.Success success2 = new AbstractC3663b.Success(inquiryStateM27241w);
                    this.f14687A = C10350l.m39676a(interfaceC9577i);
                    this.f14689t = C10350l.m39676a(transitionInquiryRequest);
                    this.f14690u = C10350l.m39676a(c7396x2);
                    this.f14691v = C10350l.m39676a(checkInquiryResponse);
                    this.f14692w = C10350l.m39676a(waitForTransitionConfig2);
                    this.f14693x = C10350l.m39676a(pollingMode);
                    this.f14694y = C10350l.m39676a(inquiryStateM27241w);
                    this.f14695z = 5;
                }
            } else {
                AbstractC3663b.Error error = new AbstractC3663b.Error(NetworkUtilsKt.toErrorInfo(c7396x2));
                this.f14687A = C10350l.m39676a(interfaceC9577i);
                this.f14689t = C10350l.m39676a(transitionInquiryRequest);
                this.f14690u = C10350l.m39676a(c7396x2);
                this.f14695z = 3;
            }
            return objM38805e;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super AbstractC3663b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3666e) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public TransitionWorker(@NotNull String sessionToken, @Nullable String str, @NotNull String inquiryId, @Nullable String str2, @NotNull List<FieldMapping> fieldMappings, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull TransitionData transitionData, @NotNull InterfaceC6203w service, @NotNull InterfaceC5720a fallbackModeManager, @NotNull UiStepSavedStateHelper uiStepSavedStateHelper, @NotNull C6159e featureFlagManager, @NotNull Context applicationContext) {
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

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7574c(interfaceC12257h);
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

    /* JADX INFO: renamed from: q */
    public final boolean m18312q() {
        return this.featureFlagManager.m27145a(C6174t.f23549a);
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC9575h<AbstractC3663b> m18313r() {
        return C9579j.m37806w(new C3665d(null));
    }

    @Override // p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<AbstractC3663b> run() {
        return C9579j.m37806w(new C3664c(null));
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC9575h<AbstractC3663b> m18314s() {
        return C9579j.m37806w(new C3666e(null));
    }
}
