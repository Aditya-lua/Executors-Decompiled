package p560xu;

import com.appsflyer.sdk_base.referrer.Payload;
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
import kotlin.collections.C7691l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p588yu.C13452a;

/* JADX INFO: renamed from: xu.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001_B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0010H\u0087\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010#J\u000f\u00101\u001a\u00020*H\u0016¢\u0006\u0004\b1\u0010,J\u000f\u00102\u001a\u00020-H\u0016¢\u0006\u0004\b2\u0010/J\u000f\u00103\u001a\u00020\u0010H\u0016¢\u0006\u0004\b3\u0010#J\u000f\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u0010#J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u0010#J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u0002062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020-2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00102\u0006\u0010?\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020E2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020E2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020E2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020EH\u0016¢\u0006\u0004\bP\u0010GJ\u0017\u0010R\u001a\u00020E2\u0006\u0010Q\u001a\u00020\u0010H\u0016¢\u0006\u0004\bR\u0010IJ\u000f\u0010S\u001a\u00020-H\u0016¢\u0006\u0004\bS\u0010/J\u000f\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020T2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00122\u0006\u0010?\u001a\u00020TH\u0016¢\u0006\u0004\bY\u0010ZJ'\u0010[\u001a\u00020-2\u0006\u0010?\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010[\u001a\u00020-2\u0006\u0010?\u001a\u00020]H\u0016¢\u0006\u0004\b[\u0010^J\r\u0010_\u001a\u00020\u0012¢\u0006\u0004\b_\u0010\u0006J\u0017\u0010`\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b`\u0010\u0014J\u0017\u0010b\u001a\u00020\u00002\u0006\u0010a\u001a\u000206H\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010e\u001a\u00020\u00002\u0006\u0010d\u001a\u00020EH\u0016¢\u0006\u0004\be\u0010fJ'\u0010i\u001a\u00020\u00002\u0006\u0010d\u001a\u00020E2\u0006\u0010g\u001a\u00020-2\u0006\u0010h\u001a\u00020-H\u0016¢\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\u00020\u00002\u0006\u0010k\u001a\u00020-H\u0016¢\u0006\u0004\bl\u0010mJ\u001f\u0010n\u001a\u00020\u00002\u0006\u0010d\u001a\u00020E2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bn\u0010oJ/\u0010p\u001a\u00020\u00002\u0006\u0010d\u001a\u00020E2\u0006\u0010g\u001a\u00020-2\u0006\u0010h\u001a\u00020-2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020\u00002\u0006\u0010r\u001a\u00020TH\u0016¢\u0006\u0004\bs\u0010tJ'\u0010u\u001a\u00020\u00002\u0006\u0010r\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016¢\u0006\u0004\bu\u0010vJ\u0017\u0010w\u001a\u00020-2\u0006\u0010r\u001a\u00020]H\u0016¢\u0006\u0004\bw\u0010^J\u0017\u0010y\u001a\u00020\u00102\u0006\u0010r\u001a\u00020xH\u0016¢\u0006\u0004\by\u0010zJ\u001f\u0010{\u001a\u00020\u00002\u0006\u0010r\u001a\u00020x2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\u00002\u0006\u0010}\u001a\u00020-H\u0016¢\u0006\u0004\b~\u0010mJ\u0019\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010\u007f\u001a\u00020-H\u0016¢\u0006\u0005\b\u0080\u0001\u0010mJ\u001a\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020-H\u0016¢\u0006\u0005\b\u0082\u0001\u0010mJ\u001a\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020-H\u0016¢\u0006\u0005\b\u0083\u0001\u0010mJ\u001b\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0086\u0001J\u001c\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0089\u0001\u001a\u00020-H\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001f\u0010w\u001a\u00020\u00122\u0006\u0010r\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bw\u0010AJ \u0010[\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0005\b[\u0010\u008d\u0001J,\u0010\u0090\u0001\u001a\u00020\u00102\u0006\u0010}\u001a\u00020$2\u0007\u0010\u008e\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001b\u0010\u0093\u0001\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J$\u0010\u0095\u0001\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u0002062\u0007\u0010\u008e\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J-\u0010\u0097\u0001\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u0002062\u0007\u0010\u008e\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u00020\u00102\u0007\u0010\u0099\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u0094\u0001J$\u0010\u009b\u0001\u001a\u00020\u00102\u0007\u0010\u0099\u0001\u001a\u0002062\u0007\u0010\u008e\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u0096\u0001J#\u0010\u009c\u0001\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J4\u0010\u009f\u0001\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u0002062\u0007\u0010\u009e\u0001\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0011\u0010¡\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¡\u0001\u0010\u0006J\u0011\u0010¢\u0001\u001a\u00020\rH\u0016¢\u0006\u0005\b¢\u0001\u0010\u000fJ\u0011\u0010£\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b£\u0001\u0010\u0006J\u0013\u0010¥\u0001\u001a\u00030¤\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001f\u0010©\u0001\u001a\u00020\r2\n\u0010¨\u0001\u001a\u0005\u0018\u00010§\u0001H\u0096\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0011\u0010«\u0001\u001a\u00020-H\u0016¢\u0006\u0005\b«\u0001\u0010/J\u0011\u0010¬\u0001\u001a\u00020EH\u0016¢\u0006\u0005\b¬\u0001\u0010GJ\u000f\u0010\u00ad\u0001\u001a\u00020\u0000¢\u0006\u0005\b\u00ad\u0001\u0010\bJ\u000f\u0010}\u001a\u00020\u0000H\u0016¢\u0006\u0004\b}\u0010\bJ\u000f\u0010®\u0001\u001a\u000206¢\u0006\u0005\b®\u0001\u00108J\u0018\u0010¯\u0001\u001a\u0002062\u0006\u0010\u0011\u001a\u00020-¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001d\u0010\u007f\u001a\u00030±\u00012\n\b\u0002\u0010²\u0001\u001a\u00030±\u0001H\u0007¢\u0006\u0005\b\u007f\u0010³\u0001R\u001b\u0010µ\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0007\n\u0005\b_\u0010´\u0001R/\u0010¸\u0001\u001a\u00020\u00102\u0007\u0010¶\u0001\u001a\u00020\u00108\u0007@@X\u0086\u000e¢\u0006\u0015\n\u0005\b}\u0010·\u0001\u001a\u0005\b¸\u0001\u0010#\"\u0005\b¹\u0001\u0010\u0014R\u0016\u0010»\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\b¨\u0006¼\u0001"}, m31665d2 = {"Lxu/e;", "Lxu/g;", "Lxu/f;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "O", "()Lxu/e;", "Ljava/io/OutputStream;", "j3", "()Ljava/io/OutputStream;", "h", "", "Z1", "()Z", "", "byteCount", "", "w1", "(J)V", "request", "(J)Z", "peek", "()Lxu/g;", "Ljava/io/InputStream;", "s3", "()Ljava/io/InputStream;", "out", "offset", "f", "(Lxu/e;JJ)Lxu/e;", "E0", "(Ljava/io/OutputStream;J)Lxu/e;", "c", "()J", "", "readByte", "()B", "pos", "j", "(J)B", "", "readShort", "()S", "", "readInt", "()I", "readLong", "k1", "M2", "n1", "i2", "o3", "Lxu/h;", "F2", "()Lxu/h;", "K1", "(J)Lxu/h;", "Lxu/f0;", "options", "l3", "(Lxu/f0;)I", "sink", "F1", "(Lxu/e;J)V", "Lxu/p0;", "K2", "(Lxu/p0;)J", "", "R2", "()Ljava/lang/String;", "G1", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "z2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "P", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "b1", "limit", "n0", "A2", "", "X1", "()[B", "w", "(J)[B", "readFully", "([B)V", "read", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "a", "skip", "byteString", "a0", "(Lxu/h;)Lxu/e;", InquiryField.StringField.TYPE, "H0", "(Ljava/lang/String;)Lxu/e;", "beginIndex", "endIndex", "J0", "(Ljava/lang/String;II)Lxu/e;", "codePoint", "L0", "(I)Lxu/e;", "D0", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lxu/e;", "A0", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lxu/e;", Payload.SOURCE, "e0", "([B)Lxu/e;", "f0", "([BII)Lxu/e;", "write", "Lxu/r0;", "g2", "(Lxu/r0;)J", "b0", "(Lxu/r0;J)Lxu/e;", "b", "i0", "s", "z0", "i", "t0", "x0", "v", "y0", "(J)Lxu/e;", "l0", "r0", "minimumCapacity", "Lxu/m0;", "Z", "(I)Lxu/m0;", "(Lxu/e;J)J", "fromIndex", "toIndex", "n", "(BJJ)J", "bytes", "V", "(Lxu/h;)J", "o", "(Lxu/h;J)J", "s1", "(Lxu/h;JJ)J", "targetBytes", "h0", "q", "o0", "(JLxu/h;)Z", "bytesOffset", "r", "(JLxu/h;II)Z", "flush", "isOpen", "close", "Lxu/s0;", "timeout", "()Lxu/s0;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "e", "X", "Y", "(I)Lxu/h;", "Lxu/e$a;", "unsafeCursor", "(Lxu/e$a;)Lxu/e$a;", "Lxu/m0;", "head", "value", "J", "size", "U", "k", "buffer", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12924e implements InterfaceC12928g, InterfaceC12926f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public C12941m0 head;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long size;

    /* JADX INFO: renamed from: xu.e$a */
    @Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0016\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006&"}, m31665d2 = {"Lxu/e$a;", "Ljava/io/Closeable;", "<init>", "()V", "", "b", "()I", "", "offset", "d", "(J)I", "newSize", "c", "(J)J", "", "close", "Lxu/e;", "a", "Lxu/e;", "buffer", "", "Z", "readWrite", "Lxu/m0;", "Lxu/m0;", "()Lxu/m0;", "e", "(Lxu/m0;)V", "segment", "J", "", "[B", "data", "f", "I", "start", "g", "end", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public C12924e buffer;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean readWrite;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public C12941m0 segment;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public byte[] data;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public long offset = -1;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public int start = -1;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public int end = -1;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final C12941m0 getSegment() {
            return this.segment;
        }

        /* JADX INFO: renamed from: b */
        public final int m48061b() {
            long j10 = this.offset;
            C12924e c12924e = this.buffer;
            Intrinsics.checkNotNull(c12924e);
            if (j10 == c12924e.getSize()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.offset;
            return m48063d(j11 == -1 ? 0L : j11 + ((long) (this.end - this.start)));
        }

        /* JADX INFO: renamed from: c */
        public final long m48062c(long newSize) {
            C12924e c12924e = this.buffer;
            if (c12924e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = c12924e.getSize();
            if (newSize <= size) {
                if (newSize < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + newSize).toString());
                }
                long j10 = size - newSize;
                while (j10 > 0) {
                    C12941m0 c12941m0 = c12924e.head;
                    Intrinsics.checkNotNull(c12941m0);
                    C12941m0 c12941m1 = c12941m0.prev;
                    Intrinsics.checkNotNull(c12941m1);
                    int i10 = c12941m1.limit;
                    long j11 = i10 - c12941m1.pos;
                    if (j11 > j10) {
                        c12941m1.limit = i10 - ((int) j10);
                        break;
                    }
                    c12924e.head = c12941m1.m48171b();
                    C12943n0.m48178b(c12941m1);
                    j10 -= j11;
                }
                m48064e(null);
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j12 = newSize - size;
                boolean z10 = true;
                while (j12 > 0) {
                    C12941m0 c12941m0M48015Z = c12924e.m48015Z(1);
                    int iMin = (int) Math.min(j12, 8192 - c12941m0M48015Z.limit);
                    c12941m0M48015Z.limit += iMin;
                    j12 -= (long) iMin;
                    if (z10) {
                        m48064e(c12941m0M48015Z);
                        this.offset = size;
                        this.data = c12941m0M48015Z.data;
                        int i11 = c12941m0M48015Z.limit;
                        this.start = i11 - iMin;
                        this.end = i11;
                        z10 = false;
                    }
                }
            }
            c12924e.m48010U(newSize);
            return size;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            m48064e(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        /* JADX INFO: renamed from: d */
        public final int m48063d(long offset) {
            C12941m0 c12941m0M48172c;
            C12924e c12924e = this.buffer;
            if (c12924e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (offset < -1 || offset > c12924e.getSize()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + offset + " > size=" + c12924e.getSize());
            }
            if (offset == -1 || offset == c12924e.getSize()) {
                m48064e(null);
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = c12924e.getSize();
            C12941m0 segment = c12924e.head;
            long j10 = 0;
            if (getSegment() != null) {
                long j11 = this.offset;
                int i10 = this.start;
                C12941m0 segment2 = getSegment();
                Intrinsics.checkNotNull(segment2);
                long j12 = j11 - ((long) (i10 - segment2.pos));
                if (j12 > offset) {
                    c12941m0M48172c = segment;
                    segment = getSegment();
                    size = j12;
                } else {
                    c12941m0M48172c = getSegment();
                    j10 = j12;
                }
            } else {
                c12941m0M48172c = segment;
            }
            if (size - offset > offset - j10) {
                while (true) {
                    Intrinsics.checkNotNull(c12941m0M48172c);
                    int i11 = c12941m0M48172c.limit;
                    int i12 = c12941m0M48172c.pos;
                    if (offset < ((long) (i11 - i12)) + j10) {
                        break;
                    }
                    j10 += (long) (i11 - i12);
                    c12941m0M48172c = c12941m0M48172c.next;
                }
            } else {
                while (size > offset) {
                    Intrinsics.checkNotNull(segment);
                    segment = segment.prev;
                    Intrinsics.checkNotNull(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                j10 = size;
                c12941m0M48172c = segment;
            }
            if (this.readWrite) {
                Intrinsics.checkNotNull(c12941m0M48172c);
                if (c12941m0M48172c.shared) {
                    C12941m0 c12941m0M48175f = c12941m0M48172c.m48175f();
                    if (c12924e.head == c12941m0M48172c) {
                        c12924e.head = c12941m0M48175f;
                    }
                    c12941m0M48172c = c12941m0M48172c.m48172c(c12941m0M48175f);
                    C12941m0 c12941m0 = c12941m0M48172c.prev;
                    Intrinsics.checkNotNull(c12941m0);
                    c12941m0.m48171b();
                }
            }
            m48064e(c12941m0M48172c);
            this.offset = offset;
            Intrinsics.checkNotNull(c12941m0M48172c);
            this.data = c12941m0M48172c.data;
            int i13 = c12941m0M48172c.pos + ((int) (offset - j10));
            this.start = i13;
            int i14 = c12941m0M48172c.limit;
            this.end = i14;
            return i14 - i13;
        }

        /* JADX INFO: renamed from: e */
        public final void m48064e(@Nullable C12941m0 c12941m0) {
            this.segment = c12941m0;
        }
    }

    /* JADX INFO: renamed from: xu.e$c */
    @Metadata(m31664d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"xu/e$c", "Ljava/io/OutputStream;", "", "b", "", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", "close", "", "toString", "()Ljava/lang/String;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
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
            return C12924e.this + ".outputStream()";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.OutputStream
        public void write(int b) {
            C12924e.this.writeByte(b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.io.OutputStream
        public void write(byte[] data, int offset, int byteCount) {
            Intrinsics.checkNotNullParameter(data, "data");
            C12924e.this.write(data, offset, byteCount);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ C12924e m47988F0(C12924e c12924e, OutputStream outputStream, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = c12924e.size;
        }
        return c12924e.m47995E0(outputStream, j10);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ a m47989v(C12924e c12924e, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = C12918b.m47950d();
        }
        return c12924e.m48049s(aVar);
    }

    @NotNull
    /* JADX INFO: renamed from: A0 */
    public C12924e m47990A0(@NotNull String string, int beginIndex, int endIndex, @NotNull Charset charset) {
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
        if (Intrinsics.m31980c(charset, Charsets.UTF_8)) {
            return mo48001K0(string, beginIndex, endIndex);
        }
        String strSubstring = string.substring(beginIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: A2 */
    public int mo47991A2() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (getSize() == 0) {
            throw new EOFException();
        }
        byte bM48033j = m48033j(0L);
        if ((bM48033j & 128) == 0) {
            i10 = bM48033j & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bM48033j & 224) == 192) {
            i10 = bM48033j & 31;
            i11 = 2;
            i12 = 128;
        } else if ((bM48033j & 240) == 224) {
            i10 = bM48033j & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((bM48033j & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = bM48033j & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (getSize() < j10) {
            throw new EOFException("size < " + i11 + ": " + getSize() + " (to read code point prefixed 0x" + C12918b.m47957k(bM48033j) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte bM48033j2 = m48033j(j11);
            if ((bM48033j2 & 192) != 128) {
                skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (bM48033j2 & 63);
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
    /* JADX INFO: renamed from: D0 */
    public C12924e m47993D0(@NotNull String string, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return m47990A0(string, 0, string.length(), charset);
    }

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public final C12924e m47995E0(@NotNull OutputStream out, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        C12918b.m47948b(this.size, 0L, byteCount);
        C12941m0 c12941m0 = this.head;
        long j10 = byteCount;
        while (j10 > 0) {
            Intrinsics.checkNotNull(c12941m0);
            int iMin = (int) Math.min(j10, c12941m0.limit - c12941m0.pos);
            out.write(c12941m0.data, c12941m0.pos, iMin);
            int i10 = c12941m0.pos + iMin;
            c12941m0.pos = i10;
            long j11 = iMin;
            this.size -= j11;
            j10 -= j11;
            if (i10 == c12941m0.limit) {
                C12941m0 c12941m0M48171b = c12941m0.m48171b();
                this.head = c12941m0M48171b;
                C12943n0.m48178b(c12941m0);
                c12941m0 = c12941m0M48171b;
            }
        }
        return this;
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: F1 */
    public void mo47996F1(@NotNull C12924e sink, long byteCount) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (getSize() >= byteCount) {
            sink.write(this, byteCount);
        } else {
            sink.write(this, getSize());
            throw new EOFException();
        }
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: F2 */
    public C12930h mo47997F2() {
        return mo48002K1(getSize());
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: G1 */
    public String mo47998G1(long byteCount) throws EOFException {
        return m48007P(byteCount, Charsets.UTF_8);
    }

    /* JADX DEBUG: Method merged with bridge method: C0(Ljava/lang/String;)Lxu/f; */
    @Override // p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public C12924e mo47992C0(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return mo48001K0(string, 0, string.length());
    }

    /* JADX DEBUG: Method merged with bridge method: K0(Ljava/lang/String;II)Lxu/f; */
    @Override // p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public C12924e mo48001K0(@NotNull String string, int beginIndex, int endIndex) {
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
                C12941m0 c12941m0M48015Z = m48015Z(1);
                byte[] bArr = c12941m0M48015Z.data;
                int i10 = c12941m0M48015Z.limit - beginIndex;
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
                int i12 = c12941m0M48015Z.limit;
                int i13 = (i10 + beginIndex) - i12;
                c12941m0M48015Z.limit = i12 + i13;
                m48010U(getSize() + ((long) i13));
            } else {
                if (cCharAt2 < 2048) {
                    C12941m0 c12941m0M48015Z2 = m48015Z(2);
                    byte[] bArr2 = c12941m0M48015Z2.data;
                    int i14 = c12941m0M48015Z2.limit;
                    bArr2[i14] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i14 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c12941m0M48015Z2.limit = i14 + 2;
                    m48010U(getSize() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C12941m0 c12941m0M48015Z3 = m48015Z(3);
                    byte[] bArr3 = c12941m0M48015Z3.data;
                    int i15 = c12941m0M48015Z3.limit;
                    bArr3[i15] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i15 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c12941m0M48015Z3.limit = i15 + 3;
                    m48010U(getSize() + 3);
                } else {
                    int i16 = beginIndex + 1;
                    char cCharAt3 = i16 < endIndex ? string.charAt(i16) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        beginIndex = i16;
                    } else {
                        int i17 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C12941m0 c12941m0M48015Z4 = m48015Z(4);
                        byte[] bArr4 = c12941m0M48015Z4.data;
                        int i18 = c12941m0M48015Z4.limit;
                        bArr4[i18] = (byte) ((i17 >> 18) | 240);
                        bArr4[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                        bArr4[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                        bArr4[i18 + 3] = (byte) ((i17 & 63) | 128);
                        c12941m0M48015Z4.limit = i18 + 4;
                        m48010U(getSize() + 4);
                        beginIndex += 2;
                    }
                }
                beginIndex++;
            }
        }
        return this;
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: K1 */
    public C12930h mo48002K1(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new C12930h(m48053w(byteCount));
        }
        C12930h c12930hM48014Y = m48014Y((int) byteCount);
        skip(byteCount);
        return c12930hM48014Y;
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: K2 */
    public long mo48003K2(@NotNull InterfaceC12947p0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = getSize();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    /* JADX DEBUG: Method merged with bridge method: T(I)Lxu/f; */
    @Override // p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public C12924e mo48009T(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
            return this;
        }
        if (codePoint < 2048) {
            C12941m0 c12941m0M48015Z = m48015Z(2);
            byte[] bArr = c12941m0M48015Z.data;
            int i10 = c12941m0M48015Z.limit;
            bArr[i10] = (byte) ((codePoint >> 6) | 192);
            bArr[i10 + 1] = (byte) ((codePoint & 63) | 128);
            c12941m0M48015Z.limit = i10 + 2;
            m48010U(getSize() + 2);
            return this;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            writeByte(63);
            return this;
        }
        if (codePoint < 65536) {
            C12941m0 c12941m0M48015Z2 = m48015Z(3);
            byte[] bArr2 = c12941m0M48015Z2.data;
            int i11 = c12941m0M48015Z2.limit;
            bArr2[i11] = (byte) ((codePoint >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((codePoint & 63) | 128);
            c12941m0M48015Z2.limit = i11 + 3;
            m48010U(getSize() + 3);
            return this;
        }
        if (codePoint > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C12918b.m47958l(codePoint));
        }
        C12941m0 c12941m0M48015Z3 = m48015Z(4);
        byte[] bArr3 = c12941m0M48015Z3.data;
        int i12 = c12941m0M48015Z3.limit;
        bArr3[i12] = (byte) ((codePoint >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((codePoint & 63) | 128);
        c12941m0M48015Z3.limit = i12 + 4;
        m48010U(getSize() + 4);
        return this;
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: M2 */
    public int mo48005M2() {
        return C12918b.m47954h(readInt());
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: O */
    public C12924e mo48006O() {
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public String m48007P(long byteCount, @NotNull Charset charset) throws EOFException {
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
        C12941m0 c12941m0 = this.head;
        Intrinsics.checkNotNull(c12941m0);
        int i10 = c12941m0.pos;
        if (((long) i10) + byteCount > c12941m0.limit) {
            return new String(m48053w(byteCount), charset);
        }
        int i11 = (int) byteCount;
        String str = new String(c12941m0.data, i10, i11, charset);
        int i12 = c12941m0.pos + i11;
        c12941m0.pos = i12;
        this.size -= byteCount;
        if (i12 == c12941m0.limit) {
            this.head = c12941m0.m48171b();
            C12943n0.m48178b(c12941m0);
        }
        return str;
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: R2 */
    public String mo48008R2() {
        return m48007P(this.size, Charsets.UTF_8);
    }

    /* JADX INFO: renamed from: U */
    public final void m48010U(long j10) {
        this.size = j10;
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: V */
    public long mo48011V(@NotNull C12930h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return m48043o(bytes, 0L);
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final C12930h m48012X() {
        if (getSize() <= 2147483647L) {
            return m48014Y((int) getSize());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + getSize()).toString());
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: X1 */
    public byte[] mo48013X1() {
        return m48053w(getSize());
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final C12930h m48014Y(int byteCount) {
        if (byteCount == 0) {
            return C12930h.f45830e;
        }
        C12918b.m47948b(getSize(), 0L, byteCount);
        C12941m0 c12941m0 = this.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < byteCount) {
            Intrinsics.checkNotNull(c12941m0);
            int i13 = c12941m0.limit;
            int i14 = c12941m0.pos;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            c12941m0 = c12941m0.next;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        C12941m0 c12941m1 = this.head;
        int i15 = 0;
        while (i10 < byteCount) {
            Intrinsics.checkNotNull(c12941m1);
            bArr[i15] = c12941m1.data;
            i10 += c12941m1.limit - c12941m1.pos;
            iArr[i15] = Math.min(i10, byteCount);
            iArr[i15 + i12] = c12941m1.pos;
            c12941m1.shared = true;
            i15++;
            c12941m1 = c12941m1.next;
        }
        return new C12945o0(bArr, iArr);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final C12941m0 m48015Z(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C12941m0 c12941m0 = this.head;
        if (c12941m0 != null) {
            Intrinsics.checkNotNull(c12941m0);
            C12941m0 c12941m1 = c12941m0.prev;
            Intrinsics.checkNotNull(c12941m1);
            return (c12941m1.limit + minimumCapacity > 8192 || !c12941m1.owner) ? c12941m1.m48172c(C12943n0.m48179c()) : c12941m1;
        }
        C12941m0 c12941m0M48179c = C12943n0.m48179c();
        this.head = c12941m0M48179c;
        c12941m0M48179c.prev = c12941m0M48179c;
        c12941m0M48179c.next = c12941m0M48179c;
        return c12941m0M48179c;
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: Z1 */
    public boolean mo48016Z1() {
        return this.size == 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m48017a() throws EOFException {
        skip(getSize());
    }

    /* JADX DEBUG: Method merged with bridge method: d0(Lxu/h;)Lxu/f; */
    @Override // p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public C12924e mo48023d0(@NotNull C12930h byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.mo48096Q(this, 0, byteString.m48089I());
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12924e clone() {
        return m48024e();
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public C12924e m48020b0(@NotNull InterfaceC12951r0 source, long byteCount) throws EOFException {
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

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: b1 */
    public String mo48021b1() {
        return mo48041n0(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public final long m48022c() {
        long size = getSize();
        if (size == 0) {
            return 0L;
        }
        C12941m0 c12941m0 = this.head;
        Intrinsics.checkNotNull(c12941m0);
        C12941m0 c12941m1 = c12941m0.prev;
        Intrinsics.checkNotNull(c12941m1);
        int i10 = c12941m1.limit;
        return (i10 >= 8192 || !c12941m1.owner) ? size : size - ((long) (i10 - c12941m1.pos));
    }

    @Override // p560xu.InterfaceC12951r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C12924e m48024e() {
        C12924e c12924e = new C12924e();
        if (getSize() == 0) {
            return c12924e;
        }
        C12941m0 c12941m0 = this.head;
        Intrinsics.checkNotNull(c12941m0);
        C12941m0 c12941m0M48173d = c12941m0.m48173d();
        c12924e.head = c12941m0M48173d;
        c12941m0M48173d.prev = c12941m0M48173d;
        c12941m0M48173d.next = c12941m0M48173d;
        for (C12941m0 c12941m1 = c12941m0.next; c12941m1 != c12941m0; c12941m1 = c12941m1.next) {
            C12941m0 c12941m2 = c12941m0M48173d.prev;
            Intrinsics.checkNotNull(c12941m2);
            Intrinsics.checkNotNull(c12941m1);
            c12941m2.m48172c(c12941m1.m48173d());
        }
        c12924e.m48010U(getSize());
        return c12924e;
    }

    /* JADX DEBUG: Method merged with bridge method: write([B)Lxu/f; */
    @Override // p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C12924e write(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12924e)) {
            return false;
        }
        C12924e c12924e = (C12924e) other;
        if (getSize() != c12924e.getSize()) {
            return false;
        }
        if (getSize() == 0) {
            return true;
        }
        C12941m0 c12941m0 = this.head;
        Intrinsics.checkNotNull(c12941m0);
        C12941m0 c12941m1 = c12924e.head;
        Intrinsics.checkNotNull(c12941m1);
        int i10 = c12941m0.pos;
        int i11 = c12941m1.pos;
        long j10 = 0;
        while (j10 < getSize()) {
            long jMin = Math.min(c12941m0.limit - i10, c12941m1.limit - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (c12941m0.data[i10] != c12941m1.data[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == c12941m0.limit) {
                c12941m0 = c12941m0.next;
                Intrinsics.checkNotNull(c12941m0);
                i10 = c12941m0.pos;
            }
            if (i11 == c12941m1.limit) {
                c12941m1 = c12941m1.next;
                Intrinsics.checkNotNull(c12941m1);
                i11 = c12941m1.pos;
            }
            j10 += jMin;
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final C12924e m48026f(@NotNull C12924e out, long offset, long byteCount) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j10 = offset;
        C12918b.m47948b(getSize(), j10, byteCount);
        if (byteCount != 0) {
            out.m48010U(out.getSize() + byteCount);
            C12941m0 c12941m0 = this.head;
            while (true) {
                Intrinsics.checkNotNull(c12941m0);
                int i10 = c12941m0.limit;
                int i11 = c12941m0.pos;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                c12941m0 = c12941m0.next;
            }
            C12941m0 c12941m1 = c12941m0;
            long j11 = byteCount;
            while (j11 > 0) {
                Intrinsics.checkNotNull(c12941m1);
                C12941m0 c12941m0M48173d = c12941m1.m48173d();
                int i12 = c12941m0M48173d.pos + ((int) j10);
                c12941m0M48173d.pos = i12;
                c12941m0M48173d.limit = Math.min(i12 + ((int) j11), c12941m0M48173d.limit);
                C12941m0 c12941m2 = out.head;
                if (c12941m2 == null) {
                    c12941m0M48173d.prev = c12941m0M48173d;
                    c12941m0M48173d.next = c12941m0M48173d;
                    out.head = c12941m0M48173d;
                } else {
                    Intrinsics.checkNotNull(c12941m2);
                    C12941m0 c12941m3 = c12941m2.prev;
                    Intrinsics.checkNotNull(c12941m3);
                    c12941m3.m48172c(c12941m0M48173d);
                }
                j11 -= (long) (c12941m0M48173d.limit - c12941m0M48173d.pos);
                c12941m1 = c12941m1.next;
                j10 = 0;
            }
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: write([BII)Lxu/f; */
    @Override // p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public C12924e write(@NotNull byte[] source, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = byteCount;
        C12918b.m47948b(source.length, offset, j10);
        int i10 = byteCount + offset;
        while (offset < i10) {
            C12941m0 c12941m0M48015Z = m48015Z(1);
            int iMin = Math.min(i10 - offset, 8192 - c12941m0M48015Z.limit);
            int i11 = offset + iMin;
            C7691l.m31811f(source, c12941m0M48015Z.data, c12941m0M48015Z.limit, offset, i11);
            c12941m0M48015Z.limit += iMin;
            offset = i11;
        }
        m48010U(getSize() + j10);
        return this;
    }

    @Override // p560xu.InterfaceC12926f, p560xu.InterfaceC12947p0, java.io.Flushable
    public void flush() {
    }

    @Override // p560xu.InterfaceC12926f
    /* JADX INFO: renamed from: g2 */
    public long mo48028g2(@NotNull InterfaceC12951r0 source) {
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

    /* JADX DEBUG: Method merged with bridge method: j0()Lxu/f; */
    @Override // p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C12924e mo48034j0() {
        return this;
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: h0 */
    public long mo48030h0(@NotNull C12930h targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return m48046q(targetBytes, 0L);
    }

    public int hashCode() {
        C12941m0 c12941m0 = this.head;
        if (c12941m0 == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = c12941m0.limit;
            for (int i12 = c12941m0.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + c12941m0.data[i12];
            }
            c12941m0 = c12941m0.next;
            Intrinsics.checkNotNull(c12941m0);
        } while (c12941m0 != this.head);
        return i10;
    }

    /* JADX DEBUG: Method merged with bridge method: writeByte(I)Lxu/f; */
    @Override // p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public C12924e writeByte(int b10) {
        C12941m0 c12941m0M48015Z = m48015Z(1);
        byte[] bArr = c12941m0M48015Z.data;
        int i10 = c12941m0M48015Z.limit;
        c12941m0M48015Z.limit = i10 + 1;
        bArr[i10] = (byte) b10;
        m48010U(getSize() + 1);
        return this;
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: i2 */
    public long mo48032i2() throws EOFException {
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
            C12941m0 c12941m0 = this.head;
            Intrinsics.checkNotNull(c12941m0);
            byte[] bArr = c12941m0.data;
            int i11 = c12941m0.pos;
            int i12 = c12941m0.limit;
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
                this.head = c12941m0.m48171b();
                C12943n0.m48178b(c12941m0);
            } else {
                c12941m0.pos = i11;
            }
            if (z11 || this.head == null) {
                m48010U(getSize() - ((long) i10));
                if (i10 >= (z10 ? 2 : 1)) {
                    return z10 ? j12 : -j12;
                }
                if (getSize() == j10) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + C12918b.m47957k(m48033j(j10)));
            }
            j11 = j10;
        }
        C12924e c12924eWriteByte = new C12924e().mo48058z1(j12).writeByte(b10);
        if (!z10) {
            c12924eWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + c12924eWriteByte.mo48008R2());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final byte m48033j(long pos) {
        C12918b.m47948b(getSize(), pos, 1L);
        C12941m0 c12941m0 = this.head;
        if (c12941m0 == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (getSize() - pos < pos) {
            long size = getSize();
            while (size > pos) {
                c12941m0 = c12941m0.prev;
                Intrinsics.checkNotNull(c12941m0);
                size -= (long) (c12941m0.limit - c12941m0.pos);
            }
            Intrinsics.checkNotNull(c12941m0);
            return c12941m0.data[(int) ((((long) c12941m0.pos) + pos) - size)];
        }
        long j10 = 0;
        while (true) {
            long j11 = ((long) (c12941m0.limit - c12941m0.pos)) + j10;
            if (j11 > pos) {
                Intrinsics.checkNotNull(c12941m0);
                return c12941m0.data[(int) ((((long) c12941m0.pos) + pos) - j10)];
            }
            c12941m0 = c12941m0.next;
            Intrinsics.checkNotNull(c12941m0);
            j10 = j11;
        }
    }

    @Override // p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: j3 */
    public OutputStream mo48035j3() {
        return new c();
    }

    @Override // p560xu.InterfaceC12928g, p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: k */
    public C12924e mo48036k() {
        return this;
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: k1 */
    public short mo48037k1() {
        return C12918b.m47956j(readShort());
    }

    /* JADX DEBUG: Class process forced to load method for inline: yu.a.a(long):int */
    /* JADX DEBUG: Method merged with bridge method: z1(J)Lxu/f; */
    @Override // p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C12924e mo48058z1(long v5) {
        boolean z10;
        if (v5 == 0) {
            return writeByte(48);
        }
        if (v5 < 0) {
            v5 = -v5;
            if (v5 < 0) {
                return mo47992C0("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int iM49055e = C13452a.m49055e(v5);
        if (z10) {
            iM49055e++;
        }
        C12941m0 c12941m0M48015Z = m48015Z(iM49055e);
        byte[] bArr = c12941m0M48015Z.data;
        int i10 = c12941m0M48015Z.limit + iM49055e;
        while (v5 != 0) {
            long j10 = 10;
            i10--;
            bArr[i10] = C13452a.m49056f()[(int) (v5 % j10)];
            v5 /= j10;
        }
        if (z10) {
            bArr[i10 - 1] = 45;
        }
        c12941m0M48015Z.limit += iM49055e;
        m48010U(getSize() + ((long) iM49055e));
        return this;
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: l3 */
    public int mo48039l3(@NotNull C12927f0 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iM49060j = C13452a.m49060j(this, options, false, 2, null);
        if (iM49060j == -1) {
            return -1;
        }
        skip(options.getByteStrings()[iM49060j].m48089I());
        return iM49060j;
    }

    /* JADX INFO: renamed from: n */
    public long m48040n(byte b10, long fromIndex, long toIndex) {
        C12941m0 c12941m0;
        int i10;
        long size = 0;
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("size=" + getSize() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > getSize()) {
            toIndex = getSize();
        }
        if (fromIndex == toIndex || (c12941m0 = this.head) == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                c12941m0 = c12941m0.prev;
                Intrinsics.checkNotNull(c12941m0);
                size -= (long) (c12941m0.limit - c12941m0.pos);
            }
            while (size < toIndex) {
                byte[] bArr = c12941m0.data;
                int iMin = (int) Math.min(c12941m0.limit, (((long) c12941m0.pos) + toIndex) - size);
                i10 = (int) ((((long) c12941m0.pos) + fromIndex) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (c12941m0.limit - c12941m0.pos);
                c12941m0 = c12941m0.next;
                Intrinsics.checkNotNull(c12941m0);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (c12941m0.limit - c12941m0.pos)) + size;
            if (j10 > fromIndex) {
                break;
            }
            c12941m0 = c12941m0.next;
            Intrinsics.checkNotNull(c12941m0);
            size = j10;
        }
        while (size < toIndex) {
            byte[] bArr2 = c12941m0.data;
            int iMin2 = (int) Math.min(c12941m0.limit, (((long) c12941m0.pos) + toIndex) - size);
            i10 = (int) ((((long) c12941m0.pos) + fromIndex) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (c12941m0.limit - c12941m0.pos);
            c12941m0 = c12941m0.next;
            Intrinsics.checkNotNull(c12941m0);
            fromIndex = size;
        }
        return -1L;
        return ((long) (i10 - c12941m0.pos)) + size;
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: n0 */
    public String mo48041n0(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j10 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long jM48040n = m48040n((byte) 10, 0L, j10);
        if (jM48040n != -1) {
            return C13452a.m49058h(this, jM48040n);
        }
        if (j10 < getSize() && m48033j(j10 - 1) == 13 && m48033j(j10) == 10) {
            return C13452a.m49058h(this, j10);
        }
        C12924e c12924e = new C12924e();
        m48026f(c12924e, 0L, Math.min(32, getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(getSize(), limit) + " content=" + c12924e.mo47997F2().mo48106r() + (char) 8230);
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: n1 */
    public long mo48042n1() {
        return C12918b.m47955i(readLong());
    }

    /* JADX INFO: renamed from: o */
    public long m48043o(@NotNull C12930h bytes, long fromIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return mo48050s1(bytes, fromIndex, Long.MAX_VALUE);
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: o0 */
    public boolean mo48044o0(long offset, @NotNull C12930h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return m48047r(offset, bytes, 0, bytes.m48089I());
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: o3 */
    public long mo48045o3() throws EOFException {
        int i10;
        if (getSize() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            C12941m0 c12941m0 = this.head;
            Intrinsics.checkNotNull(c12941m0);
            byte[] bArr = c12941m0.data;
            int i12 = c12941m0.pos;
            int i13 = c12941m0.limit;
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
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + C12918b.m47957k(b10));
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new C12924e().mo47994D2(j10).writeByte(b10).mo48008R2());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.head = c12941m0.m48171b();
                C12943n0.m48178b(c12941m0);
            } else {
                c12941m0.pos = i12;
            }
            if (z10) {
                break;
            }
        } while (this.head != null);
        m48010U(getSize() - ((long) i11));
        return j10;
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    public InterfaceC12928g peek() {
        return C12919b0.m47961c(new C12933i0(this));
    }

    /* JADX INFO: renamed from: q */
    public long m48046q(@NotNull C12930h targetBytes, long fromIndex) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (fromIndex < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + fromIndex).toString());
        }
        C12941m0 c12941m0 = this.head;
        if (c12941m0 == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                c12941m0 = c12941m0.prev;
                Intrinsics.checkNotNull(c12941m0);
                size -= (long) (c12941m0.limit - c12941m0.pos);
            }
            if (targetBytes.m48089I() == 2) {
                byte bM48101j = targetBytes.m48101j(0);
                byte bM48101j2 = targetBytes.m48101j(1);
                while (size < getSize()) {
                    byte[] bArr = c12941m0.data;
                    i10 = (int) ((((long) c12941m0.pos) + fromIndex) - size);
                    int i12 = c12941m0.limit;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (c12941m0.limit - c12941m0.pos);
                            c12941m0 = c12941m0.next;
                            Intrinsics.checkNotNull(c12941m0);
                            fromIndex = size;
                        } else {
                            byte b10 = bArr[i10];
                            if (b10 == bM48101j || b10 == bM48101j2) {
                                i11 = c12941m0.pos;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrMo48109w = targetBytes.mo48109w();
                while (size < getSize()) {
                    byte[] bArr2 = c12941m0.data;
                    i10 = (int) ((((long) c12941m0.pos) + fromIndex) - size);
                    int i13 = c12941m0.limit;
                    while (true) {
                        if (i10 < i13) {
                            byte b11 = bArr2[i10];
                            int length = bArrMo48109w.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    i10++;
                                } else if (b11 == bArrMo48109w[i14]) {
                                    i11 = c12941m0.pos;
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            size += (long) (c12941m0.limit - c12941m0.pos);
                            c12941m0 = c12941m0.next;
                            Intrinsics.checkNotNull(c12941m0);
                            fromIndex = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (c12941m0.limit - c12941m0.pos)) + size;
            if (j10 > fromIndex) {
                break;
            }
            c12941m0 = c12941m0.next;
            Intrinsics.checkNotNull(c12941m0);
            size = j10;
        }
        if (targetBytes.m48089I() == 2) {
            byte bM48101j3 = targetBytes.m48101j(0);
            byte bM48101j4 = targetBytes.m48101j(1);
            while (size < getSize()) {
                byte[] bArr3 = c12941m0.data;
                i10 = (int) ((((long) c12941m0.pos) + fromIndex) - size);
                int i15 = c12941m0.limit;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (c12941m0.limit - c12941m0.pos);
                        c12941m0 = c12941m0.next;
                        Intrinsics.checkNotNull(c12941m0);
                        fromIndex = size;
                    } else {
                        byte b12 = bArr3[i10];
                        if (b12 == bM48101j3 || b12 == bM48101j4) {
                            i11 = c12941m0.pos;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrMo48109w2 = targetBytes.mo48109w();
            while (size < getSize()) {
                byte[] bArr4 = c12941m0.data;
                i10 = (int) ((((long) c12941m0.pos) + fromIndex) - size);
                int i16 = c12941m0.limit;
                while (true) {
                    if (i10 < i16) {
                        byte b13 = bArr4[i10];
                        int length2 = bArrMo48109w2.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                i10++;
                            } else if (b13 == bArrMo48109w2[i17]) {
                                i11 = c12941m0.pos;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        size += (long) (c12941m0.limit - c12941m0.pos);
                        c12941m0 = c12941m0.next;
                        Intrinsics.checkNotNull(c12941m0);
                        fromIndex = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    /* JADX INFO: renamed from: r */
    public boolean m48047r(long offset, @NotNull C12930h bytes, int bytesOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return byteCount >= 0 && offset >= 0 && ((long) byteCount) + offset <= getSize() && bytesOffset >= 0 && bytesOffset + byteCount <= bytes.m48089I() && (byteCount == 0 || C13452a.m49052b(this, bytes, offset, offset + 1, bytesOffset, byteCount) != -1);
    }

    /* JADX DEBUG: Method merged with bridge method: D2(J)Lxu/f; */
    @Override // p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C12924e mo47994D2(long v5) {
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
        C12941m0 c12941m0M48015Z = m48015Z(i10);
        byte[] bArr = c12941m0M48015Z.data;
        int i11 = c12941m0M48015Z.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = C13452a.m49056f()[(int) (15 & v5)];
            v5 >>>= 4;
        }
        c12941m0M48015Z.limit += i10;
        m48010U(getSize() + ((long) i10));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C12941m0 c12941m0 = this.head;
        if (c12941m0 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), c12941m0.limit - c12941m0.pos);
        sink.put(c12941m0.data, c12941m0.pos, iMin);
        int i10 = c12941m0.pos + iMin;
        c12941m0.pos = i10;
        this.size -= (long) iMin;
        if (i10 == c12941m0.limit) {
            this.head = c12941m0.m48171b();
            C12943n0.m48178b(c12941m0);
        }
        return iMin;
    }

    @Override // p560xu.InterfaceC12928g
    public byte readByte() throws EOFException {
        if (getSize() == 0) {
            throw new EOFException();
        }
        C12941m0 c12941m0 = this.head;
        Intrinsics.checkNotNull(c12941m0);
        int i10 = c12941m0.pos;
        int i11 = c12941m0.limit;
        int i12 = i10 + 1;
        byte b10 = c12941m0.data[i10];
        m48010U(getSize() - 1);
        if (i12 != i11) {
            c12941m0.pos = i12;
            return b10;
        }
        this.head = c12941m0.m48171b();
        C12943n0.m48178b(c12941m0);
        return b10;
    }

    @Override // p560xu.InterfaceC12928g
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

    @Override // p560xu.InterfaceC12928g
    public int readInt() throws EOFException {
        if (getSize() < 4) {
            throw new EOFException();
        }
        C12941m0 c12941m0 = this.head;
        Intrinsics.checkNotNull(c12941m0);
        int i10 = c12941m0.pos;
        int i11 = c12941m0.limit;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c12941m0.data;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        m48010U(getSize() - 4);
        if (i14 != i11) {
            c12941m0.pos = i14;
            return i15;
        }
        this.head = c12941m0.m48171b();
        C12943n0.m48178b(c12941m0);
        return i15;
    }

    @Override // p560xu.InterfaceC12928g
    public long readLong() throws EOFException {
        if (getSize() < 8) {
            throw new EOFException();
        }
        C12941m0 c12941m0 = this.head;
        Intrinsics.checkNotNull(c12941m0);
        int i10 = c12941m0.pos;
        int i11 = c12941m0.limit;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c12941m0.data;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        m48010U(getSize() - 8);
        if (i13 != i11) {
            c12941m0.pos = i13;
            return j11;
        }
        this.head = c12941m0.m48171b();
        C12943n0.m48178b(c12941m0);
        return j11;
    }

    @Override // p560xu.InterfaceC12928g
    public short readShort() throws EOFException {
        if (getSize() < 2) {
            throw new EOFException();
        }
        C12941m0 c12941m0 = this.head;
        Intrinsics.checkNotNull(c12941m0);
        int i10 = c12941m0.pos;
        int i11 = c12941m0.limit;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c12941m0.data;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        m48010U(getSize() - 2);
        if (i14 == i11) {
            this.head = c12941m0.m48171b();
            C12943n0.m48178b(c12941m0);
        } else {
            c12941m0.pos = i14;
        }
        return (short) i15;
    }

    @Override // p560xu.InterfaceC12928g
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final a m48049s(@NotNull a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return C13452a.m49054d(this, unsafeCursor);
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: s1 */
    public long mo48050s1(@NotNull C12930h bytes, long fromIndex, long toIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return C13452a.m49053c(this, bytes, fromIndex, toIndex, 0, 0, 24, null);
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: s3 */
    public InputStream mo48051s3() {
        return new b();
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // p560xu.InterfaceC12928g
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            C12941m0 c12941m0 = this.head;
            if (c12941m0 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(byteCount, c12941m0.limit - c12941m0.pos);
            long j10 = iMin;
            m48010U(getSize() - j10);
            byteCount -= j10;
            int i10 = c12941m0.pos + iMin;
            c12941m0.pos = i10;
            if (i10 == c12941m0.limit) {
                this.head = c12941m0.m48171b();
                C12943n0.m48178b(c12941m0);
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: writeInt(I)Lxu/f; */
    @Override // p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C12924e writeInt(int i10) {
        C12941m0 c12941m0M48015Z = m48015Z(4);
        byte[] bArr = c12941m0M48015Z.data;
        int i11 = c12941m0M48015Z.limit;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        c12941m0M48015Z.limit = i11 + 4;
        m48010U(getSize() + 4);
        return this;
    }

    @Override // p560xu.InterfaceC12951r0
    @NotNull
    public C12953s0 timeout() {
        return C12953s0.NONE;
    }

    @NotNull
    public String toString() {
        return m48012X().toString();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public byte[] m48053w(long byteCount) throws EOFException {
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

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: w1 */
    public void mo48054w1(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public C12924e m48055x0(int i10) {
        return writeInt(C12918b.m47954h(i10));
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public C12924e m48056y0(long v5) {
        C12941m0 c12941m0M48015Z = m48015Z(8);
        byte[] bArr = c12941m0M48015Z.data;
        int i10 = c12941m0M48015Z.limit;
        bArr[i10] = (byte) ((v5 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((v5 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((v5 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((v5 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((v5 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((v5 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((v5 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (v5 & 255);
        c12941m0M48015Z.limit = i10 + 8;
        m48010U(getSize() + 8);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: writeShort(I)Lxu/f; */
    @Override // p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public C12924e writeShort(int s8) {
        C12941m0 c12941m0M48015Z = m48015Z(2);
        byte[] bArr = c12941m0M48015Z.data;
        int i10 = c12941m0M48015Z.limit;
        bArr[i10] = (byte) ((s8 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (s8 & 255);
        c12941m0M48015Z.limit = i10 + 2;
        m48010U(getSize() + 2);
        return this;
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: z2 */
    public String mo48059z2(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return m48007P(this.size, charset);
    }

    /* JADX INFO: renamed from: xu.e$b */
    @Metadata(m31664d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"xu/e$b", "Ljava/io/InputStream;", "", "read", "()I", "", "sink", "offset", "byteCount", "([BII)I", "available", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C12924e.this.getSize(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.InputStream
        public int read() {
            if (C12924e.this.getSize() > 0) {
                return C12924e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C12924e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int offset, int byteCount) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return C12924e.this.read(sink, offset, byteCount);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            C12941m0 c12941m0M48015Z = m48015Z(1);
            int iMin = Math.min(i10, 8192 - c12941m0M48015Z.limit);
            source.get(c12941m0M48015Z.data, c12941m0M48015Z.limit, iMin);
            i10 -= iMin;
            c12941m0M48015Z.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    public int read(@NotNull byte[] sink, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C12918b.m47948b(sink.length, offset, byteCount);
        C12941m0 c12941m0 = this.head;
        if (c12941m0 == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, c12941m0.limit - c12941m0.pos);
        byte[] bArr = c12941m0.data;
        int i10 = c12941m0.pos;
        C7691l.m31811f(bArr, sink, offset, i10, i10 + iMin);
        c12941m0.pos += iMin;
        m48010U(getSize() - ((long) iMin));
        if (c12941m0.pos == c12941m0.limit) {
            this.head = c12941m0.m48171b();
            C12943n0.m48178b(c12941m0);
        }
        return iMin;
    }

    @Override // p560xu.InterfaceC12947p0
    public void write(@NotNull C12924e source, long byteCount) {
        C12941m0 c12941m0;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            C12918b.m47948b(source.getSize(), 0L, byteCount);
            while (byteCount > 0) {
                C12941m0 c12941m1 = source.head;
                Intrinsics.checkNotNull(c12941m1);
                int i10 = c12941m1.limit;
                C12941m0 c12941m2 = source.head;
                Intrinsics.checkNotNull(c12941m2);
                if (byteCount < i10 - c12941m2.pos) {
                    C12941m0 c12941m3 = this.head;
                    if (c12941m3 != null) {
                        Intrinsics.checkNotNull(c12941m3);
                        c12941m0 = c12941m3.prev;
                    } else {
                        c12941m0 = null;
                    }
                    if (c12941m0 != null && c12941m0.owner) {
                        if ((((long) c12941m0.limit) + byteCount) - ((long) (c12941m0.shared ? 0 : c12941m0.pos)) <= 8192) {
                            C12941m0 c12941m4 = source.head;
                            Intrinsics.checkNotNull(c12941m4);
                            c12941m4.m48176g(c12941m0, (int) byteCount);
                            source.m48010U(source.getSize() - byteCount);
                            m48010U(getSize() + byteCount);
                            return;
                        }
                    }
                    C12941m0 c12941m5 = source.head;
                    Intrinsics.checkNotNull(c12941m5);
                    source.head = c12941m5.m48174e((int) byteCount);
                }
                C12941m0 c12941m6 = source.head;
                Intrinsics.checkNotNull(c12941m6);
                long j10 = c12941m6.limit - c12941m6.pos;
                source.head = c12941m6.m48171b();
                C12941m0 c12941m7 = this.head;
                if (c12941m7 == null) {
                    this.head = c12941m6;
                    c12941m6.prev = c12941m6;
                    c12941m6.next = c12941m6;
                } else {
                    Intrinsics.checkNotNull(c12941m7);
                    C12941m0 c12941m8 = c12941m7.prev;
                    Intrinsics.checkNotNull(c12941m8);
                    c12941m8.m48172c(c12941m6).m48170a();
                }
                source.m48010U(source.getSize() - j10);
                m48010U(getSize() + j10);
                byteCount -= j10;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // p560xu.InterfaceC12951r0
    public long read(@NotNull C12924e sink, long byteCount) {
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
