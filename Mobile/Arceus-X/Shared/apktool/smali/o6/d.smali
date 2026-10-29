.class public final Lo6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo6/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo6/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lo6/d;",
        "Lo6/j;",
        "Ljava/nio/ByteBuffer;",
        "data",
        "Lx6/p;",
        "options",
        "<init>",
        "(Ljava/nio/ByteBuffer;Lx6/p;)V",
        "Lo6/i;",
        "a",
        "(Lnt/b;)Ljava/lang/Object;",
        "Ljava/nio/ByteBuffer;",
        "b",
        "Lx6/p;",
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
.field public final a:Ljava/nio/ByteBuffer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lx6/p;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Lx6/p;)V
    .locals 0
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/d;->a:Ljava/nio/ByteBuffer;

    iput-object p2, p0, Lo6/d;->b:Lx6/p;

    return-void
.end method


# virtual methods
.method public a(Lnt/b;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lo6/i;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance p1, Lo6/o;

    iget-object v0, p0, Lo6/d;->a:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lo6/e;->a(Ljava/nio/ByteBuffer;)Lxu/r0;

    move-result-object v0

    invoke-static {v0}, Lxu/b0;->c(Lxu/r0;)Lxu/g;

    move-result-object v0

    iget-object v1, p0, Lo6/d;->b:Lx6/p;

    invoke-virtual {v1}, Lx6/p;->g()Lxu/l;

    move-result-object v1

    new-instance v2, Lm6/d;

    iget-object v3, p0, Lo6/d;->a:Ljava/nio/ByteBuffer;

    invoke-direct {v2, v3}, Lm6/d;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-static {v0, v1, v2}, Lm6/t;->a(Lxu/g;Lxu/l;Lm6/s$a;)Lm6/s;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Lm6/f;->b:Lm6/f;

    invoke-direct {p1, v0, v1, v2}, Lo6/o;-><init>(Lm6/s;Ljava/lang/String;Lm6/f;)V

    return-object p1
.end method
