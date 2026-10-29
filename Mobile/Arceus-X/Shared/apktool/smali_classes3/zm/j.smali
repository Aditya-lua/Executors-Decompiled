.class public final Lzm/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lku/p0;
.implements Lzm/f$b;
.implements Lym/t$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<PropsT:",
        "Ljava/lang/Object;",
        "StateT:",
        "Ljava/lang/Object;",
        "OutputT:",
        "Ljava/lang/Object;",
        "RenderingT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lku/p0;",
        "Lzm/f$b;",
        "Lym/t$c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u0002*\u0004\u0008\u0002\u0010\u0003*\u0004\u0008\u0003\u0010\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0083\u0001\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0010\u000c\u001a\u00028\u0000\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0016\u0008\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ3\u0010\u001f\u001a\u00028\u00032\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0002\u0008\u0003\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u0010\u001e\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 J%\u0010!\u001a\u00020\r2\u0016\u0010\u000b\u001a\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\n\u00a2\u0006\u0004\u0008!\u0010\"J>\u0010(\u001a\u00020&2\u0006\u0010#\u001a\u00020\u001b2\"\u0010\'\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0012\u0004\u0018\u00010\u00120$H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008(\u0010)J)\u0010.\u001a\u00020&\"\u0004\u0008\u0004\u0010*2\u0014\u0010-\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0004\u0018\u00010,0+\u00a2\u0006\u0004\u0008.\u0010/J\u001f\u00103\u001a\u00020&2\u0010\u0008\u0002\u00102\u001a\n\u0018\u000100j\u0004\u0018\u0001`1\u00a2\u0006\u0004\u00083\u00104J7\u00106\u001a\u00028\u00032\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u00105\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u00086\u0010 J7\u00108\u001a\u00020&2\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u00107\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u00088\u00109J5\u0010<\u001a\u0004\u0018\u00018\u0004\"\u0008\u0008\u0004\u0010**\u00020\u00122\u0018\u0010;\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020:H\u0002\u00a2\u0006\u0004\u0008<\u0010=J>\u0010?\u001a\u00020>2\u0006\u0010#\u001a\u00020\u001b2\"\u0010\'\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0012\u0004\u0018\u00010\u00120$H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008?\u0010@R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008A\u0010B\u001a\u0004\u0008C\u0010DR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010ER\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008F\u0010G\u001a\u0004\u0008H\u0010IR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010JR\u001a\u0010N\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00083\u0010K\u001a\u0004\u0008L\u0010MR\u001a\u0010T\u001a\u00020O8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008P\u0010Q\u001a\u0004\u0008R\u0010SR&\u0010W\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020U8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010VR\u001a\u0010Z\u001a\u0008\u0012\u0004\u0012\u00020>0X8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010YR\u0016\u0010]\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R,\u0010`\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020:0^8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010_R\u0016\u0010b\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008a\u0010\\R\u0014\u0010e\u001a\u00020c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008[\u0010dR\u0014\u0010f\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008a\u0010\u001d\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006g"
    }
    d2 = {
        "Lzm/j;",
        "PropsT",
        "StateT",
        "OutputT",
        "RenderingT",
        "Lku/p0;",
        "Lzm/f$b;",
        "Lym/t$c;",
        "Lzm/k;",
        "id",
        "Lym/k;",
        "workflow",
        "initialProps",
        "Lym/m;",
        "snapshot",
        "Lkotlin/coroutines/CoroutineContext;",
        "baseContext",
        "Lkotlin/Function1;",
        "",
        "emitOutputToParent",
        "parent",
        "Lym/t;",
        "interceptor",
        "Lzm/d;",
        "idCounter",
        "<init>",
        "(Lzm/k;Lym/k;Ljava/lang/Object;Lym/m;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lym/t$c;Lym/t;Lzm/d;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "input",
        "m",
        "(Lym/k;Ljava/lang/Object;)Ljava/lang/Object;",
        "o",
        "(Lym/k;)Lym/m;",
        "key",
        "Lkotlin/Function2;",
        "Lnt/b;",
        "",
        "sideEffect",
        "b",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V",
        "T",
        "Ltu/d;",
        "Lym/v;",
        "selector",
        "p",
        "(Ltu/d;)V",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/CancellationException;",
        "cause",
        "e",
        "(Ljava/util/concurrent/CancellationException;)V",
        "props",
        "n",
        "newProps",
        "q",
        "(Lym/k;Ljava/lang/Object;)V",
        "Lym/r;",
        "action",
        "d",
        "(Lym/r;)Ljava/lang/Object;",
        "Lzm/g;",
        "g",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lzm/g;",
        "a",
        "Lzm/k;",
        "h",
        "()Lzm/k;",
        "Lkotlin/jvm/functions/Function1;",
        "c",
        "Lym/t$c;",
        "j",
        "()Lym/t$c;",
        "Lym/t;",
        "Lkotlin/coroutines/CoroutineContext;",
        "H",
        "()Lkotlin/coroutines/CoroutineContext;",
        "coroutineContext",
        "",
        "f",
        "J",
        "l",
        "()J",
        "sessionId",
        "Lzm/h;",
        "Lzm/h;",
        "subtreeManager",
        "Lzm/a;",
        "Lzm/a;",
        "sideEffects",
        "i",
        "Ljava/lang/Object;",
        "lastProps",
        "Lmu/g;",
        "Lmu/g;",
        "eventActionsChannel",
        "k",
        "state",
        "Lym/s;",
        "()Lym/s;",
        "identifier",
        "renderKey",
        "wf1-workflow-runtime"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lzm/k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TOutputT;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lym/t$c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Lym/t;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lkotlin/coroutines/CoroutineContext;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:J

.field public final g:Lzm/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzm/h<",
            "TPropsT;TStateT;TOutputT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lzm/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzm/a<",
            "Lzm/g;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public i:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TPropsT;"
        }
    .end annotation
.end field

.field public final j:Lmu/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmu/g<",
            "Lym/r<",
            "TPropsT;TStateT;TOutputT;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public k:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TStateT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzm/k;Lym/k;Ljava/lang/Object;Lym/m;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lym/t$c;Lym/t;Lzm/d;)V
    .locals 7
    .param p1    # Lzm/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lym/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lym/m;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lym/t$c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lym/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lzm/d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzm/k;",
            "Lym/k<",
            "-TPropsT;TStateT;+TOutputT;+TRenderingT;>;TPropsT;",
            "Lym/m;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/jvm/functions/Function1<",
            "-TOutputT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lym/t$c;",
            "Lym/t;",
            "Lzm/d;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workflow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitOutputToParent"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interceptor"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lzm/j;->a:Lzm/k;

    .line 3
    iput-object p6, p0, Lzm/j;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    iput-object p7, p0, Lzm/j;->c:Lym/t$c;

    .line 5
    iput-object p8, p0, Lzm/j;->d:Lym/t;

    .line 6
    sget-object p6, Lku/d2;->Mo:Lku/d2$b;

    invoke-interface {p5, p6}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p6

    check-cast p6, Lku/d2;

    invoke-static {p6}, Lku/g2;->a(Lku/d2;)Lku/a0;

    move-result-object p6

    invoke-interface {p5, p6}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p5

    new-instance p6, Lku/o0;

    invoke-virtual {p1}, Lzm/k;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p6, p1}, Lku/o0;-><init>(Ljava/lang/String;)V

    invoke-interface {p5, p6}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    iput-object p1, p0, Lzm/j;->e:Lkotlin/coroutines/CoroutineContext;

    if-nez p9, :cond_0

    const-wide/16 p5, 0x0

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual/range {p9 .. p9}, Lzm/d;->a()J

    move-result-wide p5

    .line 8
    :goto_0
    iput-wide p5, p0, Lzm/j;->f:J

    .line 9
    new-instance v0, Lzm/h;

    const/4 p1, 0x0

    if-nez p4, :cond_1

    move-object v1, p1

    goto :goto_1

    .line 10
    :cond_1
    invoke-virtual {p4}, Lym/m;->a()Ljava/util/Map;

    move-result-object p5

    move-object v1, p5

    .line 11
    :goto_1
    invoke-virtual {p0}, Lzm/j;->H()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    .line 12
    new-instance v3, Lzm/j$c;

    invoke-direct {v3, p0}, Lzm/j$c;-><init>(Ljava/lang/Object;)V

    move-object v4, p0

    move-object v5, p8

    move-object/from16 v6, p9

    .line 13
    invoke-direct/range {v0 .. v6}, Lzm/h;-><init>(Ljava/util/Map;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lym/t$c;Lym/t;Lzm/d;)V

    iput-object v0, p0, Lzm/j;->g:Lzm/h;

    .line 14
    new-instance p5, Lzm/a;

    invoke-direct {p5}, Lzm/a;-><init>()V

    iput-object p5, p0, Lzm/j;->h:Lzm/a;

    .line 15
    iput-object p3, p0, Lzm/j;->i:Ljava/lang/Object;

    const p5, 0x7fffffff

    const/4 p6, 0x6

    .line 16
    invoke-static {p5, p1, p1, p6, p1}, Lmu/j;->b(ILmu/a;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lmu/g;

    move-result-object p5

    iput-object p5, p0, Lzm/j;->j:Lmu/g;

    .line 17
    invoke-interface {p8, p0, p0}, Lym/t;->c(Lku/p0;Lym/t$c;)V

    .line 18
    invoke-static {p8, p2, p0}, Lym/u;->a(Lym/t;Lym/k;Lym/t$c;)Lym/k;

    move-result-object p2

    if-nez p4, :cond_2

    goto :goto_2

    .line 19
    :cond_2
    invoke-virtual {p4}, Lym/m;->b()Lym/i;

    move-result-object p1

    :goto_2
    invoke-virtual {p2, p3, p1}, Lym/k;->d(Ljava/lang/Object;Lym/i;)Ljava/lang/Object;

    move-result-object p1

    .line 20
    iput-object p1, p0, Lzm/j;->k:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lzm/k;Lym/k;Ljava/lang/Object;Lym/m;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lym/t$c;Lym/t;Lzm/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_0

    .line 21
    sget-object v1, Lzm/j$a;->i:Lzm/j$a;

    move-object v8, v1

    goto :goto_0

    :cond_0
    move-object/from16 v8, p6

    :goto_0
    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v9, v2

    goto :goto_1

    :cond_1
    move-object/from16 v9, p7

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    .line 22
    sget-object v1, Lym/e;->a:Lym/e;

    move-object v10, v1

    goto :goto_2

    :cond_2
    move-object/from16 v10, p8

    :goto_2
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_3

    move-object v11, v2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object v2, p0

    goto :goto_3

    :cond_3
    move-object/from16 v11, p9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    .line 23
    :goto_3
    invoke-direct/range {v2 .. v11}, Lzm/j;-><init>(Lzm/k;Lym/k;Ljava/lang/Object;Lym/m;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lym/t$c;Lym/t;Lzm/d;)V

    return-void
.end method

.method public static final synthetic c(Lzm/j;Lym/r;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lzm/j;->d(Lym/r;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lzm/j;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lzm/j;->e(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method


# virtual methods
.method public H()Lkotlin/coroutines/CoroutineContext;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lzm/j;->e:Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method

.method public b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lku/p0;",
            "-",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sideEffect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzm/j;->h:Lzm/a;

    invoke-static {v0}, Lzm/a;->b(Lzm/a;)Lzm/e;

    move-result-object v0

    invoke-virtual {v0}, Lzm/e;->b()Lzm/e$a;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    move-object v1, v0

    check-cast v1, Lzm/g;

    invoke-virtual {v1}, Lzm/g;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Lzm/e$a;->a()Lzm/e$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Expected side effect keys to be unique: \""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x22

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    iget-object v0, p0, Lzm/j;->h:Lzm/a;

    invoke-static {v0}, Lzm/a;->a(Lzm/a;)Lzm/e;

    move-result-object v1

    invoke-virtual {v1}, Lzm/e;->b()Lzm/e$a;

    move-result-object v2

    const/4 v3, 0x0

    move-object v4, v3

    :goto_1
    if-eqz v2, :cond_5

    move-object v5, v2

    check-cast v5, Lzm/g;

    invoke-virtual {v5}, Lzm/g;->d()Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    if-nez v4, :cond_2

    invoke-interface {v2}, Lzm/e$a;->a()Lzm/e$a;

    move-result-object v5

    invoke-virtual {v1, v5}, Lzm/e;->e(Lzm/e$a;)V

    goto :goto_2

    :cond_2
    invoke-interface {v2}, Lzm/e$a;->a()Lzm/e$a;

    move-result-object v5

    invoke-interface {v4, v5}, Lzm/e$a;->b(Lzm/e$a;)V

    :goto_2
    invoke-virtual {v1}, Lzm/e;->c()Lzm/e$a;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v1, v4}, Lzm/e;->f(Lzm/e$a;)V

    :cond_3
    invoke-interface {v2, v3}, Lzm/e$a;->b(Lzm/e$a;)V

    move-object v3, v2

    goto :goto_3

    :cond_4
    invoke-interface {v2}, Lzm/e$a;->a()Lzm/e$a;

    move-result-object v4

    move-object v6, v4

    move-object v4, v2

    move-object v2, v6

    goto :goto_1

    :cond_5
    :goto_3
    if-nez v3, :cond_6

    invoke-virtual {p0, p1, p2}, Lzm/j;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lzm/g;

    move-result-object v3

    :cond_6
    invoke-static {v0}, Lzm/a;->b(Lzm/a;)Lzm/e;

    move-result-object p1

    invoke-virtual {p1, v3}, Lzm/e;->d(Lzm/e$a;)V

    return-void
.end method

.method public final d(Lym/r;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lym/r<",
            "-TPropsT;TStateT;+TOutputT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lzm/j;->i:Ljava/lang/Object;

    iget-object v1, p0, Lzm/j;->k:Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lym/w;->h(Lym/r;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lym/v;

    iput-object v0, p0, Lzm/j;->k:Ljava/lang/Object;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lzm/j;->b:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Lym/v;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/util/concurrent/CancellationException;)V
    .locals 1
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p0}, Lzm/j;->H()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0, p1}, Lku/g2;->c(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final g(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lzm/g;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lku/p0;",
            "-",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzm/g;"
        }
    .end annotation

    new-instance v0, Lku/o0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sideEffect["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lzm/j;->a:Lzm/k;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lku/o0;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v0}, Lku/q0;->j(Lku/p0;Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v2

    sget-object v4, Lku/r0;->b:Lku/r0;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v5, p2

    invoke-static/range {v2 .. v7}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object p2

    new-instance v0, Lzm/g;

    invoke-direct {v0, p1, p2}, Lzm/g;-><init>(Ljava/lang/String;Lku/d2;)V

    return-object v0
.end method

.method public final h()Lzm/k;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lzm/j;->a:Lzm/k;

    return-object v0
.end method

.method public i()Lym/s;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lzm/j;->a:Lzm/k;

    invoke-virtual {v0}, Lzm/k;->a()Lym/s;

    move-result-object v0

    return-object v0
.end method

.method public j()Lym/t$c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lzm/j;->c:Lym/t$c;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lzm/j;->a:Lzm/k;

    invoke-virtual {v0}, Lzm/k;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()J
    .locals 2

    iget-wide v0, p0, Lzm/j;->f:J

    return-wide v0
.end method

.method public final m(Lym/k;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lym/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/k<",
            "-TPropsT;*+TOutputT;+TRenderingT;>;TPropsT;)TRenderingT;"
        }
    .end annotation

    const-string v0, "workflow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lzm/j;->n(Lym/k;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lym/k;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/k<",
            "-TPropsT;TStateT;+TOutputT;+TRenderingT;>;TPropsT;)TRenderingT;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lzm/j;->q(Lym/k;Ljava/lang/Object;)V

    new-instance v0, Lzm/f;

    iget-object v1, p0, Lzm/j;->g:Lzm/h;

    iget-object v2, p0, Lzm/j;->j:Lmu/g;

    invoke-direct {v0, v1, p0, v2}, Lzm/f;-><init>(Lzm/f$a;Lzm/f$b;Lmu/y;)V

    iget-object v1, p0, Lzm/j;->d:Lym/t;

    invoke-static {v1, p1, p0}, Lym/u;->a(Lym/t;Lym/k;Lym/t$c;)Lym/k;

    move-result-object v1

    iget-object v2, p0, Lzm/j;->k:Ljava/lang/Object;

    invoke-static {v0, p1}, Lym/w;->a(Lym/a;Lym/k;)Lym/k$a;

    move-result-object p1

    invoke-virtual {v1, p2, v2, p1}, Lym/k;->f(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0}, Lzm/f;->f()V

    iget-object p2, p0, Lzm/j;->g:Lzm/h;

    invoke-virtual {p2}, Lzm/h;->c()V

    iget-object p2, p0, Lzm/j;->h:Lzm/a;

    invoke-static {p2}, Lzm/a;->b(Lzm/a;)Lzm/e;

    move-result-object p2

    invoke-virtual {p2}, Lzm/e;->b()Lzm/e$a;

    move-result-object p2

    :goto_0
    if-eqz p2, :cond_0

    move-object v0, p2

    check-cast v0, Lzm/g;

    invoke-virtual {v0}, Lzm/g;->c()Lku/d2;

    move-result-object v0

    invoke-interface {v0}, Lku/d2;->start()Z

    invoke-interface {p2}, Lzm/e$a;->a()Lzm/e$a;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lzm/j;->h:Lzm/a;

    invoke-static {p2}, Lzm/a;->a(Lzm/a;)Lzm/e;

    move-result-object v0

    invoke-virtual {v0}, Lzm/e;->b()Lzm/e$a;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_1

    move-object v1, v0

    check-cast v1, Lzm/g;

    invoke-virtual {v1}, Lzm/g;->c()Lku/d2;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, Lku/d2$a;->a(Lku/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-interface {v0}, Lzm/e$a;->a()Lzm/e$a;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-static {p2}, Lzm/a;->a(Lzm/a;)Lzm/e;

    move-result-object v0

    invoke-static {p2}, Lzm/a;->b(Lzm/a;)Lzm/e;

    move-result-object v1

    invoke-static {p2, v1}, Lzm/a;->c(Lzm/a;Lzm/e;)V

    invoke-static {p2, v0}, Lzm/a;->d(Lzm/a;Lzm/e;)V

    invoke-static {p2}, Lzm/a;->b(Lzm/a;)Lzm/e;

    move-result-object p2

    invoke-virtual {p2}, Lzm/e;->a()V

    return-object p1
.end method

.method public final o(Lym/k;)Lym/m;
    .locals 3
    .param p1    # Lym/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/k<",
            "****>;)",
            "Lym/m;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "workflow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzm/j;->g:Lzm/h;

    invoke-virtual {v0}, Lzm/h;->f()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lzm/j;->d:Lym/t;

    invoke-static {v1, p1, p0}, Lym/u;->a(Lym/t;Lym/k;Lym/t$c;)Lym/k;

    move-result-object p1

    iget-object v1, p0, Lzm/j;->k:Ljava/lang/Object;

    invoke-virtual {p1, v1}, Lym/k;->g(Ljava/lang/Object;)Lym/i;

    move-result-object p1

    new-instance v1, Lym/m;

    new-instance v2, Lzm/j$b;

    invoke-direct {v2, v0}, Lzm/j$b;-><init>(Ljava/util/Map;)V

    invoke-direct {v1, p1, v2}, Lym/m;-><init>(Lym/i;Lkotlin/jvm/functions/Function0;)V

    return-object v1
.end method

.method public final p(Ltu/d;)V
    .locals 3
    .param p1    # Ltu/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ltu/d<",
            "-",
            "Lym/v<",
            "+TT;>;>;)V"
        }
    .end annotation

    const-string v0, "selector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzm/j;->g:Lzm/h;

    invoke-virtual {v0, p1}, Lzm/h;->g(Ltu/d;)V

    iget-object v0, p0, Lzm/j;->j:Lmu/g;

    invoke-interface {v0}, Lmu/x;->z()Ltu/h;

    move-result-object v0

    new-instance v1, Lzm/j$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lzm/j$d;-><init>(Lzm/j;Lnt/b;)V

    invoke-interface {p1, v0, v1}, Ltu/d;->c(Ltu/h;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public final q(Lym/k;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/k<",
            "-TPropsT;TStateT;+TOutputT;+TRenderingT;>;TPropsT;)V"
        }
    .end annotation

    iget-object v0, p0, Lzm/j;->i:Ljava/lang/Object;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lzm/j;->d:Lym/t;

    invoke-static {v0, p1, p0}, Lym/u;->a(Lym/t;Lym/k;Lym/t$c;)Lym/k;

    move-result-object p1

    iget-object v0, p0, Lzm/j;->i:Ljava/lang/Object;

    iget-object v1, p0, Lzm/j;->k:Ljava/lang/Object;

    invoke-virtual {p1, v0, p2, v1}, Lym/k;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lzm/j;->k:Ljava/lang/Object;

    :cond_0
    iput-object p2, p0, Lzm/j;->i:Ljava/lang/Object;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lzm/j;->j()Lym/t$c;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "WorkflowInstance(\u2026)"

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WorkflowInstance(identifier="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lzm/j;->i()Lym/s;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", renderKey="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lzm/j;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", instanceId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lzm/j;->l()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", parent="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
