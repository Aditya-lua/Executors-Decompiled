.class public final Lnb/u7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic b:Lnb/i8;


# direct methods
.method public constructor <init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 0

    iput-object p2, p0, Lnb/u7;->a:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/u7;->b:Lnb/i8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lnb/u7;->b:Lnb/i8;

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v1

    invoke-virtual {v1}, Lnb/me;->E()V

    iget-object v1, p0, Lnb/u7;->a:Lcom/google/android/gms/measurement/internal/zzr;

    new-instance v2, Lcom/google/android/gms/measurement/internal/zzao;

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v0

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnb/me;->S0(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/google/android/gms/measurement/internal/zzao;-><init>(Landroid/os/Bundle;)V

    return-object v2
.end method
