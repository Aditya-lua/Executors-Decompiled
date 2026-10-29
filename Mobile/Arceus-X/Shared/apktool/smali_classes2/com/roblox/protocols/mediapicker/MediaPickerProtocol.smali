.class public Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$d;,
        Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$b;,
        Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$c;
    }
.end annotation


# static fields
.field public static final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lh/f$h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Lmm/m;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lg/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/c<",
            "Lg/h;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lll/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$a;

    invoke-direct {v0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$a;-><init>()V

    sput-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->f:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getPickMediaId()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$d;

    invoke-direct {v3, p0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$d;-><init>(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->q(Ljava/lang/String;Ljava/lang/String;Lmm/j;)V

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getIsAvailableId()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$b;

    invoke-direct {v3, p0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$b;-><init>(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->p(Ljava/lang/String;Ljava/lang/String;Lmm/i;)V

    return-void
.end method

.method public static synthetic a(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;Lh/f$h;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->k(Lh/f$h;)V

    return-void
.end method

.method public static bridge synthetic b(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->c:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;)Lll/f;
    .locals 0

    iget-object p0, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->e:Lll/f;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->b:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic e(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;Lmm/m;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->a:Lmm/m;

    return-void
.end method

.method public static bridge synthetic f(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->n()V

    return-void
.end method

.method public static bridge synthetic g()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getAssetTypeParamName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static native getAssetFilePathParamName()Ljava/lang/String;
.end method

.method public static native getAssetTypeImages()Ljava/lang/String;
.end method

.method private static native getAssetTypeParamName()Ljava/lang/String;
.end method

.method public static native getAssetTypeVideos()Ljava/lang/String;
.end method

.method private static native getAvailableParamName()Ljava/lang/String;
.end method

.method private static native getErrorParamName()Ljava/lang/String;
.end method

.method private static native getIsAvailableId()Ljava/lang/String;
.end method

.method private static native getPermissionsParamName()Ljava/lang/String;
.end method

.method private static native getPickMediaId()Ljava/lang/String;
.end method

.method private static native getProtocolName()Ljava/lang/String;
.end method

.method public static native getSourceTypeCamera()Ljava/lang/String;
.end method

.method public static bridge synthetic h()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getAvailableParamName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static native initializeMediaPickerProtocol()V
.end method

.method public static declared-synchronized o()Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;
    .locals 2

    const-class v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$c;->a()Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static native onMediaPickerResponse(J[BLjava/lang/String;)V
.end method


# virtual methods
.method public final i(Landroid/net/Uri;)Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->c:Ljava/lang/ref/WeakReference;

    const-string v1, "MediaPickerProtocol"

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-static {}, Lh/f;->c()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p1

    invoke-virtual/range {v4 .. v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object v5, p1

    invoke-static {v5}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    const-string v3, ":"

    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    aget-object v3, p1, v3

    const/4 v4, 0x1

    aget-object p1, p1, v4

    const-string v4, "image"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v6, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v10, 0x0

    const-string v8, "_id=?"

    invoke-virtual/range {v5 .. v10}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    goto :goto_0

    :cond_2
    const-string v4, "video"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v5, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v9, 0x0

    const-string v7, "_id=?"

    invoke-virtual/range {v4 .. v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    goto :goto_0

    :cond_3
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_5

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "_data"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    :cond_4
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object v2

    :cond_5
    const-string p1, "Picked URI is invalid"

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    :cond_6
    :goto_1
    const-string p1, "No Activity found while checking permissions"

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2
.end method

.method public j(Landroid/net/Uri;)V
    .locals 7

    const/4 v0, 0x1

    const-string v1, ""

    const-string v2, "MediaPickerProtocol"

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->i(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Selected file path: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Lmm/l;

    invoke-direct {v3}, Lmm/l;-><init>()V

    :try_start_0
    iget-object v4, v3, Lmm/l;->a:Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getAssetTypeParamName()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->b:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v4, v3, Lmm/l;->a:Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getAssetFilePathParamName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, v3, Lmm/l;->a:Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getErrorParamName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, v3, Lmm/l;->a:Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getPermissionsParamName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "Exception while handling pick media request"

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object p1, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->a:Lmm/m;

    invoke-interface {p1, v3}, Lmm/m;->a(Lmm/l;)V

    goto :goto_2

    :cond_0
    const-string p1, "No media selected"

    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lmm/l;

    invoke-direct {p1}, Lmm/l;-><init>()V

    iput v0, p1, Lmm/l;->c:I

    :try_start_1
    iget-object v3, p1, Lmm/l;->a:Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getAssetTypeParamName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->b:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v3, p1, Lmm/l;->a:Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getAssetFilePathParamName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v3, p1, Lmm/l;->a:Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getErrorParamName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p1, Lmm/l;->a:Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getPermissionsParamName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const-string v0, "Exception while writing response for pick media request"

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    iget-object v0, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->a:Lmm/m;

    invoke-interface {v0, p1}, Lmm/m;->a(Lmm/l;)V

    :goto_2
    return-void
.end method

.method public final synthetic k(Lh/f$h;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->d:Lg/c;

    new-instance v1, Lg/h$a;

    invoke-direct {v1}, Lg/h$a;-><init>()V

    invoke-virtual {v1, p1}, Lg/h$a;->d(Lh/f$h;)Lg/h$a;

    move-result-object p1

    invoke-virtual {p1}, Lg/h$a;->a()Lg/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg/c;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public l(Le/p;)V
    .locals 2

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->c:Ljava/lang/ref/WeakReference;

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    new-instance v1, Lll/a;

    invoke-direct {v1, p0}, Lll/a;-><init>(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;)V

    invoke-virtual {p1, v0, v1}, Le/p;->h(Lh/a;Lg/a;)Lg/c;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->d:Lg/c;

    return-void
.end method

.method public m(Le/p;Lll/f;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->c:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->e:Lll/f;

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->initializeMediaPickerProtocol()V

    return-void
.end method

.method public final n()V
    .locals 3

    sget-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->f:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh/f$h;

    if-nez v0, :cond_0

    const-string v0, "MediaPickerProtocol"

    const-string v1, "Media Type must be either IMAGES or VIDEOS"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lll/b;

    invoke-direct {v2, p0, v0}, Lll/b;-><init>(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;Lh/f$h;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
