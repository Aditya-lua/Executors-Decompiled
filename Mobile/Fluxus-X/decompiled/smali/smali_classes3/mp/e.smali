.class public final synthetic Lmp/e;
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

    iput-object p1, p0, Lmp/e;->a:Lmp/j;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmp/e;->a:Lmp/j;

    check-cast p1, Llp/v$e;

    invoke-static {v0, p1}, Lmp/j;->j(Lmp/j;Llp/v$e;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
