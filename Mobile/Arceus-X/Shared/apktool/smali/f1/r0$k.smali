.class public Lf1/r0$k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "k"
.end annotation


# instance fields
.field public final a:Lg0/v2;

.field public final b:Ln0/a4;

.field public final c:I

.field public d:Z

.field public e:I

.field public f:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field public final synthetic g:Lf1/r0;


# direct methods
.method public constructor <init>(Lf1/r0;Lg0/v2;Ln0/a4;ZI)V
    .locals 1

    iput-object p1, p0, Lf1/r0$k;->g:Lf1/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf1/r0$k;->d:Z

    iput v0, p0, Lf1/r0$k;->e:I

    const/4 v0, 0x0

    iput-object v0, p0, Lf1/r0$k;->f:Ljava/util/concurrent/ScheduledFuture;

    iput-object p2, p0, Lf1/r0$k;->a:Lg0/v2;

    iput-object p3, p0, Lf1/r0$k;->b:Ln0/a4;

    invoke-static {p1, p4}, Lf1/r0;->u(Lf1/r0;Z)Z

    iput p5, p0, Lf1/r0$k;->c:I

    return-void
.end method

.method public static synthetic a(Lf1/r0$k;Lg0/v2;Ln0/a4;)V
    .locals 8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lg0/v2;->v()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lf1/r0$k;->g:Lf1/r0;

    iget-object v0, v0, Lf1/r0;->h0:Lf1/z1;

    invoke-virtual {v0, p1}, Lf1/z1;->n(Lg0/v2;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf1/r0$k;->g:Lf1/r0;

    invoke-virtual {v0}, Lf1/r0;->Q()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lf1/z1;

    iget-object v1, p0, Lf1/r0$k;->g:Lf1/r0;

    invoke-static {v1}, Lf1/r0;->y(Lf1/r0;)Lm1/o;

    move-result-object v1

    iget-object v2, p0, Lf1/r0$k;->g:Lf1/r0;

    iget-object v3, v2, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    invoke-static {v2}, Lf1/r0;->z(Lf1/r0;)Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-direct {v0, v1, v3, v2}, Lf1/z1;-><init>(Lm1/o;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    iget-object v1, p0, Lf1/r0$k;->g:Lf1/r0;

    iget-object v2, v1, Lf1/r0;->G:Ln0/y2;

    invoke-virtual {v1, v2}, Lf1/r0;->K(Ln0/s3;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf1/s;

    invoke-virtual {p1}, Lg0/v2;->o()Lg0/k0;

    move-result-object v6

    iget-object v2, p0, Lf1/r0$k;->g:Lf1/r0;

    invoke-static {v2}, Lf1/r0;->A(Lf1/r0;)Lh1/i;

    move-result-object v2

    invoke-static {v1, v6, v2}, Ll1/m;->e(Lf1/s;Lg0/k0;Lh1/i;)Ll1/p;

    move-result-object v2

    invoke-virtual {v1}, Lf1/s;->d()Lf1/c2;

    move-result-object v4

    invoke-virtual {p1}, Lg0/v2;->q()Landroid/util/Size;

    move-result-object v5

    invoke-virtual {p1}, Lg0/v2;->p()Landroid/util/Range;

    move-result-object v7

    move-object v3, p2

    invoke-static/range {v2 .. v7}, Ll1/m;->d(Ll1/p;Ln0/a4;Lf1/c2;Landroid/util/Size;Lg0/k0;Landroid/util/Range;)Lm1/p1;

    move-result-object p2

    iget-object v1, p0, Lf1/r0$k;->g:Lf1/r0;

    invoke-static {v1}, Lf1/r0;->t(Lf1/r0;)Z

    move-result v1

    invoke-static {p2, v1}, Ll1/m;->g(Lm1/p1;Z)Lm1/p1;

    move-result-object p2

    iget-object v1, p0, Lf1/r0$k;->g:Lf1/r0;

    invoke-static {v1, p2}, Lf1/r0;->B(Lf1/r0;Lm1/p1;)Lm1/p1;

    invoke-virtual {v0, p1, p2}, Lf1/z1;->i(Lg0/v2;Lm1/p1;)Lne/x;

    move-result-object p1

    iget-object p2, p0, Lf1/r0$k;->g:Lf1/r0;

    iput-object v0, p2, Lf1/r0;->h0:Lf1/z1;

    new-instance p2, Lf1/r0$k$a;

    invoke-direct {p2, p0, v0}, Lf1/r0$k$a;-><init>(Lf1/r0$k;Lf1/z1;)V

    iget-object p0, p0, Lf1/r0$k;->g:Lf1/r0;

    iget-object p0, p0, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p0}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Ignore the SurfaceRequest "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " isServiced: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lg0/v2;->v()Z

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, " VideoEncoderSession: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lf1/r0$k;->g:Lf1/r0;

    iget-object p0, p0, Lf1/r0;->h0:Lf1/z1;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " has been configured with a persistent in-progress recording."

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Recorder"

    invoke-static {p1, p0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lf1/r0$k;)Z
    .locals 0

    iget-boolean p0, p0, Lf1/r0$k;->d:Z

    return p0
.end method

.method public static synthetic c(Lf1/r0$k;)Lg0/v2;
    .locals 0

    iget-object p0, p0, Lf1/r0$k;->a:Lg0/v2;

    return-object p0
.end method

.method public static synthetic d(Lf1/r0$k;)Ln0/a4;
    .locals 0

    iget-object p0, p0, Lf1/r0$k;->b:Ln0/a4;

    return-object p0
.end method

.method public static synthetic e(Lf1/r0$k;Lg0/v2;Ln0/a4;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lf1/r0$k;->k(Lg0/v2;Ln0/a4;)V

    return-void
.end method

.method public static synthetic f(Lf1/r0$k;)I
    .locals 0

    iget p0, p0, Lf1/r0$k;->e:I

    return p0
.end method

.method public static synthetic g(Lf1/r0$k;)I
    .locals 2

    iget v0, p0, Lf1/r0$k;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lf1/r0$k;->e:I

    return v0
.end method

.method public static synthetic h(Lf1/r0$k;)I
    .locals 0

    iget p0, p0, Lf1/r0$k;->c:I

    return p0
.end method

.method public static synthetic i(Lf1/r0$k;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    iput-object p1, p0, Lf1/r0$k;->f:Ljava/util/concurrent/ScheduledFuture;

    return-object p1
.end method


# virtual methods
.method public j()V
    .locals 2

    iget-boolean v0, p0, Lf1/r0$k;->d:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lf1/r0$k;->d:Z

    iget-object v0, p0, Lf1/r0$k;->f:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lf1/r0$k;->f:Ljava/util/concurrent/ScheduledFuture;

    :cond_1
    :goto_0
    return-void
.end method

.method public final k(Lg0/v2;Ln0/a4;)V
    .locals 2

    iget-object v0, p0, Lf1/r0$k;->g:Lf1/r0;

    invoke-static {v0}, Lf1/r0;->v(Lf1/r0;)Lne/x;

    move-result-object v0

    new-instance v1, Lf1/b1;

    invoke-direct {v1, p0, p1, p2}, Lf1/b1;-><init>(Lf1/r0$k;Lg0/v2;Ln0/a4;)V

    iget-object p1, p0, Lf1/r0$k;->g:Lf1/r0;

    iget-object p1, p1, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, p1}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public l()V
    .locals 2

    iget-object v0, p0, Lf1/r0$k;->a:Lg0/v2;

    iget-object v1, p0, Lf1/r0$k;->b:Ln0/a4;

    invoke-virtual {p0, v0, v1}, Lf1/r0$k;->k(Lg0/v2;Ln0/a4;)V

    return-void
.end method
