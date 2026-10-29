.class public final synthetic Lsg/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/a;


# instance fields
.field public final synthetic a:Lcom/roblox/client/ActivityNativeMain;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/d;->a:Lcom/roblox/client/ActivityNativeMain;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lsg/d;->a:Lcom/roblox/client/ActivityNativeMain;

    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-static {v0, p1}, Lcom/roblox/client/ActivityNativeMain;->p2(Lcom/roblox/client/ActivityNativeMain;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method
