.class public abstract Ljv/n;
.super Ljv/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljv/n$b;,
        Ljv/n$c;,
        Ljv/n$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseT:",
        "Ljava/lang/Object;",
        "ReturnT:",
        "Ljava/lang/Object;",
        ">",
        "Ljv/z<",
        "TReturnT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljv/w;

.field public final b:Lokhttp3/Call$Factory;

.field public final c:Ljv/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljv/h<",
            "Lokhttp3/ResponseBody;",
            "TResponseT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljv/w;Lokhttp3/Call$Factory;Ljv/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/w;",
            "Lokhttp3/Call$Factory;",
            "Ljv/h<",
            "Lokhttp3/ResponseBody;",
            "TResponseT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljv/z;-><init>()V

    iput-object p1, p0, Ljv/n;->a:Ljv/w;

    iput-object p2, p0, Ljv/n;->b:Lokhttp3/Call$Factory;

    iput-object p3, p0, Ljv/n;->c:Ljv/h;

    return-void
.end method

.method public static d(Ljv/y;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResponseT:",
            "Ljava/lang/Object;",
            "ReturnT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljv/y;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Ljv/e<",
            "TResponseT;TReturnT;>;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0, p2, p3}, Ljv/y;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/e;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string p3, "Unable to create call adapter for %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p0, p3, p2}, Ljv/c0;->o(Ljava/lang/reflect/Method;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method public static e(Ljv/y;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;)Ljv/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljv/y;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljv/h<",
            "Lokhttp3/ResponseBody;",
            "TResponseT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0, p2, v0}, Ljv/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "Unable to create converter for %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p0, v0, p2}, Ljv/c0;->o(Ljava/lang/reflect/Method;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method public static f(Ljv/y;Ljava/lang/reflect/Method;Ljv/w;)Ljv/n;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResponseT:",
            "Ljava/lang/Object;",
            "ReturnT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljv/y;",
            "Ljava/lang/reflect/Method;",
            "Ljv/w;",
            ")",
            "Ljv/n<",
            "TResponseT;TReturnT;>;"
        }
    .end annotation

    iget-boolean v0, p2, Ljv/w;->l:Z

    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v1

    const-class v2, Ljv/x;

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    aget-object v4, v4, v5

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v3, v4}, Ljv/c0;->f(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v5

    const-class v7, Ljv/d;

    if-ne v5, v2, :cond_0

    instance-of v5, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v5, :cond_0

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v3, v4}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    move v5, v3

    move v8, v6

    goto :goto_0

    :cond_0
    invoke-static {v4}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v5

    if-eq v5, v7, :cond_1

    invoke-static {v4}, Ljv/c0;->m(Ljava/lang/reflect/Type;)Z

    move-result v5

    move v8, v3

    :goto_0
    new-instance v9, Ljv/c0$b;

    new-array v6, v6, [Ljava/lang/reflect/Type;

    aput-object v4, v6, v3

    const/4 v4, 0x0

    invoke-direct {v9, v4, v7, v6}, Ljv/c0$b;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    invoke-static {v1}, Ljv/b0;->a([Ljava/lang/annotation/Annotation;)[Ljava/lang/annotation/Annotation;

    move-result-object v1

    move v10, v5

    goto :goto_1

    :cond_1
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v3, v4}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p2, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s"

    invoke-static {p1, p2, p0}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v9

    move v8, v3

    move v10, v8

    :goto_1
    invoke-static {p0, p1, v9, v1}, Ljv/n;->d(Ljv/y;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/e;

    move-result-object v1

    invoke-interface {v1}, Ljv/e;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    const-class v5, Lokhttp3/Response;

    if-eq v4, v5, :cond_8

    if-eq v4, v2, :cond_7

    iget-object v2, p2, Ljv/w;->d:Ljava/lang/String;

    const-string v5, "HEAD"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-class v2, Ljava/lang/Void;

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {v4}, Ljv/c0;->m(Ljava/lang/reflect/Type;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    const-string p0, "HEAD method must use Void or Unit as response type."

    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_4
    :goto_2
    invoke-static {p0, p1, v4}, Ljv/n;->e(Ljv/y;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;)Ljv/h;

    move-result-object v7

    iget-object v6, p0, Ljv/y;->b:Lokhttp3/Call$Factory;

    if-nez v0, :cond_5

    new-instance p0, Ljv/n$a;

    invoke-direct {p0, p2, v6, v7, v1}, Ljv/n$a;-><init>(Ljv/w;Lokhttp3/Call$Factory;Ljv/h;Ljv/e;)V

    return-object p0

    :cond_5
    if-eqz v8, :cond_6

    new-instance p0, Ljv/n$c;

    invoke-direct {p0, p2, v6, v7, v1}, Ljv/n$c;-><init>(Ljv/w;Lokhttp3/Call$Factory;Ljv/h;Ljv/e;)V

    return-object p0

    :cond_6
    new-instance v4, Ljv/n$b;

    const/4 v9, 0x0

    move-object v5, p2

    move-object v8, v1

    invoke-direct/range {v4 .. v10}, Ljv/n$b;-><init>(Ljv/w;Lokhttp3/Call$Factory;Ljv/h;Ljv/e;ZZ)V

    return-object v4

    :cond_7
    const-string p0, "Response must include generic type (e.g., Response<String>)"

    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "\'"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' is not a valid response body type. Did you mean ResponseBody?"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Object;",
            ")TReturnT;"
        }
    .end annotation

    new-instance v0, Ljv/q;

    iget-object v1, p0, Ljv/n;->a:Ljv/w;

    iget-object v4, p0, Ljv/n;->b:Lokhttp3/Call$Factory;

    iget-object v5, p0, Ljv/n;->c:Ljv/h;

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Ljv/q;-><init>(Ljv/w;Ljava/lang/Object;[Ljava/lang/Object;Lokhttp3/Call$Factory;Ljv/h;)V

    invoke-virtual {p0, v0, v3}, Ljv/n;->c(Ljv/d;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract c(Ljv/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/d<",
            "TResponseT;>;[",
            "Ljava/lang/Object;",
            ")TReturnT;"
        }
    .end annotation
.end method
