.class public abstract Lym/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lym/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lym/k$a;
    }
.end annotation

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
        "Lym/q<",
        "TPropsT;TOutputT;TRenderingT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008&\u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u0000*\u0004\u0008\u0001\u0010\u0002*\u0006\u0008\u0002\u0010\u0003 \u0001*\u0006\u0008\u0003\u0010\u0004 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005:\u0001\u001cB\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J!\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0008\u001a\u00028\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\tH&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u0010\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011JC\u0010\u0016\u001a\u00028\u00032\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00012\"\u0010\u0015\u001a\u001e0\u0014R\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00028\u0001H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J%\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lym/k;",
        "PropsT",
        "StateT",
        "OutputT",
        "RenderingT",
        "Lym/q;",
        "<init>",
        "()V",
        "props",
        "Lym/i;",
        "snapshot",
        "d",
        "(Ljava/lang/Object;Lym/i;)Ljava/lang/Object;",
        "old",
        "new",
        "state",
        "e",
        "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "renderProps",
        "renderState",
        "Lym/k$a;",
        "context",
        "f",
        "(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object;",
        "g",
        "(Ljava/lang/Object;)Lym/i;",
        "b",
        "()Lym/k;",
        "a",
        "wf1-workflow-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Lym/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lym/k<",
            "TPropsT;TStateT;TOutputT;TRenderingT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
.end method

.method public abstract d(Ljava/lang/Object;Lym/i;)Ljava/lang/Object;
    .param p2    # Lym/i;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TPropsT;",
            "Lym/i;",
            ")TStateT;"
        }
    .end annotation
.end method

.method public e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TPropsT;TPropsT;TStateT;)TStateT;"
        }
    .end annotation

    return-object p3
.end method

.method public abstract f(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object;
    .param p3    # Lym/k$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TPropsT;TStateT;",
            "Lym/k<",
            "-TPropsT;TStateT;+TOutputT;+TRenderingT;>.a;)TRenderingT;"
        }
    .end annotation
.end method

.method public abstract g(Ljava/lang/Object;)Lym/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TStateT;)",
            "Lym/i;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
