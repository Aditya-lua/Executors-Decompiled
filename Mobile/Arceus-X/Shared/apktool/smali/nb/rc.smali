.class public final synthetic Lnb/rc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/tc;

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/zzaf;


# direct methods
.method public synthetic constructor <init>(Lnb/tc;Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzaf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/rc;->a:Lnb/tc;

    iput-object p2, p0, Lnb/rc;->b:Lcom/google/android/gms/measurement/internal/zzr;

    iput-object p3, p0, Lnb/rc;->c:Lcom/google/android/gms/measurement/internal/zzaf;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lnb/rc;->a:Lnb/tc;

    iget-object v1, p0, Lnb/rc;->b:Lcom/google/android/gms/measurement/internal/zzr;

    iget-object v2, p0, Lnb/rc;->c:Lcom/google/android/gms/measurement/internal/zzaf;

    invoke-virtual {v0, v1, v2}, Lnb/tc;->I(Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzaf;)V

    return-void
.end method
