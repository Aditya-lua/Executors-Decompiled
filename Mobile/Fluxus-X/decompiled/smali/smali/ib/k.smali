.class public final Lib/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/k$b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm9/k$b<",
        "Lmb/e;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/location/Location;


# direct methods
.method public constructor <init>(Lib/l;Landroid/location/Location;)V
    .locals 0

    iput-object p2, p0, Lib/k;->a:Landroid/location/Location;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lmb/e;

    iget-object v0, p0, Lib/k;->a:Landroid/location/Location;

    invoke-interface {p1, v0}, Lmb/e;->onLocationChanged(Landroid/location/Location;)V

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method
