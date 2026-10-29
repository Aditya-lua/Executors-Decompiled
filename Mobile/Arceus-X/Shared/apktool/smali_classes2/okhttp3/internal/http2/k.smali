.class public final synthetic Lokhttp3/internal/http2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;

.field public final synthetic b:Z

.field public final synthetic c:Lokhttp3/internal/http2/Settings;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;ZLokhttp3/internal/http2/Settings;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/http2/k;->a:Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;

    iput-boolean p2, p0, Lokhttp3/internal/http2/k;->b:Z

    iput-object p3, p0, Lokhttp3/internal/http2/k;->c:Lokhttp3/internal/http2/Settings;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lokhttp3/internal/http2/k;->a:Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;

    iget-boolean v1, p0, Lokhttp3/internal/http2/k;->b:Z

    iget-object v2, p0, Lokhttp3/internal/http2/k;->c:Lokhttp3/internal/http2/Settings;

    invoke-static {v0, v1, v2}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->f(Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;ZLokhttp3/internal/http2/Settings;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
