.class public final synthetic Llo/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Llo/t0;


# direct methods
.method public synthetic constructor <init>(Llo/t0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo/j0;->a:Llo/t0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Llo/j0;->a:Llo/t0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Llo/t0;->d(Llo/t0;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
