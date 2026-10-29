.class public final synthetic Lqi/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lqi/b;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lqi/b;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqi/a;->a:Lqi/b;

    iput-object p2, p0, Lqi/a;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 2

    iget-object v0, p0, Lqi/a;->a:Lqi/b;

    iget-object v1, p0, Lqi/a;->b:Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lqi/b;->a(Lqi/b;Landroid/content/Context;Lorg/json/JSONObject;)V

    return-void
.end method
