.class public final Lka/i;
.super Lka/k;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lka/n;Lsb/k;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p2}, Lka/k;-><init>(Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final A1(Lcom/google/android/gms/games/internal/v2/appshortcuts/zzg;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0x11

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, p1}, Lka/k;->J0(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_0
    iget-object v0, p0, Lka/k;->a:Lsb/k;

    invoke-virtual {v0, p1}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
