package ym;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000 \t*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u00020\u0004:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\t\u001a\u00020\b*\u00180\u0007R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lym/r;", "PropsT", "StateT", "OutputT", "", "<init>", "()V", "Lym/r$c;", "", "a", "(Lym/r$c;)V", "b", "c", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class r<PropsT, StateT, OutputT> {

    @NotNull
    public static final a b = new a();

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\b\u001a\u00020\u0007*\u001e0\u0006R\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ym/r$a", "Lym/r;", "", "", "toString", "()Ljava/lang/String;", "Lym/r$c;", "", "a", "(Lym/r$c;)V", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a extends r<Object, Object, Object> {
        @Override // ym.r
        public void a(@NotNull r<? super Object, Object, ? extends Object>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
        }

        @NotNull
        public String toString() {
            return "WorkflowAction.noAction()";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00028\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00028\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\tR4\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00108\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\n\u0010\u0013¨\u0006\u0015"}, d2 = {"Lym/r$c;", "", "props", "state", "<init>", "(Lym/r;Ljava/lang/Object;Ljava/lang/Object;)V", "output", "", "d", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "c", "e", "Lym/v;", "<set-?>", "Lym/v;", "()Lym/v;", "maybeOutput", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final PropsT props;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public StateT state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public WorkflowOutput<? extends OutputT> maybeOutput;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r<PropsT, StateT, OutputT> f35965d;

        public c(r this$0, PropsT propst, StateT statet) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f35965d = this$0;
            this.props = propst;
            this.state = statet;
        }

        @Nullable
        public final WorkflowOutput<OutputT> a() {
            return this.maybeOutput;
        }

        public final PropsT b() {
            return this.props;
        }

        public final StateT c() {
            return this.state;
        }

        public final void d(OutputT output) {
            this.maybeOutput = new WorkflowOutput<>(output);
        }

        public final void e(StateT statet) {
            this.state = statet;
        }
    }

    public abstract void a(@NotNull r<? super PropsT, StateT, ? extends OutputT>.c cVar);
}
