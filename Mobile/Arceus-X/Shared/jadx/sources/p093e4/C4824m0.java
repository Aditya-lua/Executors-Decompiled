package p093e4;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: e4.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4824m0 extends Writer {

    /* JADX INFO: renamed from: a */
    public final String f19493a;

    /* JADX INFO: renamed from: b */
    public StringBuilder f19494b = new StringBuilder(128);

    public C4824m0(String str) {
        this.f19493a = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m23351a() {
        if (this.f19494b.length() > 0) {
            Log.d(this.f19493a, this.f19494b.toString());
            StringBuilder sb2 = this.f19494b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m23351a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m23351a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                m23351a();
            } else {
                this.f19494b.append(c10);
            }
        }
    }
}
