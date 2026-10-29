.class public final Ldq/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroidx/lifecycle/l0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcq/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lku/p0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lku/l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroidx/lifecycle/l0;",
            ">;",
            "Lft/i<",
            "Lcq/a;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;",
            "Lft/i<",
            "Lku/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldq/b;->a:Lft/i;

    iput-object p2, p0, Ldq/b;->b:Lft/i;

    iput-object p3, p0, Ldq/b;->c:Lft/i;

    iput-object p4, p0, Ldq/b;->d:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;)Ldq/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroidx/lifecycle/l0;",
            ">;",
            "Lft/i<",
            "Lcq/a;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;",
            "Lft/i<",
            "Lku/l0;",
            ">;)",
            "Ldq/b;"
        }
    .end annotation

    new-instance v0, Ldq/b;

    invoke-direct {v0, p0, p1, p2, p3}, Ldq/b;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lcq/a;Lku/p0;Lku/l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Ldq/a;
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
            "Lcq/a;",
            "Lku/p0;",
            "Lku/l0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;",
            ">;",
            "Ljava/lang/Long;",
            ")",
            "Ldq/a;"
        }
    .end annotation

    new-instance v0, Ldq/a;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Ldq/a;-><init>(Landroidx/lifecycle/l0;Lcq/a;Lku/p0;Lku/l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Ldq/a;
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
            "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;",
            ">;",
            "Ljava/lang/Long;",
            ")",
            "Ldq/a;"
        }
    .end annotation

    iget-object v0, p0, Ldq/b;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/lifecycle/l0;

    iget-object v0, p0, Ldq/b;->b:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcq/a;

    iget-object v0, p0, Ldq/b;->c:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lku/p0;

    iget-object v0, p0, Ldq/b;->d:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lku/l0;

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    move-object v9, p5

    invoke-static/range {v1 .. v9}, Ldq/b;->c(Landroidx/lifecycle/l0;Lcq/a;Lku/p0;Lku/l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Ldq/a;

    move-result-object p1

    return-object p1
.end method
