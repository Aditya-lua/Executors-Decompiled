.class public final synthetic Lokhttp3/internal/ws/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/c0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/ws/d;->a:Lkotlin/jvm/internal/c0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/ws/d;->a:Lkotlin/jvm/internal/c0;

    invoke-static {v0}, Lokhttp3/internal/ws/RealWebSocket;->c(Lkotlin/jvm/internal/c0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
