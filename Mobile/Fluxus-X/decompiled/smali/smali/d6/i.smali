.class public final Ld6/i;
.super Ld6/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld6/b<",
        "Lc6/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0014X\u0094D\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Ld6/i;",
        "Ld6/b;",
        "Lc6/h;",
        "Le6/h;",
        "tracker",
        "<init>",
        "(Le6/h;)V",
        "Lg6/j0;",
        "workSpec",
        "",
        "b",
        "(Lg6/j0;)Z",
        "value",
        "f",
        "(Lc6/h;)Z",
        "",
        "I",
        "d",
        "()I",
        "reason",
        "work-runtime_release"
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
.field public final b:I


# direct methods
.method public constructor <init>(Le6/h;)V
    .locals 1
    .param p1    # Le6/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le6/h<",
            "Lc6/h;",
            ">;)V"
        }
    .end annotation

    const-string v0, "tracker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ld6/b;-><init>(Le6/h;)V

    const/4 p1, 0x7

    iput p1, p0, Ld6/i;->b:I

    return-void
.end method


# virtual methods
.method public b(Lg6/j0;)Z
    .locals 1
    .param p1    # Lg6/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "workSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lg6/j0;->j:Ly5/d;

    invoke-virtual {p1}, Ly5/d;->f()Ly5/x;

    move-result-object p1

    sget-object v0, Ly5/x;->c:Ly5/x;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d()I
    .locals 1

    iget v0, p0, Ld6/i;->b:I

    return v0
.end method

.method public bridge synthetic e(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lc6/h;

    invoke-virtual {p0, p1}, Ld6/i;->f(Lc6/h;)Z

    move-result p1

    return p1
.end method

.method public f(Lc6/h;)Z
    .locals 1
    .param p1    # Lc6/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lc6/h;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lc6/h;->e()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lc6/h;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
