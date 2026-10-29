.class public Ljj/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const-string v5, "channel_medium"

    const-string v6, "channel_minimum"

    const-string v0, "channel_general"

    const-string v1, "channel_games"

    const-string v2, "channel_calls"

    const-string v3, "channel_urgent"

    const-string v4, "channel_default"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ljj/n;->a:[Ljava/lang/String;

    const/4 v0, 0x3

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    sput-object v0, Ljj/n;->b:[J

    return-void

    nop

    :array_0
    .array-data 8
        0x0
        0x3e8
        0x3e8
    .end array-data
.end method
