.class public final Lnb/y7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzpl;

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic c:Lnb/i8;


# direct methods
.method public constructor <init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzpl;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 0

    iput-object p2, p0, Lnb/y7;->a:Lcom/google/android/gms/measurement/internal/zzpl;

    iput-object p3, p0, Lnb/y7;->b:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/y7;->c:Lnb/i8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lnb/y7;->c:Lnb/i8;

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v1

    invoke-virtual {v1}, Lnb/me;->E()V

    iget-object v1, p0, Lnb/y7;->a:Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzpl;->zza()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lnb/y7;->b:Lcom/google/android/gms/measurement/internal/zzr;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lnb/me;->d0(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void

    :cond_0
    iget-object v2, p0, Lnb/y7;->b:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lnb/me;->c0(Lcom/google/android/gms/measurement/internal/zzpl;Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void
.end method
