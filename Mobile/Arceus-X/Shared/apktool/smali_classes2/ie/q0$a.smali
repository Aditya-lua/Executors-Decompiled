.class public Lie/q0$a;
.super Lie/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lie/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lie/w<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final transient c:Lie/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/u<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final transient d:[Ljava/lang/Object;

.field public final transient e:I

.field public final transient f:I


# direct methods
.method public constructor <init>(Lie/u;[Ljava/lang/Object;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/u<",
            "TK;TV;>;[",
            "Ljava/lang/Object;",
            "II)V"
        }
    .end annotation

    invoke-direct {p0}, Lie/w;-><init>()V

    iput-object p1, p0, Lie/q0$a;->c:Lie/u;

    iput-object p2, p0, Lie/q0$a;->d:[Ljava/lang/Object;

    iput p3, p0, Lie/q0$a;->e:I

    iput p4, p0, Lie/q0$a;->f:I

    return-void
.end method

.method public static synthetic A(Lie/q0$a;)I
    .locals 0

    iget p0, p0, Lie/q0$a;->f:I

    return p0
.end method

.method public static synthetic B(Lie/q0$a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lie/q0$a;->d:[Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic C(Lie/q0$a;)I
    .locals 0

    iget p0, p0, Lie/q0$a;->e:I

    return p0
.end method


# virtual methods
.method public b([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lie/w;->a()Lie/t;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lie/t;->b([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lie/q0$a;->c:Lie/u;

    invoke-virtual {v2, v0}, Lie/u;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g()Lie/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/y0<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lie/w;->a()Lie/t;

    move-result-object v0

    invoke-virtual {v0}, Lie/t;->g()Lie/y0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lie/q0$a;->g()Lie/y0;

    move-result-object v0

    return-object v0
.end method

.method public m()Lie/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/t<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lie/q0$a$a;

    invoke-direct {v0, p0}, Lie/q0$a$a;-><init>(Lie/q0$a;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lie/q0$a;->f:I

    return v0
.end method
