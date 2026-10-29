.class public final Ldb/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static varargs a(Ljava/lang/Class;Ljava/lang/String;[Ldb/q;)Ljava/lang/Object;
    .locals 2

    const/4 p1, 0x0

    const/4 v0, 0x0

    const-string v1, "isIsolated"

    invoke-static {p0, v1, p1, v0, p2}, Ldb/r;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Z[Ldb/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static varargs b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Z[Ldb/q;)Ljava/lang/Object;
    .locals 2

    array-length p2, p4

    new-array p3, p2, [Ljava/lang/Class;

    new-array p2, p2, [Ljava/lang/Object;

    array-length v0, p4

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    invoke-virtual {p0, p1, p3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    invoke-virtual {p0, v1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    aget-object p0, p4, p0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v1
.end method
