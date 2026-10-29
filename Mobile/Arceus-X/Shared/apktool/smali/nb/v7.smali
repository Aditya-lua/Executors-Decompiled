.class public final Lnb/v7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzbg;

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic c:Lnb/i8;


# direct methods
.method public constructor <init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 0

    iput-object p2, p0, Lnb/v7;->a:Lcom/google/android/gms/measurement/internal/zzbg;

    iput-object p3, p0, Lnb/v7;->b:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/v7;->c:Lnb/i8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lnb/v7;->a:Lcom/google/android/gms/measurement/internal/zzbg;

    iget-object v1, p0, Lnb/v7;->b:Lcom/google/android/gms/measurement/internal/zzr;

    iget-object v2, p0, Lnb/v7;->c:Lnb/i8;

    invoke-virtual {v2, v0, v1}, Lnb/i8;->E2(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)Lcom/google/android/gms/measurement/internal/zzbg;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, Lnb/i8;->D2(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void
.end method
