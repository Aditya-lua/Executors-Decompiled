.class public final synthetic Lfm/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lfm/p;


# direct methods
.method public synthetic constructor <init>(Lfm/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfm/o;->a:Lfm/p;

    return-void
.end method


# virtual methods
.method public final run(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lfm/o;->a:Lfm/p;

    invoke-static {v0, p1}, Lfm/p;->b(Lfm/p;Lorg/json/JSONObject;)V

    return-void
.end method
