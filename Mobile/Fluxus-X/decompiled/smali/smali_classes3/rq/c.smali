.class public final Lrq/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroidx/lifecycle/l0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lqq/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lav/p0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lav/l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroidx/lifecycle/l0;",
            ">;",
            "Lwt/i<",
            "Lqq/a;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;",
            "Lwt/i<",
            "Lav/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrq/c;->a:Lwt/i;

    iput-object p2, p0, Lrq/c;->b:Lwt/i;

    iput-object p3, p0, Lrq/c;->c:Lwt/i;

    iput-object p4, p0, Lrq/c;->d:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lrq/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroidx/lifecycle/l0;",
            ">;",
            "Lwt/i<",
            "Lqq/a;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;",
            "Lwt/i<",
            "Lav/l0;",
            ">;)",
            "Lrq/c;"
        }
    .end annotation

    new-instance v0, Lrq/c;

    invoke-direct {v0, p0, p1, p2, p3}, Lrq/c;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lqq/a;Lav/p0;Lav/l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Lrq/b;
    .locals 10
    .param p7    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/l0;",
            "Lqq/a;",
            "Lav/p0;",
            "Lav/l0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lrq/a;",
            ">;",
            "Ljava/lang/Long;",
            ")",
            "Lrq/b;"
        }
    .end annotation

    new-instance v0, Lrq/b;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lrq/b;-><init>(Landroidx/lifecycle/l0;Lqq/a;Lav/p0;Lav/l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Lrq/b;
    .locals 10
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lrq/a;",
            ">;",
            "Ljava/lang/Long;",
            ")",
            "Lrq/b;"
        }
    .end annotation

    iget-object v0, p0, Lrq/c;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/lifecycle/l0;

    iget-object v0, p0, Lrq/c;->b:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lqq/a;

    iget-object v0, p0, Lrq/c;->c:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lav/p0;

    iget-object v0, p0, Lrq/c;->d:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lav/l0;

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    move-object v9, p5

    invoke-static/range {v1 .. v9}, Lrq/c;->c(Landroidx/lifecycle/l0;Lqq/a;Lav/p0;Lav/l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Lrq/b;

    move-result-object p1

    return-object p1
.end method
