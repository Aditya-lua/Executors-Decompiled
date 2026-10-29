.class public final enum Lpj/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpj/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fj\u0002\u0008\u000ej\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpj/c;",
        "",
        "",
        "id",
        "",
        "nameId",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;I)V",
        "a",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "b",
        "I",
        "c",
        "()I",
        "d",
        "e",
        "f",
        "NativeShell_googleProdRelease"
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
.field public static final enum c:Lpj/c;

.field public static final enum d:Lpj/c;

.field public static final enum e:Lpj/c;

.field public static final enum f:Lpj/c;

.field public static final synthetic g:[Lpj/c;

.field public static final synthetic h:Lqt/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lpj/c;

    const-string v1, "channel_group_social"

    sget v2, Lsg/q0;->a1:I

    const-string v3, "SOCIAL"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lpj/c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lpj/c;->c:Lpj/c;

    new-instance v0, Lpj/c;

    const-string v1, "channel_group_experiences"

    sget v2, Lsg/q0;->Z:I

    const-string v3, "EXPERIENCES"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lpj/c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lpj/c;->d:Lpj/c;

    new-instance v0, Lpj/c;

    const-string v1, "channel_group_communities"

    sget v2, Lsg/q0;->Y:I

    const-string v3, "COMMUNITIES"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lpj/c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lpj/c;->e:Lpj/c;

    new-instance v0, Lpj/c;

    const-string v1, "channel_group_platform_news"

    sget v2, Lsg/q0;->a0:I

    const-string v3, "PLATFORM_NEWS"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v1, v2}, Lpj/c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lpj/c;->f:Lpj/c;

    invoke-static {}, Lpj/c;->a()[Lpj/c;

    move-result-object v0

    sput-object v0, Lpj/c;->g:[Lpj/c;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lpj/c;->h:Lqt/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lpj/c;->a:Ljava/lang/String;

    iput p4, p0, Lpj/c;->b:I

    return-void
.end method

.method public static final synthetic a()[Lpj/c;
    .locals 4

    sget-object v0, Lpj/c;->c:Lpj/c;

    sget-object v1, Lpj/c;->d:Lpj/c;

    sget-object v2, Lpj/c;->e:Lpj/c;

    sget-object v3, Lpj/c;->f:Lpj/c;

    filled-new-array {v0, v1, v2, v3}, [Lpj/c;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lqt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqt/a<",
            "Lpj/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lpj/c;->h:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpj/c;
    .locals 1

    const-class v0, Lpj/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpj/c;

    return-object p0
.end method

.method public static values()[Lpj/c;
    .locals 1

    sget-object v0, Lpj/c;->g:[Lpj/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpj/c;

    return-object v0
.end method


# virtual methods
.method public final c()I
    .locals 1

    iget v0, p0, Lpj/c;->b:I

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lpj/c;->a:Ljava/lang/String;

    return-object v0
.end method
