.class public final synthetic Lokhttp3/internal/http2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lokhttp3/internal/http2/Http2Connection;

.field public final synthetic b:I

.field public final synthetic c:Lxu/e;

.field public final synthetic d:I

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Lokhttp3/internal/http2/Http2Connection;ILxu/e;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/http2/a;->a:Lokhttp3/internal/http2/Http2Connection;

    iput p2, p0, Lokhttp3/internal/http2/a;->b:I

    iput-object p3, p0, Lokhttp3/internal/http2/a;->c:Lxu/e;

    iput p4, p0, Lokhttp3/internal/http2/a;->d:I

    iput-boolean p5, p0, Lokhttp3/internal/http2/a;->e:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lokhttp3/internal/http2/a;->a:Lokhttp3/internal/http2/Http2Connection;

    iget v1, p0, Lokhttp3/internal/http2/a;->b:I

    iget-object v2, p0, Lokhttp3/internal/http2/a;->c:Lxu/e;

    iget v3, p0, Lokhttp3/internal/http2/a;->d:I

    iget-boolean v4, p0, Lokhttp3/internal/http2/a;->e:Z

    invoke-static {v0, v1, v2, v3, v4}, Lokhttp3/internal/http2/Http2Connection;->d(Lokhttp3/internal/http2/Http2Connection;ILxu/e;IZ)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
