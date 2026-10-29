.class public final Lnb/s7;
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

    iput-object p2, p0, Lnb/s7;->a:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/s7;->b:Lnb/i8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnb/s7;->b:Lnb/i8;

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v1

    invoke-virtual {v1}, Lnb/me;->E()V

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v0

    iget-object v1, p0, Lnb/s7;->a:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-virtual {v0, v1}, Lnb/me;->b0(Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void
.end method
