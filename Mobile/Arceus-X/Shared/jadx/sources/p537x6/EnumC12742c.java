package p537x6;

import kotlin.Metadata;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: x6.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m31665d2 = {"Lx6/c;", "", "", "readEnabled", "writeEnabled", "<init>", "(Ljava/lang/String;IZZ)V", "a", "Z", "b", "()Z", "c", "d", "e", "f", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public enum EnumC12742c {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);


    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC10707a f45366h = C10708b.m40805a(m47486a());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean readEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean writeEnabled;

    EnumC12742c(boolean z10, boolean z11) {
        this.readEnabled = z10;
        this.writeEnabled = z11;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}
