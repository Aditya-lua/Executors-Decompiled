.class public abstract Landroidx/datastore/preferences/protobuf/x;
.super Landroidx/datastore/preferences/protobuf/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/datastore/preferences/protobuf/x$b;,
        Landroidx/datastore/preferences/protobuf/x$e;,
        Landroidx/datastore/preferences/protobuf/x$d;,
        Landroidx/datastore/preferences/protobuf/x$c;,
        Landroidx/datastore/preferences/protobuf/x$a;,
        Landroidx/datastore/preferences/protobuf/x$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Landroidx/datastore/preferences/protobuf/x<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Landroidx/datastore/preferences/protobuf/x$a<",
        "TMessageType;TBuilderType;>;>",
        "Landroidx/datastore/preferences/protobuf/a<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# static fields
.field private static final MEMOIZED_SERIALIZED_SIZE_MASK:I = 0x7fffffff

.field private static final MUTABLE_FLAG_MASK:I = -0x80000000

.field static final UNINITIALIZED_HASH_CODE:I = 0x0

.field static final UNINITIALIZED_SERIALIZED_SIZE:I = 0x7fffffff

.field private static defaultInstanceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Landroidx/datastore/preferences/protobuf/x<",
            "**>;>;"
        }
    .end annotation
.end field


# instance fields
.field private memoizedSerializedSize:I

.field protected unknownFields:Landroidx/datastore/preferences/protobuf/o1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Landroidx/datastore/preferences/protobuf/x;->defaultInstanceMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/a;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/datastore/preferences/protobuf/x;->memoizedSerializedSize:I

    invoke-static {}, Landroidx/datastore/preferences/protobuf/o1;->c()Landroidx/datastore/preferences/protobuf/o1;

    move-result-object v0

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/x;->unknownFields:Landroidx/datastore/preferences/protobuf/o1;

    return-void
.end method

.method public static B()Landroidx/datastore/preferences/protobuf/z$f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Landroidx/datastore/preferences/protobuf/z$f<",
            "TE;>;"
        }
    .end annotation

    invoke-static {}, Landroidx/datastore/preferences/protobuf/d1;->c()Landroidx/datastore/preferences/protobuf/d1;

    move-result-object v0

    return-object v0
.end method

.method public static C(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/datastore/preferences/protobuf/x<",
            "**>;>(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    sget-object v0, Landroidx/datastore/preferences/protobuf/x;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/x;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Landroidx/datastore/preferences/protobuf/x;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/x;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v0, :cond_2

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/q1;->i(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/x;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x;->D()Landroidx/datastore/preferences/protobuf/x;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Landroidx/datastore/preferences/protobuf/x;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    return-object v0
.end method

.method public static varargs G(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final H(Landroidx/datastore/preferences/protobuf/x;Z)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/datastore/preferences/protobuf/x<",
            "TT;*>;>(TT;Z)Z"
        }
    .end annotation

    sget-object v0, Landroidx/datastore/preferences/protobuf/x$f;->a:Landroidx/datastore/preferences/protobuf/x$f;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/x;->x(Landroidx/datastore/preferences/protobuf/x$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/c1;->a()Landroidx/datastore/preferences/protobuf/c1;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/c1;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/g1;

    move-result-object v0

    invoke-interface {v0, p0}, Landroidx/datastore/preferences/protobuf/g1;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz p1, :cond_3

    sget-object p1, Landroidx/datastore/preferences/protobuf/x$f;->b:Landroidx/datastore/preferences/protobuf/x$f;

    if-eqz v0, :cond_2

    move-object v1, p0

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v1}, Landroidx/datastore/preferences/protobuf/x;->z(Landroidx/datastore/preferences/protobuf/x$f;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return v0
.end method

.method public static L(Landroidx/datastore/preferences/protobuf/z$f;)Landroidx/datastore/preferences/protobuf/z$f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/datastore/preferences/protobuf/z$f<",
            "TE;>;)",
            "Landroidx/datastore/preferences/protobuf/z$f<",
            "TE;>;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v0, v0, 0x2

    :goto_0
    invoke-interface {p0, v0}, Landroidx/datastore/preferences/protobuf/z$f;->o(I)Landroidx/datastore/preferences/protobuf/z$f;

    move-result-object p0

    return-object p0
.end method

.method public static N(Landroidx/datastore/preferences/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Landroidx/datastore/preferences/protobuf/e1;

    invoke-direct {v0, p0, p1, p2}, Landroidx/datastore/preferences/protobuf/e1;-><init>(Landroidx/datastore/preferences/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static P(Landroidx/datastore/preferences/protobuf/x;Ljava/io/InputStream;)Landroidx/datastore/preferences/protobuf/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/datastore/preferences/protobuf/x<",
            "TT;*>;>(TT;",
            "Ljava/io/InputStream;",
            ")TT;"
        }
    .end annotation

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/h;->g(Ljava/io/InputStream;)Landroidx/datastore/preferences/protobuf/h;

    move-result-object p1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/o;->b()Landroidx/datastore/preferences/protobuf/o;

    move-result-object v0

    invoke-static {p0, p1, v0}, Landroidx/datastore/preferences/protobuf/x;->Q(Landroidx/datastore/preferences/protobuf/x;Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/x;->r(Landroidx/datastore/preferences/protobuf/x;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object p0

    return-object p0
.end method

.method public static Q(Landroidx/datastore/preferences/protobuf/x;Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/datastore/preferences/protobuf/x<",
            "TT;*>;>(TT;",
            "Landroidx/datastore/preferences/protobuf/h;",
            "Landroidx/datastore/preferences/protobuf/o;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->O()Landroidx/datastore/preferences/protobuf/x;

    move-result-object p0

    :try_start_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/c1;->a()Landroidx/datastore/preferences/protobuf/c1;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/c1;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/g1;

    move-result-object v0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/i;->Q(Landroidx/datastore/preferences/protobuf/h;)Landroidx/datastore/preferences/protobuf/i;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2}, Landroidx/datastore/preferences/protobuf/g1;->h(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/f1;Landroidx/datastore/preferences/protobuf/o;)V

    invoke-interface {v0, p0}, Landroidx/datastore/preferences/protobuf/g1;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/datastore/preferences/protobuf/a0; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroidx/datastore/preferences/protobuf/m1; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :catch_3
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Landroidx/datastore/preferences/protobuf/a0;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Landroidx/datastore/preferences/protobuf/a0;

    throw p0

    :cond_0
    throw p0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Landroidx/datastore/preferences/protobuf/a0;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Landroidx/datastore/preferences/protobuf/a0;

    throw p0

    :cond_1
    new-instance p2, Landroidx/datastore/preferences/protobuf/a0;

    invoke-direct {p2, p1}, Landroidx/datastore/preferences/protobuf/a0;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Landroidx/datastore/preferences/protobuf/a0;->k(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/a0;

    move-result-object p0

    throw p0

    :goto_1
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/m1;->a()Landroidx/datastore/preferences/protobuf/a0;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/datastore/preferences/protobuf/a0;->k(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/a0;

    move-result-object p0

    throw p0

    :goto_2
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/a0;->a()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Landroidx/datastore/preferences/protobuf/a0;

    invoke-direct {p2, p1}, Landroidx/datastore/preferences/protobuf/a0;-><init>(Ljava/io/IOException;)V

    move-object p1, p2

    :cond_2
    invoke-virtual {p1, p0}, Landroidx/datastore/preferences/protobuf/a0;->k(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/a0;

    move-result-object p0

    throw p0
.end method

.method public static R(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/x;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/datastore/preferences/protobuf/x<",
            "**>;>(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/x;->K()V

    sget-object v0, Landroidx/datastore/preferences/protobuf/x;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static r(Landroidx/datastore/preferences/protobuf/x;)Landroidx/datastore/preferences/protobuf/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/datastore/preferences/protobuf/x<",
            "TT;*>;>(TT;)TT;"
        }
    .end annotation

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/a;->n()Landroidx/datastore/preferences/protobuf/m1;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/m1;->a()Landroidx/datastore/preferences/protobuf/a0;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/a0;->k(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/a0;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-object p0
.end method


# virtual methods
.method public abstract A(Landroidx/datastore/preferences/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final D()Landroidx/datastore/preferences/protobuf/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    sget-object v0, Landroidx/datastore/preferences/protobuf/x$f;->f:Landroidx/datastore/preferences/protobuf/x$f;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/x;->x(Landroidx/datastore/preferences/protobuf/x$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/x;

    return-object v0
.end method

.method public E()I
    .locals 1

    iget v0, p0, Landroidx/datastore/preferences/protobuf/a;->memoizedHashCode:I

    return v0
.end method

.method public F()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->E()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public I()Z
    .locals 2

    iget v0, p0, Landroidx/datastore/preferences/protobuf/x;->memoizedSerializedSize:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public J()V
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/c1;->a()Landroidx/datastore/preferences/protobuf/c1;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/c1;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/g1;

    move-result-object v0

    invoke-interface {v0, p0}, Landroidx/datastore/preferences/protobuf/g1;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->K()V

    return-void
.end method

.method public K()V
    .locals 2

    iget v0, p0, Landroidx/datastore/preferences/protobuf/x;->memoizedSerializedSize:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    iput v0, p0, Landroidx/datastore/preferences/protobuf/x;->memoizedSerializedSize:I

    return-void
.end method

.method public final M()Landroidx/datastore/preferences/protobuf/x$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    sget-object v0, Landroidx/datastore/preferences/protobuf/x$f;->e:Landroidx/datastore/preferences/protobuf/x$f;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/x;->x(Landroidx/datastore/preferences/protobuf/x$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/x$a;

    return-object v0
.end method

.method public O()Landroidx/datastore/preferences/protobuf/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    sget-object v0, Landroidx/datastore/preferences/protobuf/x$f;->d:Landroidx/datastore/preferences/protobuf/x$f;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/x;->x(Landroidx/datastore/preferences/protobuf/x$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/x;

    return-object v0
.end method

.method public S(I)V
    .locals 0

    iput p1, p0, Landroidx/datastore/preferences/protobuf/a;->memoizedHashCode:I

    return-void
.end method

.method public final T()Landroidx/datastore/preferences/protobuf/x$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    sget-object v0, Landroidx/datastore/preferences/protobuf/x$f;->e:Landroidx/datastore/preferences/protobuf/x$f;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/x;->x(Landroidx/datastore/preferences/protobuf/x$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/x$a;

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/x$a;->A(Landroidx/datastore/preferences/protobuf/x;)Landroidx/datastore/preferences/protobuf/x$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Landroidx/datastore/preferences/protobuf/r0$a;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->T()Landroidx/datastore/preferences/protobuf/x$a;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/x;->k(Landroidx/datastore/preferences/protobuf/g1;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic e()Landroidx/datastore/preferences/protobuf/r0$a;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->M()Landroidx/datastore/preferences/protobuf/x$a;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    invoke-static {}, Landroidx/datastore/preferences/protobuf/c1;->a()Landroidx/datastore/preferences/protobuf/c1;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/c1;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/g1;

    move-result-object v0

    check-cast p1, Landroidx/datastore/preferences/protobuf/x;

    invoke-interface {v0, p0, p1}, Landroidx/datastore/preferences/protobuf/g1;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic f()Landroidx/datastore/preferences/protobuf/r0;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->D()Landroidx/datastore/preferences/protobuf/x;

    move-result-object v0

    return-object v0
.end method

.method public final h()Landroidx/datastore/preferences/protobuf/z0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/datastore/preferences/protobuf/z0<",
            "TMessageType;>;"
        }
    .end annotation

    sget-object v0, Landroidx/datastore/preferences/protobuf/x$f;->g:Landroidx/datastore/preferences/protobuf/x$f;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/x;->x(Landroidx/datastore/preferences/protobuf/x$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/z0;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->u()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->F()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->u()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/x;->S(I)V

    :cond_1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->E()I

    move-result v0

    return v0
.end method

.method public i(Landroidx/datastore/preferences/protobuf/j;)V
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/c1;->a()Landroidx/datastore/preferences/protobuf/c1;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/c1;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/g1;

    move-result-object v0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/k;->P(Landroidx/datastore/preferences/protobuf/j;)Landroidx/datastore/preferences/protobuf/k;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Landroidx/datastore/preferences/protobuf/g1;->i(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/t1;)V

    return-void
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Landroidx/datastore/preferences/protobuf/x;->H(Landroidx/datastore/preferences/protobuf/x;Z)Z

    move-result v0

    return v0
.end method

.method public j()I
    .locals 2

    iget v0, p0, Landroidx/datastore/preferences/protobuf/x;->memoizedSerializedSize:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    return v0
.end method

.method public k(Landroidx/datastore/preferences/protobuf/g1;)I
    .locals 3

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->I()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/x;->v(Landroidx/datastore/preferences/protobuf/g1;)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "serialized size must be non-negative, was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->j()I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x;->j()I

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/x;->v(Landroidx/datastore/preferences/protobuf/g1;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/x;->o(I)V

    return p1
.end method

.method public o(I)V
    .locals 3

    if-ltz p1, :cond_0

    iget v0, p0, Landroidx/datastore/preferences/protobuf/x;->memoizedSerializedSize:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    const v1, 0x7fffffff

    and-int/2addr p1, v1

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/datastore/preferences/protobuf/x;->memoizedSerializedSize:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "serialized size must be non-negative, was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public q()Ljava/lang/Object;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/x$f;->c:Landroidx/datastore/preferences/protobuf/x$f;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/x;->x(Landroidx/datastore/preferences/protobuf/x$f;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public s()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/a;->memoizedHashCode:I

    return-void
.end method

.method public t()V
    .locals 1

    const v0, 0x7fffffff

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/x;->o(I)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/datastore/preferences/protobuf/t0;->f(Landroidx/datastore/preferences/protobuf/r0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()I
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/c1;->a()Landroidx/datastore/preferences/protobuf/c1;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/c1;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/g1;

    move-result-object v0

    invoke-interface {v0, p0}, Landroidx/datastore/preferences/protobuf/g1;->f(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final v(Landroidx/datastore/preferences/protobuf/g1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/preferences/protobuf/g1<",
            "*>;)I"
        }
    .end annotation

    if-nez p1, :cond_0

    invoke-static {}, Landroidx/datastore/preferences/protobuf/c1;->a()Landroidx/datastore/preferences/protobuf/c1;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/datastore/preferences/protobuf/c1;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/g1;

    move-result-object p1

    invoke-interface {p1, p0}, Landroidx/datastore/preferences/protobuf/g1;->d(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1, p0}, Landroidx/datastore/preferences/protobuf/g1;->d(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final w()Landroidx/datastore/preferences/protobuf/x$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<MessageType:",
            "Landroidx/datastore/preferences/protobuf/x<",
            "TMessageType;TBuilderType;>;BuilderType:",
            "Landroidx/datastore/preferences/protobuf/x$a<",
            "TMessageType;TBuilderType;>;>()TBuilderType;"
        }
    .end annotation

    sget-object v0, Landroidx/datastore/preferences/protobuf/x$f;->e:Landroidx/datastore/preferences/protobuf/x$f;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/x;->x(Landroidx/datastore/preferences/protobuf/x$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/x$a;

    return-object v0
.end method

.method public x(Landroidx/datastore/preferences/protobuf/x$f;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, Landroidx/datastore/preferences/protobuf/x;->A(Landroidx/datastore/preferences/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public z(Landroidx/datastore/preferences/protobuf/x$f;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Landroidx/datastore/preferences/protobuf/x;->A(Landroidx/datastore/preferences/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
