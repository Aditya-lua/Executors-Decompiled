.class public final enum Lnf/z$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnf/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnf/z$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lnf/z$c;

.field public static final enum b:Lnf/z$c;

.field public static final enum c:Lnf/z$c;

.field public static final enum d:Lnf/z$c;

.field public static final synthetic e:[Lnf/z$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnf/z$c;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnf/z$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnf/z$c;->a:Lnf/z$c;

    new-instance v0, Lnf/z$c;

    const-string v1, "QUEUING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lnf/z$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnf/z$c;->b:Lnf/z$c;

    new-instance v0, Lnf/z$c;

    const-string v1, "QUEUED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lnf/z$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnf/z$c;->c:Lnf/z$c;

    new-instance v0, Lnf/z$c;

    const-string v1, "RUNNING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lnf/z$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnf/z$c;->d:Lnf/z$c;

    invoke-static {}, Lnf/z$c;->a()[Lnf/z$c;

    move-result-object v0

    sput-object v0, Lnf/z$c;->e:[Lnf/z$c;

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

.method public static synthetic a()[Lnf/z$c;
    .locals 4

    sget-object v0, Lnf/z$c;->a:Lnf/z$c;

    sget-object v1, Lnf/z$c;->b:Lnf/z$c;

    sget-object v2, Lnf/z$c;->c:Lnf/z$c;

    sget-object v3, Lnf/z$c;->d:Lnf/z$c;

    filled-new-array {v0, v1, v2, v3}, [Lnf/z$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnf/z$c;
    .locals 1

    const-class v0, Lnf/z$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnf/z$c;

    return-object p0
.end method

.method public static values()[Lnf/z$c;
    .locals 1

    sget-object v0, Lnf/z$c;->e:[Lnf/z$c;

    invoke-virtual {v0}, [Lnf/z$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnf/z$c;

    return-object v0
.end method
