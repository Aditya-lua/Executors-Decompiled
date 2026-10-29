.class public final synthetic Lfb/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lfb/b0;

.field public final synthetic b:Lsb/k;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lfb/b0;Lsb/k;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/w;->a:Lfb/b0;

    iput-object p2, p0, Lfb/w;->b:Lsb/k;

    iput p3, p0, Lfb/w;->c:I

    return-void
.end method


# virtual methods
.method public final synthetic onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object v0, p0, Lfb/w;->a:Lfb/b0;

    iget-object v1, p0, Lfb/w;->b:Lsb/k;

    iget v2, p0, Lfb/w;->c:I

    invoke-virtual {v0, v1, v2, p1}, Lfb/b0;->e(Lsb/k;ILcom/google/android/gms/tasks/Task;)V

    return-void
.end method
