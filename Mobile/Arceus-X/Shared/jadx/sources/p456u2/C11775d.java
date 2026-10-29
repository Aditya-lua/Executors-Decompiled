package p456u2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: u2.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"", "Lkotlin/Pair;", "", "", "pairs", "Landroid/os/Bundle;", "a", "([Lkotlin/Pair;)Landroid/os/Bundle;", "core-ktx_release"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C11775d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Bundle m44057a(@NotNull Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String strM31671a = pair.m31671a();
            Object objM31672b = pair.m31672b();
            if (objM31672b == null) {
                bundle.putString(strM31671a, null);
            } else if (objM31672b instanceof Boolean) {
                bundle.putBoolean(strM31671a, ((Boolean) objM31672b).booleanValue());
            } else if (objM31672b instanceof Byte) {
                bundle.putByte(strM31671a, ((Number) objM31672b).byteValue());
            } else if (objM31672b instanceof Character) {
                bundle.putChar(strM31671a, ((Character) objM31672b).charValue());
            } else if (objM31672b instanceof Double) {
                bundle.putDouble(strM31671a, ((Number) objM31672b).doubleValue());
            } else if (objM31672b instanceof Float) {
                bundle.putFloat(strM31671a, ((Number) objM31672b).floatValue());
            } else if (objM31672b instanceof Integer) {
                bundle.putInt(strM31671a, ((Number) objM31672b).intValue());
            } else if (objM31672b instanceof Long) {
                bundle.putLong(strM31671a, ((Number) objM31672b).longValue());
            } else if (objM31672b instanceof Short) {
                bundle.putShort(strM31671a, ((Number) objM31672b).shortValue());
            } else if (objM31672b instanceof Bundle) {
                bundle.putBundle(strM31671a, (Bundle) objM31672b);
            } else if (objM31672b instanceof CharSequence) {
                bundle.putCharSequence(strM31671a, (CharSequence) objM31672b);
            } else if (objM31672b instanceof Parcelable) {
                bundle.putParcelable(strM31671a, (Parcelable) objM31672b);
            } else if (objM31672b instanceof boolean[]) {
                bundle.putBooleanArray(strM31671a, (boolean[]) objM31672b);
            } else if (objM31672b instanceof byte[]) {
                bundle.putByteArray(strM31671a, (byte[]) objM31672b);
            } else if (objM31672b instanceof char[]) {
                bundle.putCharArray(strM31671a, (char[]) objM31672b);
            } else if (objM31672b instanceof double[]) {
                bundle.putDoubleArray(strM31671a, (double[]) objM31672b);
            } else if (objM31672b instanceof float[]) {
                bundle.putFloatArray(strM31671a, (float[]) objM31672b);
            } else if (objM31672b instanceof int[]) {
                bundle.putIntArray(strM31671a, (int[]) objM31672b);
            } else if (objM31672b instanceof long[]) {
                bundle.putLongArray(strM31671a, (long[]) objM31672b);
            } else if (objM31672b instanceof short[]) {
                bundle.putShortArray(strM31671a, (short[]) objM31672b);
            } else if (objM31672b instanceof Object[]) {
                Class<?> componentType = objM31672b.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Intrinsics.m31981d(objM31672b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(strM31671a, (Parcelable[]) objM31672b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    Intrinsics.m31981d(objM31672b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(strM31671a, (String[]) objM31672b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    Intrinsics.m31981d(objM31672b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(strM31671a, (CharSequence[]) objM31672b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + strM31671a + '\"');
                    }
                    bundle.putSerializable(strM31671a, (Serializable) objM31672b);
                }
            } else if (objM31672b instanceof Serializable) {
                bundle.putSerializable(strM31671a, (Serializable) objM31672b);
            } else if (objM31672b instanceof IBinder) {
                bundle.putBinder(strM31671a, (IBinder) objM31672b);
            } else if (objM31672b instanceof Size) {
                C11773b.m44053a(bundle, strM31671a, (Size) objM31672b);
            } else {
                if (!(objM31672b instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objM31672b.getClass().getCanonicalName() + " for key \"" + strM31671a + '\"');
                }
                C11773b.m44054b(bundle, strM31671a, (SizeF) objM31672b);
            }
        }
        return bundle;
    }
}
