.class public final enum Lig/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lig/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lig/c;

.field public static final enum b:Lig/c;

.field public static final synthetic c:[Lig/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lig/c;

    const-string v1, "LOW_POWER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lig/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lig/c;->a:Lig/c;

    new-instance v0, Lig/c;

    const-string v1, "HIGH_SPEED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lig/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lig/c;->b:Lig/c;

    invoke-static {}, Lig/c;->a()[Lig/c;

    move-result-object v0

    sput-object v0, Lig/c;->c:[Lig/c;

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

.method public static synthetic a()[Lig/c;
    .locals 2

    sget-object v0, Lig/c;->a:Lig/c;

    sget-object v1, Lig/c;->b:Lig/c;

    filled-new-array {v0, v1}, [Lig/c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lig/c;
    .locals 1

    const-class v0, Lig/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lig/c;

    return-object p0
.end method

.method public static values()[Lig/c;
    .locals 1

    sget-object v0, Lig/c;->c:[Lig/c;

    invoke-virtual {v0}, [Lig/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lig/c;

    return-object v0
.end method
