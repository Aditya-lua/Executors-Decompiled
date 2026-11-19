package sv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import mv.b0;
import mv.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsv/h;", "Lmv/i0;", BuildConfig.FLAVOR, "contentTypeString", BuildConfig.FLAVOR, "contentLength", "Lew/g;", Payload.SOURCE, "<init>", "(Ljava/lang/String;JLew/g;)V", "e", "()J", "Lmv/b0;", "f", "()Lmv/b0;", "l3", "()Lew/g;", "d", "Ljava/lang/String;", "J", "Lew/g;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String contentTypeString;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long contentLength;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ew.g source;

    public h(@Nullable String str, long j10, @NotNull ew.g source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.contentTypeString = str;
        this.contentLength = j10;
        this.source = source;
    }

    @Override // mv.i0
    /* JADX INFO: renamed from: e, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // mv.i0
    @Nullable
    /* JADX INFO: renamed from: f */
    public b0 getF24653d() {
        String str = this.contentTypeString;
        if (str != null) {
            return b0.INSTANCE.b(str);
        }
        return null;
    }

    @Override // mv.i0
    @NotNull
    /* JADX INFO: renamed from: l3, reason: from getter */
    public ew.g getSource() {
        return this.source;
    }
}
