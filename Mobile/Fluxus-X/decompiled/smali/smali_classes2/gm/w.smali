.class public final Lgm/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgm/w$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u0000 \u000c2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lgm/w;",
        "",
        "Lgm/b;",
        "local",
        "Lgm/v;",
        "remote",
        "<init>",
        "(Lgm/b;Lgm/v;)V",
        "Ljava/io/Serializable;",
        "d",
        "(Leu/b;)Ljava/lang/Object;",
        "",
        "c",
        "a",
        "Lgm/b;",
        "b",
        "Lgm/v;",
        "universalapp_googleProdRelease"
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
.field public static final c:Lgm/w$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lgm/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lgm/v;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgm/w$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgm/w$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgm/w;->c:Lgm/w$a;

    return-void
.end method

.method public constructor <init>(Lgm/b;Lgm/v;)V
    .locals 1
    .param p1    # Lgm/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lgm/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "local"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remote"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgm/w;->a:Lgm/b;

    iput-object p2, p0, Lgm/w;->b:Lgm/v;

    return-void
.end method

.method public static final synthetic a(Lgm/w;)Lgm/b;
    .locals 0

    iget-object p0, p0, Lgm/w;->a:Lgm/b;

    return-object p0
.end method

.method public static final synthetic b(Lgm/w;)Lgm/v;
    .locals 0

    iget-object p0, p0, Lgm/w;->b:Lgm/v;

    return-object p0
.end method


# virtual methods
.method public final c(Leu/b;)Ljava/lang/Object;
    .locals 3
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object v0

    new-instance v1, Lgm/w$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lgm/w$b;-><init>(Lgm/w;Leu/b;)V

    invoke-static {v0, v1, p1}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(Leu/b;)Ljava/lang/Object;
    .locals 3
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Ljava/io/Serializable;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object v0

    new-instance v1, Lgm/w$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lgm/w$c;-><init>(Lgm/w;Leu/b;)V

    invoke-static {v0, v1, p1}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
