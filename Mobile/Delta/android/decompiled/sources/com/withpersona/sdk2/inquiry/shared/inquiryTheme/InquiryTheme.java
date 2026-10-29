package com.withpersona.sdk2.inquiry.shared.inquiryTheme;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0018 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;", "iconStyle", "<init>", "(Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;", "f", "()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;", "g", "()Z", "isDefault", "b", "c", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InquiryTheme implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final c iconStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InquiryTheme> CREATOR = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final InquiryTheme f13191c = new InquiryTheme(c.Default);

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;", "Default", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InquiryTheme a() {
            return InquiryTheme.f13191c;
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<InquiryTheme> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InquiryTheme createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InquiryTheme(c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InquiryTheme[] newArray(int i10) {
            return new InquiryTheme[i10];
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c {
        Default,
        None;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ qt.a f13195d = qt.b.a(a());
    }

    public InquiryTheme(@NotNull c iconStyle) {
        Intrinsics.checkNotNullParameter(iconStyle, "iconStyle");
        this.iconStyle = iconStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InquiryTheme) && this.iconStyle == ((InquiryTheme) other).iconStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final c getIconStyle() {
        return this.iconStyle;
    }

    public final boolean g() {
        return this == f13191c;
    }

    public int hashCode() {
        return this.iconStyle.hashCode();
    }

    @NotNull
    public String toString() {
        return "InquiryTheme(iconStyle=" + this.iconStyle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.iconStyle.name());
    }
}
