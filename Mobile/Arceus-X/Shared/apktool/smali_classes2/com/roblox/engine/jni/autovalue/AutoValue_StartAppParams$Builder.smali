.class final Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;
.super Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private appStarterPlace:Ljava/lang/String;

.field private appStarterScript:Ljava/lang/String;

.field private appUserId:J

.field private isUnder13:Z

.field private membershipType:I

.field private platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

.field private selectedTheme:Ljava/lang/String;

.field private set$0:B

.field private surface:Landroid/view/Surface;

.field private username:Ljava/lang/String;

.field private vrContext:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/roblox/engine/jni/autovalue/StartAppParams;
    .locals 15

    iget-byte v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->set$0:B

    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    iget-object v3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->surface:Landroid/view/Surface;

    if-eqz v3, :cond_1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    if-eqz v4, :cond_1

    iget-object v5, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->appStarterPlace:Ljava/lang/String;

    if-eqz v5, :cond_1

    iget-object v6, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->appStarterScript:Ljava/lang/String;

    if-eqz v6, :cond_1

    iget-object v10, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->username:Ljava/lang/String;

    if-eqz v10, :cond_1

    iget-object v12, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->selectedTheme:Ljava/lang/String;

    if-nez v12, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;

    iget-wide v7, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->appUserId:J

    iget-boolean v9, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->isUnder13:Z

    iget v11, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->membershipType:I

    iget-object v13, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->vrContext:Landroid/app/Activity;

    const/4 v14, 0x0

    invoke-direct/range {v2 .. v14}, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;-><init>(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;ILjava/lang/String;Landroid/app/Activity;Lcom/roblox/engine/jni/autovalue/h;)V

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->surface:Landroid/view/Surface;

    if-nez v1, :cond_2

    const-string v1, " surface"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    if-nez v1, :cond_3

    const-string v1, " platformParams"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->appStarterPlace:Ljava/lang/String;

    if-nez v1, :cond_4

    const-string v1, " appStarterPlace"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->appStarterScript:Ljava/lang/String;

    if-nez v1, :cond_5

    const-string v1, " appStarterScript"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-byte v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->set$0:B

    and-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_6

    const-string v1, " appUserId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-byte v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->set$0:B

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_7

    const-string v1, " isUnder13"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->username:Ljava/lang/String;

    if-nez v1, :cond_8

    const-string v1, " username"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    iget-byte v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->set$0:B

    and-int/lit8 v1, v1, 0x4

    if-nez v1, :cond_9

    const-string v1, " membershipType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->selectedTheme:Ljava/lang/String;

    if-nez v1, :cond_a

    const-string v1, " selectedTheme"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public setAppStarterPlace(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->appStarterPlace:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null appStarterPlace"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setAppStarterScript(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->appStarterScript:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null appStarterScript"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setAppUserId(J)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 0

    iput-wide p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->appUserId:J

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->set$0:B

    return-object p0
.end method

.method public setIsUnder13(Z)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->isUnder13:Z

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x2

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->set$0:B

    return-object p0
.end method

.method public setMembershipType(I)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 0

    iput p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->membershipType:I

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x4

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->set$0:B

    return-object p0
.end method

.method public setPlatformParams(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null platformParams"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setSelectedTheme(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->selectedTheme:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null selectedTheme"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setSurface(Landroid/view/Surface;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->surface:Landroid/view/Surface;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null surface"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setUsername(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->username:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null username"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setVrContext(Landroid/app/Activity;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;->vrContext:Landroid/app/Activity;

    return-object p0
.end method
