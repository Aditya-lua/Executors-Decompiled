package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.JpMyNumberNfcScan;
import cr.InterfaceC4248h2;
import cr.InterfaceC4287o;
import cr.InterfaceC4341x;
import er.C5201j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mr.InterfaceC8649a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p278lp.JpMyNumberNfcValidOperation;
import p471um.InterfaceC11872g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BA\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJR\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010D\u001a\b\u0012\u0004\u0012\u00020>0=8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b-\u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010AR(\u0010K\u001a\u00020&8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bE\u0010F\u0012\u0004\bJ\u0010C\u001a\u0004\bG\u0010H\"\u0004\b+\u0010IR\u001f\u0010Q\u001a\u0004\u0018\u00010L8\u0006¢\u0006\u0012\n\u0004\b@\u0010M\u0012\u0004\bP\u0010C\u001a\u0004\bN\u0010OR(\u0010Y\u001a\u00020R8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bS\u0010T\u0012\u0004\bX\u0010C\u001a\u0004\bS\u0010U\"\u0004\bV\u0010W¨\u0006Z"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/o;", "Lcr/x;", "Lcr/h2;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;", "scanResult", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;J)V", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;)V", "newValue", "m", "(Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;", "g", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "d", "getDisabled", "e", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;", "getScanResult", "()Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;", "f", "J", "R0", "()J", "", "Lmr/a;", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "h", "Z", "Y0", "()Z", "(Z)V", "getWasTapped$annotations", "wasTapped", "Llp/k;", "Llp/k;", "k", "()Llp/k;", "getValidOperation$annotations", "validOperation", "Ler/j;", "j", "Ler/j;", "()Ler/j;", "setScanResultController", "(Ler/j;)V", "getScanResultController$annotations", "scanResultController", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class JpMyNumberNfcScanComponent implements UiComponent, InterfaceC4287o, InterfaceC4341x, InterfaceC4248h2 {

    @NotNull
    public static final Parcelable.Creator<JpMyNumberNfcScanComponent> CREATOR = new C4069a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final JpMyNumberNfcScan config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final JpMyNumberNfcScanResult scanResult;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean wasTapped;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final JpMyNumberNfcValidOperation validOperation;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public C5201j scanResultController;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4069a implements Parcelable.Creator<JpMyNumberNfcScanComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JpMyNumberNfcScanComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JpMyNumberNfcScanComponent(parcel.readString(), (JpMyNumberNfcScan) parcel.readParcelable(JpMyNumberNfcScanComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(JpMyNumberNfcScanComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(JpMyNumberNfcScanComponent.class.getClassLoader()), (JpMyNumberNfcScanResult) parcel.readParcelable(JpMyNumberNfcScanComponent.class.getClassLoader()), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JpMyNumberNfcScanComponent[] newArray(int i10) {
            return new JpMyNumberNfcScanComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JpMyNumberNfcScanComponent(@NotNull String name, @NotNull JpMyNumberNfcScan config, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable JpMyNumberNfcScanResult jpMyNumberNfcScanResult, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(config, "config");
        this.name = name;
        this.config = config;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.scanResult = jpMyNumberNfcScanResult;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.validOperation = JpMyNumberNfcValidOperation.INSTANCE.m33578a(config.getAttributes());
        this.scanResultController = new C5201j(jpMyNumberNfcScanResult);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ JpMyNumberNfcScanComponent m20800f(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, String str, JpMyNumberNfcScan jpMyNumberNfcScan, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, JpMyNumberNfcScanResult jpMyNumberNfcScanResult, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jpMyNumberNfcScanComponent.name;
        }
        if ((i10 & 2) != 0) {
            jpMyNumberNfcScan = jpMyNumberNfcScanComponent.config;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = jpMyNumberNfcScanComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean2 = jpMyNumberNfcScanComponent.disabled;
        }
        if ((i10 & 16) != 0) {
            jpMyNumberNfcScanResult = jpMyNumberNfcScanComponent.scanResult;
        }
        if ((i10 & 32) != 0) {
            j10 = jpMyNumberNfcScanComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        JpMyNumberNfcScanResult jpMyNumberNfcScanResult2 = jpMyNumberNfcScanResult;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean;
        return jpMyNumberNfcScanComponent.m20802a(str, jpMyNumberNfcScan, jsonLogicBoolean3, jsonLogicBoolean2, jpMyNumberNfcScanResult2, j11);
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getScanResultController$annotations() {
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    /* JADX INFO: renamed from: Y0, reason: from getter */
    public boolean getWasTapped() {
        return this.wasTapped;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final JpMyNumberNfcScanComponent m20802a(@NotNull String name, @NotNull JpMyNumberNfcScan config, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @Nullable JpMyNumberNfcScanResult scanResult, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(config, "config");
        return new JpMyNumberNfcScanComponent(name, config, hidden, disabled, scanResult, lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4248h2
    /* JADX INFO: renamed from: b */
    public void mo20533b(boolean z10) {
        this.wasTapped = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JpMyNumberNfcScanComponent)) {
            return false;
        }
        JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) other;
        return Intrinsics.m31980c(this.name, jpMyNumberNfcScanComponent.name) && Intrinsics.m31980c(this.config, jpMyNumberNfcScanComponent.config) && Intrinsics.m31980c(this.hidden, jpMyNumberNfcScanComponent.hidden) && Intrinsics.m31980c(this.disabled, jpMyNumberNfcScanComponent.disabled) && Intrinsics.m31980c(this.scanResult, jpMyNumberNfcScanComponent.scanResult) && this.lastValueUpdateTs == jpMyNumberNfcScanComponent.lastValueUpdateTs;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final JpMyNumberNfcScan getConfig() {
        return this.config;
    }

    @Override // cr.InterfaceC4287o
    @Nullable
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // cr.InterfaceC4341x
    @Nullable
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.config.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        JpMyNumberNfcScanResult jpMyNumberNfcScanResult = this.scanResult;
        return ((iHashCode3 + (jpMyNumberNfcScanResult != null ? jpMyNumberNfcScanResult.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final C5201j getScanResultController() {
        return this.scanResultController;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final JpMyNumberNfcValidOperation getValidOperation() {
        return this.validOperation;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final JpMyNumberNfcScanComponent m20806m(@Nullable JpMyNumberNfcScanResult newValue) {
        JpMyNumberNfcScanComponent jpMyNumberNfcScanComponentM20800f = m20800f(this, null, null, null, null, newValue, 0L, 47, null);
        jpMyNumberNfcScanComponentM20800f.scanResultController = this.scanResultController;
        jpMyNumberNfcScanComponentM20800f.mo20533b(getWasTapped());
        return jpMyNumberNfcScanComponentM20800f;
    }

    @NotNull
    public String toString() {
        return "JpMyNumberNfcScanComponent(name=" + this.name + ", config=" + this.config + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", scanResult=" + this.scanResult + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.config, flags);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.scanResult, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
      (r9v0 java.lang.String A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (r10v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (r11v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (r12v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (wrap com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult:0x0005: TERNARY null = ((wrap int:0x0000: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult) : (r13v0 com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult))
      (wrap long:?: TERNARY null = ((wrap int:0x0006: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r14v0 long))
     A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult, long):void (m)] (LINE:11) call: com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult, long):void type: THIS */
    public /* synthetic */ JpMyNumberNfcScanComponent(String str, JpMyNumberNfcScan jpMyNumberNfcScan, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, JpMyNumberNfcScanResult jpMyNumberNfcScanResult, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jpMyNumberNfcScan, jsonLogicBoolean, jsonLogicBoolean2, (i10 & 16) != 0 ? null : jpMyNumberNfcScanResult, (i10 & 32) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JpMyNumberNfcScanComponent(@NotNull JpMyNumberNfcScan config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        JpMyNumberNfcScan.Attributes attributes = config.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        JpMyNumberNfcScan.Attributes attributes2 = config.getAttributes();
        this(name, config, hidden, attributes2 != null ? attributes2.getDisabled() : null, null, 0L, 48, null);
    }
}
