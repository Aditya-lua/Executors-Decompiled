.class public final Ln6/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln6/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Ln6/f$c;",
        "Ln6/a$c;",
        "Ln6/d$d;",
        "Ln6/d;",
        "snapshot",
        "<init>",
        "(Ln6/d$d;)V",
        "",
        "close",
        "()V",
        "Ln6/f$b;",
        "a",
        "()Ln6/f$b;",
        "Ln6/d$d;",
        "Lxu/h0;",
        "getMetadata",
        "()Lxu/h0;",
        "metadata",
        "getData",
        "data",
        "coil-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ln6/d$d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln6/d$d;)V
    .locals 0
    .param p1    # Ln6/d$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/f$c;->a:Ln6/d$d;

    return-void
.end method


# virtual methods
.method public a()Ln6/f$b;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Ln6/f$c;->a:Ln6/d$d;

    invoke-virtual {v0}, Ln6/d$d;->a()Ln6/d$b;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ln6/f$b;

    invoke-direct {v1, v0}, Ln6/f$b;-><init>(Ln6/d$b;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Ln6/f$c;->a:Ln6/d$d;

    invoke-virtual {v0}, Ln6/d$d;->close()V

    return-void
.end method

.method public getData()Lxu/h0;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ln6/f$c;->a:Ln6/d$d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ln6/d$d;->b(I)Lxu/h0;

    move-result-object v0

    return-object v0
.end method

.method public getMetadata()Lxu/h0;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ln6/f$c;->a:Ln6/d$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln6/d$d;->b(I)Lxu/h0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic s2()Ln6/a$b;
    .locals 1

    invoke-virtual {p0}, Ln6/f$c;->a()Ln6/f$b;

    move-result-object v0

    return-object v0
.end method
