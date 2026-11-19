.class public final Log/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Log/i$a;
    }
.end annotation


# instance fields
.field public final a:Lng/v;

.field public final b:Z


# direct methods
.method public constructor <init>(Lng/v;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Log/i;->a:Lng/v;

    iput-boolean p2, p0, Log/i;->b:Z

    return-void
.end method


# virtual methods
.method public final a(Llg/f;Ljava/lang/reflect/Type;)Llg/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/f;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Llg/a0<",
            "*>;"
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq p2, v0, :cond_1

    const-class v0, Ljava/lang/Boolean;

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lsg/a;->b(Ljava/lang/reflect/Type;)Lsg/a;

    move-result-object p2

    invoke-virtual {p1, p2}, Llg/f;->m(Lsg/a;)Llg/a0;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Log/p;->f:Llg/a0;

    return-object p1
.end method

.method public create(Llg/f;Lsg/a;)Llg/a0;
    .locals 5
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

    invoke-virtual {p2}, Lsg/a;->d()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lsg/a;->c()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/util/Map;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0, v1}, Lng/x;->j(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v2, v0, v1

    const/4 v3, 0x1

    aget-object v0, v0, v3

    invoke-virtual {p0, p1, v2}, Log/i;->a(Llg/f;Ljava/lang/reflect/Type;)Llg/a0;

    move-result-object v3

    new-instance v4, Log/o;

    invoke-direct {v4, p1, v3, v2}, Log/o;-><init>(Llg/f;Llg/a0;Ljava/lang/reflect/Type;)V

    invoke-static {v0}, Lsg/a;->b(Ljava/lang/reflect/Type;)Lsg/a;

    move-result-object v2

    invoke-virtual {p1, v2}, Llg/f;->m(Lsg/a;)Llg/a0;

    move-result-object v2

    new-instance v3, Log/o;

    invoke-direct {v3, p1, v2, v0}, Log/o;-><init>(Llg/f;Llg/a0;Ljava/lang/reflect/Type;)V

    iget-object p1, p0, Log/i;->a:Lng/v;

    invoke-virtual {p1, p2, v1}, Lng/v;->w(Lsg/a;Z)Lng/d0;

    move-result-object p1

    new-instance p2, Log/i$a;

    invoke-direct {p2, p0, v4, v3, p1}, Log/i$a;-><init>(Log/i;Llg/a0;Llg/a0;Lng/d0;)V

    return-object p2
.end method
