.class public final Log/o;
.super Llg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Llg/a0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Llg/f;

.field public final b:Llg/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Llg/f;Llg/a0;Ljava/lang/reflect/Type;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/f;",
            "Llg/a0<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Llg/a0;-><init>()V

    iput-object p1, p0, Log/o;->a:Llg/f;

    iput-object p2, p0, Log/o;->b:Llg/a0;

    iput-object p3, p0, Log/o;->c:Ljava/lang/reflect/Type;

    return-void
.end method

.method public static a(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;
    .locals 1

    if-eqz p1, :cond_1

    instance-of v0, p0, Ljava/lang/Class;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static b(Llg/a0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/a0<",
            "*>;)Z"
        }
    .end annotation

    :goto_0
    instance-of v0, p0, Log/m;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Log/m;

    invoke-virtual {v0}, Log/m;->a()Llg/a0;

    move-result-object v0

    if-ne v0, p0, :cond_0

    goto :goto_1

    :cond_0
    move-object p0, v0

    goto :goto_0

    :cond_1
    :goto_1
    instance-of p0, p0, Log/l$c;

    return p0
.end method


# virtual methods
.method public read(Ltg/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Log/o;->b:Llg/a0;

    invoke-virtual {v0, p1}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public write(Ltg/c;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/c;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Log/o;->b:Llg/a0;

    iget-object v1, p0, Log/o;->c:Ljava/lang/reflect/Type;

    invoke-static {v1, p2}, Log/o;->a(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Log/o;->c:Ljava/lang/reflect/Type;

    if-eq v1, v2, :cond_1

    iget-object v0, p0, Log/o;->a:Llg/f;

    invoke-static {v1}, Lsg/a;->b(Ljava/lang/reflect/Type;)Lsg/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Llg/f;->m(Lsg/a;)Llg/a0;

    move-result-object v0

    instance-of v1, v0, Log/l$c;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Log/o;->b:Llg/a0;

    invoke-static {v1}, Log/o;->b(Llg/a0;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Log/o;->b:Llg/a0;

    :cond_1
    :goto_0
    invoke-virtual {v0, p1, p2}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    return-void
.end method
