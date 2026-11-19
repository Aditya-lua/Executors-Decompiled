.class public final synthetic Lgb/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lgb/c0;

.field public final synthetic b:Ltb/k;

.field public final synthetic c:Lgb/d2;


# direct methods
.method public synthetic constructor <init>(Lgb/c0;Ltb/k;Lgb/d2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/w;->a:Lgb/c0;

    iput-object p2, p0, Lgb/w;->b:Ltb/k;

    iput-object p3, p0, Lgb/w;->c:Lgb/d2;

    return-void
.end method


# virtual methods
.method public final synthetic onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object v0, p0, Lgb/w;->a:Lgb/c0;

    iget-object v1, p0, Lgb/w;->b:Ltb/k;

    iget-object v2, p0, Lgb/w;->c:Lgb/d2;

    invoke-virtual {v0, v1, v2, p1}, Lgb/c0;->d(Ltb/k;Lgb/d2;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
