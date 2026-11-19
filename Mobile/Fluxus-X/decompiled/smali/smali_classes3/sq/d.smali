.class public final synthetic Lsq/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lsq/h;


# direct methods
.method public synthetic constructor <init>(Lsq/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsq/d;->a:Lsq/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsq/d;->a:Lsq/h;

    check-cast p1, Landroidx/lifecycle/l0;

    invoke-static {v0, p1}, Lsq/h;->l2(Lsq/h;Landroidx/lifecycle/l0;)Lsq/n;

    move-result-object p1

    return-object p1
.end method
