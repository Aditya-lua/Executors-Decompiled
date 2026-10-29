.class public Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmm/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$d;->a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;Lmm/m;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$d;->a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    invoke-static {v0, p2}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->e(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;Lmm/m;)V

    iget-object p2, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$d;->a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    invoke-static {p2}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->b(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;)Ljava/lang/ref/WeakReference;

    move-result-object p2

    const-string v0, "MediaPickerProtocol"

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$d;->a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    invoke-static {p2}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->b(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;)Ljava/lang/ref/WeakReference;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object p2, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$d;->a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->d(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lh/f;->c()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$d;->a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    invoke-static {p1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->c(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;)Lll/f;

    move-result-object p1

    invoke-interface {p1}, Lll/f;->a()V

    return-void

    :cond_1
    const-string p1, "Permissions already granted for photo album"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$d;->a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    invoke-static {p1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->f(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;)V

    return-void

    :catch_0
    const-string p1, "Error parsing asset type."

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    :goto_0
    const-string p1, "No Activity found while checking permissions"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
