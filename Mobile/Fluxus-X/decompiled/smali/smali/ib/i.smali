.class public final Lib/i;
.super Lmb/n;
.source "SourceFile"


# instance fields
.field public final a:Lm9/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm9/k<",
            "Lmb/d;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public final N(Lcom/google/android/gms/location/LocationAvailability;)V
    .locals 2

    iget-object v0, p0, Lib/i;->a:Lm9/k;

    new-instance v1, Lib/h;

    invoke-direct {v1, p0, p1}, Lib/h;-><init>(Lib/i;Lcom/google/android/gms/location/LocationAvailability;)V

    invoke-virtual {v0, v1}, Lm9/k;->c(Lm9/k$b;)V

    return-void
.end method

.method public final W0(Lcom/google/android/gms/location/LocationResult;)V
    .locals 2

    iget-object v0, p0, Lib/i;->a:Lm9/k;

    new-instance v1, Lib/g;

    invoke-direct {v1, p0, p1}, Lib/g;-><init>(Lib/i;Lcom/google/android/gms/location/LocationResult;)V

    invoke-virtual {v0, v1}, Lm9/k;->c(Lm9/k$b;)V

    return-void
.end method
