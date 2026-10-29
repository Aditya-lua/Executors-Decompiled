.class public final enum Landroidx/lifecycle/l$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/lifecycle/l$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\u0006j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/lifecycle/l$b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "state",
        "",
        "b",
        "(Landroidx/lifecycle/l$b;)Z",
        "a",
        "c",
        "d",
        "e",
        "lifecycle-common"
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
.field public static final enum a:Landroidx/lifecycle/l$b;

.field public static final enum b:Landroidx/lifecycle/l$b;

.field public static final enum c:Landroidx/lifecycle/l$b;

.field public static final enum d:Landroidx/lifecycle/l$b;

.field public static final enum e:Landroidx/lifecycle/l$b;

.field public static final synthetic f:[Landroidx/lifecycle/l$b;

.field public static final synthetic g:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/lifecycle/l$b;

    const-string v1, "DESTROYED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/lifecycle/l$b;->a:Landroidx/lifecycle/l$b;

    new-instance v0, Landroidx/lifecycle/l$b;

    const-string v1, "INITIALIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/lifecycle/l$b;->b:Landroidx/lifecycle/l$b;

    new-instance v0, Landroidx/lifecycle/l$b;

    const-string v1, "CREATED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/lifecycle/l$b;->c:Landroidx/lifecycle/l$b;

    new-instance v0, Landroidx/lifecycle/l$b;

    const-string v1, "STARTED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/lifecycle/l$b;->d:Landroidx/lifecycle/l$b;

    new-instance v0, Landroidx/lifecycle/l$b;

    const-string v1, "RESUMED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/lifecycle/l$b;->e:Landroidx/lifecycle/l$b;

    invoke-static {}, Landroidx/lifecycle/l$b;->a()[Landroidx/lifecycle/l$b;

    move-result-object v0

    sput-object v0, Landroidx/lifecycle/l$b;->f:[Landroidx/lifecycle/l$b;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Landroidx/lifecycle/l$b;->g:Lqt/a;

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

.method public static final synthetic a()[Landroidx/lifecycle/l$b;
    .locals 5

    sget-object v0, Landroidx/lifecycle/l$b;->a:Landroidx/lifecycle/l$b;

    sget-object v1, Landroidx/lifecycle/l$b;->b:Landroidx/lifecycle/l$b;

    sget-object v2, Landroidx/lifecycle/l$b;->c:Landroidx/lifecycle/l$b;

    sget-object v3, Landroidx/lifecycle/l$b;->d:Landroidx/lifecycle/l$b;

    sget-object v4, Landroidx/lifecycle/l$b;->e:Landroidx/lifecycle/l$b;

    filled-new-array {v0, v1, v2, v3, v4}, [Landroidx/lifecycle/l$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/lifecycle/l$b;
    .locals 1

    const-class v0, Landroidx/lifecycle/l$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/l$b;

    return-object p0
.end method

.method public static values()[Landroidx/lifecycle/l$b;
    .locals 1

    sget-object v0, Landroidx/lifecycle/l$b;->f:[Landroidx/lifecycle/l$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/lifecycle/l$b;

    return-object v0
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/l$b;)Z
    .locals 1
    .param p1    # Landroidx/lifecycle/l$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
