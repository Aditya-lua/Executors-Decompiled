.class public final enum Lg0/f0$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg0/f0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lg0/f0$a;

.field public static final enum b:Lg0/f0$a;

.field public static final enum c:Lg0/f0$a;

.field public static final enum d:Lg0/f0$a;

.field public static final enum e:Lg0/f0$a;

.field public static final synthetic f:[Lg0/f0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg0/f0$a;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg0/f0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg0/f0$a;->a:Lg0/f0$a;

    new-instance v0, Lg0/f0$a;

    const-string v1, "INITIALIZING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lg0/f0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg0/f0$a;->b:Lg0/f0$a;

    new-instance v0, Lg0/f0$a;

    const-string v1, "INITIALIZING_ERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lg0/f0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg0/f0$a;->c:Lg0/f0$a;

    new-instance v0, Lg0/f0$a;

    const-string v1, "INITIALIZED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lg0/f0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg0/f0$a;->d:Lg0/f0$a;

    new-instance v0, Lg0/f0$a;

    const-string v1, "SHUTDOWN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lg0/f0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg0/f0$a;->e:Lg0/f0$a;

    invoke-static {}, Lg0/f0$a;->a()[Lg0/f0$a;

    move-result-object v0

    sput-object v0, Lg0/f0$a;->f:[Lg0/f0$a;

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

.method public static synthetic a()[Lg0/f0$a;
    .locals 5

    sget-object v0, Lg0/f0$a;->a:Lg0/f0$a;

    sget-object v1, Lg0/f0$a;->b:Lg0/f0$a;

    sget-object v2, Lg0/f0$a;->c:Lg0/f0$a;

    sget-object v3, Lg0/f0$a;->d:Lg0/f0$a;

    sget-object v4, Lg0/f0$a;->e:Lg0/f0$a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lg0/f0$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lg0/f0$a;
    .locals 1

    const-class v0, Lg0/f0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg0/f0$a;

    return-object p0
.end method

.method public static values()[Lg0/f0$a;
    .locals 1

    sget-object v0, Lg0/f0$a;->f:[Lg0/f0$a;

    invoke-virtual {v0}, [Lg0/f0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg0/f0$a;

    return-object v0
.end method
