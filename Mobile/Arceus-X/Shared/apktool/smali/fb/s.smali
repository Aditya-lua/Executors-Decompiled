.class public final synthetic Lfb/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lfb/t;


# direct methods
.method public synthetic constructor <init>(Lfb/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/s;->a:Lfb/t;

    return-void
.end method


# virtual methods
.method public final synthetic onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Lfb/s;->a:Lfb/t;

    invoke-virtual {v0, p1}, Lfb/t;->c(Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
