package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "d3", "()Ljava/util/List;", "frames", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "y1", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "side", "", "m2", "()Ljava/lang/String;", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "a3", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "captureMethod", "GovernmentIdImage", "GovernmentIdVideo", "b", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdVideo;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface GovernmentId extends Parcelable {

    @Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdVideo;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "frames", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "side", "", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "captureMethod", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d3", "()Ljava/util/List;", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "y1", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "c", "Ljava/lang/String;", "m2", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "a3", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class GovernmentIdVideo implements GovernmentId {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdVideo> CREATOR = new C3484a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<Frame> frames;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC3486b side;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final String idClassKey;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC3485a captureMethod;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentId$GovernmentIdVideo$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3484a implements Parcelable.Creator<GovernmentIdVideo> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdVideo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(Frame.CREATOR.createFromParcel(parcel));
                }
                return new GovernmentIdVideo(arrayList, EnumC3486b.valueOf(parcel.readString()), parcel.readString(), EnumC3485a.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdVideo[] newArray(int i10) {
                return new GovernmentIdVideo[i10];
            }
        }

        public GovernmentIdVideo(@NotNull List<Frame> frames, @NotNull EnumC3486b side, @NotNull String idClassKey, @NotNull EnumC3485a captureMethod) {
            Intrinsics.checkNotNullParameter(frames, "frames");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(idClassKey, "idClassKey");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            this.frames = frames;
            this.side = side;
            this.idClassKey = idClassKey;
            this.captureMethod = captureMethod;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        @NotNull
        /* JADX INFO: renamed from: a3, reason: from getter */
        public EnumC3485a getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        @NotNull
        /* JADX INFO: renamed from: d3 */
        public List<Frame> mo16936d3() {
            return this.frames;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentIdVideo)) {
                return false;
            }
            GovernmentIdVideo governmentIdVideo = (GovernmentIdVideo) other;
            return Intrinsics.m31980c(this.frames, governmentIdVideo.frames) && this.side == governmentIdVideo.side && Intrinsics.m31980c(this.idClassKey, governmentIdVideo.idClassKey) && this.captureMethod == governmentIdVideo.captureMethod;
        }

        public int hashCode() {
            return (((((this.frames.hashCode() * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode()) * 31) + this.captureMethod.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        @NotNull
        /* JADX INFO: renamed from: m2, reason: from getter */
        public String getIdClassKey() {
            return this.idClassKey;
        }

        @NotNull
        public String toString() {
            return "GovernmentIdVideo(frames=" + this.frames + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ", captureMethod=" + this.captureMethod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Frame> list = this.frames;
            dest.writeInt(list.size());
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.side.name());
            dest.writeString(this.idClassKey);
            dest.writeString(this.captureMethod.name());
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        @NotNull
        /* JADX INFO: renamed from: y1, reason: from getter */
        public EnumC3486b getSide() {
            return this.side;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentId$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class EnumC3485a {

        /* JADX INFO: renamed from: a */
        public static final EnumC3485a f13531a = new a("AUTO", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC3485a f13532b = new b("MANUAL", 1);

        /* JADX INFO: renamed from: c */
        public static final EnumC3485a f13533c = new c("UPLOAD", 2);

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ EnumC3485a[] f13534d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ InterfaceC10707a f13535e;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentId$a$a */
        @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"com/withpersona/sdk2/inquiry/governmentid/GovernmentId.CaptureMethod.AUTO", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "", "toString", "()Ljava/lang/String;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a extends EnumC3485a {
            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // java.lang.Enum
            @NotNull
            public String toString() {
                return "auto";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentId$a$b */
        @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"com/withpersona/sdk2/inquiry/governmentid/GovernmentId.CaptureMethod.MANUAL", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "", "toString", "()Ljava/lang/String;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b extends EnumC3485a {
            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // java.lang.Enum
            @NotNull
            public String toString() {
                return "manual";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentId$a$c */
        @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"com/withpersona/sdk2/inquiry/governmentid/GovernmentId.CaptureMethod.UPLOAD", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "", "toString", "()Ljava/lang/String;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class c extends EnumC3485a {
            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // java.lang.Enum
            @NotNull
            public String toString() {
                return "upload";
            }
        }

        static {
            EnumC3485a[] enumC3485aArrM16947a = m16947a();
            f13534d = enumC3485aArrM16947a;
            f13535e = C10708b.m40805a(enumC3485aArrM16947a);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int) A[MD:(java.lang.String, int):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.governmentid.GovernmentId.a.<init>(java.lang.String, int):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ EnumC3485a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ EnumC3485a[] m16947a() {
            return new EnumC3485a[]{f13531a, f13532b, f13533c};
        }

        public static EnumC3485a valueOf(String str) {
            return (EnumC3485a) Enum.valueOf(EnumC3485a.class, str);
        }

        public static EnumC3485a[] values() {
            return (EnumC3485a[]) f13534d.clone();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public EnumC3485a(String str, int i10) {
            super(str, i10);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentId$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum EnumC3486b {
        FRONT,
        BACK,
        FRONT_AND_BACK;


        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ InterfaceC10707a f13540e = C10708b.m40805a(m16948a());
    }

    @NotNull
    /* JADX INFO: renamed from: a3 */
    EnumC3485a getCaptureMethod();

    @NotNull
    /* JADX INFO: renamed from: d3 */
    List<Frame> mo16936d3();

    @NotNull
    /* JADX INFO: renamed from: m2 */
    String getIdClassKey();

    @NotNull
    /* JADX INFO: renamed from: y1 */
    EnumC3486b getSide();

    @Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019JV\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "frames", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "side", "", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "captureMethod", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "rawExtraction", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "idDetails", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d3", "()Ljava/util/List;", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "y1", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "c", "Ljava/lang/String;", "m2", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "a3", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "i", "()Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "f", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "g", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class GovernmentIdImage implements GovernmentId {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdImage> CREATOR = new C3483a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<Frame> frames;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC3486b side;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final String idClassKey;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC3485a captureMethod;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @Nullable
        public final RawExtraction rawExtraction;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdDetails idDetails;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentId$GovernmentIdImage$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3483a implements Parcelable.Creator<GovernmentIdImage> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdImage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(Frame.CREATOR.createFromParcel(parcel));
                }
                return new GovernmentIdImage(arrayList, EnumC3486b.valueOf(parcel.readString()), parcel.readString(), EnumC3485a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RawExtraction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GovernmentIdDetails.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdImage[] newArray(int i10) {
                return new GovernmentIdImage[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public GovernmentIdImage(@NotNull List<Frame> frames, @NotNull EnumC3486b side, @NotNull String idClassKey, @NotNull EnumC3485a captureMethod, @Nullable RawExtraction rawExtraction, @Nullable GovernmentIdDetails governmentIdDetails) {
            Intrinsics.checkNotNullParameter(frames, "frames");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(idClassKey, "idClassKey");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            this.frames = frames;
            this.side = side;
            this.idClassKey = idClassKey;
            this.captureMethod = captureMethod;
            this.rawExtraction = rawExtraction;
            this.idDetails = governmentIdDetails;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.governmentid.GovernmentId$GovernmentIdImage */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ GovernmentIdImage m16939f(GovernmentIdImage governmentIdImage, List list, EnumC3486b enumC3486b, String str, EnumC3485a enumC3485a, RawExtraction rawExtraction, GovernmentIdDetails governmentIdDetails, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = governmentIdImage.frames;
            }
            if ((i10 & 2) != 0) {
                enumC3486b = governmentIdImage.side;
            }
            if ((i10 & 4) != 0) {
                str = governmentIdImage.idClassKey;
            }
            if ((i10 & 8) != 0) {
                enumC3485a = governmentIdImage.captureMethod;
            }
            if ((i10 & 16) != 0) {
                rawExtraction = governmentIdImage.rawExtraction;
            }
            if ((i10 & 32) != 0) {
                governmentIdDetails = governmentIdImage.idDetails;
            }
            RawExtraction rawExtraction2 = rawExtraction;
            GovernmentIdDetails governmentIdDetails2 = governmentIdDetails;
            return governmentIdImage.m16940a(list, enumC3486b, str, enumC3485a, rawExtraction2, governmentIdDetails2);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final GovernmentIdImage m16940a(@NotNull List<Frame> frames, @NotNull EnumC3486b side, @NotNull String idClassKey, @NotNull EnumC3485a captureMethod, @Nullable RawExtraction rawExtraction, @Nullable GovernmentIdDetails idDetails) {
            Intrinsics.checkNotNullParameter(frames, "frames");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(idClassKey, "idClassKey");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            return new GovernmentIdImage(frames, side, idClassKey, captureMethod, rawExtraction, idDetails);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        @NotNull
        /* JADX INFO: renamed from: a3, reason: from getter */
        public EnumC3485a getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        @NotNull
        /* JADX INFO: renamed from: d3 */
        public List<Frame> mo16936d3() {
            return this.frames;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentIdImage)) {
                return false;
            }
            GovernmentIdImage governmentIdImage = (GovernmentIdImage) other;
            return Intrinsics.m31980c(this.frames, governmentIdImage.frames) && this.side == governmentIdImage.side && Intrinsics.m31980c(this.idClassKey, governmentIdImage.idClassKey) && this.captureMethod == governmentIdImage.captureMethod && Intrinsics.m31980c(this.rawExtraction, governmentIdImage.rawExtraction) && Intrinsics.m31980c(this.idDetails, governmentIdImage.idDetails);
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final GovernmentIdDetails getIdDetails() {
            return this.idDetails;
        }

        public int hashCode() {
            int iHashCode = ((((((this.frames.hashCode() * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode()) * 31) + this.captureMethod.hashCode()) * 31;
            RawExtraction rawExtraction = this.rawExtraction;
            int iHashCode2 = (iHashCode + (rawExtraction == null ? 0 : rawExtraction.hashCode())) * 31;
            GovernmentIdDetails governmentIdDetails = this.idDetails;
            return iHashCode2 + (governmentIdDetails != null ? governmentIdDetails.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final RawExtraction getRawExtraction() {
            return this.rawExtraction;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        @NotNull
        /* JADX INFO: renamed from: m2, reason: from getter */
        public String getIdClassKey() {
            return this.idClassKey;
        }

        @NotNull
        public String toString() {
            return "GovernmentIdImage(frames=" + this.frames + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ", captureMethod=" + this.captureMethod + ", rawExtraction=" + this.rawExtraction + ", idDetails=" + this.idDetails + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Frame> list = this.frames;
            dest.writeInt(list.size());
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.side.name());
            dest.writeString(this.idClassKey);
            dest.writeString(this.captureMethod.name());
            RawExtraction rawExtraction = this.rawExtraction;
            if (rawExtraction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rawExtraction.writeToParcel(dest, flags);
            }
            GovernmentIdDetails governmentIdDetails = this.idDetails;
            if (governmentIdDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdDetails.writeToParcel(dest, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        @NotNull
        /* JADX INFO: renamed from: y1, reason: from getter */
        public EnumC3486b getSide() {
            return this.side;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
          (r2v0 java.util.List)
          (r3v0 com.withpersona.sdk2.inquiry.governmentid.GovernmentId$b)
          (r4v0 java.lang.String)
          (r5v0 com.withpersona.sdk2.inquiry.governmentid.GovernmentId$a)
          (wrap com.withpersona.sdk2.inquiry.governmentid.RawExtraction:?: TERNARY null = ((wrap int:0x0000: ARITH (r8v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.governmentid.RawExtraction) : (r6v0 com.withpersona.sdk2.inquiry.governmentid.RawExtraction))
          (wrap com.withpersona.sdk2.inquiry.governmentid.GovernmentIdDetails:?: TERNARY null = ((wrap int:0x0006: ARITH (r8v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.governmentid.GovernmentIdDetails) : (r7v0 com.withpersona.sdk2.inquiry.governmentid.GovernmentIdDetails))
         A[MD:(java.util.List<com.withpersona.sdk2.inquiry.governmentid.Frame>, com.withpersona.sdk2.inquiry.governmentid.GovernmentId$b, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.GovernmentId$a, com.withpersona.sdk2.inquiry.governmentid.RawExtraction, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdDetails):void (m)] (LINE:8) call: com.withpersona.sdk2.inquiry.governmentid.GovernmentId.GovernmentIdImage.<init>(java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentId$b, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.GovernmentId$a, com.withpersona.sdk2.inquiry.governmentid.RawExtraction, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdDetails):void type: THIS */
        public /* synthetic */ GovernmentIdImage(List list, EnumC3486b enumC3486b, String str, EnumC3485a enumC3485a, RawExtraction rawExtraction, GovernmentIdDetails governmentIdDetails, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, enumC3486b, str, enumC3485a, (i10 & 16) != 0 ? null : rawExtraction, (i10 & 32) != 0 ? null : governmentIdDetails);
        }
    }
}
