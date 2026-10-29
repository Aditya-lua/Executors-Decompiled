.class public final Lva/i0;
.super Ll9/g$a;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lsb/k;

.field public final synthetic b:Lva/k0;


# direct methods
.method public constructor <init>(Lva/k0;Lsb/k;)V
    .locals 0

    iput-object p1, p0, Lva/i0;->b:Lva/k0;

    iput-object p2, p0, Lva/i0;->a:Lsb/k;

    invoke-direct {p0}, Ll9/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final Z0(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lva/i0;->a:Lsb/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lsb/k;->e(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->A3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lva/i0;->b:Lva/k0;

    iget-object p1, p1, Lva/k0;->d:Lva/l0;

    invoke-static {p1}, Lva/l0;->b(Lva/l0;)Lsb/k;

    move-result-object p1

    invoke-virtual {p1, v1}, Lsb/k;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lva/i0;->b:Lva/k0;

    iget-object v0, v0, Lva/k0;->d:Lva/l0;

    invoke-static {v0}, Lva/l0;->b(Lva/l0;)Lsb/k;

    move-result-object v0

    const-string v1, "Indexing error, please try again."

    invoke-static {p1, v1}, Lva/d;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;)Lv8/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsb/k;->b(Ljava/lang/Exception;)V

    :cond_1
    return-void
.end method
