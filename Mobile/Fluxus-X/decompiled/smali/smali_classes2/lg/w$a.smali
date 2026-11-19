.class public final enum Llg/w$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llg/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llg/w$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Llg/w$a;

.field public static final enum b:Llg/w$a;

.field public static final enum c:Llg/w$a;

.field public static final enum d:Llg/w$a;

.field public static final synthetic e:[Llg/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llg/w$a;

    const-string v1, "ALLOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llg/w$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/w$a;->a:Llg/w$a;

    new-instance v0, Llg/w$a;

    const-string v1, "INDECISIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llg/w$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/w$a;->b:Llg/w$a;

    new-instance v0, Llg/w$a;

    const-string v1, "BLOCK_INACCESSIBLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llg/w$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/w$a;->c:Llg/w$a;

    new-instance v0, Llg/w$a;

    const-string v1, "BLOCK_ALL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Llg/w$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/w$a;->d:Llg/w$a;

    invoke-static {}, Llg/w$a;->a()[Llg/w$a;

    move-result-object v0

    sput-object v0, Llg/w$a;->e:[Llg/w$a;

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

.method public static synthetic a()[Llg/w$a;
    .locals 4

    sget-object v0, Llg/w$a;->a:Llg/w$a;

    sget-object v1, Llg/w$a;->b:Llg/w$a;

    sget-object v2, Llg/w$a;->c:Llg/w$a;

    sget-object v3, Llg/w$a;->d:Llg/w$a;

    filled-new-array {v0, v1, v2, v3}, [Llg/w$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llg/w$a;
    .locals 1

    const-class v0, Llg/w$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llg/w$a;

    return-object p0
.end method

.method public static values()[Llg/w$a;
    .locals 1

    sget-object v0, Llg/w$a;->e:[Llg/w$a;

    invoke-virtual {v0}, [Llg/w$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llg/w$a;

    return-object v0
.end method
