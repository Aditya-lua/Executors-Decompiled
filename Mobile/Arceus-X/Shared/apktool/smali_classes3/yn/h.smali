.class public final Lyn/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lyn/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lyn/e;

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lyn/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lyn/e;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyn/e;",
            "Lft/i<",
            "Lyn/r;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyn/h;->a:Lyn/e;

    iput-object p2, p0, Lyn/h;->b:Lft/i;

    return-void
.end method

.method public static a(Lyn/e;Lft/i;)Lyn/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyn/e;",
            "Lft/i<",
            "Lyn/r;",
            ">;)",
            "Lyn/h;"
        }
    .end annotation

    new-instance v0, Lyn/h;

    invoke-direct {v0, p0, p1}, Lyn/h;-><init>(Lyn/e;Lft/i;)V

    return-object v0
.end method

.method public static b(Lyn/e;Lyn/r;)Lyn/b;
    .locals 0

    invoke-virtual {p0, p1}, Lyn/e;->c(Lyn/r;)Lyn/b;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lyn/b;

    return-object p0
.end method


# virtual methods
.method public c()Lyn/b;
    .locals 2

    iget-object v0, p0, Lyn/h;->a:Lyn/e;

    iget-object v1, p0, Lyn/h;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyn/r;

    invoke-static {v0, v1}, Lyn/h;->b(Lyn/e;Lyn/r;)Lyn/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyn/h;->c()Lyn/b;

    move-result-object v0

    return-object v0
.end method
