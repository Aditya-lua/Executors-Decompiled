.class public final enum Lcn/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcn/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcn/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0087\u0001\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcn/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "c",
        "d",
        "e",
        "wf1-container-android"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcn/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lcn/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum c:Lcn/a;

.field public static final enum d:Lcn/a;

.field public static final enum e:Lcn/a;

.field public static final synthetic f:[Lcn/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcn/a;

    const-string v1, "None"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcn/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcn/a;->c:Lcn/a;

    new-instance v1, Lcn/a;

    const-string v2, "First"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcn/a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcn/a;->d:Lcn/a;

    new-instance v1, Lcn/a;

    const-string v2, "Other"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcn/a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcn/a;->e:Lcn/a;

    invoke-static {}, Lcn/a;->a()[Lcn/a;

    move-result-object v1

    sput-object v1, Lcn/a;->f:[Lcn/a;

    new-instance v1, Lcn/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcn/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcn/a;->a:Lcn/a$a;

    sput-object v0, Lcn/a;->b:Lcn/a;

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

.method public static final synthetic a()[Lcn/a;
    .locals 3

    sget-object v0, Lcn/a;->c:Lcn/a;

    sget-object v1, Lcn/a;->d:Lcn/a;

    sget-object v2, Lcn/a;->e:Lcn/a;

    filled-new-array {v0, v1, v2}, [Lcn/a;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b()Lcn/a;
    .locals 1

    sget-object v0, Lcn/a;->b:Lcn/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcn/a;
    .locals 1

    const-class v0, Lcn/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcn/a;

    return-object p0
.end method

.method public static values()[Lcn/a;
    .locals 1

    sget-object v0, Lcn/a;->f:[Lcn/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcn/a;

    return-object v0
.end method
