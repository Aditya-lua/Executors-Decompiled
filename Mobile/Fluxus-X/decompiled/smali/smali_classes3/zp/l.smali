.class public abstract Lzp/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzp/l$a;,
        Lzp/l$b;,
        Lzp/l$c;,
        Lzp/l$d;,
        Lzp/l$e;,
        Lzp/l$f;,
        Lzp/l$g;,
        Lzp/l$h;,
        Lzp/l$i;,
        Lzp/l$j;,
        Lzp/l$k;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u00062\u00020\u0001:\u000b\u0006\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u0082\u0001\n\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lzp/l;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "",
        "",
        "a",
        "()Ljava/util/Map;",
        "c",
        "d",
        "e",
        "j",
        "f",
        "g",
        "h",
        "k",
        "i",
        "b",
        "Lzp/l$a;",
        "Lzp/l$c;",
        "Lzp/l$d;",
        "Lzp/l$e;",
        "Lzp/l$f;",
        "Lzp/l$g;",
        "Lzp/l$h;",
        "Lzp/l$i;",
        "Lzp/l$j;",
        "Lzp/l$k;",
        "jp-my-number_release"
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
.field public static final a:Lzp/l$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzp/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzp/l$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzp/l;->a:Lzp/l$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzp/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p0, Lzp/l$a;

    const-string v1, "details"

    const-string v2, "error"

    if-eqz v0, :cond_0

    const-string v0, "chipLocked"

    invoke-static {v2, v0}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lzp/l$a;

    invoke-virtual {v2}, Lzp/l$a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v0, p0, Lzp/l$c;

    if-eqz v0, :cond_1

    const-string v0, "incorrectPasswordLimitedRetries"

    invoke-static {v2, v0}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lzp/l$c;

    invoke-virtual {v2}, Lzp/l$c;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v2}, Lzp/l$c;->g()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "retriesRemaining"

    invoke-static {v3, v2}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_1
    instance-of v0, p0, Lzp/l$d;

    if-eqz v0, :cond_2

    const-string v0, "incorrectPasswordUnlimitedRetries"

    invoke-static {v2, v0}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lzp/l$d;

    invoke-virtual {v2}, Lzp/l$d;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_2
    instance-of v0, p0, Lzp/l$e;

    if-eqz v0, :cond_3

    const-string v0, "invalidPasswordFormat"

    invoke-static {v2, v0}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lzp/l$e;

    invoke-virtual {v2}, Lzp/l$e;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_3
    instance-of v0, p0, Lzp/l$j;

    if-eqz v0, :cond_4

    const-string v0, "unsupportedVersion"

    invoke-static {v2, v0}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lzp/l$j;

    invoke-virtual {v2}, Lzp/l$j;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_4
    instance-of v0, p0, Lzp/l$f;

    if-eqz v0, :cond_5

    const-string v0, "nfcDisabled"

    invoke-static {v2, v0}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lzp/l$f;

    invoke-virtual {v2}, Lzp/l$f;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_5
    instance-of v0, p0, Lzp/l$g;

    if-eqz v0, :cond_6

    const-string v0, "nfcError"

    invoke-static {v2, v0}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lzp/l$g;

    invoke-virtual {v2}, Lzp/l$g;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_6
    instance-of v0, p0, Lzp/l$h;

    if-eqz v0, :cond_7

    const-string v0, "timeout"

    invoke-static {v2, v0}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lzp/l$h;

    invoke-virtual {v2}, Lzp/l$h;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_7
    sget-object v0, Lzp/l$k;->b:Lzp/l$k;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "userCancelled"

    invoke-static {v2, v0}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/j0;->g(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_8
    instance-of v0, p0, Lzp/l$i;

    if-eqz v0, :cond_9

    const-string v0, "unknownError"

    invoke-static {v2, v0}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lzp/l$i;

    invoke-virtual {v2}, Lzp/l$i;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_9
    new-instance v0, Lzt/l;

    invoke-direct {v0}, Lzt/l;-><init>()V

    throw v0
.end method
