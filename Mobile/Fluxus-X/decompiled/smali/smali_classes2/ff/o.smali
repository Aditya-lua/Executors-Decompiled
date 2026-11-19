.class public final enum Lff/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lff/o;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lff/o;

.field public static final enum b:Lff/o;

.field public static final enum c:Lff/o;

.field public static final enum d:Lff/o;

.field public static final enum e:Lff/o;

.field public static final synthetic f:[Lff/o;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lff/o;

    const-string v1, "SHA1"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lff/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lff/o;->a:Lff/o;

    new-instance v1, Lff/o;

    const-string v2, "SHA224"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lff/o;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lff/o;->b:Lff/o;

    new-instance v2, Lff/o;

    const-string v3, "SHA256"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lff/o;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lff/o;->c:Lff/o;

    new-instance v3, Lff/o;

    const-string v4, "SHA384"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lff/o;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lff/o;->d:Lff/o;

    new-instance v4, Lff/o;

    const-string v5, "SHA512"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lff/o;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lff/o;->e:Lff/o;

    filled-new-array {v0, v1, v2, v3, v4}, [Lff/o;

    move-result-object v0

    sput-object v0, Lff/o;->f:[Lff/o;

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

.method public static valueOf(Ljava/lang/String;)Lff/o;
    .locals 1

    const-class v0, Lff/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lff/o;

    return-object p0
.end method

.method public static values()[Lff/o;
    .locals 1

    sget-object v0, Lff/o;->f:[Lff/o;

    invoke-virtual {v0}, [Lff/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lff/o;

    return-object v0
.end method
