.class public abstract Lsw/z;
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

.method public static b(Lsw/y;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lsw/z;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lsw/y;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lsw/z<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lsw/w;->b(Lsw/y;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lsw/w;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lsw/c0;->j(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-eq v0, v1, :cond_0

    invoke-static {p0, p2, p1}, Lsw/n;->f(Lsw/y;Ljava/lang/reflect/Method;Lsw/w;)Lsw/n;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "Service methods cannot return void."

    invoke-static {p2, p1, p0}, Lsw/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_1
    const-string p0, "Method return type must not include a type variable or wildcard: %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p0, p1}, Lsw/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation
.end method
