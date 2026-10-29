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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "d3", "()Ljava/util/List;", "frames", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "y1", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "side", "", "m2", "()Ljava/lang/String;", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "a3", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "captureMethod", "GovernmentIdImage", "GovernmentIdVideo", "b", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdVideo;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GovernmentId extends Parcelable {

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdVideo;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "frames", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "side", "", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "captureMethod", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d3", "()Ljava/util/List;", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "y1", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "c", "Ljava/lang/String;", "m2", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "a3", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GovernmentIdVideo implements GovernmentId {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdVideo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<Frame> frames;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final b side;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String idClassKey;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final a captureMethod;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GovernmentIdVideo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdVideo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(Frame.CREATOR.createFromParcel(parcel));
                }
                return new GovernmentIdVideo(arrayList, b.valueOf(parcel.readString()), parcel.readString(), a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdVideo[] newArray(int i10) {
                return new GovernmentIdVideo[i10];
            }
        }

        public GovernmentIdVideo(@NotNull List<Frame> frames, @NotNull b side, @NotNull String idClassKey, @NotNull a captureMethod) {
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
        public a getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        @NotNull
        public List<Frame> d3() {
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
            return Intrinsics.c(this.frames, governmentIdVideo.frames) && this.side == governmentIdVideo.side && Intrinsics.c(this.idClassKey, governmentIdVideo.idClassKey) && this.captureMethod == governmentIdVideo.captureMethod;
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
        public b getSide() {
            return this.side;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10449a = new C0191a("AUTO", 0);
        public static final a b = new b("MANUAL", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f10450c = new c("UPLOAD", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f10451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ qt.a f10452e;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentId$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/GovernmentId.CaptureMethod.AUTO", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "", "toString", "()Ljava/lang/String;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0191a extends a {
            public C0191a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // java.lang.Enum
            @NotNull
            public String toString() {
                return "auto";
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/GovernmentId.CaptureMethod.MANUAL", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "", "toString", "()Ljava/lang/String;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends a {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // java.lang.Enum
            @NotNull
            public String toString() {
                return "manual";
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/GovernmentId.CaptureMethod.UPLOAD", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "", "toString", "()Ljava/lang/String;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends a {
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
            a[] aVarArrA = a();
            f10451d = aVarArrA;
            f10452e = qt.b.a(aVarArrA);
        }

        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f10449a, b, f10450c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f10451d.clone();
        }

        public a(String str, int i10) {
            super(str, i10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        FRONT,
        BACK,
        FRONT_AND_BACK;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ qt.a f10456e = qt.b.a(a());
    }

    @NotNull
    /* JADX INFO: renamed from: a3 */
    a getCaptureMethod();

    @NotNull
    List<Frame> d3();

    @NotNull
    /* JADX INFO: renamed from: m2 */
    String getIdClassKey();

    @NotNull
    /* JADX INFO: renamed from: y1 */
    b getSide();

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019JV\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "frames", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "side", "", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "captureMethod", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "rawExtraction", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "idDetails", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d3", "()Ljava/util/List;", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "y1", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "c", "Ljava/lang/String;", "m2", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "a3", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "i", "()Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "f", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "g", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GovernmentIdImage implements GovernmentId {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdImage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<Frame> frames;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final b side;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String idClassKey;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final a captureMethod;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final RawExtraction rawExtraction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdDetails idDetails;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GovernmentIdImage> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdImage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(Frame.CREATOR.createFromParcel(parcel));
                }
                return new GovernmentIdImage(arrayList, b.valueOf(parcel.readString()), parcel.readString(), a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RawExtraction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GovernmentIdDetails.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdImage[] newArray(int i10) {
                return new GovernmentIdImage[i10];
            }
        }

        public GovernmentIdImage(@NotNull List<Frame> frames, @NotNull b side, @NotNull String idClassKey, @NotNull a captureMethod, @Nullable RawExtraction rawExtraction, @Nullable GovernmentIdDetails governmentIdDetails) {
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

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GovernmentIdImage f(GovernmentIdImage governmentIdImage, List list, b bVar, String str, a aVar, RawExtraction rawExtraction, GovernmentIdDetails governmentIdDetails, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = governmentIdImage.frames;
            }
            if ((i10 & 2) != 0) {
                bVar = governmentIdImage.side;
            }
            if ((i10 & 4) != 0) {
                str = governmentIdImage.idClassKey;
            }
            if ((i10 & 8) != 0) {
                aVar = governmentIdImage.captureMethod;
            }
            if ((i10 & 16) != 0) {
                rawExtraction = governmentIdImage.rawExtraction;
            }
            if ((i10 & 32) != 0) {
                governmentIdDetails = governmentIdImage.idDetails;
            }
            RawExtraction rawExtraction2 = rawExtraction;
            GovernmentIdDetails governmentIdDetails2 = governmentIdDetails;
            return governmentIdImage.a(list, bVar, str, aVar, rawExtraction2, governmentIdDetails2);
        }

        @NotNull
        public final GovernmentIdImage a(@NotNull List<Frame> frames, @NotNull b side, @NotNull String idClassKey, @NotNull a captureMethod, @Nullable RawExtraction rawExtraction, @Nullable GovernmentIdDetails idDetails) {
            Intrinsics.checkNotNullParameter(frames, "frames");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(idClassKey, "idClassKey");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            return new GovernmentIdImage(frames, side, idClassKey, captureMethod, rawExtraction, idDetails);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        @NotNull
        /* JADX INFO: renamed from: a3, reason: from getter */
        public a getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        @NotNull
        public List<Frame> d3() {
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
            return Intrinsics.c(this.frames, governmentIdImage.frames) && this.side == governmentIdImage.side && Intrinsics.c(this.idClassKey, governmentIdImage.idClassKey) && this.captureMethod == governmentIdImage.captureMethod && Intrinsics.c(this.rawExtraction, governmentIdImage.rawExtraction) && Intrinsics.c(this.idDetails, governmentIdImage.idDetails);
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
        public b getSide() {
            return this.side;
        }

        public /* synthetic */ GovernmentIdImage(List list, b bVar, String str, a aVar, RawExtraction rawExtraction, GovernmentIdDetails governmentIdDetails, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, bVar, str, aVar, (i10 & 16) != 0 ? null : rawExtraction, (i10 & 32) != 0 ? null : governmentIdDetails);
        }
    }
}
