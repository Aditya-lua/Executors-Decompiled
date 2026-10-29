.class public final synthetic Landroidx/credentials/playservices/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/f;


# instance fields
.field public final synthetic a:Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;

.field public final synthetic b:Landroid/os/CancellationSignal;

.field public final synthetic c:Ljava/util/concurrent/Executor;

.field public final synthetic d:Le3/p;


# direct methods
.method public synthetic constructor <init>(Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/credentials/playservices/j;->a:Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;

    iput-object p2, p0, Landroidx/credentials/playservices/j;->b:Landroid/os/CancellationSignal;

    iput-object p3, p0, Landroidx/credentials/playservices/j;->c:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Landroidx/credentials/playservices/j;->d:Le3/p;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Landroidx/credentials/playservices/j;->a:Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;

    iget-object v1, p0, Landroidx/credentials/playservices/j;->b:Landroid/os/CancellationSignal;

    iget-object v2, p0, Landroidx/credentials/playservices/j;->c:Ljava/util/concurrent/Executor;

    iget-object v3, p0, Landroidx/credentials/playservices/j;->d:Le3/p;

    invoke-static {v0, v1, v2, v3, p1}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$ZiuN7M7j6nhSxISGIiu1ycEfVYw(Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;Ljava/lang/Exception;)V

    return-void
.end method
