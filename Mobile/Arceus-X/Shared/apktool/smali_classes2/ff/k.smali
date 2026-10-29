.class public final Lff/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lu9/o;->a(Ljava/lang/String;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "ApplicationId must be set."

    invoke-static {v0, v1}, Ln9/m;->q(ZLjava/lang/Object;)V

    iput-object p1, p0, Lff/k;->b:Ljava/lang/String;

    iput-object p2, p0, Lff/k;->a:Ljava/lang/String;

    iput-object p3, p0, Lff/k;->c:Ljava/lang/String;

    iput-object p4, p0, Lff/k;->d:Ljava/lang/String;

    iput-object p5, p0, Lff/k;->e:Ljava/lang/String;

    iput-object p6, p0, Lff/k;->f:Ljava/lang/String;

    iput-object p7, p0, Lff/k;->g:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lff/k;
    .locals 9
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ln9/o;

    invoke-direct {v0, p0}, Ln9/o;-><init>(Landroid/content/Context;)V

    const-string p0, "google_app_id"

    invoke-virtual {v0, p0}, Ln9/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v1, Lff/k;

    const-string p0, "google_api_key"

    invoke-virtual {v0, p0}, Ln9/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string p0, "firebase_database_url"

    invoke-virtual {v0, p0}, Ln9/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string p0, "ga_trackingId"

    invoke-virtual {v0, p0}, Ln9/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string p0, "gcm_defaultSenderId"

    invoke-virtual {v0, p0}, Ln9/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string p0, "google_storage_bucket"

    invoke-virtual {v0, p0}, Ln9/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string p0, "project_id"

    invoke-virtual {v0, p0}, Ln9/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v1 .. v8}, Lff/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lff/k;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lff/k;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lff/k;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lff/k;->g:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lff/k;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lff/k;

    iget-object v0, p0, Lff/k;->b:Ljava/lang/String;

    iget-object v2, p1, Lff/k;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lff/k;->a:Ljava/lang/String;

    iget-object v2, p1, Lff/k;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lff/k;->c:Ljava/lang/String;

    iget-object v2, p1, Lff/k;->c:Ljava/lang/String;

    invoke-static {v0, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lff/k;->d:Ljava/lang/String;

    iget-object v2, p1, Lff/k;->d:Ljava/lang/String;

    invoke-static {v0, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lff/k;->e:Ljava/lang/String;

    iget-object v2, p1, Lff/k;->e:Ljava/lang/String;

    invoke-static {v0, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lff/k;->f:Ljava/lang/String;

    iget-object v2, p1, Lff/k;->f:Ljava/lang/String;

    invoke-static {v0, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lff/k;->g:Ljava/lang/String;

    iget-object p1, p1, Lff/k;->g:Ljava/lang/String;

    invoke-static {v0, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 7

    iget-object v0, p0, Lff/k;->b:Ljava/lang/String;

    iget-object v1, p0, Lff/k;->a:Ljava/lang/String;

    iget-object v2, p0, Lff/k;->c:Ljava/lang/String;

    iget-object v3, p0, Lff/k;->d:Ljava/lang/String;

    iget-object v4, p0, Lff/k;->e:Ljava/lang/String;

    iget-object v5, p0, Lff/k;->f:Ljava/lang/String;

    iget-object v6, p0, Lff/k;->g:Ljava/lang/String;

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln9/k;->d(Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "applicationId"

    iget-object v2, p0, Lff/k;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "apiKey"

    iget-object v2, p0, Lff/k;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "databaseUrl"

    iget-object v2, p0, Lff/k;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "gcmSenderId"

    iget-object v2, p0, Lff/k;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "storageBucket"

    iget-object v2, p0, Lff/k;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "projectId"

    iget-object v2, p0, Lff/k;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-virtual {v0}, Ln9/k$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
