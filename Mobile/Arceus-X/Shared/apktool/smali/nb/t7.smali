.class public final Lnb/t7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic b:Lnb/i8;


# direct methods
.method public constructor <init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 0

    iput-object p2, p0, Lnb/t7;->a:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/t7;->b:Lnb/i8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lnb/t7;->b:Lnb/i8;

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v1

    invoke-virtual {v1}, Lnb/me;->E()V

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v0

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/me;->O0()V

    iget-object v1, p0, Lnb/t7;->a:Lcom/google/android/gms/measurement/internal/zzr;

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v2}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnb/me;->P0(Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {v0, v1}, Lnb/me;->Q0(Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void
.end method
