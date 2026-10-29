package com.withpersona.sdk2.inquiry.types.collected_data;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001e%-B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;", "Landroid/os/Parcelable;", "", "idClass", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$c;", "side", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$a;", "captureMethod", "", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$Frame;", "frames", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$c;Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$a;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getIdClass", "b", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$c;", "getSide", "()Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$c;", "c", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$a;", "getCaptureMethod", "()Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$a;", "d", "Ljava/util/List;", "d3", "()Ljava/util/List;", "Frame", "inquiry-types_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GovernmentIdCapture implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GovernmentIdCapture> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String idClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final c side;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final a captureMethod;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<Frame> frames;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$Frame;", "Landroid/os/Parcelable;", "Ljava/io/File;", "data", "", "mimeType", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "()Ljava/io/File;", "b", "Ljava/lang/String;", "getMimeType", "inquiry-types_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Frame implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Frame> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final File data;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String mimeType;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Frame> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Frame createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Frame((File) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Frame[] newArray(int i10) {
                return new Frame[i10];
            }
        }

        public Frame(@NotNull File data, @NotNull String mimeType) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.data = data;
            this.mimeType = mimeType;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final File getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) other;
            return Intrinsics.c(this.data, frame.data) && Intrinsics.c(this.mimeType, frame.mimeType);
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.mimeType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Frame(data=" + this.data + ", mimeType=" + this.mimeType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.data);
            dest.writeString(this.mimeType);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "inquiry-types_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        Manual,
        Auto,
        Upload;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ qt.a f13697e = qt.b.a(a());
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<GovernmentIdCapture> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdCapture createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            c cVarValueOf = c.valueOf(parcel.readString());
            a aVarValueOf = a.valueOf(parcel.readString());
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Frame.CREATOR.createFromParcel(parcel));
            }
            return new GovernmentIdCapture(string, cVarValueOf, aVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdCapture[] newArray(int i10) {
            return new GovernmentIdCapture[i10];
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "inquiry-types_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c {
        Front,
        Back,
        FrontAndBack;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ qt.a f13701e = qt.b.a(a());
    }

    public GovernmentIdCapture(@NotNull String idClass, @NotNull c side, @NotNull a captureMethod, @NotNull List<Frame> frames) {
        Intrinsics.checkNotNullParameter(idClass, "idClass");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
        Intrinsics.checkNotNullParameter(frames, "frames");
        this.idClass = idClass;
        this.side = side;
        this.captureMethod = captureMethod;
        this.frames = frames;
    }

    @NotNull
    public final List<Frame> d3() {
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
        if (!(other instanceof GovernmentIdCapture)) {
            return false;
        }
        GovernmentIdCapture governmentIdCapture = (GovernmentIdCapture) other;
        return Intrinsics.c(this.idClass, governmentIdCapture.idClass) && this.side == governmentIdCapture.side && this.captureMethod == governmentIdCapture.captureMethod && Intrinsics.c(this.frames, governmentIdCapture.frames);
    }

    public int hashCode() {
        return (((((this.idClass.hashCode() * 31) + this.side.hashCode()) * 31) + this.captureMethod.hashCode()) * 31) + this.frames.hashCode();
    }

    @NotNull
    public String toString() {
        return "GovernmentIdCapture(idClass=" + this.idClass + ", side=" + this.side + ", captureMethod=" + this.captureMethod + ", frames=" + this.frames + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.idClass);
        dest.writeString(this.side.name());
        dest.writeString(this.captureMethod.name());
        List<Frame> list = this.frames;
        dest.writeInt(list.size());
        Iterator<Frame> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
