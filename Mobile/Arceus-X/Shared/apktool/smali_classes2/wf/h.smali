.class public Lwf/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lmf/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmf/c<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lwf/h$a;

    invoke-direct {v0}, Lwf/h$a;-><init>()V

    const-class v1, Lwf/g;

    invoke-static {v0, v1}, Lmf/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Lmf/c;

    move-result-object v0

    return-object v0
.end method
