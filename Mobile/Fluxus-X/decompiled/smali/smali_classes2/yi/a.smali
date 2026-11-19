.class public final synthetic Lyi/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lyi/b;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lyi/b;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyi/a;->a:Lyi/b;

    iput-object p2, p0, Lyi/a;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run(Lorg/json/JSONObject;)V
    .locals 2

    iget-object v0, p0, Lyi/a;->a:Lyi/b;

    iget-object v1, p0, Lyi/a;->b:Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lyi/b;->a(Lyi/b;Landroid/content/Context;Lorg/json/JSONObject;)V

    return-void
.end method
