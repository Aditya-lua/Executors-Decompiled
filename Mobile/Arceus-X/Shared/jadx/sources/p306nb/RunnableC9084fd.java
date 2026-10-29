package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.fd */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9084fd implements Runnable {

    /* JADX INFO: renamed from: a */
    public final long f32931a;

    /* JADX INFO: renamed from: b */
    public final long f32932b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9100gd f32933c;

    public RunnableC9084fd(C9100gd c9100gd, long j10, long j11) {
        Objects.requireNonNull(c9100gd);
        this.f32933c = c9100gd;
        this.f32931a = j10;
        this.f32932b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32933c.f32990b.f33067a.mo36322b().m36263t(new Runnable() { // from class: nb.ed
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                RunnableC9084fd runnableC9084fd = this.f32899a;
                C9180ld c9180ld = runnableC9084fd.f32933c.f32990b;
                c9180ld.mo36088h();
                C9094g7 c9094g7 = c9180ld.f33067a;
                c9094g7.mo36321a().m37010v().m36911a("Application going to the background");
                c9094g7.m36339x().f33132t.m36296b(true);
                c9180ld.m36467o(true);
                if (!c9094g7.m36338w().m36412N()) {
                    long j10 = runnableC9084fd.f32932b;
                    C9148jd c9148jd = c9180ld.f33191f;
                    c9148jd.m36393d(false, false, j10);
                    c9148jd.m36391b(j10);
                }
                c9094g7.mo36321a().m37009u().m36912b("Application backgrounded at: timestamp_millis", Long.valueOf(runnableC9084fd.f32931a));
                C9094g7 c9094g8 = c9180ld.f33067a;
                C9257qa c9257qaM36307B = c9094g8.m36307B();
                c9257qaM36307B.mo36088h();
                C9094g7 c9094g9 = c9257qaM36307B.f33067a;
                c9257qaM36307B.m36121j();
                C9307tc c9307tcM36315J = c9094g9.m36315J();
                c9307tcM36315J.mo36088h();
                c9307tcM36315J.m36121j();
                if (!c9307tcM36315J.m36907y() || c9307tcM36315J.f33067a.m36308C().m36953W() >= 242600) {
                    c9094g9.m36315J().m36902t();
                }
                if (c9094g7.m36338w().m36406H(null, C9395z4.f33734O0)) {
                    long jM36402D = c9094g7.m36308C().m36947P(c9094g7.mo36324d().getPackageName(), c9094g7.m36338w().m36416R()) ? 1000L : c9094g7.m36338w().m36402D(c9094g7.mo36324d().getPackageName(), C9395z4.f33713E);
                    c9094g7.mo36321a().m37011w().m36912b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(jM36402D));
                    c9094g8.m36319N().m37063o(jM36402D);
                }
            }
        });
    }
}
