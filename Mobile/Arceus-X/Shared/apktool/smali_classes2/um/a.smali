.class public final Lum/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lum/h$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lum/a$f;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lum/a$f;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lum/a$f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lum/a$f;",
            ">;",
            "Ljava/util/List<",
            "Lum/a$f;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lum/a;->a:Ljava/util/List;

    iput-object p2, p0, Lum/a;->b:Ljava/util/List;

    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/reflect/Method;)Lum/a$f;
    .locals 13

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {p1}, Lwm/c;->k(Ljava/lang/reflect/AnnotatedElement;)Ljava/util/Set;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v9

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v1

    array-length v4, v9

    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x0

    if-lt v4, v0, :cond_0

    aget-object v4, v9, v6

    const-class v7, Lum/m;

    if-ne v4, v7, :cond_0

    if-eq v2, v5, :cond_0

    invoke-static {v0, v9}, Lum/a;->d(I[Ljava/lang/reflect/Type;)Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v1, Lum/a$d;

    array-length v6, v9

    const/4 v7, 0x1

    const/4 v8, 0x1

    move-object v4, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v8}, Lum/a$d;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZ)V

    return-object v1

    :cond_0
    move-object v4, p0

    move-object p0, v5

    move-object v5, p1

    array-length p1, v9

    if-ne p1, v0, :cond_1

    if-eq v2, p0, :cond_1

    aget-object p0, v1, v6

    invoke-static {p0}, Lwm/c;->l([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    move-result-object v11

    aget-object p0, v1, v6

    invoke-static {p0}, Lwm/c;->f([Ljava/lang/annotation/Annotation;)Z

    move-result v8

    new-instance v1, Lum/a$e;

    array-length v6, v9

    const/4 v7, 0x1

    move-object v10, v2

    move-object v12, v3

    invoke-direct/range {v1 .. v12}, Lum/a$e;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZ[Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/util/Set;)V

    return-object v1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unexpected signature for "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Ljava/util/List;Ljava/lang/reflect/Type;Ljava/util/Set;)Lum/a$f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lum/a$f;",
            ">;",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lum/a$f;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lum/a$f;

    iget-object v3, v2, Lum/a$f;->a:Ljava/lang/reflect/Type;

    invoke-static {v3, p1}, Lum/a0;->d(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v2, Lum/a$f;->b:Ljava/util/Set;

    invoke-interface {v3, p2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Ljava/lang/Object;)Lum/a;
    .locals 11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    :goto_0
    const-class v3, Ljava/lang/Object;

    if-eq v2, v3, :cond_5

    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_4

    aget-object v6, v3, v5

    const-class v7, Lum/z;

    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v7

    const-string v8, "\n    "

    if-eqz v7, :cond_1

    invoke-static {p0, v6}, Lum/a;->e(Ljava/lang/Object;Ljava/lang/reflect/Method;)Lum/a$f;

    move-result-object v7

    iget-object v9, v7, Lum/a$f;->a:Ljava/lang/reflect/Type;

    iget-object v10, v7, Lum/a$f;->b:Ljava/util/Set;

    invoke-static {v0, v9, v10}, Lum/a;->b(Ljava/util/List;Ljava/lang/reflect/Type;Ljava/util/Set;)Lum/a$f;

    move-result-object v9

    if-nez v9, :cond_0

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Conflicting @ToJson methods:\n    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v9, Lum/a$f;->d:Ljava/lang/reflect/Method;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v7, Lum/a$f;->d:Ljava/lang/reflect/Method;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_2
    const-class v7, Lum/f;

    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-static {p0, v6}, Lum/a;->a(Ljava/lang/Object;Ljava/lang/reflect/Method;)Lum/a$f;

    move-result-object v6

    iget-object v7, v6, Lum/a$f;->a:Ljava/lang/reflect/Type;

    iget-object v9, v6, Lum/a$f;->b:Ljava/util/Set;

    invoke-static {v1, v7, v9}, Lum/a;->b(Ljava/util/List;Ljava/lang/reflect/Type;Ljava/util/Set;)Lum/a$f;

    move-result-object v7

    if-nez v7, :cond_2

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Conflicting @FromJson methods:\n    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v7, Lum/a$f;->d:Ljava/lang/reflect/Method;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v6, Lum/a$f;->d:Ljava/lang/reflect/Method;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    goto/16 :goto_0

    :cond_5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected at least one @ToJson or @FromJson method on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_4
    new-instance p0, Lum/a;

    invoke-direct {p0, v0, v1}, Lum/a;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p0
.end method

.method public static d(I[Ljava/lang/reflect/Type;)Z
    .locals 4

    array-length v0, p1

    :goto_0
    if-ge p0, v0, :cond_2

    aget-object v1, p1, p0

    instance-of v2, v1, Ljava/lang/reflect/ParameterizedType;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v1

    const-class v2, Lum/h;

    if-eq v1, v2, :cond_1

    return v3

    :cond_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static e(Ljava/lang/Object;Ljava/lang/reflect/Method;)Lum/a$f;
    .locals 12

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v9

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v1

    array-length v2, v8

    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-lt v2, v6, :cond_0

    aget-object v2, v8, v5

    const-class v7, Lum/t;

    if-ne v2, v7, :cond_0

    if-ne v9, v3, :cond_0

    invoke-static {v6, v8}, Lum/a;->d(I[Ljava/lang/reflect/Type;)Z

    move-result v2

    if-eqz v2, :cond_0

    aget-object v1, v1, v0

    invoke-static {v1}, Lwm/c;->l([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    move-result-object v2

    move v6, v0

    new-instance v0, Lum/a$b;

    aget-object v1, v8, v6

    array-length v5, v8

    const/4 v6, 0x2

    const/4 v7, 0x1

    move-object v3, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v7}, Lum/a$b;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZ)V

    return-object v0

    :cond_0
    move v6, v0

    array-length v0, v8

    if-ne v0, v6, :cond_1

    if-eq v9, v3, :cond_1

    invoke-static {p1}, Lwm/c;->k(Ljava/lang/reflect/AnnotatedElement;)Ljava/util/Set;

    move-result-object v11

    aget-object v0, v1, v5

    invoke-static {v0}, Lwm/c;->l([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    move-result-object v2

    aget-object v0, v1, v5

    invoke-static {v0}, Lwm/c;->f([Ljava/lang/annotation/Annotation;)Z

    move-result v7

    new-instance v0, Lum/a$c;

    aget-object v1, v8, v5

    array-length v5, v8

    const/4 v6, 0x1

    move-object v10, v2

    move-object v3, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v11}, Lum/a$c;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZ[Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/util/Set;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected signature for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public create(Ljava/lang/reflect/Type;Ljava/util/Set;Lum/w;)Lum/h;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lum/w;",
            ")",
            "Lum/h<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lum/a;->a:Ljava/util/List;

    invoke-static {v0, p1, p2}, Lum/a;->b(Ljava/util/List;Ljava/lang/reflect/Type;Ljava/util/Set;)Lum/a$f;

    move-result-object v3

    iget-object v0, p0, Lum/a;->b:Ljava/util/List;

    invoke-static {v0, p1, p2}, Lum/a;->b(Ljava/util/List;Ljava/lang/reflect/Type;Ljava/util/Set;)Lum/a$f;

    move-result-object v6

    const/4 v0, 0x0

    if-nez v3, :cond_0

    if-nez v6, :cond_0

    return-object v0

    :cond_0
    if-eqz v3, :cond_2

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v4, v0

    goto :goto_2

    :cond_2
    :goto_1
    :try_start_0
    invoke-virtual {p3, p0, p1, p2}, Lum/w;->i(Lum/h$e;Ljava/lang/reflect/Type;Ljava/util/Set;)Lum/h;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_2
    if-eqz v3, :cond_3

    invoke-virtual {v3, p3, p0}, Lum/a$f;->a(Lum/w;Lum/h$e;)V

    :cond_3
    if-eqz v6, :cond_4

    invoke-virtual {v6, p3, p0}, Lum/a$f;->a(Lum/w;Lum/h$e;)V

    :cond_4
    new-instance v1, Lum/a$a;

    move-object v2, p0

    move-object v8, p1

    move-object v7, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v8}, Lum/a$a;-><init>(Lum/a;Lum/a$f;Lum/h;Lum/w;Lum/a$f;Ljava/util/Set;Ljava/lang/reflect/Type;)V

    return-object v1

    :catch_0
    move-exception v0

    move-object v8, p1

    move-object v7, p2

    move-object p1, v0

    if-nez v3, :cond_5

    const-string p2, "@ToJson"

    goto :goto_3

    :cond_5
    const-string p2, "@FromJson"

    :goto_3
    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " adapter for "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8, v7}, Lwm/c;->u(Ljava/lang/reflect/Type;Ljava/util/Set;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3
.end method
