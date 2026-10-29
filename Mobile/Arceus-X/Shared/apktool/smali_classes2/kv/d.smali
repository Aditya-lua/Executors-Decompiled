.class public final Lkv/d;
.super Lokhttp3/RequestBody;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lokhttp3/RequestBody;"
    }
.end annotation


# instance fields
.field public final a:Lkg/f;

.field public final b:Lkg/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkg/a0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkg/f;Lkg/a0;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkg/f;",
            "Lkg/a0<",
            "TT;>;TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lokhttp3/RequestBody;-><init>()V

    iput-object p1, p0, Lkv/d;->a:Lkg/f;

    iput-object p2, p0, Lkv/d;->b:Lkg/a0;

    iput-object p3, p0, Lkv/d;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public contentType()Lokhttp3/MediaType;
    .locals 1

    sget-object v0, Lkv/b;->d:Lokhttp3/MediaType;

    return-object v0
.end method

.method public writeTo(Lxu/f;)V
    .locals 3

    iget-object v0, p0, Lkv/d;->a:Lkg/f;

    iget-object v1, p0, Lkv/d;->b:Lkg/a0;

    iget-object v2, p0, Lkv/d;->c:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lkv/b;->c(Lxu/f;Lkg/f;Lkg/a0;Ljava/lang/Object;)V

    return-void
.end method
