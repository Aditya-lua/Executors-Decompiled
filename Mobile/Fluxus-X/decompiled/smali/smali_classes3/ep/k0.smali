.class public final synthetic Lep/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lep/f1;


# direct methods
.method public synthetic constructor <init>(Lep/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/k0;->a:Lep/f1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lep/k0;->a:Lep/f1;

    check-cast p1, Lvo/d2$b;

    invoke-static {v0, p1}, Lep/f1;->J(Lep/f1;Lvo/d2$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
