.class public final synthetic Lfb/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lsb/k;


# direct methods
.method public synthetic constructor <init>(Lsb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/y;->a:Lsb/k;

    return-void
.end method


# virtual methods
.method public final synthetic onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lfb/y;->a:Lsb/k;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lda/c;->b:Lda/c;

    invoke-virtual {v0, p1}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void

    :cond_1
    :goto_0
    sget-object p1, Lda/c;->c:Lda/c;

    invoke-virtual {v0, p1}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
