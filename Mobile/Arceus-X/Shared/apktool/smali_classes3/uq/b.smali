.class public final Luq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Luq/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lpq/e;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lgo/e;",
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


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lpq/e;",
            ">;",
            "Lft/i<",
            "Lgo/e;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luq/b;->a:Lft/i;

    iput-object p2, p0, Luq/b;->b:Lft/i;

    iput-object p3, p0, Luq/b;->c:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;)Luq/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lpq/e;",
            ">;",
            "Lft/i<",
            "Lgo/e;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;)",
            "Luq/b;"
        }
    .end annotation

    new-instance v0, Luq/b;

    invoke-direct {v0, p0, p1, p2}, Luq/b;-><init>(Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lpq/e;Lgo/e;Lku/p0;)Luq/a;
    .locals 1

    new-instance v0, Luq/a;

    invoke-direct {v0, p0, p1, p2}, Luq/a;-><init>(Lpq/e;Lgo/e;Lku/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Luq/a;
    .locals 3

    iget-object v0, p0, Luq/b;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpq/e;

    iget-object v1, p0, Luq/b;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgo/e;

    iget-object v2, p0, Luq/b;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lku/p0;

    invoke-static {v0, v1, v2}, Luq/b;->c(Lpq/e;Lgo/e;Lku/p0;)Luq/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Luq/b;->b()Luq/a;

    move-result-object v0

    return-object v0
.end method
