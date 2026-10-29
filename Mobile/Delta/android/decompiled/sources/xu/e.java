package xu;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001_B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0010H\u0087\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010#J\u000f\u00101\u001a\u00020*H\u0016¢\u0006\u0004\b1\u0010,J\u000f\u00102\u001a\u00020-H\u0016¢\u0006\u0004\b2\u0010/J\u000f\u00103\u001a\u00020\u0010H\u0016¢\u0006\u0004\b3\u0010#J\u000f\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u0010#J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u0010#J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u0002062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020-2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00102\u0006\u0010?\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020E2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020E2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020E2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020EH\u0016¢\u0006\u0004\bP\u0010GJ\u0017\u0010R\u001a\u00020E2\u0006\u0010Q\u001a\u00020\u0010H\u0016¢\u0006\u0004\bR\u0010IJ\u000f\u0010S\u001a\u00020-H\u0016¢\u0006\u0004\bS\u0010/J\u000f\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020T2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00122\u0006\u0010?\u001a\u00020TH\u0016¢\u0006\u0004\bY\u0010ZJ'\u0010[\u001a\u00020-2\u0006\u0010?\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010[\u001a\u00020-2\u0006\u0010?\u001a\u00020]H\u0016¢\u0006\u0004\b[\u0010^J\r\u0010_\u001a\u00020\u0012¢\u0006\u0004\b_\u0010\u0006J\u0017\u0010`\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b`\u0010\u0014J\u0017\u0010b\u001a\u00020\u00002\u0006\u0010a\u001a\u000206H\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010e\u001a\u00020\u00002\u0006\u0010d\u001a\u00020EH\u0016¢\u0006\u0004\be\u0010fJ'\u0010i\u001a\u00020\u00002\u0006\u0010d\u001a\u00020E2\u0006\u0010g\u001a\u00020-2\u0006\u0010h\u001a\u00020-H\u0016¢\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\u00020\u00002\u0006\u0010k\u001a\u00020-H\u0016¢\u0006\u0004\bl\u0010mJ\u001f\u0010n\u001a\u00020\u00002\u0006\u0010d\u001a\u00020E2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bn\u0010oJ/\u0010p\u001a\u00020\u00002\u0006\u0010d\u001a\u00020E2\u0006\u0010g\u001a\u00020-2\u0006\u0010h\u001a\u00020-2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020\u00002\u0006\u0010r\u001a\u00020TH\u0016¢\u0006\u0004\bs\u0010tJ'\u0010u\u001a\u00020\u00002\u0006\u0010r\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016¢\u0006\u0004\bu\u0010vJ\u0017\u0010w\u001a\u00020-2\u0006\u0010r\u001a\u00020]H\u0016¢\u0006\u0004\bw\u0010^J\u0017\u0010y\u001a\u00020\u00102\u0006\u0010r\u001a\u00020xH\u0016¢\u0006\u0004\by\u0010zJ\u001f\u0010{\u001a\u00020\u00002\u0006\u0010r\u001a\u00020x2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\u00002\u0006\u0010}\u001a\u00020-H\u0016¢\u0006\u0004\b~\u0010mJ\u0019\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010\u007f\u001a\u00020-H\u0016¢\u0006\u0005\b\u0080\u0001\u0010mJ\u001a\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020-H\u0016¢\u0006\u0005\b\u0082\u0001\u0010mJ\u001a\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020-H\u0016¢\u0006\u0005\b\u0083\u0001\u0010mJ\u001b\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0086\u0001J\u001c\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0089\u0001\u001a\u00020-H\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001f\u0010w\u001a\u00020\u00122\u0006\u0010r\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bw\u0010AJ \u0010[\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0005\b[\u0010\u008d\u0001J,\u0010\u0090\u0001\u001a\u00020\u00102\u0006\u0010}\u001a\u00020$2\u0007\u0010\u008e\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001b\u0010\u0093\u0001\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J$\u0010\u0095\u0001\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u0002062\u0007\u0010\u008e\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J-\u0010\u0097\u0001\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u0002062\u0007\u0010\u008e\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u00020\u00102\u0007\u0010\u0099\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u0094\u0001J$\u0010\u009b\u0001\u001a\u00020\u00102\u0007\u0010\u0099\u0001\u001a\u0002062\u0007\u0010\u008e\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u0096\u0001J#\u0010\u009c\u0001\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J4\u0010\u009f\u0001\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u0002062\u0007\u0010\u009e\u0001\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0011\u0010¡\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¡\u0001\u0010\u0006J\u0011\u0010¢\u0001\u001a\u00020\rH\u0016¢\u0006\u0005\b¢\u0001\u0010\u000fJ\u0011\u0010£\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b£\u0001\u0010\u0006J\u0013\u0010¥\u0001\u001a\u00030¤\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001f\u0010©\u0001\u001a\u00020\r2\n\u0010¨\u0001\u001a\u0005\u0018\u00010§\u0001H\u0096\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0011\u0010«\u0001\u001a\u00020-H\u0016¢\u0006\u0005\b«\u0001\u0010/J\u0011\u0010¬\u0001\u001a\u00020EH\u0016¢\u0006\u0005\b¬\u0001\u0010GJ\u000f\u0010\u00ad\u0001\u001a\u00020\u0000¢\u0006\u0005\b\u00ad\u0001\u0010\bJ\u000f\u0010}\u001a\u00020\u0000H\u0016¢\u0006\u0004\b}\u0010\bJ\u000f\u0010®\u0001\u001a\u000206¢\u0006\u0005\b®\u0001\u00108J\u0018\u0010¯\u0001\u001a\u0002062\u0006\u0010\u0011\u001a\u00020-¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001d\u0010\u007f\u001a\u00030±\u00012\n\b\u0002\u0010²\u0001\u001a\u00030±\u0001H\u0007¢\u0006\u0005\b\u007f\u0010³\u0001R\u001b\u0010µ\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0007\n\u0005\b_\u0010´\u0001R/\u0010¸\u0001\u001a\u00020\u00102\u0007\u0010¶\u0001\u001a\u00020\u00108\u0007@@X\u0086\u000e¢\u0006\u0015\n\u0005\b}\u0010·\u0001\u001a\u0005\b¸\u0001\u0010#\"\u0005\b¹\u0001\u0010\u0014R\u0016\u0010»\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\b¨\u0006¼\u0001"}, d2 = {"Lxu/e;", "Lxu/g;", "Lxu/f;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "O", "()Lxu/e;", "Ljava/io/OutputStream;", "j3", "()Ljava/io/OutputStream;", "h", "", "Z1", "()Z", "", "byteCount", "", "w1", "(J)V", "request", "(J)Z", "peek", "()Lxu/g;", "Ljava/io/InputStream;", "s3", "()Ljava/io/InputStream;", "out", "offset", "f", "(Lxu/e;JJ)Lxu/e;", "E0", "(Ljava/io/OutputStream;J)Lxu/e;", "c", "()J", "", "readByte", "()B", "pos", "j", "(J)B", "", "readShort", "()S", "", "readInt", "()I", "readLong", "j1", "M2", "m1", "i2", "o3", "Lxu/h;", "F2", "()Lxu/h;", "K1", "(J)Lxu/h;", "Lxu/f0;", "options", "l3", "(Lxu/f0;)I", "sink", "F1", "(Lxu/e;J)V", "Lxu/p0;", "K2", "(Lxu/p0;)J", "", "R2", "()Ljava/lang/String;", "G1", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "z2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "P", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "b1", "limit", "n0", "A2", "", "X1", "()[B", "w", "(J)[B", "readFully", "([B)V", "read", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "a", "skip", "byteString", "a0", "(Lxu/h;)Lxu/e;", InquiryField.StringField.TYPE, "H0", "(Ljava/lang/String;)Lxu/e;", "beginIndex", "endIndex", "J0", "(Ljava/lang/String;II)Lxu/e;", "codePoint", "L0", "(I)Lxu/e;", "D0", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lxu/e;", "A0", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lxu/e;", Payload.SOURCE, "e0", "([B)Lxu/e;", "f0", "([BII)Lxu/e;", "write", "Lxu/r0;", "g2", "(Lxu/r0;)J", "b0", "(Lxu/r0;J)Lxu/e;", "b", "i0", "s", "z0", "i", "t0", "x0", "v", "y0", "(J)Lxu/e;", "l0", "r0", "minimumCapacity", "Lxu/m0;", "Z", "(I)Lxu/m0;", "(Lxu/e;J)J", "fromIndex", "toIndex", "n", "(BJJ)J", "bytes", "V", "(Lxu/h;)J", "o", "(Lxu/h;J)J", "r1", "(Lxu/h;JJ)J", "targetBytes", "h0", "q", "o0", "(JLxu/h;)Z", "bytesOffset", "r", "(JLxu/h;II)Z", "flush", "isOpen", "close", "Lxu/s0;", "timeout", "()Lxu/s0;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "e", "X", "Y", "(I)Lxu/h;", "Lxu/e$a;", "unsafeCursor", "(Lxu/e$a;)Lxu/e$a;", "Lxu/m0;", "head", "value", "J", "size", "U", "k", "buffer", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements g, f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public m0 head;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long size;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0016\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006&"}, d2 = {"Lxu/e$a;", "Ljava/io/Closeable;", "<init>", "()V", "", "b", "()I", "", "offset", "d", "(J)I", "newSize", "c", "(J)J", "", "close", "Lxu/e;", "a", "Lxu/e;", "buffer", "", "Z", "readWrite", "Lxu/m0;", "Lxu/m0;", "()Lxu/m0;", "e", "(Lxu/m0;)V", "segment", "J", "", "[B", "data", "f", "I", "start", "g", "end", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public e buffer;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean readWrite;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public m0 segment;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public byte[] data;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public long offset = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int start = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public int end = -1;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final m0 getSegment() {
            return this.segment;
        }

        public final int b() {
            long j10 = this.offset;
            e eVar = this.buffer;
            Intrinsics.checkNotNull(eVar);
            if (j10 == eVar.getSize()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.offset;
            return d(j11 == -1 ? 0L : j11 + ((long) (this.end - this.start)));
        }

        public final long c(long newSize) {
            e eVar = this.buffer;
            if (eVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = eVar.getSize();
            if (newSize <= size) {
                if (newSize < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + newSize).toString());
                }
                long j10 = size - newSize;
                while (j10 > 0) {
                    m0 m0Var = eVar.head;
                    Intrinsics.checkNotNull(m0Var);
                    m0 m0Var2 = m0Var.prev;
                    Intrinsics.checkNotNull(m0Var2);
                    int i10 = m0Var2.limit;
                    long j11 = i10 - m0Var2.pos;
                    if (j11 > j10) {
                        m0Var2.limit = i10 - ((int) j10);
                        break;
                    }
                    eVar.head = m0Var2.b();
                    n0.b(m0Var2);
                    j10 -= j11;
                }
                e(null);
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j12 = newSize - size;
                boolean z10 = true;
                while (j12 > 0) {
                    m0 m0VarZ = eVar.Z(1);
                    int iMin = (int) Math.min(j12, 8192 - m0VarZ.limit);
                    m0VarZ.limit += iMin;
                    j12 -= (long) iMin;
                    if (z10) {
                        e(m0VarZ);
                        this.offset = size;
                        this.data = m0VarZ.data;
                        int i11 = m0VarZ.limit;
                        this.start = i11 - iMin;
                        this.end = i11;
                        z10 = false;
                    }
                }
            }
            eVar.U(newSize);
            return size;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            e(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final int d(long offset) {
            m0 m0VarC;
            e eVar = this.buffer;
            if (eVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (offset < -1 || offset > eVar.getSize()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + offset + " > size=" + eVar.getSize());
            }
            if (offset == -1 || offset == eVar.getSize()) {
                e(null);
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = eVar.getSize();
            m0 segment = eVar.head;
            long j10 = 0;
            if (getSegment() != null) {
                long j11 = this.offset;
                int i10 = this.start;
                m0 segment2 = getSegment();
                Intrinsics.checkNotNull(segment2);
                long j12 = j11 - ((long) (i10 - segment2.pos));
                if (j12 > offset) {
                    m0VarC = segment;
                    segment = getSegment();
                    size = j12;
                } else {
                    m0VarC = getSegment();
                    j10 = j12;
                }
            } else {
                m0VarC = segment;
            }
            if (size - offset > offset - j10) {
                while (true) {
                    Intrinsics.checkNotNull(m0VarC);
                    int i11 = m0VarC.limit;
                    int i12 = m0VarC.pos;
                    if (offset < ((long) (i11 - i12)) + j10) {
                        break;
                    }
                    j10 += (long) (i11 - i12);
                    m0VarC = m0VarC.next;
                }
            } else {
                while (size > offset) {
                    Intrinsics.checkNotNull(segment);
                    segment = segment.prev;
                    Intrinsics.checkNotNull(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                j10 = size;
                m0VarC = segment;
            }
            if (this.readWrite) {
                Intrinsics.checkNotNull(m0VarC);
                if (m0VarC.shared) {
                    m0 m0VarF = m0VarC.f();
                    if (eVar.head == m0VarC) {
                        eVar.head = m0VarF;
                    }
                    m0VarC = m0VarC.c(m0VarF);
                    m0 m0Var = m0VarC.prev;
                    Intrinsics.checkNotNull(m0Var);
                    m0Var.b();
                }
            }
            e(m0VarC);
            this.offset = offset;
            Intrinsics.checkNotNull(m0VarC);
            this.data = m0VarC.data;
            int i13 = m0VarC.pos + ((int) (offset - j10));
            this.start = i13;
            int i14 = m0VarC.limit;
            this.end = i14;
            return i14 - i13;
        }

        public final void e(@Nullable m0 m0Var) {
            this.segment = m0Var;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"xu/e$c", "Ljava/io/OutputStream;", "", "b", "", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", "close", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends OutputStream {
        public c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int b) {
            e.this.writeByte(b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int offset, int byteCount) {
            Intrinsics.checkNotNullParameter(data, "data");
            e.this.write(data, offset, byteCount);
        }
    }

    public static /* synthetic */ e F0(e eVar, OutputStream outputStream, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = eVar.size;
        }
        return eVar.E0(outputStream, j10);
    }

    public static /* synthetic */ a v(e eVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = xu.b.d();
        }
        return eVar.s(aVar);
    }

    @NotNull
    public e A0(@NotNull String string, int beginIndex, int endIndex, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        if (Intrinsics.c(charset, Charsets.UTF_8)) {
            return K0(string, beginIndex, endIndex);
        }
        String strSubstring = string.substring(beginIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @Override // xu.g
    public int A2() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (getSize() == 0) {
            throw new EOFException();
        }
        byte bJ = j(0L);
        if ((bJ & 128) == 0) {
            i10 = bJ & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bJ & 224) == 192) {
            i10 = bJ & 31;
            i11 = 2;
            i12 = 128;
        } else if ((bJ & 240) == 224) {
            i10 = bJ & 15;
            i11 = 3;
            i12 = Barcode.FORMAT_PDF417;
        } else {
            if ((bJ & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = bJ & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (getSize() < j10) {
            throw new EOFException("size < " + i11 + ": " + getSize() + " (to read code point prefixed 0x" + xu.b.k(bJ) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte bJ2 = j(j11);
            if ((bJ2 & 192) != 128) {
                skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (bJ2 & 63);
        }
        skip(j10);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    @NotNull
    public e D0(@NotNull String string, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return A0(string, 0, string.length(), charset);
    }

    @NotNull
    public final e E0(@NotNull OutputStream out, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        xu.b.b(this.size, 0L, byteCount);
        m0 m0Var = this.head;
        long j10 = byteCount;
        while (j10 > 0) {
            Intrinsics.checkNotNull(m0Var);
            int iMin = (int) Math.min(j10, m0Var.limit - m0Var.pos);
            out.write(m0Var.data, m0Var.pos, iMin);
            int i10 = m0Var.pos + iMin;
            m0Var.pos = i10;
            long j11 = iMin;
            this.size -= j11;
            j10 -= j11;
            if (i10 == m0Var.limit) {
                m0 m0VarB = m0Var.b();
                this.head = m0VarB;
                n0.b(m0Var);
                m0Var = m0VarB;
            }
        }
        return this;
    }

    @Override // xu.g
    public void F1(@NotNull e sink, long byteCount) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (getSize() >= byteCount) {
            sink.write(this, byteCount);
        } else {
            sink.write(this, getSize());
            throw new EOFException();
        }
    }

    @Override // xu.g
    @NotNull
    public h F2() {
        return K1(getSize());
    }

    @Override // xu.g
    @NotNull
    public String G1(long byteCount) throws EOFException {
        return P(byteCount, Charsets.UTF_8);
    }

    @Override // xu.f
    @NotNull
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public e C0(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return K0(string, 0, string.length());
    }

    @Override // xu.f
    @NotNull
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public e K0(@NotNull String string, int beginIndex, int endIndex) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        while (beginIndex < endIndex) {
            char cCharAt2 = string.charAt(beginIndex);
            if (cCharAt2 < 128) {
                m0 m0VarZ = Z(1);
                byte[] bArr = m0VarZ.data;
                int i10 = m0VarZ.limit - beginIndex;
                int iMin = Math.min(endIndex, 8192 - i10);
                int i11 = beginIndex + 1;
                bArr[beginIndex + i10] = (byte) cCharAt2;
                while (true) {
                    beginIndex = i11;
                    if (beginIndex >= iMin || (cCharAt = string.charAt(beginIndex)) >= 128) {
                        break;
                    }
                    i11 = beginIndex + 1;
                    bArr[beginIndex + i10] = (byte) cCharAt;
                }
                int i12 = m0VarZ.limit;
                int i13 = (i10 + beginIndex) - i12;
                m0VarZ.limit = i12 + i13;
                U(getSize() + ((long) i13));
            } else {
                if (cCharAt2 < 2048) {
                    m0 m0VarZ2 = Z(2);
                    byte[] bArr2 = m0VarZ2.data;
                    int i14 = m0VarZ2.limit;
                    bArr2[i14] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i14 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    m0VarZ2.limit = i14 + 2;
                    U(getSize() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    m0 m0VarZ3 = Z(3);
                    byte[] bArr3 = m0VarZ3.data;
                    int i15 = m0VarZ3.limit;
                    bArr3[i15] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i15 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    m0VarZ3.limit = i15 + 3;
                    U(getSize() + 3);
                } else {
                    int i16 = beginIndex + 1;
                    char cCharAt3 = i16 < endIndex ? string.charAt(i16) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        beginIndex = i16;
                    } else {
                        int i17 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        m0 m0VarZ4 = Z(4);
                        byte[] bArr4 = m0VarZ4.data;
                        int i18 = m0VarZ4.limit;
                        bArr4[i18] = (byte) ((i17 >> 18) | 240);
                        bArr4[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                        bArr4[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                        bArr4[i18 + 3] = (byte) ((i17 & 63) | 128);
                        m0VarZ4.limit = i18 + 4;
                        U(getSize() + 4);
                        beginIndex += 2;
                    }
                }
                beginIndex++;
            }
        }
        return this;
    }

    @Override // xu.g
    @NotNull
    public h K1(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new h(w(byteCount));
        }
        h hVarY = Y((int) byteCount);
        skip(byteCount);
        return hVarY;
    }

    @Override // xu.g
    public long K2(@NotNull p0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = getSize();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @Override // xu.f
    @NotNull
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public e T(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
            return this;
        }
        if (codePoint < 2048) {
            m0 m0VarZ = Z(2);
            byte[] bArr = m0VarZ.data;
            int i10 = m0VarZ.limit;
            bArr[i10] = (byte) ((codePoint >> 6) | 192);
            bArr[i10 + 1] = (byte) ((codePoint & 63) | 128);
            m0VarZ.limit = i10 + 2;
            U(getSize() + 2);
            return this;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            writeByte(63);
            return this;
        }
        if (codePoint < 65536) {
            m0 m0VarZ2 = Z(3);
            byte[] bArr2 = m0VarZ2.data;
            int i11 = m0VarZ2.limit;
            bArr2[i11] = (byte) ((codePoint >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((codePoint & 63) | 128);
            m0VarZ2.limit = i11 + 3;
            U(getSize() + 3);
            return this;
        }
        if (codePoint > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + xu.b.l(codePoint));
        }
        m0 m0VarZ3 = Z(4);
        byte[] bArr3 = m0VarZ3.data;
        int i12 = m0VarZ3.limit;
        bArr3[i12] = (byte) ((codePoint >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((codePoint & 63) | 128);
        m0VarZ3.limit = i12 + 4;
        U(getSize() + 4);
        return this;
    }

    @Override // xu.g
    public int M2() {
        return xu.b.h(readInt());
    }

    @Override // xu.g
    @NotNull
    public e O() {
        return this;
    }

    @NotNull
    public String P(long byteCount, @NotNull Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        int i10 = m0Var.pos;
        if (((long) i10) + byteCount > m0Var.limit) {
            return new String(w(byteCount), charset);
        }
        int i11 = (int) byteCount;
        String str = new String(m0Var.data, i10, i11, charset);
        int i12 = m0Var.pos + i11;
        m0Var.pos = i12;
        this.size -= byteCount;
        if (i12 == m0Var.limit) {
            this.head = m0Var.b();
            n0.b(m0Var);
        }
        return str;
    }

    @Override // xu.g
    @NotNull
    public String R2() {
        return P(this.size, Charsets.UTF_8);
    }

    public final void U(long j10) {
        this.size = j10;
    }

    @Override // xu.g
    public long V(@NotNull h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return o(bytes, 0L);
    }

    @NotNull
    public final h X() {
        if (getSize() <= 2147483647L) {
            return Y((int) getSize());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + getSize()).toString());
    }

    @Override // xu.g
    @NotNull
    public byte[] X1() {
        return w(getSize());
    }

    @NotNull
    public final h Y(int byteCount) {
        if (byteCount == 0) {
            return h.f35343e;
        }
        xu.b.b(getSize(), 0L, byteCount);
        m0 m0Var = this.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < byteCount) {
            Intrinsics.checkNotNull(m0Var);
            int i13 = m0Var.limit;
            int i14 = m0Var.pos;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            m0Var = m0Var.next;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        m0 m0Var2 = this.head;
        int i15 = 0;
        while (i10 < byteCount) {
            Intrinsics.checkNotNull(m0Var2);
            bArr[i15] = m0Var2.data;
            i10 += m0Var2.limit - m0Var2.pos;
            iArr[i15] = Math.min(i10, byteCount);
            iArr[i15 + i12] = m0Var2.pos;
            m0Var2.shared = true;
            i15++;
            m0Var2 = m0Var2.next;
        }
        return new o0(bArr, iArr);
    }

    @NotNull
    public final m0 Z(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        m0 m0Var = this.head;
        if (m0Var != null) {
            Intrinsics.checkNotNull(m0Var);
            m0 m0Var2 = m0Var.prev;
            Intrinsics.checkNotNull(m0Var2);
            return (m0Var2.limit + minimumCapacity > 8192 || !m0Var2.owner) ? m0Var2.c(n0.c()) : m0Var2;
        }
        m0 m0VarC = n0.c();
        this.head = m0VarC;
        m0VarC.prev = m0VarC;
        m0VarC.next = m0VarC;
        return m0VarC;
    }

    @Override // xu.g
    public boolean Z1() {
        return this.size == 0;
    }

    public final void a() throws EOFException {
        skip(getSize());
    }

    @Override // xu.f
    @NotNull
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public e d0(@NotNull h byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.Q(this, 0, byteString.I());
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return e();
    }

    @NotNull
    public e b0(@NotNull r0 source, long byteCount) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        while (byteCount > 0) {
            long j10 = source.read(this, byteCount);
            if (j10 == -1) {
                throw new EOFException();
            }
            byteCount -= j10;
        }
        return this;
    }

    @Override // xu.g
    @NotNull
    public String b1() {
        return n0(Long.MAX_VALUE);
    }

    public final long c() {
        long size = getSize();
        if (size == 0) {
            return 0L;
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        m0 m0Var2 = m0Var.prev;
        Intrinsics.checkNotNull(m0Var2);
        int i10 = m0Var2.limit;
        return (i10 >= 8192 || !m0Var2.owner) ? size : size - ((long) (i10 - m0Var2.pos));
    }

    @Override // xu.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @NotNull
    public final e e() {
        e eVar = new e();
        if (getSize() == 0) {
            return eVar;
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        m0 m0VarD = m0Var.d();
        eVar.head = m0VarD;
        m0VarD.prev = m0VarD;
        m0VarD.next = m0VarD;
        for (m0 m0Var2 = m0Var.next; m0Var2 != m0Var; m0Var2 = m0Var2.next) {
            m0 m0Var3 = m0VarD.prev;
            Intrinsics.checkNotNull(m0Var3);
            Intrinsics.checkNotNull(m0Var2);
            m0Var3.c(m0Var2.d());
        }
        eVar.U(getSize());
        return eVar;
    }

    @Override // xu.f
    @NotNull
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public e write(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        if (getSize() != eVar.getSize()) {
            return false;
        }
        if (getSize() == 0) {
            return true;
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        m0 m0Var2 = eVar.head;
        Intrinsics.checkNotNull(m0Var2);
        int i10 = m0Var.pos;
        int i11 = m0Var2.pos;
        long j10 = 0;
        while (j10 < getSize()) {
            long jMin = Math.min(m0Var.limit - i10, m0Var2.limit - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (m0Var.data[i10] != m0Var2.data[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == m0Var.limit) {
                m0Var = m0Var.next;
                Intrinsics.checkNotNull(m0Var);
                i10 = m0Var.pos;
            }
            if (i11 == m0Var2.limit) {
                m0Var2 = m0Var2.next;
                Intrinsics.checkNotNull(m0Var2);
                i11 = m0Var2.pos;
            }
            j10 += jMin;
        }
        return true;
    }

    @NotNull
    public final e f(@NotNull e out, long offset, long byteCount) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j10 = offset;
        xu.b.b(getSize(), j10, byteCount);
        if (byteCount != 0) {
            out.U(out.getSize() + byteCount);
            m0 m0Var = this.head;
            while (true) {
                Intrinsics.checkNotNull(m0Var);
                int i10 = m0Var.limit;
                int i11 = m0Var.pos;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                m0Var = m0Var.next;
            }
            m0 m0Var2 = m0Var;
            long j11 = byteCount;
            while (j11 > 0) {
                Intrinsics.checkNotNull(m0Var2);
                m0 m0VarD = m0Var2.d();
                int i12 = m0VarD.pos + ((int) j10);
                m0VarD.pos = i12;
                m0VarD.limit = Math.min(i12 + ((int) j11), m0VarD.limit);
                m0 m0Var3 = out.head;
                if (m0Var3 == null) {
                    m0VarD.prev = m0VarD;
                    m0VarD.next = m0VarD;
                    out.head = m0VarD;
                } else {
                    Intrinsics.checkNotNull(m0Var3);
                    m0 m0Var4 = m0Var3.prev;
                    Intrinsics.checkNotNull(m0Var4);
                    m0Var4.c(m0VarD);
                }
                j11 -= (long) (m0VarD.limit - m0VarD.pos);
                m0Var2 = m0Var2.next;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // xu.f
    @NotNull
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public e write(@NotNull byte[] source, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = byteCount;
        xu.b.b(source.length, offset, j10);
        int i10 = byteCount + offset;
        while (offset < i10) {
            m0 m0VarZ = Z(1);
            int iMin = Math.min(i10 - offset, 8192 - m0VarZ.limit);
            int i11 = offset + iMin;
            kotlin.collections.l.f(source, m0VarZ.data, m0VarZ.limit, offset, i11);
            m0VarZ.limit += iMin;
            offset = i11;
        }
        U(getSize() + j10);
        return this;
    }

    @Override // xu.f, xu.p0, java.io.Flushable
    public void flush() {
    }

    @Override // xu.f
    public long g2(@NotNull r0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @Override // xu.f
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e j0() {
        return this;
    }

    @Override // xu.g
    public long h0(@NotNull h targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return q(targetBytes, 0L);
    }

    public int hashCode() {
        m0 m0Var = this.head;
        if (m0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = m0Var.limit;
            for (int i12 = m0Var.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + m0Var.data[i12];
            }
            m0Var = m0Var.next;
            Intrinsics.checkNotNull(m0Var);
        } while (m0Var != this.head);
        return i10;
    }

    @Override // xu.f
    @NotNull
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public e writeByte(int b10) {
        m0 m0VarZ = Z(1);
        byte[] bArr = m0VarZ.data;
        int i10 = m0VarZ.limit;
        m0VarZ.limit = i10 + 1;
        bArr[i10] = (byte) b10;
        U(getSize() + 1);
        return this;
    }

    @Override // xu.g
    public long i2() throws EOFException {
        long j10;
        byte b10;
        long j11 = 0;
        if (getSize() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j12 = 0;
        long j13 = -7;
        boolean z11 = false;
        loop0: while (true) {
            m0 m0Var = this.head;
            Intrinsics.checkNotNull(m0Var);
            byte[] bArr = m0Var.data;
            int i11 = m0Var.pos;
            int i12 = m0Var.limit;
            while (true) {
                if (i11 >= i12) {
                    j10 = j11;
                    break;
                }
                b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j12 < -922337203685477580L) {
                        break loop0;
                    }
                    j10 = j11;
                    if (j12 == -922337203685477580L && i13 < j13) {
                        break loop0;
                    }
                    j12 = (j12 * 10) + ((long) i13);
                } else {
                    j10 = j11;
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j13--;
                    z10 = true;
                }
                i11++;
                i10++;
                j11 = j10;
            }
            if (i11 == i12) {
                this.head = m0Var.b();
                n0.b(m0Var);
            } else {
                m0Var.pos = i11;
            }
            if (z11 || this.head == null) {
                U(getSize() - ((long) i10));
                if (i10 >= (z10 ? 2 : 1)) {
                    return z10 ? j12 : -j12;
                }
                if (getSize() == j10) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + xu.b.k(j(j10)));
            }
            j11 = j10;
        }
        e eVarWriteByte = new e().z1(j12).writeByte(b10);
        if (!z10) {
            eVarWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + eVarWriteByte.R2());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final byte j(long pos) {
        xu.b.b(getSize(), pos, 1L);
        m0 m0Var = this.head;
        if (m0Var == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (getSize() - pos < pos) {
            long size = getSize();
            while (size > pos) {
                m0Var = m0Var.prev;
                Intrinsics.checkNotNull(m0Var);
                size -= (long) (m0Var.limit - m0Var.pos);
            }
            Intrinsics.checkNotNull(m0Var);
            return m0Var.data[(int) ((((long) m0Var.pos) + pos) - size)];
        }
        long j10 = 0;
        while (true) {
            long j11 = ((long) (m0Var.limit - m0Var.pos)) + j10;
            if (j11 > pos) {
                Intrinsics.checkNotNull(m0Var);
                return m0Var.data[(int) ((((long) m0Var.pos) + pos) - j10)];
            }
            m0Var = m0Var.next;
            Intrinsics.checkNotNull(m0Var);
            j10 = j11;
        }
    }

    @Override // xu.g
    public short j1() {
        return xu.b.j(readShort());
    }

    @Override // xu.f
    @NotNull
    public OutputStream j3() {
        return new c();
    }

    @Override // xu.g, xu.f
    @NotNull
    public e k() {
        return this;
    }

    @Override // xu.f
    @NotNull
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public e z1(long v5) {
        boolean z10;
        if (v5 == 0) {
            return writeByte(48);
        }
        if (v5 < 0) {
            v5 = -v5;
            if (v5 < 0) {
                return C0("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int iE = yu.a.e(v5);
        if (z10) {
            iE++;
        }
        m0 m0VarZ = Z(iE);
        byte[] bArr = m0VarZ.data;
        int i10 = m0VarZ.limit + iE;
        while (v5 != 0) {
            long j10 = 10;
            i10--;
            bArr[i10] = yu.a.f()[(int) (v5 % j10)];
            v5 /= j10;
        }
        if (z10) {
            bArr[i10 - 1] = 45;
        }
        m0VarZ.limit += iE;
        U(getSize() + ((long) iE));
        return this;
    }

    @Override // xu.g
    public int l3(@NotNull f0 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iJ = yu.a.j(this, options, false, 2, null);
        if (iJ == -1) {
            return -1;
        }
        skip(options.getByteStrings()[iJ].I());
        return iJ;
    }

    @Override // xu.g
    public long m1() {
        return xu.b.i(readLong());
    }

    public long n(byte b10, long fromIndex, long toIndex) {
        m0 m0Var;
        int i10;
        long size = 0;
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("size=" + getSize() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > getSize()) {
            toIndex = getSize();
        }
        if (fromIndex == toIndex || (m0Var = this.head) == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                m0Var = m0Var.prev;
                Intrinsics.checkNotNull(m0Var);
                size -= (long) (m0Var.limit - m0Var.pos);
            }
            while (size < toIndex) {
                byte[] bArr = m0Var.data;
                int iMin = (int) Math.min(m0Var.limit, (((long) m0Var.pos) + toIndex) - size);
                i10 = (int) ((((long) m0Var.pos) + fromIndex) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (m0Var.limit - m0Var.pos);
                m0Var = m0Var.next;
                Intrinsics.checkNotNull(m0Var);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (m0Var.limit - m0Var.pos)) + size;
            if (j10 > fromIndex) {
                break;
            }
            m0Var = m0Var.next;
            Intrinsics.checkNotNull(m0Var);
            size = j10;
        }
        while (size < toIndex) {
            byte[] bArr2 = m0Var.data;
            int iMin2 = (int) Math.min(m0Var.limit, (((long) m0Var.pos) + toIndex) - size);
            i10 = (int) ((((long) m0Var.pos) + fromIndex) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (m0Var.limit - m0Var.pos);
            m0Var = m0Var.next;
            Intrinsics.checkNotNull(m0Var);
            fromIndex = size;
        }
        return -1L;
        return ((long) (i10 - m0Var.pos)) + size;
    }

    @Override // xu.g
    @NotNull
    public String n0(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j10 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long jN = n((byte) 10, 0L, j10);
        if (jN != -1) {
            return yu.a.h(this, jN);
        }
        if (j10 < getSize() && j(j10 - 1) == 13 && j(j10) == 10) {
            return yu.a.h(this, j10);
        }
        e eVar = new e();
        f(eVar, 0L, Math.min(32, getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(getSize(), limit) + " content=" + eVar.F2().r() + (char) 8230);
    }

    public long o(@NotNull h bytes, long fromIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return r1(bytes, fromIndex, Long.MAX_VALUE);
    }

    @Override // xu.g
    public boolean o0(long offset, @NotNull h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return r(offset, bytes, 0, bytes.I());
    }

    @Override // xu.g
    public long o3() throws EOFException {
        int i10;
        if (getSize() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            m0 m0Var = this.head;
            Intrinsics.checkNotNull(m0Var);
            byte[] bArr = m0Var.data;
            int i12 = m0Var.pos;
            int i13 = m0Var.limit;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 != 0) {
                            z10 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + xu.b.k(b10));
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new e().D2(j10).writeByte(b10).R2());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.head = m0Var.b();
                n0.b(m0Var);
            } else {
                m0Var.pos = i12;
            }
            if (z10) {
                break;
            }
        } while (this.head != null);
        U(getSize() - ((long) i11));
        return j10;
    }

    @Override // xu.g
    @NotNull
    public g peek() {
        return b0.c(new i0(this));
    }

    public long q(@NotNull h targetBytes, long fromIndex) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (fromIndex < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + fromIndex).toString());
        }
        m0 m0Var = this.head;
        if (m0Var == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                m0Var = m0Var.prev;
                Intrinsics.checkNotNull(m0Var);
                size -= (long) (m0Var.limit - m0Var.pos);
            }
            if (targetBytes.I() == 2) {
                byte bJ = targetBytes.j(0);
                byte bJ2 = targetBytes.j(1);
                while (size < getSize()) {
                    byte[] bArr = m0Var.data;
                    i10 = (int) ((((long) m0Var.pos) + fromIndex) - size);
                    int i12 = m0Var.limit;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (m0Var.limit - m0Var.pos);
                            m0Var = m0Var.next;
                            Intrinsics.checkNotNull(m0Var);
                            fromIndex = size;
                        } else {
                            byte b10 = bArr[i10];
                            if (b10 == bJ || b10 == bJ2) {
                                i11 = m0Var.pos;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrW = targetBytes.w();
                while (size < getSize()) {
                    byte[] bArr2 = m0Var.data;
                    i10 = (int) ((((long) m0Var.pos) + fromIndex) - size);
                    int i13 = m0Var.limit;
                    while (true) {
                        if (i10 < i13) {
                            byte b11 = bArr2[i10];
                            int length = bArrW.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    i10++;
                                } else if (b11 == bArrW[i14]) {
                                    i11 = m0Var.pos;
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            size += (long) (m0Var.limit - m0Var.pos);
                            m0Var = m0Var.next;
                            Intrinsics.checkNotNull(m0Var);
                            fromIndex = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (m0Var.limit - m0Var.pos)) + size;
            if (j10 > fromIndex) {
                break;
            }
            m0Var = m0Var.next;
            Intrinsics.checkNotNull(m0Var);
            size = j10;
        }
        if (targetBytes.I() == 2) {
            byte bJ3 = targetBytes.j(0);
            byte bJ4 = targetBytes.j(1);
            while (size < getSize()) {
                byte[] bArr3 = m0Var.data;
                i10 = (int) ((((long) m0Var.pos) + fromIndex) - size);
                int i15 = m0Var.limit;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (m0Var.limit - m0Var.pos);
                        m0Var = m0Var.next;
                        Intrinsics.checkNotNull(m0Var);
                        fromIndex = size;
                    } else {
                        byte b12 = bArr3[i10];
                        if (b12 == bJ3 || b12 == bJ4) {
                            i11 = m0Var.pos;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrW2 = targetBytes.w();
            while (size < getSize()) {
                byte[] bArr4 = m0Var.data;
                i10 = (int) ((((long) m0Var.pos) + fromIndex) - size);
                int i16 = m0Var.limit;
                while (true) {
                    if (i10 < i16) {
                        byte b13 = bArr4[i10];
                        int length2 = bArrW2.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                i10++;
                            } else if (b13 == bArrW2[i17]) {
                                i11 = m0Var.pos;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        size += (long) (m0Var.limit - m0Var.pos);
                        m0Var = m0Var.next;
                        Intrinsics.checkNotNull(m0Var);
                        fromIndex = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    public boolean r(long offset, @NotNull h bytes, int bytesOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return byteCount >= 0 && offset >= 0 && ((long) byteCount) + offset <= getSize() && bytesOffset >= 0 && bytesOffset + byteCount <= bytes.I() && (byteCount == 0 || yu.a.b(this, bytes, offset, offset + 1, bytesOffset, byteCount) != -1);
    }

    @Override // xu.f
    @NotNull
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public e D2(long v5) {
        if (v5 == 0) {
            return writeByte(48);
        }
        long j10 = (v5 >>> 1) | v5;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        m0 m0VarZ = Z(i10);
        byte[] bArr = m0VarZ.data;
        int i11 = m0VarZ.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = yu.a.f()[(int) (15 & v5)];
            v5 >>>= 4;
        }
        m0VarZ.limit += i10;
        U(getSize() + ((long) i10));
        return this;
    }

    @Override // xu.g
    public long r1(@NotNull h bytes, long fromIndex, long toIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return yu.a.c(this, bytes, fromIndex, toIndex, 0, 0, 24, null);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        m0 m0Var = this.head;
        if (m0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), m0Var.limit - m0Var.pos);
        sink.put(m0Var.data, m0Var.pos, iMin);
        int i10 = m0Var.pos + iMin;
        m0Var.pos = i10;
        this.size -= (long) iMin;
        if (i10 == m0Var.limit) {
            this.head = m0Var.b();
            n0.b(m0Var);
        }
        return iMin;
    }

    @Override // xu.g
    public byte readByte() throws EOFException {
        if (getSize() == 0) {
            throw new EOFException();
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        int i10 = m0Var.pos;
        int i11 = m0Var.limit;
        int i12 = i10 + 1;
        byte b10 = m0Var.data[i10];
        U(getSize() - 1);
        if (i12 != i11) {
            m0Var.pos = i12;
            return b10;
        }
        this.head = m0Var.b();
        n0.b(m0Var);
        return b10;
    }

    @Override // xu.g
    public void readFully(@NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // xu.g
    public int readInt() throws EOFException {
        if (getSize() < 4) {
            throw new EOFException();
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        int i10 = m0Var.pos;
        int i11 = m0Var.limit;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = m0Var.data;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        U(getSize() - 4);
        if (i14 != i11) {
            m0Var.pos = i14;
            return i15;
        }
        this.head = m0Var.b();
        n0.b(m0Var);
        return i15;
    }

    @Override // xu.g
    public long readLong() throws EOFException {
        if (getSize() < 8) {
            throw new EOFException();
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        int i10 = m0Var.pos;
        int i11 = m0Var.limit;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = m0Var.data;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        U(getSize() - 8);
        if (i13 != i11) {
            m0Var.pos = i13;
            return j11;
        }
        this.head = m0Var.b();
        n0.b(m0Var);
        return j11;
    }

    @Override // xu.g
    public short readShort() throws EOFException {
        if (getSize() < 2) {
            throw new EOFException();
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        int i10 = m0Var.pos;
        int i11 = m0Var.limit;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = m0Var.data;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        U(getSize() - 2);
        if (i14 == i11) {
            this.head = m0Var.b();
            n0.b(m0Var);
        } else {
            m0Var.pos = i14;
        }
        return (short) i15;
    }

    @Override // xu.g
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    @NotNull
    public final a s(@NotNull a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return yu.a.d(this, unsafeCursor);
    }

    @Override // xu.g
    @NotNull
    public InputStream s3() {
        return new b();
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // xu.g
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            m0 m0Var = this.head;
            if (m0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(byteCount, m0Var.limit - m0Var.pos);
            long j10 = iMin;
            U(getSize() - j10);
            byteCount -= j10;
            int i10 = m0Var.pos + iMin;
            m0Var.pos = i10;
            if (i10 == m0Var.limit) {
                this.head = m0Var.b();
                n0.b(m0Var);
            }
        }
    }

    @Override // xu.f
    @NotNull
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public e writeInt(int i10) {
        m0 m0VarZ = Z(4);
        byte[] bArr = m0VarZ.data;
        int i11 = m0VarZ.limit;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        m0VarZ.limit = i11 + 4;
        U(getSize() + 4);
        return this;
    }

    @Override // xu.r0
    @NotNull
    public s0 timeout() {
        return s0.NONE;
    }

    @NotNull
    public String toString() {
        return X().toString();
    }

    @NotNull
    public byte[] w(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @Override // xu.g
    public void w1(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    @NotNull
    public e x0(int i10) {
        return writeInt(xu.b.h(i10));
    }

    @NotNull
    public e y0(long v5) {
        m0 m0VarZ = Z(8);
        byte[] bArr = m0VarZ.data;
        int i10 = m0VarZ.limit;
        bArr[i10] = (byte) ((v5 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((v5 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((v5 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((v5 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((v5 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((v5 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((v5 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (v5 & 255);
        m0VarZ.limit = i10 + 8;
        U(getSize() + 8);
        return this;
    }

    @Override // xu.f
    @NotNull
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public e writeShort(int s8) {
        m0 m0VarZ = Z(2);
        byte[] bArr = m0VarZ.data;
        int i10 = m0VarZ.limit;
        bArr[i10] = (byte) ((s8 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (s8 & 255);
        m0VarZ.limit = i10 + 2;
        U(getSize() + 2);
        return this;
    }

    @Override // xu.g
    @NotNull
    public String z2(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return P(this.size, charset);
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"xu/e$b", "Ljava/io/InputStream;", "", "read", "()I", "", "sink", "offset", "byteCount", "([BII)I", "available", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(e.this.getSize(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (e.this.getSize() > 0) {
                return e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int offset, int byteCount) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return e.this.read(sink, offset, byteCount);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            m0 m0VarZ = Z(1);
            int iMin = Math.min(i10, 8192 - m0VarZ.limit);
            source.get(m0VarZ.data, m0VarZ.limit, iMin);
            i10 -= iMin;
            m0VarZ.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    public int read(@NotNull byte[] sink, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        xu.b.b(sink.length, offset, byteCount);
        m0 m0Var = this.head;
        if (m0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, m0Var.limit - m0Var.pos);
        byte[] bArr = m0Var.data;
        int i10 = m0Var.pos;
        kotlin.collections.l.f(bArr, sink, offset, i10, i10 + iMin);
        m0Var.pos += iMin;
        U(getSize() - ((long) iMin));
        if (m0Var.pos == m0Var.limit) {
            this.head = m0Var.b();
            n0.b(m0Var);
        }
        return iMin;
    }

    @Override // xu.p0
    public void write(@NotNull e source, long byteCount) {
        m0 m0Var;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            xu.b.b(source.getSize(), 0L, byteCount);
            while (byteCount > 0) {
                m0 m0Var2 = source.head;
                Intrinsics.checkNotNull(m0Var2);
                int i10 = m0Var2.limit;
                m0 m0Var3 = source.head;
                Intrinsics.checkNotNull(m0Var3);
                if (byteCount < i10 - m0Var3.pos) {
                    m0 m0Var4 = this.head;
                    if (m0Var4 != null) {
                        Intrinsics.checkNotNull(m0Var4);
                        m0Var = m0Var4.prev;
                    } else {
                        m0Var = null;
                    }
                    if (m0Var != null && m0Var.owner) {
                        if ((((long) m0Var.limit) + byteCount) - ((long) (m0Var.shared ? 0 : m0Var.pos)) <= 8192) {
                            m0 m0Var5 = source.head;
                            Intrinsics.checkNotNull(m0Var5);
                            m0Var5.g(m0Var, (int) byteCount);
                            source.U(source.getSize() - byteCount);
                            U(getSize() + byteCount);
                            return;
                        }
                    }
                    m0 m0Var6 = source.head;
                    Intrinsics.checkNotNull(m0Var6);
                    source.head = m0Var6.e((int) byteCount);
                }
                m0 m0Var7 = source.head;
                Intrinsics.checkNotNull(m0Var7);
                long j10 = m0Var7.limit - m0Var7.pos;
                source.head = m0Var7.b();
                m0 m0Var8 = this.head;
                if (m0Var8 == null) {
                    this.head = m0Var7;
                    m0Var7.prev = m0Var7;
                    m0Var7.next = m0Var7;
                } else {
                    Intrinsics.checkNotNull(m0Var8);
                    m0 m0Var9 = m0Var8.prev;
                    Intrinsics.checkNotNull(m0Var9);
                    m0Var9.c(m0Var7).a();
                }
                source.U(source.getSize() - j10);
                U(getSize() + j10);
                byteCount -= j10;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // xu.r0
    public long read(@NotNull e sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (getSize() == 0) {
            return -1L;
        }
        if (byteCount > getSize()) {
            byteCount = getSize();
        }
        sink.write(this, byteCount);
        return byteCount;
    }
}
