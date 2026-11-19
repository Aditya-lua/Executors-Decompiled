.class public final Lm9/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Ltb/k;

.field public final synthetic b:Lm9/z;


# direct methods
.method public constructor <init>(Lm9/z;Ltb/k;)V
    .locals 0

    iput-object p1, p0, Lm9/y;->b:Lm9/z;

    iput-object p2, p0, Lm9/y;->a:Ltb/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/tasks/Task;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lm9/y;->b:Lm9/z;

    invoke-static {p1}, Lm9/z;->b(Lm9/z;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lm9/y;->a:Ltb/k;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
