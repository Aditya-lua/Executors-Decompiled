.class public final Lcom/withpersona/sdk2/inquiry/internal/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

.field public b:Lcom/withpersona/sdk2/inquiry/internal/network/f;

.field public c:Lmp/q;

.field public d:Lfn/k;

.field public e:Lmp/w;

.field public f:Lqq/a;

.field public g:Lzo/n;

.field public h:Lmp/d;

.field public i:Lmp/i;

.field public j:Lwp/f;

.field public k:Lqp/e;

.field public l:Llp/c;

.field public m:Lmq/b;

.field public n:Ldp/c;

.field public o:Ljq/c0;

.field public p:Llq/c;

.field public q:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

.field public r:Lpq/f;

.field public s:Lmp/c0;

.field public t:Lyn/e;

.field public u:Lgo/g;

.field public v:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzo/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->q:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    return-object p0
.end method

.method public b()Lzo/s;
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    const-class v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->b:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    const-class v2, Lcom/withpersona/sdk2/inquiry/internal/network/f;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->c:Lmp/q;

    const-class v2, Lmp/q;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->d:Lfn/k;

    if-nez v1, :cond_0

    new-instance v1, Lfn/k;

    invoke-direct {v1}, Lfn/k;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->d:Lfn/k;

    :cond_0
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->e:Lmp/w;

    const-class v2, Lmp/w;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->f:Lqq/a;

    const-class v2, Lqq/a;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->g:Lzo/n;

    const-class v2, Lzo/n;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->h:Lmp/d;

    const-class v2, Lmp/d;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->i:Lmp/i;

    const-class v2, Lmp/i;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->j:Lwp/f;

    if-nez v1, :cond_1

    new-instance v1, Lwp/f;

    invoke-direct {v1}, Lwp/f;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->j:Lwp/f;

    :cond_1
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->k:Lqp/e;

    const-class v2, Lqp/e;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->l:Llp/c;

    const-class v2, Llp/c;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->m:Lmq/b;

    const-class v2, Lmq/b;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->n:Ldp/c;

    const-class v2, Ldp/c;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->o:Ljq/c0;

    if-nez v1, :cond_2

    new-instance v1, Ljq/c0;

    invoke-direct {v1}, Ljq/c0;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->o:Ljq/c0;

    :cond_2
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->p:Llq/c;

    if-nez v1, :cond_3

    new-instance v1, Llq/c;

    invoke-direct {v1}, Llq/c;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->p:Llq/c;

    :cond_3
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->q:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    const-class v2, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->r:Lpq/f;

    const-class v2, Lpq/f;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->s:Lmp/c0;

    const-class v2, Lmp/c0;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->t:Lyn/e;

    if-nez v1, :cond_4

    new-instance v1, Lyn/e;

    invoke-direct {v1}, Lyn/e;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->t:Lyn/e;

    :cond_4
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->u:Lgo/g;

    if-nez v1, :cond_5

    new-instance v1, Lgo/g;

    invoke-direct {v1}, Lgo/g;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->u:Lgo/g;

    :cond_5
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->v:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    const-class v2, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    invoke-static {v1, v2}, Lft/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->b:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->c:Lmp/q;

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->d:Lfn/k;

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->e:Lmp/w;

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->f:Lqq/a;

    iget-object v10, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->g:Lzo/n;

    iget-object v11, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->h:Lmp/d;

    iget-object v12, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->i:Lmp/i;

    iget-object v13, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->j:Lwp/f;

    iget-object v14, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->k:Lqp/e;

    iget-object v15, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->l:Llp/c;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->m:Lmq/b;

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->n:Ldp/c;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->o:Ljq/c0;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->p:Llq/c;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->q:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->r:Lpq/f;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->s:Lmp/c0;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->t:Lyn/e;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->u:Lgo/g;

    move-object/from16 v24, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->v:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    move-object/from16 v25, v1

    move-object/from16 v17, v2

    invoke-direct/range {v3 .. v25}, Lcom/withpersona/sdk2/inquiry/internal/e$f;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/internal/network/f;Lmp/q;Lfn/k;Lmp/w;Lqq/a;Lzo/n;Lmp/d;Lmp/i;Lwp/f;Lqp/e;Llp/c;Lmq/b;Ldp/c;Ljq/c0;Llq/c;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;Lpq/f;Lmp/c0;Lyn/e;Lgo/g;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;)V

    return-object v3
.end method

.method public c(Lmp/d;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmp/d;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->h:Lmp/d;

    return-object p0
.end method

.method public d(Lmq/b;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmq/b;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->m:Lmq/b;

    return-object p0
.end method

.method public e(Lmp/i;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmp/i;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->i:Lmp/i;

    return-object p0
.end method

.method public f(Lmp/q;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmp/q;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->c:Lmp/q;

    return-object p0
.end method

.method public g(Lpq/f;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpq/f;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->r:Lpq/f;

    return-object p0
.end method

.method public h(Ldp/c;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldp/c;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->n:Ldp/c;

    return-object p0
.end method

.method public i(Lqq/a;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqq/a;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->f:Lqq/a;

    return-object p0
.end method

.method public j(Lzo/n;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzo/n;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->g:Lzo/n;

    return-object p0
.end method

.method public k(Lcom/withpersona/sdk2/inquiry/internal/network/f;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/f;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->b:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    return-object p0
.end method

.method public l(Llp/c;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llp/c;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->l:Llp/c;

    return-object p0
.end method

.method public m(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    return-object p0
.end method

.method public n(Lqp/e;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqp/e;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->k:Lqp/e;

    return-object p0
.end method

.method public o(Lmp/w;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmp/w;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->e:Lmp/w;

    return-object p0
.end method

.method public p(Lmp/c0;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmp/c0;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->s:Lmp/c0;

    return-object p0
.end method

.method public q(Ljq/c0;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljq/c0;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->o:Ljq/c0;

    return-object p0
.end method

.method public r(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->v:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    return-object p0
.end method
