.class public final Ln6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\"\u001b\u0010\u0006\u001a\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "Ln6/a;",
        "d",
        "()Ln6/a;",
        "a",
        "Ljt/h;",
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
.field public static final a:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln6/g;

    invoke-direct {v0}, Ln6/g;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Ln6/h;->a:Ljt/h;

    return-void
.end method

.method public static synthetic a()Ln6/a;
    .locals 1

    invoke-static {}, Ln6/h;->c()Ln6/a;

    move-result-object v0

    return-object v0
.end method

.method public static final b()Ln6/a;
    .locals 1

    sget-object v0, Ln6/h;->a:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln6/a;

    return-object v0
.end method

.method public static final c()Ln6/a;
    .locals 3

    new-instance v0, Ln6/a$a;

    invoke-direct {v0}, Ln6/a$a;-><init>()V

    sget-object v1, Lxu/l;->SYSTEM_TEMPORARY_DIRECTORY:Lxu/h0;

    const-string v2, "coil3_disk_cache"

    invoke-virtual {v1, v2}, Lxu/h0;->n(Ljava/lang/String;)Lxu/h0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln6/a$a;->b(Lxu/h0;)Ln6/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ln6/a$a;->a()Ln6/a;

    move-result-object v0

    return-object v0
.end method

.method public static final d()Ln6/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Ln6/h;->b()Ln6/a;

    move-result-object v0

    return-object v0
.end method
