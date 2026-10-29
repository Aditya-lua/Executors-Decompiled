.class public final enum Lgg/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lgg/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lgg/c;

.field public static final enum b:Lgg/c;

.field public static final synthetic c:[Lgg/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgg/c;

    const-string v1, "LOW_POWER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgg/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgg/c;->a:Lgg/c;

    new-instance v0, Lgg/c;

    const-string v1, "HIGH_SPEED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lgg/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgg/c;->b:Lgg/c;

    invoke-static {}, Lgg/c;->a()[Lgg/c;

    move-result-object v0

    sput-object v0, Lgg/c;->c:[Lgg/c;

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

.method public static synthetic a()[Lgg/c;
    .locals 2

    sget-object v0, Lgg/c;->a:Lgg/c;

    sget-object v1, Lgg/c;->b:Lgg/c;

    filled-new-array {v0, v1}, [Lgg/c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgg/c;
    .locals 1

    const-class v0, Lgg/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgg/c;

    return-object p0
.end method

.method public static values()[Lgg/c;
    .locals 1

    sget-object v0, Lgg/c;->c:[Lgg/c;

    invoke-virtual {v0}, [Lgg/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgg/c;

    return-object v0
.end method
