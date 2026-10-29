.class public final synthetic Lyg/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/share/SessionReadyListener;


# instance fields
.field public final synthetic a:Lcom/roblox/client/appsflyer/a;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/appsflyer/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyg/a;->a:Lcom/roblox/client/appsflyer/a;

    return-void
.end method


# virtual methods
.method public final onSessionReady()V
    .locals 1

    iget-object v0, p0, Lyg/a;->a:Lcom/roblox/client/appsflyer/a;

    invoke-virtual {v0}, Lcom/roblox/client/appsflyer/a;->b0()V

    return-void
.end method
