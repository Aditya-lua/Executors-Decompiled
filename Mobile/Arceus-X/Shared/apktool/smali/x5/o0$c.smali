.class public final enum Lx5/o0$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx5/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx5/o0$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0008j\u0002\u0008\u0005j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lx5/o0$c;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "",
        "b",
        "()Z",
        "isFinished",
        "a",
        "c",
        "d",
        "e",
        "f",
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
.field public static final enum a:Lx5/o0$c;

.field public static final enum b:Lx5/o0$c;

.field public static final enum c:Lx5/o0$c;

.field public static final enum d:Lx5/o0$c;

.field public static final enum e:Lx5/o0$c;

.field public static final enum f:Lx5/o0$c;

.field public static final synthetic g:[Lx5/o0$c;

.field public static final synthetic h:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lx5/o0$c;

    const-string v1, "ENQUEUED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lx5/o0$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx5/o0$c;->a:Lx5/o0$c;

    new-instance v0, Lx5/o0$c;

    const-string v1, "RUNNING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lx5/o0$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx5/o0$c;->b:Lx5/o0$c;

    new-instance v0, Lx5/o0$c;

    const-string v1, "SUCCEEDED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lx5/o0$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx5/o0$c;->c:Lx5/o0$c;

    new-instance v0, Lx5/o0$c;

    const-string v1, "FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lx5/o0$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx5/o0$c;->d:Lx5/o0$c;

    new-instance v0, Lx5/o0$c;

    const-string v1, "BLOCKED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lx5/o0$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx5/o0$c;->e:Lx5/o0$c;

    new-instance v0, Lx5/o0$c;

    const-string v1, "CANCELLED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lx5/o0$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx5/o0$c;->f:Lx5/o0$c;

    invoke-static {}, Lx5/o0$c;->a()[Lx5/o0$c;

    move-result-object v0

    sput-object v0, Lx5/o0$c;->g:[Lx5/o0$c;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lx5/o0$c;->h:Lqt/a;

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

.method public static final synthetic a()[Lx5/o0$c;
    .locals 6

    sget-object v0, Lx5/o0$c;->a:Lx5/o0$c;

    sget-object v1, Lx5/o0$c;->b:Lx5/o0$c;

    sget-object v2, Lx5/o0$c;->c:Lx5/o0$c;

    sget-object v3, Lx5/o0$c;->d:Lx5/o0$c;

    sget-object v4, Lx5/o0$c;->e:Lx5/o0$c;

    sget-object v5, Lx5/o0$c;->f:Lx5/o0$c;

    filled-new-array/range {v0 .. v5}, [Lx5/o0$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lx5/o0$c;
    .locals 1

    const-class v0, Lx5/o0$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx5/o0$c;

    return-object p0
.end method

.method public static values()[Lx5/o0$c;
    .locals 1

    sget-object v0, Lx5/o0$c;->g:[Lx5/o0$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx5/o0$c;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    sget-object v0, Lx5/o0$c;->c:Lx5/o0$c;

    if-eq p0, v0, :cond_1

    sget-object v0, Lx5/o0$c;->d:Lx5/o0$c;

    if-eq p0, v0, :cond_1

    sget-object v0, Lx5/o0$c;->f:Lx5/o0$c;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
