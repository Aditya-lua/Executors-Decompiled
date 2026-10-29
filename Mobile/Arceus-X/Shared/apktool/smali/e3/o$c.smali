.class public final Le3/o$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le3/o;->c(Le3/o;Landroid/content/Context;Le3/k0;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le3/p<",
        "Le3/l0;",
        "Lf3/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "e3/o$c",
        "Le3/p;",
        "Le3/l0;",
        "Lf3/n;",
        "result",
        "",
        "c",
        "(Le3/l0;)V",
        "e",
        "b",
        "(Lf3/n;)V",
        "credentials_release"
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
.field public final synthetic a:Lku/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lku/n<",
            "Le3/l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lku/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/n<",
            "-",
            "Le3/l0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Le3/o$c;->a:Lku/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lf3/n;

    invoke-virtual {p0, p1}, Le3/o$c;->b(Lf3/n;)V

    return-void
.end method

.method public b(Lf3/n;)V
    .locals 2

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le3/o$c;->a:Lku/n;

    invoke-interface {v0}, Lku/n;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le3/o$c;->a:Lku/n;

    sget-object v1, Ljt/n;->b:Ljt/n$a;

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public c(Le3/l0;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le3/o$c;->a:Lku/n;

    invoke-interface {v0}, Lku/n;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le3/o$c;->a:Lku/n;

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Le3/l0;

    invoke-virtual {p0, p1}, Le3/o$c;->c(Le3/l0;)V

    return-void
.end method
