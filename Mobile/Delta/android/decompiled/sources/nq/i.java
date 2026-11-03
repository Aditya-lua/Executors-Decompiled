package nq;

import gt.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\t\u0007\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006\u0082\u0001\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lnq/i;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "a", "stepName", "f", "g", "d", "b", "e", "c", "Lnq/i$a;", "Lnq/i$b;", "Lnq/i$c;", "Lnq/i$d;", "Lnq/i$e;", "Lnq/i$f;", "Lnq/i$g;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class i {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lnq/i$a;", "Lnq/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String stepName) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // nq.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && Intrinsics.c(this.stepName, ((a) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // nq.i
        @NotNull
        public String toString() {
            return super.toString() + "/verify-with-persona/passkey-registration";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lnq/i$b;", "Lnq/i;", "", "stepName", "Lnq/b;", "subPage", "<init>", "(Ljava/lang/String;Lnq/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lnq/b;", "getSubPage", "()Lnq/b;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final nq.b subPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String stepName, @NotNull nq.b subPage) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(subPage, "subPage");
            this.stepName = stepName;
            this.subPage = subPage;
        }

        @Override // nq.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.c(this.stepName, bVar.stepName) && Intrinsics.c(this.subPage, bVar.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override // nq.i
        @NotNull
        public String toString() {
            String str;
            nq.b bVar = this.subPage;
            if (Intrinsics.c(bVar, nq.b.a.f27402a)) {
                str = "pending";
            } else if (Intrinsics.c(bVar, nq.b.C0472b.f27403a)) {
                str = "prompt";
            } else if (Intrinsics.c(bVar, nq.b.c.f27404a)) {
                str = "review";
            } else {
                if (!Intrinsics.c(bVar, nq.b.d.f27405a)) {
                    throw new l();
                }
                str = "capture";
            }
            return super.toString() + "/documents/" + str;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lnq/i$c;", "Lnq/i;", "", "stepName", "Lnq/h;", "subPage", "<init>", "(Ljava/lang/String;Lnq/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lnq/h;", "getSubPage", "()Lnq/h;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final h subPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull String stepName, @NotNull h subPage) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(subPage, "subPage");
            this.stepName = stepName;
            this.subPage = subPage;
        }

        @Override // nq.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return Intrinsics.c(this.stepName, cVar.stepName) && Intrinsics.c(this.subPage, cVar.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override // nq.i
        @NotNull
        public String toString() {
            String str;
            h hVar = this.subPage;
            if (Intrinsics.c(hVar, h.a.f27414a)) {
                str = "autoclassification-failure";
            } else if (Intrinsics.c(hVar, h.b.f27415a)) {
                str = "autoclassification-select";
            } else if (Intrinsics.c(hVar, h.C0473h.f27421a)) {
                str = "select";
            } else if (Intrinsics.c(hVar, h.e.f27418a)) {
                str = "pending";
            } else if (hVar instanceof h.Check) {
                str = ((h.Check) this.subPage).getPageIndex() + "/check";
            } else if (hVar instanceof h.CheckUpload) {
                str = ((h.CheckUpload) this.subPage).getPageIndex() + "/check-upload";
            } else if (hVar instanceof h.Prompt) {
                str = ((h.Prompt) this.subPage).getPageIndex() + "/prompt";
            } else if (hVar instanceof h.TakePhoto) {
                str = ((h.TakePhoto) this.subPage).getPageIndex() + "/capture";
            } else {
                if (!Intrinsics.c(hVar, h.g.f27420a)) {
                    throw new l();
                }
                str = "restart";
            }
            return super.toString() + "/government-id/" + str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lnq/i$d;", "Lnq/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String stepName) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // nq.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && Intrinsics.c(this.stepName, ((d) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // nq.i
        @NotNull
        public String toString() {
            return super.toString() + "/scan-nfc";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lnq/i$e;", "Lnq/i;", "", "stepName", "Lnq/j;", "subPage", "<init>", "(Ljava/lang/String;Lnq/j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lnq/j;", "getSubPage", "()Lnq/j;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final j subPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull String stepName, @NotNull j subPage) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(subPage, "subPage");
            this.stepName = stepName;
            this.subPage = subPage;
        }

        @Override // nq.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return Intrinsics.c(this.stepName, eVar.stepName) && Intrinsics.c(this.subPage, eVar.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override // nq.i
        @NotNull
        public String toString() {
            String str;
            j jVar = this.subPage;
            if (Intrinsics.c(jVar, j.b.f27431a)) {
                str = "finalize-video";
            } else if (Intrinsics.c(jVar, j.d.f27433a)) {
                str = "pending";
            } else if (Intrinsics.c(jVar, j.e.f27434a)) {
                str = "prompt";
            } else if (jVar instanceof j.LeadInAnimation) {
                str = ((j.LeadInAnimation) this.subPage).getPose() + "/capture-lead-in-animation";
            } else if (jVar instanceof j.TakePhoto) {
                str = ((j.TakePhoto) this.subPage).getPose() + "/capture";
            } else {
                if (!Intrinsics.c(jVar, j.a.f27430a)) {
                    throw new l();
                }
                str = "check";
            }
            return super.toString() + "/selfie/" + str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lnq/i$f;", "Lnq/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull String stepName) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // nq.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && Intrinsics.c(this.stepName, ((f) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // nq.i
        @NotNull
        public String toString() {
            return super.toString() + "/ui";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lnq/i$g;", "Lnq/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@NotNull String stepName) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // nq.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && Intrinsics.c(this.stepName, ((g) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // nq.i
        @NotNull
        public String toString() {
            return super.toString() + "/verify-with-persona/passkey-authentication";
        }
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract String getStepName();

    @NotNull
    public String toString() {
        return "/inquiry";
    }

    public i() {
    }
}
