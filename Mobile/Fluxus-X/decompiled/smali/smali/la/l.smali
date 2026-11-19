.class public final Lla/l;
.super Lla/m;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lla/p;Ltb/k;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p2}, Lla/m;-><init>(Ltb/k;)V

    return-void
.end method


# virtual methods
.method public final g(Landroid/content/Intent;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0x11

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, p1}, Lla/m;->P0(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_0
    iget-object v0, p0, Lla/m;->a:Ltb/k;

    invoke-virtual {v0, p1}, Ltb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
