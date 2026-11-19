.class public final synthetic Lvo/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lvo/d2;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lvo/d2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/t1;->a:Lln/k$a;

    iput-object p2, p0, Lvo/t1;->b:Lvo/d2;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lvo/t1;->a:Lln/k$a;

    iget-object v1, p0, Lvo/t1;->b:Lvo/d2;

    invoke-static {v0, v1}, Lvo/d2;->J(Lln/k$a;Lvo/d2;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
