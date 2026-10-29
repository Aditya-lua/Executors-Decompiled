.class public final Llq/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lku/p0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Llq/c;

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Llq/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llq/c;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llq/c;",
            "Lft/i<",
            "Llq/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llq/d;->a:Llq/c;

    iput-object p2, p0, Llq/d;->b:Lft/i;

    return-void
.end method

.method public static a(Llq/c;Llq/a;)Lku/p0;
    .locals 0

    invoke-virtual {p0, p1}, Llq/c;->a(Llq/a;)Lku/p0;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lku/p0;

    return-object p0
.end method

.method public static b(Llq/c;Lft/i;)Llq/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llq/c;",
            "Lft/i<",
            "Llq/a;",
            ">;)",
            "Llq/d;"
        }
    .end annotation

    new-instance v0, Llq/d;

    invoke-direct {v0, p0, p1}, Llq/d;-><init>(Llq/c;Lft/i;)V

    return-object v0
.end method


# virtual methods
.method public c()Lku/p0;
    .locals 2

    iget-object v0, p0, Llq/d;->a:Llq/c;

    iget-object v1, p0, Llq/d;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llq/a;

    invoke-static {v0, v1}, Llq/d;->a(Llq/c;Llq/a;)Lku/p0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llq/d;->c()Lku/p0;

    move-result-object v0

    return-object v0
.end method
