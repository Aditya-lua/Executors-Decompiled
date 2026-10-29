package er;

import android.graphics.Bitmap;
import kotlin.Metadata;
import nu.c0;
import nu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\rR(\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Ler/c;", "", "Landroid/graphics/Bitmap;", "initialValue", "<init>", "(Landroid/graphics/Bitmap;)V", "Lnu/c0;", "a", "Lnu/c0;", "_bitmapValue", "Lnu/h;", "b", "Lnu/h;", "()Lnu/h;", "onChanged", "value", "()Landroid/graphics/Bitmap;", "c", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<Bitmap> _bitmapValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final nu.h<Bitmap> onChanged;

    public c(@Nullable Bitmap bitmap) {
        c0<Bitmap> c0VarA = r0.a(bitmap);
        this._bitmapValue = c0VarA;
        this.onChanged = nu.j.n(c0VarA, 1);
    }

    @NotNull
    public final nu.h<Bitmap> a() {
        return this.onChanged;
    }

    @Nullable
    public final Bitmap b() {
        return this._bitmapValue.getValue();
    }

    public final void c(@Nullable Bitmap bitmap) {
        this._bitmapValue.setValue(bitmap);
    }
}
