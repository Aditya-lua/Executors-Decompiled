.class public final Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;
.super Lcom/roblox/engine/jni/autovalue/InitParams$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/roblox/engine/jni/model/PlatformParams;

.field public b:Lcom/roblox/engine/jni/model/DeviceParams;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:J

.field public i:Ljava/lang/String;

.field public j:Landroid/app/Activity;

.field public k:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/InitParams$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/roblox/engine/jni/autovalue/InitParams;
    .locals 15

    iget-byte v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->k:B

    const/16 v1, 0xf

    if-ne v0, v1, :cond_1

    iget-object v3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->a:Lcom/roblox/engine/jni/model/PlatformParams;

    if-eqz v3, :cond_1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->b:Lcom/roblox/engine/jni/model/DeviceParams;

    if-eqz v4, :cond_1

    iget-object v5, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->c:Ljava/lang/String;

    if-eqz v5, :cond_1

    iget-object v6, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->d:Ljava/lang/String;

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams;

    iget-boolean v7, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->e:Z

    iget-boolean v8, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->f:Z

    iget-boolean v9, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->g:Z

    iget-wide v10, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->h:J

    iget-object v12, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->i:Ljava/lang/String;

    iget-object v13, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->j:Landroid/app/Activity;

    const/4 v14, 0x0

    invoke-direct/range {v2 .. v14}, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams;-><init>(Lcom/roblox/engine/jni/model/PlatformParams;Lcom/roblox/engine/jni/model/DeviceParams;Ljava/lang/String;Ljava/lang/String;ZZZJLjava/lang/String;Landroid/app/Activity;Lcom/roblox/engine/jni/autovalue/a;)V

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->a:Lcom/roblox/engine/jni/model/PlatformParams;

    if-nez v1, :cond_2

    const-string v1, " platformParams"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->b:Lcom/roblox/engine/jni/model/DeviceParams;

    if-nez v1, :cond_3

    const-string v1, " deviceParams"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->c:Ljava/lang/String;

    if-nez v1, :cond_4

    const-string v1, " baseURL"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->d:Ljava/lang/String;

    if-nez v1, :cond_5

    const-string v1, " userAgent"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-byte v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->k:B

    and-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_6

    const-string v1, " isTablet"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-byte v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->k:B

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_7

    const-string v1, " isPotato"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    iget-byte v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->k:B

    and-int/lit8 v1, v1, 0x4

    if-nez v1, :cond_8

    const-string v1, " isVrDevice"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    iget-byte v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->k:B

    and-int/lit8 v1, v1, 0x8

    if-nez v1, :cond_9

    const-string v1, " pioneerPlaceId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
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

.method public b(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->c:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null baseURL"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$a;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->i:Ljava/lang/String;

    return-object p0
.end method

.method public d(Lcom/roblox/engine/jni/model/DeviceParams;)Lcom/roblox/engine/jni/autovalue/InitParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->b:Lcom/roblox/engine/jni/model/DeviceParams;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null deviceParams"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Z)Lcom/roblox/engine/jni/autovalue/InitParams$a;
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->f:Z

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->k:B

    or-int/lit8 p1, p1, 0x2

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->k:B

    return-object p0
.end method

.method public f(Z)Lcom/roblox/engine/jni/autovalue/InitParams$a;
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->e:Z

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->k:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->k:B

    return-object p0
.end method

.method public g(Z)Lcom/roblox/engine/jni/autovalue/InitParams$a;
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->g:Z

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->k:B

    or-int/lit8 p1, p1, 0x4

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->k:B

    return-object p0
.end method

.method public h(J)Lcom/roblox/engine/jni/autovalue/InitParams$a;
    .locals 0

    iput-wide p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->h:J

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->k:B

    or-int/lit8 p1, p1, 0x8

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->k:B

    return-object p0
.end method

.method public i(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/InitParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->a:Lcom/roblox/engine/jni/model/PlatformParams;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null platformParams"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$a;->d:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null userAgent"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
