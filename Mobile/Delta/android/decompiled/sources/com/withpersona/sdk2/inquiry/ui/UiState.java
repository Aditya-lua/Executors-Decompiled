package com.withpersona.sdk2.inquiry.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.workflows.SimpleWorkflowState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;", "Landroid/os/Parcelable;", "<init>", "()V", "Displaying", "PendingAction", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UiState extends SimpleWorkflowState implements Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "Landroid/os/Parcelable;", "CreateReusablePersona", "VerifyReusablePersona", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction$CreateReusablePersona;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction$VerifyReusablePersona;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface PendingAction extends Parcelable {

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction$CreateReusablePersona;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "createPersonaSheetComponent", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CreateReusablePersona implements PendingAction {

            @NotNull
            public static final Parcelable.Creator<CreateReusablePersona> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final CreatePersonaSheetComponent createPersonaSheetComponent;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CreateReusablePersona> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CreateReusablePersona createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CreateReusablePersona((CreatePersonaSheetComponent) parcel.readParcelable(CreateReusablePersona.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CreateReusablePersona[] newArray(int i10) {
                    return new CreateReusablePersona[i10];
                }
            }

            public CreateReusablePersona(@NotNull CreatePersonaSheetComponent createPersonaSheetComponent) {
                Intrinsics.checkNotNullParameter(createPersonaSheetComponent, "createPersonaSheetComponent");
                this.createPersonaSheetComponent = createPersonaSheetComponent;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final CreatePersonaSheetComponent getCreatePersonaSheetComponent() {
                return this.createPersonaSheetComponent;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CreateReusablePersona) && Intrinsics.c(this.createPersonaSheetComponent, ((CreateReusablePersona) other).createPersonaSheetComponent);
            }

            public int hashCode() {
                return this.createPersonaSheetComponent.hashCode();
            }

            @NotNull
            public String toString() {
                return "CreateReusablePersona(createPersonaSheetComponent=" + this.createPersonaSheetComponent + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.createPersonaSheetComponent, flags);
            }
        }

        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction$VerifyReusablePersona;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "verifyPersonaButtonComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "f", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class VerifyReusablePersona implements PendingAction {

            @NotNull
            public static final Parcelable.Creator<VerifyReusablePersona> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final VerifyPersonaButtonComponent verifyPersonaButtonComponent;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final Map<String, ComponentParam> componentParams;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<VerifyReusablePersona> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final VerifyReusablePersona createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    VerifyPersonaButtonComponent verifyPersonaButtonComponent = (VerifyPersonaButtonComponent) parcel.readParcelable(VerifyReusablePersona.class.getClassLoader());
                    int i10 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        linkedHashMap.put(parcel.readString(), parcel.readParcelable(VerifyReusablePersona.class.getClassLoader()));
                    }
                    return new VerifyReusablePersona(verifyPersonaButtonComponent, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final VerifyReusablePersona[] newArray(int i10) {
                    return new VerifyReusablePersona[i10];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public VerifyReusablePersona(@NotNull VerifyPersonaButtonComponent verifyPersonaButtonComponent, @NotNull Map<String, ? extends ComponentParam> componentParams) {
                Intrinsics.checkNotNullParameter(verifyPersonaButtonComponent, "verifyPersonaButtonComponent");
                Intrinsics.checkNotNullParameter(componentParams, "componentParams");
                this.verifyPersonaButtonComponent = verifyPersonaButtonComponent;
                this.componentParams = componentParams;
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
                if (!(other instanceof VerifyReusablePersona)) {
                    return false;
                }
                VerifyReusablePersona verifyReusablePersona = (VerifyReusablePersona) other;
                return Intrinsics.c(this.verifyPersonaButtonComponent, verifyReusablePersona.verifyPersonaButtonComponent) && Intrinsics.c(this.componentParams, verifyReusablePersona.componentParams);
            }

            @NotNull
            /* JADX INFO: renamed from: f, reason: from getter */
            public final VerifyPersonaButtonComponent getVerifyPersonaButtonComponent() {
                return this.verifyPersonaButtonComponent;
            }

            public int hashCode() {
                return (this.verifyPersonaButtonComponent.hashCode() * 31) + this.componentParams.hashCode();
            }

            @NotNull
            public String toString() {
                return "VerifyReusablePersona(verifyPersonaButtonComponent=" + this.verifyPersonaButtonComponent + ", componentParams=" + this.componentParams + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.verifyPersonaButtonComponent, flags);
                Map<String, ComponentParam> map = this.componentParams;
                dest.writeInt(map.size());
                for (Map.Entry<String, ComponentParam> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeParcelable(entry.getValue(), flags);
                }
            }
        }
    }

    public /* synthetic */ UiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public UiState() {
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b>\b\u0087\b\u0018\u00002\u00020\u0001:\u0003klmBß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\u001d\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001d¢\u0006\u0004\b)\u0010*Jî\u0001\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010 \u001a\u00020\u001dHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b/\u0010$J\u001a\u00102\u001a\u00020\u00142\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010.R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u00107R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bA\u00109\u001a\u0004\bB\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bW\u0010T\u001a\u0004\bX\u0010VR%\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010\u001b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\ba\u00109\u001a\u0004\bb\u0010.R\u0017\u0010\u001c\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bc\u0010T\u001a\u0004\bd\u0010VR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\be\u0010E\u001a\u0004\bf\u0010$R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bg\u00109\u001a\u0004\bh\u0010.R\u0017\u0010 \u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bi\u0010E\u001a\u0004\bj\u0010$¨\u0006n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "components", "", "stepName", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "error", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "nfcScan", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;", "jpMyNumberNfcScan", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;", "autoSubmit", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "pendingAction", "", "hasRequestedGpsPermissions", "isRequestingGpsPermissions", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "triggeringComponent", "requestPermissionKey", "showHelpBottomSheet", "", "nfcScanAttemptCount", "filePickComponentName", "filePickRequestId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;ZZLjava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;ZILjava/lang/String;I)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "u", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;ZZLjava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;ZILjava/lang/String;I)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "b", "Ljava/lang/String;", "O", "c", "x", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "e", "A", "f", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "I", "()Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "g", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;", "G", "()Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;", "h", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;", "w", "()Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;", "i", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "K", "()Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "j", "Z", "E", "()Z", "k", "Q", "l", "Ljava/util/Map;", "z", "()Ljava/util/Map;", "m", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "P", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "n", "L", "o", "N", "p", "J", "q", "C", "r", "D", "NfcScan", "JpMyNumberNfcScan", "AutoSubmit", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Displaying extends UiState {

        @NotNull
        public static final Parcelable.Creator<Displaying> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<UiComponent> components;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<UiComponentErrorInfo> componentErrors;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.UiStepStyle styles;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String error;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final NfcScan nfcScan;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final JpMyNumberNfcScan jpMyNumberNfcScan;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final AutoSubmit autoSubmit;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final PendingAction pendingAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean hasRequestedGpsPermissions;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isRequestingGpsPermissions;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Map<String, ComponentParam> componentParams;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final UiComponent triggeringComponent;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String requestPermissionKey;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean showHelpBottomSheet;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        public final int nfcScanAttemptCount;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String filePickComponentName;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        public final int filePickRequestId;

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;", "component", "", "countdown", "", "countdownText", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;ILjava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;", "b", "I", "f", "c", "Ljava/lang/String;", "g", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AutoSubmit implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AutoSubmit> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final AutoSubmitableComponent component;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            public final int countdown;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String countdownText;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AutoSubmit> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final AutoSubmit createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AutoSubmit((AutoSubmitableComponent) parcel.readParcelable(AutoSubmit.class.getClassLoader()), parcel.readInt(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final AutoSubmit[] newArray(int i10) {
                    return new AutoSubmit[i10];
                }
            }

            public AutoSubmit(@NotNull AutoSubmitableComponent component, int i10, @Nullable String str) {
                Intrinsics.checkNotNullParameter(component, "component");
                this.component = component;
                this.countdown = i10;
                this.countdownText = str;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final AutoSubmitableComponent getComponent() {
                return this.component;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AutoSubmit)) {
                    return false;
                }
                AutoSubmit autoSubmit = (AutoSubmit) other;
                return Intrinsics.c(this.component, autoSubmit.component) && this.countdown == autoSubmit.countdown && Intrinsics.c(this.countdownText, autoSubmit.countdownText);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final int getCountdown() {
                return this.countdown;
            }

            @Nullable
            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getCountdownText() {
                return this.countdownText;
            }

            public int hashCode() {
                int iHashCode = ((this.component.hashCode() * 31) + Integer.hashCode(this.countdown)) * 31;
                String str = this.countdownText;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "AutoSubmit(component=" + this.component + ", countdown=" + this.countdown + ", countdownText=" + this.countdownText + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.component, flags);
                dest.writeInt(this.countdown);
                dest.writeString(this.countdownText);
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "component", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class JpMyNumberNfcScan implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<JpMyNumberNfcScan> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final JpMyNumberNfcScanComponent component;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<JpMyNumberNfcScan> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final JpMyNumberNfcScan createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new JpMyNumberNfcScan((JpMyNumberNfcScanComponent) parcel.readParcelable(JpMyNumberNfcScan.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final JpMyNumberNfcScan[] newArray(int i10) {
                    return new JpMyNumberNfcScan[i10];
                }
            }

            public JpMyNumberNfcScan(@NotNull JpMyNumberNfcScanComponent component) {
                Intrinsics.checkNotNullParameter(component, "component");
                this.component = component;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final JpMyNumberNfcScanComponent getComponent() {
                return this.component;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof JpMyNumberNfcScan) && Intrinsics.c(this.component, ((JpMyNumberNfcScan) other).component);
            }

            public int hashCode() {
                return this.component.hashCode();
            }

            @NotNull
            public String toString() {
                return "JpMyNumberNfcScan(component=" + this.component + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.component, flags);
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "component", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NfcScan implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<NfcScan> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final GovernmentIdNfcScanComponent component;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<NfcScan> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final NfcScan createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NfcScan((GovernmentIdNfcScanComponent) parcel.readParcelable(NfcScan.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final NfcScan[] newArray(int i10) {
                    return new NfcScan[i10];
                }
            }

            public NfcScan(@NotNull GovernmentIdNfcScanComponent component) {
                Intrinsics.checkNotNullParameter(component, "component");
                this.component = component;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final GovernmentIdNfcScanComponent getComponent() {
                return this.component;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NfcScan) && Intrinsics.c(this.component, ((NfcScan) other).component);
            }

            public int hashCode() {
                return this.component.hashCode();
            }

            @NotNull
            public String toString() {
                return "NfcScan(component=" + this.component + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.component, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Displaying> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Displaying createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(Displaying.class.getClassLoader()));
                }
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(UiComponentErrorInfo.CREATOR.createFromParcel(parcel));
                }
                StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(Displaying.class.getClassLoader());
                String string2 = parcel.readString();
                NfcScan nfcScanCreateFromParcel = parcel.readInt() == 0 ? null : NfcScan.CREATOR.createFromParcel(parcel);
                JpMyNumberNfcScan jpMyNumberNfcScanCreateFromParcel = parcel.readInt() == 0 ? null : JpMyNumberNfcScan.CREATOR.createFromParcel(parcel);
                AutoSubmit autoSubmitCreateFromParcel = parcel.readInt() == 0 ? null : AutoSubmit.CREATOR.createFromParcel(parcel);
                PendingAction pendingAction = (PendingAction) parcel.readParcelable(Displaying.class.getClassLoader());
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i14 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                    int i15 = 0;
                    while (i15 != i14) {
                        linkedHashMap2.put(parcel.readString(), parcel.readParcelable(Displaying.class.getClassLoader()));
                        i15++;
                        uiStepStyle = uiStepStyle;
                        arrayList = arrayList;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Displaying(arrayList, string, arrayList2, uiStepStyle, string2, nfcScanCreateFromParcel, jpMyNumberNfcScanCreateFromParcel, autoSubmitCreateFromParcel, pendingAction, z10, z11, linkedHashMap, (UiComponent) parcel.readParcelable(Displaying.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Displaying[] newArray(int i10) {
                return new Displaying[i10];
            }
        }

        public /* synthetic */ Displaying(List list, String str, List list2, StepStyles.UiStepStyle uiStepStyle, String str2, NfcScan nfcScan, JpMyNumberNfcScan jpMyNumberNfcScan, AutoSubmit autoSubmit, PendingAction pendingAction, boolean z10, boolean z11, Map map, UiComponent uiComponent, String str3, boolean z12, int i10, String str4, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, (i12 & 4) != 0 ? p.k() : list2, uiStepStyle, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : nfcScan, (i12 & 64) != 0 ? null : jpMyNumberNfcScan, (i12 & 128) != 0 ? null : autoSubmit, (i12 & Barcode.FORMAT_QR_CODE) != 0 ? null : pendingAction, (i12 & Barcode.FORMAT_UPC_A) != 0 ? false : z10, (i12 & Barcode.FORMAT_UPC_E) != 0 ? false : z11, (i12 & Barcode.FORMAT_PDF417) != 0 ? null : map, (i12 & Barcode.FORMAT_AZTEC) != 0 ? null : uiComponent, (i12 & 8192) != 0 ? "0" : str3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z12, (32768 & i12) != 0 ? 0 : i10, (65536 & i12) != 0 ? null : str4, (i12 & 131072) != 0 ? 0 : i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Displaying v(Displaying displaying, List list, String str, List list2, StepStyles.UiStepStyle uiStepStyle, String str2, NfcScan nfcScan, JpMyNumberNfcScan jpMyNumberNfcScan, AutoSubmit autoSubmit, PendingAction pendingAction, boolean z10, boolean z11, Map map, UiComponent uiComponent, String str3, boolean z12, int i10, String str4, int i11, int i12, Object obj) {
            int i13;
            String str5;
            List list3 = (i12 & 1) != 0 ? displaying.components : list;
            String str6 = (i12 & 2) != 0 ? displaying.stepName : str;
            List list4 = (i12 & 4) != 0 ? displaying.componentErrors : list2;
            StepStyles.UiStepStyle uiStepStyle2 = (i12 & 8) != 0 ? displaying.styles : uiStepStyle;
            String str7 = (i12 & 16) != 0 ? displaying.error : str2;
            NfcScan nfcScan2 = (i12 & 32) != 0 ? displaying.nfcScan : nfcScan;
            JpMyNumberNfcScan jpMyNumberNfcScan2 = (i12 & 64) != 0 ? displaying.jpMyNumberNfcScan : jpMyNumberNfcScan;
            AutoSubmit autoSubmit2 = (i12 & 128) != 0 ? displaying.autoSubmit : autoSubmit;
            PendingAction pendingAction2 = (i12 & Barcode.FORMAT_QR_CODE) != 0 ? displaying.pendingAction : pendingAction;
            boolean z13 = (i12 & Barcode.FORMAT_UPC_A) != 0 ? displaying.hasRequestedGpsPermissions : z10;
            boolean z14 = (i12 & Barcode.FORMAT_UPC_E) != 0 ? displaying.isRequestingGpsPermissions : z11;
            Map map2 = (i12 & Barcode.FORMAT_PDF417) != 0 ? displaying.componentParams : map;
            UiComponent uiComponent2 = (i12 & Barcode.FORMAT_AZTEC) != 0 ? displaying.triggeringComponent : uiComponent;
            String str8 = (i12 & 8192) != 0 ? displaying.requestPermissionKey : str3;
            List list5 = list3;
            boolean z15 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? displaying.showHelpBottomSheet : z12;
            int i14 = (i12 & 32768) != 0 ? displaying.nfcScanAttemptCount : i10;
            String str9 = (i12 & 65536) != 0 ? displaying.filePickComponentName : str4;
            if ((i12 & 131072) != 0) {
                str5 = str9;
                i13 = displaying.filePickRequestId;
            } else {
                i13 = i11;
                str5 = str9;
            }
            return displaying.u(list5, str6, list4, uiStepStyle2, str7, nfcScan2, jpMyNumberNfcScan2, autoSubmit2, pendingAction2, z13, z14, map2, uiComponent2, str8, z15, i14, str5, i13);
        }

        @Nullable
        /* JADX INFO: renamed from: A, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final String getFilePickComponentName() {
            return this.filePickComponentName;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final int getFilePickRequestId() {
            return this.filePickRequestId;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final boolean getHasRequestedGpsPermissions() {
            return this.hasRequestedGpsPermissions;
        }

        @Nullable
        /* JADX INFO: renamed from: G, reason: from getter */
        public final JpMyNumberNfcScan getJpMyNumberNfcScan() {
            return this.jpMyNumberNfcScan;
        }

        @Nullable
        /* JADX INFO: renamed from: I, reason: from getter */
        public final NfcScan getNfcScan() {
            return this.nfcScan;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final int getNfcScanAttemptCount() {
            return this.nfcScanAttemptCount;
        }

        @Nullable
        /* JADX INFO: renamed from: K, reason: from getter */
        public final PendingAction getPendingAction() {
            return this.pendingAction;
        }

        @NotNull
        /* JADX INFO: renamed from: L, reason: from getter */
        public final String getRequestPermissionKey() {
            return this.requestPermissionKey;
        }

        /* JADX INFO: renamed from: N, reason: from getter */
        public final boolean getShowHelpBottomSheet() {
            return this.showHelpBottomSheet;
        }

        @NotNull
        /* JADX INFO: renamed from: O, reason: from getter */
        public final String getStepName() {
            return this.stepName;
        }

        @Nullable
        /* JADX INFO: renamed from: P, reason: from getter */
        public final UiComponent getTriggeringComponent() {
            return this.triggeringComponent;
        }

        /* JADX INFO: renamed from: Q, reason: from getter */
        public final boolean getIsRequestingGpsPermissions() {
            return this.isRequestingGpsPermissions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Displaying)) {
                return false;
            }
            Displaying displaying = (Displaying) other;
            return Intrinsics.c(this.components, displaying.components) && Intrinsics.c(this.stepName, displaying.stepName) && Intrinsics.c(this.componentErrors, displaying.componentErrors) && Intrinsics.c(this.styles, displaying.styles) && Intrinsics.c(this.error, displaying.error) && Intrinsics.c(this.nfcScan, displaying.nfcScan) && Intrinsics.c(this.jpMyNumberNfcScan, displaying.jpMyNumberNfcScan) && Intrinsics.c(this.autoSubmit, displaying.autoSubmit) && Intrinsics.c(this.pendingAction, displaying.pendingAction) && this.hasRequestedGpsPermissions == displaying.hasRequestedGpsPermissions && this.isRequestingGpsPermissions == displaying.isRequestingGpsPermissions && Intrinsics.c(this.componentParams, displaying.componentParams) && Intrinsics.c(this.triggeringComponent, displaying.triggeringComponent) && Intrinsics.c(this.requestPermissionKey, displaying.requestPermissionKey) && this.showHelpBottomSheet == displaying.showHelpBottomSheet && this.nfcScanAttemptCount == displaying.nfcScanAttemptCount && Intrinsics.c(this.filePickComponentName, displaying.filePickComponentName) && this.filePickRequestId == displaying.filePickRequestId;
        }

        @NotNull
        public final List<UiComponent> getComponents() {
            return this.components;
        }

        @Nullable
        public final StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        public int hashCode() {
            int iHashCode = ((((this.components.hashCode() * 31) + this.stepName.hashCode()) * 31) + this.componentErrors.hashCode()) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int iHashCode2 = (iHashCode + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            String str = this.error;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            NfcScan nfcScan = this.nfcScan;
            int iHashCode4 = (iHashCode3 + (nfcScan == null ? 0 : nfcScan.hashCode())) * 31;
            JpMyNumberNfcScan jpMyNumberNfcScan = this.jpMyNumberNfcScan;
            int iHashCode5 = (iHashCode4 + (jpMyNumberNfcScan == null ? 0 : jpMyNumberNfcScan.hashCode())) * 31;
            AutoSubmit autoSubmit = this.autoSubmit;
            int iHashCode6 = (iHashCode5 + (autoSubmit == null ? 0 : autoSubmit.hashCode())) * 31;
            PendingAction pendingAction = this.pendingAction;
            int iHashCode7 = (((((iHashCode6 + (pendingAction == null ? 0 : pendingAction.hashCode())) * 31) + Boolean.hashCode(this.hasRequestedGpsPermissions)) * 31) + Boolean.hashCode(this.isRequestingGpsPermissions)) * 31;
            Map<String, ComponentParam> map = this.componentParams;
            int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
            UiComponent uiComponent = this.triggeringComponent;
            int iHashCode9 = (((((((iHashCode8 + (uiComponent == null ? 0 : uiComponent.hashCode())) * 31) + this.requestPermissionKey.hashCode()) * 31) + Boolean.hashCode(this.showHelpBottomSheet)) * 31) + Integer.hashCode(this.nfcScanAttemptCount)) * 31;
            String str2 = this.filePickComponentName;
            return ((iHashCode9 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.filePickRequestId);
        }

        @NotNull
        public String toString() {
            return "Displaying(components=" + this.components + ", stepName=" + this.stepName + ", componentErrors=" + this.componentErrors + ", styles=" + this.styles + ", error=" + this.error + ", nfcScan=" + this.nfcScan + ", jpMyNumberNfcScan=" + this.jpMyNumberNfcScan + ", autoSubmit=" + this.autoSubmit + ", pendingAction=" + this.pendingAction + ", hasRequestedGpsPermissions=" + this.hasRequestedGpsPermissions + ", isRequestingGpsPermissions=" + this.isRequestingGpsPermissions + ", componentParams=" + this.componentParams + ", triggeringComponent=" + this.triggeringComponent + ", requestPermissionKey=" + this.requestPermissionKey + ", showHelpBottomSheet=" + this.showHelpBottomSheet + ", nfcScanAttemptCount=" + this.nfcScanAttemptCount + ", filePickComponentName=" + this.filePickComponentName + ", filePickRequestId=" + this.filePickRequestId + ")";
        }

        @NotNull
        public final Displaying u(@NotNull List<? extends UiComponent> components, @NotNull String stepName, @NotNull List<UiComponentErrorInfo> componentErrors, @Nullable StepStyles.UiStepStyle styles, @Nullable String error, @Nullable NfcScan nfcScan, @Nullable JpMyNumberNfcScan jpMyNumberNfcScan, @Nullable AutoSubmit autoSubmit, @Nullable PendingAction pendingAction, boolean hasRequestedGpsPermissions, boolean isRequestingGpsPermissions, @Nullable Map<String, ? extends ComponentParam> componentParams, @Nullable UiComponent triggeringComponent, @NotNull String requestPermissionKey, boolean showHelpBottomSheet, int nfcScanAttemptCount, @Nullable String filePickComponentName, int filePickRequestId) {
            Intrinsics.checkNotNullParameter(components, "components");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(componentErrors, "componentErrors");
            Intrinsics.checkNotNullParameter(requestPermissionKey, "requestPermissionKey");
            return new Displaying(components, stepName, componentErrors, styles, error, nfcScan, jpMyNumberNfcScan, autoSubmit, pendingAction, hasRequestedGpsPermissions, isRequestingGpsPermissions, componentParams, triggeringComponent, requestPermissionKey, showHelpBottomSheet, nfcScanAttemptCount, filePickComponentName, filePickRequestId);
        }

        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public final AutoSubmit getAutoSubmit() {
            return this.autoSubmit;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<UiComponent> list = this.components;
            dest.writeInt(list.size());
            Iterator<UiComponent> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.stepName);
            List<UiComponentErrorInfo> list2 = this.componentErrors;
            dest.writeInt(list2.size());
            Iterator<UiComponentErrorInfo> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.styles, flags);
            dest.writeString(this.error);
            NfcScan nfcScan = this.nfcScan;
            if (nfcScan == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                nfcScan.writeToParcel(dest, flags);
            }
            JpMyNumberNfcScan jpMyNumberNfcScan = this.jpMyNumberNfcScan;
            if (jpMyNumberNfcScan == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jpMyNumberNfcScan.writeToParcel(dest, flags);
            }
            AutoSubmit autoSubmit = this.autoSubmit;
            if (autoSubmit == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                autoSubmit.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.pendingAction, flags);
            dest.writeInt(this.hasRequestedGpsPermissions ? 1 : 0);
            dest.writeInt(this.isRequestingGpsPermissions ? 1 : 0);
            Map<String, ComponentParam> map = this.componentParams;
            if (map == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<String, ComponentParam> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeParcelable(entry.getValue(), flags);
                }
            }
            dest.writeParcelable(this.triggeringComponent, flags);
            dest.writeString(this.requestPermissionKey);
            dest.writeInt(this.showHelpBottomSheet ? 1 : 0);
            dest.writeInt(this.nfcScanAttemptCount);
            dest.writeString(this.filePickComponentName);
            dest.writeInt(this.filePickRequestId);
        }

        @NotNull
        public final List<UiComponentErrorInfo> x() {
            return this.componentErrors;
        }

        @Nullable
        public final Map<String, ComponentParam> z() {
            return this.componentParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Displaying(@NotNull List<? extends UiComponent> components, @NotNull String stepName, @NotNull List<UiComponentErrorInfo> componentErrors, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable String str, @Nullable NfcScan nfcScan, @Nullable JpMyNumberNfcScan jpMyNumberNfcScan, @Nullable AutoSubmit autoSubmit, @Nullable PendingAction pendingAction, boolean z10, boolean z11, @Nullable Map<String, ? extends ComponentParam> map, @Nullable UiComponent uiComponent, @NotNull String requestPermissionKey, boolean z12, int i10, @Nullable String str2, int i11) {
            super(null);
            Intrinsics.checkNotNullParameter(components, "components");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(componentErrors, "componentErrors");
            Intrinsics.checkNotNullParameter(requestPermissionKey, "requestPermissionKey");
            this.components = components;
            this.stepName = stepName;
            this.componentErrors = componentErrors;
            this.styles = uiStepStyle;
            this.error = str;
            this.nfcScan = nfcScan;
            this.jpMyNumberNfcScan = jpMyNumberNfcScan;
            this.autoSubmit = autoSubmit;
            this.pendingAction = pendingAction;
            this.hasRequestedGpsPermissions = z10;
            this.isRequestingGpsPermissions = z11;
            this.componentParams = map;
            this.triggeringComponent = uiComponent;
            this.requestPermissionKey = requestPermissionKey;
            this.showHelpBottomSheet = z12;
            this.nfcScanAttemptCount = i10;
            this.filePickComponentName = str2;
            this.filePickRequestId = i11;
        }
    }
}
