.class public final Lc5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/d;
.implements Ly4/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc5/g$a;,
        Lc5/g$b;,
        Lc5/g$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000f\u0016\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0096\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u000f\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lc5/g;",
        "Lh5/d;",
        "Ly4/d;",
        "delegate",
        "Lc5/b;",
        "autoCloser",
        "<init>",
        "(Lh5/d;Lc5/b;)V",
        "",
        "close",
        "()V",
        "",
        "enabled",
        "setWriteAheadLoggingEnabled",
        "(Z)V",
        "a",
        "Lh5/d;",
        "()Lh5/d;",
        "b",
        "Lc5/b;",
        "()Lc5/b;",
        "Lc5/g$a;",
        "c",
        "Lc5/g$a;",
        "autoClosingDb",
        "Lh5/c;",
        "w2",
        "()Lh5/c;",
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
.field public final a:Lh5/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lc5/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lc5/g$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lh5/d;Lc5/b;)V
    .locals 1
    .param p1    # Lh5/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lc5/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCloser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/g;->a:Lh5/d;

    iput-object p2, p0, Lc5/g;->b:Lc5/b;

    new-instance p1, Lc5/g$a;

    invoke-direct {p1, p2}, Lc5/g$a;-><init>(Lc5/b;)V

    iput-object p1, p0, Lc5/g;->c:Lc5/g$a;

    invoke-virtual {p0}, Lc5/g;->a()Lh5/d;

    move-result-object p1

    invoke-virtual {p2, p1}, Lc5/b;->l(Lh5/d;)V

    return-void
.end method


# virtual methods
.method public a()Lh5/d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lc5/g;->a:Lh5/d;

    return-object v0
.end method

.method public final b()Lc5/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lc5/g;->b:Lc5/b;

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lc5/g;->c:Lc5/g$a;

    invoke-virtual {v0}, Lc5/g$a;->close()V

    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lc5/g;->a:Lh5/d;

    invoke-interface {v0}, Lh5/d;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lc5/g;->a:Lh5/d;

    invoke-interface {v0, p1}, Lh5/d;->setWriteAheadLoggingEnabled(Z)V

    return-void
.end method

.method public w2()Lh5/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lc5/g;->c:Lc5/g$a;

    invoke-virtual {v0}, Lc5/g$a;->g()V

    iget-object v0, p0, Lc5/g;->c:Lc5/g$a;

    return-object v0
.end method
