.class public Ln9/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln9/l$a;
    }
.end annotation


# static fields
.field public static final a:Ln9/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln9/f0;

    invoke-direct {v0}, Ln9/f0;-><init>()V

    sput-object v0, Ln9/l;->a:Ln9/i0;

    return-void
.end method

.method public static a(Lk9/i;Ln9/l$a;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p0    # Lk9/i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ln9/l$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lk9/n;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lk9/i<",
            "TR;>;",
            "Ln9/l$a<",
            "TR;TT;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Ln9/l;->a:Ln9/i0;

    new-instance v1, Lsb/k;

    invoke-direct {v1}, Lsb/k;-><init>()V

    new-instance v2, Ln9/g0;

    invoke-direct {v2, p0, v1, p1, v0}, Ln9/g0;-><init>(Lk9/i;Lsb/k;Ln9/l$a;Ln9/i0;)V

    invoke-virtual {p0, v2}, Lk9/i;->c(Lk9/i$a;)V

    invoke-virtual {v1}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lk9/i;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p0    # Lk9/i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lk9/n;",
            ">(",
            "Lk9/i<",
            "TR;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ln9/h0;

    invoke-direct {v0}, Ln9/h0;-><init>()V

    invoke-static {p0, v0}, Ln9/l;->a(Lk9/i;Ln9/l$a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method
