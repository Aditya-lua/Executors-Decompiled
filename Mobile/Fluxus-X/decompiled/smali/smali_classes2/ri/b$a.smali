.class public Lri/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lal/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lri/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lri/b;


# direct methods
.method public constructor <init>(Lri/b;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lri/b$a;->a:Lri/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lri/b;Lri/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lri/b$a;-><init>(Lri/b;)V

    return-void
.end method


# virtual methods
.method public a(Lal/a;)V
    .locals 4

    invoke-virtual {p1}, Lal/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "placeID"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ShareGameToChat.execute() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "rbx.hybrid"

    invoke-static {v2, v0}, Lok/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-virtual {p1, v0, v1}, Lal/a;->a(ZLorg/json/JSONObject;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lal/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
