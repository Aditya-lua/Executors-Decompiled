.class public final synthetic Lnb/pc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/tc;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic d:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lnb/tc;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/pc;->a:Lnb/tc;

    iput-object p2, p0, Lnb/pc;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lnb/pc;->c:Lcom/google/android/gms/measurement/internal/zzr;

    iput-object p4, p0, Lnb/pc;->d:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    iget-object v0, p0, Lnb/pc;->a:Lnb/tc;

    iget-object v1, p0, Lnb/pc;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lnb/pc;->c:Lcom/google/android/gms/measurement/internal/zzr;

    iget-object v3, p0, Lnb/pc;->d:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Lnb/tc;->G(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;)V

    return-void
.end method
