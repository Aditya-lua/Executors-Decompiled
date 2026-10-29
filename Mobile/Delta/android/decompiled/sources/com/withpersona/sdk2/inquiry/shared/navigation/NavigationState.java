package com.withpersona.sdk2.inquiry.shared.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B=\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Landroid/os/Parcelable;", "", "showBackButton", "showCancelButton", "showNavBar", "handleBackPress", "isNavigationEnabled", "showHelpButton", "<init>", "(ZZZZZZ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "f", "()Z", "b", "g", "c", "j", "d", "e", "k", "i", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavigationState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NavigationState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean showBackButton;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean showCancelButton;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean showNavBar;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean handleBackPress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean isNavigationEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean showHelpButton;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NavigationState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NavigationState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z10 = false;
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z10 = true;
            }
            if (parcel.readInt() == 0) {
                z11 = z10;
            }
            if (parcel.readInt() == 0) {
                z11 = z10;
            }
            if (parcel.readInt() == 0) {
                z11 = z10;
            }
            if (parcel.readInt() == 0) {
                z11 = z10;
            }
            return new NavigationState(z10, z11, z11, z11, z11, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NavigationState[] newArray(int i10) {
            return new NavigationState[i10];
        }
    }

    public NavigationState(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.showBackButton = z10;
        this.showCancelButton = z11;
        this.showNavBar = z12;
        this.handleBackPress = z13;
        this.isNavigationEnabled = z14;
        this.showHelpButton = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHandleBackPress() {
        return this.handleBackPress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShowCancelButton() {
        return this.showCancelButton;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getShowHelpButton() {
        return this.showHelpButton;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getShowNavBar() {
        return this.showNavBar;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsNavigationEnabled() {
        return this.isNavigationEnabled;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.showBackButton ? 1 : 0);
        dest.writeInt(this.showCancelButton ? 1 : 0);
        dest.writeInt(this.showNavBar ? 1 : 0);
        dest.writeInt(this.handleBackPress ? 1 : 0);
        dest.writeInt(this.isNavigationEnabled ? 1 : 0);
        dest.writeInt(this.showHelpButton ? 1 : 0);
    }
}
