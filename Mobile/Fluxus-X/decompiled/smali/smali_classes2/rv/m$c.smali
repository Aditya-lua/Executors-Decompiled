.class public final Lrv/m$c;
.super Lew/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrv/m;-><init>(Lmv/d0;Lmv/f0;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "rv/m$c",
        "Lew/c;",
        "",
        "z",
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
.field public final synthetic p:Lrv/m;


# direct methods
.method public constructor <init>(Lrv/m;)V
    .locals 0

    iput-object p1, p0, Lrv/m$c;->p:Lrv/m;

    invoke-direct {p0}, Lew/c;-><init>()V

    return-void
.end method


# virtual methods
.method public z()V
    .locals 1

    iget-object v0, p0, Lrv/m$c;->p:Lrv/m;

    invoke-virtual {v0}, Lrv/m;->cancel()V

    return-void
.end method
