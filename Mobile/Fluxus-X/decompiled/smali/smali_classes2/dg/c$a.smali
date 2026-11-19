.class public final enum Ldg/c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldg/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldg/c$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ldg/c$a;

.field public static final enum b:Ldg/c$a;

.field public static final enum c:Ldg/c$a;

.field public static final enum d:Ldg/c$a;

.field public static final enum e:Ldg/c$a;

.field public static final synthetic f:[Ldg/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldg/c$a;

    const-string v1, "ATTEMPT_MIGRATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldg/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg/c$a;->a:Ldg/c$a;

    new-instance v0, Ldg/c$a;

    const-string v1, "NOT_GENERATED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ldg/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg/c$a;->b:Ldg/c$a;

    new-instance v0, Ldg/c$a;

    const-string v1, "UNREGISTERED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ldg/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg/c$a;->c:Ldg/c$a;

    new-instance v0, Ldg/c$a;

    const-string v1, "REGISTERED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ldg/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg/c$a;->d:Ldg/c$a;

    new-instance v0, Ldg/c$a;

    const-string v1, "REGISTER_ERROR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ldg/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg/c$a;->e:Ldg/c$a;

    invoke-static {}, Ldg/c$a;->a()[Ldg/c$a;

    move-result-object v0

    sput-object v0, Ldg/c$a;->f:[Ldg/c$a;

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

.method public static synthetic a()[Ldg/c$a;
    .locals 5

    sget-object v0, Ldg/c$a;->a:Ldg/c$a;

    sget-object v1, Ldg/c$a;->b:Ldg/c$a;

    sget-object v2, Ldg/c$a;->c:Ldg/c$a;

    sget-object v3, Ldg/c$a;->d:Ldg/c$a;

    sget-object v4, Ldg/c$a;->e:Ldg/c$a;

    filled-new-array {v0, v1, v2, v3, v4}, [Ldg/c$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldg/c$a;
    .locals 1

    const-class v0, Ldg/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldg/c$a;

    return-object p0
.end method

.method public static values()[Ldg/c$a;
    .locals 1

    sget-object v0, Ldg/c$a;->f:[Ldg/c$a;

    invoke-virtual {v0}, [Ldg/c$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldg/c$a;

    return-object v0
.end method
