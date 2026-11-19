.class public final enum Leg/f$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Leg/f$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Leg/f$b;

.field public static final enum b:Leg/f$b;

.field public static final enum c:Leg/f$b;

.field public static final synthetic d:[Leg/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Leg/f$b;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Leg/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leg/f$b;->a:Leg/f$b;

    new-instance v0, Leg/f$b;

    const-string v1, "BAD_CONFIG"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Leg/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leg/f$b;->b:Leg/f$b;

    new-instance v0, Leg/f$b;

    const-string v1, "AUTH_ERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Leg/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leg/f$b;->c:Leg/f$b;

    invoke-static {}, Leg/f$b;->a()[Leg/f$b;

    move-result-object v0

    sput-object v0, Leg/f$b;->d:[Leg/f$b;

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

.method public static synthetic a()[Leg/f$b;
    .locals 3

    sget-object v0, Leg/f$b;->a:Leg/f$b;

    sget-object v1, Leg/f$b;->b:Leg/f$b;

    sget-object v2, Leg/f$b;->c:Leg/f$b;

    filled-new-array {v0, v1, v2}, [Leg/f$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Leg/f$b;
    .locals 1

    const-class v0, Leg/f$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leg/f$b;

    return-object p0
.end method

.method public static values()[Leg/f$b;
    .locals 1

    sget-object v0, Leg/f$b;->d:[Leg/f$b;

    invoke-virtual {v0}, [Leg/f$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leg/f$b;

    return-object v0
.end method
