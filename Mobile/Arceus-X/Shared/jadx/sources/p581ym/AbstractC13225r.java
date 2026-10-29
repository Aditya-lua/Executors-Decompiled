package p581ym;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ym.r */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000 \t*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u00020\u0004:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\t\u001a\u00020\b*\u00180\u0007R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, m31665d2 = {"Lym/r;", "PropsT", "StateT", "OutputT", "", "<init>", "()V", "Lym/r$c;", "", "a", "(Lym/r$c;)V", "b", "c", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public abstract class AbstractC13225r<PropsT, StateT, OutputT> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final a f46546b = new a();

    /* JADX INFO: renamed from: ym.r$a */
    @Metadata(m31664d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\b\u001a\u00020\u0007*\u001e0\u0006R\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"ym/r$a", "Lym/r;", "", "", "toString", "()Ljava/lang/String;", "Lym/r$c;", "", "a", "(Lym/r$c;)V", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class a extends AbstractC13225r<Object, Object, Object> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [ym.r<java.lang.Object, java.lang.Object, ? extends java.lang.Object>$c] */
        @Override // p581ym.AbstractC13225r
        /* JADX INFO: renamed from: a */
        public void mo48844a(@NotNull AbstractC13225r<? super Object, Object, ? extends Object>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
        }

        @NotNull
        public String toString() {
            return "WorkflowAction.noAction()";
        }
    }

    /* JADX INFO: renamed from: ym.r$c */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00028\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00028\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\tR4\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00108\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\n\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Lym/r$c;", "", "props", "state", "<init>", "(Lym/r;Ljava/lang/Object;Ljava/lang/Object;)V", "output", "", "d", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "c", "e", "Lym/v;", "<set-?>", "Lym/v;", "()Lym/v;", "maybeOutput", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final PropsT props;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public StateT state;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public WorkflowOutput<? extends OutputT> maybeOutput;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC13225r<PropsT, StateT, OutputT> f46550d;

        public c(AbstractC13225r this$0, PropsT propst, StateT statet) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f46550d = this$0;
            this.props = propst;
            this.state = statet;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final WorkflowOutput<OutputT> m48899a() {
            return this.maybeOutput;
        }

        /* JADX INFO: renamed from: b */
        public final PropsT m48900b() {
            return this.props;
        }

        /* JADX INFO: renamed from: c */
        public final StateT m48901c() {
            return this.state;
        }

        /* JADX INFO: renamed from: d */
        public final void m48902d(OutputT output) {
            this.maybeOutput = new WorkflowOutput<>(output);
        }

        /* JADX INFO: renamed from: e */
        public final void m48903e(StateT statet) {
            this.state = statet;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo48844a(@NotNull AbstractC13225r<? super PropsT, StateT, ? extends OutputT>.c cVar);
}
