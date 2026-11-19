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

.field public c:Laq/q;

.field public d:Lsn/n;

.field public e:Laq/w;

.field public f:Ler/a;

.field public g:Lnp/n;

.field public h:Laq/d;

.field public i:Laq/i;

.field public j:Lkq/f;

.field public k:Leq/h;

.field public l:Lzp/e;

.field public m:Lar/b;

.field public n:Lrp/c;

.field public o:Lxq/c0;

.field public p:Lzq/c;

.field public q:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

.field public r:Ldr/f;

.field public s:Laq/c0;

.field public t:Lmo/e;

.field public u:Lto/g;

.field public v:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lnp/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->q:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    return-object p0
.end method

.method public b()Lnp/s;
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    const-class v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->b:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    const-class v2, Lcom/withpersona/sdk2/inquiry/internal/network/f;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->c:Laq/q;

    const-class v2, Laq/q;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->d:Lsn/n;

    if-nez v1, :cond_0

    new-instance v1, Lsn/n;

    invoke-direct {v1}, Lsn/n;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->d:Lsn/n;

    :cond_0
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->e:Laq/w;

    const-class v2, Laq/w;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->f:Ler/a;

    const-class v2, Ler/a;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->g:Lnp/n;

    const-class v2, Lnp/n;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->h:Laq/d;

    const-class v2, Laq/d;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->i:Laq/i;

    const-class v2, Laq/i;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->j:Lkq/f;

    if-nez v1, :cond_1

    new-instance v1, Lkq/f;

    invoke-direct {v1}, Lkq/f;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->j:Lkq/f;

    :cond_1
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->k:Leq/h;

    const-class v2, Leq/h;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->l:Lzp/e;

    const-class v2, Lzp/e;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->m:Lar/b;

    const-class v2, Lar/b;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->n:Lrp/c;

    const-class v2, Lrp/c;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->o:Lxq/c0;

    if-nez v1, :cond_2

    new-instance v1, Lxq/c0;

    invoke-direct {v1}, Lxq/c0;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->o:Lxq/c0;

    :cond_2
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->p:Lzq/c;

    if-nez v1, :cond_3

    new-instance v1, Lzq/c;

    invoke-direct {v1}, Lzq/c;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->p:Lzq/c;

    :cond_3
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->q:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    const-class v2, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->r:Ldr/f;

    const-class v2, Ldr/f;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->s:Laq/c0;

    const-class v2, Laq/c0;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->t:Lmo/e;

    if-nez v1, :cond_4

    new-instance v1, Lmo/e;

    invoke-direct {v1}, Lmo/e;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->t:Lmo/e;

    :cond_4
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->u:Lto/g;

    if-nez v1, :cond_5

    new-instance v1, Lto/g;

    invoke-direct {v1}, Lto/g;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->u:Lto/g;

    :cond_5
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->v:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    const-class v2, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    invoke-static {v1, v2}, Lwt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->b:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->c:Laq/q;

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->d:Lsn/n;

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->e:Laq/w;

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->f:Ler/a;

    iget-object v10, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->g:Lnp/n;

    iget-object v11, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->h:Laq/d;

    iget-object v12, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->i:Laq/i;

    iget-object v13, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->j:Lkq/f;

    iget-object v14, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->k:Leq/h;

    iget-object v15, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->l:Lzp/e;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->m:Lar/b;

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->n:Lrp/c;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->o:Lxq/c0;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->p:Lzq/c;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->q:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->r:Ldr/f;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->s:Laq/c0;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->t:Lmo/e;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->u:Lto/g;

    move-object/from16 v24, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->v:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    move-object/from16 v25, v1

    move-object/from16 v17, v2

    invoke-direct/range {v3 .. v25}, Lcom/withpersona/sdk2/inquiry/internal/e$f;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/internal/network/f;Laq/q;Lsn/n;Laq/w;Ler/a;Lnp/n;Laq/d;Laq/i;Lkq/f;Leq/h;Lzp/e;Lar/b;Lrp/c;Lxq/c0;Lzq/c;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;Ldr/f;Laq/c0;Lmo/e;Lto/g;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;)V

    return-object v3
.end method

.method public c(Laq/d;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laq/d;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->h:Laq/d;

    return-object p0
.end method

.method public d(Lar/b;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lar/b;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->m:Lar/b;

    return-object p0
.end method

.method public e(Laq/i;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laq/i;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->i:Laq/i;

    return-object p0
.end method

.method public f(Laq/q;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laq/q;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->c:Laq/q;

    return-object p0
.end method

.method public g(Ldr/f;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldr/f;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->r:Ldr/f;

    return-object p0
.end method

.method public h(Lrp/c;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lrp/c;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->n:Lrp/c;

    return-object p0
.end method

.method public i(Ler/a;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ler/a;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->f:Ler/a;

    return-object p0
.end method

.method public j(Lnp/n;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnp/n;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->g:Lnp/n;

    return-object p0
.end method

.method public k(Lcom/withpersona/sdk2/inquiry/internal/network/f;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/f;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->b:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    return-object p0
.end method

.method public l(Lzp/e;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzp/e;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->l:Lzp/e;

    return-object p0
.end method

.method public m(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    return-object p0
.end method

.method public n(Leq/h;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leq/h;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->k:Leq/h;

    return-object p0
.end method

.method public o(Laq/w;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laq/w;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->e:Laq/w;

    return-object p0
.end method

.method public p(Laq/c0;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laq/c0;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->s:Laq/c0;

    return-object p0
.end method

.method public q(Lxq/c0;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxq/c0;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->o:Lxq/c0;

    return-object p0
.end method

.method public r(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Lwt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->v:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    return-object p0
.end method
