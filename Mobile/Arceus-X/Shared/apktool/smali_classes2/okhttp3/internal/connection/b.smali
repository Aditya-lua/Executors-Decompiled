.class public final synthetic Lokhttp3/internal/connection/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lokhttp3/Handshake;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/Handshake;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/connection/b;->a:Lokhttp3/Handshake;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/connection/b;->a:Lokhttp3/Handshake;

    invoke-static {v0}, Lokhttp3/internal/connection/ConnectPlan;->b(Lokhttp3/Handshake;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
