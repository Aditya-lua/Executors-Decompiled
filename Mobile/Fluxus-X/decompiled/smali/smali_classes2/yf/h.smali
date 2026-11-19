.class public Lyf/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lof/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lof/c<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lyf/h$a;

    invoke-direct {v0}, Lyf/h$a;-><init>()V

    const-class v1, Lyf/g;

    invoke-static {v0, v1}, Lof/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Lof/c;

    move-result-object v0

    return-object v0
.end method
