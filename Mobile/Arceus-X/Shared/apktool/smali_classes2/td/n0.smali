.class public final Ltd/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lee/t0;

.field public final b:Ljava/lang/String;

.field public final c:Lsb/k;

.field public final d:Ltd/t;

.field public final e:Ltd/d1;

.field public final f:Lee/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lee/t0;Ltd/t;Ltd/d1;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lsb/k;

    invoke-direct {v0}, Lsb/k;-><init>()V

    iput-object v0, p0, Ltd/n0;->c:Lsb/k;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ltd/n0;->b:Ljava/lang/String;

    iput-object p2, p0, Ltd/n0;->a:Lee/t0;

    iput-object p3, p0, Ltd/n0;->d:Ltd/t;

    iput-object p4, p0, Ltd/n0;->e:Ltd/d1;

    new-instance v2, Lee/f;

    sget-object v6, Ltd/o0;->a:Landroid/content/Intent;

    new-instance v7, Ltd/e0;

    invoke-direct {v7}, Ltd/e0;-><init>()V

    const-string v5, "ExpressIntegrityService"

    const/4 v8, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v2 .. v8}, Lee/f;-><init>(Landroid/content/Context;Lee/t0;Ljava/lang/String;Landroid/content/Intent;Lee/a1;Lee/z0;)V

    iput-object v2, p0, Ltd/n0;->f:Lee/f;

    new-instance p1, Ltd/f0;

    invoke-direct {p1, p0, v0, v3}, Ltd/f0;-><init>(Ltd/n0;Lsb/k;Landroid/content/Context;)V

    invoke-virtual {v2}, Lee/f;->c()Landroid/os/Handler;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static bridge synthetic a(Ltd/n0;Ltd/c$d;JJI)Landroid/os/Bundle;
    .locals 1

    new-instance p6, Landroid/os/Bundle;

    invoke-direct {p6}, Landroid/os/Bundle;-><init>()V

    const-string v0, "package.name"

    iget-object p0, p0, Ltd/n0;->b:Ljava/lang/String;

    invoke-virtual {p6, v0, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "cloud.prj"

    invoke-virtual {p6, p0, p2, p3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string p0, "nonce"

    invoke-virtual {p1}, Ltd/c$d;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p6, p0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "warm.up.sid"

    invoke-virtual {p6, p0, p4, p5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string p0, "playcore.integrity.version.major"

    const/4 p2, 0x1

    invoke-virtual {p6, p0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "playcore.integrity.version.minor"

    const/4 p2, 0x4

    invoke-virtual {p6, p0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "playcore.integrity.version.patch"

    const/4 p2, 0x0

    invoke-virtual {p6, p0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "webview.request.mode"

    invoke-virtual {p6, p0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ltd/c$d;->c()Ljava/util/Set;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p1, "request.verdict.opt.out"

    invoke-virtual {p6, p1, p0}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const/4 p1, 0x5

    invoke-static {p1, p0}, Lee/g0;->b(ILjava/util/List;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p0}, Lee/g0;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p0, "event_timestamps"

    invoke-virtual {p6, p0, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object p6
.end method

.method public static bridge synthetic b(Ltd/n0;JI)Landroid/os/Bundle;
    .locals 1

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    const-string v0, "package.name"

    iget-object p0, p0, Ltd/n0;->b:Ljava/lang/String;

    invoke-virtual {p3, v0, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "cloud.prj"

    invoke-virtual {p3, p0, p1, p2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string p0, "playcore.integrity.version.major"

    const/4 p1, 0x1

    invoke-virtual {p3, p0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "playcore.integrity.version.minor"

    const/4 p1, 0x4

    invoke-virtual {p3, p0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "playcore.integrity.version.patch"

    const/4 p2, 0x0

    invoke-virtual {p3, p0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "webview.request.mode"

    invoke-virtual {p3, p0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1, p0}, Lee/g0;->b(ILjava/util/List;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p0}, Lee/g0;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p0, "event_timestamps"

    invoke-virtual {p3, p0, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object p3
.end method

.method public static bridge synthetic e(Ltd/n0;)Lsb/k;
    .locals 0

    iget-object p0, p0, Ltd/n0;->c:Lsb/k;

    return-object p0
.end method

.method public static bridge synthetic f(Ltd/n0;)Ltd/d1;
    .locals 0

    iget-object p0, p0, Ltd/n0;->e:Ltd/d1;

    return-object p0
.end method

.method public static bridge synthetic g(Ltd/n0;)Lee/t0;
    .locals 0

    iget-object p0, p0, Ltd/n0;->a:Lee/t0;

    return-object p0
.end method

.method public static bridge synthetic h(Ltd/n0;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ltd/n0;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic i(Ltd/n0;I)Z
    .locals 0

    iget-object p1, p0, Ltd/n0;->c:Lsb/k;

    invoke-virtual {p1}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Ltd/n0;->c:Lsb/k;

    invoke-virtual {p0}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const p1, 0x4f8e360

    if-ge p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic j(Ltd/n0;)Z
    .locals 1

    iget-object v0, p0, Ltd/n0;->c:Lsb/k;

    invoke-virtual {v0}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Ltd/n0;->c:Lsb/k;

    invoke-virtual {p0}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final c(Ltd/c$d;JJI)Lcom/google/android/gms/tasks/Task;
    .locals 10

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Ltd/n0;->a:Lee/t0;

    const-string v3, "requestExpressIntegrityToken(%s)"

    invoke-virtual {v2, v3, v0}, Lee/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v2, Lsb/k;

    invoke-direct {v2}, Lsb/k;-><init>()V

    new-instance v0, Ltd/h0;

    const/4 v3, 0x0

    move-object v9, v2

    move-object v1, p0

    move-object v4, p1

    move-wide v5, p2

    move-wide v7, p4

    invoke-direct/range {v0 .. v9}, Ltd/h0;-><init>(Ltd/n0;Lsb/k;ILtd/c$d;JJLsb/k;)V

    iget-object v3, p0, Ltd/n0;->f:Lee/f;

    invoke-virtual {v3, v0, v2}, Lee/f;->t(Lee/u0;Lsb/k;)V

    invoke-virtual {v2}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final d(JI)Lcom/google/android/gms/tasks/Task;
    .locals 9

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    iget-object v0, p0, Ltd/n0;->a:Lee/t0;

    const-string v1, "warmUpIntegrityToken(%s)"

    invoke-virtual {v0, v1, p3}, Lee/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v4, Lsb/k;

    invoke-direct {v4}, Lsb/k;-><init>()V

    new-instance v2, Ltd/g0;

    const/4 v5, 0x0

    move-object v8, v4

    move-object v3, p0

    move-wide v6, p1

    invoke-direct/range {v2 .. v8}, Ltd/g0;-><init>(Ltd/n0;Lsb/k;IJLsb/k;)V

    iget-object p1, v3, Ltd/n0;->f:Lee/f;

    invoke-virtual {p1, v2, v4}, Lee/f;->t(Lee/u0;Lsb/k;)V

    invoke-virtual {v4}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
