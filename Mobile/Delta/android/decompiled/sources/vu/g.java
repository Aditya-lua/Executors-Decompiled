package vu;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\tH&¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b \u0010\rJ\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020*H&¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\t2\u0006\u0010-\u001a\u000202H&¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H&¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u0002052\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000205H&¢\u0006\u0004\b:\u00107J\u0017\u0010<\u001a\u0002052\u0006\u0010;\u001a\u00020\tH&¢\u0006\u0004\b<\u00109J\u000f\u0010=\u001a\u00020\u0017H&¢\u0006\u0004\b=\u0010\u0019J\u0017\u0010@\u001a\u0002052\u0006\u0010?\u001a\u00020>H&¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\t2\u0006\u0010B\u001a\u00020!H&¢\u0006\u0004\bC\u0010DJ'\u0010G\u001a\u00020\t2\u0006\u0010B\u001a\u00020!2\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u00020\tH&¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\t2\u0006\u0010I\u001a\u00020!H&¢\u0006\u0004\bJ\u0010DJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\t2\u0006\u0010B\u001a\u00020!H&¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0000H&¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH&¢\u0006\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0005\u0082\u0001\u0002\u0003Uø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006VÀ\u0006\u0001"}, d2 = {"Lvu/g;", "Lvu/r0;", "Ljava/nio/channels/ReadableByteChannel;", "Lvu/e;", "O", "()Lvu/e;", "", "a2", "()Z", "", "byteCount", "", "u1", "(J)V", "request", "(J)Z", "", "readByte", "()B", "", "readShort", "()S", "g1", "", "readInt", "()I", "L2", "readLong", "()J", "j1", "i2", "o3", "skip", "Lvu/h;", "G2", "()Lvu/h;", "I1", "(J)Lvu/h;", "Lvu/f0;", "options", "J1", "(Lvu/f0;)I", "", "X1", "()[B", "sink", "readFully", "([B)V", "Y1", "(Lvu/e;J)V", "Lvu/p0;", "a3", "(Lvu/p0;)J", "", "Q2", "()Ljava/lang/String;", "D1", "(J)Ljava/lang/String;", "X0", "limit", "k0", "B2", "Ljava/nio/charset/Charset;", "charset", "A2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "bytes", "R1", "(Lvu/h;)J", "fromIndex", "toIndex", "d3", "(Lvu/h;JJ)J", "targetBytes", "e1", "offset", "m1", "(JLvu/h;)Z", "peek", "()Lvu/g;", "Ljava/io/InputStream;", "s3", "()Ljava/io/InputStream;", "k", "buffer", "Lvu/l0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends r0, ReadableByteChannel {
    @NotNull
    String A2(@NotNull Charset charset);

    int B2();

    @NotNull
    String D1(long byteCount);

    @NotNull
    h G2();

    @NotNull
    h I1(long byteCount);

    int J1(@NotNull f0 options);

    int L2();

    @NotNull
    e O();

    @NotNull
    String Q2();

    long R1(@NotNull h bytes);

    @NotNull
    String X0();

    @NotNull
    byte[] X1();

    void Y1(@NotNull e sink, long byteCount);

    boolean a2();

    long a3(@NotNull p0 sink);

    long d3(@NotNull h bytes, long fromIndex, long toIndex);

    long e1(@NotNull h targetBytes);

    short g1();

    long i2();

    long j1();

    @NotNull
    e k();

    @NotNull
    String k0(long limit);

    boolean m1(long offset, @NotNull h bytes);

    long o3();

    @NotNull
    g peek();

    byte readByte();

    void readFully(@NotNull byte[] sink);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long byteCount);

    @NotNull
    InputStream s3();

    void skip(long byteCount);

    void u1(long byteCount);
}
