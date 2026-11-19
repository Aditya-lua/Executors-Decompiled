.class public final Ltv/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltv/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Ltv/a;",
        "",
        "Lew/g;",
        "source",
        "<init>",
        "(Lew/g;)V",
        "",
        "b",
        "()Ljava/lang/String;",
        "Lmv/y;",
        "a",
        "()Lmv/y;",
        "Lew/g;",
        "getSource",
        "()Lew/g;",
        "",
        "J",
        "headerLimit",
        "c",
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


# static fields
.field public static final c:Ltv/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lew/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltv/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltv/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltv/a;->c:Ltv/a$a;

    return-void
.end method

.method public constructor <init>(Lew/g;)V
    .locals 2
    .param p1    # Lew/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltv/a;->a:Lew/g;

    const-wide/32 v0, 0x40000

    iput-wide v0, p0, Ltv/a;->b:J

    return-void
.end method


# virtual methods
.method public final a()Lmv/y;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lmv/y$a;

    invoke-direct {v0}, Lmv/y$a;-><init>()V

    :goto_0
    invoke-virtual {p0}, Ltv/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lmv/y$a;->f()Lmv/y;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0, v1}, Lmv/y$a;->c(Ljava/lang/String;)Lmv/y$a;

    goto :goto_0
.end method

.method public final b()Ljava/lang/String;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ltv/a;->a:Lew/g;

    iget-wide v1, p0, Ltv/a;->b:J

    invoke-interface {v0, v1, v2}, Lew/g;->p0(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Ltv/a;->b:J

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Ltv/a;->b:J

    return-object v0
.end method
