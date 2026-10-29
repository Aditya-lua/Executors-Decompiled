.class public final Ldp/k;
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


# direct methods
.method public constructor <init>(Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroidx/lifecycle/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldp/k;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Ldp/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroidx/lifecycle/l0;",
            ">;)",
            "Ldp/k;"
        }
    .end annotation

    new-instance v0, Ldp/k;

    invoke-direct {v0, p0}, Ldp/k;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Ljava/util/List;Ljava/lang/String;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;",
            ">;",
            "Ljava/lang/String;",
            "Landroidx/lifecycle/l0;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;-><init>(Ljava/util/List;Ljava/lang/String;Landroidx/lifecycle/l0;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;"
        }
    .end annotation

    iget-object v0, p0, Ldp/k;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/l0;

    invoke-static {p1, p2, v0}, Ldp/k;->c(Ljava/util/List;Ljava/lang/String;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    move-result-object p1

    return-object p1
.end method
