.class public final synthetic Lnb/oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/qa;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Lnb/qa;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/oa;->a:Lnb/qa;

    iput-object p2, p0, Lnb/oa;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lnb/oa;->a:Lnb/qa;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->J()Lnb/tc;

    move-result-object v0

    sget-object v1, Lnb/za;->e:Lnb/za;

    filled-new-array {v1}, [Lnb/za;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/zzoo;->a([Lnb/za;)Lcom/google/android/gms/measurement/internal/zzoo;

    move-result-object v1

    iget-object v2, p0, Lnb/oa;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v2, v1}, Lnb/tc;->j0(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzoo;)V

    return-void
.end method
