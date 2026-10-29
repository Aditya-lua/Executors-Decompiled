.class public final synthetic Lsg/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/startup/d$a;


# instance fields
.field public final synthetic a:Lcom/roblox/client/ActivityNativeMain;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/l;->a:Lcom/roblox/client/ActivityNativeMain;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lsg/l;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-virtual {v0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void
.end method
