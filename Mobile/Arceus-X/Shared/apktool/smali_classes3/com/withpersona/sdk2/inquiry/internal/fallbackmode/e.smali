.class public final Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lum/w;",
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
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;",
            ">;",
            "Lft/i<",
            "Lum/w;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/e;->a:Lft/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/e;->b:Lft/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/e;->c:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;",
            ">;",
            "Lft/i<",
            "Lum/w;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/e;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/e;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/e;-><init>(Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;Lum/w;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;-><init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;Lum/w;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;
    .locals 3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/e;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/e;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lum/w;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/e;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/e;->c(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;Lum/w;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/e;->b()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    move-result-object v0

    return-object v0
.end method
