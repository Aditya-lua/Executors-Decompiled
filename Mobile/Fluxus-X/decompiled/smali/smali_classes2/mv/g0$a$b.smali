.class public final Lmv/g0$a$b;
.super Lmv/g0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmv/g0$a;->a(Lew/h;Lmv/b0;)Lmv/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "mv/g0$a$b",
        "Lmv/g0;",
        "Lmv/b0;",
        "b",
        "()Lmv/b0;",
        "",
        "a",
        "()J",
        "Lew/f;",
        "sink",
        "",
        "h",
        "(Lew/f;)V",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic c:Lmv/b0;

.field public final synthetic d:Lew/h;


# direct methods
.method public constructor <init>(Lmv/b0;Lew/h;)V
    .locals 0

    iput-object p1, p0, Lmv/g0$a$b;->c:Lmv/b0;

    iput-object p2, p0, Lmv/g0$a$b;->d:Lew/h;

    invoke-direct {p0}, Lmv/g0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lmv/g0$a$b;->d:Lew/h;

    invoke-virtual {v0}, Lew/h;->I()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public b()Lmv/b0;
    .locals 1

    iget-object v0, p0, Lmv/g0$a$b;->c:Lmv/b0;

    return-object v0
.end method

.method public h(Lew/f;)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmv/g0$a$b;->d:Lew/h;

    invoke-interface {p1, v0}, Lew/f;->z1(Lew/h;)Lew/f;

    return-void
.end method
