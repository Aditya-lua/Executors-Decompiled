.class public final enum Lkg/x;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkg/x;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lkg/x;

.field public static final enum b:Lkg/x;

.field public static final enum c:Lkg/x;

.field public static final synthetic d:[Lkg/x;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkg/x;

    const-string v1, "LENIENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkg/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/x;->a:Lkg/x;

    new-instance v0, Lkg/x;

    const-string v1, "LEGACY_STRICT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkg/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/x;->b:Lkg/x;

    new-instance v0, Lkg/x;

    const-string v1, "STRICT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkg/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/x;->c:Lkg/x;

    invoke-static {}, Lkg/x;->a()[Lkg/x;

    move-result-object v0

    sput-object v0, Lkg/x;->d:[Lkg/x;

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

.method public static synthetic a()[Lkg/x;
    .locals 3

    sget-object v0, Lkg/x;->a:Lkg/x;

    sget-object v1, Lkg/x;->b:Lkg/x;

    sget-object v2, Lkg/x;->c:Lkg/x;

    filled-new-array {v0, v1, v2}, [Lkg/x;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkg/x;
    .locals 1

    const-class v0, Lkg/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkg/x;

    return-object p0
.end method

.method public static values()[Lkg/x;
    .locals 1

    sget-object v0, Lkg/x;->d:[Lkg/x;

    invoke-virtual {v0}, [Lkg/x;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkg/x;

    return-object v0
.end method
