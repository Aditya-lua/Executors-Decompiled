package yi;

import kotlin.Metadata;
import nu.c0;
import nu.j;
import nu.p0;
import nu.r0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lyi/a;", "", "<init>", "()V", "", "newInExperience", "", "b", "(Z)V", "Lnu/c0;", "Lnu/c0;", "_isInExperience", "Lnu/p0;", "c", "Lnu/p0;", "a", "()Lnu/p0;", "isInExperience", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f35889a = new a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final c0<Boolean> _isInExperience;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final p0<Boolean> isInExperience;

    static {
        c0<Boolean> c0VarA = r0.a(Boolean.FALSE);
        _isInExperience = c0VarA;
        isInExperience = j.a(c0VarA);
    }

    @NotNull
    public final p0<Boolean> a() {
        return isInExperience;
    }

    public final void b(boolean newInExperience) {
        _isInExperience.setValue(Boolean.valueOf(newInExperience));
    }
}
