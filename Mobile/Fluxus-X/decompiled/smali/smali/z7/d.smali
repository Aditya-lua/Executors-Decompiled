.class public abstract Lz7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Ljava/lang/Object;)Lz7/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lz7/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lz7/a;

    const/4 v1, 0x0

    sget-object v2, Lz7/e;->a:Lz7/e;

    invoke-direct {v0, v1, p0, v2, v1}, Lz7/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Lz7/e;Lz7/f;)V

    return-object v0
.end method

.method public static f(Ljava/lang/Object;Lz7/f;)Lz7/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lz7/f;",
            ")",
            "Lz7/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lz7/a;

    const/4 v1, 0x0

    sget-object v2, Lz7/e;->a:Lz7/e;

    invoke-direct {v0, v1, p0, v2, p1}, Lz7/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Lz7/e;Lz7/f;)V

    return-object v0
.end method

.method public static g(Ljava/lang/Object;)Lz7/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lz7/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lz7/a;

    const/4 v1, 0x0

    sget-object v2, Lz7/e;->b:Lz7/e;

    invoke-direct {v0, v1, p0, v2, v1}, Lz7/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Lz7/e;Lz7/f;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Integer;
.end method

.method public abstract b()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract c()Lz7/e;
.end method

.method public abstract d()Lz7/f;
.end method
