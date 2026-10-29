.class public final Ljv/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljv/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljv/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
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

    iput-object p1, p0, Ljv/i$b;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ljv/i$b;->b:Ljv/d;

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

    const-string v0, "callback == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Ljv/i$b;->b:Ljv/d;

    new-instance v1, Ljv/i$b$a;

    invoke-direct {v1, p0, p1}, Ljv/i$b$a;-><init>(Ljv/i$b;Ljv/f;)V

    invoke-interface {v0, v1}, Ljv/d;->B(Ljv/f;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Ljv/i$b;->b:Ljv/d;

    invoke-interface {v0}, Ljv/d;->cancel()V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljv/i$b;->clone()Ljv/d;

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
    new-instance v0, Ljv/i$b;

    iget-object v1, p0, Ljv/i$b;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Ljv/i$b;->b:Ljv/d;

    invoke-interface {v2}, Ljv/d;->clone()Ljv/d;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljv/i$b;-><init>(Ljava/util/concurrent/Executor;Ljv/d;)V

    return-object v0
.end method

.method public execute()Ljv/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljv/x<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Ljv/i$b;->b:Ljv/d;

    invoke-interface {v0}, Ljv/d;->execute()Ljv/x;

    move-result-object v0

    return-object v0
.end method

.method public isCanceled()Z
    .locals 1

    iget-object v0, p0, Ljv/i$b;->b:Ljv/d;

    invoke-interface {v0}, Ljv/d;->isCanceled()Z

    move-result v0

    return v0
.end method

.method public request()Lokhttp3/Request;
    .locals 1

    iget-object v0, p0, Ljv/i$b;->b:Ljv/d;

    invoke-interface {v0}, Ljv/d;->request()Lokhttp3/Request;

    move-result-object v0

    return-object v0
.end method
