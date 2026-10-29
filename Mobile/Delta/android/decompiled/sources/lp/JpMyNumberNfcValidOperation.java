package lp;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lp.k, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001\u0015B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006!"}, d2 = {"Llp/k;", "", "Llp/b;", "operation", "", "nonce", "Llp/a;", "hashAlgorithm", "", "passwords", "<init>", "(Llp/b;Ljava/lang/String;Llp/a;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llp/b;", "c", "()Llp/b;", "b", "Ljava/lang/String;", "Llp/a;", "()Llp/a;", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JpMyNumberNfcValidOperation {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final b operation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String nonce;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final a hashAlgorithm;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> passwords;

    /* JADX INFO: renamed from: lp.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llp/k$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$Attributes;", "attributes", "Llp/k;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$Attributes;)Llp/k;", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final JpMyNumberNfcValidOperation a(@Nullable JpMyNumberNfcScan.Attributes attributes) {
            b bVarA;
            String nonce;
            a aVarA;
            List<String> passwords;
            if (attributes == null || (bVarA = b.INSTANCE.a(attributes.getOperation())) == null || (nonce = attributes.getNonce()) == null || (aVarA = a.INSTANCE.a(attributes.getHashAlgorithm())) == null || (passwords = attributes.getPasswords()) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : passwords) {
                if (str == null || str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() < bVarA.getRequiredPasswordCount()) {
                return null;
            }
            return new JpMyNumberNfcValidOperation(bVarA, nonce, aVarA, arrayList);
        }

        public Companion() {
        }
    }

    public JpMyNumberNfcValidOperation(@NotNull b operation, @NotNull String nonce, @NotNull a hashAlgorithm, @NotNull List<String> passwords) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(hashAlgorithm, "hashAlgorithm");
        Intrinsics.checkNotNullParameter(passwords, "passwords");
        this.operation = operation;
        this.nonce = nonce;
        this.hashAlgorithm = hashAlgorithm;
        this.passwords = passwords;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getOperation() {
        return this.operation;
    }

    @NotNull
    public final List<String> d() {
        return this.passwords;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JpMyNumberNfcValidOperation)) {
            return false;
        }
        JpMyNumberNfcValidOperation jpMyNumberNfcValidOperation = (JpMyNumberNfcValidOperation) other;
        return this.operation == jpMyNumberNfcValidOperation.operation && Intrinsics.c(this.nonce, jpMyNumberNfcValidOperation.nonce) && this.hashAlgorithm == jpMyNumberNfcValidOperation.hashAlgorithm && Intrinsics.c(this.passwords, jpMyNumberNfcValidOperation.passwords);
    }

    public int hashCode() {
        return (((((this.operation.hashCode() * 31) + this.nonce.hashCode()) * 31) + this.hashAlgorithm.hashCode()) * 31) + this.passwords.hashCode();
    }

    @NotNull
    public String toString() {
        return "JpMyNumberNfcValidOperation(operation=" + this.operation + ", hashAlgorithm=" + this.hashAlgorithm + ", nonce=<redacted>, passwords=<redacted>)";
    }
}
