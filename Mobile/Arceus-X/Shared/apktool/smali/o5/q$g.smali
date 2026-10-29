.class public Lo5/q$g;
.super Lo5/x;
.source "SourceFile"

# interfaces
.implements Lo5/a0;
.implements Ly3/b$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation


# instance fields
.field public a:J

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx2/a<",
            "Lo5/a0;",
            ">;>;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx2/a<",
            "Lo5/a0;",
            ">;>;"
        }
    .end annotation
.end field

.field public d:Z

.field public e:Z

.field public f:Ly3/e;

.field public g:[Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lx2/a<",
            "Lo5/a0;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lo5/g0;

.field public i:Ljava/lang/Runnable;

.field public final synthetic j:Lo5/q;


# direct methods
.method public constructor <init>(Lo5/q;)V
    .locals 2

    iput-object p1, p0, Lo5/q$g;->j:Lo5/q;

    invoke-direct {p0}, Lo5/x;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo5/q$g;->a:J

    const/4 p1, 0x0

    iput-object p1, p0, Lo5/q$g;->b:Ljava/util/ArrayList;

    iput-object p1, p0, Lo5/q$g;->c:Ljava/util/ArrayList;

    iput-object p1, p0, Lo5/q$g;->g:[Lx2/a;

    new-instance p1, Lo5/g0;

    invoke-direct {p1}, Lo5/g0;-><init>()V

    iput-object p1, p0, Lo5/q$g;->h:Lo5/g0;

    return-void
.end method

.method public static synthetic m(Lo5/q$g;Ly3/b;ZFF)V
    .locals 4

    if-nez p2, :cond_3

    const/high16 p1, 0x3f800000    # 1.0f

    cmpg-float p1, p3, p1

    const/4 p2, 0x0

    if-gez p1, :cond_2

    invoke-virtual {p0}, Lo5/q$g;->f()J

    move-result-wide p3

    iget-object p1, p0, Lo5/q$g;->j:Lo5/q;

    check-cast p1, Lo5/b0;

    invoke-virtual {p1, p2}, Lo5/b0;->F0(I)Lo5/q;

    move-result-object p1

    invoke-static {p1}, Lo5/q;->a(Lo5/q;)Lo5/q;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo5/q;->b(Lo5/q;Lo5/q;)Lo5/q;

    iget-object p1, p0, Lo5/q$g;->j:Lo5/q;

    iget-wide v0, p0, Lo5/q$g;->a:J

    const-wide/16 v2, -0x1

    invoke-virtual {p1, v2, v3, v0, v1}, Lo5/q;->s0(JJ)V

    iget-object p1, p0, Lo5/q$g;->j:Lo5/q;

    invoke-virtual {p1, p3, p4, v2, v3}, Lo5/q;->s0(JJ)V

    iput-wide p3, p0, Lo5/q$g;->a:J

    iget-object p1, p0, Lo5/q$g;->i:Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_0
    iget-object p0, p0, Lo5/q$g;->j:Lo5/q;

    iget-object p0, p0, Lo5/q;->E:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    if-eqz p2, :cond_1

    sget-object p0, Lo5/q$i;->b:Lo5/q$i;

    const/4 p1, 0x1

    invoke-virtual {p2, p0, p1}, Lo5/q;->i0(Lo5/q$i;Z)V

    :cond_1
    return-void

    :cond_2
    iget-object p0, p0, Lo5/q$g;->j:Lo5/q;

    sget-object p1, Lo5/q$i;->b:Lo5/q$i;

    invoke-virtual {p0, p1, p2}, Lo5/q;->i0(Lo5/q$i;Z)V

    return-void

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public a(Lo5/q;)V
    .locals 0
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x1

    iput-boolean p1, p0, Lo5/q$g;->e:Z

    return-void
.end method

.method public c()V
    .locals 5

    invoke-virtual {p0}, Lo5/q$g;->o()V

    iget-object v0, p0, Lo5/q$g;->f:Ly3/e;

    invoke-virtual {p0}, Lo5/q$g;->f()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    long-to-float v1, v1

    invoke-virtual {v0, v1}, Ly3/e;->s(F)V

    return-void
.end method

.method public e(Ly3/b;FF)V
    .locals 4

    invoke-virtual {p0}, Lo5/q$g;->f()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    float-to-double p1, p2

    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    const-wide/16 v0, -0x1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iget-object p3, p0, Lo5/q$g;->j:Lo5/q;

    iget-wide v0, p0, Lo5/q$g;->a:J

    invoke-virtual {p3, p1, p2, v0, v1}, Lo5/q;->s0(JJ)V

    iput-wide p1, p0, Lo5/q$g;->a:J

    invoke-virtual {p0}, Lo5/q$g;->n()V

    return-void
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lo5/q$g;->j:Lo5/q;

    invoke-virtual {v0}, Lo5/q;->U()J

    move-result-wide v0

    return-wide v0
.end method

.method public h(J)V
    .locals 4

    iget-object v0, p0, Lo5/q$g;->f:Ly3/e;

    if-nez v0, :cond_5

    iget-wide v0, p0, Lo5/q$g;->a:J

    cmp-long v0, p1, v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lo5/q$g;->isReady()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Lo5/q$g;->e:Z

    if-nez v0, :cond_3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_1

    iget-wide v2, p0, Lo5/q$g;->a:J

    cmp-long v0, v2, v0

    if-lez v0, :cond_1

    const-wide/16 p1, -0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lo5/q$g;->f()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-nez v2, :cond_2

    iget-wide v2, p0, Lo5/q$g;->a:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_2

    const-wide/16 p1, 0x1

    add-long/2addr p1, v0

    :cond_2
    :goto_0
    iget-wide v0, p0, Lo5/q$g;->a:J

    cmp-long v2, p1, v0

    if-eqz v2, :cond_3

    iget-object v2, p0, Lo5/q$g;->j:Lo5/q;

    invoke-virtual {v2, p1, p2, v0, v1}, Lo5/q;->s0(JJ)V

    iput-wide p1, p0, Lo5/q$g;->a:J

    :cond_3
    invoke-virtual {p0}, Lo5/q$g;->n()V

    iget-object v0, p0, Lo5/q$g;->h:Lo5/g0;

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v1

    long-to-float p1, p1

    invoke-virtual {v0, v1, v2, p1}, Lo5/g0;->a(JF)V

    :cond_4
    :goto_1
    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "setCurrentPlayTimeMillis() called after animation has been started"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isReady()Z
    .locals 1

    iget-boolean v0, p0, Lo5/q$g;->d:Z

    return v0
.end method

.method public j(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lo5/q$g;->i:Ljava/lang/Runnable;

    invoke-virtual {p0}, Lo5/q$g;->o()V

    iget-object p1, p0, Lo5/q$g;->f:Ly3/e;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ly3/e;->s(F)V

    return-void
.end method

.method public final n()V
    .locals 5

    iget-object v0, p0, Lo5/q$g;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lo5/q$g;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lo5/q$g;->g:[Lx2/a;

    if-nez v1, :cond_1

    new-array v1, v0, [Lx2/a;

    iput-object v1, p0, Lo5/q$g;->g:[Lx2/a;

    :cond_1
    iget-object v1, p0, Lo5/q$g;->c:Ljava/util/ArrayList;

    iget-object v2, p0, Lo5/q$g;->g:[Lx2/a;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lx2/a;

    const/4 v2, 0x0

    iput-object v2, p0, Lo5/q$g;->g:[Lx2/a;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, v1, v3

    invoke-interface {v4, p0}, Lx2/a;->accept(Ljava/lang/Object;)V

    aput-object v2, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iput-object v1, p0, Lo5/q$g;->g:[Lx2/a;

    :cond_3
    :goto_1
    return-void
.end method

.method public final o()V
    .locals 5

    iget-object v0, p0, Lo5/q$g;->f:Ly3/e;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lo5/q$g;->h:Lo5/g0;

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lo5/q$g;->a:J

    long-to-float v3, v3

    invoke-virtual {v0, v1, v2, v3}, Lo5/g0;->a(JF)V

    new-instance v0, Ly3/e;

    new-instance v1, Ly3/d;

    invoke-direct {v1}, Ly3/d;-><init>()V

    invoke-direct {v0, v1}, Ly3/e;-><init>(Ly3/d;)V

    iput-object v0, p0, Lo5/q$g;->f:Ly3/e;

    new-instance v0, Ly3/f;

    invoke-direct {v0}, Ly3/f;-><init>()V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Ly3/f;->d(F)Ly3/f;

    const/high16 v1, 0x43480000    # 200.0f

    invoke-virtual {v0, v1}, Ly3/f;->f(F)Ly3/f;

    iget-object v1, p0, Lo5/q$g;->f:Ly3/e;

    invoke-virtual {v1, v0}, Ly3/e;->w(Ly3/f;)Ly3/e;

    iget-object v0, p0, Lo5/q$g;->f:Ly3/e;

    iget-wide v1, p0, Lo5/q$g;->a:J

    long-to-float v1, v1

    invoke-virtual {v0, v1}, Ly3/b;->m(F)Ly3/b;

    iget-object v0, p0, Lo5/q$g;->f:Ly3/e;

    invoke-virtual {v0, p0}, Ly3/b;->c(Ly3/b$r;)Ly3/b;

    iget-object v0, p0, Lo5/q$g;->f:Ly3/e;

    iget-object v1, p0, Lo5/q$g;->h:Lo5/g0;

    invoke-virtual {v1}, Lo5/g0;->b()F

    move-result v1

    invoke-virtual {v0, v1}, Ly3/b;->n(F)Ly3/b;

    iget-object v0, p0, Lo5/q$g;->f:Ly3/e;

    invoke-virtual {p0}, Lo5/q$g;->f()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    long-to-float v1, v1

    invoke-virtual {v0, v1}, Ly3/b;->i(F)Ly3/b;

    iget-object v0, p0, Lo5/q$g;->f:Ly3/e;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {v0, v1}, Ly3/b;->j(F)Ly3/b;

    iget-object v0, p0, Lo5/q$g;->f:Ly3/e;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {v0, v1}, Ly3/b;->k(F)Ly3/b;

    iget-object v0, p0, Lo5/q$g;->f:Ly3/e;

    new-instance v1, Lo5/r;

    invoke-direct {v1, p0}, Lo5/r;-><init>(Lo5/q$g;)V

    invoke-virtual {v0, v1}, Ly3/b;->b(Ly3/b$q;)Ly3/b;

    return-void
.end method

.method public p()V
    .locals 6

    invoke-virtual {p0}, Lo5/q$g;->f()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const-wide/16 v2, 0x1

    :cond_0
    iget-object v0, p0, Lo5/q$g;->j:Lo5/q;

    iget-wide v4, p0, Lo5/q$g;->a:J

    invoke-virtual {v0, v2, v3, v4, v5}, Lo5/q;->s0(JJ)V

    iput-wide v2, p0, Lo5/q$g;->a:J

    return-void
.end method

.method public q()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo5/q$g;->d:Z

    iget-object v0, p0, Lo5/q$g;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lo5/q$g;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx2/a;

    invoke-interface {v2, p0}, Lx2/a;->accept(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lo5/q$g;->n()V

    return-void
.end method
