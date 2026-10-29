.class public final enum Ltl/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltl/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltl/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u0000 \u00082\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ltl/a;",
        "",
        "",
        "wireCode",
        "<init>",
        "(Ljava/lang/String;II)V",
        "a",
        "I",
        "b",
        "()I",
        "c",
        "d",
        "universalapp_googleProdRelease"
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
.field public static final b:Ltl/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum c:Ltl/a;

.field public static final enum d:Ltl/a;

.field public static final synthetic e:[Ltl/a;

.field public static final synthetic f:Lqt/a;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltl/a;

    const-string v1, "Rewarded"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ltl/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ltl/a;->c:Ltl/a;

    new-instance v0, Ltl/a;

    const-string v1, "Interstitial"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ltl/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ltl/a;->d:Ltl/a;

    invoke-static {}, Ltl/a;->a()[Ltl/a;

    move-result-object v0

    sput-object v0, Ltl/a;->e:[Ltl/a;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Ltl/a;->f:Lqt/a;

    new-instance v0, Ltl/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltl/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltl/a;->b:Ltl/a$a;

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

    iput p3, p0, Ltl/a;->a:I

    return-void
.end method

.method public static final synthetic a()[Ltl/a;
    .locals 2

    sget-object v0, Ltl/a;->c:Ltl/a;

    sget-object v1, Ltl/a;->d:Ltl/a;

    filled-new-array {v0, v1}, [Ltl/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltl/a;
    .locals 1

    const-class v0, Ltl/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltl/a;

    return-object p0
.end method

.method public static values()[Ltl/a;
    .locals 1

    sget-object v0, Ltl/a;->e:[Ltl/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltl/a;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Ltl/a;->a:I

    return v0
.end method
