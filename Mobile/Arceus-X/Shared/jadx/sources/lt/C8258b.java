package lt;

import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lt.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0087\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\u0006\u001a\u00020\u0002*\u0004\u0018\u00010\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u0005H\u0087\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a \u0010\t\u001a\u00020\u0002*\u0004\u0018\u00010\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\bH\u0087\u0004¢\u0006\u0004\b\t\u0010\n\u001a \u0010\f\u001a\u00020\u0002*\u0004\u0018\u00010\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u000bH\u0087\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Ljt/x;", "other", "", "b", "([I[I)Z", "Ljt/z;", "d", "([J[J)Z", "Ljt/v;", "c", "([B[B)Z", "Ljt/c0;", "a", "([S[S)Z", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/collections/unsigned/UArraysKt")
public class C8258b extends C8257a {
    /* JADX INFO: renamed from: a */
    public static boolean m33638a(@Nullable short[] sArr, @Nullable short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m33639b(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m33640c(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m33641d(@Nullable long[] jArr, @Nullable long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }
}
