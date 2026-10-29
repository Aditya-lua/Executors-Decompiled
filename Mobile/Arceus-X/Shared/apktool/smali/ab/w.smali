.class public final Lab/w;
.super Lab/f;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lsb/k;


# direct methods
.method public constructor <init>(Lab/b;Lsb/k;)V
    .locals 0

    iput-object p2, p0, Lab/w;->a:Lsb/k;

    invoke-direct {p0}, Lab/f;-><init>()V

    return-void
.end method


# virtual methods
.method public final a1(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/blockstore/RetrieveBytesResponse;)V
    .locals 1

    iget-object v0, p0, Lab/w;->a:Lsb/k;

    invoke-static {p1, p2, v0}, Ll9/v;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lsb/k;)V

    return-void
.end method
