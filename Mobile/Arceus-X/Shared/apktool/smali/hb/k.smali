.class public final Lhb/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/k$b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll9/k$b<",
        "Llb/e;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/location/Location;


# direct methods
.method public constructor <init>(Lhb/l;Landroid/location/Location;)V
    .locals 0

    iput-object p2, p0, Lhb/k;->a:Landroid/location/Location;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Llb/e;

    iget-object v0, p0, Lhb/k;->a:Landroid/location/Location;

    invoke-interface {p1, v0}, Llb/e;->onLocationChanged(Landroid/location/Location;)V

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method
