.class public final Lku/t;
.super Lku/i2;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lku/t;",
        "Lku/i2;",
        "Lku/p;",
        "child",
        "<init>",
        "(Lku/p;)V",
        "",
        "cause",
        "",
        "x",
        "(Ljava/lang/Throwable;)V",
        "e",
        "Lku/p;",
        "",
        "w",
        "()Z",
        "onCancelling",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final e:Lku/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lku/p<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lku/p;)V
    .locals 0
    .param p1    # Lku/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lku/i2;-><init>()V

    iput-object p1, p0, Lku/t;->e:Lku/p;

    return-void
.end method


# virtual methods
.method public w()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public x(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object p1, p0, Lku/t;->e:Lku/p;

    invoke-virtual {p0}, Lku/i2;->v()Lku/j2;

    move-result-object v0

    invoke-virtual {p1, v0}, Lku/p;->y(Lku/d2;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lku/p;->P(Ljava/lang/Throwable;)V

    return-void
.end method
