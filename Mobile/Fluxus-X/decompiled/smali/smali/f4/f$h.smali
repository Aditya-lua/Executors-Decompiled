.class public final Lf4/f$h;
.super Lf4/f$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\nR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0011\u001a\u0004\u0008\u0018\u0010\u0013R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lf4/f$h;",
        "Lf4/f$f;",
        "Lf4/c1$d;",
        "operation",
        "",
        "isPop",
        "providesSharedElementTransition",
        "<init>",
        "(Lf4/c1$d;ZZ)V",
        "g",
        "()Z",
        "",
        "transition",
        "Lf4/w0;",
        "d",
        "(Ljava/lang/Object;)Lf4/w0;",
        "b",
        "Ljava/lang/Object;",
        "f",
        "()Ljava/lang/Object;",
        "c",
        "Z",
        "h",
        "isOverlapAllowed",
        "e",
        "sharedElementTransition",
        "()Lf4/w0;",
        "handlingImpl",
        "fragment_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c:Z

.field public final d:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf4/c1$d;ZZ)V
    .locals 2
    .param p1    # Lf4/c1$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "operation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lf4/f$f;-><init>(Lf4/c1$d;)V

    invoke-virtual {p1}, Lf4/c1$d;->g()Lf4/c1$d$b;

    move-result-object v0

    sget-object v1, Lf4/c1$d$b;->c:Lf4/c1$d$b;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lf4/c1$d;->h()Lf4/q;

    move-result-object v0

    if-eqz p2, :cond_0

    invoke-virtual {v0}, Lf4/q;->R()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lf4/q;->y()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lf4/c1$d;->h()Lf4/q;

    move-result-object v0

    if-eqz p2, :cond_2

    invoke-virtual {v0}, Lf4/q;->X()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lf4/q;->C()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lf4/f$h;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Lf4/c1$d;->g()Lf4/c1$d$b;

    move-result-object v0

    if-ne v0, v1, :cond_4

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lf4/c1$d;->h()Lf4/q;

    move-result-object v0

    invoke-virtual {v0}, Lf4/q;->r()Z

    move-result v0

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lf4/c1$d;->h()Lf4/q;

    move-result-object v0

    invoke-virtual {v0}, Lf4/q;->q()Z

    move-result v0

    goto :goto_1

    :cond_4
    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lf4/f$h;->c:Z

    if-eqz p3, :cond_6

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Lf4/c1$d;->h()Lf4/q;

    move-result-object p1

    invoke-virtual {p1}, Lf4/q;->a0()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Lf4/c1$d;->h()Lf4/q;

    move-result-object p1

    invoke-virtual {p1}, Lf4/q;->Z()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_6
    const/4 p1, 0x0

    :goto_2
    iput-object p1, p0, Lf4/f$h;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c()Lf4/w0;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lf4/f$h;->b:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lf4/f$h;->d(Ljava/lang/Object;)Lf4/w0;

    move-result-object v0

    iget-object v1, p0, Lf4/f$h;->d:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lf4/f$h;->d(Ljava/lang/Object;)Lf4/w0;

    move-result-object v1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object v1

    invoke-virtual {v1}, Lf4/c1$d;->h()Lf4/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " returned Transition "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf4/f$h;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " which uses a different Transition  type than its shared element transition "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf4/f$h;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    return-object v1

    :cond_2
    return-object v0
.end method

.method public final d(Ljava/lang/Object;)Lf4/w0;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, Lf4/u0;->b:Lf4/w0;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lf4/w0;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Lf4/u0;->c:Lf4/w0;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lf4/w0;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Transition "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for fragment "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object p1

    invoke-virtual {p1}, Lf4/c1$d;->h()Lf4/q;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a valid framework Transition or AndroidX Transition"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lf4/f$h;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lf4/f$h;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-object v0, p0, Lf4/f$h;->d:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lf4/f$h;->c:Z

    return v0
.end method
