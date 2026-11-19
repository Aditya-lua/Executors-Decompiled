.class public final Lch/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lch/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0008\u0005*\u0001\u000f\u0018\u0000 \u00072\u00020\u0001:\u0001\tB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lch/c;",
        "",
        "Lav/l0;",
        "mainDispatcher",
        "<init>",
        "(Lav/l0;)V",
        "",
        "d",
        "(Leu/b;)Ljava/lang/Object;",
        "a",
        "Lav/l0;",
        "",
        "b",
        "Z",
        "registered",
        "ch/c$c",
        "c",
        "Lch/c$c;",
        "observer",
        "NativeShell_googleProdRelease"
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
.field public static final d:Lch/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lav/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public volatile b:Z

.field public final c:Lch/c$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lch/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lch/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lch/c;->d:Lch/c$a;

    return-void
.end method

.method public constructor <init>(Lav/l0;)V
    .locals 1
    .param p1    # Lav/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "mainDispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lch/c;->a:Lav/l0;

    .line 3
    new-instance p1, Lch/c$c;

    invoke-direct {p1}, Lch/c$c;-><init>()V

    iput-object p1, p0, Lch/c;->c:Lch/c$c;

    return-void
.end method

.method public synthetic constructor <init>(Lav/l0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    invoke-static {}, Lav/g1;->c()Lav/n2;

    move-result-object p1

    invoke-virtual {p1}, Lav/n2;->Y()Lav/n2;

    move-result-object p1

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lch/c;-><init>(Lav/l0;)V

    return-void
.end method

.method public static final synthetic a(Lch/c;)Lch/c$c;
    .locals 0

    iget-object p0, p0, Lch/c;->c:Lch/c$c;

    return-object p0
.end method

.method public static final synthetic b(Lch/c;)Z
    .locals 0

    iget-boolean p0, p0, Lch/c;->b:Z

    return p0
.end method

.method public static final synthetic c(Lch/c;Z)V
    .locals 0

    iput-boolean p1, p0, Lch/c;->b:Z

    return-void
.end method


# virtual methods
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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lch/c;->a:Lav/l0;

    new-instance v1, Lch/c$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lch/c$b;-><init>(Lch/c;Leu/b;)V

    invoke-static {v0, v1, p1}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
