.class public Lwh/f$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Landroid/app/Activity;

.field public b:Lcom/roblox/engine/jni/model/PlatformParams;

.field public c:Lcom/roblox/engine/jni/model/DeviceParams;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:J

.field public g:Z

.field public h:Ljava/lang/String;

.field public i:I

.field public j:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/roblox/engine/jni/model/DeviceParams;
    .locals 1

    iget-object v0, p0, Lwh/f$d;->c:Lcom/roblox/engine/jni/model/DeviceParams;

    return-object v0
.end method

.method public b()Lcom/roblox/engine/jni/model/PlatformParams;
    .locals 1

    iget-object v0, p0, Lwh/f$d;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    return-object v0
.end method
