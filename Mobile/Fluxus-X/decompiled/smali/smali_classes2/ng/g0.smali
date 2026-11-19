.class public Lng/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lng/g0$b;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/reflect/AccessibleObject;Ljava/lang/Object;)Z
    .locals 1

    sget-object v0, Lng/g0$b;->a:Lng/g0$b;

    invoke-virtual {v0, p0, p1}, Lng/g0$b;->a(Ljava/lang/reflect/AccessibleObject;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static b(Ljava/util/List;Ljava/lang/Class;)Llg/w$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llg/w;",
            ">;",
            "Ljava/lang/Class<",
            "*>;)",
            "Llg/w$a;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/w;

    invoke-interface {v0, p1}, Llg/w;->a(Ljava/lang/Class;)Llg/w$a;

    move-result-object v0

    sget-object v1, Llg/w$a;->b:Llg/w$a;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_1
    sget-object p0, Llg/w$a;->a:Llg/w$a;

    return-object p0
.end method
