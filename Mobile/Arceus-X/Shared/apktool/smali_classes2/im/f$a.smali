.class public Lim/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lim/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lim/f;->t(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lim/f;


# direct methods
.method public constructor <init>(Lim/f;)V
    .locals 0

    iput-object p1, p0, Lim/f$a;->a:Lim/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "supportsGetSMSOTP_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lim/f$a;->a:Lim/f;

    const-string v0, "support"

    const/4 v1, 0x0

    const-string v2, "supportsGetSMSOTP"

    invoke-static {p1, v2, v0, v1}, Lim/f;->g(Lim/f;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public onSuccess()V
    .locals 4

    iget-object v0, p0, Lim/f$a;->a:Lim/f;

    const-string v1, "support"

    const/4 v2, 0x1

    const-string v3, "supportsGetSMSOTP"

    invoke-static {v0, v3, v1, v2}, Lim/f;->g(Lim/f;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
