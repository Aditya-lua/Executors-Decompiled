.class public final Log/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Log/l$g;,
        Log/l$f;,
        Log/l$e;,
        Log/l$d;,
        Log/l$c;
    }
.end annotation


# instance fields
.field public final a:Lng/v;

.field public final b:Llg/d;

.field public final c:Lng/w;

.field public final d:Log/e;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llg/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lng/v;Llg/d;Lng/w;Log/e;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lng/v;",
            "Llg/d;",
            "Lng/w;",
            "Log/e;",
            "Ljava/util/List<",
            "Llg/w;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Log/l;->a:Lng/v;

    iput-object p2, p0, Log/l;->b:Llg/d;

    iput-object p3, p0, Log/l;->c:Lng/w;

    iput-object p4, p0, Log/l;->d:Log/e;

    iput-object p5, p0, Log/l;->e:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V
    .locals 0

    invoke-static {p0, p1}, Log/l;->b(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    return-void
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M:",
            "Ljava/lang/reflect/AccessibleObject;",
            ":",
            "Ljava/lang/reflect/Member;",
            ">(",
            "Ljava/lang/Object;",
            "TM;)V"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p1, p0}, Lng/g0;->a(Ljava/lang/reflect/AccessibleObject;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-void

    :cond_1
    const/4 p0, 0x1

    invoke-static {p1, p0}, Lqg/a;->g(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Llg/m;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Llg/m;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)Ljava/lang/IllegalArgumentException;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/reflect/Field;",
            ")",
            "Ljava/lang/IllegalArgumentException;"
        }
    .end annotation

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Class "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " declares multiple JSON fields named \'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'; conflict is caused by fields "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lqg/a;->f(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " and "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Lqg/a;->f(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\nSee "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "duplicate-fields"

    invoke-static {p0}, Lng/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final c(Llg/f;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/String;Lsg/a;ZZ)Log/l$d;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/f;",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/String;",
            "Lsg/a<",
            "*>;ZZ)",
            "Log/l$d;"
        }
    .end annotation

    invoke-virtual/range {p5 .. p5}, Lsg/a;->c()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lng/f0;->a(Ljava/lang/reflect/Type;)Z

    move-result v8

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v2

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v2, :cond_0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v9

    move v9, v10

    goto :goto_0

    :cond_0
    move v0, v9

    :goto_0
    const-class v2, Lmg/b;

    invoke-virtual {p2, v2}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lmg/b;

    if-eqz v6, :cond_1

    iget-object v2, p0, Log/l;->d:Log/e;

    iget-object v3, p0, Log/l;->a:Lng/v;

    const/4 v7, 0x0

    move-object v4, p1

    move-object/from16 v5, p5

    invoke-virtual/range {v2 .. v7}, Log/e;->c(Lng/v;Llg/f;Lsg/a;Lmg/b;Z)Llg/a0;

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    move v10, v0

    :goto_2
    move-object/from16 v5, p5

    if-nez v2, :cond_3

    invoke-virtual {p1, v5}, Llg/f;->m(Lsg/a;)Llg/a0;

    move-result-object v2

    :cond_3
    move-object v7, v2

    if-eqz p6, :cond_5

    if-eqz v10, :cond_4

    move-object v0, v7

    goto :goto_3

    :cond_4
    new-instance v0, Log/o;

    invoke-virtual {v5}, Lsg/a;->d()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-direct {v0, p1, v7, v2}, Log/o;-><init>(Llg/f;Llg/a0;Ljava/lang/reflect/Type;)V

    :goto_3
    move-object v6, v0

    goto :goto_4

    :cond_5
    move-object v6, v7

    :goto_4
    new-instance v0, Log/l$b;

    move-object v1, p0

    move-object v3, p2

    move-object v5, p3

    move-object v2, p4

    move/from16 v4, p7

    invoke-direct/range {v0 .. v9}, Log/l$b;-><init>(Log/l;Ljava/lang/String;Ljava/lang/reflect/Field;ZLjava/lang/reflect/Method;Llg/a0;Llg/a0;ZZ)V

    return-object v0
.end method

.method public create(Llg/f;Lsg/a;)Llg/a0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Llg/f;",
            "Lsg/a<",
            "TT;>;)",
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lsg/a;->c()Ljava/lang/Class;

    move-result-object v3

    const-class v0, Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v3}, Lqg/a;->l(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p1, Log/l$a;

    invoke-direct {p1, p0}, Log/l$a;-><init>(Log/l;)V

    return-object p1

    :cond_1
    iget-object v0, p0, Log/l;->e:Ljava/util/List;

    invoke-static {v0, v3}, Lng/g0;->b(Ljava/util/List;Ljava/lang/Class;)Llg/w$a;

    move-result-object v0

    sget-object v1, Llg/w$a;->d:Llg/w$a;

    if-eq v0, v1, :cond_4

    sget-object v1, Llg/w$a;->c:Llg/w$a;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    move v4, v2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    move v4, v0

    :goto_0
    invoke-static {v3}, Lqg/a;->m(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v6, Log/l$g;

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Log/l;->e(Llg/f;Lsg/a;Ljava/lang/Class;ZZ)Log/l$f;

    move-result-object p1

    invoke-direct {v6, v3, p1, v4}, Log/l$g;-><init>(Ljava/lang/Class;Log/l$f;Z)V

    return-object v6

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move p1, v2

    move-object v2, p2

    iget-object p2, v0, Log/l;->a:Lng/v;

    invoke-virtual {p2, v2, p1}, Lng/v;->w(Lsg/a;Z)Lng/d0;

    move-result-object p1

    new-instance p2, Log/l$e;

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Log/l;->e(Llg/f;Lsg/a;Ljava/lang/Class;ZZ)Log/l$f;

    move-result-object v1

    invoke-direct {p2, p1, v1}, Log/l$e;-><init>(Lng/d0;Log/l$f;)V

    return-object p2

    :cond_4
    new-instance p1, Llg/m;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ReflectionAccessFilter does not permit using reflection for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ". Register a TypeAdapter for this type or adjust the access filter."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Llg/m;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Llg/f;Lsg/a;Ljava/lang/Class;ZZ)Log/l$f;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/f;",
            "Lsg/a<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;ZZ)",
            "Log/l$f;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v8, p3

    invoke-virtual {v8}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Log/l$f;->c:Log/l$f;

    return-object v1

    :cond_0
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    move-object/from16 v11, p2

    move/from16 v1, p4

    move-object v12, v8

    :goto_0
    const-class v2, Ljava/lang/Object;

    if-eq v12, v2, :cond_f

    invoke-virtual {v12}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v13

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v12, v8, :cond_2

    array-length v2, v13

    if-lez v2, :cond_2

    iget-object v1, v0, Log/l;->e:Ljava/util/List;

    invoke-static {v1, v12}, Lng/g0;->b(Ljava/util/List;Ljava/lang/Class;)Llg/w$a;

    move-result-object v1

    sget-object v2, Llg/w$a;->d:Llg/w$a;

    if-eq v1, v2, :cond_3

    sget-object v2, Llg/w$a;->c:Llg/w$a;

    if-ne v1, v2, :cond_1

    move v1, v14

    goto :goto_1

    :cond_1
    move v1, v15

    :cond_2
    :goto_1
    move v7, v1

    goto :goto_2

    :cond_3
    new-instance v1, Llg/m;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ReflectionAccessFilter does not permit using reflection for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " (supertype of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "). Register a TypeAdapter for this type or adjust the access filter."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Llg/m;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_2
    array-length v1, v13

    move v2, v15

    :goto_3
    if-ge v2, v1, :cond_e

    move v3, v2

    aget-object v2, v13, v3

    invoke-virtual {v0, v2, v14}, Log/l;->g(Ljava/lang/reflect/Field;Z)Z

    move-result v6

    invoke-virtual {v0, v2, v15}, Log/l;->g(Ljava/lang/reflect/Field;Z)Z

    move-result v4

    if-nez v6, :cond_4

    if-nez v4, :cond_4

    move/from16 v17, v1

    move/from16 v18, v3

    move-object/from16 v16, v11

    move v11, v15

    goto/16 :goto_7

    :cond_4
    const/4 v5, 0x0

    if-eqz p5, :cond_8

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v16

    if-eqz v16, :cond_5

    move v14, v15

    goto :goto_5

    :cond_5
    invoke-static {v12, v2}, Lqg/a;->h(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;

    move-result-object v5

    if-nez v7, :cond_6

    invoke-static {v5}, Lqg/a;->o(Ljava/lang/reflect/AccessibleObject;)V

    :cond_6
    const-class v14, Lmg/c;

    invoke-virtual {v5, v14}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v16

    if-eqz v16, :cond_8

    invoke-virtual {v2, v14}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v14

    if-eqz v14, :cond_7

    goto :goto_4

    :cond_7
    invoke-static {v5, v15}, Lqg/a;->g(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Llg/m;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "@SerializedName on "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is not supported"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Llg/m;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_8
    :goto_4
    move v14, v4

    :goto_5
    if-nez v7, :cond_9

    if-nez v5, :cond_9

    invoke-static {v2}, Lqg/a;->o(Ljava/lang/reflect/AccessibleObject;)V

    :cond_9
    invoke-virtual {v11}, Lsg/a;->d()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v15

    invoke-static {v4, v12, v15}, Lng/x;->p(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-virtual {v0, v2}, Log/l;->f(Ljava/lang/reflect/Field;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v16, v11

    const/4 v11, 0x0

    invoke-interface {v15, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/lang/String;

    invoke-static {v4}, Lsg/a;->b(Ljava/lang/reflect/Type;)Lsg/a;

    move-result-object v4

    move/from16 v18, v3

    move-object v3, v5

    move-object v5, v4

    move-object/from16 v4, v17

    move/from16 v17, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v7}, Log/l;->c(Llg/f;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/String;Lsg/a;ZZ)Log/l$d;

    move-result-object v3

    if-eqz v14, :cond_b

    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v9, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Log/l$d;

    if-nez v5, :cond_a

    goto :goto_6

    :cond_a
    iget-object v0, v5, Log/l$d;->b:Ljava/lang/reflect/Field;

    invoke-static {v8, v1, v0, v2}, Log/l;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_b
    if-eqz v6, :cond_d

    invoke-interface {v10, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Log/l$d;

    if-nez v0, :cond_c

    goto :goto_7

    :cond_c
    iget-object v0, v0, Log/l$d;->b:Ljava/lang/reflect/Field;

    invoke-static {v8, v4, v0, v2}, Log/l;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_d
    :goto_7
    add-int/lit8 v2, v18, 0x1

    move-object/from16 v0, p0

    move v15, v11

    move-object/from16 v11, v16

    move/from16 v1, v17

    const/4 v14, 0x1

    goto/16 :goto_3

    :cond_e
    move-object/from16 v16, v11

    invoke-virtual/range {v16 .. v16}, Lsg/a;->d()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {v12}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v0, v12, v1}, Lng/x;->p(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lsg/a;->b(Ljava/lang/reflect/Type;)Lsg/a;

    move-result-object v11

    invoke-virtual {v11}, Lsg/a;->c()Ljava/lang/Class;

    move-result-object v12

    move-object/from16 v0, p0

    move v1, v7

    goto/16 :goto_0

    :cond_f
    new-instance v0, Log/l$f;

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v10}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v0, v9, v1}, Log/l$f;-><init>(Ljava/util/Map;Ljava/util/List;)V

    return-object v0
.end method

.method public final f(Ljava/lang/reflect/Field;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Field;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-class v0, Lmg/c;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lmg/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Log/l;->b:Llg/d;

    invoke-interface {v0, p1}, Llg/d;->b(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Log/l;->b:Llg/d;

    invoke-interface {v1, p1}, Llg/d;->a(Ljava/lang/reflect/Field;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lmg/c;->value()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0}, Lmg/c;->alternate()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object v3, v0

    move-object v0, p1

    move-object p1, v3

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method

.method public final g(Ljava/lang/reflect/Field;Z)Z
    .locals 1

    iget-object v0, p0, Log/l;->c:Lng/w;

    invoke-virtual {v0, p1, p2}, Lng/w;->c(Ljava/lang/reflect/Field;Z)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
