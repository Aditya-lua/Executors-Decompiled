.class public final synthetic Lwo/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lqr/l4;


# direct methods
.method public synthetic constructor <init>(Lqr/l4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwo/c;->a:Lqr/l4;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwo/c;->a:Lqr/l4;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lwo/o;->i(Lqr/l4;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
