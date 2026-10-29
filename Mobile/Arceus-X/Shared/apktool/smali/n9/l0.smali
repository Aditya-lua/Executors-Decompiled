.class public abstract Ln9/l0;
.super Ln9/v0;
.source "SourceFile"


# instance fields
.field public final d:I

.field public final e:Landroid/os/Bundle;

.field public final synthetic f:Ln9/c;


# direct methods
.method public constructor <init>(Ln9/c;ILandroid/os/Bundle;)V
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ln9/l0;->f:Ln9/c;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p0, p1, v0}, Ln9/v0;-><init>(Ln9/c;Ljava/lang/Object;)V

    iput p2, p0, Ln9/l0;->d:I

    iput-object p3, p0, Ln9/l0;->e:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Ljava/lang/Boolean;

    iget p1, p0, Ln9/l0;->d:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ln9/l0;->e()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ln9/l0;->f:Ln9/c;

    invoke-virtual {p1, v0, v1}, Ln9/c;->zzd(ILandroid/os/IInterface;)V

    new-instance p1, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v0, 0x8

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-virtual {p0, p1}, Ln9/l0;->f(Lcom/google/android/gms/common/ConnectionResult;)V

    :cond_0
    return-void

    :cond_1
    iget-object v2, p0, Ln9/l0;->f:Ln9/c;

    invoke-virtual {v2, v0, v1}, Ln9/c;->zzd(ILandroid/os/IInterface;)V

    iget-object v0, p0, Ln9/l0;->e:Landroid/os/Bundle;

    if-eqz v0, :cond_2

    const-string v1, "pendingIntent"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/app/PendingIntent;

    :cond_2
    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-virtual {p0, v0}, Ln9/l0;->f(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method public abstract e()Z
.end method

.method public abstract f(Lcom/google/android/gms/common/ConnectionResult;)V
.end method
