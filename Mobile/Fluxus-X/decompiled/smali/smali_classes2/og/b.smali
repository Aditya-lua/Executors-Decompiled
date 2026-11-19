.class public final Log/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Log/b$a;
    }
.end annotation


# instance fields
.field public final a:Lng/v;


# direct methods
.method public constructor <init>(Lng/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Log/b;->a:Lng/v;

    return-void
.end method


# virtual methods
.method public create(Llg/f;Lsg/a;)Llg/a0;
    .locals 3
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

    const-class v2, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0, v1}, Lng/x;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lsg/a;->b(Ljava/lang/reflect/Type;)Lsg/a;

    move-result-object v1

    invoke-virtual {p1, v1}, Llg/f;->m(Lsg/a;)Llg/a0;

    move-result-object v1

    new-instance v2, Log/o;

    invoke-direct {v2, p1, v1, v0}, Log/o;-><init>(Llg/f;Llg/a0;Ljava/lang/reflect/Type;)V

    const/4 p1, 0x0

    iget-object v0, p0, Log/b;->a:Lng/v;

    invoke-virtual {v0, p2, p1}, Lng/v;->w(Lsg/a;Z)Lng/d0;

    move-result-object p1

    new-instance p2, Log/b$a;

    invoke-direct {p2, v2, p1}, Log/b$a;-><init>(Llg/a0;Lng/d0;)V

    return-object p2
.end method
