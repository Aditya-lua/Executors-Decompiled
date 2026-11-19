.class public final synthetic Lzd/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lzd/t;

.field public final synthetic b:Ltb/k;


# direct methods
.method public synthetic constructor <init>(Lzd/t;Ltb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/l;->a:Lzd/t;

    iput-object p2, p0, Lzd/l;->b:Ltb/k;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lzd/l;->a:Lzd/t;

    iget-object v1, p0, Lzd/l;->b:Ltb/k;

    invoke-virtual {v0, v1, p1}, Lzd/t;->t(Ltb/k;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
