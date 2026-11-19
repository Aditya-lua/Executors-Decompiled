.class public final Lma/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lma/b;
    .locals 1

    new-instance v0, Lma/b;

    invoke-direct {v0}, Lma/b;-><init>()V

    return-object v0
.end method

.method public static final b(Landroid/app/Activity;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    new-instance v0, Lma/a;

    invoke-direct {v0}, Lma/a;-><init>()V

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/google/android/gms/games/internal/v2/resolution/GamesResolutionActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "pendingIntent"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p1, "resultReceiver"

    invoke-virtual {v1, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {v0}, Lma/a;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method
