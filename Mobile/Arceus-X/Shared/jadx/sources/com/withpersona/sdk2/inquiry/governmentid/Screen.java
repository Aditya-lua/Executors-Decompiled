package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.RemoteImageComponent;
import hn.C6434c;
import io.EnumC6852d;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mn.EnumC8598a;
import mo.InterfaceC8607i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p239k6.InterfaceC7479s;
import p361po.EnumC10302b;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p476ur.InterfaceC11932a;
import p526wq.EnumC12529l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u000e\u0004\u000f\u0010\u0011\u0012\u0007\u0013\u0014\u0015\u0016J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\n\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "", "other", "", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen;)Z", "Lwq/l;", "a", "()Lwq/l;", "transition", "", "getName", "()Ljava/lang/String;", "name", "e", "Overlay", "h", "j", "f", "c", "i", "d", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface Screen {

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "Landroid/os/Parcelable;", "<init>", "()V", "Rectangle", "Passport", "Barcode", "CornersOnly", "GenericFront", "Custom", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Barcode;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$CornersOnly;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Custom;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$GenericFront;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Passport;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Rectangle;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class Overlay implements Parcelable {

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Barcode;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Barcode extends Overlay {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final Barcode f13846a = new Barcode();

            @NotNull
            public static final Parcelable.Creator<Barcode> CREATOR = new C3520a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$Barcode$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3520a implements Parcelable.Creator<Barcode> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Barcode createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Barcode.f13846a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Barcode[] newArray(int i10) {
                    return new Barcode[i10];
                }
            }

            public Barcode() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Barcode);
            }

            public int hashCode() {
                return 1779545178;
            }

            @NotNull
            public String toString() {
                return "Barcode";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$CornersOnly;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class CornersOnly extends Overlay {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final CornersOnly f13847a = new CornersOnly();

            @NotNull
            public static final Parcelable.Creator<CornersOnly> CREATOR = new C3521a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$CornersOnly$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3521a implements Parcelable.Creator<CornersOnly> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CornersOnly createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CornersOnly.f13847a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CornersOnly[] newArray(int i10) {
                    return new CornersOnly[i10];
                }
            }

            public CornersOnly() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof CornersOnly);
            }

            public int hashCode() {
                return 1450323044;
            }

            @NotNull
            public String toString() {
                return "CornersOnly";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Custom;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "customImage", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "config", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "f", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Custom extends Overlay {

            @NotNull
            public static final Parcelable.Creator<Custom> CREATOR = new C3522a();

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final RemoteImageComponent customImage;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final RemoteImage config;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$Custom$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3522a implements Parcelable.Creator<Custom> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Custom createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Custom((RemoteImageComponent) parcel.readParcelable(Custom.class.getClassLoader()), (RemoteImage) parcel.readParcelable(Custom.class.getClassLoader()));
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Custom[] newArray(int i10) {
                    return new Custom[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Custom(@NotNull RemoteImageComponent customImage, @NotNull RemoteImage config) {
                super(null);
                Intrinsics.checkNotNullParameter(customImage, "customImage");
                Intrinsics.checkNotNullParameter(config, "config");
                this.customImage = customImage;
                this.config = config;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final RemoteImage getConfig() {
                return this.config;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @NotNull
            /* JADX INFO: renamed from: f, reason: from getter */
            public final RemoteImageComponent getCustomImage() {
                return this.customImage;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.customImage, flags);
                dest.writeParcelable(this.config, flags);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Custom(@NotNull RemoteImage config) {
                this(new RemoteImageComponent(config), config);
                Intrinsics.checkNotNullParameter(config, "config");
            }
        }

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$GenericFront;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class GenericFront extends Overlay {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final GenericFront f13850a = new GenericFront();

            @NotNull
            public static final Parcelable.Creator<GenericFront> CREATOR = new C3523a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$GenericFront$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3523a implements Parcelable.Creator<GenericFront> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final GenericFront createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return GenericFront.f13850a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final GenericFront[] newArray(int i10) {
                    return new GenericFront[i10];
                }
            }

            public GenericFront() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof GenericFront);
            }

            public int hashCode() {
                return 212467448;
            }

            @NotNull
            public String toString() {
                return "GenericFront";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Passport;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Passport extends Overlay {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final Passport f13851a = new Passport();

            @NotNull
            public static final Parcelable.Creator<Passport> CREATOR = new C3524a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$Passport$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3524a implements Parcelable.Creator<Passport> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Passport createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Passport.f13851a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Passport[] newArray(int i10) {
                    return new Passport[i10];
                }
            }

            public Passport() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Passport);
            }

            public int hashCode() {
                return -1995687048;
            }

            @NotNull
            public String toString() {
                return "Passport";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Rectangle;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Rectangle extends Overlay {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final Rectangle f13852a = new Rectangle();

            @NotNull
            public static final Parcelable.Creator<Rectangle> CREATOR = new C3525a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$Rectangle$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3525a implements Parcelable.Creator<Rectangle> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Rectangle createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Rectangle.f13852a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Rectangle[] newArray(int i10) {
                    return new Rectangle[i10];
                }
            }

            public Rectangle() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Rectangle);
            }

            public int hashCode() {
                return 319154889;
            }

            @NotNull
            public String toString() {
                return "Rectangle";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.governmentid.Screen.Overlay.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Overlay(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Overlay() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$b */
    @Metadata(m31664d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b]\u0018\u00002\u00020\u0001:\u0001MB\u0093\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012 \b\u0002\u0010\u0016\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0012\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012 \b\u0002\u0010$\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0012\u0012\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150%\u0012\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150%j\u0002`(\u0012\u0006\u0010*\u001a\u00020 \u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017\u0012\b\b\u0002\u0010.\u001a\u00020-\u0012\b\b\u0002\u0010/\u001a\u00020\u001a\u0012\u001a\b\u0002\u00101\u001a\u0014\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0012\u0012\b\b\u0002\u00102\u001a\u00020\u001a\u0012\b\b\u0002\u00104\u001a\u000203\u0012\b\b\u0002\u00105\u001a\u00020\u001a\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\u0006\u0010>\u001a\u00020\u001a\u0012\u0006\u0010?\u001a\u00020\u001a\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010F\u001a\u00020\u001a\u0012\b\b\u0002\u0010G\u001a\u00020\u001a\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bR\u0010PR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010PR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010N\u001a\u0004\bV\u0010PR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010N\u001a\u0004\bX\u0010PR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR/\u0010\u0016\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00128\u0006¢\u0006\f\n\u0004\b[\u0010m\u001a\u0004\bn\u0010oR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178\u0006¢\u0006\f\n\u0004\bg\u0010p\u001a\u0004\bq\u0010rR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178\u0006¢\u0006\f\n\u0004\bs\u0010p\u001a\u0004\ba\u0010rR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\b]\u0010vR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00138\u0006¢\u0006\f\n\u0004\bq\u0010w\u001a\u0004\bW\u0010xR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bR\u0010y\u001a\u0004\bz\u0010{R\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\bY\u0010~R\u001b\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\u000e\n\u0004\bX\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R0\u0010$\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00128\u0006¢\u0006\r\n\u0005\b\u0082\u0001\u0010m\u001a\u0004\bU\u0010oR'\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150%8\u0006¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R+\u0010)\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150%j\u0002`(8\u0006¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0084\u0001\u001a\u0006\b\u0088\u0001\u0010\u0086\u0001R\u0018\u0010*\u001a\u00020 8\u0006¢\u0006\r\n\u0005\b\u0089\u0001\u0010}\u001a\u0004\b}\u0010~R\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178\u0006¢\u0006\r\n\u0004\bc\u0010p\u001a\u0005\b\u008a\u0001\u0010rR\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178\u0006¢\u0006\r\n\u0005\b\u008a\u0001\u0010p\u001a\u0004\bt\u0010rR\u001a\u0010.\u001a\u00020-8\u0006¢\u0006\u000f\n\u0005\bn\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010/\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010u\u001a\u0005\b\u0083\u0001\u0010vR*\u00101\u001a\u0014\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00128\u0006¢\u0006\r\n\u0004\bT\u0010m\u001a\u0005\b\u008f\u0001\u0010oR\u0019\u00102\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010u\u001a\u0005\b\u0082\u0001\u0010vR\u0019\u00104\u001a\u0002038\u0006¢\u0006\u000e\n\u0004\bk\u0010V\u001a\u0006\b\u008e\u0001\u0010\u0091\u0001R\u0019\u00105\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010u\u001a\u0005\b\u0092\u0001\u0010vR\u001b\u00106\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010N\u001a\u0005\b\u0087\u0001\u0010PR\u001b\u00107\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010N\u001a\u0005\b\u0090\u0001\u0010PR\u001b\u00109\u001a\u0004\u0018\u0001088\u0006¢\u0006\u000e\n\u0005\b_\u0010\u0093\u0001\u001a\u0005\bs\u0010\u0094\u0001R\u001d\u0010;\u001a\u0004\u0018\u00010:8\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001b\u0010=\u001a\u0004\u0018\u00010<8\u0006¢\u0006\u000e\n\u0005\b}\u0010\u0099\u0001\u001a\u0005\bS\u0010\u009a\u0001R\u0018\u0010>\u001a\u00020\u001a8\u0006¢\u0006\r\n\u0004\bV\u0010u\u001a\u0005\b\u009b\u0001\u0010vR\u0019\u0010?\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010u\u001a\u0005\b\u009c\u0001\u0010vR\u0019\u0010A\u001a\u00020@8\u0006¢\u0006\u000e\n\u0005\bz\u0010\u009d\u0001\u001a\u0005\bi\u0010\u009e\u0001R\u001a\u0010C\u001a\u00020B8\u0006¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u009f\u0001\u001a\u0005\be\u0010 \u0001R\u0019\u0010E\u001a\u00020D8\u0006¢\u0006\u000e\n\u0005\bO\u0010¡\u0001\u001a\u0005\b|\u0010¢\u0001R\u0019\u0010F\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010u\u001a\u0005\b\u0095\u0001\u0010vR\u0019\u0010G\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010u\u001a\u0005\b\u0089\u0001\u0010vR\u001b\u0010H\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010N\u001a\u0005\b£\u0001\u0010PR\u001d\u0010J\u001a\u00020I8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u009c\u0001\u0010¤\u0001\u001a\u0005\bM\u0010¥\u0001¨\u0006¦\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "", Title.type, "description", "message", "scanInstructions", "disclaimer", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "captureButtonState", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlay", "Lpo/b;", "idClass", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "captureSide", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function2;", "", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "manuallyCapture", "Lkotlin/Function0;", "close", "back", "", "autoCapturing", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "autoCaptureRules", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "state", "", "autoCaptureRulesId", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "autoCapture", "Lkotlin/Function1;", "", "onCaptureError", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "onCameraError", "remainingCaptureCount", "manualCaptureClicked", "checkPermissions", "Lmn/a;", "videoCaptureMethod", "finalizeLocalVideo", "Ljava/io/File;", "onLocalVideoFinalized", "enableAnalyzer", "", "maxRecordingLengthMs", "showFinalizeUi", "hintText", "navBarTitle", "Lmo/i;", "captureTips", "Lur/a;", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "isEnabled", "isAudioRequired", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Lio/d;", "designVersion", "playSideTransition", "holographicTorchEnabled", "watermarkText", "Lwq/l;", "transition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lpo/b;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lmn/a;ZLkotlin/jvm/functions/Function2;ZJZLjava/lang/String;Ljava/lang/String;Lmo/i;Lur/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Lio/d;ZZLjava/lang/String;Lwq/l;)V", "a", "Ljava/lang/String;", "N", "()Ljava/lang/String;", "b", "p", "c", "A", "d", "J", "e", "r", "f", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "k", "()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "G", "()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "h", "Lpo/b;", "w", "()Lpo/b;", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "l", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "j", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "C", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lkotlin/jvm/functions/Function2;", "y", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "o", "()Lkotlin/jvm/functions/Function0;", "m", "n", "Z", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "L", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "q", "I", "()I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "M", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "s", "t", "Lkotlin/jvm/functions/Function1;", "E", "()Lkotlin/jvm/functions/Function1;", "u", "D", "v", "x", "Lmn/a;", "O", "()Lmn/a;", "z", "F", "B", "()J", "K", "Lmo/i;", "()Lmo/i;", "H", "Lur/a;", "Q", "()Lur/a;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "S", "R", "Lcom/withpersona/sdk2/camera/e$a;", "()Lcom/withpersona/sdk2/camera/e$a;", "Lhn/c$a;", "()Lhn/c$a;", "Lio/d;", "()Lio/d;", "P", "Lwq/l;", "()Lwq/l;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3527b implements Screen {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        @NotNull
        public final Function2<File, CameraProperties, Unit> onLocalVideoFinalized;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        public final boolean enableAnalyzer;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        public final long maxRecordingLengthMs;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        public final boolean showFinalizeUi;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        @Nullable
        public final String hintText;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        @Nullable
        public final InterfaceC8607i captureTips;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        @Nullable
        public final InterfaceC11932a webRtcManager;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        @Nullable
        public final NextStep.GovernmentId.AssetConfig.CapturePage assetConfig;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        public final boolean isEnabled;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        public final boolean isAudioRequired;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        @NotNull
        public final C3405e.a cameraXControllerFactory;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata */
        @NotNull
        public final C6434c.a camera2ControllerFactory;

        /* JADX INFO: renamed from: N, reason: from kotlin metadata */
        @NotNull
        public final EnumC6852d designVersion;

        /* JADX INFO: renamed from: O, reason: from kotlin metadata */
        public final boolean playSideTransition;

        /* JADX INFO: renamed from: P, reason: from kotlin metadata */
        public final boolean holographicTorchEnabled;

        /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
        @Nullable
        public final String watermarkText;

        /* JADX INFO: renamed from: R, reason: from kotlin metadata */
        @NotNull
        public final EnumC12529l transition;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final String scanInstructions;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final String disclaimer;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final a captureButtonState;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final Overlay overlay;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public final EnumC10302b idClass;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final IdConfig.EnumC3514b captureSide;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public final NavigationState navigationState;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final Function2<List<String>, CameraProperties, Unit> manuallyCapture;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> close;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> back;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        public final boolean autoCapturing;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @NotNull
        public final List<AutoCaptureRule> autoCaptureRules;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @NotNull
        public final GovernmentIdState state;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        public final int autoCaptureRulesId;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @NotNull
        public final Function2<List<String>, CameraProperties, Unit> autoCapture;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @NotNull
        public final Function1<Throwable, Unit> onCaptureError;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @NotNull
        public final Function1<Throwable, Unit> onCameraError;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        public final int remainingCaptureCount;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> manualCaptureClicked;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> checkPermissions;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        @NotNull
        public final EnumC8598a videoCaptureMethod;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        public final boolean finalizeLocalVideo;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$b$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public enum a {
            Disabled,
            Enabled,
            Hidden;


            /* JADX INFO: renamed from: e */
            public static final /* synthetic */ InterfaceC10707a f13924e = C10708b.m40805a(m17397a());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r27v0, resolved type: kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r31v0, resolved type: java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule> */
        /* JADX DEBUG: Multi-variable search result rejected for r35v0, resolved type: kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r36v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r37v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r43v0, resolved type: kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public C3527b(@NotNull String title, @NotNull String description, @NotNull String message, @NotNull String scanInstructions, @NotNull String disclaimer, @NotNull a captureButtonState, @NotNull Overlay overlay, @NotNull EnumC10302b idClass, @NotNull IdConfig.EnumC3514b captureSide, @NotNull NavigationState navigationState, @NotNull Function2<? super List<String>, ? super CameraProperties, Unit> manuallyCapture, @NotNull Function0<Unit> close, @NotNull Function0<Unit> back, boolean z10, @NotNull List<? extends AutoCaptureRule> autoCaptureRules, @NotNull GovernmentIdState state, int i10, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull Function2<? super List<String>, ? super CameraProperties, Unit> autoCapture, @NotNull Function1<? super Throwable, Unit> onCaptureError, @NotNull Function1<? super Throwable, Unit> onCameraError, int i11, @NotNull Function0<Unit> manualCaptureClicked, @NotNull Function0<Unit> checkPermissions, @NotNull EnumC8598a videoCaptureMethod, boolean z11, @NotNull Function2<? super File, ? super CameraProperties, Unit> onLocalVideoFinalized, boolean z12, long j10, boolean z13, @Nullable String str, @Nullable String str2, @Nullable InterfaceC8607i interfaceC8607i, @Nullable InterfaceC11932a interfaceC11932a, @Nullable NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z14, boolean z15, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, @NotNull EnumC6852d designVersion, boolean z16, boolean z17, @Nullable String str3, @NotNull EnumC12529l transition) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(scanInstructions, "scanInstructions");
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(captureButtonState, "captureButtonState");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            Intrinsics.checkNotNullParameter(idClass, "idClass");
            Intrinsics.checkNotNullParameter(captureSide, "captureSide");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(manuallyCapture, "manuallyCapture");
            Intrinsics.checkNotNullParameter(close, "close");
            Intrinsics.checkNotNullParameter(back, "back");
            Intrinsics.checkNotNullParameter(autoCaptureRules, "autoCaptureRules");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(autoCapture, "autoCapture");
            Intrinsics.checkNotNullParameter(onCaptureError, "onCaptureError");
            Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
            Intrinsics.checkNotNullParameter(manualCaptureClicked, "manualCaptureClicked");
            Intrinsics.checkNotNullParameter(checkPermissions, "checkPermissions");
            Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
            Intrinsics.checkNotNullParameter(onLocalVideoFinalized, "onLocalVideoFinalized");
            Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
            Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.title = title;
            this.description = description;
            this.message = message;
            this.scanInstructions = scanInstructions;
            this.disclaimer = disclaimer;
            this.captureButtonState = captureButtonState;
            this.overlay = overlay;
            this.idClass = idClass;
            this.captureSide = captureSide;
            this.navigationState = navigationState;
            this.manuallyCapture = manuallyCapture;
            this.close = close;
            this.back = back;
            this.autoCapturing = z10;
            this.autoCaptureRules = autoCaptureRules;
            this.state = state;
            this.autoCaptureRulesId = i10;
            this.styles = governmentIdStepStyle;
            this.autoCapture = autoCapture;
            this.onCaptureError = onCaptureError;
            this.onCameraError = onCameraError;
            this.remainingCaptureCount = i11;
            this.manualCaptureClicked = manualCaptureClicked;
            this.checkPermissions = checkPermissions;
            this.videoCaptureMethod = videoCaptureMethod;
            this.finalizeLocalVideo = z11;
            this.onLocalVideoFinalized = onLocalVideoFinalized;
            this.enableAnalyzer = z12;
            this.maxRecordingLengthMs = j10;
            this.showFinalizeUi = z13;
            this.hintText = str;
            this.navBarTitle = str2;
            this.captureTips = interfaceC8607i;
            this.webRtcManager = interfaceC11932a;
            this.assetConfig = capturePage;
            this.isEnabled = z14;
            this.isAudioRequired = z15;
            this.cameraXControllerFactory = cameraXControllerFactory;
            this.camera2ControllerFactory = camera2ControllerFactory;
            this.designVersion = designVersion;
            this.playSideTransition = z16;
            this.holographicTorchEnabled = z17;
            this.watermarkText = str3;
            this.transition = transition;
        }

        @NotNull
        /* JADX INFO: renamed from: A, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: C, reason: from getter */
        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        /* JADX INFO: renamed from: D */
        public final Function1<Throwable, Unit> m17357D() {
            return this.onCameraError;
        }

        @NotNull
        /* JADX INFO: renamed from: E */
        public final Function1<Throwable, Unit> m17358E() {
            return this.onCaptureError;
        }

        @NotNull
        /* JADX INFO: renamed from: F */
        public final Function2<File, CameraProperties, Unit> m17359F() {
            return this.onLocalVideoFinalized;
        }

        @NotNull
        /* JADX INFO: renamed from: G, reason: from getter */
        public final Overlay getOverlay() {
            return this.overlay;
        }

        /* JADX INFO: renamed from: H, reason: from getter */
        public final boolean getPlaySideTransition() {
            return this.playSideTransition;
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final int getRemainingCaptureCount() {
            return this.remainingCaptureCount;
        }

        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public final String getScanInstructions() {
            return this.scanInstructions;
        }

        /* JADX INFO: renamed from: K, reason: from getter */
        public final boolean getShowFinalizeUi() {
            return this.showFinalizeUi;
        }

        @NotNull
        /* JADX INFO: renamed from: L, reason: from getter */
        public final GovernmentIdState getState() {
            return this.state;
        }

        @Nullable
        /* JADX INFO: renamed from: M, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: N, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: O, reason: from getter */
        public final EnumC8598a getVideoCaptureMethod() {
            return this.videoCaptureMethod;
        }

        @Nullable
        /* JADX INFO: renamed from: P, reason: from getter */
        public final String getWatermarkText() {
            return this.watermarkText;
        }

        @Nullable
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final InterfaceC11932a getWebRtcManager() {
            return this.webRtcManager;
        }

        /* JADX INFO: renamed from: R, reason: from getter */
        public final boolean getIsAudioRequired() {
            return this.isAudioRequired;
        }

        /* JADX INFO: renamed from: S, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public EnumC12529l getTransition() {
            return this.transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        /* JADX INFO: renamed from: b */
        public boolean mo17319b(@Nullable Screen screen) {
            return super.mo17319b(screen);
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig.CapturePage getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Function2<List<String>, CameraProperties, Unit> m17374d() {
            return this.autoCapture;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final List<AutoCaptureRule> m17375e() {
            return this.autoCaptureRules;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getAutoCaptureRulesId() {
            return this.autoCaptureRulesId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getAutoCapturing() {
            return this.autoCapturing;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final Function0<Unit> m17378h() {
            return this.back;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final C6434c.a getCamera2ControllerFactory() {
            return this.camera2ControllerFactory;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final C3405e.a getCameraXControllerFactory() {
            return this.cameraXControllerFactory;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final a getCaptureButtonState() {
            return this.captureButtonState;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final IdConfig.EnumC3514b getCaptureSide() {
            return this.captureSide;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final InterfaceC8607i getCaptureTips() {
            return this.captureTips;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public final Function0<Unit> m17384n() {
            return this.checkPermissions;
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final Function0<Unit> m17385o() {
            return this.close;
        }

        @NotNull
        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final EnumC6852d getDesignVersion() {
            return this.designVersion;
        }

        @NotNull
        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getEnableAnalyzer() {
            return this.enableAnalyzer;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getFinalizeLocalVideo() {
            return this.finalizeLocalVideo;
        }

        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public final String getHintText() {
            return this.hintText;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final boolean getHolographicTorchEnabled() {
            return this.holographicTorchEnabled;
        }

        @NotNull
        /* JADX INFO: renamed from: w, reason: from getter */
        public final EnumC10302b getIdClass() {
            return this.idClass;
        }

        @NotNull
        /* JADX INFO: renamed from: x */
        public final Function0<Unit> m17394x() {
            return this.manualCaptureClicked;
        }

        @NotNull
        /* JADX INFO: renamed from: y */
        public final Function2<List<String>, CameraProperties, Unit> m17395y() {
            return this.manuallyCapture;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final long getMaxRecordingLengthMs() {
            return this.maxRecordingLengthMs;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$g */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Lwq/l;", "transition", "<init>", "(Lwq/l;)V", "a", "Lwq/l;", "()Lwq/l;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3532g implements Screen {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final EnumC12529l transition;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        public C3532g() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public EnumC12529l getTransition() {
            return this.transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        /* JADX INFO: renamed from: b */
        public boolean mo17319b(@Nullable Screen screen) {
            return super.mo17319b(screen);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C3532g(@NotNull EnumC12529l transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.transition = transition;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
          (wrap wq.l:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap wq.l:0x0004: SGET  A[WRAPPED] (LINE:4) wq.l.c wq.l) : (r1v0 wq.l))
         A[MD:(wq.l):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.governmentid.Screen.g.<init>(wq.l):void type: THIS */
        public /* synthetic */ C3532g(EnumC12529l enumC12529l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? EnumC12529l.NONE : enumC12529l);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    EnumC12529l getTransition();

    /* JADX INFO: renamed from: b */
    default boolean mo17319b(@Nullable Screen other) {
        if (other == null) {
            return false;
        }
        if (Intrinsics.m31980c(getClass(), other.getClass())) {
            return true;
        }
        if (getName() == null || other.getName() == null) {
            return false;
        }
        return Intrinsics.m31980c(getName(), other.getName());
    }

    default String getName() {
        if ((this instanceof C3527b) || (this instanceof C3533h)) {
            return "camera_screen";
        }
        if ((this instanceof C3526a) || (this instanceof C3528c) || (this instanceof C3529d) || (this instanceof C3530e) || (this instanceof C3534i) || (this instanceof C3535j) || (this instanceof C3532g) || (this instanceof C3531f)) {
            return null;
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$f */
    @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001c\u0010%R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b\u0014\u0010*¨\u0006+"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lkotlin/Function0;", "", "onBack", "onCancel", "", "navBarTitle", "", "isFinalizingVideoCapture", "Lwq/l;", "transition", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLwq/l;)V", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "h", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "b", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "d", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "g", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lkotlin/jvm/functions/Function0;", "e", "()Lkotlin/jvm/functions/Function0;", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "Z", "i", "()Z", "Lwq/l;", "()Lwq/l;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3531f implements Screen {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final UiComponentScreen uiScreen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final NavigationState navigationState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBack;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCancel;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final boolean isFinalizingVideoCapture;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public final EnumC12529l transition;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C3531f(@NotNull UiComponentScreen uiScreen, @NotNull NavigationState navigationState, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str, boolean z10, @NotNull EnumC12529l transition) {
            Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(onBack, "onBack");
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.uiScreen = uiScreen;
            this.navigationState = navigationState;
            this.styles = governmentIdStepStyle;
            this.onBack = onBack;
            this.onCancel = onCancel;
            this.navBarTitle = str;
            this.isFinalizingVideoCapture = z10;
            this.transition = transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public EnumC12529l getTransition() {
            return this.transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        /* JADX INFO: renamed from: b */
        public boolean mo17319b(@Nullable Screen screen) {
            return super.mo17319b(screen);
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Function0<Unit> m17441e() {
            return this.onBack;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final Function0<Unit> m17442f() {
            return this.onCancel;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final UiComponentScreen getUiScreen() {
            return this.uiScreen;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsFinalizingVideoCapture() {
            return this.isFinalizingVideoCapture;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
          (r12v0 com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen)
          (r13v0 com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
          (r14v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle)
          (r15v0 kotlin.jvm.functions.Function0)
          (r16v0 kotlin.jvm.functions.Function0)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
          (wrap boolean:?: TERNARY null = ((wrap int:0x000b: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
          (wrap wq.l:?: TERNARY null = ((wrap int:0x0014: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x001a: SGET  A[WRAPPED] (LINE:10) wq.l.a wq.l) : (r19v0 wq.l))
         A[MD:(com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String, boolean, wq.l):void (m)] (LINE:11) call: com.withpersona.sdk2.inquiry.governmentid.Screen.f.<init>(com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, boolean, wq.l):void type: THIS */
        public /* synthetic */ C3531f(UiComponentScreen uiComponentScreen, NavigationState navigationState, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, Function0 function0, Function0 function1, String str, boolean z10, EnumC12529l enumC12529l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiComponentScreen, navigationState, governmentIdStepStyle, function0, function1, (i10 & 32) != 0 ? null : str, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? EnumC12529l.SLIDE_IN : enumC12529l);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$d */
    @Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\b\u0015\u0010+¨\u0006,"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "", "titleText", "continueButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onContinueClick", "onBackClick", "onCancelClick", "", "videoCaptureEnabled", "navBarTitle", "Lwq/l;", "transition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Lwq/l;)V", "a", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "b", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "d", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "e", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lkotlin/jvm/functions/Function0;", "h", "()Lkotlin/jvm/functions/Function0;", "f", "g", "Z", "k", "()Z", "Lwq/l;", "()Lwq/l;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3529d implements Screen {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final String titleText;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String continueButtonText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final NavigationState navigationState;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onContinueClick;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBackClick;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCancelClick;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public final boolean videoCaptureEnabled;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public final EnumC12529l transition;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C3529d(@Nullable String str, @Nullable String str2, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onContinueClick, @NotNull Function0<Unit> onBackClick, @NotNull Function0<Unit> onCancelClick, boolean z10, @Nullable String str3, @NotNull EnumC12529l transition) {
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
            Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
            Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.titleText = str;
            this.continueButtonText = str2;
            this.styles = governmentIdStepStyle;
            this.navigationState = navigationState;
            this.onContinueClick = onContinueClick;
            this.onBackClick = onBackClick;
            this.onCancelClick = onCancelClick;
            this.videoCaptureEnabled = z10;
            this.navBarTitle = str3;
            this.transition = transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public EnumC12529l getTransition() {
            return this.transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        /* JADX INFO: renamed from: b */
        public boolean mo17319b(@Nullable Screen screen) {
            return super.mo17319b(screen);
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getContinueButtonText() {
            return this.continueButtonText;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final Function0<Unit> m17417f() {
            return this.onBackClick;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final Function0<Unit> m17418g() {
            return this.onCancelClick;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final Function0<Unit> m17419h() {
            return this.onContinueClick;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getTitleText() {
            return this.titleText;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getVideoCaptureEnabled() {
            return this.videoCaptureEnabled;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
          (r14v0 java.lang.String)
          (r15v0 java.lang.String)
          (r16v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle)
          (r17v0 com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
          (r18v0 kotlin.jvm.functions.Function0)
          (r19v0 kotlin.jvm.functions.Function0)
          (r20v0 kotlin.jvm.functions.Function0)
          (wrap boolean:?: TERNARY null = ((wrap int:0x0002: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
          (wrap wq.l:?: TERNARY null = ((wrap int:0x0014: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x001a: SGET  A[WRAPPED] (LINE:12) wq.l.a wq.l) : (r23v0 wq.l))
         A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.lang.String, wq.l):void (m)] (LINE:13) call: com.withpersona.sdk2.inquiry.governmentid.Screen.d.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.lang.String, wq.l):void type: THIS */
        public /* synthetic */ C3529d(String str, String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NavigationState navigationState, Function0 function0, Function0 function1, Function0 function2, boolean z10, String str3, EnumC12529l enumC12529l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, governmentIdStepStyle, navigationState, function0, function1, function2, (i10 & 128) != 0 ? false : z10, (i10 & 256) != 0 ? null : str3, (i10 & 512) != 0 ? EnumC12529l.SLIDE_IN : enumC12529l);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$j */
    @Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001e\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b$\u0010\u001bR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\b\u0018\u00103¨\u00064"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "", Title.type, "description", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "", "isFinalizingVideoCapture", "navBarTitle", "Lwq/l;", "transition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLjava/lang/String;Lwq/l;)V", "a", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "b", "d", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "j", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "e", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "f", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lkotlin/jvm/functions/Function0;", "g", "()Lkotlin/jvm/functions/Function0;", "h", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Z", "l", "()Z", "Lwq/l;", "()Lwq/l;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3535j implements Screen {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final NextStep.GovernmentId.AssetConfig.PendingPage assetConfig;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final NavigationState navigationState;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBack;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCancel;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public final boolean isFinalizingVideoCapture;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final EnumC12529l transition;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C3535j(@NotNull String title, @NotNull String description, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @Nullable NextStep.GovernmentId.AssetConfig.PendingPage pendingPage, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, boolean z10, @Nullable String str, @NotNull EnumC12529l transition) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(onBack, "onBack");
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.title = title;
            this.description = description;
            this.styles = governmentIdStepStyle;
            this.assetConfig = pendingPage;
            this.navigationState = navigationState;
            this.onBack = onBack;
            this.onCancel = onCancel;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.isFinalizingVideoCapture = z10;
            this.navBarTitle = str;
            this.transition = transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public EnumC12529l getTransition() {
            return this.transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        /* JADX INFO: renamed from: b */
        public boolean mo17319b(@Nullable Screen screen) {
            return super.mo17319b(screen);
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig.PendingPage getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final Function0<Unit> m17492g() {
            return this.onBack;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final Function0<Unit> m17493h() {
            return this.onCancel;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getIsFinalizingVideoCapture() {
            return this.isFinalizingVideoCapture;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
          (r15v0 java.lang.String)
          (r16v0 java.lang.String)
          (r17v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle)
          (r18v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$PendingPage)
          (r19v0 com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
          (r20v0 kotlin.jvm.functions.Function0)
          (r21v0 kotlin.jvm.functions.Function0)
          (r22v0 com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition)
          (wrap boolean:?: TERNARY null = ((wrap int:0x0002: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
          (wrap wq.l:?: TERNARY null = ((wrap int:0x0014: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x001a: SGET  A[WRAPPED] (LINE:13) wq.l.a wq.l) : (r25v0 wq.l))
         A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$PendingPage, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition, boolean, java.lang.String, wq.l):void (m)] (LINE:14) call: com.withpersona.sdk2.inquiry.governmentid.Screen.j.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$PendingPage, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition, boolean, java.lang.String, wq.l):void type: THIS */
        public /* synthetic */ C3535j(String str, String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.PendingPage pendingPage, NavigationState navigationState, Function0 function0, Function0 function1, PendingPageTextPosition pendingPageTextPosition, boolean z10, String str3, EnumC12529l enumC12529l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, governmentIdStepStyle, pendingPage, navigationState, function0, function1, pendingPageTextPosition, (i10 & 256) != 0 ? false : z10, (i10 & 512) != 0 ? null : str3, (i10 & 1024) != 0 ? EnumC12529l.SLIDE_IN : enumC12529l);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$c */
    @Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\u0018\u00002\u00020\u0001B¿\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b4\u00101R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b*\u0010&R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u00101R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b3\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b;\u0010=\u001a\u0004\b.\u0010>R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b2\u0010&R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010?\u001a\u0004\b\u001f\u0010@¨\u0006A"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "captureOptions", "", Title.type, "body", "cameraText", "uploadButtonText", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onCameraCaptureClick", "onUploadClick", "onBack", "onCancel", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "pictographAsset", "", "localAsset", "navBarTitle", "Lwq/l;", "transition", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;ILjava/lang/String;Lwq/l;)V", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "c", "d", "r", "f", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "i", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "g", "Lkotlin/jvm/functions/Function0;", "k", "()Lkotlin/jvm/functions/Function0;", "h", "n", "j", "l", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "p", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "o", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "I", "()I", "Lwq/l;", "()Lwq/l;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3528c implements Screen {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<CaptureOptionNativeMobile> captureOptions;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String body;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final String cameraText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final String uploadButtonText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final NavigationState navigationState;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCameraCaptureClick;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onUploadClick;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBack;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCancel;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public final String error;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onErrorDismissed;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @Nullable
        public final RemoteImage pictographAsset;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public final int localAsset;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @NotNull
        public final EnumC12529l transition;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile> */
        /* JADX WARN: Multi-variable type inference failed */
        public C3528c(@NotNull List<? extends CaptureOptionNativeMobile> captureOptions, @NotNull String title, @NotNull String body, @NotNull String cameraText, @NotNull String uploadButtonText, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onCameraCaptureClick, @NotNull Function0<Unit> onUploadClick, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str, @NotNull Function0<Unit> onErrorDismissed, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @Nullable RemoteImage remoteImage, int i10, @Nullable String str2, @NotNull EnumC12529l transition) {
            Intrinsics.checkNotNullParameter(captureOptions, "captureOptions");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(cameraText, "cameraText");
            Intrinsics.checkNotNullParameter(uploadButtonText, "uploadButtonText");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(onCameraCaptureClick, "onCameraCaptureClick");
            Intrinsics.checkNotNullParameter(onUploadClick, "onUploadClick");
            Intrinsics.checkNotNullParameter(onBack, "onBack");
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.captureOptions = captureOptions;
            this.title = title;
            this.body = body;
            this.cameraText = cameraText;
            this.uploadButtonText = uploadButtonText;
            this.navigationState = navigationState;
            this.onCameraCaptureClick = onCameraCaptureClick;
            this.onUploadClick = onUploadClick;
            this.onBack = onBack;
            this.onCancel = onCancel;
            this.error = str;
            this.onErrorDismissed = onErrorDismissed;
            this.styles = governmentIdStepStyle;
            this.pictographAsset = remoteImage;
            this.localAsset = i10;
            this.navBarTitle = str2;
            this.transition = transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public EnumC12529l getTransition() {
            return this.transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        /* JADX INFO: renamed from: b */
        public boolean mo17319b(@Nullable Screen screen) {
            return super.mo17319b(screen);
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCameraText() {
            return this.cameraText;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final List<CaptureOptionNativeMobile> m17400e() {
            return this.captureOptions;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getLocalAsset() {
            return this.localAsset;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final Function0<Unit> m17405j() {
            return this.onBack;
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final Function0<Unit> m17406k() {
            return this.onCameraCaptureClick;
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final Function0<Unit> m17407l() {
            return this.onCancel;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final Function0<Unit> m17408m() {
            return this.onErrorDismissed;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public final Function0<Unit> m17409n() {
            return this.onUploadClick;
        }

        @Nullable
        /* JADX INFO: renamed from: o, reason: from getter */
        public final RemoteImage getPictographAsset() {
            return this.pictographAsset;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getUploadButtonText() {
            return this.uploadButtonText;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
          (r20v0 java.util.List)
          (r21v0 java.lang.String)
          (r22v0 java.lang.String)
          (r23v0 java.lang.String)
          (r24v0 java.lang.String)
          (r25v0 com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
          (r26v0 kotlin.jvm.functions.Function0)
          (r27v0 kotlin.jvm.functions.Function0)
          (r28v0 kotlin.jvm.functions.Function0)
          (r29v0 kotlin.jvm.functions.Function0)
          (r30v0 java.lang.String)
          (r31v0 kotlin.jvm.functions.Function0)
          (r32v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle)
          (r33v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage)
          (r34v0 int)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0003: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
          (wrap wq.l:?: TERNARY null = ((wrap int:0x000f: ARITH (r37v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0015: SGET  A[WRAPPED] (LINE:19) wq.l.a wq.l) : (r36v0 wq.l))
         A[MD:(java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, int, java.lang.String, wq.l):void (m)] (LINE:20) call: com.withpersona.sdk2.inquiry.governmentid.Screen.c.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, kotlin.jvm.functions.Function0, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, int, java.lang.String, wq.l):void type: THIS */
        public /* synthetic */ C3528c(List list, String str, String str2, String str3, String str4, NavigationState navigationState, Function0 function0, Function0 function1, Function0 function2, Function0 function3, String str5, Function0 function4, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, RemoteImage remoteImage, int i10, String str6, EnumC12529l enumC12529l, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, str2, str3, str4, navigationState, function0, function1, function2, function3, str5, function4, governmentIdStepStyle, remoteImage, i10, (i11 & 32768) != 0 ? null : str6, (i11 & 65536) != 0 ? EnumC12529l.SLIDE_IN : enumC12529l);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$e */
    @Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u00100R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b(\u0010;R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b/\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\f\n\u0004\bB\u0010@\u001a\u0004\bB\u0010AR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010#\u001a\u0004\b1\u0010%R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\f\n\u0004\b'\u0010@\u001a\u0004\bC\u0010AR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b3\u0010D\u001a\u0004\b5\u0010ER\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010#\u001a\u0004\b9\u0010%R\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010F\u001a\u0004\b\"\u0010G¨\u0006H"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "", Title.type, "prompt", "chooseText", "disclaimer", "", "Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "enabledIdClasses", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "", "selectIdClass", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "assetConfig", "", "isEnabled", "Lkotlin/Function0;", "onBack", "onCancel", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;", "iconStyle", "navBarTitle", "Lwq/l;", "transition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;Ljava/lang/String;Lwq/l;)V", "a", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "b", "n", "c", "d", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "j", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "g", "Lkotlin/jvm/functions/Function1;", "o", "()Lkotlin/jvm/functions/Function1;", "h", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "p", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "Z", "r", "()Z", "k", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "l", "m", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;", "()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;", "Lwq/l;", "()Lwq/l;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3530e implements Screen {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String prompt;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String chooseText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final String disclaimer;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final List<EnabledIdClass> enabledIdClasses;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final NavigationState navigationState;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final Function1<IdConfig, Unit> selectIdClass;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public final NextStep.GovernmentId.AssetConfig.SelectPage assetConfig;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public final boolean isEnabled;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBack;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCancel;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public final String error;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onErrorDismissed;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @NotNull
        public final InquiryTheme.EnumC4006c iconStyle;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @NotNull
        public final EnumC12529l transition;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.IdConfig, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public C3530e(@NotNull String title, @NotNull String prompt, @NotNull String chooseText, @NotNull String disclaimer, @NotNull List<EnabledIdClass> enabledIdClasses, @NotNull NavigationState navigationState, @NotNull Function1<? super IdConfig, Unit> selectIdClass, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @Nullable NextStep.GovernmentId.AssetConfig.SelectPage selectPage, boolean z10, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str, @NotNull Function0<Unit> onErrorDismissed, @NotNull InquiryTheme.EnumC4006c iconStyle, @Nullable String str2, @NotNull EnumC12529l transition) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(prompt, "prompt");
            Intrinsics.checkNotNullParameter(chooseText, "chooseText");
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(enabledIdClasses, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(selectIdClass, "selectIdClass");
            Intrinsics.checkNotNullParameter(onBack, "onBack");
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
            Intrinsics.checkNotNullParameter(iconStyle, "iconStyle");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.title = title;
            this.prompt = prompt;
            this.chooseText = chooseText;
            this.disclaimer = disclaimer;
            this.enabledIdClasses = enabledIdClasses;
            this.navigationState = navigationState;
            this.selectIdClass = selectIdClass;
            this.styles = governmentIdStepStyle;
            this.assetConfig = selectPage;
            this.isEnabled = z10;
            this.onBack = onBack;
            this.onCancel = onCancel;
            this.error = str;
            this.onErrorDismissed = onErrorDismissed;
            this.iconStyle = iconStyle;
            this.navBarTitle = str2;
            this.transition = transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public EnumC12529l getTransition() {
            return this.transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        /* JADX INFO: renamed from: b */
        public boolean mo17319b(@Nullable Screen screen) {
            return super.mo17319b(screen);
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig.SelectPage getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getChooseText() {
            return this.chooseText;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final List<EnabledIdClass> m17426f() {
            return this.enabledIdClasses;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final InquiryTheme.EnumC4006c getIconStyle() {
            return this.iconStyle;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final Function0<Unit> m17431k() {
            return this.onBack;
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final Function0<Unit> m17432l() {
            return this.onCancel;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final Function0<Unit> m17433m() {
            return this.onErrorDismissed;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getPrompt() {
            return this.prompt;
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final Function1<IdConfig, Unit> m17435o() {
            return this.selectIdClass;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
          (r20v0 java.lang.String)
          (r21v0 java.lang.String)
          (r22v0 java.lang.String)
          (r23v0 java.lang.String)
          (r24v0 java.util.List)
          (r25v0 com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
          (r26v0 kotlin.jvm.functions.Function1)
          (r27v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle)
          (r28v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$SelectPage)
          (r29v0 boolean)
          (r30v0 kotlin.jvm.functions.Function0)
          (r31v0 kotlin.jvm.functions.Function0)
          (r32v0 java.lang.String)
          (r33v0 kotlin.jvm.functions.Function0)
          (r34v0 com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme$c)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0003: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
          (wrap wq.l:?: TERNARY null = ((wrap int:0x000f: ARITH (r37v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0015: SGET  A[WRAPPED] (LINE:19) wq.l.a wq.l) : (r36v0 wq.l))
         A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.withpersona.sdk2.inquiry.governmentid.EnabledIdClass>, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.IdConfig, kotlin.Unit>, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$SelectPage, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme$c, java.lang.String, wq.l):void (m)] (LINE:20) call: com.withpersona.sdk2.inquiry.governmentid.Screen.e.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function1, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$SelectPage, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, kotlin.jvm.functions.Function0, com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme$c, java.lang.String, wq.l):void type: THIS */
        public /* synthetic */ C3530e(String str, String str2, String str3, String str4, List list, NavigationState navigationState, Function1 function1, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.SelectPage selectPage, boolean z10, Function0 function0, Function0 function2, String str5, Function0 function3, InquiryTheme.EnumC4006c enumC4006c, String str6, EnumC12529l enumC12529l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, list, navigationState, function1, governmentIdStepStyle, selectPage, z10, function0, function2, str5, function3, enumC4006c, (i10 & 32768) != 0 ? null : str6, (i10 & 65536) != 0 ? EnumC12529l.SLIDE_IN : enumC12529l);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$i */
    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b,\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b-\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b2\u00103R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b6\u00103R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b*\u0010&R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b8\u00103R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b2\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b4\u0010&R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010?\u001a\u0004\b\u001f\u0010@¨\u0006A"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Lk6/s;", "imageLoader", "", Title.type, "body", "confirmButtonText", "chooseNewPhotoText", "fileToReviewPath", "fileMimeType", "fileName", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onUsePhotoClick", "onChooseNewPhotoClick", "onBack", "onCancel", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "", "isAutoClassifying", "navBarTitle", "Lwq/l;", "transition", "<init>", "(Lk6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;ZLjava/lang/String;Lwq/l;)V", "a", "Lk6/s;", "j", "()Lk6/s;", "b", "Ljava/lang/String;", "s", "()Ljava/lang/String;", "c", "d", "e", "f", "i", "g", "h", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "l", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lkotlin/jvm/functions/Function0;", "q", "()Lkotlin/jvm/functions/Function0;", "k", "o", "m", "n", "p", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "r", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Z", "t", "()Z", "Lwq/l;", "()Lwq/l;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3534i implements Screen {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC7479s imageLoader;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String body;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final String confirmButtonText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final String chooseNewPhotoText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final String fileToReviewPath;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final String fileMimeType;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public final String fileName;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final NavigationState navigationState;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onUsePhotoClick;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onChooseNewPhotoClick;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBack;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCancel;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @Nullable
        public final String error;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onErrorDismissed;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        public final boolean isAutoClassifying;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @NotNull
        public final EnumC12529l transition;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C3534i(@NotNull InterfaceC7479s imageLoader, @NotNull String title, @NotNull String body, @NotNull String confirmButtonText, @NotNull String chooseNewPhotoText, @NotNull String fileToReviewPath, @NotNull String fileMimeType, @Nullable String str, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onUsePhotoClick, @NotNull Function0<Unit> onChooseNewPhotoClick, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str2, @NotNull Function0<Unit> onErrorDismissed, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, boolean z10, @Nullable String str3, @NotNull EnumC12529l transition) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
            Intrinsics.checkNotNullParameter(chooseNewPhotoText, "chooseNewPhotoText");
            Intrinsics.checkNotNullParameter(fileToReviewPath, "fileToReviewPath");
            Intrinsics.checkNotNullParameter(fileMimeType, "fileMimeType");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(onUsePhotoClick, "onUsePhotoClick");
            Intrinsics.checkNotNullParameter(onChooseNewPhotoClick, "onChooseNewPhotoClick");
            Intrinsics.checkNotNullParameter(onBack, "onBack");
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.imageLoader = imageLoader;
            this.title = title;
            this.body = body;
            this.confirmButtonText = confirmButtonText;
            this.chooseNewPhotoText = chooseNewPhotoText;
            this.fileToReviewPath = fileToReviewPath;
            this.fileMimeType = fileMimeType;
            this.fileName = str;
            this.navigationState = navigationState;
            this.onUsePhotoClick = onUsePhotoClick;
            this.onChooseNewPhotoClick = onChooseNewPhotoClick;
            this.onBack = onBack;
            this.onCancel = onCancel;
            this.error = str2;
            this.onErrorDismissed = onErrorDismissed;
            this.styles = governmentIdStepStyle;
            this.isAutoClassifying = z10;
            this.navBarTitle = str3;
            this.transition = transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public EnumC12529l getTransition() {
            return this.transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        /* JADX INFO: renamed from: b */
        public boolean mo17319b(@Nullable Screen screen) {
            return super.mo17319b(screen);
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getChooseNewPhotoText() {
            return this.chooseNewPhotoText;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getConfirmButtonText() {
            return this.confirmButtonText;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getFileMimeType() {
            return this.fileMimeType;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getFileToReviewPath() {
            return this.fileToReviewPath;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final InterfaceC7479s getImageLoader() {
            return this.imageLoader;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final Function0<Unit> m17480m() {
            return this.onBack;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public final Function0<Unit> m17481n() {
            return this.onCancel;
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final Function0<Unit> m17482o() {
            return this.onChooseNewPhotoClick;
        }

        @NotNull
        /* JADX INFO: renamed from: p */
        public final Function0<Unit> m17483p() {
            return this.onErrorDismissed;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final Function0<Unit> m17484q() {
            return this.onUsePhotoClick;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getIsAutoClassifying() {
            return this.isAutoClassifying;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003e: CONSTRUCTOR 
          (r22v0 k6.s)
          (r23v0 java.lang.String)
          (r24v0 java.lang.String)
          (r25v0 java.lang.String)
          (r26v0 java.lang.String)
          (r27v0 java.lang.String)
          (r28v0 java.lang.String)
          (r29v0 java.lang.String)
          (r30v0 com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
          (r31v0 kotlin.jvm.functions.Function0)
          (r32v0 kotlin.jvm.functions.Function0)
          (r33v0 kotlin.jvm.functions.Function0)
          (r34v0 kotlin.jvm.functions.Function0)
          (r35v0 java.lang.String)
          (r36v0 kotlin.jvm.functions.Function0)
          (r37v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle)
          (r38v0 boolean)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r41v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
          (wrap wq.l:?: TERNARY null = ((wrap int:0x000e: ARITH (r41v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0014: SGET  A[WRAPPED] (LINE:21) wq.l.a wq.l) : (r40v0 wq.l))
         A[MD:(k6.s, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, boolean, java.lang.String, wq.l):void (m)] (LINE:22) call: com.withpersona.sdk2.inquiry.governmentid.Screen.i.<init>(k6.s, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, kotlin.jvm.functions.Function0, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, boolean, java.lang.String, wq.l):void type: THIS */
        public /* synthetic */ C3534i(InterfaceC7479s interfaceC7479s, String str, String str2, String str3, String str4, String str5, String str6, String str7, NavigationState navigationState, Function0 function0, Function0 function1, Function0 function2, Function0 function3, String str8, Function0 function4, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, boolean z10, String str9, EnumC12529l enumC12529l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC7479s, str, str2, str3, str4, str5, str6, str7, navigationState, function0, function1, function2, function3, str8, function4, governmentIdStepStyle, z10, (i10 & 131072) != 0 ? null : str9, (i10 & 262144) != 0 ? EnumC12529l.SLIDE_IN : enumC12529l);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$a */
    @Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\u0018\u00002\u00020\u0001:\u0001$Bó\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b2\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b.\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b5\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b*\u0010'R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b8\u0010>R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b3\u0010AR#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\bD\u0010C\u001a\u0004\bF\u0010ER\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bB\u0010HR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8\u0006¢\u0006\f\n\u0004\b2\u0010G\u001a\u0004\b<\u0010HR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8\u0006¢\u0006\f\n\u0004\b6\u0010G\u001a\u0004\b?\u0010HR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b7\u0010'R\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010I\u001a\u0004\b$\u0010J¨\u0006K"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "", "manualClassificationTitle", "unableToClassifyDocumentTitle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a$a;", "countryOptions", "selectedCountryCode", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "idClassOptions", "selectedIdClass", "countryInputTitle", "idClassInputTitle", "continueButtonText", "", "isContinueEnabled", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lio/d;", "designVersion", "Lkotlin/Function1;", "", "onCountrySelected", "onIdClassSelected", "Lkotlin/Function0;", "onContinueClick", "onBackClick", "onCancelClick", "navBarTitle", "Lwq/l;", "transition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lio/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lwq/l;)V", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "b", "getUnableToClassifyDocumentTitle", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "s", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "q", "f", "h", "g", "r", "j", "k", "Z", "t", "()Z", "l", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "m", "Lio/d;", "()Lio/d;", "n", "Lkotlin/jvm/functions/Function1;", "o", "()Lkotlin/jvm/functions/Function1;", "p", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Lwq/l;", "()Lwq/l;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3526a implements Screen {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final String manualClassificationTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String unableToClassifyDocumentTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final List<CountryOption> countryOptions;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public final String selectedCountryCode;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final List<Option> idClassOptions;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public final String selectedIdClass;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public final String countryInputTitle;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public final String idClassInputTitle;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public final String continueButtonText;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public final boolean isContinueEnabled;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public final NavigationState navigationState;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @NotNull
        public final EnumC6852d designVersion;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @NotNull
        public final Function1<Option, Unit> onCountrySelected;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @NotNull
        public final Function1<Option, Unit> onIdClassSelected;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onContinueClick;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBackClick;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCancelClick;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @NotNull
        public final EnumC12529l transition;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$a$a, reason: from toString */
        @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a$a;", "", "", "countryCode", "countryName", "flagEmoji", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "getFlagEmoji", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class CountryOption {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final String countryCode;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final String countryName;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
            @NotNull
            public final String flagEmoji;

            public CountryOption(@NotNull String countryCode, @NotNull String countryName, @NotNull String flagEmoji) {
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(countryName, "countryName");
                Intrinsics.checkNotNullParameter(flagEmoji, "flagEmoji");
                this.countryCode = countryCode;
                this.countryName = countryName;
                this.flagEmoji = flagEmoji;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCountryCode() {
                return this.countryCode;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getCountryName() {
                return this.countryName;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CountryOption)) {
                    return false;
                }
                CountryOption countryOption = (CountryOption) other;
                return Intrinsics.m31980c(this.countryCode, countryOption.countryCode) && Intrinsics.m31980c(this.countryName, countryOption.countryName) && Intrinsics.m31980c(this.flagEmoji, countryOption.flagEmoji);
            }

            public int hashCode() {
                return (((this.countryCode.hashCode() * 31) + this.countryName.hashCode()) * 31) + this.flagEmoji.hashCode();
            }

            @NotNull
            public String toString() {
                return "CountryOption(countryCode=" + this.countryCode + ", countryName=" + this.countryName + ", flagEmoji=" + this.flagEmoji + ")";
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.steps.ui.components.Option, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r25v0, resolved type: kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.steps.ui.components.Option, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public C3526a(@Nullable String str, @Nullable String str2, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull List<CountryOption> countryOptions, @Nullable String str3, @NotNull List<Option> idClassOptions, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, boolean z10, @NotNull NavigationState navigationState, @NotNull EnumC6852d designVersion, @NotNull Function1<? super Option, Unit> onCountrySelected, @NotNull Function1<? super Option, Unit> onIdClassSelected, @NotNull Function0<Unit> onContinueClick, @NotNull Function0<Unit> onBackClick, @NotNull Function0<Unit> onCancelClick, @Nullable String str8, @NotNull EnumC12529l transition) {
            Intrinsics.checkNotNullParameter(countryOptions, "countryOptions");
            Intrinsics.checkNotNullParameter(idClassOptions, "idClassOptions");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            Intrinsics.checkNotNullParameter(onCountrySelected, "onCountrySelected");
            Intrinsics.checkNotNullParameter(onIdClassSelected, "onIdClassSelected");
            Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
            Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
            Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.manualClassificationTitle = str;
            this.unableToClassifyDocumentTitle = str2;
            this.styles = governmentIdStepStyle;
            this.countryOptions = countryOptions;
            this.selectedCountryCode = str3;
            this.idClassOptions = idClassOptions;
            this.selectedIdClass = str4;
            this.countryInputTitle = str5;
            this.idClassInputTitle = str6;
            this.continueButtonText = str7;
            this.isContinueEnabled = z10;
            this.navigationState = navigationState;
            this.designVersion = designVersion;
            this.onCountrySelected = onCountrySelected;
            this.onIdClassSelected = onIdClassSelected;
            this.onContinueClick = onContinueClick;
            this.onBackClick = onBackClick;
            this.onCancelClick = onCancelClick;
            this.navBarTitle = str8;
            this.transition = transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public EnumC12529l getTransition() {
            return this.transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        /* JADX INFO: renamed from: b */
        public boolean mo17319b(@Nullable Screen screen) {
            return super.mo17319b(screen);
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getContinueButtonText() {
            return this.continueButtonText;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCountryInputTitle() {
            return this.countryInputTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final List<CountryOption> m17336e() {
            return this.countryOptions;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final EnumC6852d getDesignVersion() {
            return this.designVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getIdClassInputTitle() {
            return this.idClassInputTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final List<Option> m17339h() {
            return this.idClassOptions;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getManualClassificationTitle() {
            return this.manualClassificationTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final Function0<Unit> m17343l() {
            return this.onBackClick;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final Function0<Unit> m17344m() {
            return this.onCancelClick;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public final Function0<Unit> m17345n() {
            return this.onContinueClick;
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final Function1<Option, Unit> m17346o() {
            return this.onCountrySelected;
        }

        @NotNull
        /* JADX INFO: renamed from: p */
        public final Function1<Option, Unit> m17347p() {
            return this.onIdClassSelected;
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getSelectedCountryCode() {
            return this.selectedCountryCode;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getSelectedIdClass() {
            return this.selectedIdClass;
        }

        @Nullable
        /* JADX INFO: renamed from: s, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getIsContinueEnabled() {
            return this.isContinueEnabled;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0040: CONSTRUCTOR 
          (r23v0 java.lang.String)
          (r24v0 java.lang.String)
          (r25v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle)
          (r26v0 java.util.List)
          (r27v0 java.lang.String)
          (r28v0 java.util.List)
          (r29v0 java.lang.String)
          (r30v0 java.lang.String)
          (r31v0 java.lang.String)
          (r32v0 java.lang.String)
          (r33v0 boolean)
          (r34v0 com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
          (r35v0 io.d)
          (r36v0 kotlin.jvm.functions.Function1)
          (r37v0 kotlin.jvm.functions.Function1)
          (r38v0 kotlin.jvm.functions.Function0)
          (r39v0 kotlin.jvm.functions.Function0)
          (r40v0 kotlin.jvm.functions.Function0)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r43v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
          (wrap wq.l:?: TERNARY null = ((wrap int:0x000e: ARITH (r43v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0014: SGET  A[WRAPPED] (LINE:22) wq.l.a wq.l) : (r42v0 wq.l))
         A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, java.util.List<com.withpersona.sdk2.inquiry.governmentid.Screen$a$a>, java.lang.String, java.util.List<com.withpersona.sdk2.inquiry.steps.ui.components.Option>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, io.d, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.steps.ui.components.Option, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.steps.ui.components.Option, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String, wq.l):void (m)] (LINE:23) call: com.withpersona.sdk2.inquiry.governmentid.Screen.a.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, java.util.List, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, io.d, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, wq.l):void type: THIS */
        public /* synthetic */ C3526a(String str, String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, List list, String str3, List list2, String str4, String str5, String str6, String str7, boolean z10, NavigationState navigationState, EnumC6852d enumC6852d, Function1 function1, Function1 function2, Function0 function0, Function0 function3, Function0 function4, String str8, EnumC12529l enumC12529l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, governmentIdStepStyle, list, str3, list2, str4, str5, str6, str7, z10, navigationState, enumC6852d, function1, function2, function0, function3, function4, (i10 & 262144) != 0 ? null : str8, (i10 & 524288) != 0 ? EnumC12529l.SLIDE_IN : enumC12529l);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$h */
    @Metadata(m31664d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b8\u0018\u00002\u00020\u0001Bõ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010%\u001a\u00020\u001e\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b3\u0010HR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bJ\u0010HR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u00100\u001a\u0004\bK\u00102R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u00100\u001a\u0004\bB\u00102R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b:\u0010G\u001a\u0004\b>\u0010HR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\bI\u00102R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bP\u0010G\u001a\u0004\bQ\u0010HR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bD\u0010R\u001a\u0004\b9\u0010SR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bQ\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010 \u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b7\u0010T\u001a\u0004\bW\u0010VR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bJ\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bK\u0010[\u001a\u0004\bF\u0010\\R\u0017\u0010%\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bL\u0010VR\u0019\u0010&\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bN\u00100\u001a\u0004\bP\u00102R\u001a\u0010(\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010]\u001a\u0004\b+\u0010^¨\u0006_"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Lk6/s;", "imageLoader", "", "message", "disclaimer", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlay", "imagePath", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "captureSide", "Lpo/b;", "idClass", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "acceptImage", "acceptText", "retryImage", "retryText", "confirmCaptureTitle", "close", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "", "isEnabled", "isAutoClassifying", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "Lio/d;", "designVersion", "keepCameraAlive", "navBarTitle", "Lwq/l;", "transition", "<init>", "(Lk6/s;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lpo/b;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lio/d;ZLjava/lang/String;Lwq/l;)V", "a", "Lk6/s;", "m", "()Lk6/s;", "b", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "c", "j", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "t", "()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "e", "n", "f", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "g", "Lpo/b;", "l", "()Lpo/b;", "h", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "r", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "i", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "k", "u", "v", "o", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "x", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "q", "s", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "Z", "z", "()Z", "y", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "w", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "Lio/d;", "()Lio/d;", "Lwq/l;", "()Lwq/l;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3533h implements Screen {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC7479s imageLoader;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String disclaimer;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final Overlay overlay;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final String imagePath;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final IdConfig.EnumC3514b captureSide;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final EnumC10302b idClass;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public final NavigationState navigationState;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> acceptImage;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public final String acceptText;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> retryImage;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public final String retryText;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @NotNull
        public final String confirmCaptureTitle;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> close;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @Nullable
        public final String error;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onErrorDismissed;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @Nullable
        public final NextStep.GovernmentId.AssetConfig.CapturePage assetConfig;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        public final boolean isEnabled;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        public final boolean isAutoClassifying;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @NotNull
        public final StyleElements.Axis reviewCaptureButtonsAxis;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @NotNull
        public final EnumC6852d designVersion;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        public final boolean keepCameraAlive;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        @NotNull
        public final EnumC12529l transition;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C3533h(@NotNull InterfaceC7479s imageLoader, @NotNull String message, @NotNull String disclaimer, @NotNull Overlay overlay, @NotNull String imagePath, @NotNull IdConfig.EnumC3514b captureSide, @NotNull EnumC10302b idClass, @NotNull NavigationState navigationState, @NotNull Function0<Unit> acceptImage, @NotNull String acceptText, @NotNull Function0<Unit> retryImage, @NotNull String retryText, @NotNull String confirmCaptureTitle, @NotNull Function0<Unit> close, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @Nullable String str, @NotNull Function0<Unit> onErrorDismissed, @Nullable NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z10, boolean z11, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @NotNull EnumC6852d designVersion, boolean z12, @Nullable String str2, @NotNull EnumC12529l transition) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intrinsics.checkNotNullParameter(captureSide, "captureSide");
            Intrinsics.checkNotNullParameter(idClass, "idClass");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(acceptImage, "acceptImage");
            Intrinsics.checkNotNullParameter(acceptText, "acceptText");
            Intrinsics.checkNotNullParameter(retryImage, "retryImage");
            Intrinsics.checkNotNullParameter(retryText, "retryText");
            Intrinsics.checkNotNullParameter(confirmCaptureTitle, "confirmCaptureTitle");
            Intrinsics.checkNotNullParameter(close, "close");
            Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
            Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.imageLoader = imageLoader;
            this.message = message;
            this.disclaimer = disclaimer;
            this.overlay = overlay;
            this.imagePath = imagePath;
            this.captureSide = captureSide;
            this.idClass = idClass;
            this.navigationState = navigationState;
            this.acceptImage = acceptImage;
            this.acceptText = acceptText;
            this.retryImage = retryImage;
            this.retryText = retryText;
            this.confirmCaptureTitle = confirmCaptureTitle;
            this.close = close;
            this.styles = governmentIdStepStyle;
            this.error = str;
            this.onErrorDismissed = onErrorDismissed;
            this.assetConfig = capturePage;
            this.isEnabled = z10;
            this.isAutoClassifying = z11;
            this.reviewCaptureButtonsAxis = reviewCaptureButtonsAxis;
            this.designVersion = designVersion;
            this.keepCameraAlive = z12;
            this.navBarTitle = str2;
            this.transition = transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public EnumC12529l getTransition() {
            return this.transition;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.Screen
        /* JADX INFO: renamed from: b */
        public boolean mo17319b(@Nullable Screen screen) {
            return super.mo17319b(screen);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Function0<Unit> m17446c() {
            return this.acceptImage;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getAcceptText() {
            return this.acceptText;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig.CapturePage getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final IdConfig.EnumC3514b getCaptureSide() {
            return this.captureSide;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final Function0<Unit> m17450g() {
            return this.close;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getConfirmCaptureTitle() {
            return this.confirmCaptureTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final EnumC6852d getDesignVersion() {
            return this.designVersion;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final EnumC10302b getIdClass() {
            return this.idClass;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final InterfaceC7479s getImageLoader() {
            return this.imageLoader;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getImagePath() {
            return this.imagePath;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getKeepCameraAlive() {
            return this.keepCameraAlive;
        }

        @NotNull
        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: r, reason: from getter */
        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public final Function0<Unit> m17462s() {
            return this.onErrorDismissed;
        }

        @NotNull
        /* JADX INFO: renamed from: t, reason: from getter */
        public final Overlay getOverlay() {
            return this.overlay;
        }

        @NotNull
        /* JADX INFO: renamed from: u */
        public final Function0<Unit> m17464u() {
            return this.retryImage;
        }

        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getRetryText() {
            return this.retryText;
        }

        @NotNull
        /* JADX INFO: renamed from: w, reason: from getter */
        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final boolean getIsAutoClassifying() {
            return this.isAutoClassifying;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
          (r28v0 k6.s)
          (r29v0 java.lang.String)
          (r30v0 java.lang.String)
          (r31v0 com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
          (r32v0 java.lang.String)
          (r33v0 com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
          (r34v0 po.b)
          (r35v0 com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
          (r36v0 kotlin.jvm.functions.Function0)
          (r37v0 java.lang.String)
          (r38v0 kotlin.jvm.functions.Function0)
          (r39v0 java.lang.String)
          (r40v0 java.lang.String)
          (r41v0 kotlin.jvm.functions.Function0)
          (r42v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle)
          (r43v0 java.lang.String)
          (r44v0 kotlin.jvm.functions.Function0)
          (r45v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$CapturePage)
          (r46v0 boolean)
          (r47v0 boolean)
          (r48v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements$Axis)
          (r49v0 io.d)
          (wrap boolean:?: TERNARY null = ((wrap int:0x0002: ARITH (r53v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? false : (r50v0 boolean))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000e: ARITH (r53v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
          (wrap wq.l:?: TERNARY null = ((wrap int:0x001a: ARITH (r53v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0020: SGET  A[WRAPPED] (LINE:27) wq.l.a wq.l) : (r52v0 wq.l))
         A[MD:(k6.s, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, po.b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$CapturePage, boolean, boolean, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements$Axis, io.d, boolean, java.lang.String, wq.l):void (m)] (LINE:28) call: com.withpersona.sdk2.inquiry.governmentid.Screen.h.<init>(k6.s, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, po.b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0, java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, java.lang.String, kotlin.jvm.functions.Function0, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$CapturePage, boolean, boolean, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements$Axis, io.d, boolean, java.lang.String, wq.l):void type: THIS */
        public /* synthetic */ C3533h(InterfaceC7479s interfaceC7479s, String str, String str2, Overlay overlay, String str3, IdConfig.EnumC3514b enumC3514b, EnumC10302b enumC10302b, NavigationState navigationState, Function0 function0, String str4, Function0 function1, String str5, String str6, Function0 function2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, String str7, Function0 function3, NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z10, boolean z11, StyleElements.Axis axis, EnumC6852d enumC6852d, boolean z12, String str8, EnumC12529l enumC12529l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC7479s, str, str2, overlay, str3, enumC3514b, enumC10302b, navigationState, function0, str4, function1, str5, str6, function2, governmentIdStepStyle, str7, function3, capturePage, z10, z11, axis, enumC6852d, (i10 & 4194304) != 0 ? false : z12, (i10 & 8388608) != 0 ? null : str8, (i10 & 16777216) != 0 ? EnumC12529l.SLIDE_IN : enumC12529l);
        }
    }
}
