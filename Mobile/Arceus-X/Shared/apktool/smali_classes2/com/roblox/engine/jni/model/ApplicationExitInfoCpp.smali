.class public Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public mDescription:Ljava/lang/String;

.field public mExitReason:Ljava/lang/String;

.field public mExitSubreason:Ljava/lang/String;

.field public mImportance:I

.field public mPid:I

.field public mPss:J

.field public mRss:J

.field public mSignal:I

.field public mTimestamp:J


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p1, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mPid:I

    .line 7
    iput p2, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mSignal:I

    .line 8
    iput-wide p3, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mTimestamp:J

    .line 9
    iput-object p5, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mExitReason:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJI)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput p1, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mPid:I

    .line 12
    iput p2, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mSignal:I

    .line 13
    iput-wide p3, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mTimestamp:J

    .line 14
    iput-object p5, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mExitReason:Ljava/lang/String;

    .line 15
    iput-object p6, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mExitSubreason:Ljava/lang/String;

    .line 16
    iput-object p7, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mDescription:Ljava/lang/String;

    .line 17
    iput-wide p8, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mPss:J

    .line 18
    iput-wide p10, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mRss:J

    .line 19
    iput p12, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mImportance:I

    return-void
.end method

.method public constructor <init>(IJLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mPid:I

    .line 3
    iput-wide p2, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mTimestamp:J

    .line 4
    iput-object p4, p0, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;->mExitReason:Ljava/lang/String;

    return-void
.end method
