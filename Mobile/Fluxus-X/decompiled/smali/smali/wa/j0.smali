.class public final Lwa/j0;
.super Lm9/g$a;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ltb/k;

.field public final synthetic b:Lwa/l0;


# direct methods
.method public constructor <init>(Lwa/l0;Ltb/k;)V
    .locals 0

    iput-object p1, p0, Lwa/j0;->b:Lwa/l0;

    iput-object p2, p0, Lwa/j0;->a:Ltb/k;

    invoke-direct {p0}, Lm9/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final j1(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lwa/j0;->a:Ltb/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ltb/k;->e(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->F3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lwa/j0;->b:Lwa/l0;

    iget-object p1, p1, Lwa/l0;->d:Lwa/m0;

    invoke-static {p1}, Lwa/m0;->b(Lwa/m0;)Ltb/k;

    move-result-object p1

    invoke-virtual {p1, v1}, Ltb/k;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lwa/j0;->b:Lwa/l0;

    iget-object v0, v0, Lwa/l0;->d:Lwa/m0;

    invoke-static {v0}, Lwa/m0;->b(Lwa/m0;)Ltb/k;

    move-result-object v0

    const-string v1, "Indexing error, please try again."

    invoke-static {p1, v1}, Lwa/d;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;)Lw8/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltb/k;->b(Ljava/lang/Exception;)V

    :cond_1
    return-void
.end method
