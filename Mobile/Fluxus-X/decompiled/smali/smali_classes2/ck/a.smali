.class public final synthetic Lck/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/net/Network;

    check-cast p2, Ljava/net/URL;

    invoke-static {p1, p2}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->e(Landroid/net/Network;Ljava/net/URL;)Ljava/net/URLConnection;

    move-result-object p1

    return-object p1
.end method
