package p259l0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140g0.AbstractC5952w2;
import p182i0.AbstractC6600b;
import p204j0.ResolvedFeatureGroup;

/* JADX INFO: renamed from: l0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m31665d2 = {"Ll0/b;", "", "a", "d", "c", "b", "Ll0/b$a;", "Ll0/b$b;", "Ll0/b$c;", "Ll0/b$d;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public interface InterfaceC7956b {

    /* JADX INFO: renamed from: l0.b$a, reason: from toString */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Ll0/b$a;", "Ll0/b;", "Lj0/b;", "resolvedFeatureGroup", "<init>", "(Lj0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj0/b;", "()Lj0/b;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final /* data */ class Supported implements InterfaceC7956b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final ResolvedFeatureGroup resolvedFeatureGroup;

        public Supported(@NotNull ResolvedFeatureGroup resolvedFeatureGroup) {
            Intrinsics.checkNotNullParameter(resolvedFeatureGroup, "resolvedFeatureGroup");
            this.resolvedFeatureGroup = resolvedFeatureGroup;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ResolvedFeatureGroup getResolvedFeatureGroup() {
            return this.resolvedFeatureGroup;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Supported) && Intrinsics.m31980c(this.resolvedFeatureGroup, ((Supported) other).resolvedFeatureGroup);
        }

        public int hashCode() {
            return this.resolvedFeatureGroup.hashCode();
        }

        @NotNull
        public String toString() {
            return "Supported(resolvedFeatureGroup=" + this.resolvedFeatureGroup + ')';
        }
    }

    /* JADX INFO: renamed from: l0.b$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Ll0/b$b;", "Ll0/b;", "<init>", "()V", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class b implements InterfaceC7956b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f29835a = new b();
    }

    /* JADX INFO: renamed from: l0.b$c, reason: from toString */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Ll0/b$c;", "Ll0/b;", "Lg0/w2;", "unsupportedUseCase", "<init>", "(Lg0/w2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg0/w2;", "()Lg0/w2;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final /* data */ class UnsupportedUseCase implements InterfaceC7956b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final AbstractC5952w2 unsupportedUseCase;

        public UnsupportedUseCase(@NotNull AbstractC5952w2 unsupportedUseCase) {
            Intrinsics.checkNotNullParameter(unsupportedUseCase, "unsupportedUseCase");
            this.unsupportedUseCase = unsupportedUseCase;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC5952w2 getUnsupportedUseCase() {
            return this.unsupportedUseCase;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnsupportedUseCase) && Intrinsics.m31980c(this.unsupportedUseCase, ((UnsupportedUseCase) other).unsupportedUseCase);
        }

        public int hashCode() {
            return this.unsupportedUseCase.hashCode();
        }

        @NotNull
        public String toString() {
            return "UnsupportedUseCase(unsupportedUseCase=" + this.unsupportedUseCase + ')';
        }
    }

    /* JADX INFO: renamed from: l0.b$d, reason: from toString */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Ll0/b$d;", "Ll0/b;", "", "requiredUseCases", "Li0/b;", "featureRequiring", "<init>", "(Ljava/lang/String;Li0/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Li0/b;", "()Li0/b;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final /* data */ class UseCaseMissing implements InterfaceC7956b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String requiredUseCases;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final AbstractC6600b featureRequiring;

        public UseCaseMissing(@NotNull String requiredUseCases, @NotNull AbstractC6600b featureRequiring) {
            Intrinsics.checkNotNullParameter(requiredUseCases, "requiredUseCases");
            Intrinsics.checkNotNullParameter(featureRequiring, "featureRequiring");
            this.requiredUseCases = requiredUseCases;
            this.featureRequiring = featureRequiring;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC6600b getFeatureRequiring() {
            return this.featureRequiring;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRequiredUseCases() {
            return this.requiredUseCases;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UseCaseMissing)) {
                return false;
            }
            UseCaseMissing useCaseMissing = (UseCaseMissing) other;
            return Intrinsics.m31980c(this.requiredUseCases, useCaseMissing.requiredUseCases) && Intrinsics.m31980c(this.featureRequiring, useCaseMissing.featureRequiring);
        }

        public int hashCode() {
            return (this.requiredUseCases.hashCode() * 31) + this.featureRequiring.hashCode();
        }

        @NotNull
        public String toString() {
            return "UseCaseMissing(requiredUseCases=" + this.requiredUseCases + ", featureRequiring=" + this.featureRequiring + ')';
        }
    }
}
