.class public final enum Lg0/w$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg0/w$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lg0/w$b;

.field public static final enum b:Lg0/w$b;

.field public static final enum c:Lg0/w$b;

.field public static final enum d:Lg0/w$b;

.field public static final enum e:Lg0/w$b;

.field public static final synthetic f:[Lg0/w$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg0/w$b;

    const-string v1, "PENDING_OPEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg0/w$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg0/w$b;->a:Lg0/w$b;

    new-instance v0, Lg0/w$b;

    const-string v1, "OPENING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lg0/w$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg0/w$b;->b:Lg0/w$b;

    new-instance v0, Lg0/w$b;

    const-string v1, "OPEN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lg0/w$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg0/w$b;->c:Lg0/w$b;

    new-instance v0, Lg0/w$b;

    const-string v1, "CLOSING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lg0/w$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg0/w$b;->d:Lg0/w$b;

    new-instance v0, Lg0/w$b;

    const-string v1, "CLOSED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lg0/w$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg0/w$b;->e:Lg0/w$b;

    invoke-static {}, Lg0/w$b;->a()[Lg0/w$b;

    move-result-object v0

    sput-object v0, Lg0/w$b;->f:[Lg0/w$b;

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

.method public static synthetic a()[Lg0/w$b;
    .locals 5

    sget-object v0, Lg0/w$b;->a:Lg0/w$b;

    sget-object v1, Lg0/w$b;->b:Lg0/w$b;

    sget-object v2, Lg0/w$b;->c:Lg0/w$b;

    sget-object v3, Lg0/w$b;->d:Lg0/w$b;

    sget-object v4, Lg0/w$b;->e:Lg0/w$b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lg0/w$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lg0/w$b;
    .locals 1

    const-class v0, Lg0/w$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg0/w$b;

    return-object p0
.end method

.method public static values()[Lg0/w$b;
    .locals 1

    sget-object v0, Lg0/w$b;->f:[Lg0/w$b;

    invoke-virtual {v0}, [Lg0/w$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg0/w$b;

    return-object v0
.end method
