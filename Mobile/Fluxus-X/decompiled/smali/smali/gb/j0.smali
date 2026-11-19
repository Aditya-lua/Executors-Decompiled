.class public final synthetic Lgb/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/h;


# instance fields
.field public final synthetic a:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lgb/j0;->a:Z

    return-void
.end method


# virtual methods
.method public final synthetic a(Ll9/g;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    new-instance v1, Lgb/n0;

    iget-boolean v2, p0, Lgb/j0;->a:Z

    invoke-direct {v1, v2}, Lgb/n0;-><init>(Z)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object v0

    const/16 v1, 0x1a25

    invoke-virtual {v0, v1}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object v0

    invoke-virtual {v0}, Lm9/u$a;->a()Lm9/u;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll9/g;->z(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
