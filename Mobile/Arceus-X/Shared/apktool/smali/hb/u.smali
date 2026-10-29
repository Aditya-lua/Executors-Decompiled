.class public final Lhb/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhb/r;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhb/r<",
        "Lhb/f;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lhb/v;


# direct methods
.method public constructor <init>(Lhb/v;)V
    .locals 0

    iput-object p1, p0, Lhb/u;->a:Lhb/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lhb/f;
    .locals 1

    iget-object v0, p0, Lhb/u;->a:Lhb/v;

    invoke-virtual {v0}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lhb/f;

    return-object v0
.end method
