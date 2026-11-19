.class public final synthetic Lgb/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/c;


# instance fields
.field public final synthetic a:Lgb/g0;

.field public final synthetic b:Lgb/d2;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lgb/g0;Lgb/d2;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/f0;->a:Lgb/g0;

    iput-object p2, p0, Lgb/f0;->b:Lgb/d2;

    iput-boolean p3, p0, Lgb/f0;->c:Z

    return-void
.end method


# virtual methods
.method public final synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lgb/f0;->a:Lgb/g0;

    iget-object v1, p0, Lgb/f0;->b:Lgb/d2;

    iget-boolean v2, p0, Lgb/f0;->c:Z

    invoke-virtual {v0, v1, v2, p1}, Lgb/g0;->b(Lgb/d2;ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
