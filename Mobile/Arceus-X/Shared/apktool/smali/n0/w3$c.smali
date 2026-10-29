.class public final enum Ln0/w3$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/w3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/w3$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Ln0/w3$c;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "camera-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum a:Ln0/w3$c;

.field public static final enum b:Ln0/w3$c;

.field public static final synthetic c:[Ln0/w3$c;

.field public static final synthetic d:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/w3$c;

    const-string v1, "FEATURE_COMBINATION_TABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln0/w3$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/w3$c;->a:Ln0/w3$c;

    new-instance v0, Ln0/w3$c;

    const-string v1, "CAPTURE_SESSION_TABLES"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln0/w3$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/w3$c;->b:Ln0/w3$c;

    invoke-static {}, Ln0/w3$c;->a()[Ln0/w3$c;

    move-result-object v0

    sput-object v0, Ln0/w3$c;->c:[Ln0/w3$c;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Ln0/w3$c;->d:Lqt/a;

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

.method public static final synthetic a()[Ln0/w3$c;
    .locals 2

    sget-object v0, Ln0/w3$c;->a:Ln0/w3$c;

    sget-object v1, Ln0/w3$c;->b:Ln0/w3$c;

    filled-new-array {v0, v1}, [Ln0/w3$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/w3$c;
    .locals 1

    const-class v0, Ln0/w3$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/w3$c;

    return-object p0
.end method

.method public static values()[Ln0/w3$c;
    .locals 1

    sget-object v0, Ln0/w3$c;->c:[Ln0/w3$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/w3$c;

    return-object v0
.end method
