.class public final Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;
.super Ljava/util/LinkedHashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->g()Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/LinkedHashMap<",
        "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;",
        "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\'\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004J%\u0010\u0008\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "com/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d",
        "Ljava/util/LinkedHashMap;",
        "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;",
        "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
        "Lkotlin/collections/LinkedHashMap;",
        "",
        "eldest",
        "",
        "removeEldestEntry",
        "(Ljava/util/Map$Entry;)Z",
        "selfie_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge a(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    move-result-object p1

    invoke-super {p0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge b(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/util/LinkedHashMap;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge c(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;
    .locals 0

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    move-result-object p1

    invoke-super {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    return-object p1
.end method

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->m()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;->a(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;->b(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;)Z

    move-result p1

    return p1
.end method

.method public bridge e()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
            ">;>;"
        }
    .end annotation

    invoke-super {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge f()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->m()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;->c(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->m()Ljava/lang/String;

    move-result-object p1

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;->i(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    move-result-object p1

    return-object p1
.end method

.method public bridge i(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;
    .locals 0

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    move-result-object p1

    invoke-super {p0, p1, p2}, Ljava/util/LinkedHashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    return-object p1
.end method

.method public bridge j()I
    .locals 1

    invoke-super {p0}, Ljava/util/AbstractMap;->size()I

    move-result v0

    return v0
.end method

.method public bridge k()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final bridge keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;->f()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge n(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;)Z
    .locals 0

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    move-result-object p1

    invoke-super {p0, p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge o(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;
    .locals 0

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    move-result-object p1

    invoke-super {p0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    return-object p1
.end method

.method public final bridge synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->m()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;->o(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    move-result-object p1

    return-object p1
.end method

.method public final bridge remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 2
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    if-nez v0, :cond_1

    return v1

    :cond_1
    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->m()Ljava/lang/String;

    move-result-object p1

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;->n(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;)Z

    move-result p1

    return p1
.end method

.method public removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;->size()I

    move-result p1

    const/16 v0, 0x64

    if-le p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;->j()I

    move-result v0

    return v0
.end method

.method public final bridge values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;->k()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
