package td;

import com.google.android.gms.common.api.Status;
import java.util.Locale;
import p242k9.C7492b;
import p464ud.C11841a;

/* JADX INFO: renamed from: td.a */
/* JADX INFO: loaded from: classes2.dex */
public class C11565a extends C7492b {

    /* JADX INFO: renamed from: b */
    public final Throwable f40930b;

    public C11565a(int i10, Throwable th2) {
        super(new Status(i10, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i10), C11841a.m44237a(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f40930b = th2;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f40930b;
    }
}
