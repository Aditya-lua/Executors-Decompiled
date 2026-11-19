.class public final synthetic Lyo/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/j0$d;

.field public final synthetic b:Lvo/d2$a;

.field public final synthetic c:Ljava/lang/Throwable;

.field public final synthetic d:Lln/k$a;

.field public final synthetic e:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lvo/j0$d;Lvo/d2$a;Ljava/lang/Throwable;Lln/k$a;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/y;->a:Lvo/j0$d;

    iput-object p2, p0, Lyo/y;->b:Lvo/d2$a;

    iput-object p3, p0, Lyo/y;->c:Ljava/lang/Throwable;

    iput-object p4, p0, Lyo/y;->d:Lln/k$a;

    iput-object p5, p0, Lyo/y;->e:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lyo/y;->a:Lvo/j0$d;

    iget-object v1, p0, Lyo/y;->b:Lvo/d2$a;

    iget-object v2, p0, Lyo/y;->c:Ljava/lang/Throwable;

    iget-object v3, p0, Lyo/y;->d:Lln/k$a;

    iget-object v4, p0, Lyo/y;->e:Lip/l;

    move-object v5, p1

    check-cast v5, Lln/r$c;

    invoke-static/range {v0 .. v5}, Lyo/t0;->B(Lvo/j0$d;Lvo/d2$a;Ljava/lang/Throwable;Lln/k$a;Lip/l;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
