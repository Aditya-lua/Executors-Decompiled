.class public final Lav/j2$b;
.super Lav/i2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lav/j2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lav/j2$b;",
        "Lav/i2;",
        "Lav/j2;",
        "parent",
        "Lav/j2$c;",
        "state",
        "Lav/v;",
        "child",
        "",
        "proposedUpdate",
        "<init>",
        "(Lav/j2;Lav/j2$c;Lav/v;Ljava/lang/Object;)V",
        "",
        "cause",
        "",
        "x",
        "(Ljava/lang/Throwable;)V",
        "e",
        "Lav/j2;",
        "f",
        "Lav/j2$c;",
        "g",
        "Lav/v;",
        "h",
        "Ljava/lang/Object;",
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
.field public final e:Lav/j2;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lav/j2$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lav/v;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lav/j2;Lav/j2$c;Lav/v;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lav/j2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lav/j2$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lav/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lav/i2;-><init>()V

    iput-object p1, p0, Lav/j2$b;->e:Lav/j2;

    iput-object p2, p0, Lav/j2$b;->f:Lav/j2$c;

    iput-object p3, p0, Lav/j2$b;->g:Lav/v;

    iput-object p4, p0, Lav/j2$b;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public x(Ljava/lang/Throwable;)V
    .locals 3
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object p1, p0, Lav/j2$b;->e:Lav/j2;

    iget-object v0, p0, Lav/j2$b;->f:Lav/j2$c;

    iget-object v1, p0, Lav/j2$b;->g:Lav/v;

    iget-object v2, p0, Lav/j2$b;->h:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lav/j2;->N(Lav/j2;Lav/j2$c;Lav/v;Ljava/lang/Object;)V

    return-void
.end method
