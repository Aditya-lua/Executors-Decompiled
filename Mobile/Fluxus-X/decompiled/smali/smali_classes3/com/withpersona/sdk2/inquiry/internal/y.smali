.class public final Lcom/withpersona/sdk2/inquiry/internal/y;
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
            "Lso/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lnp/q0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lto/e;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lup/w;",
            ">;",
            "Lwt/i<",
            "Lso/a;",
            ">;",
            "Lwt/i<",
            "Lnp/q0;",
            ">;",
            "Lwt/i<",
            "Lto/e;",
            ">;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/y;->a:Lwt/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/y;->b:Lwt/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/y;->c:Lwt/i;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/internal/y;->d:Lwt/i;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/internal/y;->e:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lcom/withpersona/sdk2/inquiry/internal/y;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lup/w;",
            ">;",
            "Lwt/i<",
            "Lso/a;",
            ">;",
            "Lwt/i<",
            "Lnp/q0;",
            ">;",
            "Lwt/i<",
            "Lto/e;",
            ">;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/internal/y;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/y;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/internal/y;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lhr/g;Lcom/withpersona/sdk2/inquiry/internal/x$c;Lup/w;Lso/a;Lnp/q0;Lto/e;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/internal/x;
    .locals 13
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/FieldMapping;",
            ">;",
            "Lhr/g;",
            "Lcom/withpersona/sdk2/inquiry/internal/x$c;",
            "Lup/w;",
            "Lso/a;",
            "Lnp/q0;",
            "Lto/e;",
            "Landroid/content/Context;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/internal/x;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/x;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v0 .. v12}, Lcom/withpersona/sdk2/inquiry/internal/x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lhr/g;Lcom/withpersona/sdk2/inquiry/internal/x$c;Lup/w;Lso/a;Lnp/q0;Lto/e;Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lhr/g;Lcom/withpersona/sdk2/inquiry/internal/x$c;)Lcom/withpersona/sdk2/inquiry/internal/x;
    .locals 13
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/FieldMapping;",
            ">;",
            "Lhr/g;",
            "Lcom/withpersona/sdk2/inquiry/internal/x$c;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/internal/x;"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/y;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lup/w;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/y;->b:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lso/a;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/y;->c:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lnp/q0;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/y;->d:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lto/e;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/y;->e:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/content/Context;

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    invoke-static/range {v1 .. v12}, Lcom/withpersona/sdk2/inquiry/internal/y;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lhr/g;Lcom/withpersona/sdk2/inquiry/internal/x$c;Lup/w;Lso/a;Lnp/q0;Lto/e;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/internal/x;

    move-result-object p1

    return-object p1
.end method
