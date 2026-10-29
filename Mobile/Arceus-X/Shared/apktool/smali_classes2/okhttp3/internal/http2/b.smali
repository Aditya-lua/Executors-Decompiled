.class public final synthetic Lokhttp3/internal/http2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lokhttp3/internal/http2/Http2Connection;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lokhttp3/internal/http2/Http2Connection;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/http2/b;->a:Lokhttp3/internal/http2/Http2Connection;

    iput-wide p2, p0, Lokhttp3/internal/http2/b;->b:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lokhttp3/internal/http2/b;->a:Lokhttp3/internal/http2/Http2Connection;

    iget-wide v1, p0, Lokhttp3/internal/http2/b;->b:J

    invoke-static {v0, v1, v2}, Lokhttp3/internal/http2/Http2Connection;->e(Lokhttp3/internal/http2/Http2Connection;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
