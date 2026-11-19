package fq;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import ln.Snapshot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001:\u0003'%#B\u0019\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00032$\u0010\u0014\u001a 0\u0013R\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001f\u001a\u00020\u001e*\u00180\u001aR\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lfq/u;", "Lln/k;", "Lfq/u$c;", "Lfq/u$a;", "Lfq/u$b;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lfq/j$a;", "deviceFeatureRequestWorkerFactory", "<init>", "(Landroid/content/Context;Lfq/j$a;)V", "props", "Lln/i;", "snapshot", "t", "(Lfq/u$c;Lln/i;)Lfq/u$a;", "renderProps", "renderState", "Lln/k$a;", "context", "u", "(Lfq/u$c;Lfq/u$a;Lln/k$a;)Ljava/lang/Object;", "state", "D", "(Lfq/u$a;)Lln/i;", "Lln/r$c;", "Lln/r;", "Lfq/y;", "output", BuildConfig.FLAVOR, "r", "(Lln/r$c;Lfq/y;)V", "s", "()V", "a", "Landroid/content/Context;", "b", "Lfq/j$a;", "c", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends ln.k<Props, a, Output, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final j.a deviceFeatureRequestWorkerFactory;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lfq/u$a;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "d", "c", "b", "Lfq/u$a$a;", "Lfq/u$a$b;", "Lfq/u$a$c;", "Lfq/u$a$d;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements Parcelable {

        /* JADX INFO: renamed from: fq.u$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfq/u$a$a;", "Lfq/u$a;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0309a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0309a f16527a = new C0309a();

            @NotNull
            public static final Parcelable.Creator<C0309a> CREATOR = new C0310a();

            /* JADX INFO: renamed from: fq.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0310a implements Parcelable.Creator<C0309a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0309a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return C0309a.f16527a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0309a[] newArray(int i10) {
                    return new C0309a[i10];
                }
            }

            public C0309a() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0309a);
            }

            public int hashCode() {
                return -86189441;
            }

            @NotNull
            public String toString() {
                return "CheckDeviceFeatureState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfq/u$a$b;", "Lfq/u$a;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f16528a = new b();

            @NotNull
            public static final Parcelable.Creator<b> CREATOR = new C0311a();

            /* JADX INFO: renamed from: fq.u$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0311a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return b.f16528a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            public b() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 92238675;
            }

            @NotNull
            public String toString() {
                return "Complete";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfq/u$a$c;", "Lfq/u$a;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f16529a = new c();

            @NotNull
            public static final Parcelable.Creator<c> CREATOR = new C0312a();

            /* JADX INFO: renamed from: fq.u$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0312a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return c.f16529a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            public c() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1991921803;
            }

            @NotNull
            public String toString() {
                return "RequestDeviceFeature";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfq/u$a$d;", "Lfq/u$a;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f16530a = new d();

            @NotNull
            public static final Parcelable.Creator<d> CREATOR = new C0313a();

            /* JADX INFO: renamed from: fq.u$a$d$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0313a implements Parcelable.Creator<d> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return d.f16530a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i10) {
                    return new d[i10];
                }
            }

            public d() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 725044653;
            }

            @NotNull
            public String toString() {
                return "ShowDeviceFeaturePrompt";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: fq.u$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfq/u$b;", BuildConfig.FLAVOR, "Lfq/y;", "deviceFeatureState", "<init>", "(Lfq/y;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lfq/y;", "()Lfq/y;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Output {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final DeviceFeatureState deviceFeatureState;

        public Output(@NotNull DeviceFeatureState deviceFeatureState) {
            Intrinsics.checkNotNullParameter(deviceFeatureState, "deviceFeatureState");
            this.deviceFeatureState = deviceFeatureState;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final DeviceFeatureState getDeviceFeatureState() {
            return this.deviceFeatureState;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Output) && Intrinsics.c(this.deviceFeatureState, ((Output) other).deviceFeatureState);
        }

        public int hashCode() {
            return this.deviceFeatureState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Output(deviceFeatureState=" + this.deviceFeatureState + ")";
        }
    }

    /* JADX INFO: renamed from: fq.u$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lfq/u$c;", BuildConfig.FLAVOR, "Lfq/z;", "feature", BuildConfig.FLAVOR, "requestFeatureTitle", "requestFeatureRationale", "requestFeatureModalPositiveButton", "requestFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "<init>", "(Lfq/z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lfq/z;", "()Lfq/z;", "b", "Ljava/lang/String;", "e", "c", "d", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Props {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final z feature;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String requestFeatureTitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String requestFeatureRationale;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String requestFeatureModalPositiveButton;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String requestFeatureModalNegativeButton;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyle styles;

        public Props(@NotNull z feature, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable StepStyle stepStyle) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            this.feature = feature;
            this.requestFeatureTitle = str;
            this.requestFeatureRationale = str2;
            this.requestFeatureModalPositiveButton = str3;
            this.requestFeatureModalNegativeButton = str4;
            this.styles = stepStyle;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final z getFeature() {
            return this.feature;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRequestFeatureModalNegativeButton() {
            return this.requestFeatureModalNegativeButton;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRequestFeatureModalPositiveButton() {
            return this.requestFeatureModalPositiveButton;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRequestFeatureRationale() {
            return this.requestFeatureRationale;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRequestFeatureTitle() {
            return this.requestFeatureTitle;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Props)) {
                return false;
            }
            Props props = (Props) other;
            return this.feature == props.feature && Intrinsics.c(this.requestFeatureTitle, props.requestFeatureTitle) && Intrinsics.c(this.requestFeatureRationale, props.requestFeatureRationale) && Intrinsics.c(this.requestFeatureModalPositiveButton, props.requestFeatureModalPositiveButton) && Intrinsics.c(this.requestFeatureModalNegativeButton, props.requestFeatureModalNegativeButton) && Intrinsics.c(this.styles, props.styles);
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final StepStyle getStyles() {
            return this.styles;
        }

        public int hashCode() {
            int iHashCode = this.feature.hashCode() * 31;
            String str = this.requestFeatureTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.requestFeatureRationale;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.requestFeatureModalPositiveButton;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.requestFeatureModalNegativeButton;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            StepStyle stepStyle = this.styles;
            return iHashCode5 + (stepStyle != null ? stepStyle.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Props(feature=" + this.feature + ", requestFeatureTitle=" + this.requestFeatureTitle + ", requestFeatureRationale=" + this.requestFeatureRationale + ", requestFeatureModalPositiveButton=" + this.requestFeatureModalPositiveButton + ", requestFeatureModalNegativeButton=" + this.requestFeatureModalNegativeButton + ", styles=" + this.styles + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$render$1", f = "DeviceFeatureRequestWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16537t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ln.k<Props, a, Output, Object>.a f16539v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Props f16540w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(ln.k<? super Props, a, Output, ? extends Object>.a aVar, Props props, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f16539v = aVar;
            this.f16540w = props;
        }

        public static final Unit q(u uVar, Props props, ln.r.c cVar) {
            uVar.r(cVar, new DeviceFeatureState(props.getFeature(), a0.Success));
            return Unit.f21506a;
        }

        public static final Unit r(ln.r.c cVar) {
            cVar.e(a.d.f16530a);
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return u.this.new d(this.f16539v, this.f16540w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f16537t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            if (hr.f.b(u.this.applicationContext)) {
                ln.h<ln.r<? super Props, a, ? extends Output>> hVarD = this.f16539v.d();
                final u uVar = u.this;
                final Props props = this.f16540w;
                hVarD.a(ln.z.d(uVar, null, new Function1() { // from class: fq.v
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return u.d.q(uVar, props, (ln.r.c) obj2);
                    }
                }, 1, null));
            } else {
                this.f16539v.d().a(ln.z.d(u.this, null, new Function1() { // from class: fq.w
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return u.d.r((ln.r.c) obj2);
                    }
                }, 1, null));
            }
            return Unit.f21506a;
        }
    }

    public u(@NotNull Context applicationContext, @NotNull j.a deviceFeatureRequestWorkerFactory) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(deviceFeatureRequestWorkerFactory, "deviceFeatureRequestWorkerFactory");
        this.applicationContext = applicationContext;
        this.deviceFeatureRequestWorkerFactory = deviceFeatureRequestWorkerFactory;
    }

    public static final Unit A(u uVar, Props props, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        uVar.r(action, new DeviceFeatureState(props.getFeature(), a0.Success));
        return Unit.f21506a;
    }

    public static final Unit B(u uVar, Props props, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        uVar.r(action, new DeviceFeatureState(props.getFeature(), a0.Failure));
        return Unit.f21506a;
    }

    public static final Unit C(u uVar, Props props, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        uVar.r(action, new DeviceFeatureState(props.getFeature(), a0.SettingsLaunched));
        return Unit.f21506a;
    }

    public static final Unit v(ln.k.a aVar, u uVar) {
        aVar.d().a(ln.z.d(uVar, null, new Function1() { // from class: fq.t
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.w((ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit w(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(a.c.f16529a);
        return Unit.f21506a;
    }

    public static final Unit x(ln.k.a aVar, final u uVar, final Props props) {
        aVar.d().a(ln.z.d(uVar, null, new Function1() { // from class: fq.s
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.y(this.f16517a, props, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit y(u uVar, Props props, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        uVar.r(action, new DeviceFeatureState(props.getFeature(), a0.Failure));
        return Unit.f21506a;
    }

    public static final ln.r z(final u uVar, final Props props, j.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof j.b.c) {
            return ln.z.d(uVar, null, new Function1() { // from class: fq.p
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u.A(this.f16506a, props, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof j.b.a) {
            return ln.z.d(uVar, null, new Function1() { // from class: fq.q
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u.B(this.f16509a, props, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (!(it instanceof j.b.C0302b)) {
            throw new zt.l();
        }
        uVar.s();
        return ln.z.d(uVar, null, new Function1() { // from class: fq.r
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.C(this.f16512a, props, (ln.r.c) obj);
            }
        }, 1, null);
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return nn.r.a(state);
    }

    public final void r(ln.r<? super Props, a, Output>.c cVar, DeviceFeatureState deviceFeatureState) {
        cVar.d(new Output(deviceFeatureState));
    }

    public final void s() {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        this.applicationContext.startActivity(intent);
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public a d(@NotNull Props props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            ew.h hVarB = snapshot.b();
            Parcelable parcelable = null;
            if (hVarB.I() <= 0) {
                hVarB = null;
            }
            if (hVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrO = hVarB.O();
                parcelObtain.unmarshall(bArrO, 0, bArrO.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            a aVar = (a) parcelable;
            if (aVar != null) {
                return aVar;
            }
        }
        return a.C0309a.f16527a;
    }

    @Override // ln.k
    @Nullable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull final Props renderProps, @NotNull a renderState, @NotNull final ln.k<? super Props, a, Output, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.c(renderState, a.C0309a.f16527a)) {
            context.b("check_device_feature_state", new d(context, renderProps, null));
            return null;
        }
        if (!Intrinsics.c(renderState, a.d.f16530a)) {
            if (!Intrinsics.c(renderState, a.c.f16529a)) {
                if (Intrinsics.c(renderState, a.b.f16528a)) {
                    return null;
                }
                throw new zt.l();
            }
            ln.w.l(context, this.deviceFeatureRequestWorkerFactory.a(), p001kotlin.jvm.internal.d0.k(j.class), BuildConfig.FLAVOR, new Function1() { // from class: fq.o
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u.z(this.f16493a, renderProps, (j.b) obj);
                }
            });
            return null;
        }
        String requestFeatureTitle = renderProps.getRequestFeatureTitle();
        if (requestFeatureTitle == null) {
            requestFeatureTitle = "Couldn't access location feature";
        }
        String requestFeatureRationale = renderProps.getRequestFeatureRationale();
        if (requestFeatureRationale == null) {
            requestFeatureRationale = "Location is turned off, please allow access to your device's location feature";
        }
        String requestFeatureModalPositiveButton = renderProps.getRequestFeatureModalPositiveButton();
        if (requestFeatureModalPositiveButton == null) {
            requestFeatureModalPositiveButton = "Allow";
        }
        StepStyle styles = renderProps.getStyles();
        Function0 function0 = new Function0() { // from class: fq.m
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.v(context, this);
            }
        };
        String requestFeatureModalNegativeButton = renderProps.getRequestFeatureModalNegativeButton();
        if (requestFeatureModalNegativeButton == null) {
            requestFeatureModalNegativeButton = "Cancel";
        }
        return new kr.m(new l0(requestFeatureTitle, requestFeatureRationale, requestFeatureModalPositiveButton, styles, function0, requestFeatureModalNegativeButton, new Function0() { // from class: fq.n
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.x(context, this, renderProps);
            }
        }), kr.l.NONE);
    }
}
