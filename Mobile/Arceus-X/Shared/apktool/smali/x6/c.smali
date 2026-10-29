.class public final enum Lx6/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx6/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0008\u001a\u0004\u0008\u000b\u0010\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lx6/c;",
        "",
        "",
        "readEnabled",
        "writeEnabled",
        "<init>",
        "(Ljava/lang/String;IZZ)V",
        "a",
        "Z",
        "b",
        "()Z",
        "c",
        "d",
        "e",
        "f",
        "coil-core_release"
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
.field public static final enum c:Lx6/c;

.field public static final enum d:Lx6/c;

.field public static final enum e:Lx6/c;

.field public static final enum f:Lx6/c;

.field public static final synthetic g:[Lx6/c;

.field public static final synthetic h:Lqt/a;


# instance fields
.field public final a:Z

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lx6/c;

    const-string v1, "ENABLED"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3, v3}, Lx6/c;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lx6/c;->c:Lx6/c;

    new-instance v0, Lx6/c;

    const-string v1, "READ_ONLY"

    invoke-direct {v0, v1, v3, v3, v2}, Lx6/c;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lx6/c;->d:Lx6/c;

    new-instance v0, Lx6/c;

    const-string v1, "WRITE_ONLY"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v2, v3}, Lx6/c;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lx6/c;->e:Lx6/c;

    new-instance v0, Lx6/c;

    const-string v1, "DISABLED"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v2, v2}, Lx6/c;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lx6/c;->f:Lx6/c;

    invoke-static {}, Lx6/c;->a()[Lx6/c;

    move-result-object v0

    sput-object v0, Lx6/c;->g:[Lx6/c;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lx6/c;->h:Lqt/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lx6/c;->a:Z

    iput-boolean p4, p0, Lx6/c;->b:Z

    return-void
.end method

.method public static final synthetic a()[Lx6/c;
    .locals 4

    sget-object v0, Lx6/c;->c:Lx6/c;

    sget-object v1, Lx6/c;->d:Lx6/c;

    sget-object v2, Lx6/c;->e:Lx6/c;

    sget-object v3, Lx6/c;->f:Lx6/c;

    filled-new-array {v0, v1, v2, v3}, [Lx6/c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lx6/c;
    .locals 1

    const-class v0, Lx6/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx6/c;

    return-object p0
.end method

.method public static values()[Lx6/c;
    .locals 1

    sget-object v0, Lx6/c;->g:[Lx6/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx6/c;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lx6/c;->a:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lx6/c;->b:Z

    return v0
.end method
