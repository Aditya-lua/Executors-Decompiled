.class public final synthetic Lwa/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Lwa/p;


# direct methods
.method public synthetic constructor <init>(Lwa/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwa/m;->a:Lwa/p;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lwa/m;->a:Lwa/p;

    check-cast p1, Lwa/d;

    check-cast p2, Lsb/k;

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lwa/g;

    new-instance v1, Lcom/google/android/gms/appset/zza;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Lcom/google/android/gms/appset/zza;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lwa/o;

    invoke-direct {v2, v0, p2}, Lwa/o;-><init>(Lwa/p;Lsb/k;)V

    invoke-virtual {p1, v1, v2}, Lwa/g;->t2(Lcom/google/android/gms/appset/zza;Lwa/f;)V

    return-void
.end method
