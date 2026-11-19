.class public final synthetic Lyo/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lvo/j0$d;

.field public final synthetic b:Lyo/t0;

.field public final synthetic c:Lvo/d2$a;

.field public final synthetic d:Lln/k$a;

.field public final synthetic e:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lvo/j0$d;Lyo/t0;Lvo/d2$a;Lln/k$a;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/o0;->a:Lvo/j0$d;

    iput-object p2, p0, Lyo/o0;->b:Lyo/t0;

    iput-object p3, p0, Lyo/o0;->c:Lvo/d2$a;

    iput-object p4, p0, Lyo/o0;->d:Lln/k$a;

    iput-object p5, p0, Lyo/o0;->e:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lyo/o0;->a:Lvo/j0$d;

    iget-object v1, p0, Lyo/o0;->b:Lyo/t0;

    iget-object v2, p0, Lyo/o0;->c:Lvo/d2$a;

    iget-object v3, p0, Lyo/o0;->d:Lln/k$a;

    iget-object v4, p0, Lyo/o0;->e:Lip/l;

    move-object v5, p1

    check-cast v5, Ljava/util/List;

    move-object v6, p2

    check-cast v6, Lsn/v;

    invoke-static/range {v0 .. v6}, Lyo/t0;->z(Lvo/j0$d;Lyo/t0;Lvo/d2$a;Lln/k$a;Lip/l;Ljava/util/List;Lsn/v;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
