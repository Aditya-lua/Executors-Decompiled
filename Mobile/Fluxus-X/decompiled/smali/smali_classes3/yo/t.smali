.class public final synthetic Lyo/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/j0;

.field public final synthetic b:Lvo/f;

.field public final synthetic c:Lvo/n$b;

.field public final synthetic d:Lvo/j0$n;

.field public final synthetic e:Lsn/v;


# direct methods
.method public synthetic constructor <init>(Lvo/j0;Lvo/f;Lvo/n$b;Lvo/j0$n;Lsn/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/t;->a:Lvo/j0;

    iput-object p2, p0, Lyo/t;->b:Lvo/f;

    iput-object p3, p0, Lyo/t;->c:Lvo/n$b;

    iput-object p4, p0, Lyo/t;->d:Lvo/j0$n;

    iput-object p5, p0, Lyo/t;->e:Lsn/v;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lyo/t;->a:Lvo/j0;

    iget-object v1, p0, Lyo/t;->b:Lvo/f;

    iget-object v2, p0, Lyo/t;->c:Lvo/n$b;

    iget-object v3, p0, Lyo/t;->d:Lvo/j0$n;

    iget-object v4, p0, Lyo/t;->e:Lsn/v;

    move-object v5, p1

    check-cast v5, Lln/r$c;

    invoke-static/range {v0 .. v5}, Lyo/t0;->M(Lvo/j0;Lvo/f;Lvo/n$b;Lvo/j0$n;Lsn/v;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
