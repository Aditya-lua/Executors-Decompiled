.class public final Lum/w$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lum/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lum/h$e;",
            ">;"
        }
    .end annotation
.end field

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lum/w$b;->a:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Lum/w$b;->b:I

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lum/w$b;
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lum/a;->c(Ljava/lang/Object;)Lum/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lum/w$b;->c(Lum/h$e;)Lum/w$b;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "adapter == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/lang/reflect/Type;Lum/h;)Lum/w$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            "Lum/h<",
            "TT;>;)",
            "Lum/w$b;"
        }
    .end annotation

    invoke-static {p1, p2}, Lum/w;->h(Ljava/lang/reflect/Type;Lum/h;)Lum/h$e;

    move-result-object p1

    invoke-virtual {p0, p1}, Lum/w$b;->c(Lum/h$e;)Lum/w$b;

    move-result-object p1

    return-object p1
.end method

.method public c(Lum/h$e;)Lum/w$b;
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, Lum/w$b;->a:Ljava/util/List;

    iget v1, p0, Lum/w$b;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lum/w$b;->b:I

    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "factory == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d()Lum/w;
    .locals 1

    new-instance v0, Lum/w;

    invoke-direct {v0, p0}, Lum/w;-><init>(Lum/w$b;)V

    return-object v0
.end method
