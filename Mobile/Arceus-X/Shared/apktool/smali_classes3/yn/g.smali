.class public final Lyn/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lyn/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lyn/e;

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lyn/p;",
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
            "Lyn/p;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyn/g;->a:Lyn/e;

    iput-object p2, p0, Lyn/g;->b:Lft/i;

    return-void
.end method

.method public static a(Lyn/e;Lft/i;)Lyn/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyn/e;",
            "Lft/i<",
            "Lyn/p;",
            ">;)",
            "Lyn/g;"
        }
    .end annotation

    new-instance v0, Lyn/g;

    invoke-direct {v0, p0, p1}, Lyn/g;-><init>(Lyn/e;Lft/i;)V

    return-object v0
.end method

.method public static b(Lyn/e;Lyn/p;)Lyn/a;
    .locals 0

    invoke-virtual {p0, p1}, Lyn/e;->b(Lyn/p;)Lyn/a;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lyn/a;

    return-object p0
.end method


# virtual methods
.method public c()Lyn/a;
    .locals 2

    iget-object v0, p0, Lyn/g;->a:Lyn/e;

    iget-object v1, p0, Lyn/g;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyn/p;

    invoke-static {v0, v1}, Lyn/g;->b(Lyn/e;Lyn/p;)Lyn/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyn/g;->c()Lyn/a;

    move-result-object v0

    return-object v0
.end method
