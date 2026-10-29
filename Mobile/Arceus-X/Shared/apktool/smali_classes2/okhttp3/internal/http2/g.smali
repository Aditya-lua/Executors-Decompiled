.class public final synthetic Lokhttp3/internal/http2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lokhttp3/internal/http2/Http2Connection;

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lokhttp3/internal/http2/Http2Connection;ILjava/util/List;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/http2/g;->a:Lokhttp3/internal/http2/Http2Connection;

    iput p2, p0, Lokhttp3/internal/http2/g;->b:I

    iput-object p3, p0, Lokhttp3/internal/http2/g;->c:Ljava/util/List;

    iput-boolean p4, p0, Lokhttp3/internal/http2/g;->d:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lokhttp3/internal/http2/g;->a:Lokhttp3/internal/http2/Http2Connection;

    iget v1, p0, Lokhttp3/internal/http2/g;->b:I

    iget-object v2, p0, Lokhttp3/internal/http2/g;->c:Ljava/util/List;

    iget-boolean v3, p0, Lokhttp3/internal/http2/g;->d:Z

    invoke-static {v0, v1, v2, v3}, Lokhttp3/internal/http2/Http2Connection;->f(Lokhttp3/internal/http2/Http2Connection;ILjava/util/List;Z)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
