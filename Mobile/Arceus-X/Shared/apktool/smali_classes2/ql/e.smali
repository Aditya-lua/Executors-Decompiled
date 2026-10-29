.class public Lql/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, La9/a;->a(Landroid/content/Context;)La9/b;

    move-result-object p1

    invoke-virtual {p1}, La9/b;->P()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lql/e$a;

    invoke-direct {v0, p0, p2}, Lql/e$a;-><init>(Lql/e;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->g(Lsb/g;)Lcom/google/android/gms/tasks/Task;

    new-instance v0, Lql/e$b;

    invoke-direct {v0, p0, p2}, Lql/e$b;-><init>(Lql/e;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->e(Lsb/f;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
