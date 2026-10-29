.class public abstract Lum/u$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lum/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Lum/u$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/u$g<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public b:Lum/u$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/u$g<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public c:I

.field public final synthetic d:Lum/u;


# direct methods
.method public constructor <init>(Lum/u;)V
    .locals 1

    iput-object p1, p0, Lum/u$f;->d:Lum/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lum/u;->c:Lum/u$g;

    iget-object v0, v0, Lum/u$g;->d:Lum/u$g;

    iput-object v0, p0, Lum/u$f;->a:Lum/u$g;

    const/4 v0, 0x0

    iput-object v0, p0, Lum/u$f;->b:Lum/u$g;

    iget p1, p1, Lum/u;->e:I

    iput p1, p0, Lum/u$f;->c:I

    return-void
.end method


# virtual methods
.method public final b()Lum/u$g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lum/u$g<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lum/u$f;->a:Lum/u$g;

    iget-object v1, p0, Lum/u$f;->d:Lum/u;

    iget-object v2, v1, Lum/u;->c:Lum/u$g;

    if-eq v0, v2, :cond_1

    iget v1, v1, Lum/u;->e:I

    iget v2, p0, Lum/u$f;->c:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lum/u$g;->d:Lum/u$g;

    iput-object v1, p0, Lum/u$f;->a:Lum/u$g;

    iput-object v0, p0, Lum/u$f;->b:Lum/u$g;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, Lum/u$f;->a:Lum/u$g;

    iget-object v1, p0, Lum/u$f;->d:Lum/u;

    iget-object v1, v1, Lum/u;->c:Lum/u$g;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Lum/u$f;->b:Lum/u$g;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lum/u$f;->d:Lum/u;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lum/u;->i(Lum/u$g;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lum/u$f;->b:Lum/u$g;

    iget-object v0, p0, Lum/u$f;->d:Lum/u;

    iget v0, v0, Lum/u;->e:I

    iput v0, p0, Lum/u$f;->c:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
