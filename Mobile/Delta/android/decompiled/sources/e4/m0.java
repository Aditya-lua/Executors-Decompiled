package e4;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15147a;
    public StringBuilder b = new StringBuilder(128);

    public m0(String str) {
        this.f15147a = str;
    }

    public final void a() {
        if (this.b.length() > 0) {
            Log.d(this.f15147a, this.b.toString());
            StringBuilder sb2 = this.b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.b.append(c10);
            }
        }
    }
}
