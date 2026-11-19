.class public final enum Lgt/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lgt/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lgt/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "operations-stdlib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum a:Lgt/a;

.field public static final enum b:Lgt/a;

.field public static final enum c:Lgt/a;

.field public static final enum d:Lgt/a;

.field public static final enum e:Lgt/a;

.field public static final enum f:Lgt/a;

.field public static final enum g:Lgt/a;

.field public static final synthetic h:[Lgt/a;

.field public static final synthetic i:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgt/a;

    const-string v1, "MILLISECOND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgt/a;->a:Lgt/a;

    new-instance v0, Lgt/a;

    const-string v1, "SECOND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lgt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgt/a;->b:Lgt/a;

    new-instance v0, Lgt/a;

    const-string v1, "MINUTE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lgt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgt/a;->c:Lgt/a;

    new-instance v0, Lgt/a;

    const-string v1, "HOUR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lgt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgt/a;->d:Lgt/a;

    new-instance v0, Lgt/a;

    const-string v1, "DAY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lgt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgt/a;->e:Lgt/a;

    new-instance v0, Lgt/a;

    const-string v1, "MONTH"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lgt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgt/a;->f:Lgt/a;

    new-instance v0, Lgt/a;

    const-string v1, "YEAR"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lgt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgt/a;->g:Lgt/a;

    invoke-static {}, Lgt/a;->a()[Lgt/a;

    move-result-object v0

    sput-object v0, Lgt/a;->h:[Lgt/a;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lgt/a;->i:Lhu/a;

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

.method public static final synthetic a()[Lgt/a;
    .locals 7

    sget-object v0, Lgt/a;->a:Lgt/a;

    sget-object v1, Lgt/a;->b:Lgt/a;

    sget-object v2, Lgt/a;->c:Lgt/a;

    sget-object v3, Lgt/a;->d:Lgt/a;

    sget-object v4, Lgt/a;->e:Lgt/a;

    sget-object v5, Lgt/a;->f:Lgt/a;

    sget-object v6, Lgt/a;->g:Lgt/a;

    filled-new-array/range {v0 .. v6}, [Lgt/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgt/a;
    .locals 1

    const-class v0, Lgt/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgt/a;

    return-object p0
.end method

.method public static values()[Lgt/a;
    .locals 1

    sget-object v0, Lgt/a;->h:[Lgt/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgt/a;

    return-object v0
.end method
