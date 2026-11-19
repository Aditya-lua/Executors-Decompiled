package ew;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001]B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0010H\u0087\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010#J\u000f\u00101\u001a\u00020*H\u0016¢\u0006\u0004\b1\u0010,J\u000f\u00102\u001a\u00020-H\u0016¢\u0006\u0004\b2\u0010/J\u000f\u00103\u001a\u00020\u0010H\u0016¢\u0006\u0004\b3\u0010#J\u000f\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u0010#J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u0010#J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u0002062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020-2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00102\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020C2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020C2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u00020C2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020CH\u0016¢\u0006\u0004\bN\u0010EJ\u0017\u0010P\u001a\u00020C2\u0006\u0010O\u001a\u00020\u0010H\u0016¢\u0006\u0004\bP\u0010GJ\u000f\u0010Q\u001a\u00020-H\u0016¢\u0006\u0004\bQ\u0010/J\u000f\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020R2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u00122\u0006\u0010@\u001a\u00020RH\u0016¢\u0006\u0004\bW\u0010XJ'\u0010Y\u001a\u00020-2\u0006\u0010@\u001a\u00020R2\u0006\u0010\u001d\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010Y\u001a\u00020-2\u0006\u0010@\u001a\u00020[H\u0016¢\u0006\u0004\bY\u0010\\J\r\u0010]\u001a\u00020\u0012¢\u0006\u0004\b]\u0010\u0006J\u0017\u0010^\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b^\u0010\u0014J\u0017\u0010`\u001a\u00020\u00002\u0006\u0010_\u001a\u000206H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u00002\u0006\u0010b\u001a\u00020CH\u0016¢\u0006\u0004\bc\u0010dJ'\u0010g\u001a\u00020\u00002\u0006\u0010b\u001a\u00020C2\u0006\u0010e\u001a\u00020-2\u0006\u0010f\u001a\u00020-H\u0016¢\u0006\u0004\bg\u0010hJ\u0017\u0010j\u001a\u00020\u00002\u0006\u0010i\u001a\u00020-H\u0016¢\u0006\u0004\bj\u0010kJ\u001f\u0010l\u001a\u00020\u00002\u0006\u0010b\u001a\u00020C2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bl\u0010mJ/\u0010n\u001a\u00020\u00002\u0006\u0010b\u001a\u00020C2\u0006\u0010e\u001a\u00020-2\u0006\u0010f\u001a\u00020-2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bn\u0010oJ\u0017\u0010q\u001a\u00020\u00002\u0006\u0010p\u001a\u00020RH\u0016¢\u0006\u0004\bq\u0010rJ'\u0010s\u001a\u00020\u00002\u0006\u0010p\u001a\u00020R2\u0006\u0010\u001d\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020-2\u0006\u0010p\u001a\u00020[H\u0016¢\u0006\u0004\bu\u0010\\J\u0017\u0010w\u001a\u00020\u00102\u0006\u0010p\u001a\u00020vH\u0016¢\u0006\u0004\bw\u0010xJ\u0017\u0010z\u001a\u00020\u00002\u0006\u0010y\u001a\u00020-H\u0016¢\u0006\u0004\bz\u0010kJ\u0017\u0010|\u001a\u00020\u00002\u0006\u0010{\u001a\u00020-H\u0016¢\u0006\u0004\b|\u0010kJ\u0017\u0010~\u001a\u00020\u00002\u0006\u0010}\u001a\u00020-H\u0016¢\u0006\u0004\b~\u0010kJ\u001a\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010\u007f\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001a\u0010\u0082\u0001\u001a\u00020\u00002\u0006\u0010\u007f\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001J\u001c\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0083\u0001\u001a\u00020-H\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\"\u0010\u0087\u0001\u001a\u00020\u00122\u0006\u0010p\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\"\u0010\u0089\u0001\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J,\u0010\u008d\u0001\u001a\u00020\u00102\u0006\u0010y\u001a\u00020$2\u0007\u0010\u008b\u0001\u001a\u00020\u00102\u0007\u0010\u008c\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001b\u0010\u0090\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J$\u0010\u0092\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u0002062\u0007\u0010\u008b\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J-\u0010\u0094\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u0002062\u0007\u0010\u008b\u0001\u001a\u00020\u00102\u0007\u0010\u008c\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001b\u0010\u0097\u0001\u001a\u00020\u00102\u0007\u0010\u0096\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0091\u0001J\"\u0010{\u001a\u00020\u00102\u0007\u0010\u0096\u0001\u001a\u0002062\u0007\u0010\u008b\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b{\u0010\u0093\u0001J#\u0010\u0098\u0001\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J4\u0010\u009b\u0001\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u0002062\u0007\u0010\u009a\u0001\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0011\u0010\u009d\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009d\u0001\u0010\u0006J\u0011\u0010\u009e\u0001\u001a\u00020\rH\u0016¢\u0006\u0005\b\u009e\u0001\u0010\u000fJ\u0011\u0010\u009f\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009f\u0001\u0010\u0006J\u0013\u0010¡\u0001\u001a\u00030 \u0001H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001f\u0010¥\u0001\u001a\u00020\r2\n\u0010¤\u0001\u001a\u0005\u0018\u00010£\u0001H\u0096\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0011\u0010§\u0001\u001a\u00020-H\u0016¢\u0006\u0005\b§\u0001\u0010/J\u0011\u0010¨\u0001\u001a\u00020CH\u0016¢\u0006\u0005\b¨\u0001\u0010EJ\u000f\u0010©\u0001\u001a\u00020\u0000¢\u0006\u0005\b©\u0001\u0010\bJ\u000f\u0010y\u001a\u00020\u0000H\u0016¢\u0006\u0004\by\u0010\bJ\u000f\u0010ª\u0001\u001a\u000206¢\u0006\u0005\bª\u0001\u00108J\u0018\u0010«\u0001\u001a\u0002062\u0006\u0010\u0011\u001a\u00020-¢\u0006\u0006\b«\u0001\u0010¬\u0001R\u001b\u0010®\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0007\n\u0005\b]\u0010\u00ad\u0001R/\u0010±\u0001\u001a\u00020\u00102\u0007\u0010¯\u0001\u001a\u00020\u00108\u0007@@X\u0086\u000e¢\u0006\u0015\n\u0005\by\u0010°\u0001\u001a\u0005\b±\u0001\u0010#\"\u0005\b²\u0001\u0010\u0014R\u0016\u0010´\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b³\u0001\u0010\b¨\u0006µ\u0001"}, d2 = {"Lew/e;", "Lew/g;", "Lew/f;", BuildConfig.FLAVOR, "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "S", "()Lew/e;", "Ljava/io/OutputStream;", "q3", "()Ljava/io/OutputStream;", "k", BuildConfig.FLAVOR, "c2", "()Z", BuildConfig.FLAVOR, "byteCount", BuildConfig.FLAVOR, "w1", "(J)V", "request", "(J)Z", "peek", "()Lew/g;", "Ljava/io/InputStream;", "x3", "()Ljava/io/InputStream;", "out", "offset", "f", "(Lew/e;JJ)Lew/e;", "F0", "(Ljava/io/OutputStream;J)Lew/e;", "c", "()J", BuildConfig.FLAVOR, "readByte", "()B", "pos", "o", "(J)B", BuildConfig.FLAVOR, "readShort", "()S", BuildConfig.FLAVOR, "readInt", "()I", "O", "j1", "P2", "m1", "l2", "t3", "Lew/h;", "J2", "()Lew/h;", "M1", "(J)Lew/h;", "Lew/z;", "options", "J1", "(Lew/z;)I", "Lew/j0;", "sink", "a0", "(Lew/j0;)J", BuildConfig.FLAVOR, "V2", "()Ljava/lang/String;", "G1", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "C2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "Y", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "b1", "limit", "p0", "E2", BuildConfig.FLAVOR, "a2", "()[B", "y", "(J)[B", "z", "([B)V", "read", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "a", "skip", "byteString", "h0", "(Lew/h;)Lew/e;", InquiryField.StringField.TYPE, "I0", "(Ljava/lang/String;)Lew/e;", "beginIndex", "endIndex", "K0", "(Ljava/lang/String;II)Lew/e;", "codePoint", "M0", "(I)Lew/e;", "E0", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lew/e;", "A0", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lew/e;", Payload.SOURCE, "i0", "([B)Lew/e;", "k0", "([BII)Lew/e;", "write", "Lew/l0;", "h3", "(Lew/l0;)J", "b", "n0", "s", "z0", "i", "x0", "v", "s0", "(J)Lew/e;", "w0", "minimumCapacity", "Lew/g0;", "f0", "(I)Lew/g0;", "R2", "(Lew/e;J)V", "f3", "(Lew/e;J)J", "fromIndex", "toIndex", "p", "(BJJ)J", "bytes", "i1", "(Lew/h;)J", "r", "(Lew/h;J)J", "K1", "(Lew/h;JJ)J", "targetBytes", "B2", "V1", "(JLew/h;)Z", "bytesOffset", "u", "(JLew/h;II)Z", "flush", "isOpen", "close", "Lew/m0;", "t", "()Lew/m0;", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "e", "d0", "e0", "(I)Lew/h;", "Lew/g0;", "head", "value", "J", "size", "c0", "l", "buffer", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements g, f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public g0 head;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long size;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, d2 = {"Lew/e$a;", "Ljava/io/Closeable;", "<init>", "()V", BuildConfig.FLAVOR, "close", "Lew/e;", "a", "Lew/e;", "buffer", "Lew/g0;", "b", "Lew/g0;", "getSegment$okio", "()Lew/g0;", "(Lew/g0;)V", "segment", BuildConfig.FLAVOR, "c", "J", "offset", BuildConfig.FLAVOR, "d", "[B", "data", BuildConfig.FLAVOR, "e", "I", "start", "f", "end", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public e buffer;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public g0 segment;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public byte[] data;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public long offset = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int start = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int end = -1;

        public final void a(@Nullable g0 g0Var) {
            this.segment = g0Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            a(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ew/e$c", "Ljava/io/OutputStream;", BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "write", "(I)V", BuildConfig.FLAVOR, "data", "offset", "byteCount", "([BII)V", "flush", "()V", "close", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public static /* synthetic */ e G0(e eVar, OutputStream outputStream, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = eVar.size;
        }
        return eVar.F0(outputStream, j10);
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
            return L0(string, beginIndex, endIndex);
        }
        String strSubstring = string.substring(beginIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @Override // ew.g
    public long B2(@NotNull h targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return s(targetBytes, 0L);
    }

    @Override // ew.g
    @NotNull
    public String C2(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return Y(this.size, charset);
    }

    @NotNull
    public e E0(@NotNull String string, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return A0(string, 0, string.length(), charset);
    }

    @Override // ew.g
    public int E2() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (getSize() == 0) {
            throw new EOFException();
        }
        byte bO = o(0L);
        if ((bO & 128) == 0) {
            i10 = bO & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bO & 224) == 192) {
            i10 = bO & 31;
            i11 = 2;
            i12 = 128;
        } else if ((bO & 240) == 224) {
            i10 = bO & 15;
            i11 = 3;
            i12 = Barcode.FORMAT_PDF417;
        } else {
            if ((bO & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = bO & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (getSize() < j10) {
            throw new EOFException("size < " + i11 + ": " + getSize() + " (to read code point prefixed 0x" + ew.b.i(bO) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte bO2 = o(j11);
            if ((bO2 & 192) != 128) {
                skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (bO2 & 63);
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
    public final e F0(@NotNull OutputStream out, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        ew.b.b(this.size, 0L, byteCount);
        g0 g0Var = this.head;
        long j10 = byteCount;
        while (j10 > 0) {
            Intrinsics.checkNotNull(g0Var);
            int iMin = (int) Math.min(j10, g0Var.limit - g0Var.pos);
            out.write(g0Var.data, g0Var.pos, iMin);
            int i10 = g0Var.pos + iMin;
            g0Var.pos = i10;
            long j11 = iMin;
            this.size -= j11;
            j10 -= j11;
            if (i10 == g0Var.limit) {
                g0 g0VarB = g0Var.b();
                this.head = g0VarB;
                h0.b(g0Var);
                g0Var = g0VarB;
            }
        }
        return this;
    }

    @Override // ew.g
    @NotNull
    public String G1(long byteCount) throws EOFException {
        return Y(byteCount, Charsets.UTF_8);
    }

    @Override // ew.f
    @NotNull
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public e D0(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return L0(string, 0, string.length());
    }

    @Override // ew.g
    public int J1(@NotNull z options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int i10 = fw.a.i(this, options, false, 2, null);
        if (i10 == -1) {
            return -1;
        }
        skip(options.getByteStrings()[i10].I());
        return i10;
    }

    @Override // ew.g
    @NotNull
    public h J2() {
        return M1(getSize());
    }

    @Override // ew.f
    @NotNull
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public e L0(@NotNull String string, int beginIndex, int endIndex) {
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
                g0 g0VarF0 = f0(1);
                byte[] bArr = g0VarF0.data;
                int i10 = g0VarF0.limit - beginIndex;
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
                int i12 = g0VarF0.limit;
                int i13 = (i10 + beginIndex) - i12;
                g0VarF0.limit = i12 + i13;
                c0(getSize() + ((long) i13));
            } else {
                if (cCharAt2 < 2048) {
                    g0 g0VarF1 = f0(2);
                    byte[] bArr2 = g0VarF1.data;
                    int i14 = g0VarF1.limit;
                    bArr2[i14] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i14 + 1] = (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF);
                    g0VarF1.limit = i14 + 2;
                    c0(getSize() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    g0 g0VarF2 = f0(3);
                    byte[] bArr3 = g0VarF2.data;
                    int i15 = g0VarF2.limit;
                    bArr3[i15] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i15 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | Barcode.FORMAT_ITF);
                    bArr3[i15 + 2] = (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF);
                    g0VarF2.limit = i15 + 3;
                    c0(getSize() + 3);
                } else {
                    int i16 = beginIndex + 1;
                    char cCharAt3 = i16 < endIndex ? string.charAt(i16) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        beginIndex = i16;
                    } else {
                        int i17 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        g0 g0VarF3 = f0(4);
                        byte[] bArr4 = g0VarF3.data;
                        int i18 = g0VarF3.limit;
                        bArr4[i18] = (byte) ((i17 >> 18) | 240);
                        bArr4[i18 + 1] = (byte) (((i17 >> 12) & 63) | Barcode.FORMAT_ITF);
                        bArr4[i18 + 2] = (byte) (((i17 >> 6) & 63) | Barcode.FORMAT_ITF);
                        bArr4[i18 + 3] = (byte) ((i17 & 63) | Barcode.FORMAT_ITF);
                        g0VarF3.limit = i18 + 4;
                        c0(getSize() + 4);
                        beginIndex += 2;
                    }
                }
                beginIndex++;
            }
        }
        return this;
    }

    @Override // ew.g
    public long K1(@NotNull h bytes, long fromIndex, long toIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return fw.a.c(this, bytes, fromIndex, toIndex, 0, 0, 24, null);
    }

    @Override // ew.f
    @NotNull
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public e X(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
            return this;
        }
        if (codePoint < 2048) {
            g0 g0VarF0 = f0(2);
            byte[] bArr = g0VarF0.data;
            int i10 = g0VarF0.limit;
            bArr[i10] = (byte) ((codePoint >> 6) | 192);
            bArr[i10 + 1] = (byte) ((codePoint & 63) | Barcode.FORMAT_ITF);
            g0VarF0.limit = i10 + 2;
            c0(getSize() + 2);
            return this;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            writeByte(63);
            return this;
        }
        if (codePoint < 65536) {
            g0 g0VarF1 = f0(3);
            byte[] bArr2 = g0VarF1.data;
            int i11 = g0VarF1.limit;
            bArr2[i11] = (byte) ((codePoint >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((codePoint >> 6) & 63) | Barcode.FORMAT_ITF);
            bArr2[i11 + 2] = (byte) ((codePoint & 63) | Barcode.FORMAT_ITF);
            g0VarF1.limit = i11 + 3;
            c0(getSize() + 3);
            return this;
        }
        if (codePoint > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + ew.b.j(codePoint));
        }
        g0 g0VarF2 = f0(4);
        byte[] bArr3 = g0VarF2.data;
        int i12 = g0VarF2.limit;
        bArr3[i12] = (byte) ((codePoint >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((codePoint >> 12) & 63) | Barcode.FORMAT_ITF);
        bArr3[i12 + 2] = (byte) (((codePoint >> 6) & 63) | Barcode.FORMAT_ITF);
        bArr3[i12 + 3] = (byte) ((codePoint & 63) | Barcode.FORMAT_ITF);
        g0VarF2.limit = i12 + 4;
        c0(getSize() + 4);
        return this;
    }

    @Override // ew.g
    @NotNull
    public h M1(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new h(y(byteCount));
        }
        h hVarE0 = e0((int) byteCount);
        skip(byteCount);
        return hVarE0;
    }

    public long O() throws EOFException {
        if (getSize() < 8) {
            throw new EOFException();
        }
        g0 g0Var = this.head;
        Intrinsics.checkNotNull(g0Var);
        int i10 = g0Var.pos;
        int i11 = g0Var.limit;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = g0Var.data;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        c0(getSize() - 8);
        if (i13 != i11) {
            g0Var.pos = i13;
            return j11;
        }
        this.head = g0Var.b();
        h0.b(g0Var);
        return j11;
    }

    @Override // ew.g
    public int P2() {
        return ew.b.f(readInt());
    }

    @Override // ew.j0
    public void R2(@NotNull e source, long byteCount) {
        g0 g0Var;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        ew.b.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            g0 g0Var2 = source.head;
            Intrinsics.checkNotNull(g0Var2);
            int i10 = g0Var2.limit;
            g0 g0Var3 = source.head;
            Intrinsics.checkNotNull(g0Var3);
            if (byteCount < i10 - g0Var3.pos) {
                g0 g0Var4 = this.head;
                if (g0Var4 != null) {
                    Intrinsics.checkNotNull(g0Var4);
                    g0Var = g0Var4.prev;
                } else {
                    g0Var = null;
                }
                if (g0Var != null && g0Var.owner) {
                    if ((((long) g0Var.limit) + byteCount) - ((long) (g0Var.shared ? 0 : g0Var.pos)) <= 8192) {
                        g0 g0Var5 = source.head;
                        Intrinsics.checkNotNull(g0Var5);
                        g0Var5.f(g0Var, (int) byteCount);
                        source.c0(source.getSize() - byteCount);
                        c0(getSize() + byteCount);
                        return;
                    }
                }
                g0 g0Var6 = source.head;
                Intrinsics.checkNotNull(g0Var6);
                source.head = g0Var6.e((int) byteCount);
            }
            g0 g0Var7 = source.head;
            Intrinsics.checkNotNull(g0Var7);
            long j10 = g0Var7.limit - g0Var7.pos;
            source.head = g0Var7.b();
            g0 g0Var8 = this.head;
            if (g0Var8 == null) {
                this.head = g0Var7;
                g0Var7.prev = g0Var7;
                g0Var7.next = g0Var7;
            } else {
                Intrinsics.checkNotNull(g0Var8);
                g0 g0Var9 = g0Var8.prev;
                Intrinsics.checkNotNull(g0Var9);
                g0Var9.c(g0Var7).a();
            }
            source.c0(source.getSize() - j10);
            c0(getSize() + j10);
            byteCount -= j10;
        }
    }

    @Override // ew.g
    @NotNull
    public e S() {
        return this;
    }

    @Override // ew.g
    public boolean V1(long offset, @NotNull h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return u(offset, bytes, 0, bytes.I());
    }

    @Override // ew.g
    @NotNull
    public String V2() {
        return Y(this.size, Charsets.UTF_8);
    }

    @NotNull
    public String Y(long byteCount, @NotNull Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return BuildConfig.FLAVOR;
        }
        g0 g0Var = this.head;
        Intrinsics.checkNotNull(g0Var);
        int i10 = g0Var.pos;
        if (((long) i10) + byteCount > g0Var.limit) {
            return new String(y(byteCount), charset);
        }
        int i11 = (int) byteCount;
        String str = new String(g0Var.data, i10, i11, charset);
        int i12 = g0Var.pos + i11;
        g0Var.pos = i12;
        this.size -= byteCount;
        if (i12 == g0Var.limit) {
            this.head = g0Var.b();
            h0.b(g0Var);
        }
        return str;
    }

    public final void a() throws EOFException {
        skip(getSize());
    }

    @Override // ew.g
    public long a0(@NotNull j0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = getSize();
        if (size > 0) {
            sink.R2(this, size);
        }
        return size;
    }

    @Override // ew.g
    @NotNull
    public byte[] a2() {
        return y(getSize());
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return e();
    }

    @Override // ew.g
    @NotNull
    public String b1() {
        return p0(Long.MAX_VALUE);
    }

    public final long c() {
        long size = getSize();
        if (size == 0) {
            return 0L;
        }
        g0 g0Var = this.head;
        Intrinsics.checkNotNull(g0Var);
        g0 g0Var2 = g0Var.prev;
        Intrinsics.checkNotNull(g0Var2);
        int i10 = g0Var2.limit;
        return (i10 >= 8192 || !g0Var2.owner) ? size : size - ((long) (i10 - g0Var2.pos));
    }

    public final void c0(long j10) {
        this.size = j10;
    }

    @Override // ew.g
    public boolean c2() {
        return this.size == 0;
    }

    @Override // ew.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @NotNull
    public final h d0() {
        if (getSize() <= 2147483647L) {
            return e0((int) getSize());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + getSize()).toString());
    }

    @NotNull
    public final e e() {
        e eVar = new e();
        if (getSize() == 0) {
            return eVar;
        }
        g0 g0Var = this.head;
        Intrinsics.checkNotNull(g0Var);
        g0 g0VarD = g0Var.d();
        eVar.head = g0VarD;
        g0VarD.prev = g0VarD;
        g0VarD.next = g0VarD;
        for (g0 g0Var2 = g0Var.next; g0Var2 != g0Var; g0Var2 = g0Var2.next) {
            g0 g0Var3 = g0VarD.prev;
            Intrinsics.checkNotNull(g0Var3);
            Intrinsics.checkNotNull(g0Var2);
            g0Var3.c(g0Var2.d());
        }
        eVar.c0(getSize());
        return eVar;
    }

    @NotNull
    public final h e0(int byteCount) {
        if (byteCount == 0) {
            return h.f14806e;
        }
        ew.b.b(getSize(), 0L, byteCount);
        g0 g0Var = this.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < byteCount) {
            Intrinsics.checkNotNull(g0Var);
            int i13 = g0Var.limit;
            int i14 = g0Var.pos;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            g0Var = g0Var.next;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        g0 g0Var2 = this.head;
        int i15 = 0;
        while (i10 < byteCount) {
            Intrinsics.checkNotNull(g0Var2);
            bArr[i15] = g0Var2.data;
            i10 += g0Var2.limit - g0Var2.pos;
            iArr[i15] = Math.min(i10, byteCount);
            iArr[i15 + i12] = g0Var2.pos;
            g0Var2.shared = true;
            i15++;
            g0Var2 = g0Var2.next;
        }
        return new i0(bArr, iArr);
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
        g0 g0Var = this.head;
        Intrinsics.checkNotNull(g0Var);
        g0 g0Var2 = eVar.head;
        Intrinsics.checkNotNull(g0Var2);
        int i10 = g0Var.pos;
        int i11 = g0Var2.pos;
        long j10 = 0;
        while (j10 < getSize()) {
            long jMin = Math.min(g0Var.limit - i10, g0Var2.limit - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (g0Var.data[i10] != g0Var2.data[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == g0Var.limit) {
                g0Var = g0Var.next;
                Intrinsics.checkNotNull(g0Var);
                i10 = g0Var.pos;
            }
            if (i11 == g0Var2.limit) {
                g0Var2 = g0Var2.next;
                Intrinsics.checkNotNull(g0Var2);
                i11 = g0Var2.pos;
            }
            j10 += jMin;
        }
        return true;
    }

    @NotNull
    public final e f(@NotNull e out, long offset, long byteCount) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j10 = offset;
        ew.b.b(getSize(), j10, byteCount);
        if (byteCount != 0) {
            out.c0(out.getSize() + byteCount);
            g0 g0Var = this.head;
            while (true) {
                Intrinsics.checkNotNull(g0Var);
                int i10 = g0Var.limit;
                int i11 = g0Var.pos;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                g0Var = g0Var.next;
            }
            g0 g0Var2 = g0Var;
            long j11 = byteCount;
            while (j11 > 0) {
                Intrinsics.checkNotNull(g0Var2);
                g0 g0VarD = g0Var2.d();
                int i12 = g0VarD.pos + ((int) j10);
                g0VarD.pos = i12;
                g0VarD.limit = Math.min(i12 + ((int) j11), g0VarD.limit);
                g0 g0Var3 = out.head;
                if (g0Var3 == null) {
                    g0VarD.prev = g0VarD;
                    g0VarD.next = g0VarD;
                    out.head = g0VarD;
                } else {
                    Intrinsics.checkNotNull(g0Var3);
                    g0 g0Var4 = g0Var3.prev;
                    Intrinsics.checkNotNull(g0Var4);
                    g0Var4.c(g0VarD);
                }
                j11 -= (long) (g0VarD.limit - g0VarD.pos);
                g0Var2 = g0Var2.next;
                j10 = 0;
            }
        }
        return this;
    }

    @NotNull
    public final g0 f0(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        g0 g0Var = this.head;
        if (g0Var != null) {
            Intrinsics.checkNotNull(g0Var);
            g0 g0Var2 = g0Var.prev;
            Intrinsics.checkNotNull(g0Var2);
            return (g0Var2.limit + minimumCapacity > 8192 || !g0Var2.owner) ? g0Var2.c(h0.c()) : g0Var2;
        }
        g0 g0VarC = h0.c();
        this.head = g0VarC;
        g0VarC.prev = g0VarC;
        g0VarC.next = g0VarC;
        return g0VarC;
    }

    @Override // ew.l0
    public long f3(@NotNull e sink, long byteCount) {
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
        sink.R2(this, byteCount);
        return byteCount;
    }

    @Override // ew.f, ew.j0, java.io.Flushable
    public void flush() {
    }

    @Override // ew.f
    @NotNull
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public e z1(@NotNull h byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.Q(this, 0, byteString.I());
        return this;
    }

    @Override // ew.f
    public long h3(@NotNull l0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long jF3 = source.f3(this, 8192L);
            if (jF3 == -1) {
                return j10;
            }
            j10 += jF3;
        }
    }

    public int hashCode() {
        g0 g0Var = this.head;
        if (g0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = g0Var.limit;
            for (int i12 = g0Var.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + g0Var.data[i12];
            }
            g0Var = g0Var.next;
            Intrinsics.checkNotNull(g0Var);
        } while (g0Var != this.head);
        return i10;
    }

    @Override // ew.f
    @NotNull
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public e write(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // ew.g
    public long i1(@NotNull h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return r(bytes, 0L);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // ew.g
    public short j1() {
        return ew.b.h(readShort());
    }

    @Override // ew.f
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public e l0() {
        return this;
    }

    @Override // ew.f
    @NotNull
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public e write(@NotNull byte[] source, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = byteCount;
        ew.b.b(source.length, offset, j10);
        int i10 = byteCount + offset;
        while (offset < i10) {
            g0 g0VarF0 = f0(1);
            int iMin = Math.min(i10 - offset, 8192 - g0VarF0.limit);
            int i11 = offset + iMin;
            p001kotlin.collections.l.f(source, g0VarF0.data, g0VarF0.limit, offset, i11);
            g0VarF0.limit += iMin;
            offset = i11;
        }
        c0(getSize() + j10);
        return this;
    }

    @Override // ew.g, ew.f
    @NotNull
    public e l() {
        return this;
    }

    @Override // ew.g
    public long l2() throws EOFException {
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
            g0 g0Var = this.head;
            Intrinsics.checkNotNull(g0Var);
            byte[] bArr = g0Var.data;
            int i11 = g0Var.pos;
            int i12 = g0Var.limit;
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
                this.head = g0Var.b();
                h0.b(g0Var);
            } else {
                g0Var.pos = i11;
            }
            if (z11 || this.head == null) {
                c0(getSize() - ((long) i10));
                if (i10 >= (z10 ? 2 : 1)) {
                    return z10 ? j12 : -j12;
                }
                if (getSize() == j10) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + ew.b.i(o(j10)));
            }
            j11 = j10;
        }
        e eVarWriteByte = new e().A1(j12).writeByte(b10);
        if (!z10) {
            eVarWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + eVarWriteByte.V2());
    }

    @Override // ew.g
    public long m1() {
        return ew.b.g(O());
    }

    @Override // ew.f
    @NotNull
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public e writeByte(int b10) {
        g0 g0VarF0 = f0(1);
        byte[] bArr = g0VarF0.data;
        int i10 = g0VarF0.limit;
        g0VarF0.limit = i10 + 1;
        bArr[i10] = (byte) b10;
        c0(getSize() + 1);
        return this;
    }

    public final byte o(long pos) {
        ew.b.b(getSize(), pos, 1L);
        g0 g0Var = this.head;
        if (g0Var == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (getSize() - pos < pos) {
            long size = getSize();
            while (size > pos) {
                g0Var = g0Var.prev;
                Intrinsics.checkNotNull(g0Var);
                size -= (long) (g0Var.limit - g0Var.pos);
            }
            Intrinsics.checkNotNull(g0Var);
            return g0Var.data[(int) ((((long) g0Var.pos) + pos) - size)];
        }
        long j10 = 0;
        while (true) {
            long j11 = ((long) (g0Var.limit - g0Var.pos)) + j10;
            if (j11 > pos) {
                Intrinsics.checkNotNull(g0Var);
                return g0Var.data[(int) ((((long) g0Var.pos) + pos) - j10)];
            }
            g0Var = g0Var.next;
            Intrinsics.checkNotNull(g0Var);
            j10 = j11;
        }
    }

    public long p(byte b10, long fromIndex, long toIndex) {
        g0 g0Var;
        int i10;
        long size = 0;
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("size=" + getSize() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > getSize()) {
            toIndex = getSize();
        }
        if (fromIndex == toIndex || (g0Var = this.head) == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                g0Var = g0Var.prev;
                Intrinsics.checkNotNull(g0Var);
                size -= (long) (g0Var.limit - g0Var.pos);
            }
            while (size < toIndex) {
                byte[] bArr = g0Var.data;
                int iMin = (int) Math.min(g0Var.limit, (((long) g0Var.pos) + toIndex) - size);
                i10 = (int) ((((long) g0Var.pos) + fromIndex) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (g0Var.limit - g0Var.pos);
                g0Var = g0Var.next;
                Intrinsics.checkNotNull(g0Var);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (g0Var.limit - g0Var.pos)) + size;
            if (j10 > fromIndex) {
                break;
            }
            g0Var = g0Var.next;
            Intrinsics.checkNotNull(g0Var);
            size = j10;
        }
        while (size < toIndex) {
            byte[] bArr2 = g0Var.data;
            int iMin2 = (int) Math.min(g0Var.limit, (((long) g0Var.pos) + toIndex) - size);
            i10 = (int) ((((long) g0Var.pos) + fromIndex) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (g0Var.limit - g0Var.pos);
            g0Var = g0Var.next;
            Intrinsics.checkNotNull(g0Var);
            fromIndex = size;
        }
        return -1L;
        return ((long) (i10 - g0Var.pos)) + size;
    }

    @Override // ew.g
    @NotNull
    public String p0(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j10 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long jP = p((byte) 10, 0L, j10);
        if (jP != -1) {
            return fw.a.g(this, jP);
        }
        if (j10 < getSize() && o(j10 - 1) == 13 && o(j10) == 10) {
            return fw.a.g(this, j10);
        }
        e eVar = new e();
        f(eVar, 0L, Math.min(32, getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(getSize(), limit) + " content=" + eVar.J2().r() + (char) 8230);
    }

    @Override // ew.g
    @NotNull
    public g peek() {
        return v.c(new c0(this));
    }

    @Override // ew.f
    @NotNull
    public OutputStream q3() {
        return new c();
    }

    public long r(@NotNull h bytes, long fromIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return K1(bytes, fromIndex, Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        g0 g0Var = this.head;
        if (g0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), g0Var.limit - g0Var.pos);
        sink.put(g0Var.data, g0Var.pos, iMin);
        int i10 = g0Var.pos + iMin;
        g0Var.pos = i10;
        this.size -= (long) iMin;
        if (i10 == g0Var.limit) {
            this.head = g0Var.b();
            h0.b(g0Var);
        }
        return iMin;
    }

    @Override // ew.g
    public byte readByte() throws EOFException {
        if (getSize() == 0) {
            throw new EOFException();
        }
        g0 g0Var = this.head;
        Intrinsics.checkNotNull(g0Var);
        int i10 = g0Var.pos;
        int i11 = g0Var.limit;
        int i12 = i10 + 1;
        byte b10 = g0Var.data[i10];
        c0(getSize() - 1);
        if (i12 != i11) {
            g0Var.pos = i12;
            return b10;
        }
        this.head = g0Var.b();
        h0.b(g0Var);
        return b10;
    }

    @Override // ew.g
    public int readInt() throws EOFException {
        if (getSize() < 4) {
            throw new EOFException();
        }
        g0 g0Var = this.head;
        Intrinsics.checkNotNull(g0Var);
        int i10 = g0Var.pos;
        int i11 = g0Var.limit;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = g0Var.data;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        c0(getSize() - 4);
        if (i14 != i11) {
            g0Var.pos = i14;
            return i15;
        }
        this.head = g0Var.b();
        h0.b(g0Var);
        return i15;
    }

    @Override // ew.g
    public short readShort() throws EOFException {
        if (getSize() < 2) {
            throw new EOFException();
        }
        g0 g0Var = this.head;
        Intrinsics.checkNotNull(g0Var);
        int i10 = g0Var.pos;
        int i11 = g0Var.limit;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = g0Var.data;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        c0(getSize() - 2);
        if (i14 == i11) {
            this.head = g0Var.b();
            h0.b(g0Var);
        } else {
            g0Var.pos = i14;
        }
        return (short) i15;
    }

    @Override // ew.g
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    public long s(@NotNull h targetBytes, long fromIndex) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (fromIndex < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + fromIndex).toString());
        }
        g0 g0Var = this.head;
        if (g0Var == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                g0Var = g0Var.prev;
                Intrinsics.checkNotNull(g0Var);
                size -= (long) (g0Var.limit - g0Var.pos);
            }
            if (targetBytes.I() == 2) {
                byte bK = targetBytes.k(0);
                byte bK2 = targetBytes.k(1);
                while (size < getSize()) {
                    byte[] bArr = g0Var.data;
                    i10 = (int) ((((long) g0Var.pos) + fromIndex) - size);
                    int i12 = g0Var.limit;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (g0Var.limit - g0Var.pos);
                            g0Var = g0Var.next;
                            Intrinsics.checkNotNull(g0Var);
                            fromIndex = size;
                        } else {
                            byte b10 = bArr[i10];
                            if (b10 == bK || b10 == bK2) {
                                i11 = g0Var.pos;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrW = targetBytes.w();
                while (size < getSize()) {
                    byte[] bArr2 = g0Var.data;
                    i10 = (int) ((((long) g0Var.pos) + fromIndex) - size);
                    int i13 = g0Var.limit;
                    while (true) {
                        if (i10 < i13) {
                            byte b11 = bArr2[i10];
                            int length = bArrW.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    i10++;
                                } else if (b11 == bArrW[i14]) {
                                    i11 = g0Var.pos;
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            size += (long) (g0Var.limit - g0Var.pos);
                            g0Var = g0Var.next;
                            Intrinsics.checkNotNull(g0Var);
                            fromIndex = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (g0Var.limit - g0Var.pos)) + size;
            if (j10 > fromIndex) {
                break;
            }
            g0Var = g0Var.next;
            Intrinsics.checkNotNull(g0Var);
            size = j10;
        }
        if (targetBytes.I() == 2) {
            byte bK3 = targetBytes.k(0);
            byte bK4 = targetBytes.k(1);
            while (size < getSize()) {
                byte[] bArr3 = g0Var.data;
                i10 = (int) ((((long) g0Var.pos) + fromIndex) - size);
                int i15 = g0Var.limit;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (g0Var.limit - g0Var.pos);
                        g0Var = g0Var.next;
                        Intrinsics.checkNotNull(g0Var);
                        fromIndex = size;
                    } else {
                        byte b12 = bArr3[i10];
                        if (b12 == bK3 || b12 == bK4) {
                            i11 = g0Var.pos;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrW2 = targetBytes.w();
            while (size < getSize()) {
                byte[] bArr4 = g0Var.data;
                i10 = (int) ((((long) g0Var.pos) + fromIndex) - size);
                int i16 = g0Var.limit;
                while (true) {
                    if (i10 < i16) {
                        byte b13 = bArr4[i10];
                        int length2 = bArrW2.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                i10++;
                            } else if (b13 == bArrW2[i17]) {
                                i11 = g0Var.pos;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        size += (long) (g0Var.limit - g0Var.pos);
                        g0Var = g0Var.next;
                        Intrinsics.checkNotNull(g0Var);
                        fromIndex = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    @Override // ew.f
    @NotNull
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public e A1(long v8) {
        boolean z10;
        if (v8 == 0) {
            return writeByte(48);
        }
        if (v8 < 0) {
            v8 = -v8;
            if (v8 < 0) {
                return D0("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int iD = fw.a.d(v8);
        if (z10) {
            iD++;
        }
        g0 g0VarF0 = f0(iD);
        byte[] bArr = g0VarF0.data;
        int i10 = g0VarF0.limit + iD;
        while (v8 != 0) {
            long j10 = 10;
            i10--;
            bArr[i10] = fw.a.e()[(int) (v8 % j10)];
            v8 /= j10;
        }
        if (z10) {
            bArr[i10 - 1] = 45;
        }
        g0VarF0.limit += iD;
        c0(getSize() + ((long) iD));
        return this;
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // ew.g
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            g0 g0Var = this.head;
            if (g0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(byteCount, g0Var.limit - g0Var.pos);
            long j10 = iMin;
            c0(getSize() - j10);
            byteCount -= j10;
            int i10 = g0Var.pos + iMin;
            g0Var.pos = i10;
            if (i10 == g0Var.limit) {
                this.head = g0Var.b();
                h0.b(g0Var);
            }
        }
    }

    @Override // ew.l0
    @NotNull
    public m0 t() {
        return m0.f14833e;
    }

    @Override // ew.g
    public long t3() throws EOFException {
        int i10;
        if (getSize() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            g0 g0Var = this.head;
            Intrinsics.checkNotNull(g0Var);
            byte[] bArr = g0Var.data;
            int i12 = g0Var.pos;
            int i13 = g0Var.limit;
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
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + ew.b.i(b10));
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new e().H2(j10).writeByte(b10).V2());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.head = g0Var.b();
                h0.b(g0Var);
            } else {
                g0Var.pos = i12;
            }
            if (z10) {
                break;
            }
        } while (this.head != null);
        c0(getSize() - ((long) i11));
        return j10;
    }

    @NotNull
    public String toString() {
        return d0().toString();
    }

    public boolean u(long offset, @NotNull h bytes, int bytesOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return byteCount >= 0 && offset >= 0 && ((long) byteCount) + offset <= getSize() && bytesOffset >= 0 && bytesOffset + byteCount <= bytes.I() && (byteCount == 0 || fw.a.b(this, bytes, offset, offset + 1, bytesOffset, byteCount) != -1);
    }

    @Override // ew.f
    @NotNull
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public e H2(long v8) {
        if (v8 == 0) {
            return writeByte(48);
        }
        long j10 = (v8 >>> 1) | v8;
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
        g0 g0VarF0 = f0(i10);
        byte[] bArr = g0VarF0.data;
        int i11 = g0VarF0.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = fw.a.e()[(int) (15 & v8)];
            v8 >>>= 4;
        }
        g0VarF0.limit += i10;
        c0(getSize() + ((long) i10));
        return this;
    }

    @Override // ew.g
    public void w1(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    @Override // ew.f
    @NotNull
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public e writeInt(int i10) {
        g0 g0VarF0 = f0(4);
        byte[] bArr = g0VarF0.data;
        int i11 = g0VarF0.limit;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        g0VarF0.limit = i11 + 4;
        c0(getSize() + 4);
        return this;
    }

    @Override // ew.g
    @NotNull
    public InputStream x3() {
        return new b();
    }

    @NotNull
    public byte[] y(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        z(bArr);
        return bArr;
    }

    public void z(@NotNull byte[] sink) throws EOFException {
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

    @Override // ew.f
    @NotNull
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public e writeShort(int s8) {
        g0 g0VarF0 = f0(2);
        byte[] bArr = g0VarF0.data;
        int i10 = g0VarF0.limit;
        bArr[i10] = (byte) ((s8 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (s8 & 255);
        g0VarF0.limit = i10 + 2;
        c0(getSize() + 2);
        return this;
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"ew/e$b", "Ljava/io/InputStream;", BuildConfig.FLAVOR, "read", "()I", BuildConfig.FLAVOR, "sink", "offset", "byteCount", "([BII)I", "available", BuildConfig.FLAVOR, "close", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
            g0 g0VarF0 = f0(1);
            int iMin = Math.min(i10, 8192 - g0VarF0.limit);
            source.get(g0VarF0.data, g0VarF0.limit, iMin);
            i10 -= iMin;
            g0VarF0.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    public int read(@NotNull byte[] sink, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        ew.b.b(sink.length, offset, byteCount);
        g0 g0Var = this.head;
        if (g0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, g0Var.limit - g0Var.pos);
        byte[] bArr = g0Var.data;
        int i10 = g0Var.pos;
        p001kotlin.collections.l.f(bArr, sink, offset, i10, i10 + iMin);
        g0Var.pos += iMin;
        c0(getSize() - ((long) iMin));
        if (g0Var.pos == g0Var.limit) {
            this.head = g0Var.b();
            h0.b(g0Var);
        }
        return iMin;
    }
}
