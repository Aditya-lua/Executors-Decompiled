.class public final Lpq/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lpq/c;",
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
            "Lku/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lpq/e;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpq/d;->a:Lft/i;

    iput-object p2, p0, Lpq/d;->b:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;)Lpq/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lpq/e;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;)",
            "Lpq/d;"
        }
    .end annotation

    new-instance v0, Lpq/d;

    invoke-direct {v0, p0, p1}, Lpq/d;-><init>(Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lpq/e;Lku/p0;)Lpq/c;
    .locals 1

    new-instance v0, Lpq/c;

    invoke-direct {v0, p0, p1}, Lpq/c;-><init>(Lpq/e;Lku/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lpq/c;
    .locals 2

    iget-object v0, p0, Lpq/d;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpq/e;

    iget-object v1, p0, Lpq/d;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lku/p0;

    invoke-static {v0, v1}, Lpq/d;->c(Lpq/e;Lku/p0;)Lpq/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpq/d;->b()Lpq/c;

    move-result-object v0

    return-object v0
.end method
