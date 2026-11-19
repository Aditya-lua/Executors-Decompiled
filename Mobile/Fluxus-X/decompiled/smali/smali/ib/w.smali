.class public final Lib/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lib/t;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lib/t<",
        "Lib/f;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lib/x;


# direct methods
.method public constructor <init>(Lib/x;)V
    .locals 0

    iput-object p1, p0, Lib/w;->a:Lib/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lib/f;
    .locals 1

    iget-object v0, p0, Lib/w;->a:Lib/x;

    invoke-virtual {v0}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lib/f;

    return-object v0
.end method
