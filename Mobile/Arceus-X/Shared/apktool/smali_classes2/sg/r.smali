.class public final Lsg/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "Lsg/r;",
        "",
        "<init>",
        "()V",
        "",
        "c",
        "b",
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
.field public static final a:Lsg/r;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsg/r;

    invoke-direct {v0}, Lsg/r;-><init>()V

    sput-object v0, Lsg/r;->a:Lsg/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lsg/r;)V
    .locals 0

    invoke-virtual {p0}, Lsg/r;->b()V

    return-void
.end method

.method public static final c()V
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->u4()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Landroidx/lifecycle/h0;->i:Landroidx/lifecycle/h0$b;

    invoke-virtual {v0}, Landroidx/lifecycle/h0$b;->a()Landroidx/lifecycle/s;

    move-result-object v0

    invoke-interface {v0}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object v0

    new-instance v1, Lsg/r$b;

    invoke-direct {v1}, Lsg/r$b;-><init>()V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 7

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v0

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v1

    new-instance v4, Lsg/r$a;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lsg/r$a;-><init>(Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method
