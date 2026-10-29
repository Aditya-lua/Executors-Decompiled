package mp;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lmp/i;", "", "Lg/c;", "Landroid/net/Uri;", "pictureLaunchResultLauncher", "", "", "openDocumentsResultLauncher", "Lg/h;", "selectFromPhotoLibraryLauncher", "<init>", "(Lg/c;Lg/c;Lg/c;)V", "c", "()Lg/c;", "a", "b", "Lg/c;", "launchers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g.c<Uri> pictureLaunchResultLauncher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.c<String[]> openDocumentsResultLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g.c<g.h> selectFromPhotoLibraryLauncher;

    public i(@NotNull g.c<Uri> pictureLaunchResultLauncher, @NotNull g.c<String[]> openDocumentsResultLauncher, @NotNull g.c<g.h> selectFromPhotoLibraryLauncher) {
        Intrinsics.checkNotNullParameter(pictureLaunchResultLauncher, "pictureLaunchResultLauncher");
        Intrinsics.checkNotNullParameter(openDocumentsResultLauncher, "openDocumentsResultLauncher");
        Intrinsics.checkNotNullParameter(selectFromPhotoLibraryLauncher, "selectFromPhotoLibraryLauncher");
        this.pictureLaunchResultLauncher = pictureLaunchResultLauncher;
        this.openDocumentsResultLauncher = openDocumentsResultLauncher;
        this.selectFromPhotoLibraryLauncher = selectFromPhotoLibraryLauncher;
    }

    @NotNull
    public final g.c<String[]> a() {
        return this.openDocumentsResultLauncher;
    }

    @NotNull
    public final g.c<g.h> b() {
        return this.selectFromPhotoLibraryLauncher;
    }

    @NotNull
    public final g.c<Uri> c() {
        return this.pictureLaunchResultLauncher;
    }
}
