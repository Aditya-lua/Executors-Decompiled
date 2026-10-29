.class public final Lo6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo6/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo6/m$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lo6/m;",
        "Lo6/j;",
        "Lk6/h0;",
        "uri",
        "Lx6/p;",
        "options",
        "<init>",
        "(Lk6/h0;Lx6/p;)V",
        "Lo6/i;",
        "a",
        "(Lnt/b;)Ljava/lang/Object;",
        "Lk6/h0;",
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
.field public final a:Lk6/h0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lx6/p;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lk6/h0;Lx6/p;)V
    .locals 0
    .param p1    # Lk6/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/m;->a:Lk6/h0;

    iput-object p2, p0, Lo6/m;->b:Lx6/p;

    return-void
.end method


# virtual methods
.method public a(Lnt/b;)Ljava/lang/Object;
    .locals 14
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

    iget-object p1, p0, Lo6/m;->a:Lk6/h0;

    invoke-virtual {p1}, Lk6/h0;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    move-object v0, p1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/16 v1, 0x21

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->m0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_1

    sget-object v1, Lxu/h0;->b:Lxu/h0$a;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "substring(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v1, v3, v2, v5, v6}, Lxu/h0$a;->e(Lxu/h0$a;Ljava/lang/String;ZILjava/lang/Object;)Lxu/h0;

    move-result-object v3

    add-int/2addr p1, v5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v0, p1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p1, v2, v5, v6}, Lxu/h0$a;->e(Lxu/h0$a;Ljava/lang/String;ZILjava/lang/Object;)Lxu/h0;

    move-result-object v7

    new-instance p1, Lo6/o;

    iget-object v0, p0, Lo6/m;->b:Lx6/p;

    invoke-virtual {v0}, Lx6/p;->g()Lxu/l;

    move-result-object v0

    invoke-static {v0, v3}, Lxu/b0;->d(Lxu/l;Lxu/h0;)Lxu/l;

    move-result-object v8

    const/16 v12, 0x1c

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v13}, Lm6/t;->d(Lxu/h0;Lxu/l;Ljava/lang/String;Ljava/lang/AutoCloseable;Lm6/s$a;ILjava/lang/Object;)Lm6/s;

    move-result-object v0

    sget-object v1, Le7/x;->a:Le7/x;

    invoke-static {v7}, Le7/l;->d(Lxu/h0;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Le7/x;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lm6/f;->c:Lm6/f;

    invoke-direct {p1, v0, v1, v2}, Lo6/o;-><init>(Lm6/s;Ljava/lang/String;Lm6/f;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid jar:file URI: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lo6/m;->a:Lk6/h0;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
