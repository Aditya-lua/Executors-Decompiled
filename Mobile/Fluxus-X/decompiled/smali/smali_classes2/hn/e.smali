.class public abstract Lhn/e;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Ljava/util/Collection<",
        "TT;>;T:",
        "Ljava/lang/Object;",
        ">",
        "Lhn/h<",
        "TC;>;"
    }
.end annotation


# static fields
.field public static final b:Lhn/h$e;


# instance fields
.field public final a:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhn/e$a;

    invoke-direct {v0}, Lhn/e$a;-><init>()V

    sput-object v0, Lhn/e;->b:Lhn/h$e;

    return-void
.end method

.method public constructor <init>(Lhn/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/h<",
            "TT;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lhn/h;-><init>()V

    .line 3
    iput-object p1, p0, Lhn/e;->a:Lhn/h;

    return-void
.end method

.method public synthetic constructor <init>(Lhn/h;Lhn/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhn/e;-><init>(Lhn/h;)V

    return-void
.end method

.method public static b(Ljava/lang/reflect/Type;Lhn/w;)Lhn/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            "Lhn/w;",
            ")",
            "Lhn/h<",
            "Ljava/util/Collection<",
            "TT;>;>;"
        }
    .end annotation

    const-class v0, Ljava/util/Collection;

    invoke-static {p0, v0}, Lhn/a0;->c(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-virtual {p1, p0}, Lhn/w;->d(Ljava/lang/reflect/Type;)Lhn/h;

    move-result-object p0

    new-instance p1, Lhn/e$b;

    invoke-direct {p1, p0}, Lhn/e$b;-><init>(Lhn/h;)V

    return-object p1
.end method

.method public static d(Ljava/lang/reflect/Type;Lhn/w;)Lhn/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            "Lhn/w;",
            ")",
            "Lhn/h<",
            "Ljava/util/Set<",
            "TT;>;>;"
        }
    .end annotation

    const-class v0, Ljava/util/Collection;

    invoke-static {p0, v0}, Lhn/a0;->c(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-virtual {p1, p0}, Lhn/w;->d(Ljava/lang/reflect/Type;)Lhn/h;

    move-result-object p0

    new-instance p1, Lhn/e$c;

    invoke-direct {p1, p0}, Lhn/e$c;-><init>(Lhn/h;)V

    return-object p1
.end method


# virtual methods
.method public a(Lhn/m;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/m;",
            ")TC;"
        }
    .end annotation

    invoke-virtual {p0}, Lhn/e;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p1}, Lhn/m;->a()V

    :goto_0
    invoke-virtual {p1}, Lhn/m;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lhn/e;->a:Lhn/h;

    invoke-virtual {v1, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lhn/m;->c()V

    return-object v0
.end method

.method public abstract c()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TC;"
        }
    .end annotation
.end method

.method public e(Lhn/t;Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/t;",
            "TC;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lhn/t;->a()Lhn/t;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lhn/e;->a:Lhn/h;

    invoke-virtual {v1, p1, v0}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lhn/t;->e()Lhn/t;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lhn/e;->a:Lhn/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".collection()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
