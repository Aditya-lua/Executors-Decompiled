.class public final enum Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/NativeVideoInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ImageOrientation"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final enum b:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final enum c:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final enum d:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final enum e:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final enum f:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final enum g:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final enum h:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final synthetic i:[Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v1, "Normal"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->a:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    new-instance v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v1, "FlipHorizontal"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->b:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    new-instance v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v1, "Rotate180"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->c:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    new-instance v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v1, "FlipVertical"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->d:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    new-instance v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v1, "Transpose"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->e:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    new-instance v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v1, "Rotate90"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->f:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    new-instance v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v1, "Transverse"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->g:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    new-instance v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v1, "Rotate270"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->h:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    invoke-static {}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->a()[Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    move-result-object v0

    sput-object v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->i:[Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;
    .locals 8

    sget-object v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->a:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    sget-object v1, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->b:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    sget-object v2, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->c:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    sget-object v3, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->d:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    sget-object v4, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->e:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    sget-object v5, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->f:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    sget-object v6, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->g:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    sget-object v7, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->h:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    filled-new-array/range {v0 .. v7}, [Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;
    .locals 1

    const-class v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    return-object p0
.end method

.method public static values()[Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->i:[Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    invoke-virtual {v0}, [Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    return-object v0
.end method
