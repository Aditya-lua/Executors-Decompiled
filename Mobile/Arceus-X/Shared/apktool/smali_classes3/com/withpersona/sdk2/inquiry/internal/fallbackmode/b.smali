.class public final Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Ldp/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/b;->a:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/b;->b:Lft/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/b;->c:Lft/i;

    return-void
.end method

.method public static a(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;)Ldp/a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;->a(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;)Ldp/a;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldp/a;

    return-object p0
.end method

.method public static b(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/b;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/b;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/b;-><init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;Lft/i;Lft/i;)V

    return-object v0
.end method


# virtual methods
.method public c()Ldp/a;
    .locals 3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/b;->a:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/b;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/b;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/b;->a(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;)Ldp/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/b;->c()Ldp/a;

    move-result-object v0

    return-object v0
.end method
