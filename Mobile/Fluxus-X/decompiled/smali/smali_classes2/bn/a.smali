.class public final synthetic Lbn/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lbn/k;


# direct methods
.method public synthetic constructor <init>(Lbn/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbn/a;->a:Lbn/k;

    return-void
.end method


# virtual methods
.method public final run(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lbn/a;->a:Lbn/k;

    invoke-virtual {v0, p1}, Lbn/k;->C(Lorg/json/JSONObject;)V

    return-void
.end method
