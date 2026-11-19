.class public final enum Lik/q2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lik/q2;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lik/q2;

.field public static final enum b:Lik/q2;

.field public static final synthetic c:[Lik/q2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lik/q2;

    const-string v1, "ROBLOX"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lik/q2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lik/q2;->a:Lik/q2;

    new-instance v0, Lik/q2;

    const-string v1, "ZSTD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lik/q2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lik/q2;->b:Lik/q2;

    invoke-static {}, Lik/q2;->a()[Lik/q2;

    move-result-object v0

    sput-object v0, Lik/q2;->c:[Lik/q2;

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

.method public static synthetic a()[Lik/q2;
    .locals 2

    sget-object v0, Lik/q2;->a:Lik/q2;

    sget-object v1, Lik/q2;->b:Lik/q2;

    filled-new-array {v0, v1}, [Lik/q2;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lik/q2;
    .locals 1

    const-class v0, Lik/q2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lik/q2;

    return-object p0
.end method

.method public static values()[Lik/q2;
    .locals 1

    sget-object v0, Lik/q2;->c:[Lik/q2;

    invoke-virtual {v0}, [Lik/q2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lik/q2;

    return-object v0
.end method
