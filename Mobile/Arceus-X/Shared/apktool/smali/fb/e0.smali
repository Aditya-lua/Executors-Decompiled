.class public final synthetic Lfb/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/c;


# instance fields
.field public final synthetic a:Lfb/f0;

.field public final synthetic b:Lcom/google/android/gms/internal/games_v2/zzq;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lfb/f0;Lcom/google/android/gms/internal/games_v2/zzq;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/e0;->a:Lfb/f0;

    iput-object p2, p0, Lfb/e0;->b:Lcom/google/android/gms/internal/games_v2/zzq;

    iput-boolean p3, p0, Lfb/e0;->c:Z

    return-void
.end method


# virtual methods
.method public final synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfb/e0;->a:Lfb/f0;

    iget-object v1, p0, Lfb/e0;->b:Lcom/google/android/gms/internal/games_v2/zzq;

    iget-boolean v2, p0, Lfb/e0;->c:Z

    invoke-virtual {v0, v1, v2, p1}, Lfb/f0;->b(Lcom/google/android/gms/internal/games_v2/zzq;ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
