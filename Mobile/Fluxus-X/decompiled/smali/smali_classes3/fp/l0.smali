.class public final synthetic Lfp/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfp/m0;

.field public final synthetic b:Lvo/j0$n;

.field public final synthetic c:Lls/g;

.field public final synthetic d:Lvo/f;

.field public final synthetic e:Lln/h;


# direct methods
.method public synthetic constructor <init>(Lfp/m0;Lvo/j0$n;Lls/g;Lvo/f;Lln/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/l0;->a:Lfp/m0;

    iput-object p2, p0, Lfp/l0;->b:Lvo/j0$n;

    iput-object p3, p0, Lfp/l0;->c:Lls/g;

    iput-object p4, p0, Lfp/l0;->d:Lvo/f;

    iput-object p5, p0, Lfp/l0;->e:Lln/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lfp/l0;->a:Lfp/m0;

    iget-object v1, p0, Lfp/l0;->b:Lvo/j0$n;

    iget-object v2, p0, Lfp/l0;->c:Lls/g;

    iget-object v3, p0, Lfp/l0;->d:Lvo/f;

    iget-object v4, p0, Lfp/l0;->e:Lln/h;

    move-object v5, p1

    check-cast v5, Lzt/n;

    invoke-static/range {v0 .. v5}, Lfp/m0;->f(Lfp/m0;Lvo/j0$n;Lls/g;Lvo/f;Lln/h;Lzt/n;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
