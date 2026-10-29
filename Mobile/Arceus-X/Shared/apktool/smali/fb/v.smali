.class public final synthetic Lfb/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lfb/b0;

.field public final synthetic b:Lsb/k;

.field public final synthetic c:Lcom/google/android/gms/internal/games_v2/zzq;


# direct methods
.method public synthetic constructor <init>(Lfb/b0;Lsb/k;Lcom/google/android/gms/internal/games_v2/zzq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/v;->a:Lfb/b0;

    iput-object p2, p0, Lfb/v;->b:Lsb/k;

    iput-object p3, p0, Lfb/v;->c:Lcom/google/android/gms/internal/games_v2/zzq;

    return-void
.end method


# virtual methods
.method public final synthetic onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object v0, p0, Lfb/v;->a:Lfb/b0;

    iget-object v1, p0, Lfb/v;->b:Lsb/k;

    iget-object v2, p0, Lfb/v;->c:Lcom/google/android/gms/internal/games_v2/zzq;

    invoke-virtual {v0, v1, v2, p1}, Lfb/b0;->d(Lsb/k;Lcom/google/android/gms/internal/games_v2/zzq;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
