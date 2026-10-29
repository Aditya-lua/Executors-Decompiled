.class public final Ltd/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lee/t0;

.field public final b:Ljava/lang/String;

.field public final c:Landroid/content/Context;

.field public final d:Ltd/t;

.field public final e:Ltd/d1;

.field public final f:Lee/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lee/t0;Ltd/t;Ltd/d1;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltd/m;->b:Ljava/lang/String;

    iput-object p2, p0, Ltd/m;->a:Lee/t0;

    iput-object p3, p0, Ltd/m;->d:Ltd/t;

    iput-object p4, p0, Ltd/m;->e:Ltd/d1;

    iput-object p1, p0, Ltd/m;->c:Landroid/content/Context;

    invoke-static {p1}, Lee/j;->b(Landroid/content/Context;)Z

    move-result p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string p3, "Phonesky is not installed."

    invoke-virtual {p2, p3, p1}, Lee/t0;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    const/4 p1, 0x0

    iput-object p1, p0, Ltd/m;->f:Lee/f;

    return-void

    :cond_0
    new-instance v0, Lee/f;

    sget-object v4, Ltd/n;->a:Landroid/content/Intent;

    new-instance v5, Ltd/i;

    invoke-direct {v5}, Ltd/i;-><init>()V

    const-string v3, "IntegrityService"

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lee/f;-><init>(Landroid/content/Context;Lee/t0;Ljava/lang/String;Landroid/content/Intent;Lee/a1;Lee/z0;)V

    iput-object v0, p0, Ltd/m;->f:Lee/f;

    return-void
.end method

.method public static bridge synthetic a(Ltd/m;[BLjava/lang/Long;Landroid/os/Parcelable;)Landroid/os/Bundle;
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "package.name"

    iget-object p0, p0, Ltd/m;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "nonce"

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    const-string p0, "playcore.integrity.version.major"

    const/4 p1, 0x1

    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "playcore.integrity.version.minor"

    const/4 p1, 0x4

    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "playcore.integrity.version.patch"

    const/4 p1, 0x0

    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    if-eqz p2, :cond_0

    const-string p0, "cloud.prj"

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {v0, p0, p1, p2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    if-eqz p3, :cond_1

    const-string p0, "network"

    invoke-virtual {v0, p0, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const/4 p1, 0x3

    invoke-static {p1, p0}, Lee/g0;->b(ILjava/util/List;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p0}, Lee/g0;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p0, "event_timestamps"

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public static bridge synthetic c(Ltd/m;)Ltd/d1;
    .locals 0

    iget-object p0, p0, Ltd/m;->e:Ltd/d1;

    return-object p0
.end method

.method public static bridge synthetic d(Ltd/m;)Lee/t0;
    .locals 0

    iget-object p0, p0, Ltd/m;->a:Lee/t0;

    return-object p0
.end method

.method public static bridge synthetic e(Ltd/m;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ltd/m;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final b(Lcom/google/android/play/core/integrity/IntegrityTokenRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 10

    iget-object v0, p0, Ltd/m;->f:Lee/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ltd/m;->c:Landroid/content/Context;

    invoke-static {v0}, Lee/j;->a(Landroid/content/Context;)I

    move-result v0

    const v2, 0x4e904e0

    if-lt v0, v2, :cond_1

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/play/core/integrity/IntegrityTokenRequest;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Lcom/google/android/play/core/integrity/IntegrityTokenRequest;->a()Ljava/lang/Long;

    move-result-object v6

    instance-of v0, p1, Ltd/q;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ltd/q;

    :cond_0
    iget-object v0, p0, Ltd/m;->a:Lee/t0;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "requestIntegrityToken(%s)"

    invoke-virtual {v0, v2, v1}, Lee/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v4, Lsb/k;

    invoke-direct {v4}, Lsb/k;-><init>()V

    iget-object v0, p0, Ltd/m;->f:Lee/f;

    new-instance v2, Ltd/j;

    const/4 v7, 0x0

    move-object v8, v4

    move-object v3, p0

    move-object v9, p1

    invoke-direct/range {v2 .. v9}, Ltd/j;-><init>(Ltd/m;Lsb/k;[BLjava/lang/Long;Landroid/os/Parcelable;Lsb/k;Lcom/google/android/play/core/integrity/IntegrityTokenRequest;)V

    invoke-virtual {v0, v2, v4}, Lee/f;->t(Lee/u0;Lsb/k;)V

    invoke-virtual {v4}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    new-instance v0, Ltd/a;

    const/16 v1, -0xd

    invoke-direct {v0, v1, p1}, Ltd/a;-><init>(ILjava/lang/Throwable;)V

    invoke-static {v0}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ltd/a;

    const/16 v0, -0xe

    invoke-direct {p1, v0, v1}, Ltd/a;-><init>(ILjava/lang/Throwable;)V

    invoke-static {p1}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ltd/a;

    const/4 v0, -0x2

    invoke-direct {p1, v0, v1}, Ltd/a;-><init>(ILjava/lang/Throwable;)V

    invoke-static {p1}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
