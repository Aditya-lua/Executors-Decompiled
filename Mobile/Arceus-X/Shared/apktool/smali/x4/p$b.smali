.class public final Lx4/p$b;
.super Lg5/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx4/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\t\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\r\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\n\u00a8\u0006\u0011"
    }
    d2 = {
        "Lx4/p$b;",
        "Lg5/d$a;",
        "",
        "version",
        "<init>",
        "(Lx4/p;I)V",
        "Lg5/c;",
        "db",
        "",
        "d",
        "(Lg5/c;)V",
        "oldVersion",
        "newVersion",
        "g",
        "(Lg5/c;II)V",
        "e",
        "f",
        "room-runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic c:Lx4/p;


# direct methods
.method public constructor <init>(Lx4/p;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    iput-object p1, p0, Lx4/p$b;->c:Lx4/p;

    invoke-direct {p0, p2}, Lg5/d$a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public d(Lg5/c;)V
    .locals 2
    .param p1    # Lg5/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx4/p$b;->c:Lx4/p;

    new-instance v1, Li5/a;

    invoke-direct {v1, p1}, Li5/a;-><init>(Lg5/c;)V

    invoke-virtual {v0, v1}, Lx4/a;->x(Lf5/b;)V

    return-void
.end method

.method public e(Lg5/c;II)V
    .locals 1
    .param p1    # Lg5/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, Lx4/p$b;->g(Lg5/c;II)V

    return-void
.end method

.method public f(Lg5/c;)V
    .locals 2
    .param p1    # Lg5/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx4/p$b;->c:Lx4/p;

    new-instance v1, Li5/a;

    invoke-direct {v1, p1}, Li5/a;-><init>(Lg5/c;)V

    invoke-virtual {v0, v1}, Lx4/a;->z(Lf5/b;)V

    iget-object v0, p0, Lx4/p$b;->c:Lx4/p;

    invoke-static {v0, p1}, Lx4/p;->E(Lx4/p;Lg5/c;)V

    return-void
.end method

.method public g(Lg5/c;II)V
    .locals 2
    .param p1    # Lg5/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx4/p$b;->c:Lx4/p;

    new-instance v1, Li5/a;

    invoke-direct {v1, p1}, Li5/a;-><init>(Lg5/c;)V

    invoke-virtual {v0, v1, p2, p3}, Lx4/a;->y(Lf5/b;II)V

    return-void
.end method
