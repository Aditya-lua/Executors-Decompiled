.class public final Lva/c;
.super Lv8/h;
.source "SourceFile"


# instance fields
.field public final b:Lva/t0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Lv8/h;-><init>()V

    new-instance v0, Lva/t0;

    invoke-direct {v0, p1}, Lva/t0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lva/c;->b:Lva/t0;

    return-void
.end method


# virtual methods
.method public final a(Lv8/a;)Lcom/google/android/gms/tasks/Task;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv8/a;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lva/c;->c(Lv8/a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lv8/a;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/appindex/zzk;

    if-eqz p1, :cond_1

    instance-of v1, p1, Lcom/google/android/gms/internal/appindex/zzk;

    if-nez v1, :cond_0

    new-instance p1, Lv8/d;

    const-string v0, "Custom Action objects are not allowed. Please use the \'Actions\' or \'ActionBuilder\' class for creating Action objects."

    invoke-direct {p1, v0}, Lv8/d;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v1, 0x0

    check-cast p1, Lcom/google/android/gms/internal/appindex/zzk;

    aput-object p1, v0, v1

    :cond_1
    iget-object p1, p0, Lva/c;->b:Lva/t0;

    new-instance v1, Lva/r0;

    invoke-direct {v1, p0, v0}, Lva/r0;-><init>(Lva/c;[Lcom/google/android/gms/internal/appindex/zzk;)V

    invoke-virtual {p1, v1}, Lk9/e;->D(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
