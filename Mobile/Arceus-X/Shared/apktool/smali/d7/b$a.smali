.class public final Ld7/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld7/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u001d\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Ld7/b$a;",
        "Ld7/d$a;",
        "",
        "durationMillis",
        "",
        "preferExactIntrinsicSize",
        "<init>",
        "(IZ)V",
        "Ld7/e;",
        "target",
        "Lx6/k;",
        "result",
        "Ld7/d;",
        "a",
        "(Ld7/e;Lx6/k;)Ld7/d;",
        "c",
        "I",
        "getDurationMillis",
        "()I",
        "d",
        "Z",
        "getPreferExactIntrinsicSize",
        "()Z",
        "coil-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Ld7/b$a;->c:I

    .line 3
    iput-boolean p2, p0, Ld7/b$a;->d:Z

    if-lez p1, :cond_0

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "durationMillis must be > 0."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/16 p1, 0xc8

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Ld7/b$a;-><init>(IZ)V

    return-void
.end method


# virtual methods
.method public a(Ld7/e;Lx6/k;)Ld7/d;
    .locals 3
    .param p1    # Ld7/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx6/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p2, Lx6/t;

    if-nez v0, :cond_0

    sget-object v0, Ld7/d$a;->b:Ld7/d$a;

    invoke-interface {v0, p1, p2}, Ld7/d$a;->a(Ld7/e;Lx6/k;)Ld7/d;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v0, p2

    check-cast v0, Lx6/t;

    invoke-virtual {v0}, Lx6/t;->b()Lm6/f;

    move-result-object v0

    sget-object v1, Lm6/f;->a:Lm6/f;

    if-ne v0, v1, :cond_1

    sget-object v0, Ld7/d$a;->b:Ld7/d$a;

    invoke-interface {v0, p1, p2}, Ld7/d$a;->a(Ld7/e;Lx6/k;)Ld7/d;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ld7/b;

    iget v1, p0, Ld7/b$a;->c:I

    iget-boolean v2, p0, Ld7/b$a;->d:Z

    invoke-direct {v0, p1, p2, v1, v2}, Ld7/b;-><init>(Ld7/e;Lx6/k;IZ)V

    return-object v0
.end method
