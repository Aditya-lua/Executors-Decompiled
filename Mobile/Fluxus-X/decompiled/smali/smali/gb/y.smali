.class public final synthetic Lgb/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lgb/v1;

.field public final synthetic b:Ltb/k;


# direct methods
.method public synthetic constructor <init>(Lgb/v1;Ltb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/y;->a:Lgb/v1;

    iput-object p2, p0, Lgb/y;->b:Ltb/k;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lgb/y;->a:Lgb/v1;

    invoke-interface {v0}, Lgb/v1;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tasks/Task;

    new-instance v1, Lgb/a0;

    iget-object v2, p0, Lgb/y;->b:Ltb/k;

    invoke-direct {v1, v2}, Lgb/a0;-><init>(Ltb/k;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
