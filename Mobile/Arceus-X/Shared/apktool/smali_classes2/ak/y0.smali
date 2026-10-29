.class public final synthetic Lak/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/startup/MainGameActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/startup/MainGameActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/y0;->a:Lcom/roblox/client/startup/MainGameActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lak/y0;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {v0}, Lcom/roblox/client/startup/MainGameActivity;->U1(Lcom/roblox/client/startup/MainGameActivity;)V

    return-void
.end method
