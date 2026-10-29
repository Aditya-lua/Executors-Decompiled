package p363pq;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;

/* JADX INFO: renamed from: pq.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\t\u0007\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006\u0082\u0001\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m31665d2 = {"Lpq/i;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "a", "stepName", "f", "g", "d", "b", "e", "c", "Lpq/i$a;", "Lpq/i$b;", "Lpq/i$c;", "Lpq/i$d;", "Lpq/i$e;", "Lpq/i$f;", "Lpq/i$g;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC10315i {

    /* JADX INFO: renamed from: pq.i$a */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m31665d2 = {"Lpq/i$a;", "Lpq/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class a extends AbstractC10315i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String stepName) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // p363pq.AbstractC10315i
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && Intrinsics.m31980c(this.stepName, ((a) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // p363pq.AbstractC10315i
        @NotNull
        public String toString() {
            return super.toString() + "/verify-with-persona/passkey-registration";
        }
    }

    /* JADX INFO: renamed from: pq.i$b */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lpq/i$b;", "Lpq/i;", "", "stepName", "Lpq/b;", "subPage", "<init>", "(Ljava/lang/String;Lpq/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lpq/b;", "getSubPage", "()Lpq/b;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class b extends AbstractC10315i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC10308b subPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String stepName, @NotNull InterfaceC10308b subPage) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(subPage, "subPage");
            this.stepName = stepName;
            this.subPage = subPage;
        }

        @Override // p363pq.AbstractC10315i
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
            return Intrinsics.m31980c(this.stepName, bVar.stepName) && Intrinsics.m31980c(this.subPage, bVar.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override // p363pq.AbstractC10315i
        @NotNull
        public String toString() {
            String str;
            InterfaceC10308b interfaceC10308b = this.subPage;
            if (Intrinsics.m31980c(interfaceC10308b, InterfaceC10308b.a.f37104a)) {
                str = "pending";
            } else if (Intrinsics.m31980c(interfaceC10308b, InterfaceC10308b.b.f37105a)) {
                str = "prompt";
            } else if (Intrinsics.m31980c(interfaceC10308b, InterfaceC10308b.c.f37106a)) {
                str = "review";
            } else {
                if (!Intrinsics.m31980c(interfaceC10308b, InterfaceC10308b.d.f37107a)) {
                    throw new C7345l();
                }
                str = "capture";
            }
            return super.toString() + "/documents/" + str;
        }
    }

    /* JADX INFO: renamed from: pq.i$c */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lpq/i$c;", "Lpq/i;", "", "stepName", "Lpq/h;", "subPage", "<init>", "(Ljava/lang/String;Lpq/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lpq/h;", "getSubPage", "()Lpq/h;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class c extends AbstractC10315i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC10314h subPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull String stepName, @NotNull InterfaceC10314h subPage) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(subPage, "subPage");
            this.stepName = stepName;
            this.subPage = subPage;
        }

        @Override // p363pq.AbstractC10315i
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
            return Intrinsics.m31980c(this.stepName, cVar.stepName) && Intrinsics.m31980c(this.subPage, cVar.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override // p363pq.AbstractC10315i
        @NotNull
        public String toString() {
            String str;
            InterfaceC10314h interfaceC10314h = this.subPage;
            if (Intrinsics.m31980c(interfaceC10314h, InterfaceC10314h.a.f37118a)) {
                str = "autoclassification-failure";
            } else if (Intrinsics.m31980c(interfaceC10314h, InterfaceC10314h.b.f37119a)) {
                str = "autoclassification-select";
            } else if (Intrinsics.m31980c(interfaceC10314h, InterfaceC10314h.h.f37125a)) {
                str = "select";
            } else if (Intrinsics.m31980c(interfaceC10314h, InterfaceC10314h.e.f37122a)) {
                str = "pending";
            } else if (interfaceC10314h instanceof InterfaceC10314h.Check) {
                str = ((InterfaceC10314h.Check) this.subPage).getPageIndex() + "/check";
            } else if (interfaceC10314h instanceof InterfaceC10314h.CheckUpload) {
                str = ((InterfaceC10314h.CheckUpload) this.subPage).getPageIndex() + "/check-upload";
            } else if (interfaceC10314h instanceof InterfaceC10314h.Prompt) {
                str = ((InterfaceC10314h.Prompt) this.subPage).getPageIndex() + "/prompt";
            } else if (interfaceC10314h instanceof InterfaceC10314h.TakePhoto) {
                str = ((InterfaceC10314h.TakePhoto) this.subPage).getPageIndex() + "/capture";
            } else {
                if (!Intrinsics.m31980c(interfaceC10314h, InterfaceC10314h.g.f37124a)) {
                    throw new C7345l();
                }
                str = "restart";
            }
            return super.toString() + "/government-id/" + str;
        }
    }

    /* JADX INFO: renamed from: pq.i$d */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m31665d2 = {"Lpq/i$d;", "Lpq/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class d extends AbstractC10315i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String stepName) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // p363pq.AbstractC10315i
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && Intrinsics.m31980c(this.stepName, ((d) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // p363pq.AbstractC10315i
        @NotNull
        public String toString() {
            return super.toString() + "/scan-nfc";
        }
    }

    /* JADX INFO: renamed from: pq.i$e */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lpq/i$e;", "Lpq/i;", "", "stepName", "Lpq/j;", "subPage", "<init>", "(Ljava/lang/String;Lpq/j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lpq/j;", "getSubPage", "()Lpq/j;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class e extends AbstractC10315i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC10316j subPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull String stepName, @NotNull InterfaceC10316j subPage) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(subPage, "subPage");
            this.stepName = stepName;
            this.subPage = subPage;
        }

        @Override // p363pq.AbstractC10315i
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
            return Intrinsics.m31980c(this.stepName, eVar.stepName) && Intrinsics.m31980c(this.subPage, eVar.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override // p363pq.AbstractC10315i
        @NotNull
        public String toString() {
            String str;
            InterfaceC10316j interfaceC10316j = this.subPage;
            if (Intrinsics.m31980c(interfaceC10316j, InterfaceC10316j.b.f37138a)) {
                str = "finalize-video";
            } else if (Intrinsics.m31980c(interfaceC10316j, InterfaceC10316j.d.f37140a)) {
                str = "pending";
            } else if (Intrinsics.m31980c(interfaceC10316j, InterfaceC10316j.e.f37141a)) {
                str = "prompt";
            } else if (interfaceC10316j instanceof InterfaceC10316j.LeadInAnimation) {
                str = ((InterfaceC10316j.LeadInAnimation) this.subPage).getPose() + "/capture-lead-in-animation";
            } else if (interfaceC10316j instanceof InterfaceC10316j.TakePhoto) {
                str = ((InterfaceC10316j.TakePhoto) this.subPage).getPose() + "/capture";
            } else {
                if (!Intrinsics.m31980c(interfaceC10316j, InterfaceC10316j.a.f37137a)) {
                    throw new C7345l();
                }
                str = "check";
            }
            return super.toString() + "/selfie/" + str;
        }
    }

    /* JADX INFO: renamed from: pq.i$f */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m31665d2 = {"Lpq/i$f;", "Lpq/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class f extends AbstractC10315i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull String stepName) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // p363pq.AbstractC10315i
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && Intrinsics.m31980c(this.stepName, ((f) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // p363pq.AbstractC10315i
        @NotNull
        public String toString() {
            return super.toString() + "/ui";
        }
    }

    /* JADX INFO: renamed from: pq.i$g */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m31665d2 = {"Lpq/i$g;", "Lpq/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class g extends AbstractC10315i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@NotNull String stepName) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // p363pq.AbstractC10315i
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && Intrinsics.m31980c(this.stepName, ((g) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // p363pq.AbstractC10315i
        @NotNull
        public String toString() {
            return super.toString() + "/verify-with-persona/passkey-authentication";
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: pq.i.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC10315i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract String getStepName();

    @NotNull
    public String toString() {
        return "/inquiry";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC10315i() {
    }
}
