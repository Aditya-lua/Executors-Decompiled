.class public final enum Lhg/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lwf/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhg/a$b;",
        ">;",
        "Lwf/c;"
    }
.end annotation


# static fields
.field public static final enum b:Lhg/a$b;

.field public static final enum c:Lhg/a$b;

.field public static final enum d:Lhg/a$b;

.field public static final synthetic e:[Lhg/a$b;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhg/a$b;

    const-string v1, "UNKNOWN_EVENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lhg/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhg/a$b;->b:Lhg/a$b;

    new-instance v0, Lhg/a$b;

    const-string v1, "MESSAGE_DELIVERED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lhg/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhg/a$b;->c:Lhg/a$b;

    new-instance v0, Lhg/a$b;

    const-string v1, "MESSAGE_OPEN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lhg/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhg/a$b;->d:Lhg/a$b;

    invoke-static {}, Lhg/a$b;->a()[Lhg/a$b;

    move-result-object v0

    sput-object v0, Lhg/a$b;->e:[Lhg/a$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lhg/a$b;->a:I

    return-void
.end method

.method public static synthetic a()[Lhg/a$b;
    .locals 3

    sget-object v0, Lhg/a$b;->b:Lhg/a$b;

    sget-object v1, Lhg/a$b;->c:Lhg/a$b;

    sget-object v2, Lhg/a$b;->d:Lhg/a$b;

    filled-new-array {v0, v1, v2}, [Lhg/a$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhg/a$b;
    .locals 1

    const-class v0, Lhg/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhg/a$b;

    return-object p0
.end method

.method public static values()[Lhg/a$b;
    .locals 1

    sget-object v0, Lhg/a$b;->e:[Lhg/a$b;

    invoke-virtual {v0}, [Lhg/a$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhg/a$b;

    return-object v0
.end method


# virtual methods
.method public getNumber()I
    .locals 1

    iget v0, p0, Lhg/a$b;->a:I

    return v0
.end method
