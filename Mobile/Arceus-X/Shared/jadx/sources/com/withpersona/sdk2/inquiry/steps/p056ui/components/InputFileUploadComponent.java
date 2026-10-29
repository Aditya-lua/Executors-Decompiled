package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputFileUpload;
import cr.C4305r;
import cr.InterfaceC4287o;
import cr.InterfaceC4341x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mr.InterfaceC8649a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010(\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R&\u0010D\u001a\b\u0012\u0004\u0012\u00020?0>8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b@\u0010-\u0012\u0004\bB\u0010C\u001a\u0004\bA\u0010/R(\u0010L\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bF\u0010G\u0012\u0004\bK\u0010C\u001a\u0004\b@\u0010H\"\u0004\bI\u0010J¨\u0006M"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/o;", "Lcr/x;", "", "name", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SelectedFile;", "selectedFiles", "", "hasPrefill", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload;)V", "newFiles", "m", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/lang/String;Ljava/util/List;ZLcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "Ljava/util/List;", "k", "()Ljava/util/List;", "c", "Z", "j", "()Z", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "e", "getDisabled", "f", "J", "R0", "()J", "", "Lmr/a;", "g", "i", "getAssociatedViews$annotations", "()V", "associatedViews", "Lcr/r;", "h", "Lcr/r;", "()Lcr/r;", "setFileUploadController", "(Lcr/r;)V", "getFileUploadController$annotations", "fileUploadController", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class InputFileUploadComponent implements UiComponent, InterfaceC4287o, InterfaceC4341x {

    @NotNull
    public static final Parcelable.Creator<InputFileUploadComponent> CREATOR = new C4048a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<SelectedFile> selectedFiles;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final boolean hasPrefill;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public C4305r fileUploadController;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4048a implements Parcelable.Creator<InputFileUploadComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputFileUploadComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(SelectedFile.CREATOR.createFromParcel(parcel));
            }
            return new InputFileUploadComponent(string, arrayList, parcel.readInt() != 0, (JsonLogicBoolean) parcel.readParcelable(InputFileUploadComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputFileUploadComponent.class.getClassLoader()), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputFileUploadComponent[] newArray(int i10) {
            return new InputFileUploadComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputFileUploadComponent(@NotNull String name, @NotNull List<SelectedFile> selectedFiles, boolean z10, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(selectedFiles, "selectedFiles");
        this.name = name;
        this.selectedFiles = selectedFiles;
        this.hasPrefill = z10;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.fileUploadController = new C4305r(selectedFiles);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InputFileUploadComponent m20693f(InputFileUploadComponent inputFileUploadComponent, String str, List list, boolean z10, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputFileUploadComponent.name;
        }
        if ((i10 & 2) != 0) {
            list = inputFileUploadComponent.selectedFiles;
        }
        if ((i10 & 4) != 0) {
            z10 = inputFileUploadComponent.hasPrefill;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean = inputFileUploadComponent.hidden;
        }
        if ((i10 & 16) != 0) {
            jsonLogicBoolean2 = inputFileUploadComponent.disabled;
        }
        if ((i10 & 32) != 0) {
            j10 = inputFileUploadComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean2;
        boolean z11 = z10;
        return inputFileUploadComponent.m20694a(str, list, z11, jsonLogicBoolean, jsonLogicBoolean3, j11);
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getFileUploadController$annotations() {
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InputFileUploadComponent m20694a(@NotNull String name, @NotNull List<SelectedFile> selectedFiles, boolean hasPrefill, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(selectedFiles, "selectedFiles");
        return new InputFileUploadComponent(name, selectedFiles, hasPrefill, hidden, disabled, lastValueUpdateTs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFileUploadComponent)) {
            return false;
        }
        InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) other;
        return Intrinsics.m31980c(this.name, inputFileUploadComponent.name) && Intrinsics.m31980c(this.selectedFiles, inputFileUploadComponent.selectedFiles) && this.hasPrefill == inputFileUploadComponent.hasPrefill && Intrinsics.m31980c(this.hidden, inputFileUploadComponent.hidden) && Intrinsics.m31980c(this.disabled, inputFileUploadComponent.disabled) && this.lastValueUpdateTs == inputFileUploadComponent.lastValueUpdateTs;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final C4305r getFileUploadController() {
        return this.fileUploadController;
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
        int iHashCode = ((((this.name.hashCode() * 31) + this.selectedFiles.hashCode()) * 31) + Boolean.hashCode(this.hasPrefill)) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        return ((iHashCode2 + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getHasPrefill() {
        return this.hasPrefill;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<SelectedFile> m20697k() {
        return this.selectedFiles;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final InputFileUploadComponent m20698m(@NotNull List<SelectedFile> newFiles) {
        Intrinsics.checkNotNullParameter(newFiles, "newFiles");
        InputFileUploadComponent inputFileUploadComponentM20693f = m20693f(this, null, newFiles, false, null, null, System.currentTimeMillis(), 25, null);
        C4305r c4305r = this.fileUploadController;
        inputFileUploadComponentM20693f.fileUploadController = c4305r;
        c4305r.m21920c(newFiles);
        return inputFileUploadComponentM20693f;
    }

    @NotNull
    public String toString() {
        return "InputFileUploadComponent(name=" + this.name + ", selectedFiles=" + this.selectedFiles + ", hasPrefill=" + this.hasPrefill + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        List<SelectedFile> list = this.selectedFiles;
        dest.writeInt(list.size());
        Iterator<SelectedFile> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.hasPrefill ? 1 : 0);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
      (r11v0 java.lang.String)
      (r12v0 java.util.List)
      (r13v0 boolean)
      (r14v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r15v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
     A[MD:(java.lang.String, java.util.List<com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile>, boolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, long):void (m)] (LINE:10) call: com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent.<init>(java.lang.String, java.util.List, boolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, long):void type: THIS */
    public /* synthetic */ InputFileUploadComponent(String str, List list, boolean z10, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z10, jsonLogicBoolean, jsonLogicBoolean2, (i10 & 32) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputFileUploadComponent(@NotNull InputFileUpload config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        List listM31892k = C7699p.m31892k();
        InputFileUpload.Attributes attributes = config.getAttributes();
        List<InputFileUpload.PrefillItem> prefill = attributes != null ? attributes.getPrefill() : null;
        boolean z10 = true ^ (prefill == null || prefill.isEmpty());
        InputFileUpload.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputFileUpload.Attributes attributes3 = config.getAttributes();
        this(name, listM31892k, z10, hidden, attributes3 != null ? attributes3.getDisabled() : null, 0L, 32, null);
    }
}
