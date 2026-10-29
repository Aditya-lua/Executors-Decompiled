.class public final Le3/d0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/OutcomeReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le3/d0;->onCreateCredential(Landroid/content/Context;Le3/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/OutcomeReceiver;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "e3/d0$b",
        "Landroid/os/OutcomeReceiver;",
        "Landroid/credentials/CreateCredentialResponse;",
        "Landroid/credentials/CreateCredentialException;",
        "response",
        "",
        "b",
        "(Landroid/credentials/CreateCredentialResponse;)V",
        "error",
        "a",
        "(Landroid/credentials/CreateCredentialException;)V",
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
.field public final synthetic a:Le3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le3/p<",
            "Le3/c;",
            "Lf3/f;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Le3/b;

.field public final synthetic c:Le3/d0;


# direct methods
.method public constructor <init>(Le3/p;Le3/b;Le3/d0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le3/p<",
            "Le3/c;",
            "Lf3/f;",
            ">;",
            "Le3/b;",
            "Le3/d0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Le3/d0$b;->a:Le3/p;

    iput-object p2, p0, Le3/d0$b;->b:Le3/b;

    iput-object p3, p0, Le3/d0$b;->c:Le3/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/credentials/CreateCredentialException;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CredManProvService"

    const-string v1, "CreateCredentialResponse error returned from framework"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Le3/d0$b;->a:Le3/p;

    iget-object v1, p0, Le3/d0$b;->c:Le3/d0;

    invoke-virtual {v1, p1}, Le3/d0;->f(Landroid/credentials/CreateCredentialException;)Lf3/f;

    move-result-object p1

    invoke-interface {v0, p1}, Le3/p;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Landroid/credentials/CreateCredentialResponse;)V
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CredManProvService"

    const-string v1, "Create Result returned from framework: "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Le3/d0$b;->a:Le3/p;

    sget-object v1, Le3/c;->c:Le3/c$a;

    iget-object v2, p0, Le3/d0$b;->b:Le3/b;

    invoke-virtual {v2}, Le3/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/credentials/CreateCredentialResponse;->getData()Landroid/os/Bundle;

    move-result-object p1

    const-string v3, "getData(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, p1}, Le3/c$a;->a(Ljava/lang/String;Landroid/os/Bundle;)Le3/c;

    move-result-object p1

    invoke-interface {v0, p1}, Le3/p;->onResult(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onError(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p1}, Le3/e0;->a(Ljava/lang/Object;)Landroid/credentials/CreateCredentialException;

    move-result-object p1

    invoke-virtual {p0, p1}, Le3/d0$b;->a(Landroid/credentials/CreateCredentialException;)V

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1}, Le3/f0;->a(Ljava/lang/Object;)Landroid/credentials/CreateCredentialResponse;

    move-result-object p1

    invoke-virtual {p0, p1}, Le3/d0$b;->b(Landroid/credentials/CreateCredentialResponse;)V

    return-void
.end method
