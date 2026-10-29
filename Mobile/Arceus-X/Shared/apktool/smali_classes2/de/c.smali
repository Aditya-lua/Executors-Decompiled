.class public final Lde/c;
.super Lde/u;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lde/u;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lde/u;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lde/c;->a:Ljava/lang/Integer;

    return-object p0
.end method

.method public final b(Ljava/util/Map;)Lde/u;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lde/c;->b:Ljava/util/Map;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null splitInstallErrorCodeByModule"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()Lde/v;
    .locals 4

    iget-object v0, p0, Lde/c;->b:Ljava/util/Map;

    if-eqz v0, :cond_0

    new-instance v0, Lde/f;

    iget-object v1, p0, Lde/c;->a:Ljava/lang/Integer;

    iget-object v2, p0, Lde/c;->b:Ljava/util/Map;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lde/f;-><init>(Ljava/lang/Integer;Ljava/util/Map;Lde/e;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required properties: splitInstallErrorCodeByModule"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Ljava/util/Map;
    .locals 2

    iget-object v0, p0, Lde/c;->b:Ljava/util/Map;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Property \"splitInstallErrorCodeByModule\" has not been set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
