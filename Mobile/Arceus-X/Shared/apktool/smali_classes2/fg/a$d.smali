.class public final enum Lfg/a$d;
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
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfg/a$d;",
        ">;",
        "Luf/c;"
    }
.end annotation


# static fields
.field public static final enum b:Lfg/a$d;

.field public static final enum c:Lfg/a$d;

.field public static final enum d:Lfg/a$d;

.field public static final enum e:Lfg/a$d;

.field public static final synthetic f:[Lfg/a$d;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfg/a$d;

    const-string v1, "UNKNOWN_OS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lfg/a$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lfg/a$d;->b:Lfg/a$d;

    new-instance v0, Lfg/a$d;

    const-string v1, "ANDROID"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lfg/a$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lfg/a$d;->c:Lfg/a$d;

    new-instance v0, Lfg/a$d;

    const-string v1, "IOS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lfg/a$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lfg/a$d;->d:Lfg/a$d;

    new-instance v0, Lfg/a$d;

    const-string v1, "WEB"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lfg/a$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lfg/a$d;->e:Lfg/a$d;

    invoke-static {}, Lfg/a$d;->a()[Lfg/a$d;

    move-result-object v0

    sput-object v0, Lfg/a$d;->f:[Lfg/a$d;

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

    iput p3, p0, Lfg/a$d;->a:I

    return-void
.end method

.method public static synthetic a()[Lfg/a$d;
    .locals 4

    sget-object v0, Lfg/a$d;->b:Lfg/a$d;

    sget-object v1, Lfg/a$d;->c:Lfg/a$d;

    sget-object v2, Lfg/a$d;->d:Lfg/a$d;

    sget-object v3, Lfg/a$d;->e:Lfg/a$d;

    filled-new-array {v0, v1, v2, v3}, [Lfg/a$d;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfg/a$d;
    .locals 1

    const-class v0, Lfg/a$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfg/a$d;

    return-object p0
.end method

.method public static values()[Lfg/a$d;
    .locals 1

    sget-object v0, Lfg/a$d;->f:[Lfg/a$d;

    invoke-virtual {v0}, [Lfg/a$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfg/a$d;

    return-object v0
.end method


# virtual methods
.method public getNumber()I
    .locals 1

    iget v0, p0, Lfg/a$d;->a:I

    return v0
.end method
