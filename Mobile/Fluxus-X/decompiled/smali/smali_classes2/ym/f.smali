.class public final synthetic Lym/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/NewCallback;


# instance fields
.field public final synthetic a:Lym/g$k;


# direct methods
.method public synthetic constructor <init>(Lym/g$k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lym/f;->a:Lym/g$k;

    return-void
.end method


# virtual methods
.method public final run(Lorg/json/JSONObject;)Z
    .locals 1

    iget-object v0, p0, Lym/f;->a:Lym/g$k;

    invoke-static {v0, p1}, Lym/g;->b(Lym/g$k;Lorg/json/JSONObject;)Z

    move-result p1

    return p1
.end method
