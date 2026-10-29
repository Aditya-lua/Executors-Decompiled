.class public final synthetic Lbe/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lbe/g;

.field public final synthetic b:Lsb/k;


# direct methods
.method public synthetic constructor <init>(Lbe/g;Lsb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/s1;->a:Lbe/g;

    iput-object p2, p0, Lbe/s1;->b:Lsb/k;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lbe/s1;->a:Lbe/g;

    iget-object v1, p0, Lbe/s1;->b:Lsb/k;

    invoke-virtual {v0, v1, p1}, Lbe/g;->t(Lsb/k;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
