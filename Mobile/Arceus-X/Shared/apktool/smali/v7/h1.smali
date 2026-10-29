.class public final synthetic Lv7/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lv7/i1;->a:I

    return-void
.end method

.method public static a(Ljava/lang/Exception;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/a0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget v1, Lcom/google/android/gms/internal/play_billing/m0;->a:I

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x28

    if-le v1, v2, :cond_1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_1
    return-object p0

    :goto_0
    const-string v1, "BillingLogger"

    const-string v2, "Unable to get truncated exception info"

    invoke-static {v1, v2, p0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/l7;
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/u7;->C()Lcom/google/android/gms/internal/play_billing/q7;

    move-result-object v0

    invoke-virtual {p2}, Lcom/android/billingclient/api/d;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/q7;->t(I)Lcom/google/android/gms/internal/play_billing/q7;

    invoke-virtual {p2}, Lcom/android/billingclient/api/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/q7;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/q7;

    invoke-virtual {p2}, Lcom/android/billingclient/api/d;->b()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Lcom/android/billingclient/api/d;->b()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/q7;->r(I)Lcom/google/android/gms/internal/play_billing/q7;

    :cond_0
    if-eqz p0, :cond_1

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/play_billing/q7;->s(Lcom/google/android/gms/internal/play_billing/s7;)Lcom/google/android/gms/internal/play_billing/q7;

    :cond_1
    if-eqz p3, :cond_2

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/play_billing/q7;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/q7;

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/l7;->E()Lcom/google/android/gms/internal/play_billing/j7;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/j7;->p(Lcom/google/android/gms/internal/play_billing/q7;)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/j7;->t(I)Lcom/google/android/gms/internal/play_billing/j7;

    sget-object p1, Lcom/google/android/gms/internal/play_billing/z7;->b:Lcom/google/android/gms/internal/play_billing/z7;

    invoke-virtual {p4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0, p4}, Lcom/google/android/gms/internal/play_billing/j7;->o(Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/j7;

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/l7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    const-string p1, "BillingLogger"

    const-string p2, "Unable to create logging payload"

    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(ILcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/p7;
    .locals 1

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/p7;->C()Lcom/google/android/gms/internal/play_billing/n7;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/play_billing/n7;->s(I)Lcom/google/android/gms/internal/play_billing/n7;

    sget-object p0, Lcom/google/android/gms/internal/play_billing/z7;->b:Lcom/google/android/gms/internal/play_billing/z7;

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/n7;->o(Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/n7;

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/p7;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string p1, "BillingLogger"

    const-string v0, "Unable to create logging payload"

    invoke-static {p1, v0, p0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method
