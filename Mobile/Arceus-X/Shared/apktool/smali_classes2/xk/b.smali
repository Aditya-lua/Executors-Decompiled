.class public Lxk/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljv/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxk/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljv/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljv/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljv/d<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ljv/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ljv/d<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxk/b;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lxk/b;->b:Ljv/d;

    return-void
.end method


# virtual methods
.method public B(Ljv/f;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/f<",
            "TT;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Lxk/b;->b:Ljv/d;

    new-instance v1, Lxk/b$a;

    invoke-direct {v1, p0, p1}, Lxk/b$a;-><init>(Lxk/b;Ljv/f;)V

    invoke-interface {v0, v1}, Ljv/d;->B(Ljv/f;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "callback == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lxk/b;->b:Ljv/d;

    invoke-interface {v0}, Ljv/d;->cancel()V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxk/b;->clone()Ljv/d;

    move-result-object v0

    return-object v0
.end method

.method public clone()Ljv/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljv/d<",
            "TT;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Lxk/b;

    iget-object v1, p0, Lxk/b;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lxk/b;->b:Ljv/d;

    invoke-interface {v2}, Ljv/d;->clone()Ljv/d;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lxk/b;-><init>(Ljava/util/concurrent/Executor;Ljv/d;)V

    return-object v0
.end method

.method public execute()Ljv/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljv/x<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lxk/b;->b:Ljv/d;

    invoke-interface {v0}, Ljv/d;->execute()Ljv/x;

    move-result-object v0

    invoke-virtual {v0}, Ljv/x;->b()I

    move-result v1

    const/16 v2, 0x193

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Ljv/x;->f()Lokhttp3/Headers;

    move-result-object v1

    const-string v2, "X-CSRF-TOKEN"

    invoke-virtual {v1, v2}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lxk/b;->b:Ljv/d;

    invoke-interface {v0}, Ljv/d;->clone()Ljv/d;

    move-result-object v0

    invoke-interface {v0}, Ljv/d;->execute()Ljv/x;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public isCanceled()Z
    .locals 1

    iget-object v0, p0, Lxk/b;->b:Ljv/d;

    invoke-interface {v0}, Ljv/d;->isCanceled()Z

    move-result v0

    return v0
.end method

.method public request()Lokhttp3/Request;
    .locals 1

    iget-object v0, p0, Lxk/b;->b:Ljv/d;

    invoke-interface {v0}, Ljv/d;->request()Lokhttp3/Request;

    move-result-object v0

    return-object v0
.end method
