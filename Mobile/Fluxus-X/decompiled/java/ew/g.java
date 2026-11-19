package ew;

import com.github.luben.zstd.BuildConfig;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010!\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H&¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H&¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H&¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u0002002\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u000200H&¢\u0006\u0004\b5\u00102J\u0017\u00107\u001a\u0002002\u0006\u00106\u001a\u00020\tH&¢\u0006\u0004\b7\u00104J\u000f\u00108\u001a\u00020\u0017H&¢\u0006\u0004\b8\u0010\u0019J\u0017\u0010;\u001a\u0002002\u0006\u0010:\u001a\u000209H&¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020 H&¢\u0006\u0004\b>\u0010?J'\u0010B\u001a\u00020\t2\u0006\u0010=\u001a\u00020 2\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\tH&¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\t2\u0006\u0010D\u001a\u00020 H&¢\u0006\u0004\bE\u0010?J\u001f\u0010G\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\t2\u0006\u0010=\u001a\u00020 H&¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0000H&¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH&¢\u0006\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0005\u0082\u0001\u0002\u0003Pø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006QÀ\u0006\u0001"}, d2 = {"Lew/g;", "Lew/l0;", "Ljava/nio/channels/ReadableByteChannel;", "Lew/e;", "S", "()Lew/e;", BuildConfig.FLAVOR, "c2", "()Z", BuildConfig.FLAVOR, "byteCount", BuildConfig.FLAVOR, "w1", "(J)V", "request", "(J)Z", BuildConfig.FLAVOR, "readByte", "()B", BuildConfig.FLAVOR, "readShort", "()S", "j1", BuildConfig.FLAVOR, "readInt", "()I", "P2", "m1", "()J", "l2", "t3", "skip", "Lew/h;", "J2", "()Lew/h;", "M1", "(J)Lew/h;", "Lew/z;", "options", "J1", "(Lew/z;)I", BuildConfig.FLAVOR, "a2", "()[B", "Lew/j0;", "sink", "a0", "(Lew/j0;)J", BuildConfig.FLAVOR, "V2", "()Ljava/lang/String;", "G1", "(J)Ljava/lang/String;", "b1", "limit", "p0", "E2", "Ljava/nio/charset/Charset;", "charset", "C2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "bytes", "i1", "(Lew/h;)J", "fromIndex", "toIndex", "K1", "(Lew/h;JJ)J", "targetBytes", "B2", "offset", "V1", "(JLew/h;)Z", "peek", "()Lew/g;", "Ljava/io/InputStream;", "x3", "()Ljava/io/InputStream;", "l", "buffer", "Lew/f0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l0, ReadableByteChannel {
    long B2(@NotNull h targetBytes);

    @NotNull
    String C2(@NotNull Charset charset);

    int E2();

    @NotNull
    String G1(long byteCount);

    int J1(@NotNull z options);

    @NotNull
    h J2();

    long K1(@NotNull h bytes, long fromIndex, long toIndex);

    @NotNull
    h M1(long byteCount);

    int P2();

    @NotNull
    e S();

    boolean V1(long offset, @NotNull h bytes);

    @NotNull
    String V2();

    long a0(@NotNull j0 sink);

    @NotNull
    byte[] a2();

    @NotNull
    String b1();

    boolean c2();

    long i1(@NotNull h bytes);

    short j1();

    @NotNull
    e l();

    long l2();

    long m1();

    @NotNull
    String p0(long limit);

    @NotNull
    g peek();

    byte readByte();

    int readInt();

    short readShort();

    boolean request(long byteCount);

    void skip(long byteCount);

    long t3();

    void w1(long byteCount);

    @NotNull
    InputStream x3();
}
