.class public final Ly1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly1/c$b;,
        Ly1/c$a;,
        Ly1/c$d;,
        Ly1/c$c;
    }
.end annotation


# direct methods
.method public static a(Ly1/c$c;)Lne/x;
    .locals 3
    .param p0    # Ly1/c$c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ly1/c$c<",
            "TT;>;)",
            "Lne/x<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ly1/c$a;

    invoke-direct {v0}, Ly1/c$a;-><init>()V

    new-instance v1, Ly1/c$d;

    invoke-direct {v1, v0}, Ly1/c$d;-><init>(Ly1/c$a;)V

    iput-object v1, v0, Ly1/c$a;->b:Ly1/c$d;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iput-object v2, v0, Ly1/c$a;->a:Ljava/lang/Object;

    :try_start_0
    invoke-interface {p0, v0}, Ly1/c$c;->a(Ly1/c$a;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    iput-object p0, v0, Ly1/c$a;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    goto :goto_0

    :cond_0
    return-object v1

    :goto_0
    invoke-virtual {v1, p0}, Ly1/c$d;->e(Ljava/lang/Throwable;)Z

    return-object v1
.end method
