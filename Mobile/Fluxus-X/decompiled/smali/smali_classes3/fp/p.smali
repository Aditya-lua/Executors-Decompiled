.class public final synthetic Lfp/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lvo/j0$n;

.field public final synthetic b:Lvo/f;

.field public final synthetic c:Lfp/m0;

.field public final synthetic d:Lvo/d2$a;

.field public final synthetic e:Lls/g;

.field public final synthetic f:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lvo/j0$n;Lvo/f;Lfp/m0;Lvo/d2$a;Lls/g;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/p;->a:Lvo/j0$n;

    iput-object p2, p0, Lfp/p;->b:Lvo/f;

    iput-object p3, p0, Lfp/p;->c:Lfp/m0;

    iput-object p4, p0, Lfp/p;->d:Lvo/d2$a;

    iput-object p5, p0, Lfp/p;->e:Lls/g;

    iput-object p6, p0, Lfp/p;->f:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lfp/p;->a:Lvo/j0$n;

    iget-object v1, p0, Lfp/p;->b:Lvo/f;

    iget-object v2, p0, Lfp/p;->c:Lfp/m0;

    iget-object v3, p0, Lfp/p;->d:Lvo/d2$a;

    iget-object v4, p0, Lfp/p;->e:Lls/g;

    iget-object v5, p0, Lfp/p;->f:Lip/l;

    move-object v6, p1

    check-cast v6, Ljava/util/List;

    move-object v7, p2

    check-cast v7, Lsn/v;

    invoke-static/range {v0 .. v7}, Lfp/m0;->m(Lvo/j0$n;Lvo/f;Lfp/m0;Lvo/d2$a;Lls/g;Lip/l;Ljava/util/List;Lsn/v;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
