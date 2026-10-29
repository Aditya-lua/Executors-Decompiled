.class public Lcom/roblox/engine/jni/model/ChannelRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:J


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->a:Ljava/lang/String;

    iput-wide p2, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->b:J

    return-void
.end method
