.class public final Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/util/List;

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest$a;->a:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest$a;->b:Z

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;

    iget-object v1, p0, Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest$a;->a:Ljava/util/List;

    iget-boolean v2, p0, Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest$a;->b:Z

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;-><init>(Ljava/util/List;Z)V

    return-object v0
.end method

.method public b(Ljava/util/List;)Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest$a;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest$a;"
        }
    .end annotation

    const-string v0, "Keys cannot be set to null"

    invoke-static {p1, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest$a;->a:Ljava/util/List;

    return-object p0
.end method
