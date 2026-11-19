.class public final Lo6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\"\u001b\u0010\u0006\u001a\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "Lo6/a;",
        "d",
        "()Lo6/a;",
        "a",
        "Lzt/h;",
        "b",
        "instance",
        "coil-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lzt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo6/g;

    invoke-direct {v0}, Lo6/g;-><init>()V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    sput-object v0, Lo6/h;->a:Lzt/h;

    return-void
.end method

.method public static synthetic a()Lo6/a;
    .locals 1

    invoke-static {}, Lo6/h;->c()Lo6/a;

    move-result-object v0

    return-object v0
.end method

.method public static final b()Lo6/a;
    .locals 1

    sget-object v0, Lo6/h;->a:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo6/a;

    return-object v0
.end method

.method public static final c()Lo6/a;
    .locals 3

    new-instance v0, Lo6/a$a;

    invoke-direct {v0}, Lo6/a$a;-><init>()V

    sget-object v1, Lew/k;->c:Lew/b0;

    const-string v2, "coil3_disk_cache"

    invoke-virtual {v1, v2}, Lew/b0;->p(Ljava/lang/String;)Lew/b0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo6/a$a;->b(Lew/b0;)Lo6/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lo6/a$a;->a()Lo6/a;

    move-result-object v0

    return-object v0
.end method

.method public static final d()Lo6/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lo6/h;->b()Lo6/a;

    move-result-object v0

    return-object v0
.end method
