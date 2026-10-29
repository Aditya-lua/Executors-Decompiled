.class public final Ljq/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Ljq/k;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljq/c0;

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljq/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljq/c0;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljq/c0;",
            "Lft/i<",
            "Ljq/x;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljq/d0;->a:Ljq/c0;

    iput-object p2, p0, Ljq/d0;->b:Lft/i;

    return-void
.end method

.method public static a(Ljq/c0;Lft/i;)Ljq/d0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljq/c0;",
            "Lft/i<",
            "Ljq/x;",
            ">;)",
            "Ljq/d0;"
        }
    .end annotation

    new-instance v0, Ljq/d0;

    invoke-direct {v0, p0, p1}, Ljq/d0;-><init>(Ljq/c0;Lft/i;)V

    return-object v0
.end method

.method public static b(Ljq/c0;Ljq/x;)Ljq/k;
    .locals 0

    invoke-virtual {p0, p1}, Ljq/c0;->a(Ljq/x;)Ljq/k;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljq/k;

    return-object p0
.end method


# virtual methods
.method public c()Ljq/k;
    .locals 2

    iget-object v0, p0, Ljq/d0;->a:Ljq/c0;

    iget-object v1, p0, Ljq/d0;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljq/x;

    invoke-static {v0, v1}, Ljq/d0;->b(Ljq/c0;Ljq/x;)Ljq/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljq/d0;->c()Ljq/k;

    move-result-object v0

    return-object v0
.end method
