.class public final synthetic Lgb/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lgb/u;


# direct methods
.method public synthetic constructor <init>(Lgb/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/t;->a:Lgb/u;

    return-void
.end method


# virtual methods
.method public final synthetic onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Lgb/t;->a:Lgb/u;

    invoke-virtual {v0, p1}, Lgb/u;->c(Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
