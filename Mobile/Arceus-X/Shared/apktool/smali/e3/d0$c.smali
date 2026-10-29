.class public final Le3/d0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/OutcomeReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le3/d0;->onGetCredential(Landroid/content/Context;Le3/k0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V
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
        "e3/d0$c",
        "Landroid/os/OutcomeReceiver;",
        "Landroid/credentials/GetCredentialResponse;",
        "Landroid/credentials/GetCredentialException;",
        "response",
        "",
        "b",
        "(Landroid/credentials/GetCredentialResponse;)V",
        "error",
        "a",
        "(Landroid/credentials/GetCredentialException;)V",
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
            "Le3/l0;",
            "Lf3/n;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Le3/d0;


# direct methods
.method public constructor <init>(Le3/p;Le3/d0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le3/p<",
            "Le3/l0;",
            "Lf3/n;",
            ">;",
            "Le3/d0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Le3/d0$c;->a:Le3/p;

    iput-object p2, p0, Le3/d0$c;->b:Le3/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/credentials/GetCredentialException;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CredManProvService"

    const-string v1, "GetCredentialResponse error returned from framework"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Le3/d0$c;->a:Le3/p;

    iget-object v1, p0, Le3/d0$c;->b:Le3/d0;

    invoke-virtual {v1, p1}, Le3/d0;->g(Landroid/credentials/GetCredentialException;)Lf3/n;

    move-result-object p1

    invoke-interface {v0, p1}, Le3/p;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Landroid/credentials/GetCredentialResponse;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CredManProvService"

    const-string v1, "GetCredentialResponse returned from framework"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Le3/d0$c;->a:Le3/p;

    iget-object v1, p0, Le3/d0$c;->b:Le3/d0;

    invoke-virtual {v1, p1}, Le3/d0;->e(Landroid/credentials/GetCredentialResponse;)Le3/l0;

    move-result-object p1

    invoke-interface {v0, p1}, Le3/p;->onResult(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onError(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p1}, Le3/g0;->a(Ljava/lang/Object;)Landroid/credentials/GetCredentialException;

    move-result-object p1

    invoke-virtual {p0, p1}, Le3/d0$c;->a(Landroid/credentials/GetCredentialException;)V

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1}, Le3/h0;->a(Ljava/lang/Object;)Landroid/credentials/GetCredentialResponse;

    move-result-object p1

    invoke-virtual {p0, p1}, Le3/d0$c;->b(Landroid/credentials/GetCredentialResponse;)V

    return-void
.end method
