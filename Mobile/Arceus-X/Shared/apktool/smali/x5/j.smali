.class public final enum Lx5/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx5/j;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lx5/j;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "work-runtime_release"
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
.field public static final enum a:Lx5/j;

.field public static final enum b:Lx5/j;

.field public static final enum c:Lx5/j;

.field public static final enum d:Lx5/j;

.field public static final synthetic e:[Lx5/j;

.field public static final synthetic f:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lx5/j;

    const-string v1, "REPLACE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lx5/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx5/j;->a:Lx5/j;

    new-instance v0, Lx5/j;

    const-string v1, "KEEP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lx5/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx5/j;->b:Lx5/j;

    new-instance v0, Lx5/j;

    const-string v1, "APPEND"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lx5/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx5/j;->c:Lx5/j;

    new-instance v0, Lx5/j;

    const-string v1, "APPEND_OR_REPLACE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lx5/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx5/j;->d:Lx5/j;

    invoke-static {}, Lx5/j;->a()[Lx5/j;

    move-result-object v0

    sput-object v0, Lx5/j;->e:[Lx5/j;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lx5/j;->f:Lqt/a;

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

.method public static final synthetic a()[Lx5/j;
    .locals 4

    sget-object v0, Lx5/j;->a:Lx5/j;

    sget-object v1, Lx5/j;->b:Lx5/j;

    sget-object v2, Lx5/j;->c:Lx5/j;

    sget-object v3, Lx5/j;->d:Lx5/j;

    filled-new-array {v0, v1, v2, v3}, [Lx5/j;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lx5/j;
    .locals 1

    const-class v0, Lx5/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx5/j;

    return-object p0
.end method

.method public static values()[Lx5/j;
    .locals 1

    sget-object v0, Lx5/j;->e:[Lx5/j;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx5/j;

    return-object v0
.end method
