.class public final Lrv/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrv/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrv/b;->a(Lew/k0;)Lrv/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0008\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0006\u0010\u000cR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\n\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "rv/b$a",
        "Lrv/a;",
        "",
        "cancel",
        "()V",
        "Lew/k0;",
        "a",
        "Lew/k0;",
        "delegate",
        "Lew/g;",
        "b",
        "Lew/g;",
        "()Lew/g;",
        "source",
        "Lew/f;",
        "c",
        "Lew/f;",
        "()Lew/f;",
        "sink",
        "okhttp"
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
.field public final a:Lew/k0;

.field public final b:Lew/g;

.field public final c:Lew/f;


# direct methods
.method public constructor <init>(Lew/k0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrv/b$a;->a:Lew/k0;

    invoke-interface {p1}, Lew/k0;->a()Lew/l0;

    move-result-object v0

    invoke-static {v0}, Lew/v;->c(Lew/l0;)Lew/g;

    move-result-object v0

    iput-object v0, p0, Lrv/b$a;->b:Lew/g;

    invoke-interface {p1}, Lew/k0;->b()Lew/j0;

    move-result-object p1

    invoke-static {p1}, Lew/v;->b(Lew/j0;)Lew/f;

    move-result-object p1

    iput-object p1, p0, Lrv/b$a;->c:Lew/f;

    return-void
.end method


# virtual methods
.method public a()Lew/g;
    .locals 1

    .line 2
    iget-object v0, p0, Lrv/b$a;->b:Lew/g;

    return-object v0
.end method

.method public bridge synthetic a()Lew/l0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrv/b$a;->a()Lew/g;

    move-result-object v0

    return-object v0
.end method

.method public b()Lew/f;
    .locals 1

    .line 2
    iget-object v0, p0, Lrv/b$a;->c:Lew/f;

    return-object v0
.end method

.method public bridge synthetic b()Lew/j0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrv/b$a;->b()Lew/f;

    move-result-object v0

    return-object v0
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lrv/b$a;->a:Lew/k0;

    invoke-interface {v0}, Lew/k0;->cancel()V

    return-void
.end method
