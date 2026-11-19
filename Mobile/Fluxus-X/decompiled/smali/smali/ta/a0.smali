.class public interface abstract Lta/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0008H\'\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\u000cH\'\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\'\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\'\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J\u001d\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\'\u00a2\u0006\u0004\u0008\u0016\u0010\u0012J\u001d\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\'\u00a2\u0006\u0004\u0008\u0018\u0010\u0012\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0019\u00c0\u0006\u0001"
    }
    d2 = {
        "Lta/a0;",
        "",
        "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;",
        "request",
        "Lcom/google/android/gms/tasks/Task;",
        "Lta/e0;",
        "k",
        "(Lcom/google/android/gms/identitycredentials/GetCredentialRequest;)Lcom/google/android/gms/tasks/Task;",
        "Lta/o0;",
        "Lta/q0;",
        "f",
        "(Lta/o0;)Lcom/google/android/gms/tasks/Task;",
        "Lta/k;",
        "Lta/i;",
        "i",
        "(Lta/k;)Lcom/google/android/gms/tasks/Task;",
        "Lta/e;",
        "clearExport",
        "(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;",
        "Lta/u;",
        "exportCredentialsToDeviceSetup",
        "Lta/c0;",
        "importCredentialsForDeviceSetup",
        "Lta/s;",
        "getCredentialTransferCapabilities",
        "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract f(Lta/o0;)Lcom/google/android/gms/tasks/Task;
    .param p1    # Lta/o0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lta/o0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lta/q0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract i(Lta/k;)Lcom/google/android/gms/tasks/Task;
    .param p1    # Lta/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lta/k;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lta/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract k(Lcom/google/android/gms/identitycredentials/GetCredentialRequest;)Lcom/google/android/gms/tasks/Task;
    .param p1    # Lcom/google/android/gms/identitycredentials/GetCredentialRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lta/e0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
