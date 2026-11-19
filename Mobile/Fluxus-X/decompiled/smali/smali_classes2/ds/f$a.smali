.class public final enum Lds/f$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lds/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lds/f$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lds/f$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "inquiry-types_release"
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
.field public static final enum a:Lds/f$a;

.field public static final enum b:Lds/f$a;

.field public static final synthetic c:[Lds/f$a;

.field public static final synthetic d:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lds/f$a;

    const-string v1, "Manual"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lds/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/f$a;->a:Lds/f$a;

    new-instance v0, Lds/f$a;

    const-string v1, "Auto"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lds/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/f$a;->b:Lds/f$a;

    invoke-static {}, Lds/f$a;->a()[Lds/f$a;

    move-result-object v0

    sput-object v0, Lds/f$a;->c:[Lds/f$a;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lds/f$a;->d:Lhu/a;

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

.method public static final synthetic a()[Lds/f$a;
    .locals 2

    sget-object v0, Lds/f$a;->a:Lds/f$a;

    sget-object v1, Lds/f$a;->b:Lds/f$a;

    filled-new-array {v0, v1}, [Lds/f$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lds/f$a;
    .locals 1

    const-class v0, Lds/f$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lds/f$a;

    return-object p0
.end method

.method public static values()[Lds/f$a;
    .locals 1

    sget-object v0, Lds/f$a;->c:[Lds/f$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lds/f$a;

    return-object v0
.end method
