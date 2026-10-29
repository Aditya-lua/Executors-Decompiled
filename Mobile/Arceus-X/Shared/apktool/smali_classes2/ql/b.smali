.class public final synthetic Lql/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lql/c;


# direct methods
.method public synthetic constructor <init>(Lql/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lql/b;->a:Lql/c;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lql/b;->a:Lql/c;

    invoke-static {v0, p1}, Lql/c;->b(Lql/c;Lorg/json/JSONObject;)V

    return-void
.end method
