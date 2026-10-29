.class public final synthetic Ll3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/f;


# instance fields
.field public final synthetic a:Landroid/os/CancellationSignal;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Le3/p;


# direct methods
.method public synthetic constructor <init>(Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/h;->a:Landroid/os/CancellationSignal;

    iput-object p2, p0, Ll3/h;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Ll3/h;->c:Le3/p;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Ll3/h;->a:Landroid/os/CancellationSignal;

    iget-object v1, p0, Ll3/h;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Ll3/h;->c:Le3/p;

    invoke-static {v0, v1, v2, p1}, Landroidx/credentials/playservices/controllers/blockstore/createrestorecredential/CredentialProviderCreateRestoreCredentialController;->$r8$lambda$13dZI6bjchbi94h8xynN-tTwxIw(Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;Ljava/lang/Exception;)V

    return-void
.end method
