.class public final Lta/e$d;
.super Lta/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lta/e;->k(Lcom/google/android/gms/identitycredentials/GetCredentialRequest;)Lcom/google/android/gms/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "ta/e$d",
        "Lta/c;",
        "Lcom/google/android/gms/common/api/Status;",
        "status",
        "Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;",
        "result",
        "",
        "G1",
        "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;)V",
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


# instance fields
.field public final synthetic a:Lsb/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsb/k<",
            "Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsb/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsb/k<",
            "Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lta/e$d;->a:Lsb/k;

    invoke-direct {p0}, Lta/c;-><init>()V

    return-void
.end method


# virtual methods
.method public G1(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;)V
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lta/e$d;->a:Lsb/k;

    invoke-static {p1, p2, v0}, Ll9/v;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lsb/k;)V

    return-void
.end method
