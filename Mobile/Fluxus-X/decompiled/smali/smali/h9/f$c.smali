.class public final Lh9/f$c;
.super Lh9/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh9/f;->m(Lg9/a;)Lcom/google/android/gms/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "h9/f$c",
        "Lh9/a$a;",
        "Lcom/google/android/gms/common/api/Status;",
        "status",
        "Lg9/c;",
        "response",
        "",
        "N0",
        "(Lcom/google/android/gms/common/api/Status;Lg9/c;)V",
        "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Ltb/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltb/k<",
            "Lg9/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltb/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltb/k<",
            "Lg9/c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lh9/f$c;->a:Ltb/k;

    invoke-direct {p0}, Lh9/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public N0(Lcom/google/android/gms/common/api/Status;Lg9/c;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lg9/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh9/f$c;->a:Ltb/k;

    invoke-static {p1, p2, v0}, Lm9/v;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ltb/k;)V

    return-void
.end method
