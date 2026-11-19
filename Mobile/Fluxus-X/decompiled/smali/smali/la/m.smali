.class public Lla/m;
.super Lla/v;
.source "SourceFile"


# instance fields
.field public final a:Ltb/k;


# direct methods
.method public constructor <init>(Ltb/k;)V
    .locals 0

    invoke-direct {p0}, Lla/v;-><init>()V

    iput-object p1, p0, Lla/m;->a:Ltb/k;

    return-void
.end method


# virtual methods
.method public E(Lla/f;)V
    .locals 1

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, p1}, Lla/m;->P0(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final P0(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lla/m;->a:Ltb/k;

    invoke-static {p1}, Lo9/b;->a(Lcom/google/android/gms/common/api/Status;)Ll9/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public g(Landroid/content/Intent;)V
    .locals 1

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, p1}, Lla/m;->P0(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
