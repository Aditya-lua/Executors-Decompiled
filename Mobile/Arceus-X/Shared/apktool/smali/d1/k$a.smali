.class public final Ld1/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ld1/k$a;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lne/x;",
        "Ld1/k;",
        "c",
        "(Landroid/content/Context;)Lne/x;",
        "sAppInstance",
        "Ld1/k;",
        "camera-lifecycle_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld1/k$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ld1/k;
    .locals 0

    invoke-static {p0, p1}, Ld1/k$a;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ld1/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Void;)Ld1/k;
    .locals 0

    invoke-static {p0}, Ld1/k$a;->d(Ljava/lang/Void;)Ld1/k;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/lang/Void;)Ld1/k;
    .locals 0

    invoke-static {}, Ld1/k;->a()Ld1/k;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ld1/k;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld1/k;

    return-object p0
.end method


# virtual methods
.method public final c(Landroid/content/Context;)Lne/x;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lne/x<",
            "Ld1/k;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ld1/k;->a()Ld1/k;

    move-result-object v0

    invoke-static {v0, p1}, Ld1/k;->b(Ld1/k;Landroid/content/Context;)Lne/x;

    move-result-object p1

    new-instance v0, Ld1/i;

    invoke-direct {v0}, Ld1/i;-><init>()V

    new-instance v1, Ld1/j;

    invoke-direct {v1, v0}, Ld1/j;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lr0/n;->x(Lne/x;Lt/a;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p1

    const-string v0, "transform(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
