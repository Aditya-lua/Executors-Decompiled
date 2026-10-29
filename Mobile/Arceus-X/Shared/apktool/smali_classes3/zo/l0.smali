.class public final Lzo/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lzo/k0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lzq/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lgp/w;",
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
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lzq/a$a;",
            ">;",
            "Lft/i<",
            "Lgp/w;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo/l0;->a:Lft/i;

    iput-object p2, p0, Lzo/l0;->b:Lft/i;

    iput-object p3, p0, Lzo/l0;->c:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;)Lzo/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lzq/a$a;",
            ">;",
            "Lft/i<",
            "Lgp/w;",
            ">;)",
            "Lzo/l0;"
        }
    .end annotation

    new-instance v0, Lzo/l0;

    invoke-direct {v0, p0, p1, p2}, Lzo/l0;-><init>(Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lzq/a$a;Lgp/w;)Lzo/k0;
    .locals 1

    new-instance v0, Lzo/k0;

    invoke-direct {v0, p0, p1, p2}, Lzo/k0;-><init>(Landroid/content/Context;Lzq/a$a;Lgp/w;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzo/k0;
    .locals 3

    iget-object v0, p0, Lzo/l0;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lzo/l0;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzq/a$a;

    iget-object v2, p0, Lzo/l0;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgp/w;

    invoke-static {v0, v1, v2}, Lzo/l0;->c(Landroid/content/Context;Lzq/a$a;Lgp/w;)Lzo/k0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzo/l0;->b()Lzo/k0;

    move-result-object v0

    return-object v0
.end method
