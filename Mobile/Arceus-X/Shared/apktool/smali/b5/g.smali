.class public final Lb5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/d;
.implements Lx4/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb5/g$a;,
        Lb5/g$b;,
        Lb5/g$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000f\u0016\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0096\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u000f\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lb5/g;",
        "Lg5/d;",
        "Lx4/d;",
        "delegate",
        "Lb5/b;",
        "autoCloser",
        "<init>",
        "(Lg5/d;Lb5/b;)V",
        "",
        "close",
        "()V",
        "",
        "enabled",
        "setWriteAheadLoggingEnabled",
        "(Z)V",
        "a",
        "Lg5/d;",
        "()Lg5/d;",
        "b",
        "Lb5/b;",
        "()Lb5/b;",
        "Lb5/g$a;",
        "c",
        "Lb5/g$a;",
        "autoClosingDb",
        "Lg5/c;",
        "t2",
        "()Lg5/c;",
        "writableDatabase",
        "",
        "getDatabaseName",
        "()Ljava/lang/String;",
        "databaseName",
        "room-runtime"
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
.field public final a:Lg5/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lb5/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lb5/g$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg5/d;Lb5/b;)V
    .locals 1
    .param p1    # Lg5/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lb5/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCloser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/g;->a:Lg5/d;

    iput-object p2, p0, Lb5/g;->b:Lb5/b;

    new-instance p1, Lb5/g$a;

    invoke-direct {p1, p2}, Lb5/g$a;-><init>(Lb5/b;)V

    iput-object p1, p0, Lb5/g;->c:Lb5/g$a;

    invoke-virtual {p0}, Lb5/g;->a()Lg5/d;

    move-result-object p1

    invoke-virtual {p2, p1}, Lb5/b;->l(Lg5/d;)V

    return-void
.end method


# virtual methods
.method public a()Lg5/d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lb5/g;->a:Lg5/d;

    return-object v0
.end method

.method public final b()Lb5/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lb5/g;->b:Lb5/b;

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lb5/g;->c:Lb5/g$a;

    invoke-virtual {v0}, Lb5/g$a;->close()V

    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lb5/g;->a:Lg5/d;

    invoke-interface {v0}, Lg5/d;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lb5/g;->a:Lg5/d;

    invoke-interface {v0, p1}, Lg5/d;->setWriteAheadLoggingEnabled(Z)V

    return-void
.end method

.method public t2()Lg5/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lb5/g;->c:Lb5/g$a;

    invoke-virtual {v0}, Lb5/g$a;->g()V

    iget-object v0, p0, Lb5/g;->c:Lb5/g$a;

    return-object v0
.end method
