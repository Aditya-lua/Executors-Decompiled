.class public final enum Lhg/a$d;
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
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhg/a$d;",
        ">;",
        "Lwf/c;"
    }
.end annotation


# static fields
.field public static final enum b:Lhg/a$d;

.field public static final enum c:Lhg/a$d;

.field public static final enum d:Lhg/a$d;

.field public static final enum e:Lhg/a$d;

.field public static final synthetic f:[Lhg/a$d;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhg/a$d;

    const-string v1, "UNKNOWN_OS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lhg/a$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhg/a$d;->b:Lhg/a$d;

    new-instance v0, Lhg/a$d;

    const-string v1, "ANDROID"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lhg/a$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhg/a$d;->c:Lhg/a$d;

    new-instance v0, Lhg/a$d;

    const-string v1, "IOS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lhg/a$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhg/a$d;->d:Lhg/a$d;

    new-instance v0, Lhg/a$d;

    const-string v1, "WEB"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lhg/a$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhg/a$d;->e:Lhg/a$d;

    invoke-static {}, Lhg/a$d;->a()[Lhg/a$d;

    move-result-object v0

    sput-object v0, Lhg/a$d;->f:[Lhg/a$d;

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

    iput p3, p0, Lhg/a$d;->a:I

    return-void
.end method

.method public static synthetic a()[Lhg/a$d;
    .locals 4

    sget-object v0, Lhg/a$d;->b:Lhg/a$d;

    sget-object v1, Lhg/a$d;->c:Lhg/a$d;

    sget-object v2, Lhg/a$d;->d:Lhg/a$d;

    sget-object v3, Lhg/a$d;->e:Lhg/a$d;

    filled-new-array {v0, v1, v2, v3}, [Lhg/a$d;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhg/a$d;
    .locals 1

    const-class v0, Lhg/a$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhg/a$d;

    return-object p0
.end method

.method public static values()[Lhg/a$d;
    .locals 1

    sget-object v0, Lhg/a$d;->f:[Lhg/a$d;

    invoke-virtual {v0}, [Lhg/a$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhg/a$d;

    return-object v0
.end method


# virtual methods
.method public getNumber()I
    .locals 1

    iget v0, p0, Lhg/a$d;->a:I

    return v0
.end method
