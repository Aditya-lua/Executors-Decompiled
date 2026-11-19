.class public final Lnp/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lup/w;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmo/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lkq/c;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lrp/i;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lzr/a;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lgr/b;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lup/w;",
            ">;",
            "Lwt/i<",
            "Lmo/a;",
            ">;",
            "Lwt/i<",
            "Lkq/c;",
            ">;",
            "Lwt/i<",
            "Lrp/i;",
            ">;",
            "Lwt/i<",
            "Lzr/a;",
            ">;",
            "Lwt/i<",
            "Lgr/b;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/e0;->a:Lwt/i;

    iput-object p2, p0, Lnp/e0;->b:Lwt/i;

    iput-object p3, p0, Lnp/e0;->c:Lwt/i;

    iput-object p4, p0, Lnp/e0;->d:Lwt/i;

    iput-object p5, p0, Lnp/e0;->e:Lwt/i;

    iput-object p6, p0, Lnp/e0;->f:Lwt/i;

    iput-object p7, p0, Lnp/e0;->g:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lnp/e0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lup/w;",
            ">;",
            "Lwt/i<",
            "Lmo/a;",
            ">;",
            "Lwt/i<",
            "Lkq/c;",
            ">;",
            "Lwt/i<",
            "Lrp/i;",
            ">;",
            "Lwt/i<",
            "Lzr/a;",
            ">;",
            "Lwt/i<",
            "Lgr/b;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;)",
            "Lnp/e0;"
        }
    .end annotation

    new-instance v0, Lnp/e0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lnp/e0;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnp/c0;Lhr/g;ZLup/w;Lmo/a;Lkq/c;Lrp/i;Lzr/a;Lgr/b;Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lcom/withpersona/sdk2/inquiry/internal/n;
    .locals 14
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/n;

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v0 .. v13}, Lcom/withpersona/sdk2/inquiry/internal/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnp/c0;Lhr/g;ZLup/w;Lmo/a;Lkq/c;Lrp/i;Lzr/a;Lgr/b;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnp/c0;Lhr/g;Z)Lcom/withpersona/sdk2/inquiry/internal/n;
    .locals 14
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lnp/e0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lup/w;

    iget-object v0, p0, Lnp/e0;->b:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lmo/a;

    iget-object v0, p0, Lnp/e0;->c:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lkq/c;

    iget-object v0, p0, Lnp/e0;->d:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lrp/i;

    iget-object v0, p0, Lnp/e0;->e:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lzr/a;

    iget-object v0, p0, Lnp/e0;->f:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lgr/b;

    iget-object v0, p0, Lnp/e0;->g:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/withpersona/sdk2/inquiry/internal/network/e;

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    invoke-static/range {v1 .. v13}, Lnp/e0;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnp/c0;Lhr/g;ZLup/w;Lmo/a;Lkq/c;Lrp/i;Lzr/a;Lgr/b;Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lcom/withpersona/sdk2/inquiry/internal/n;

    move-result-object p1

    return-object p1
.end method
