.class public final enum Lak/k2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lak/k2;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lak/k2;

.field public static final enum b:Lak/k2;

.field public static final synthetic c:[Lak/k2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lak/k2;

    const-string v1, "ROBLOX"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lak/k2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lak/k2;->a:Lak/k2;

    new-instance v0, Lak/k2;

    const-string v1, "ZSTD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lak/k2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lak/k2;->b:Lak/k2;

    invoke-static {}, Lak/k2;->a()[Lak/k2;

    move-result-object v0

    sput-object v0, Lak/k2;->c:[Lak/k2;

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

.method public static synthetic a()[Lak/k2;
    .locals 2

    sget-object v0, Lak/k2;->a:Lak/k2;

    sget-object v1, Lak/k2;->b:Lak/k2;

    filled-new-array {v0, v1}, [Lak/k2;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lak/k2;
    .locals 1

    const-class v0, Lak/k2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lak/k2;

    return-object p0
.end method

.method public static values()[Lak/k2;
    .locals 1

    sget-object v0, Lak/k2;->c:[Lak/k2;

    invoke-virtual {v0}, [Lak/k2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lak/k2;

    return-object v0
.end method
