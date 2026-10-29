.class public final enum Lcg/f$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcg/f$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcg/f$b;

.field public static final enum b:Lcg/f$b;

.field public static final enum c:Lcg/f$b;

.field public static final synthetic d:[Lcg/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcg/f$b;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcg/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcg/f$b;->a:Lcg/f$b;

    new-instance v0, Lcg/f$b;

    const-string v1, "BAD_CONFIG"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcg/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcg/f$b;->b:Lcg/f$b;

    new-instance v0, Lcg/f$b;

    const-string v1, "AUTH_ERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcg/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcg/f$b;->c:Lcg/f$b;

    invoke-static {}, Lcg/f$b;->a()[Lcg/f$b;

    move-result-object v0

    sput-object v0, Lcg/f$b;->d:[Lcg/f$b;

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

.method public static synthetic a()[Lcg/f$b;
    .locals 3

    sget-object v0, Lcg/f$b;->a:Lcg/f$b;

    sget-object v1, Lcg/f$b;->b:Lcg/f$b;

    sget-object v2, Lcg/f$b;->c:Lcg/f$b;

    filled-new-array {v0, v1, v2}, [Lcg/f$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcg/f$b;
    .locals 1

    const-class v0, Lcg/f$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcg/f$b;

    return-object p0
.end method

.method public static values()[Lcg/f$b;
    .locals 1

    sget-object v0, Lcg/f$b;->d:[Lcg/f$b;

    invoke-virtual {v0}, [Lcg/f$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcg/f$b;

    return-object v0
.end method
