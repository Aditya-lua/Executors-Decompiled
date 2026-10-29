.class public final enum Ln0/u3;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/u3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nj\u0002\u0008\tj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Ln0/u3;",
        "",
        "",
        "intValue",
        "<init>",
        "(Ljava/lang/String;II)V",
        "",
        "a",
        "J",
        "b",
        "()J",
        "value",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
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
.field public static final enum b:Ln0/u3;

.field public static final enum c:Ln0/u3;

.field public static final enum d:Ln0/u3;

.field public static final enum e:Ln0/u3;

.field public static final enum f:Ln0/u3;

.field public static final enum g:Ln0/u3;

.field public static final enum h:Ln0/u3;

.field public static final synthetic i:[Ln0/u3;

.field public static final synthetic j:Lqt/a;


# instance fields
.field public final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ln0/u3;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ln0/u3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ln0/u3;->b:Ln0/u3;

    new-instance v0, Ln0/u3;

    const-string v1, "PREVIEW"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ln0/u3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ln0/u3;->c:Ln0/u3;

    new-instance v0, Ln0/u3;

    const-string v1, "VIDEO_RECORD"

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Ln0/u3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ln0/u3;->d:Ln0/u3;

    new-instance v0, Ln0/u3;

    const-string v1, "STILL_CAPTURE"

    invoke-direct {v0, v1, v3, v2}, Ln0/u3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ln0/u3;->e:Ln0/u3;

    new-instance v0, Ln0/u3;

    const-string v1, "VIDEO_CALL"

    const/4 v2, 0x4

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Ln0/u3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ln0/u3;->f:Ln0/u3;

    new-instance v0, Ln0/u3;

    const-string v1, "PREVIEW_VIDEO_STILL"

    invoke-direct {v0, v1, v3, v2}, Ln0/u3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ln0/u3;->g:Ln0/u3;

    new-instance v0, Ln0/u3;

    const-string v1, "CROPPED_RAW"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v2}, Ln0/u3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ln0/u3;->h:Ln0/u3;

    invoke-static {}, Ln0/u3;->a()[Ln0/u3;

    move-result-object v0

    sput-object v0, Ln0/u3;->i:[Ln0/u3;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Ln0/u3;->j:Lqt/a;

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

    int-to-long p1, p3

    iput-wide p1, p0, Ln0/u3;->a:J

    return-void
.end method

.method public static final synthetic a()[Ln0/u3;
    .locals 7

    sget-object v0, Ln0/u3;->b:Ln0/u3;

    sget-object v1, Ln0/u3;->c:Ln0/u3;

    sget-object v2, Ln0/u3;->d:Ln0/u3;

    sget-object v3, Ln0/u3;->e:Ln0/u3;

    sget-object v4, Ln0/u3;->f:Ln0/u3;

    sget-object v5, Ln0/u3;->g:Ln0/u3;

    sget-object v6, Ln0/u3;->h:Ln0/u3;

    filled-new-array/range {v0 .. v6}, [Ln0/u3;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/u3;
    .locals 1

    const-class v0, Ln0/u3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/u3;

    return-object p0
.end method

.method public static values()[Ln0/u3;
    .locals 1

    sget-object v0, Ln0/u3;->i:[Ln0/u3;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/u3;

    return-object v0
.end method


# virtual methods
.method public final b()J
    .locals 2

    iget-wide v0, p0, Ln0/u3;->a:J

    return-wide v0
.end method
