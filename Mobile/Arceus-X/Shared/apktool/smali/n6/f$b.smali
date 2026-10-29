.class public final Ln6/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln6/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "Ln6/f$b;",
        "Ln6/a$b;",
        "Ln6/d$b;",
        "Ln6/d;",
        "editor",
        "<init>",
        "(Ln6/d$b;)V",
        "Ln6/f$c;",
        "b",
        "()Ln6/f$c;",
        "",
        "abort",
        "()V",
        "a",
        "Ln6/d$b;",
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
.field public final a:Ln6/d$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln6/d$b;)V
    .locals 0
    .param p1    # Ln6/d$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/f$b;->a:Ln6/d$b;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ln6/a$c;
    .locals 1

    invoke-virtual {p0}, Ln6/f$b;->b()Ln6/f$c;

    move-result-object v0

    return-object v0
.end method

.method public abort()V
    .locals 1

    iget-object v0, p0, Ln6/f$b;->a:Ln6/d$b;

    invoke-virtual {v0}, Ln6/d$b;->a()V

    return-void
.end method

.method public b()Ln6/f$c;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Ln6/f$b;->a:Ln6/d$b;

    invoke-virtual {v0}, Ln6/d$b;->c()Ln6/d$d;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ln6/f$c;

    invoke-direct {v1, v0}, Ln6/f$c;-><init>(Ln6/d$d;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getData()Lxu/h0;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ln6/f$b;->a:Ln6/d$b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ln6/d$b;->f(I)Lxu/h0;

    move-result-object v0

    return-object v0
.end method

.method public getMetadata()Lxu/h0;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ln6/f$b;->a:Ln6/d$b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln6/d$b;->f(I)Lxu/h0;

    move-result-object v0

    return-object v0
.end method
