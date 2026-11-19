.class public final synthetic Lge/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lge/f;

.field public final synthetic b:Ltb/k;


# direct methods
.method public synthetic constructor <init>(Lge/f;Ltb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lge/w0;->a:Lge/f;

    iput-object p2, p0, Lge/w0;->b:Ltb/k;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lge/w0;->a:Lge/f;

    iget-object v1, p0, Lge/w0;->b:Ltb/k;

    invoke-virtual {v0, v1, p1}, Lge/f;->u(Ltb/k;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
