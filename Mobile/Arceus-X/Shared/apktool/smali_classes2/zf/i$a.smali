.class public final enum Lzf/i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzf/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzf/i$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lzf/i$a;

.field public static final enum b:Lzf/i$a;

.field public static final enum c:Lzf/i$a;

.field public static final synthetic d:[Lzf/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lzf/i$a;

    const-string v1, "BAD_CONFIG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lzf/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzf/i$a;->a:Lzf/i$a;

    new-instance v0, Lzf/i$a;

    const-string v1, "UNAVAILABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lzf/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzf/i$a;->b:Lzf/i$a;

    new-instance v0, Lzf/i$a;

    const-string v1, "TOO_MANY_REQUESTS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lzf/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzf/i$a;->c:Lzf/i$a;

    invoke-static {}, Lzf/i$a;->a()[Lzf/i$a;

    move-result-object v0

    sput-object v0, Lzf/i$a;->d:[Lzf/i$a;

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

.method public static synthetic a()[Lzf/i$a;
    .locals 3

    sget-object v0, Lzf/i$a;->a:Lzf/i$a;

    sget-object v1, Lzf/i$a;->b:Lzf/i$a;

    sget-object v2, Lzf/i$a;->c:Lzf/i$a;

    filled-new-array {v0, v1, v2}, [Lzf/i$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lzf/i$a;
    .locals 1

    const-class v0, Lzf/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzf/i$a;

    return-object p0
.end method

.method public static values()[Lzf/i$a;
    .locals 1

    sget-object v0, Lzf/i$a;->d:[Lzf/i$a;

    invoke-virtual {v0}, [Lzf/i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzf/i$a;

    return-object v0
.end method
