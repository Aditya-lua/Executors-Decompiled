.class public final synthetic Lom/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lom/k;


# direct methods
.method public synthetic constructor <init>(Lom/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lom/c;->a:Lom/k;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lom/c;->a:Lom/k;

    invoke-static {v0, p1}, Lom/k;->a(Lom/k;Lorg/json/JSONObject;)V

    return-void
.end method
