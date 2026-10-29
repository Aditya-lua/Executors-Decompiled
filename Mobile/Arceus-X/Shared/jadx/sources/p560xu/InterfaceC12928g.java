package p560xu;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xu.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\tH&¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b \u0010\rJ\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020*H&¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\t2\u0006\u0010-\u001a\u000202H&¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H&¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u0002052\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000205H&¢\u0006\u0004\b:\u00107J\u0017\u0010<\u001a\u0002052\u0006\u0010;\u001a\u00020\tH&¢\u0006\u0004\b<\u00109J\u000f\u0010=\u001a\u00020\u0017H&¢\u0006\u0004\b=\u0010\u0019J\u0017\u0010@\u001a\u0002052\u0006\u0010?\u001a\u00020>H&¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\t2\u0006\u0010B\u001a\u00020!H&¢\u0006\u0004\bC\u0010DJ'\u0010G\u001a\u00020\t2\u0006\u0010B\u001a\u00020!2\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u00020\tH&¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\t2\u0006\u0010I\u001a\u00020!H&¢\u0006\u0004\bJ\u0010DJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\t2\u0006\u0010B\u001a\u00020!H&¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0000H&¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH&¢\u0006\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0005\u0082\u0001\u0002\u0003Uø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006VÀ\u0006\u0001"}, m31665d2 = {"Lxu/g;", "Lxu/r0;", "Ljava/nio/channels/ReadableByteChannel;", "Lxu/e;", "O", "()Lxu/e;", "", "Z1", "()Z", "", "byteCount", "", "w1", "(J)V", "request", "(J)Z", "", "readByte", "()B", "", "readShort", "()S", "k1", "", "readInt", "()I", "M2", "readLong", "()J", "n1", "i2", "o3", "skip", "Lxu/h;", "F2", "()Lxu/h;", "K1", "(J)Lxu/h;", "Lxu/f0;", "options", "l3", "(Lxu/f0;)I", "", "X1", "()[B", "sink", "readFully", "([B)V", "F1", "(Lxu/e;J)V", "Lxu/p0;", "K2", "(Lxu/p0;)J", "", "R2", "()Ljava/lang/String;", "G1", "(J)Ljava/lang/String;", "b1", "limit", "n0", "A2", "Ljava/nio/charset/Charset;", "charset", "z2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "bytes", "V", "(Lxu/h;)J", "fromIndex", "toIndex", "s1", "(Lxu/h;JJ)J", "targetBytes", "h0", "offset", "o0", "(JLxu/h;)Z", "peek", "()Lxu/g;", "Ljava/io/InputStream;", "s3", "()Ljava/io/InputStream;", "k", "buffer", "Lxu/l0;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC12928g extends InterfaceC12951r0, ReadableByteChannel {
    /* JADX INFO: renamed from: A2 */
    int mo47991A2();

    /* JADX INFO: renamed from: F1 */
    void mo47996F1(@NotNull C12924e sink, long byteCount);

    @NotNull
    /* JADX INFO: renamed from: F2 */
    C12930h mo47997F2();

    @NotNull
    /* JADX INFO: renamed from: G1 */
    String mo47998G1(long byteCount);

    @NotNull
    /* JADX INFO: renamed from: K1 */
    C12930h mo48002K1(long byteCount);

    /* JADX INFO: renamed from: K2 */
    long mo48003K2(@NotNull InterfaceC12947p0 sink);

    /* JADX INFO: renamed from: M2 */
    int mo48005M2();

    @NotNull
    /* JADX INFO: renamed from: O */
    C12924e mo48006O();

    @NotNull
    /* JADX INFO: renamed from: R2 */
    String mo48008R2();

    /* JADX INFO: renamed from: V */
    long mo48011V(@NotNull C12930h bytes);

    @NotNull
    /* JADX INFO: renamed from: X1 */
    byte[] mo48013X1();

    /* JADX INFO: renamed from: Z1 */
    boolean mo48016Z1();

    @NotNull
    /* JADX INFO: renamed from: b1 */
    String mo48021b1();

    /* JADX INFO: renamed from: h0 */
    long mo48030h0(@NotNull C12930h targetBytes);

    /* JADX INFO: renamed from: i2 */
    long mo48032i2();

    @NotNull
    /* JADX INFO: renamed from: k */
    C12924e mo48036k();

    /* JADX INFO: renamed from: k1 */
    short mo48037k1();

    /* JADX INFO: renamed from: l3 */
    int mo48039l3(@NotNull C12927f0 options);

    @NotNull
    /* JADX INFO: renamed from: n0 */
    String mo48041n0(long limit);

    /* JADX INFO: renamed from: n1 */
    long mo48042n1();

    /* JADX INFO: renamed from: o0 */
    boolean mo48044o0(long offset, @NotNull C12930h bytes);

    /* JADX INFO: renamed from: o3 */
    long mo48045o3();

    @NotNull
    InterfaceC12928g peek();

    byte readByte();

    void readFully(@NotNull byte[] sink);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long byteCount);

    /* JADX INFO: renamed from: s1 */
    long mo48050s1(@NotNull C12930h bytes, long fromIndex, long toIndex);

    @NotNull
    /* JADX INFO: renamed from: s3 */
    InputStream mo48051s3();

    void skip(long byteCount);

    /* JADX INFO: renamed from: w1 */
    void mo48054w1(long byteCount);

    @NotNull
    /* JADX INFO: renamed from: z2 */
    String mo48059z2(@NotNull Charset charset);
}
