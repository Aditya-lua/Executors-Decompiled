.class public final Lvm/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lum/h$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvm/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lum/h$e;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/reflect/Type;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lum/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Type;",
            ">;",
            "Lum/h<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvm/b;->a:Ljava/lang/Class;

    iput-object p2, p0, Lvm/b;->b:Ljava/lang/String;

    iput-object p3, p0, Lvm/b;->c:Ljava/util/List;

    iput-object p4, p0, Lvm/b;->d:Ljava/util/List;

    iput-object p5, p0, Lvm/b;->e:Lum/h;

    return-void
.end method

.method public static b(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            ")",
            "Lvm/b<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    new-instance v0, Lvm/b;

    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v5, 0x0

    move-object v4, v3

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lvm/b;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lum/h;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "labelKey == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "baseType == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lum/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lum/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Lvm/b$a;

    invoke-direct {v0, p0, p1}, Lvm/b$a;-><init>(Lvm/b;Ljava/lang/Object;)V

    return-object v0
.end method

.method public c(Ljava/lang/Object;)Lvm/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lvm/b<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lvm/b;->a(Ljava/lang/Object;)Lum/h;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvm/b;->d(Lum/h;)Lvm/b;

    move-result-object p1

    return-object p1
.end method

.method public create(Ljava/lang/reflect/Type;Ljava/util/Set;Lum/w;)Lum/h;
    .locals 6
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

    invoke-static {p1}, Lum/a0;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    iget-object v0, p0, Lvm/b;->a:Ljava/lang/Class;

    if-ne p1, v0, :cond_2

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    iget-object p1, p0, Lvm/b;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-direct {v4, p1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object p1, p0, Lvm/b;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_1

    iget-object v0, p0, Lvm/b;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Type;

    invoke-virtual {p3, v0}, Lum/w;->d(Ljava/lang/reflect/Type;)Lum/h;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lvm/b$b;

    iget-object v1, p0, Lvm/b;->b:Ljava/lang/String;

    iget-object v2, p0, Lvm/b;->c:Ljava/util/List;

    iget-object v3, p0, Lvm/b;->d:Ljava/util/List;

    iget-object v5, p0, Lvm/b;->e:Lum/h;

    invoke-direct/range {v0 .. v5}, Lvm/b$b;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lum/h;)V

    invoke-virtual {v0}, Lum/h;->nullSafe()Lum/h;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Lum/h;)Lvm/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lum/h<",
            "Ljava/lang/Object;",
            ">;)",
            "Lvm/b<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lvm/b;

    iget-object v1, p0, Lvm/b;->a:Ljava/lang/Class;

    iget-object v2, p0, Lvm/b;->b:Ljava/lang/String;

    iget-object v3, p0, Lvm/b;->c:Ljava/util/List;

    iget-object v4, p0, Lvm/b;->d:Ljava/util/List;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lvm/b;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lum/h;)V

    return-object v0
.end method

.method public e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+TT;>;",
            "Ljava/lang/String;",
            ")",
            "Lvm/b<",
            "TT;>;"
        }
    .end annotation

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    iget-object v0, p0, Lvm/b;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v4, Ljava/util/ArrayList;

    iget-object v0, p0, Lvm/b;->c:Ljava/util/List;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v4, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v5, Ljava/util/ArrayList;

    iget-object p2, p0, Lvm/b;->d:Ljava/util/List;

    invoke-direct {v5, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lvm/b;

    iget-object v2, p0, Lvm/b;->a:Ljava/lang/Class;

    iget-object v3, p0, Lvm/b;->b:Ljava/lang/String;

    iget-object v6, p0, Lvm/b;->e:Lum/h;

    invoke-direct/range {v1 .. v6}, Lvm/b;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lum/h;)V

    return-object v1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Labels must be unique."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "label == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "subtype == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
