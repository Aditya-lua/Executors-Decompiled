.class public final Lyn/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lyn/k;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lyn/e;

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lyn/z;",
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
            "Lyn/z;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyn/f;->a:Lyn/e;

    iput-object p2, p0, Lyn/f;->b:Lft/i;

    return-void
.end method

.method public static a(Lyn/e;Lyn/z;)Lyn/k;
    .locals 0

    invoke-virtual {p0, p1}, Lyn/e;->a(Lyn/z;)Lyn/k;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lyn/k;

    return-object p0
.end method

.method public static b(Lyn/e;Lft/i;)Lyn/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyn/e;",
            "Lft/i<",
            "Lyn/z;",
            ">;)",
            "Lyn/f;"
        }
    .end annotation

    new-instance v0, Lyn/f;

    invoke-direct {v0, p0, p1}, Lyn/f;-><init>(Lyn/e;Lft/i;)V

    return-object v0
.end method


# virtual methods
.method public c()Lyn/k;
    .locals 2

    iget-object v0, p0, Lyn/f;->a:Lyn/e;

    iget-object v1, p0, Lyn/f;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyn/z;

    invoke-static {v0, v1}, Lyn/f;->a(Lyn/e;Lyn/z;)Lyn/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyn/f;->c()Lyn/k;

    move-result-object v0

    return-object v0
.end method
