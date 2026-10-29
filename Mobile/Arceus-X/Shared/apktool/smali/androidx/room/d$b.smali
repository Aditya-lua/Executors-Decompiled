.class public final Landroidx/room/d$b;
.super Landroidx/room/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/d;-><init>(Landroid/content/Context;Ljava/lang/String;Landroidx/room/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "androidx/room/d$b",
        "Landroidx/room/a$a;",
        "",
        "",
        "tables",
        "",
        "A",
        "([Ljava/lang/String;)V",
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
.field public final synthetic a:Landroidx/room/d;


# direct methods
.method public constructor <init>(Landroidx/room/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/d$b;->a:Landroidx/room/d;

    invoke-direct {p0}, Landroidx/room/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public A([Ljava/lang/String;)V
    .locals 7

    const-string v0, "tables"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/d$b;->a:Landroidx/room/d;

    invoke-static {v0}, Landroidx/room/d;->b(Landroidx/room/d;)Lku/p0;

    move-result-object v1

    new-instance v4, Landroidx/room/d$b$a;

    iget-object v0, p0, Landroidx/room/d$b;->a:Landroidx/room/d;

    const/4 v2, 0x0

    invoke-direct {v4, p1, v0, v2}, Landroidx/room/d$b$a;-><init>([Ljava/lang/String;Landroidx/room/d;Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method
