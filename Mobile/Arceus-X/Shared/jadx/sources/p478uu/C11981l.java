package p478uu;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p395qu.C10719e0;
import p395qu.C10725h0;

/* JADX INFO: renamed from: uu.l */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010\"\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\f¨\u0006\u001a"}, m31665d2 = {"", "permits", "acquiredPermits", "Luu/h;", "a", "(II)Luu/h;", "", "id", "Luu/m;", "prev", "j", "(JLuu/m;)Luu/m;", "I", "MAX_SPIN_CYCLES", "Lqu/e0;", "b", "Lqu/e0;", "PERMIT", "c", "TAKEN", "d", "BROKEN", "e", "CANCELLED", "f", "SEGMENT_SIZE", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11981l {

    /* JADX INFO: renamed from: a */
    public static final int f42443a = C10725h0.m40855e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C10719e0 f42444b = new C10719e0("PERMIT");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C10719e0 f42445c = new C10719e0("TAKEN");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final C10719e0 f42446d = new C10719e0("BROKEN");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final C10719e0 f42447e = new C10719e0("CANCELLED");

    /* JADX INFO: renamed from: f */
    public static final int f42448f = C10725h0.m40855e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC11977h m44723a(int i10, int i11) {
        return new C11980k(i10, i11);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC11977h m44724b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m44723a(i10, i11);
    }

    /* JADX INFO: renamed from: j */
    public static final C11982m m44732j(long j10, C11982m c11982m) {
        return new C11982m(j10, c11982m, 0);
    }
}
