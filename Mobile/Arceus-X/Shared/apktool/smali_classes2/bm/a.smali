.class public final synthetic Lbm/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lbm/m$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lbm/m$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lbm/a;->b:Lbm/m$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lbm/a;->a:Ljava/lang/String;

    iget-object v1, p0, Lbm/a;->b:Lbm/m$a;

    check-cast p1, Lcom/google/android/gms/auth/blockstore/RetrieveBytesResponse;

    invoke-static {v0, v1, p1}, Lbm/m;->e(Ljava/lang/String;Lbm/m$a;Lcom/google/android/gms/auth/blockstore/RetrieveBytesResponse;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
