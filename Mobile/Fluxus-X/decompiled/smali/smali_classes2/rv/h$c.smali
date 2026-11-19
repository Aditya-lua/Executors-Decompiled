.class public final Lrv/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lew/k0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrv/h;->w()Lew/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u001e\u0010\u000b\u001a\u00060\u0005R\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u001e\u0010\u0011\u001a\u00060\u000cR\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "rv/h$c",
        "Lew/k0;",
        "",
        "cancel",
        "()V",
        "Lrv/h$a;",
        "Lrv/h;",
        "a",
        "Lrv/h$a;",
        "c",
        "()Lrv/h$a;",
        "sink",
        "Lrv/h$b;",
        "b",
        "Lrv/h$b;",
        "d",
        "()Lrv/h$b;",
        "source",
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
.field public final a:Lrv/h$a;

.field public final b:Lrv/h$b;

.field public final synthetic c:Lrv/h;


# direct methods
.method public constructor <init>(Lrv/h;)V
    .locals 12

    iput-object p1, p0, Lrv/h$c;->c:Lrv/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lrv/h$a;

    invoke-static {p1}, Lrv/h;->a(Lrv/h;)Lsv/d;

    move-result-object v1

    invoke-interface {v1}, Lsv/d;->h()Lew/k0;

    move-result-object v1

    invoke-interface {v1}, Lew/k0;->b()Lew/j0;

    move-result-object v2

    const-wide/16 v3, -0x1

    const/4 v5, 0x1

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lrv/h$a;-><init>(Lrv/h;Lew/j0;JZ)V

    iput-object v0, p0, Lrv/h$c;->a:Lrv/h$a;

    new-instance v6, Lrv/h$b;

    invoke-static {v1}, Lrv/h;->a(Lrv/h;)Lsv/d;

    move-result-object p1

    invoke-interface {p1}, Lsv/d;->h()Lew/k0;

    move-result-object p1

    invoke-interface {p1}, Lew/k0;->a()Lew/l0;

    move-result-object v8

    const-wide/16 v9, -0x1

    const/4 v11, 0x1

    move-object v7, v1

    invoke-direct/range {v6 .. v11}, Lrv/h$b;-><init>(Lrv/h;Lew/l0;JZ)V

    iput-object v6, p0, Lrv/h$c;->b:Lrv/h$b;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lew/l0;
    .locals 1

    invoke-virtual {p0}, Lrv/h$c;->d()Lrv/h$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Lew/j0;
    .locals 1

    invoke-virtual {p0}, Lrv/h$c;->c()Lrv/h$a;

    move-result-object v0

    return-object v0
.end method

.method public c()Lrv/h$a;
    .locals 1

    iget-object v0, p0, Lrv/h$c;->a:Lrv/h$a;

    return-object v0
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lrv/h$c;->c:Lrv/h;

    invoke-virtual {v0}, Lrv/h;->d()V

    return-void
.end method

.method public d()Lrv/h$b;
    .locals 1

    iget-object v0, p0, Lrv/h$c;->b:Lrv/h$b;

    return-object v0
.end method
