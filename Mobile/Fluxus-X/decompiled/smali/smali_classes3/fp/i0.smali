.class public final synthetic Lfp/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lvo/j0$d;

.field public final synthetic b:Lfp/m0;

.field public final synthetic c:Lvo/d2$a;

.field public final synthetic d:Lls/g;

.field public final synthetic e:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lvo/j0$d;Lfp/m0;Lvo/d2$a;Lls/g;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/i0;->a:Lvo/j0$d;

    iput-object p2, p0, Lfp/i0;->b:Lfp/m0;

    iput-object p3, p0, Lfp/i0;->c:Lvo/d2$a;

    iput-object p4, p0, Lfp/i0;->d:Lls/g;

    iput-object p5, p0, Lfp/i0;->e:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lfp/i0;->a:Lvo/j0$d;

    iget-object v1, p0, Lfp/i0;->b:Lfp/m0;

    iget-object v2, p0, Lfp/i0;->c:Lvo/d2$a;

    iget-object v3, p0, Lfp/i0;->d:Lls/g;

    iget-object v4, p0, Lfp/i0;->e:Lip/l;

    move-object v5, p1

    check-cast v5, Ljava/util/List;

    move-object v6, p2

    check-cast v6, Lsn/v;

    invoke-static/range {v0 .. v6}, Lfp/m0;->v(Lvo/j0$d;Lfp/m0;Lvo/d2$a;Lls/g;Lip/l;Ljava/util/List;Lsn/v;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
