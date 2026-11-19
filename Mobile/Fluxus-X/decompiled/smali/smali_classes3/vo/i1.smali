.class public final synthetic Lvo/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ldp/f$b;

.field public final synthetic b:Lvo/d2;

.field public final synthetic c:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Ldp/f$b;Lvo/d2;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/i1;->a:Ldp/f$b;

    iput-object p2, p0, Lvo/i1;->b:Lvo/d2;

    iput-object p3, p0, Lvo/i1;->c:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lvo/i1;->a:Ldp/f$b;

    iget-object v1, p0, Lvo/i1;->b:Lvo/d2;

    iget-object v2, p0, Lvo/i1;->c:Lln/k$a;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Lvo/d2;->z(Ldp/f$b;Lvo/d2;Lln/k$a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
