.class public final synthetic Lfb/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lfb/u1;

.field public final synthetic b:Lsb/k;


# direct methods
.method public synthetic constructor <init>(Lfb/u1;Lsb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/x;->a:Lfb/u1;

    iput-object p2, p0, Lfb/x;->b:Lsb/k;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lfb/x;->a:Lfb/u1;

    invoke-interface {v0}, Lfb/u1;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tasks/Task;

    new-instance v1, Lfb/z;

    iget-object v2, p0, Lfb/x;->b:Lsb/k;

    invoke-direct {v1, v2}, Lfb/z;-><init>(Lsb/k;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
