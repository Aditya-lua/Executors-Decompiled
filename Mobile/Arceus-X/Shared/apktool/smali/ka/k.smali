.class public Lka/k;
.super Lka/s;
.source "SourceFile"


# instance fields
.field public final a:Lsb/k;


# direct methods
.method public constructor <init>(Lsb/k;)V
    .locals 0

    invoke-direct {p0}, Lka/s;-><init>()V

    iput-object p1, p0, Lka/k;->a:Lsb/k;

    return-void
.end method


# virtual methods
.method public A1(Lcom/google/android/gms/games/internal/v2/appshortcuts/zzg;)V
    .locals 1

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, p1}, Lka/k;->J0(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final J0(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lka/k;->a:Lsb/k;

    invoke-static {p1}, Ln9/a;->a(Lcom/google/android/gms/common/api/Status;)Lk9/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public g(Landroid/content/Intent;)V
    .locals 1

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, p1}, Lka/k;->J0(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
