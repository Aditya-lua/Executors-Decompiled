.class public final synthetic Lde/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lde/g;

.field public final synthetic b:Ltb/k;


# direct methods
.method public synthetic constructor <init>(Lde/g;Ltb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/s1;->a:Lde/g;

    iput-object p2, p0, Lde/s1;->b:Ltb/k;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lde/s1;->a:Lde/g;

    iget-object v1, p0, Lde/s1;->b:Ltb/k;

    invoke-virtual {v0, v1, p1}, Lde/g;->t(Ltb/k;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
