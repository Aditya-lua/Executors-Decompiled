.class public final synthetic Lem/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lem/c;


# direct methods
.method public synthetic constructor <init>(Lem/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lem/a;->a:Lem/c;

    return-void
.end method


# virtual methods
.method public final run(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lem/a;->a:Lem/c;

    invoke-static {v0, p1}, Lem/c;->a(Lem/c;Lorg/json/JSONObject;)V

    return-void
.end method
