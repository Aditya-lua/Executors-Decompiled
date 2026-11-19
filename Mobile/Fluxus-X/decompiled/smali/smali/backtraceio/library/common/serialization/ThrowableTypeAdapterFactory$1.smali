.class Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;
.super Llg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;->create(Llg/f;Lsg/a;)Llg/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llg/a0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;

.field final synthetic val$causeAdapter:Llg/a0;

.field final synthetic val$jsonElementAdapter:Llg/a0;

.field final synthetic val$rawType:Ljava/lang/Class;

.field final synthetic val$stackTraceElementAdapter:Llg/a0;


# direct methods
.method public constructor <init>(Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;Llg/a0;Llg/a0;Llg/a0;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->this$0:Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;

    iput-object p2, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$stackTraceElementAdapter:Llg/a0;

    iput-object p3, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$causeAdapter:Llg/a0;

    iput-object p4, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$jsonElementAdapter:Llg/a0;

    iput-object p5, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$rawType:Ljava/lang/Class;

    invoke-direct {p0}, Llg/a0;-><init>()V

    return-void
.end method

.method private createFallbackInstanceOrThrow(Ljava/lang/Throwable;Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/StackTraceElement;",
            ">;)TT;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "null"

    :goto_0
    iget-object v1, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$rawType:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1, p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string v0, "Deserialized to %s but expected assignable to %s. Message: %s"

    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :try_start_0
    iget-object v0, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$rawType:Ljava/lang/Class;

    const-class v1, Ljava/lang/String;

    const-class v2, Ljava/lang/Throwable;

    filled-new-array {v1, v2}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array {p2, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ljava/lang/Throwable;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    invoke-interface {p3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/StackTraceElement;

    invoke-virtual {p2, p3}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_1

    :catch_3
    move-exception p1

    :goto_1
    new-instance p2, Llg/p;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Could not create fallback instance of "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$rawType:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Llg/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private determineClassToInstantiate(Ljava/lang/String;)Ljava/lang/Class;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$rawType:Ljava/lang/Class;

    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/Throwable;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$rawType:Ljava/lang/Class;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    return-object v1

    :catch_0
    iget-object v1, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->this$0:Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;

    invoke-static {v1}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;->access$000(Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Class "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " not found, will fall back to using rawType (the type requested from Gson): "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$rawType:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-object v0
.end method

.method private tryInstantiateThrowable(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            ")TT;"
        }
    .end annotation

    new-instance v0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;

    const-class v1, Ljava/lang/String;

    const-class v2, Ljava/lang/Throwable;

    filled-new-array {v1, v2}, [Ljava/lang/Class;

    move-result-object v3

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;-><init>([Ljava/lang/Class;[Ljava/lang/Object;)V

    new-instance v3, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;-><init>([Ljava/lang/Class;[Ljava/lang/Object;)V

    new-instance v2, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-direct {v2, v1, p2}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;-><init>([Ljava/lang/Class;[Ljava/lang/Object;)V

    new-instance p2, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;

    const/4 v1, 0x0

    new-array v4, v1, [Ljava/lang/Class;

    new-array v5, v1, [Ljava/lang/Object;

    invoke-direct {p2, v4, v5}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;-><init>([Ljava/lang/Class;[Ljava/lang/Object;)V

    filled-new-array {v0, v3, v2, p2}, [Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;

    move-result-object p2

    :goto_0
    const/4 v0, 0x4

    if-ge v1, v0, :cond_1

    aget-object v0, p2, v1

    :try_start_0
    iget-object v2, v0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;->paramTypes:[Ljava/lang/Class;

    invoke-virtual {p1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    iget-object v3, v0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;->args:[Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz p3, :cond_0

    :try_start_1
    invoke-virtual {v2, p3}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    :try_start_2
    iget-object v3, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->this$0:Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;

    invoke-static {v3}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;->access$000(Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not initCause for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " after constructor with args: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;->paramTypes:[Ljava/lang/Class;

    invoke-static {v5}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v2

    goto :goto_2

    :cond_0
    :goto_1
    return-object v2

    :goto_2
    iget-object v3, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->this$0:Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;

    invoke-static {v3}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;->access$000(Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to instantiate "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " with constructor with args: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;->paramTypes:[Ljava/lang/Class;

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", error message: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public read(Ltg/a;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/a;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ltg/a;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Ltg/b;->i:Ltg/b;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ltg/a;->K()V

    return-object v2

    :cond_0
    iget-object v0, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$jsonElementAdapter:Llg/a0;

    invoke-virtual {v0, p1}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llg/l;

    invoke-virtual {p1}, Llg/l;->q()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Llg/l;->g()Llg/o;

    move-result-object p1

    const-string v0, "class"

    invoke-virtual {p1, v0}, Llg/o;->H(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Llg/o;->E(Ljava/lang/String;)Llg/l;

    move-result-object v0

    invoke-virtual {v0}, Llg/l;->l()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    const-string v1, "message"

    invoke-virtual {p1, v1}, Llg/o;->H(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v1}, Llg/o;->E(Ljava/lang/String;)Llg/l;

    move-result-object v3

    invoke-virtual {v3}, Llg/l;->t()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v1}, Llg/o;->E(Ljava/lang/String;)Llg/l;

    move-result-object v1

    invoke-virtual {v1}, Llg/l;->l()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const-string v4, "stack-trace"

    invoke-virtual {p1, v4}, Llg/o;->H(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p1, v4}, Llg/o;->E(Ljava/lang/String;)Llg/l;

    move-result-object v5

    invoke-virtual {v5}, Llg/l;->m()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p1, v4}, Llg/o;->F(Ljava/lang/String;)Llg/i;

    move-result-object v4

    invoke-virtual {v4}, Llg/i;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llg/l;

    iget-object v6, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$stackTraceElementAdapter:Llg/a0;

    invoke-virtual {v6, v5}, Llg/a0;->fromJsonTree(Llg/l;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/StackTraceElement;

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    const-string v4, "cause"

    invoke-virtual {p1, v4}, Llg/o;->H(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {p1, v4}, Llg/o;->E(Ljava/lang/String;)Llg/l;

    move-result-object v5

    invoke-virtual {v5}, Llg/l;->q()Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v5, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$causeAdapter:Llg/a0;

    invoke-virtual {p1, v4}, Llg/o;->G(Ljava/lang/String;)Llg/o;

    move-result-object p1

    invoke-virtual {v5, p1}, Llg/a0;->fromJsonTree(Llg/l;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    goto :goto_3

    :cond_4
    move-object p1, v2

    :goto_3
    invoke-direct {p0, v0}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->determineClassToInstantiate(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0, v1, p1}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->tryInstantiateThrowable(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->this$0:Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;

    invoke-static {p1}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;->access$000(Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Could not instantiate specific Throwable type \'%s\'. Falling back by returning null."

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    :cond_5
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    invoke-interface {v3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/StackTraceElement;

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    iget-object v0, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$rawType:Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    return-object p1

    :cond_6
    invoke-direct {p0, p1, v1, v3}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->createFallbackInstanceOrThrow(Ljava/lang/Throwable;Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Llg/p;

    const-string v0, "Expected a JSON object for Throwable deserialization"

    invoke-direct {p1, v0}, Llg/p;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write(Ltg/c;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/c;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ltg/c;->s()Ltg/c;

    return-void

    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    invoke-virtual {p1}, Ltg/c;->e()Ltg/c;

    const-string v0, "message"

    invoke-virtual {p1, v0}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltg/c;->Y(Ljava/lang/String;)Ltg/c;

    const-string v0, "class"

    invoke-virtual {p1, v0}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltg/c;->Y(Ljava/lang/String;)Ltg/c;

    const-string v0, "stack-trace"

    invoke-virtual {p1, v0}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    invoke-virtual {p1}, Ltg/c;->d()Ltg/c;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$stackTraceElementAdapter:Llg/a0;

    invoke-virtual {v4, p1, v3}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ltg/c;->g()Ltg/c;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v0, "cause"

    invoke-virtual {p1, v0}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    iget-object v0, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;->val$causeAdapter:Llg/a0;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {p1}, Ltg/c;->h()Ltg/c;

    return-void
.end method
