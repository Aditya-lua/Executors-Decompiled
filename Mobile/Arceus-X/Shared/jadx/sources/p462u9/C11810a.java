package p462u9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p511w9.C12327c;

/* JADX INFO: renamed from: u9.a */
/* JADX INFO: loaded from: classes.dex */
public class C11810a {

    /* JADX INFO: renamed from: a */
    public static final Object f41568a = new Object();

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static byte[] m44167a(@NonNull Context context, @NonNull String str) {
        MessageDigest messageDigestM44168b;
        PackageInfo packageInfoM46178e = C12327c.m46181a(context).m46178e(str, 64);
        Signature[] signatureArr = packageInfoM46178e.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestM44168b = m44168b("SHA1")) == null) {
            return null;
        }
        return messageDigestM44168b.digest(packageInfoM46178e.signatures[0].toByteArray());
    }

    /* JADX INFO: renamed from: b */
    public static MessageDigest m44168b(@NonNull String str) {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
