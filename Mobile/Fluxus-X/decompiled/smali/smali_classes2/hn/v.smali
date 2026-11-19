.class public final Lhn/v;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lhn/h<",
        "Ljava/util/Map<",
        "TK;TV;>;>;"
    }
.end annotation


# static fields
.field public static final c:Lhn/h$e;


# instance fields
.field public final a:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "TK;>;"
        }
    .end annotation
.end field

.field public final b:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhn/v$a;

    invoke-direct {v0}, Lhn/v$a;-><init>()V

    sput-object v0, Lhn/v;->c:Lhn/h$e;

    return-void
.end method

.method public constructor <init>(Lhn/w;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V
    .locals 0

    invoke-direct {p0}, Lhn/h;-><init>()V

    invoke-virtual {p1, p2}, Lhn/w;->d(Ljava/lang/reflect/Type;)Lhn/h;

    move-result-object p2

    iput-object p2, p0, Lhn/v;->a:Lhn/h;

    invoke-virtual {p1, p3}, Lhn/w;->d(Ljava/lang/reflect/Type;)Lhn/h;

    move-result-object p1

    iput-object p1, p0, Lhn/v;->b:Lhn/h;

    return-void
.end method


# virtual methods
.method public a(Lhn/m;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/m;",
            ")",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lhn/u;

    invoke-direct {v0}, Lhn/u;-><init>()V

    invoke-virtual {p1}, Lhn/m;->b()V

    :goto_0
    invoke-virtual {p1}, Lhn/m;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lhn/m;->z()V

    iget-object v1, p0, Lhn/v;->a:Lhn/h;

    invoke-virtual {v1, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lhn/v;->b:Lhn/h;

    invoke-virtual {v2, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lhn/u;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lhn/j;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Map key \'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\' has multiple values at path "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lhn/m;->x()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " and "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lhn/j;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, Lhn/m;->d()V

    return-object v0
.end method

.method public b(Lhn/t;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/t;",
            "Ljava/util/Map<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lhn/t;->c()Lhn/t;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lhn/t;->u()V

    iget-object v1, p0, Lhn/v;->a:Lhn/h;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    iget-object v1, p0, Lhn/v;->b:Lhn/h;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p2, Lhn/j;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Map key is null at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lhn/t;->x()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lhn/j;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    invoke-virtual {p1}, Lhn/t;->g()Lhn/t;

    return-void
.end method

.method public bridge synthetic fromJson(Lhn/m;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lhn/v;->a(Lhn/m;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic toJson(Lhn/t;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lhn/v;->b(Lhn/t;Ljava/util/Map;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhn/v;->a:Lhn/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhn/v;->b:Lhn/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
