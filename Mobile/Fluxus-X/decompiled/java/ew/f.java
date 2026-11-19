package ew;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000bH&¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000bH&¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000bH&¢\u0006\u0004\b#\u0010\u001dJ\u0017\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0010H&¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0010H&¢\u0006\u0004\b'\u0010&J\u000f\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0000H&¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H&¢\u0006\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0001\u000204ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00065À\u0006\u0001"}, d2 = {"Lew/f;", "Lew/j0;", "Ljava/nio/channels/WritableByteChannel;", "Lew/h;", "byteString", "z1", "(Lew/h;)Lew/f;", BuildConfig.FLAVOR, Payload.SOURCE, "write", "([B)Lew/f;", BuildConfig.FLAVOR, "offset", "byteCount", "([BII)Lew/f;", "Lew/l0;", BuildConfig.FLAVOR, "h3", "(Lew/l0;)J", BuildConfig.FLAVOR, InquiryField.StringField.TYPE, "D0", "(Ljava/lang/String;)Lew/f;", "beginIndex", "endIndex", "L0", "(Ljava/lang/String;II)Lew/f;", "codePoint", "X", "(I)Lew/f;", "b", "writeByte", "s", "writeShort", "i", "writeInt", "v", "A1", "(J)Lew/f;", "H2", BuildConfig.FLAVOR, "flush", "()V", "l0", "()Lew/f;", "Ljava/io/OutputStream;", "q3", "()Ljava/io/OutputStream;", "Lew/e;", "l", "()Lew/e;", "buffer", "Lew/e0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends j0, WritableByteChannel {
    @NotNull
    f A1(long v8);

    @NotNull
    f D0(@NotNull String string);

    @NotNull
    f H2(long v8);

    @NotNull
    f L0(@NotNull String string, int beginIndex, int endIndex);

    @NotNull
    f X(int codePoint);

    @Override // ew.j0, java.io.Flushable
    void flush();

    long h3(@NotNull l0 source);

    @NotNull
    e l();

    @NotNull
    f l0();

    @NotNull
    OutputStream q3();

    @NotNull
    f write(@NotNull byte[] source);

    @NotNull
    f write(@NotNull byte[] source, int offset, int byteCount);

    @NotNull
    f writeByte(int b);

    @NotNull
    f writeInt(int i10);

    @NotNull
    f writeShort(int s8);

    @NotNull
    f z1(@NotNull h byteString);
}
