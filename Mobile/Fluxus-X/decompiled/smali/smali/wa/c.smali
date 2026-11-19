.class public final Lwa/c;
.super Lw8/h;
.source "SourceFile"


# instance fields
.field public final b:Lwa/u0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Lw8/h;-><init>()V

    new-instance v0, Lwa/u0;

    invoke-direct {v0, p1}, Lwa/u0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lwa/c;->b:Lwa/u0;

    return-void
.end method


# virtual methods
.method public final a(Lw8/a;)Lcom/google/android/gms/tasks/Task;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw8/a;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lwa/c;->c(Lw8/a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lw8/a;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Lwa/f0;

    if-eqz p1, :cond_1

    instance-of v1, p1, Lwa/f0;

    if-nez v1, :cond_0

    new-instance p1, Lw8/d;

    const-string v0, "Custom Action objects are not allowed. Please use the \'Actions\' or \'ActionBuilder\' class for creating Action objects."

    invoke-direct {p1, v0}, Lw8/d;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ltb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v1, 0x0

    check-cast p1, Lwa/f0;

    aput-object p1, v0, v1

    :cond_1
    iget-object p1, p0, Lwa/c;->b:Lwa/u0;

    new-instance v1, Lwa/s0;

    invoke-direct {v1, p0, v0}, Lwa/s0;-><init>(Lwa/c;[Lwa/f0;)V

    invoke-virtual {p1, v1}, Ll9/g;->D(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
