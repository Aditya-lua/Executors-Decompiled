.class public final Lhb/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/k$b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll9/k$b<",
        "Llb/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/gms/location/LocationResult;


# direct methods
.method public constructor <init>(Lhb/i;Lcom/google/android/gms/location/LocationResult;)V
    .locals 0

    iput-object p2, p0, Lhb/g;->a:Lcom/google/android/gms/location/LocationResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Llb/d;

    iget-object v0, p0, Lhb/g;->a:Lcom/google/android/gms/location/LocationResult;

    invoke-virtual {p1, v0}, Llb/d;->b(Lcom/google/android/gms/location/LocationResult;)V

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method
