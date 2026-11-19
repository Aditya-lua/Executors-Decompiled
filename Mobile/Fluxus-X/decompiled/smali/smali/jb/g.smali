.class public final synthetic Ljb/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Ljb/o;

.field public final synthetic b:Ltb/k;


# direct methods
.method public synthetic constructor <init>(Ljb/o;Ltb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/g;->a:Ljb/o;

    iput-object p2, p0, Ljb/g;->b:Ltb/k;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Ljb/g;->a:Ljb/o;

    iget-object v1, p0, Ljb/g;->b:Ltb/k;

    invoke-static {v0, v1, p1}, Ljb/o;->k(Ljb/o;Ltb/k;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
