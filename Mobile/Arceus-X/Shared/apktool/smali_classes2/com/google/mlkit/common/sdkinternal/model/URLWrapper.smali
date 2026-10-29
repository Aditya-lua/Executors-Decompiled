.class public Lcom/google/mlkit/common/sdkinternal/model/URLWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/net/URL;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/URLWrapper;->zza:Ljava/net/URL;

    return-void
.end method


# virtual methods
.method public openConnection()Ljava/net/URLConnection;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/URLWrapper;->zza:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    return-object v0
.end method
