.class public final enum Lf4/c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf4/c$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0080\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lf4/c$a;",
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
        "h",
        "i",
        "fragment_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum a:Lf4/c$a;

.field public static final enum b:Lf4/c$a;

.field public static final enum c:Lf4/c$a;

.field public static final enum d:Lf4/c$a;

.field public static final enum e:Lf4/c$a;

.field public static final enum f:Lf4/c$a;

.field public static final enum g:Lf4/c$a;

.field public static final enum h:Lf4/c$a;

.field public static final enum i:Lf4/c$a;

.field public static final synthetic j:[Lf4/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf4/c$a;

    const-string v1, "PENALTY_LOG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf4/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf4/c$a;->a:Lf4/c$a;

    new-instance v0, Lf4/c$a;

    const-string v1, "PENALTY_DEATH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf4/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf4/c$a;->b:Lf4/c$a;

    new-instance v0, Lf4/c$a;

    const-string v1, "DETECT_FRAGMENT_REUSE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf4/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf4/c$a;->c:Lf4/c$a;

    new-instance v0, Lf4/c$a;

    const-string v1, "DETECT_FRAGMENT_TAG_USAGE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf4/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf4/c$a;->d:Lf4/c$a;

    new-instance v0, Lf4/c$a;

    const-string v1, "DETECT_WRONG_NESTED_HIERARCHY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lf4/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf4/c$a;->e:Lf4/c$a;

    new-instance v0, Lf4/c$a;

    const-string v1, "DETECT_RETAIN_INSTANCE_USAGE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lf4/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf4/c$a;->f:Lf4/c$a;

    new-instance v0, Lf4/c$a;

    const-string v1, "DETECT_SET_USER_VISIBLE_HINT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lf4/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf4/c$a;->g:Lf4/c$a;

    new-instance v0, Lf4/c$a;

    const-string v1, "DETECT_TARGET_FRAGMENT_USAGE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lf4/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf4/c$a;->h:Lf4/c$a;

    new-instance v0, Lf4/c$a;

    const-string v1, "DETECT_WRONG_FRAGMENT_CONTAINER"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lf4/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf4/c$a;->i:Lf4/c$a;

    invoke-static {}, Lf4/c$a;->a()[Lf4/c$a;

    move-result-object v0

    sput-object v0, Lf4/c$a;->j:[Lf4/c$a;

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

.method public static final synthetic a()[Lf4/c$a;
    .locals 9

    sget-object v0, Lf4/c$a;->a:Lf4/c$a;

    sget-object v1, Lf4/c$a;->b:Lf4/c$a;

    sget-object v2, Lf4/c$a;->c:Lf4/c$a;

    sget-object v3, Lf4/c$a;->d:Lf4/c$a;

    sget-object v4, Lf4/c$a;->e:Lf4/c$a;

    sget-object v5, Lf4/c$a;->f:Lf4/c$a;

    sget-object v6, Lf4/c$a;->g:Lf4/c$a;

    sget-object v7, Lf4/c$a;->h:Lf4/c$a;

    sget-object v8, Lf4/c$a;->i:Lf4/c$a;

    filled-new-array/range {v0 .. v8}, [Lf4/c$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf4/c$a;
    .locals 1

    const-class v0, Lf4/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf4/c$a;

    return-object p0
.end method

.method public static values()[Lf4/c$a;
    .locals 1

    sget-object v0, Lf4/c$a;->j:[Lf4/c$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf4/c$a;

    return-object v0
.end method
