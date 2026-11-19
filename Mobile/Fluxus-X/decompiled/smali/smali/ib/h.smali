.class public final Lib/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/k$b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm9/k$b<",
        "Lmb/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/gms/location/LocationAvailability;


# direct methods
.method public constructor <init>(Lib/i;Lcom/google/android/gms/location/LocationAvailability;)V
    .locals 0

    iput-object p2, p0, Lib/h;->a:Lcom/google/android/gms/location/LocationAvailability;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lmb/d;

    iget-object v0, p0, Lib/h;->a:Lcom/google/android/gms/location/LocationAvailability;

    invoke-virtual {p1, v0}, Lmb/d;->a(Lcom/google/android/gms/location/LocationAvailability;)V

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method
