.class public final enum Lsu/a$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsu/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lsu/a$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lsu/a$d;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum a:Lsu/a$d;

.field public static final enum b:Lsu/a$d;

.field public static final enum c:Lsu/a$d;

.field public static final enum d:Lsu/a$d;

.field public static final enum e:Lsu/a$d;

.field public static final synthetic f:[Lsu/a$d;

.field public static final synthetic g:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lsu/a$d;

    const-string v1, "CPU_ACQUIRED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lsu/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsu/a$d;->a:Lsu/a$d;

    new-instance v0, Lsu/a$d;

    const-string v1, "BLOCKING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lsu/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsu/a$d;->b:Lsu/a$d;

    new-instance v0, Lsu/a$d;

    const-string v1, "PARKING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lsu/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsu/a$d;->c:Lsu/a$d;

    new-instance v0, Lsu/a$d;

    const-string v1, "DORMANT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lsu/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsu/a$d;->d:Lsu/a$d;

    new-instance v0, Lsu/a$d;

    const-string v1, "TERMINATED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lsu/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsu/a$d;->e:Lsu/a$d;

    invoke-static {}, Lsu/a$d;->a()[Lsu/a$d;

    move-result-object v0

    sput-object v0, Lsu/a$d;->f:[Lsu/a$d;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lsu/a$d;->g:Lqt/a;

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

.method public static final synthetic a()[Lsu/a$d;
    .locals 5

    sget-object v0, Lsu/a$d;->a:Lsu/a$d;

    sget-object v1, Lsu/a$d;->b:Lsu/a$d;

    sget-object v2, Lsu/a$d;->c:Lsu/a$d;

    sget-object v3, Lsu/a$d;->d:Lsu/a$d;

    sget-object v4, Lsu/a$d;->e:Lsu/a$d;

    filled-new-array {v0, v1, v2, v3, v4}, [Lsu/a$d;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lsu/a$d;
    .locals 1

    const-class v0, Lsu/a$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsu/a$d;

    return-object p0
.end method

.method public static values()[Lsu/a$d;
    .locals 1

    sget-object v0, Lsu/a$d;->f:[Lsu/a$d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsu/a$d;

    return-object v0
.end method
