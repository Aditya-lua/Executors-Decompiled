.class public final Llv/d;
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
.field public final a:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lum/h;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lum/h<",
            "TT;>;TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lokhttp3/RequestBody;-><init>()V

    iput-object p1, p0, Llv/d;->a:Lum/h;

    iput-object p2, p0, Llv/d;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public contentType()Lokhttp3/MediaType;
    .locals 1

    sget-object v0, Llv/b;->c:Lokhttp3/MediaType;

    return-object v0
.end method

.method public writeTo(Lxu/f;)V
    .locals 2

    iget-object v0, p0, Llv/d;->a:Lum/h;

    iget-object v1, p0, Llv/d;->b:Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lxu/f;Ljava/lang/Object;)V

    return-void
.end method
