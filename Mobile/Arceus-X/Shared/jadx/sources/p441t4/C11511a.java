package p441t4;

import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t4.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, m31665d2 = {"Lt4/a;", "", "", "encryptedTopic", "", "keyIdentifier", "encapsulatedKey", "<init>", "([BLjava/lang/String;[B)V", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "[B", "getEncryptedTopic", "()[B", "b", "Ljava/lang/String;", "getKeyIdentifier", "c", "getEncapsulatedKey", "ads-adservices_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11511a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final byte[] EncryptedTopic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String KeyIdentifier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final byte[] EncapsulatedKey;

    public C11511a(@NotNull byte[] encryptedTopic, @NotNull String keyIdentifier, @NotNull byte[] encapsulatedKey) {
        Intrinsics.checkNotNullParameter(encryptedTopic, "encryptedTopic");
        Intrinsics.checkNotNullParameter(keyIdentifier, "keyIdentifier");
        Intrinsics.checkNotNullParameter(encapsulatedKey, "encapsulatedKey");
        this.EncryptedTopic = encryptedTopic;
        this.KeyIdentifier = keyIdentifier;
        this.EncapsulatedKey = encapsulatedKey;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11511a)) {
            return false;
        }
        C11511a c11511a = (C11511a) other;
        return Arrays.equals(this.EncryptedTopic, c11511a.EncryptedTopic) && this.KeyIdentifier.contentEquals(c11511a.KeyIdentifier) && Arrays.equals(this.EncapsulatedKey, c11511a.EncapsulatedKey);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.EncryptedTopic)), this.KeyIdentifier, Integer.valueOf(Arrays.hashCode(this.EncapsulatedKey)));
    }

    @NotNull
    public String toString() {
        return "EncryptedTopic { " + ("EncryptedTopic=" + C7797x.m32313y(this.EncryptedTopic) + ", KeyIdentifier=" + this.KeyIdentifier + ", EncapsulatedKey=" + C7797x.m32313y(this.EncapsulatedKey) + " }");
    }
}
