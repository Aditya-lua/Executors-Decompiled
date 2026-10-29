package z6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"Lz6/c$b;", "", "b", "(Lz6/c$b;)F", "width", "a", "height", "coil-svg_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final float a(@NotNull c.ViewBox viewBox) {
        return viewBox.getBottom() - viewBox.getTop();
    }

    public static final float b(@NotNull c.ViewBox viewBox) {
        return viewBox.getRight() - viewBox.getLeft();
    }
}
