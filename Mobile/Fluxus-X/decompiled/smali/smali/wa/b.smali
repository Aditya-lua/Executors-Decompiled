.class public abstract Lwa/b;
.super Lm9/u;
.source "SourceFile"

# interfaces
.implements Lm9/d;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field public d:Ltb/k;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0x70e6

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lm9/u;-><init>([Lk9/d;ZI)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lwa/b;->i(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->F3()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Failed result must not be success."

    invoke-static {v0, v1}, Lo9/s;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->D3()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    iget-object v1, p0, Lwa/b;->d:Ltb/k;

    invoke-static {p1, v0}, Lwa/d;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;)Lw8/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Ltb/k;->b(Ljava/lang/Exception;)V

    return-void
.end method

.method public final bridge synthetic d(Ll9/a$b;Ltb/k;)V
    .locals 0

    check-cast p1, Lwa/e0;

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lwa/a0;

    iput-object p2, p0, Lwa/b;->d:Ltb/k;

    invoke-virtual {p0, p1}, Lwa/b;->h(Lwa/a0;)V

    return-void
.end method

.method public abstract h(Lwa/a0;)V
.end method

.method public final i(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->F3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lwa/b;->d:Ltb/k;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ltb/k;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lwa/b;->d:Ltb/k;

    const-string v1, "User Action indexing error, please try again."

    invoke-static {p1, v1}, Lwa/d;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;)Lw8/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltb/k;->b(Ljava/lang/Exception;)V

    return-void
.end method
