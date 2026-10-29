.class public final enum Lfg/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Luf/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfg/a$c;",
        ">;",
        "Luf/c;"
    }
.end annotation


# static fields
.field public static final enum b:Lfg/a$c;

.field public static final enum c:Lfg/a$c;

.field public static final enum d:Lfg/a$c;

.field public static final enum e:Lfg/a$c;

.field public static final synthetic f:[Lfg/a$c;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfg/a$c;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lfg/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lfg/a$c;->b:Lfg/a$c;

    new-instance v0, Lfg/a$c;

    const-string v1, "DATA_MESSAGE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lfg/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lfg/a$c;->c:Lfg/a$c;

    new-instance v0, Lfg/a$c;

    const-string v1, "TOPIC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lfg/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lfg/a$c;->d:Lfg/a$c;

    new-instance v0, Lfg/a$c;

    const-string v1, "DISPLAY_NOTIFICATION"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lfg/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lfg/a$c;->e:Lfg/a$c;

    invoke-static {}, Lfg/a$c;->a()[Lfg/a$c;

    move-result-object v0

    sput-object v0, Lfg/a$c;->f:[Lfg/a$c;

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

    iput p3, p0, Lfg/a$c;->a:I

    return-void
.end method

.method public static synthetic a()[Lfg/a$c;
    .locals 4

    sget-object v0, Lfg/a$c;->b:Lfg/a$c;

    sget-object v1, Lfg/a$c;->c:Lfg/a$c;

    sget-object v2, Lfg/a$c;->d:Lfg/a$c;

    sget-object v3, Lfg/a$c;->e:Lfg/a$c;

    filled-new-array {v0, v1, v2, v3}, [Lfg/a$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfg/a$c;
    .locals 1

    const-class v0, Lfg/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfg/a$c;

    return-object p0
.end method

.method public static values()[Lfg/a$c;
    .locals 1

    sget-object v0, Lfg/a$c;->f:[Lfg/a$c;

    invoke-virtual {v0}, [Lfg/a$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfg/a$c;

    return-object v0
.end method


# virtual methods
.method public getNumber()I
    .locals 1

    iget v0, p0, Lfg/a$c;->a:I

    return v0
.end method
