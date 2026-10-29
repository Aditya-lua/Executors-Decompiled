.class public final synthetic Lab/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Lab/b;

.field public final synthetic b:Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;


# direct methods
.method public synthetic constructor <init>(Lab/b;Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab/t;->a:Lab/b;

    iput-object p2, p0, Lab/t;->b:Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lab/g;

    check-cast p2, Lsb/k;

    new-instance v0, Lab/w;

    iget-object v1, p0, Lab/t;->a:Lab/b;

    invoke-direct {v0, v1, p2}, Lab/w;-><init>(Lab/b;Lsb/k;)V

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lab/h;

    iget-object p2, p0, Lab/t;->b:Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;

    invoke-virtual {p1, v0, p2}, Lab/h;->v2(Lab/n;Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;)V

    return-void
.end method
