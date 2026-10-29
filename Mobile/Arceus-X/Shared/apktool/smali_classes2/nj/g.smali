.class public final Lnj/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Lkotlin/time/a;",
        "a",
        "J",
        "IGNORE_NOTIFICATION_DISPLAY_DURATION",
        "NativeShell_googleProdRelease"
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
.field public static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    const-wide/16 v0, 0x1770

    sget-object v2, Lju/b;->d:Lju/b;

    invoke-static {v0, v1, v2}, Lkotlin/time/b;->q(JLju/b;)J

    move-result-wide v0

    sput-wide v0, Lnj/g;->a:J

    return-void
.end method

.method public static final synthetic a()J
    .locals 2

    sget-wide v0, Lnj/g;->a:J

    return-wide v0
.end method
