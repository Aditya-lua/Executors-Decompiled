.class public final enum Lcom/github/luben/zstd/Zstd$ParamSwitch;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/luben/zstd/Zstd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ParamSwitch"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/github/luben/zstd/Zstd$ParamSwitch;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/github/luben/zstd/Zstd$ParamSwitch;

.field public static final enum AUTO:Lcom/github/luben/zstd/Zstd$ParamSwitch;

.field public static final enum DISABLE:Lcom/github/luben/zstd/Zstd$ParamSwitch;

.field public static final enum ENABLE:Lcom/github/luben/zstd/Zstd$ParamSwitch;


# instance fields
.field private val:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/github/luben/zstd/Zstd$ParamSwitch;

    const-string v1, "AUTO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/github/luben/zstd/Zstd$ParamSwitch;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/github/luben/zstd/Zstd$ParamSwitch;->AUTO:Lcom/github/luben/zstd/Zstd$ParamSwitch;

    new-instance v1, Lcom/github/luben/zstd/Zstd$ParamSwitch;

    const-string v2, "ENABLE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcom/github/luben/zstd/Zstd$ParamSwitch;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/github/luben/zstd/Zstd$ParamSwitch;->ENABLE:Lcom/github/luben/zstd/Zstd$ParamSwitch;

    new-instance v2, Lcom/github/luben/zstd/Zstd$ParamSwitch;

    const-string v3, "DISABLE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lcom/github/luben/zstd/Zstd$ParamSwitch;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/github/luben/zstd/Zstd$ParamSwitch;->DISABLE:Lcom/github/luben/zstd/Zstd$ParamSwitch;

    filled-new-array {v0, v1, v2}, [Lcom/github/luben/zstd/Zstd$ParamSwitch;

    move-result-object v0

    sput-object v0, Lcom/github/luben/zstd/Zstd$ParamSwitch;->$VALUES:[Lcom/github/luben/zstd/Zstd$ParamSwitch;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/github/luben/zstd/Zstd$ParamSwitch;->val:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/github/luben/zstd/Zstd$ParamSwitch;
    .locals 1

    const-class v0, Lcom/github/luben/zstd/Zstd$ParamSwitch;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/github/luben/zstd/Zstd$ParamSwitch;

    return-object p0
.end method

.method public static values()[Lcom/github/luben/zstd/Zstd$ParamSwitch;
    .locals 1

    sget-object v0, Lcom/github/luben/zstd/Zstd$ParamSwitch;->$VALUES:[Lcom/github/luben/zstd/Zstd$ParamSwitch;

    invoke-virtual {v0}, [Lcom/github/luben/zstd/Zstd$ParamSwitch;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/github/luben/zstd/Zstd$ParamSwitch;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, Lcom/github/luben/zstd/Zstd$ParamSwitch;->val:I

    return v0
.end method
