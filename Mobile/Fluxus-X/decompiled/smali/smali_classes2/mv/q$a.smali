.class public final Lmv/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmv/q;->g(Lrv/m$a;Lrv/m;Lrv/m$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0005\u001a\u000c\u0012\u0008\u0012\u00060\u0003R\u00020\u00040\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR!\u0010\u0005\u001a\u000c\u0012\u0008\u0012\u00060\u0003R\u00020\u00040\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\n\u0010\u000cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\r\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "mv/q$a",
        "",
        "",
        "Lrv/m$a;",
        "Lrv/m;",
        "callsToExecute",
        "Ljava/lang/Runnable;",
        "idleCallbackToRun",
        "<init>",
        "(Ljava/util/List;Ljava/lang/Runnable;)V",
        "a",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "b",
        "Ljava/lang/Runnable;",
        "()Ljava/lang/Runnable;",
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
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lrv/m$a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lrv/m$a;",
            ">;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    const-string v0, "callsToExecute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmv/q$a;->a:Ljava/util/List;

    iput-object p2, p0, Lmv/q$a;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lrv/m$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lmv/q$a;->a:Ljava/util/List;

    return-object v0
.end method

.method public final b()Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lmv/q$a;->b:Ljava/lang/Runnable;

    return-object v0
.end method
