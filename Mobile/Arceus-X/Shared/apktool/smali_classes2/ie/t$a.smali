.class public final Lie/t$a;
.super Lie/r$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lie/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lie/r$a<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-direct {p0, v0}, Lie/t$a;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lie/r$a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lie/r$b;
    .locals 0

    invoke-virtual {p0, p1}, Lie/t$a;->h(Ljava/lang/Object;)Lie/t$a;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/Object;)Lie/t$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lie/t$a<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lie/r$a;->d(Ljava/lang/Object;)Lie/r$a;

    return-object p0
.end method

.method public varargs i([Ljava/lang/Object;)Lie/t$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)",
            "Lie/t$a<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lie/r$a;->e([Ljava/lang/Object;)Lie/r$b;

    return-object p0
.end method

.method public j(Ljava/util/Iterator;)Lie/t$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "+TE;>;)",
            "Lie/t$a<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lie/r$b;->b(Ljava/util/Iterator;)Lie/r$b;

    return-object p0
.end method

.method public k()Lie/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/t<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lie/r$a;->c:Z

    iget-object v0, p0, Lie/r$a;->a:[Ljava/lang/Object;

    iget v1, p0, Lie/r$a;->b:I

    invoke-static {v0, v1}, Lie/t;->i([Ljava/lang/Object;I)Lie/t;

    move-result-object v0

    return-object v0
.end method
