.class public Lvi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyk/a;


# static fields
.field public static a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lvi/b;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lvi/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    :try_start_0
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p2, "rbx.jni"

    const-string v0, "sendSessionReport() could not parse placeId"

    invoke-static {p2, v0}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v0, -0x1

    :goto_0
    new-instance p2, Lvi/b$a;

    invoke-direct {p2, p0}, Lvi/b$a;-><init>(Lvi/b;)V

    invoke-static {}, Lcl/g;->d()Lcl/d;

    move-result-object v2

    invoke-interface {v2}, Lcl/d;->a()Lcom/roblox/platform/http/interfaces/MetricsInterface;

    move-result-object v2

    invoke-interface {v2, v0, v1, p1}, Lcom/roblox/platform/http/interfaces/MetricsInterface;->postSessionReport(JLjava/lang/String;)Lsw/d;

    move-result-object p1

    invoke-interface {p1, p2}, Lsw/d;->L(Lsw/f;)V

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 2

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v0

    invoke-virtual {v0}, Ldj/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "2.747.1486"

    return-object v0
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    :try_start_0
    invoke-static {p3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
