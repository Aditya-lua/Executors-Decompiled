.class public Lhn/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhn/h$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhn/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/reflect/Type;Ljava/util/Set;Lhn/w;)Lhn/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lhn/w;",
            ")",
            "Lhn/h<",
            "*>;"
        }
    .end annotation

    invoke-static {p1}, Lhn/a0;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    const/4 v1, 0x0

    if-nez p2, :cond_0

    return-object v1

    :cond_0
    const-class p2, Ljava/util/List;

    if-eq v0, p2, :cond_3

    const-class p2, Ljava/util/Collection;

    if-ne v0, p2, :cond_1

    goto :goto_0

    :cond_1
    const-class p2, Ljava/util/Set;

    if-ne v0, p2, :cond_2

    invoke-static {p1, p3}, Lhn/e;->d(Ljava/lang/reflect/Type;Lhn/w;)Lhn/h;

    move-result-object p1

    invoke-virtual {p1}, Lhn/h;->nullSafe()Lhn/h;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1

    :cond_3
    :goto_0
    invoke-static {p1, p3}, Lhn/e;->b(Ljava/lang/reflect/Type;Lhn/w;)Lhn/h;

    move-result-object p1

    invoke-virtual {p1}, Lhn/h;->nullSafe()Lhn/h;

    move-result-object p1

    return-object p1
.end method
