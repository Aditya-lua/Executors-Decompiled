.class public final Lo6/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo6/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo6/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Lo6/f$b;",
        "Lo6/a$b;",
        "Lo6/d$b;",
        "Lo6/d;",
        "editor",
        "<init>",
        "(Lo6/d$b;)V",
        "Lo6/f$c;",
        "c",
        "()Lo6/f$c;",
        "",
        "a",
        "()V",
        "Lo6/d$b;",
        "Lew/b0;",
        "getMetadata",
        "()Lew/b0;",
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
.field public final a:Lo6/d$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo6/d$b;)V
    .locals 0
    .param p1    # Lo6/d$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/f$b;->a:Lo6/d$b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lo6/f$b;->a:Lo6/d$b;

    invoke-virtual {v0}, Lo6/d$b;->a()V

    return-void
.end method

.method public bridge synthetic b()Lo6/a$c;
    .locals 1

    invoke-virtual {p0}, Lo6/f$b;->c()Lo6/f$c;

    move-result-object v0

    return-object v0
.end method

.method public c()Lo6/f$c;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lo6/f$b;->a:Lo6/d$b;

    invoke-virtual {v0}, Lo6/d$b;->c()Lo6/d$d;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lo6/f$c;

    invoke-direct {v1, v0}, Lo6/f$c;-><init>(Lo6/d$d;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getData()Lew/b0;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lo6/f$b;->a:Lo6/d$b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo6/d$b;->f(I)Lew/b0;

    move-result-object v0

    return-object v0
.end method

.method public getMetadata()Lew/b0;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lo6/f$b;->a:Lo6/d$b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo6/d$b;->f(I)Lew/b0;

    move-result-object v0

    return-object v0
.end method
