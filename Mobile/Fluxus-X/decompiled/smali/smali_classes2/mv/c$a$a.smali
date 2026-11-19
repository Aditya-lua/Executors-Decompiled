.class public final Lmv/c$a$a;
.super Lew/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmv/c$a;-><init>(Lpv/f$d;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "mv/c$a$a",
        "Lew/n;",
        "",
        "close",
        "()V",
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
.field public final synthetic b:Lmv/c$a;


# direct methods
.method public constructor <init>(Lew/l0;Lmv/c$a;)V
    .locals 0

    iput-object p2, p0, Lmv/c$a$a;->b:Lmv/c$a;

    invoke-direct {p0, p1}, Lew/n;-><init>(Lew/l0;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lmv/c$a$a;->b:Lmv/c$a;

    invoke-virtual {v0}, Lmv/c$a;->k()Lpv/f$d;

    move-result-object v0

    invoke-virtual {v0}, Lpv/f$d;->close()V

    invoke-super {p0}, Lew/n;->close()V

    return-void
.end method
