package p008a7;

import android.graphics.RectF;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239k6.InterfaceC7474n;
import p509w7.C12318f;
import p509w7.C12319g;
import p537x6.Options;
import p596z6.C13724b;
import p596z6.C13730h;
import p596z6.C13731i;
import p596z6.InterfaceC13725c;

/* JADX INFO: renamed from: a7.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u0018\u0010\u001eR\u0014\u0010\u0011\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010\u0012\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"¨\u0006$"}, m31665d2 = {"La7/a;", "Lz6/c;", "Lw7/g;", "svg", "<init>", "(Lw7/g;)V", "", "value", "", "a", "(Ljava/lang/String;)V", "d", "Lx6/p;", "options", "c", "(Lx6/p;)V", "", "width", "height", "Lk6/n;", "f", "(II)Lk6/n;", "Lw7/g;", "Lw7/f;", "b", "Lw7/f;", "renderOptions", "Lz6/c$b;", "e", "()Lz6/c$b;", "(Lz6/c$b;)V", "viewBox", "", "getWidth", "()F", "getHeight", "coil-svg_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C0079a implements InterfaceC13725c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C12319g svg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public C12318f renderOptions;

    public C0079a(@NotNull C12319g c12319g) {
        this.svg = c12319g;
    }

    @Override // p596z6.InterfaceC13725c
    /* JADX INFO: renamed from: a */
    public void mo197a(@NotNull String value) {
        this.svg.m45859t(value);
    }

    @Override // p596z6.InterfaceC13725c
    /* JADX INFO: renamed from: b */
    public void mo198b(@Nullable InterfaceC13725c.ViewBox viewBox) {
        if (viewBox == null) {
            throw new UnsupportedOperationException();
        }
        this.svg.m45858s(viewBox.getLeft(), viewBox.getTop(), C13731i.m50138b(viewBox), C13731i.m50137a(viewBox));
    }

    @Override // p596z6.InterfaceC13725c
    /* JADX INFO: renamed from: c */
    public void mo199c(@NotNull Options options) {
        String strM50124a = C13724b.m50124a(options);
        if (strM50124a != null) {
            C12318f c12318f = new C12318f();
            c12318f.m45832a(strM50124a);
            this.renderOptions = c12318f;
        }
    }

    @Override // p596z6.InterfaceC13725c
    /* JADX INFO: renamed from: d */
    public void mo200d(@NotNull String value) {
        this.svg.m45857r(value);
    }

    @Override // p596z6.InterfaceC13725c
    @Nullable
    /* JADX INFO: renamed from: e */
    public InterfaceC13725c.ViewBox mo201e() {
        RectF rectFM45848g = this.svg.m45848g();
        if (rectFM45848g != null) {
            return new InterfaceC13725c.ViewBox(rectFM45848g.left, rectFM45848g.top, rectFM45848g.right, rectFM45848g.bottom);
        }
        return null;
    }

    @Override // p596z6.InterfaceC13725c
    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC7474n mo202f(int width, int height) {
        return new C13730h(this.svg, this.renderOptions, width, height);
    }

    @Override // p596z6.InterfaceC13725c
    public float getHeight() {
        return this.svg.m45847f();
    }

    @Override // p596z6.InterfaceC13725c
    public float getWidth() {
        return this.svg.m45849h();
    }
}
