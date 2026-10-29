.class public Ls/b$d;
.super Ls/b$f;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
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

.field public b:Z

.field public final synthetic c:Ls/b;


# direct methods
.method public constructor <init>(Ls/b;)V
    .locals 0

    iput-object p1, p0, Ls/b$d;->c:Ls/b;

    invoke-direct {p0}, Ls/b$f;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls/b$d;->b:Z

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

    iget-object v0, p0, Ls/b$d;->a:Ls/b$c;

    if-ne p1, v0, :cond_1

    iget-object p1, v0, Ls/b$c;->d:Ls/b$c;

    iput-object p1, p0, Ls/b$d;->a:Ls/b$c;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ls/b$d;->b:Z

    :cond_1
    return-void
.end method

.method public b()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-boolean v0, p0, Ls/b$d;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls/b$d;->b:Z

    iget-object v0, p0, Ls/b$d;->c:Ls/b;

    iget-object v0, v0, Ls/b;->a:Ls/b$c;

    iput-object v0, p0, Ls/b$d;->a:Ls/b$c;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ls/b$d;->a:Ls/b$c;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ls/b$c;->c:Ls/b$c;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Ls/b$d;->a:Ls/b$c;

    :goto_1
    iget-object v0, p0, Ls/b$d;->a:Ls/b$c;

    return-object v0
.end method

.method public hasNext()Z
    .locals 3

    iget-boolean v0, p0, Ls/b$d;->b:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Ls/b$d;->c:Ls/b;

    iget-object v0, v0, Ls/b;->a:Ls/b$c;

    if-eqz v0, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Ls/b$d;->a:Ls/b$c;

    if-eqz v0, :cond_2

    iget-object v0, v0, Ls/b$c;->c:Ls/b$c;

    if-eqz v0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls/b$d;->b()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
