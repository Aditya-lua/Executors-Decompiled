.class public final Log/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Log/e$b;
    }
.end annotation


# static fields
.field public static final c:Llg/b0;

.field public static final d:Llg/b0;


# instance fields
.field public final a:Lng/v;

.field public final b:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Llg/b0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Log/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Log/e$b;-><init>(Log/e$a;)V

    sput-object v0, Log/e;->c:Llg/b0;

    new-instance v0, Log/e$b;

    invoke-direct {v0, v1}, Log/e$b;-><init>(Log/e$a;)V

    sput-object v0, Log/e;->d:Llg/b0;

    return-void
.end method

.method public constructor <init>(Lng/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Log/e;->a:Lng/v;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Log/e;->b:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method

.method public static a(Lng/v;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lng/v;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p1}, Lsg/a;->a(Ljava/lang/Class;)Lsg/a;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lng/v;->w(Lsg/a;Z)Lng/d0;

    move-result-object p0

    invoke-interface {p0}, Lng/d0;->a()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lmg/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lmg/b;"
        }
    .end annotation

    const-class v0, Lmg/b;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    check-cast p0, Lmg/b;

    return-object p0
.end method


# virtual methods
.method public c(Lng/v;Llg/f;Lsg/a;Lmg/b;Z)Llg/a0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lng/v;",
            "Llg/f;",
            "Lsg/a<",
            "*>;",
            "Lmg/b;",
            "Z)",
            "Llg/a0<",
            "*>;"
        }
    .end annotation

    invoke-interface {p4}, Lmg/b;->value()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p1, v0}, Log/e;->a(Lng/v;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p4}, Lmg/b;->nullSafe()Z

    move-result v6

    instance-of p4, p1, Llg/a0;

    if-eqz p4, :cond_0

    check-cast p1, Llg/a0;

    goto/16 :goto_4

    :cond_0
    instance-of p4, p1, Llg/b0;

    if-eqz p4, :cond_2

    check-cast p1, Llg/b0;

    if-eqz p5, :cond_1

    invoke-virtual {p3}, Lsg/a;->c()Ljava/lang/Class;

    move-result-object p4

    invoke-virtual {p0, p4, p1}, Log/e;->e(Ljava/lang/Class;Llg/b0;)Llg/b0;

    move-result-object p1

    :cond_1
    invoke-interface {p1, p2, p3}, Llg/b0;->create(Llg/f;Lsg/a;)Llg/a0;

    move-result-object p1

    goto :goto_4

    :cond_2
    instance-of p4, p1, Llg/t;

    if-nez p4, :cond_4

    instance-of v0, p1, Llg/k;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Invalid attempt to bind an instance of "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as a @JsonAdapter for "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lsg/a;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    :goto_0
    const/4 v0, 0x0

    if-eqz p4, :cond_5

    move-object p4, p1

    check-cast p4, Llg/t;

    move-object v1, p4

    goto :goto_1

    :cond_5
    move-object v1, v0

    :goto_1
    instance-of p4, p1, Llg/k;

    if-eqz p4, :cond_6

    move-object v0, p1

    check-cast v0, Llg/k;

    :cond_6
    move-object v2, v0

    if-eqz p5, :cond_7

    sget-object p1, Log/e;->c:Llg/b0;

    :goto_2
    move-object v5, p1

    goto :goto_3

    :cond_7
    sget-object p1, Log/e;->d:Llg/b0;

    goto :goto_2

    :goto_3
    new-instance v0, Log/n;

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Log/n;-><init>(Llg/t;Llg/k;Llg/f;Lsg/a;Llg/b0;Z)V

    const/4 v6, 0x0

    move-object p1, v0

    :goto_4
    if-eqz p1, :cond_8

    if-eqz v6, :cond_8

    invoke-virtual {p1}, Llg/a0;->nullSafe()Llg/a0;

    move-result-object p1

    :cond_8
    return-object p1
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

    move-result-object v0

    invoke-static {v0}, Log/e;->b(Ljava/lang/Class;)Lmg/b;

    move-result-object v5

    if-nez v5, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v2, p0, Log/e;->a:Lng/v;

    const/4 v6, 0x1

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v1 .. v6}, Log/e;->c(Lng/v;Llg/f;Lsg/a;Lmg/b;Z)Llg/a0;

    move-result-object p1

    return-object p1
.end method

.method public d(Lsg/a;Llg/b0;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsg/a<",
            "*>;",
            "Llg/b0;",
            ")Z"
        }
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Log/e;->c:Llg/b0;

    const/4 v1, 0x1

    if-ne p2, v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Lsg/a;->c()Ljava/lang/Class;

    move-result-object p1

    iget-object v0, p0, Log/e;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/b0;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    if-ne v0, p2, :cond_1

    return v1

    :cond_1
    return v2

    :cond_2
    invoke-static {p1}, Log/e;->b(Ljava/lang/Class;)Lmg/b;

    move-result-object v0

    if-nez v0, :cond_3

    return v2

    :cond_3
    invoke-interface {v0}, Lmg/b;->value()Ljava/lang/Class;

    move-result-object v0

    const-class v3, Llg/b0;

    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-object v3, p0, Log/e;->a:Lng/v;

    invoke-static {v3, v0}, Log/e;->a(Lng/v;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/b0;

    invoke-virtual {p0, p1, v0}, Log/e;->e(Ljava/lang/Class;Llg/b0;)Llg/b0;

    move-result-object p1

    if-ne p1, p2, :cond_5

    return v1

    :cond_5
    return v2
.end method

.method public final e(Ljava/lang/Class;Llg/b0;)Llg/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Llg/b0;",
            ")",
            "Llg/b0;"
        }
    .end annotation

    iget-object v0, p0, Log/e;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llg/b0;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method
