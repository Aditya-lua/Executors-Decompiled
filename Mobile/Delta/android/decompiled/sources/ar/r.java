package ar;

import com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u000b\u0010\u0011R0\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0014\u0010\u0006¨\u0006\u001d"}, d2 = {"Lar/r;", "", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SelectedFile;", "initialFiles", "<init>", "(Ljava/util/List;)V", "", "b", "()V", "Llu/c0;", "a", "Llu/c0;", "_selectedFiles", "Llu/h;", "Llu/h;", "getOnFilesChanged", "()Llu/h;", "onFilesChanged", "Llu/b0;", "c", "Llu/b0;", "_pickRequested", "d", "onPickRequested", "value", "getSelectedFiles", "()Ljava/util/List;", "selectedFiles", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lu.c0<List<SelectedFile>> _selectedFiles;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final lu.h<List<SelectedFile>> onFilesChanged;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lu.b0<Unit> _pickRequested;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lu.h<Unit> onPickRequested;

    public r(@NotNull List<SelectedFile> initialFiles) {
        Intrinsics.checkNotNullParameter(initialFiles, "initialFiles");
        lu.c0<List<SelectedFile>> c0VarA = lu.r0.a(initialFiles);
        this._selectedFiles = c0VarA;
        this.onFilesChanged = lu.j.n(c0VarA, 1);
        lu.b0<Unit> b0VarB = lu.i0.b(0, 1, null, 5, null);
        this._pickRequested = b0VarB;
        this.onPickRequested = b0VarB;
    }

    @NotNull
    public final lu.h<Unit> a() {
        return this.onPickRequested;
    }

    public final void b() {
        this._pickRequested.a(Unit.f22938a);
    }

    public final void c(@NotNull List<SelectedFile> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._selectedFiles.setValue(value);
    }
}
