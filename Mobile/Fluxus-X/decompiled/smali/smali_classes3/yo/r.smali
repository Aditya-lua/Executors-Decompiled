.class public final synthetic Lyo/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/j0;

.field public final synthetic b:Lvo/i3$a;

.field public final synthetic c:Lvo/f;

.field public final synthetic d:Lsn/v;

.field public final synthetic e:I

.field public final synthetic f:Lvo/n$b;


# direct methods
.method public synthetic constructor <init>(Lvo/j0;Lvo/i3$a;Lvo/f;Lsn/v;ILvo/n$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/r;->a:Lvo/j0;

    iput-object p2, p0, Lyo/r;->b:Lvo/i3$a;

    iput-object p3, p0, Lyo/r;->c:Lvo/f;

    iput-object p4, p0, Lyo/r;->d:Lsn/v;

    iput p5, p0, Lyo/r;->e:I

    iput-object p6, p0, Lyo/r;->f:Lvo/n$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lyo/r;->a:Lvo/j0;

    iget-object v1, p0, Lyo/r;->b:Lvo/i3$a;

    iget-object v2, p0, Lyo/r;->c:Lvo/f;

    iget-object v3, p0, Lyo/r;->d:Lsn/v;

    iget v4, p0, Lyo/r;->e:I

    iget-object v5, p0, Lyo/r;->f:Lvo/n$b;

    move-object v6, p1

    check-cast v6, Lln/r$c;

    invoke-static/range {v0 .. v6}, Lyo/t0;->x(Lvo/j0;Lvo/i3$a;Lvo/f;Lsn/v;ILvo/n$b;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
