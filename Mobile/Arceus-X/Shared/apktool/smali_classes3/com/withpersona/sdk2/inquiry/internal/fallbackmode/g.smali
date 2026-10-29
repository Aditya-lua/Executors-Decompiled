.class public final Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lum/w;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lum/w;",
            ">;",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->a:Lft/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->b:Lft/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->c:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lum/w;",
            ">;",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;-><init>(Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lum/w;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;I)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;-><init>(Lum/w;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;I)V

    return-object v0
.end method


# virtual methods
.method public b(I)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;
    .locals 3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lum/w;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->c(Lum/w;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;I)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;

    move-result-object p1

    return-object p1
.end method
