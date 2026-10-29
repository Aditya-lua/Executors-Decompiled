.class public final Lk6/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk6/d0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0008B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0008\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002\u00a2\u0006\u0004\u0008\n\u0010\tR\u0013\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004\u00a8\u0006\r"
    }
    d2 = {
        "Lk6/d0;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "Lcoil3/PlatformContext;",
        "context",
        "Lk6/s;",
        "a",
        "(Landroid/content/Context;)Lk6/s;",
        "c",
        "Lkotlinx/atomicfu/AtomicRef;",
        "reference",
        "coil_release"
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
.field public static final a:Lk6/d0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk6/d0;

    invoke-direct {v0}, Lk6/d0;-><init>()V

    sput-object v0, Lk6/d0;->a:Lk6/d0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lk6/d0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/content/Context;)Lk6/s;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lk6/d0;->a:Lk6/d0;

    invoke-virtual {v0}, Lk6/d0;->b()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lk6/s;

    if-eqz v2, :cond_0

    check-cast v1, Lk6/s;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    invoke-virtual {v0, p0}, Lk6/d0;->c(Landroid/content/Context;)Lk6/s;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final synthetic b()Ljava/util/concurrent/atomic/AtomicReference;
    .locals 1

    sget-object v0, Lk6/d0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-object v0
.end method

.method public final c(Landroid/content/Context;)Lk6/s;
    .locals 6

    invoke-virtual {p0}, Lk6/d0;->b()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lk6/s;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lk6/s;

    move-object v5, v4

    move-object v4, v2

    move-object v2, v5

    goto :goto_3

    :cond_0
    if-nez v2, :cond_4

    instance-of v2, v3, Lk6/d0$a;

    if-eqz v2, :cond_1

    move-object v2, v3

    check-cast v2, Lk6/d0$a;

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_2

    invoke-interface {v2, p1}, Lk6/d0$a;->a(Landroid/content/Context;)Lk6/s;

    move-result-object v2

    if-nez v2, :cond_4

    :cond_2
    invoke-static {p1}, Lk6/g0;->a(Landroid/content/Context;)Lk6/d0$a;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2, p1}, Lk6/d0$a;->a(Landroid/content/Context;)Lk6/s;

    move-result-object v2

    goto :goto_2

    :cond_3
    invoke-static {}, Lk6/f0;->c()Lk6/d0$a;

    move-result-object v2

    invoke-interface {v2, p1}, Lk6/d0$a;->a(Landroid/content/Context;)Lk6/s;

    move-result-object v2

    :cond_4
    :goto_2
    move-object v4, v2

    :goto_3
    invoke-static {v0, v3, v2}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string p1, "null cannot be cast to non-null type coil3.ImageLoader"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    :cond_5
    move-object v2, v4

    goto :goto_0
.end method
