.class public Lku/f2;
.super Lku/j2;
.source "SourceFile"

# interfaces
.implements Lku/a0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\n\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00078\u0010X\u0090\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\t\u00a8\u0006\u0011"
    }
    d2 = {
        "Lku/f2;",
        "Lku/j2;",
        "Lku/a0;",
        "Lku/d2;",
        "parent",
        "<init>",
        "(Lku/d2;)V",
        "",
        "e",
        "()Z",
        "T0",
        "c",
        "Z",
        "g0",
        "handlesException",
        "h0",
        "onCancelComplete",
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
.field public final c:Z


# direct methods
.method public constructor <init>(Lku/d2;)V
    .locals 1
    .param p1    # Lku/d2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lku/j2;-><init>(Z)V

    invoke-virtual {p0, p1}, Lku/j2;->q0(Lku/d2;)V

    invoke-virtual {p0}, Lku/f2;->T0()Z

    move-result p1

    iput-boolean p1, p0, Lku/f2;->c:Z

    return-void
.end method


# virtual methods
.method public final T0()Z
    .locals 4

    invoke-virtual {p0}, Lku/j2;->k0()Lku/u;

    move-result-object v0

    instance-of v1, v0, Lku/v;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lku/v;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lku/i2;->v()Lku/j2;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Lku/j2;->g0()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-virtual {v0}, Lku/j2;->k0()Lku/u;

    move-result-object v0

    instance-of v3, v0, Lku/v;

    if-eqz v3, :cond_3

    check-cast v0, Lku/v;

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lku/i2;->v()Lku/j2;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_4
    :goto_2
    return v1
.end method

.method public e()Z
    .locals 1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p0, v0}, Lku/j2;->w0(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public g0()Z
    .locals 1

    iget-boolean v0, p0, Lku/f2;->c:Z

    return v0
.end method

.method public h0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
