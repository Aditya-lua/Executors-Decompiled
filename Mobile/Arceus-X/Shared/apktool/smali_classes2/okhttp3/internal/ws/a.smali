.class public final synthetic Lokhttp3/internal/ws/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lokhttp3/internal/ws/RealWebSocket;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/internal/ws/RealWebSocket;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/ws/a;->a:Lokhttp3/internal/ws/RealWebSocket;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/ws/a;->a:Lokhttp3/internal/ws/RealWebSocket;

    invoke-static {v0}, Lokhttp3/internal/ws/RealWebSocket;->b(Lokhttp3/internal/ws/RealWebSocket;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
