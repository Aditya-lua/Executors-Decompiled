.class public Lem/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lem/a;->l(Lj/b;Landroid/content/Intent;ILem/a$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj/b;

.field public final synthetic b:Landroid/content/Intent;

.field public final synthetic c:I

.field public final synthetic d:Lem/a$g;

.field public final synthetic e:Lem/a;


# direct methods
.method public constructor <init>(Lem/a;Lj/b;Landroid/content/Intent;ILem/a$g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lem/a$a;->e:Lem/a;

    iput-object p2, p0, Lem/a$a;->a:Lj/b;

    iput-object p3, p0, Lem/a$a;->b:Landroid/content/Intent;

    iput p4, p0, Lem/a$a;->c:I

    iput-object p5, p0, Lem/a$a;->d:Lem/a$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 7

    :try_start_0
    const-string v0, "text"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "context"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lem/a$a;->a:Lj/b;

    iget-object v4, p0, Lem/a$a;->b:Landroid/content/Intent;

    iget v5, p0, Lem/a$a;->c:I

    iget-object v6, p0, Lem/a$a;->d:Lem/a$g;

    invoke-static/range {v1 .. v6}, Lem/a;->i(Lj/b;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ILem/a$g;)V

    return-void

    :catch_0
    const-string p1, "ContentSharingProtocol"

    const-string v0, "Error parsing share text data."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
