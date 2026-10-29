.class public final enum Lkg/w$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkg/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkg/w$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lkg/w$a;

.field public static final enum b:Lkg/w$a;

.field public static final enum c:Lkg/w$a;

.field public static final enum d:Lkg/w$a;

.field public static final synthetic e:[Lkg/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkg/w$a;

    const-string v1, "ALLOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkg/w$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/w$a;->a:Lkg/w$a;

    new-instance v0, Lkg/w$a;

    const-string v1, "INDECISIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkg/w$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/w$a;->b:Lkg/w$a;

    new-instance v0, Lkg/w$a;

    const-string v1, "BLOCK_INACCESSIBLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkg/w$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/w$a;->c:Lkg/w$a;

    new-instance v0, Lkg/w$a;

    const-string v1, "BLOCK_ALL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lkg/w$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/w$a;->d:Lkg/w$a;

    invoke-static {}, Lkg/w$a;->a()[Lkg/w$a;

    move-result-object v0

    sput-object v0, Lkg/w$a;->e:[Lkg/w$a;

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

.method public static synthetic a()[Lkg/w$a;
    .locals 4

    sget-object v0, Lkg/w$a;->a:Lkg/w$a;

    sget-object v1, Lkg/w$a;->b:Lkg/w$a;

    sget-object v2, Lkg/w$a;->c:Lkg/w$a;

    sget-object v3, Lkg/w$a;->d:Lkg/w$a;

    filled-new-array {v0, v1, v2, v3}, [Lkg/w$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkg/w$a;
    .locals 1

    const-class v0, Lkg/w$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkg/w$a;

    return-object p0
.end method

.method public static values()[Lkg/w$a;
    .locals 1

    sget-object v0, Lkg/w$a;->e:[Lkg/w$a;

    invoke-virtual {v0}, [Lkg/w$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkg/w$a;

    return-object v0
.end method
