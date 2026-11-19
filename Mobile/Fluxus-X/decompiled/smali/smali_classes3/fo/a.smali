.class public final enum Lfo/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfo/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lfo/a;

.field public static final enum b:Lfo/a;

.field public static final enum c:Lfo/a;

.field public static final synthetic d:[Lfo/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfo/a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfo/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfo/a;->a:Lfo/a;

    new-instance v0, Lfo/a;

    const-string v1, "BLOCKS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lfo/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfo/a;->b:Lfo/a;

    new-instance v0, Lfo/a;

    const-string v1, "BLOCKS_AND_INLINES"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lfo/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfo/a;->c:Lfo/a;

    invoke-static {}, Lfo/a;->a()[Lfo/a;

    move-result-object v0

    sput-object v0, Lfo/a;->d:[Lfo/a;

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

.method public static synthetic a()[Lfo/a;
    .locals 3

    sget-object v0, Lfo/a;->a:Lfo/a;

    sget-object v1, Lfo/a;->b:Lfo/a;

    sget-object v2, Lfo/a;->c:Lfo/a;

    filled-new-array {v0, v1, v2}, [Lfo/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfo/a;
    .locals 1

    const-class v0, Lfo/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfo/a;

    return-object p0
.end method

.method public static values()[Lfo/a;
    .locals 1

    sget-object v0, Lfo/a;->d:[Lfo/a;

    invoke-virtual {v0}, [Lfo/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfo/a;

    return-object v0
.end method
