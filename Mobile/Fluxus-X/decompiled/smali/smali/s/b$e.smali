.class public abstract Ls/b$e;
.super Ls/b$f;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ls/b$f<",
        "TK;TV;>;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public a:Ls/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public b:Ls/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ls/b$c;Ls/b$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls/b$c<",
            "TK;TV;>;",
            "Ls/b$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ls/b$f;-><init>()V

    iput-object p2, p0, Ls/b$e;->a:Ls/b$c;

    iput-object p1, p0, Ls/b$e;->b:Ls/b$c;

    return-void
.end method


# virtual methods
.method public a(Ls/b$c;)V
    .locals 1
    .param p1    # Ls/b$c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls/b$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Ls/b$e;->a:Ls/b$c;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Ls/b$e;->b:Ls/b$c;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Ls/b$e;->b:Ls/b$c;

    iput-object v0, p0, Ls/b$e;->a:Ls/b$c;

    :cond_0
    iget-object v0, p0, Ls/b$e;->a:Ls/b$c;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0, v0}, Ls/b$e;->b(Ls/b$c;)Ls/b$c;

    move-result-object v0

    iput-object v0, p0, Ls/b$e;->a:Ls/b$c;

    :cond_1
    iget-object v0, p0, Ls/b$e;->b:Ls/b$c;

    if-ne v0, p1, :cond_2

    invoke-virtual {p0}, Ls/b$e;->f()Ls/b$c;

    move-result-object p1

    iput-object p1, p0, Ls/b$e;->b:Ls/b$c;

    :cond_2
    return-void
.end method

.method public abstract b(Ls/b$c;)Ls/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls/b$c<",
            "TK;TV;>;)",
            "Ls/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public abstract d(Ls/b$c;)Ls/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls/b$c<",
            "TK;TV;>;)",
            "Ls/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public e()Ljava/util/Map$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ls/b$e;->b:Ls/b$c;

    invoke-virtual {p0}, Ls/b$e;->f()Ls/b$c;

    move-result-object v1

    iput-object v1, p0, Ls/b$e;->b:Ls/b$c;

    return-object v0
.end method

.method public final f()Ls/b$c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls/b$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ls/b$e;->b:Ls/b$c;

    iget-object v1, p0, Ls/b$e;->a:Ls/b$c;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Ls/b$e;->d(Ls/b$c;)Ls/b$c;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Ls/b$e;->b:Ls/b$c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls/b$e;->e()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
