.class public final synthetic Lep/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lep/m;


# direct methods
.method public synthetic constructor <init>(Lep/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/i;->a:Lep/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lep/i;->a:Lep/m;

    check-cast p1, Landroidx/lifecycle/l0;

    invoke-static {v0, p1}, Lep/m;->j2(Lep/m;Landroidx/lifecycle/l0;)Lep/i1;

    move-result-object p1

    return-object p1
.end method
