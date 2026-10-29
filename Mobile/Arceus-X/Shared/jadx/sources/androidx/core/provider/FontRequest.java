package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FontRequest {
    private final List<List<byte[]>> mCertificates;
    private final int mCertificatesArray;
    private final String mIdentifier;
    private final String mProviderAuthority;
    private final String mProviderPackage;
    private final String mQuery;

    public FontRequest(@NonNull String providerAuthority, @NonNull String providerPackage, @NonNull String query, @NonNull List<List<byte[]>> certificates) {
        String str = (String) Preconditions.checkNotNull(providerAuthority);
        this.mProviderAuthority = str;
        String str2 = (String) Preconditions.checkNotNull(providerPackage);
        this.mProviderPackage = str2;
        String str3 = (String) Preconditions.checkNotNull(query);
        this.mQuery = str3;
        this.mCertificates = (List) Preconditions.checkNotNull(certificates);
        this.mCertificatesArray = 0;
        this.mIdentifier = str + "-" + str2 + "-" + str3;
    }

    public FontRequest(@NonNull String providerAuthority, @NonNull String providerPackage, @NonNull String query, @ArrayRes int certificates) {
        String str = (String) Preconditions.checkNotNull(providerAuthority);
        this.mProviderAuthority = str;
        String str2 = (String) Preconditions.checkNotNull(providerPackage);
        this.mProviderPackage = str2;
        String str3 = (String) Preconditions.checkNotNull(query);
        this.mQuery = str3;
        this.mCertificates = null;
        Preconditions.checkArgument(certificates != 0);
        this.mCertificatesArray = certificates;
        this.mIdentifier = str + "-" + str2 + "-" + str3;
    }

    @NonNull
    public String getProviderAuthority() {
        return this.mProviderAuthority;
    }

    @NonNull
    public String getProviderPackage() {
        return this.mProviderPackage;
    }

    @NonNull
    public String getQuery() {
        return this.mQuery;
    }

    @Nullable
    public List<List<byte[]>> getCertificates() {
        return this.mCertificates;
    }

    @ArrayRes
    public int getCertificatesArrayResId() {
        return this.mCertificatesArray;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getIdentifier() {
        return this.mIdentifier;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FontRequest {mProviderAuthority: " + this.mProviderAuthority + ", mProviderPackage: " + this.mProviderPackage + ", mQuery: " + this.mQuery + ", mCertificates:");
        for (int i10 = 0; i10 < this.mCertificates.size(); i10++) {
            builder.append(" [");
            List<byte[]> set = this.mCertificates.get(i10);
            for (int j10 = 0; j10 < set.size(); j10++) {
                builder.append(" \"");
                byte[] array = set.get(j10);
                builder.append(Base64.encodeToString(array, 0));
                builder.append("\"");
            }
            builder.append(" ]");
        }
        builder.append("}");
        builder.append("mCertificatesArray: " + this.mCertificatesArray);
        return builder.toString();
    }
}
