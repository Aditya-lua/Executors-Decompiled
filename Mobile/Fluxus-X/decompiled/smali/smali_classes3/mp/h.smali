.class public final synthetic Lmp/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmp/j;


# direct methods
.method public synthetic constructor <init>(Lmp/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp/h;->a:Lmp/j;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmp/h;->a:Lmp/j;

    check-cast p1, Lqr/x5;

    invoke-static {v0, p1}, Lmp/j;->k(Lmp/j;Lqr/x5;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
