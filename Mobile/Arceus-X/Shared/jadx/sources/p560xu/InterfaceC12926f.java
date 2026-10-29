package p560xu;

import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xu.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000bH&¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000bH&¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000bH&¢\u0006\u0004\b#\u0010\u001dJ\u0017\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0010H&¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0010H&¢\u0006\u0004\b'\u0010&J\u000f\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0000H&¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H&¢\u0006\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0001\u000204ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00065À\u0006\u0001"}, m31665d2 = {"Lxu/f;", "Lxu/p0;", "Ljava/nio/channels/WritableByteChannel;", "Lxu/h;", "byteString", "d0", "(Lxu/h;)Lxu/f;", "", Payload.SOURCE, "write", "([B)Lxu/f;", "", "offset", "byteCount", "([BII)Lxu/f;", "Lxu/r0;", "", "g2", "(Lxu/r0;)J", "", InquiryField.StringField.TYPE, "C0", "(Ljava/lang/String;)Lxu/f;", "beginIndex", "endIndex", "K0", "(Ljava/lang/String;II)Lxu/f;", "codePoint", "T", "(I)Lxu/f;", "b", "writeByte", "s", "writeShort", "i", "writeInt", "v", "z1", "(J)Lxu/f;", "D2", "", "flush", "()V", "j0", "()Lxu/f;", "Ljava/io/OutputStream;", "j3", "()Ljava/io/OutputStream;", "Lxu/e;", "k", "()Lxu/e;", "buffer", "Lxu/k0;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC12926f extends InterfaceC12947p0, WritableByteChannel {
    @NotNull
    /* JADX INFO: renamed from: C0 */
    InterfaceC12926f mo47992C0(@NotNull String string);

    @NotNull
    /* JADX INFO: renamed from: D2 */
    InterfaceC12926f mo47994D2(long v5);

    @NotNull
    /* JADX INFO: renamed from: K0 */
    InterfaceC12926f mo48001K0(@NotNull String string, int beginIndex, int endIndex);

    @NotNull
    /* JADX INFO: renamed from: T */
    InterfaceC12926f mo48009T(int codePoint);

    @NotNull
    /* JADX INFO: renamed from: d0 */
    InterfaceC12926f mo48023d0(@NotNull C12930h byteString);

    @Override // p560xu.InterfaceC12947p0, java.io.Flushable
    void flush();

    /* JADX INFO: renamed from: g2 */
    long mo48028g2(@NotNull InterfaceC12951r0 source);

    @NotNull
    /* JADX INFO: renamed from: j0 */
    InterfaceC12926f mo48034j0();

    @NotNull
    /* JADX INFO: renamed from: j3 */
    OutputStream mo48035j3();

    @NotNull
    /* JADX INFO: renamed from: k */
    C12924e mo48036k();

    @NotNull
    InterfaceC12926f write(@NotNull byte[] source);

    @NotNull
    InterfaceC12926f write(@NotNull byte[] source, int offset, int byteCount);

    @NotNull
    InterfaceC12926f writeByte(int b);

    @NotNull
    InterfaceC12926f writeInt(int i10);

    @NotNull
    InterfaceC12926f writeShort(int s8);

    @NotNull
    /* JADX INFO: renamed from: z1 */
    InterfaceC12926f mo48058z1(long v5);
}
