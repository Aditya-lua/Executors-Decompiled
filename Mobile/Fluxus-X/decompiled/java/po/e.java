package po;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import dv.c0;
import dv.j;
import dv.p0;
import dv.r0;
import ew.f;
import java.io.File;
import java.io.FileInputStream;
import mv.b0;
import mv.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lpo/e;", "Lmv/g0;", "Ljava/io/File;", "file", "Lmv/b0;", "mediaType", "<init>", "(Ljava/io/File;Lmv/b0;)V", "b", "()Lmv/b0;", BuildConfig.FLAVOR, "a", "()J", "Lew/f;", "sink", BuildConfig.FLAVOR, "h", "(Lew/f;)V", "Ldv/p0;", BuildConfig.FLAVOR, "i", "()Ldv/p0;", "c", "Ljava/io/File;", "d", "Lmv/b0;", "Ldv/c0;", "e", "Ldv/c0;", "flow", "f", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File file;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final b0 mediaType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<Integer> flow;

    public e(@NotNull File file, @Nullable b0 b0Var) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.file = file;
        this.mediaType = b0Var;
        this.flow = r0.a(0);
    }

    @Override // mv.g0
    public long a() {
        return this.file.length();
    }

    @Override // mv.g0
    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public b0 getMediaType() {
        return this.mediaType;
    }

    @Override // mv.g0
    public void h(@NotNull f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        float length = this.file.length();
        byte[] bArr = new byte[Barcode.FORMAT_PDF417];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        try {
            int i10 = fileInputStream.read(bArr);
            long j10 = 0;
            int i11 = 0;
            while (i10 != -1) {
                j10 += (long) i10;
                sink.write(bArr, 0, i10);
                i10 = fileInputStream.read(bArr);
                int iD = su.b.d((j10 / length) * 100.0f);
                if (iD - i11 > 1 || iD >= 100) {
                    this.flow.a(Integer.valueOf(iD));
                    i11 = iD;
                }
            }
            Unit unit = Unit.f21506a;
            lu.c.a(fileInputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                lu.c.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final p0<Integer> i() {
        return j.a(this.flow);
    }
}
