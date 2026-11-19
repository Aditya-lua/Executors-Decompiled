.class public final enum Ld2/f$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ld2/f$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ld2/f$a;

.field public static final enum b:Ld2/f$a;

.field public static final enum c:Ld2/f$a;

.field public static final enum d:Ld2/f$a;

.field public static final enum e:Ld2/f$a;

.field public static final enum f:Ld2/f$a;

.field public static final enum g:Ld2/f$a;

.field public static final enum h:Ld2/f$a;

.field public static final synthetic i:[Ld2/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld2/f$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld2/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld2/f$a;->a:Ld2/f$a;

    new-instance v0, Ld2/f$a;

    const-string v1, "HORIZONTAL_DIMENSION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ld2/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld2/f$a;->b:Ld2/f$a;

    new-instance v0, Ld2/f$a;

    const-string v1, "VERTICAL_DIMENSION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ld2/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld2/f$a;->c:Ld2/f$a;

    new-instance v0, Ld2/f$a;

    const-string v1, "LEFT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ld2/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld2/f$a;->d:Ld2/f$a;

    new-instance v0, Ld2/f$a;

    const-string v1, "RIGHT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ld2/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld2/f$a;->e:Ld2/f$a;

    new-instance v0, Ld2/f$a;

    const-string v1, "TOP"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ld2/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld2/f$a;->f:Ld2/f$a;

    new-instance v0, Ld2/f$a;

    const-string v1, "BOTTOM"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ld2/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld2/f$a;->g:Ld2/f$a;

    new-instance v0, Ld2/f$a;

    const-string v1, "BASELINE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Ld2/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld2/f$a;->h:Ld2/f$a;

    invoke-static {}, Ld2/f$a;->a()[Ld2/f$a;

    move-result-object v0

    sput-object v0, Ld2/f$a;->i:[Ld2/f$a;

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

.method public static synthetic a()[Ld2/f$a;
    .locals 8

    sget-object v0, Ld2/f$a;->a:Ld2/f$a;

    sget-object v1, Ld2/f$a;->b:Ld2/f$a;

    sget-object v2, Ld2/f$a;->c:Ld2/f$a;

    sget-object v3, Ld2/f$a;->d:Ld2/f$a;

    sget-object v4, Ld2/f$a;->e:Ld2/f$a;

    sget-object v5, Ld2/f$a;->f:Ld2/f$a;

    sget-object v6, Ld2/f$a;->g:Ld2/f$a;

    sget-object v7, Ld2/f$a;->h:Ld2/f$a;

    filled-new-array/range {v0 .. v7}, [Ld2/f$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ld2/f$a;
    .locals 1

    const-class v0, Ld2/f$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld2/f$a;

    return-object p0
.end method

.method public static values()[Ld2/f$a;
    .locals 1

    sget-object v0, Ld2/f$a;->i:[Ld2/f$a;

    invoke-virtual {v0}, [Ld2/f$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld2/f$a;

    return-object v0
.end method
