.class public final synthetic Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/f;


# instance fields
.field public final synthetic a:Le3/k0;

.field public final synthetic b:Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController;

.field public final synthetic c:Le3/p;

.field public final synthetic d:Ljava/util/concurrent/Executor;

.field public final synthetic e:Landroid/os/CancellationSignal;


# direct methods
.method public synthetic constructor <init>(Le3/k0;Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/e;->a:Le3/k0;

    iput-object p2, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/e;->b:Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController;

    iput-object p3, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/e;->c:Le3/p;

    iput-object p4, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/e;->d:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/e;->e:Landroid/os/CancellationSignal;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 6

    iget-object v0, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/e;->a:Le3/k0;

    iget-object v1, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/e;->b:Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController;

    iget-object v2, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/e;->c:Le3/p;

    iget-object v3, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/e;->d:Ljava/util/concurrent/Executor;

    iget-object v4, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/e;->e:Landroid/os/CancellationSignal;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController;->$r8$lambda$TQX2ZrS59LpBRnV6cJA_BHM6Wp8(Le3/k0;Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;Ljava/lang/Exception;)V

    return-void
.end method
