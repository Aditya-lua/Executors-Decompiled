.class final Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;
.super Lcom/roblox/engine/jni/autovalue/StartAppParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;
    }
.end annotation


# instance fields
.field private final appStarterPlace:Ljava/lang/String;

.field private final appStarterScript:Ljava/lang/String;

.field private final appUserId:J

.field private final isUnder13:Z

.field private final membershipType:I

.field private final platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

.field private final selectedTheme:Ljava/lang/String;

.field private final surface:Landroid/view/Surface;

.field private final username:Ljava/lang/String;

.field private final vrContext:Landroid/app/Activity;


# direct methods
.method private constructor <init>(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;ILjava/lang/String;Landroid/app/Activity;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/StartAppParams;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->surface:Landroid/view/Surface;

    .line 4
    iput-object p2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    .line 5
    iput-object p3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appStarterPlace:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appStarterScript:Ljava/lang/String;

    .line 7
    iput-wide p5, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appUserId:J

    .line 8
    iput-boolean p7, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->isUnder13:Z

    .line 9
    iput-object p8, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->username:Ljava/lang/String;

    .line 10
    iput p9, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->membershipType:I

    .line 11
    iput-object p10, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->selectedTheme:Ljava/lang/String;

    .line 12
    iput-object p11, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->vrContext:Landroid/app/Activity;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;ILjava/lang/String;Landroid/app/Activity;Lcom/roblox/engine/jni/autovalue/h;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;-><init>(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;ILjava/lang/String;Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public appStarterPlace()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appStarterPlace:Ljava/lang/String;

    return-object v0
.end method

.method public appStarterScript()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appStarterScript:Ljava/lang/String;

    return-object v0
.end method

.method public appUserId()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appUserId:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/roblox/engine/jni/autovalue/StartAppParams;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lcom/roblox/engine/jni/autovalue/StartAppParams;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->surface:Landroid/view/Surface;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams;->surface()Landroid/view/Surface;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams;->platformParams()Lcom/roblox/engine/jni/model/PlatformParams;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appStarterPlace:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams;->appStarterPlace()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appStarterScript:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams;->appStarterScript()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-wide v3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appUserId:J

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams;->appUserId()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->isUnder13:Z

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams;->isUnder13()Z

    move-result v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->username:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams;->username()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->membershipType:I

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams;->membershipType()I

    move-result v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->selectedTheme:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams;->selectedTheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->vrContext:Landroid/app/Activity;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams;->vrContext()Landroid/app/Activity;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams;->vrContext()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->surface:Landroid/view/Surface;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appStarterPlace:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appStarterScript:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appUserId:J

    const/16 v4, 0x20

    ushr-long v4, v2, v4

    xor-long/2addr v2, v4

    long-to-int v2, v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->isUnder13:Z

    if-eqz v2, :cond_0

    const/16 v2, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v2, 0x4d5

    :goto_0
    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->username:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->membershipType:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->selectedTheme:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->vrContext:Landroid/app/Activity;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public isUnder13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->isUnder13:Z

    return v0
.end method

.method public membershipType()I
    .locals 1

    iget v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->membershipType:I

    return v0
.end method

.method public platformParams()Lcom/roblox/engine/jni/model/PlatformParams;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    return-object v0
.end method

.method public selectedTheme()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->selectedTheme:Ljava/lang/String;

    return-object v0
.end method

.method public surface()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->surface:Landroid/view/Surface;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StartAppParams{surface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->surface:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", platformParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", appStarterPlace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appStarterPlace:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", appStarterScript="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appStarterScript:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", appUserId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->appUserId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", isUnder13="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->isUnder13:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", username="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->username:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", membershipType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->membershipType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", selectedTheme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->selectedTheme:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", vrContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->vrContext:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public username()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->username:Ljava/lang/String;

    return-object v0
.end method

.method public vrContext()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams;->vrContext:Landroid/app/Activity;

    return-object v0
.end method
