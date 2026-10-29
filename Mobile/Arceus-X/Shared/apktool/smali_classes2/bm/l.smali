.class public final synthetic Lbm/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lbm/m$a;


# direct methods
.method public synthetic constructor <init>(Lbm/m$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm/l;->a:Lbm/m$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lbm/l;->a:Lbm/m$a;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1}, Lbm/m;->d(Lbm/m$a;Ljava/lang/Integer;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
