package p577yi;

import kotlin.Metadata;
import nu.C9579j;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yi.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"Lyi/a;", "", "<init>", "()V", "", "newInExperience", "", "b", "(Z)V", "Lnu/c0;", "Lnu/c0;", "_isInExperience", "Lnu/p0;", "c", "Lnu/p0;", "a", "()Lnu/p0;", "isInExperience", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13192a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C13192a f46459a = new C13192a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC9566c0<Boolean> _isInExperience;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC9592p0<Boolean> isInExperience;

    static {
        InterfaceC9566c0<Boolean> interfaceC9566c0M37859a = C9596r0.m37859a(Boolean.FALSE);
        _isInExperience = interfaceC9566c0M37859a;
        isInExperience = C9579j.m37784a(interfaceC9566c0M37859a);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC9592p0<Boolean> m48803a() {
        return isInExperience;
    }

    /* JADX INFO: renamed from: b */
    public final void m48804b(boolean newInExperience) {
        _isInExperience.setValue(Boolean.valueOf(newInExperience));
    }
}
