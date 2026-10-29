.class public final synthetic Ll3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/credentials/playservices/controllers/blockstore/createrestorecredential/CredentialProviderCreateRestoreCredentialController;

.field public final synthetic b:Landroid/os/CancellationSignal;

.field public final synthetic c:Ljava/util/concurrent/Executor;

.field public final synthetic d:Le3/p;


# direct methods
.method public synthetic constructor <init>(Landroidx/credentials/playservices/controllers/blockstore/createrestorecredential/CredentialProviderCreateRestoreCredentialController;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/f;->a:Landroidx/credentials/playservices/controllers/blockstore/createrestorecredential/CredentialProviderCreateRestoreCredentialController;

    iput-object p2, p0, Ll3/f;->b:Landroid/os/CancellationSignal;

    iput-object p3, p0, Ll3/f;->c:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Ll3/f;->d:Le3/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ll3/f;->a:Landroidx/credentials/playservices/controllers/blockstore/createrestorecredential/CredentialProviderCreateRestoreCredentialController;

    iget-object v1, p0, Ll3/f;->b:Landroid/os/CancellationSignal;

    iget-object v2, p0, Ll3/f;->c:Ljava/util/concurrent/Executor;

    iget-object v3, p0, Ll3/f;->d:Le3/p;

    check-cast p1, Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;

    invoke-static {v0, v1, v2, v3, p1}, Landroidx/credentials/playservices/controllers/blockstore/createrestorecredential/CredentialProviderCreateRestoreCredentialController;->$r8$lambda$WVkBVzF_I18FXoFuS-v5AStu9YY(Landroidx/credentials/playservices/controllers/blockstore/createrestorecredential/CredentialProviderCreateRestoreCredentialController;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
