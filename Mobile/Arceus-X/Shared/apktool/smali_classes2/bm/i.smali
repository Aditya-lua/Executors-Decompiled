.class public final synthetic Lbm/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;

.field public final synthetic b:Le9/b;

.field public final synthetic c:Lbm/m$a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;Le9/b;Lbm/m$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm/i;->a:Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;

    iput-object p2, p0, Lbm/i;->b:Le9/b;

    iput-object p3, p0, Lbm/i;->c:Lbm/m$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lbm/i;->a:Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;

    iget-object v1, p0, Lbm/i;->b:Le9/b;

    iget-object v2, p0, Lbm/i;->c:Lbm/m$a;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, v1, v2, p1}, Lbm/m;->f(Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;Le9/b;Lbm/m$a;Ljava/lang/Boolean;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
