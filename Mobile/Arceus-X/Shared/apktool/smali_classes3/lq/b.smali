.class public final Llq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Llq/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lku/l0;",
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
            "Lku/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llq/b;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Llq/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lku/l0;",
            ">;)",
            "Llq/b;"
        }
    .end annotation

    new-instance v0, Llq/b;

    invoke-direct {v0, p0}, Llq/b;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Lku/l0;)Llq/a;
    .locals 1

    new-instance v0, Llq/a;

    invoke-direct {v0, p0}, Llq/a;-><init>(Lku/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Llq/a;
    .locals 1

    iget-object v0, p0, Llq/b;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lku/l0;

    invoke-static {v0}, Llq/b;->c(Lku/l0;)Llq/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llq/b;->b()Llq/a;

    move-result-object v0

    return-object v0
.end method
