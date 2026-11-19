.class public Lgl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/platform/http/interfaces/InterfaceBuilder;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/roblox/platform/http/interfaces/InterfaceBuilder<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Lmv/d0;

.field public d:Lsw/e$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgl/a;->b:Ljava/lang/String;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lgl/a;->b()Ljava/lang/String;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lgl/a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lsw/y;
    .locals 1

    new-instance v0, Lsw/y$b;

    invoke-direct {v0}, Lsw/y$b;-><init>()V

    invoke-virtual {v0, p1}, Lsw/y$b;->c(Ljava/lang/String;)Lsw/y$b;

    iget-object p1, p0, Lgl/a;->c:Lmv/d0;

    invoke-virtual {v0, p1}, Lsw/y$b;->g(Lmv/d0;)Lsw/y$b;

    iget-object p1, p0, Lgl/a;->d:Lsw/e$a;

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Lsw/y$b;->a(Lsw/e$a;)Lsw/y$b;

    :cond_0
    invoke-static {}, Ltw/a;->f()Ltw/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsw/y$b;->b(Lsw/h$a;)Lsw/y$b;

    invoke-virtual {v0}, Lsw/y$b;->e()Lsw/y;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "roblox.com"

    return-object v0
.end method

.method public build(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lgl/a;->b:Ljava/lang/String;

    iget-object v1, p0, Lgl/a;->a:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lgl/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lgl/a;->a(Ljava/lang/String;)Lsw/y;

    move-result-object v0

    invoke-virtual {v0, p1}, Lsw/y;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    iget-object v0, p0, Lgl/a;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lgl/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lgl/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lgl/a;->a(Ljava/lang/String;)Lsw/y;

    move-result-object v0

    invoke-virtual {v0, p1}, Lsw/y;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d(Lsw/e$a;)Lgl/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/e$a;",
            ")",
            "Lgl/a<",
            "TT;>;"
        }
    .end annotation

    iput-object p1, p0, Lgl/a;->d:Lsw/e$a;

    return-object p0
.end method

.method public e(Lmv/d0;)Lgl/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/d0;",
            ")",
            "Lgl/a<",
            "TT;>;"
        }
    .end annotation

    iput-object p1, p0, Lgl/a;->c:Lmv/d0;

    return-object p0
.end method
