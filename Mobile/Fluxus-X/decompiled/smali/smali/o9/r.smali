.class public Lo9/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo9/r$a;
    }
.end annotation


# static fields
.field public static final a:Lo9/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo9/n0;

    invoke-direct {v0}, Lo9/n0;-><init>()V

    sput-object v0, Lo9/r;->a:Lo9/q0;

    return-void
.end method

.method public static a(Ll9/k;Lo9/r$a;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p0    # Ll9/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lo9/r$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Ll9/p;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Ll9/k<",
            "TR;>;",
            "Lo9/r$a<",
            "TR;TT;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lo9/r;->a:Lo9/q0;

    new-instance v1, Ltb/k;

    invoke-direct {v1}, Ltb/k;-><init>()V

    new-instance v2, Lo9/o0;

    invoke-direct {v2, p0, v1, p1, v0}, Lo9/o0;-><init>(Ll9/k;Ltb/k;Lo9/r$a;Lo9/q0;)V

    invoke-virtual {p0, v2}, Ll9/k;->c(Ll9/k$a;)V

    invoke-virtual {v1}, Ltb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ll9/k;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p0    # Ll9/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Ll9/p;",
            ">(",
            "Ll9/k<",
            "TR;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo9/p0;

    invoke-direct {v0}, Lo9/p0;-><init>()V

    invoke-static {p0, v0}, Lo9/r;->a(Ll9/k;Lo9/r$a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method
