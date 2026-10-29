.class public final enum Ll7/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ll7/b$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ll7/b$a;

.field public static final enum b:Ll7/b$a;

.field public static final enum c:Ll7/b$a;

.field public static final synthetic d:[Ll7/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ll7/b$a;

    const-string v1, "LEFT_ALIGN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll7/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll7/b$a;->a:Ll7/b$a;

    new-instance v0, Ll7/b$a;

    const-string v1, "RIGHT_ALIGN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll7/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll7/b$a;->b:Ll7/b$a;

    new-instance v0, Ll7/b$a;

    const-string v1, "CENTER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll7/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll7/b$a;->c:Ll7/b$a;

    invoke-static {}, Ll7/b$a;->a()[Ll7/b$a;

    move-result-object v0

    sput-object v0, Ll7/b$a;->d:[Ll7/b$a;

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

.method public static synthetic a()[Ll7/b$a;
    .locals 3

    sget-object v0, Ll7/b$a;->a:Ll7/b$a;

    sget-object v1, Ll7/b$a;->b:Ll7/b$a;

    sget-object v2, Ll7/b$a;->c:Ll7/b$a;

    filled-new-array {v0, v1, v2}, [Ll7/b$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ll7/b$a;
    .locals 1

    const-class v0, Ll7/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll7/b$a;

    return-object p0
.end method

.method public static values()[Ll7/b$a;
    .locals 1

    sget-object v0, Ll7/b$a;->d:[Ll7/b$a;

    invoke-virtual {v0}, [Ll7/b$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll7/b$a;

    return-object v0
.end method
