.class public final Lho/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lgo/e;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lho/a;",
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
            "Lgo/e;",
            ">;",
            "Lft/i<",
            "Lho/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lho/c;->a:Lft/i;

    iput-object p2, p0, Lho/c;->b:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;)Lho/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lgo/e;",
            ">;",
            "Lft/i<",
            "Lho/a;",
            ">;)",
            "Lho/c;"
        }
    .end annotation

    new-instance v0, Lho/c;

    invoke-direct {v0, p0, p1}, Lho/c;-><init>(Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Lgo/e;Lho/a;)Lho/b;
    .locals 1

    new-instance v0, Lho/b;

    invoke-direct {v0, p0, p1, p2}, Lho/b;-><init>(Ljava/lang/String;Lgo/e;Lho/a;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Lho/b;
    .locals 2

    iget-object v0, p0, Lho/c;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgo/e;

    iget-object v1, p0, Lho/c;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lho/a;

    invoke-static {p1, v0, v1}, Lho/c;->c(Ljava/lang/String;Lgo/e;Lho/a;)Lho/b;

    move-result-object p1

    return-object p1
.end method
