.class public final synthetic Lee/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lee/f;

.field public final synthetic b:Lsb/k;


# direct methods
.method public synthetic constructor <init>(Lee/f;Lsb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lee/w0;->a:Lee/f;

    iput-object p2, p0, Lee/w0;->b:Lsb/k;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lee/w0;->a:Lee/f;

    iget-object v1, p0, Lee/w0;->b:Lsb/k;

    invoke-virtual {v0, v1, p1}, Lee/f;->u(Lsb/k;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
