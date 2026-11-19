.class public final Lgb/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/google/android/gms/common/api/Status;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/h0;->b:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lgb/h0;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lgb/h0;
    .locals 2

    new-instance v0, Lgb/h0;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->k:Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, v1, p0}, Lgb/h0;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/gms/common/api/Status;)Lgb/h0;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->F3()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lo9/s;->a(Z)V

    new-instance v0, Lgb/h0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lgb/h0;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final c()Z
    .locals 1

    iget-object v0, p0, Lgb/h0;->b:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->F3()Z

    move-result v0

    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgb/h0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lgb/h0;->b:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->B3()Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lgb/h0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lgb/h0;

    iget-object v1, p0, Lgb/h0;->b:Lcom/google/android/gms/common/api/Status;

    iget-object v3, p1, Lgb/h0;->b:Lcom/google/android/gms/common/api/Status;

    invoke-static {v1, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lgb/h0;->a:Ljava/lang/String;

    iget-object p1, p1, Lgb/h0;->a:Ljava/lang/String;

    invoke-static {v1, p1}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lgb/h0;->b:Lcom/google/android/gms/common/api/Status;

    iget-object v1, p0, Lgb/h0;->a:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lo9/q;->d(Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "status"

    iget-object v2, p0, Lgb/h0;->b:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "gameRunToken"

    iget-object v2, p0, Lgb/h0;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-virtual {v0}, Lo9/q$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
