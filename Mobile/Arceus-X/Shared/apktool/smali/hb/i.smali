.class public final Lhb/i;
.super Llb/n;
.source "SourceFile"


# instance fields
.field public final a:Ll9/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll9/k<",
            "Llb/d;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public final N(Lcom/google/android/gms/location/LocationAvailability;)V
    .locals 2

    iget-object v0, p0, Lhb/i;->a:Ll9/k;

    new-instance v1, Lhb/h;

    invoke-direct {v1, p0, p1}, Lhb/h;-><init>(Lhb/i;Lcom/google/android/gms/location/LocationAvailability;)V

    invoke-virtual {v0, v1}, Ll9/k;->c(Ll9/k$b;)V

    return-void
.end method

.method public final P0(Lcom/google/android/gms/location/LocationResult;)V
    .locals 2

    iget-object v0, p0, Lhb/i;->a:Ll9/k;

    new-instance v1, Lhb/g;

    invoke-direct {v1, p0, p1}, Lhb/g;-><init>(Lhb/i;Lcom/google/android/gms/location/LocationResult;)V

    invoke-virtual {v0, v1}, Ll9/k;->c(Ll9/k$b;)V

    return-void
.end method
