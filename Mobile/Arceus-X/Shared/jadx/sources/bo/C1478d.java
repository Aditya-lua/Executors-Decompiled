package bo;

import cu.C4366b;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9592p0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477ut.C11958c;
import p560xu.InterfaceC12926f;

/* JADX INFO: renamed from: bo.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m31665d2 = {"Lbo/d;", "Lokhttp3/RequestBody;", "Ljava/io/File;", "file", "Lokhttp3/MediaType;", "mediaType", "<init>", "(Ljava/io/File;Lokhttp3/MediaType;)V", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lxu/f;", "sink", "", "writeTo", "(Lxu/f;)V", "Lnu/p0;", "", "a", "()Lnu/p0;", "Ljava/io/File;", "b", "Lokhttp3/MediaType;", "Lnu/c0;", "c", "Lnu/c0;", "flow", "d", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1478d extends RequestBody {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final File file;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final MediaType mediaType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<Integer> flow;

    public C1478d(@NotNull File file, @Nullable MediaType mediaType) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.file = file;
        this.mediaType = mediaType;
        this.flow = C9596r0.m37859a(0);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC9592p0<Integer> m7588a() {
        return C9579j.m37784a(this.flow);
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.file.length();
    }

    @Override // okhttp3.RequestBody
    @Nullable
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public MediaType getMediaType() {
        return this.mediaType;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull InterfaceC12926f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        float length = this.file.length();
        byte[] bArr = new byte[2048];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        try {
            int i10 = fileInputStream.read(bArr);
            long j10 = 0;
            int i11 = 0;
            while (i10 != -1) {
                j10 += (long) i10;
                sink.write(bArr, 0, i10);
                i10 = fileInputStream.read(bArr);
                int iM22016d = C4366b.m22016d((j10 / length) * 100.0f);
                if (iM22016d - i11 > 1 || iM22016d >= 100) {
                    this.flow.mo37707a(Integer.valueOf(iM22016d));
                    i11 = iM22016d;
                }
            }
            Unit unit = Unit.f29331a;
            C11958c.m44629a(fileInputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C11958c.m44629a(fileInputStream, th2);
                throw th3;
            }
        }
    }
}
