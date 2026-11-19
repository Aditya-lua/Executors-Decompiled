.class public final enum Lj5/c$a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj5/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj5/c$a$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0082\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lj5/c$a$b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
        "sqlite-framework"
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
.field public static final enum a:Lj5/c$a$b;

.field public static final enum b:Lj5/c$a$b;

.field public static final enum c:Lj5/c$a$b;

.field public static final enum d:Lj5/c$a$b;

.field public static final enum e:Lj5/c$a$b;

.field public static final synthetic f:[Lj5/c$a$b;

.field public static final synthetic g:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lj5/c$a$b;

    const-string v1, "END"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj5/c$a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj5/c$a$b;->a:Lj5/c$a$b;

    new-instance v0, Lj5/c$a$b;

    const-string v1, "ROLLBACK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lj5/c$a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj5/c$a$b;->b:Lj5/c$a$b;

    new-instance v0, Lj5/c$a$b;

    const-string v1, "BEGIN_EXCLUSIVE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lj5/c$a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj5/c$a$b;->c:Lj5/c$a$b;

    new-instance v0, Lj5/c$a$b;

    const-string v1, "BEGIN_IMMEDIATE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lj5/c$a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj5/c$a$b;->d:Lj5/c$a$b;

    new-instance v0, Lj5/c$a$b;

    const-string v1, "BEGIN_DEFERRED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lj5/c$a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj5/c$a$b;->e:Lj5/c$a$b;

    invoke-static {}, Lj5/c$a$b;->a()[Lj5/c$a$b;

    move-result-object v0

    sput-object v0, Lj5/c$a$b;->f:[Lj5/c$a$b;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lj5/c$a$b;->g:Lhu/a;

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

.method public static final synthetic a()[Lj5/c$a$b;
    .locals 5

    sget-object v0, Lj5/c$a$b;->a:Lj5/c$a$b;

    sget-object v1, Lj5/c$a$b;->b:Lj5/c$a$b;

    sget-object v2, Lj5/c$a$b;->c:Lj5/c$a$b;

    sget-object v3, Lj5/c$a$b;->d:Lj5/c$a$b;

    sget-object v4, Lj5/c$a$b;->e:Lj5/c$a$b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lj5/c$a$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lj5/c$a$b;
    .locals 1

    const-class v0, Lj5/c$a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj5/c$a$b;

    return-object p0
.end method

.method public static values()[Lj5/c$a$b;
    .locals 1

    sget-object v0, Lj5/c$a$b;->f:[Lj5/c$a$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj5/c$a$b;

    return-object v0
.end method
