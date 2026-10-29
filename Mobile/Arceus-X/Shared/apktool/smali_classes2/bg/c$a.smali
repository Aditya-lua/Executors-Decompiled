.class public final enum Lbg/c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbg/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbg/c$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lbg/c$a;

.field public static final enum b:Lbg/c$a;

.field public static final enum c:Lbg/c$a;

.field public static final enum d:Lbg/c$a;

.field public static final enum e:Lbg/c$a;

.field public static final synthetic f:[Lbg/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbg/c$a;

    const-string v1, "ATTEMPT_MIGRATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbg/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbg/c$a;->a:Lbg/c$a;

    new-instance v0, Lbg/c$a;

    const-string v1, "NOT_GENERATED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbg/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbg/c$a;->b:Lbg/c$a;

    new-instance v0, Lbg/c$a;

    const-string v1, "UNREGISTERED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lbg/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbg/c$a;->c:Lbg/c$a;

    new-instance v0, Lbg/c$a;

    const-string v1, "REGISTERED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lbg/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbg/c$a;->d:Lbg/c$a;

    new-instance v0, Lbg/c$a;

    const-string v1, "REGISTER_ERROR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lbg/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbg/c$a;->e:Lbg/c$a;

    invoke-static {}, Lbg/c$a;->a()[Lbg/c$a;

    move-result-object v0

    sput-object v0, Lbg/c$a;->f:[Lbg/c$a;

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

.method public static synthetic a()[Lbg/c$a;
    .locals 5

    sget-object v0, Lbg/c$a;->a:Lbg/c$a;

    sget-object v1, Lbg/c$a;->b:Lbg/c$a;

    sget-object v2, Lbg/c$a;->c:Lbg/c$a;

    sget-object v3, Lbg/c$a;->d:Lbg/c$a;

    sget-object v4, Lbg/c$a;->e:Lbg/c$a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lbg/c$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lbg/c$a;
    .locals 1

    const-class v0, Lbg/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbg/c$a;

    return-object p0
.end method

.method public static values()[Lbg/c$a;
    .locals 1

    sget-object v0, Lbg/c$a;->f:[Lbg/c$a;

    invoke-virtual {v0}, [Lbg/c$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbg/c$a;

    return-object v0
.end method
