.class public final Lp6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/g$a;,
        Lp6/g$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000c\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lp6/g;",
        "Lp6/j;",
        "Ll6/h0;",
        "uri",
        "Ly6/p;",
        "options",
        "<init>",
        "(Ll6/h0;Ly6/p;)V",
        "Lp6/i;",
        "a",
        "(Leu/b;)Ljava/lang/Object;",
        "Ll6/h0;",
        "b",
        "Ly6/p;",
        "c",
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


# static fields
.field public static final c:Lp6/g$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ll6/h0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ly6/p;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp6/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp6/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lp6/g;->c:Lp6/g$a;

    return-void
.end method

.method public constructor <init>(Ll6/h0;Ly6/p;)V
    .locals 0
    .param p1    # Ll6/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ly6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/g;->a:Ll6/h0;

    iput-object p2, p0, Lp6/g;->b:Ly6/p;

    return-void
.end method


# virtual methods
.method public a(Leu/b;)Ljava/lang/Object;
    .locals 9
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lp6/i;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p1, p0, Lp6/g;->a:Ll6/h0;

    invoke-virtual {p1}, Ll6/h0;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x6

    const/4 v5, 0x0

    const-string v1, ";base64,"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->n0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result p1

    const-string v0, "invalid data uri: "

    const/4 v1, -0x1

    if-eq p1, v1, :cond_1

    iget-object v2, p0, Lp6/g;->a:Ll6/h0;

    invoke-virtual {v2}, Ll6/h0;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/16 v4, 0x3a

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->m0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v2

    if-eq v2, v1, :cond_0

    iget-object v0, p0, Lp6/g;->a:Ll6/h0;

    invoke-virtual {v0}, Ll6/h0;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "substring(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lkotlin/io/encoding/Base64;->f:Lkotlin/io/encoding/Base64$a;

    iget-object v1, p0, Lp6/g;->a:Ll6/h0;

    invoke-virtual {v1}, Ll6/h0;->toString()Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v4, p1, 0x8

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/io/encoding/Base64;->f(Lkotlin/io/encoding/Base64;Ljava/lang/CharSequence;IIILjava/lang/Object;)[B

    move-result-object p1

    new-instance v1, Lew/e;

    invoke-direct {v1}, Lew/e;-><init>()V

    invoke-virtual {v1, p1}, Lew/e;->i0([B)Lew/e;

    iget-object p1, p0, Lp6/g;->b:Ly6/p;

    invoke-virtual {p1}, Ly6/p;->g()Lew/k;

    move-result-object p1

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {v1, p1, v3, v2, v3}, Ln6/t;->c(Lew/g;Lew/k;Ln6/s$a;ILjava/lang/Object;)Ln6/s;

    move-result-object p1

    sget-object v1, Ln6/f;->b:Ln6/f;

    new-instance v2, Lp6/o;

    invoke-direct {v2, p1, v0, v1}, Lp6/o;-><init>(Ln6/s;Ljava/lang/String;Ln6/f;)V

    return-object v2

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lp6/g;->a:Ll6/h0;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lp6/g;->a:Ll6/h0;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
