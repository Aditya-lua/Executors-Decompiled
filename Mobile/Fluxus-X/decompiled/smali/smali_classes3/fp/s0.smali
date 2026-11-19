.class public final synthetic Lfp/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lfp/v0;

.field public final synthetic b:Lvo/j0$e;

.field public final synthetic c:Lvo/d2$a;

.field public final synthetic d:Lip/l;

.field public final synthetic e:Lls/g;


# direct methods
.method public synthetic constructor <init>(Lfp/v0;Lvo/j0$e;Lvo/d2$a;Lip/l;Lls/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/s0;->a:Lfp/v0;

    iput-object p2, p0, Lfp/s0;->b:Lvo/j0$e;

    iput-object p3, p0, Lfp/s0;->c:Lvo/d2$a;

    iput-object p4, p0, Lfp/s0;->d:Lip/l;

    iput-object p5, p0, Lfp/s0;->e:Lls/g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lfp/s0;->a:Lfp/v0;

    iget-object v1, p0, Lfp/s0;->b:Lvo/j0$e;

    iget-object v2, p0, Lfp/s0;->c:Lvo/d2$a;

    iget-object v3, p0, Lfp/s0;->d:Lip/l;

    iget-object v4, p0, Lfp/s0;->e:Lls/g;

    move-object v5, p1

    check-cast v5, Ljava/io/File;

    move-object v6, p2

    check-cast v6, Lsn/v;

    invoke-static/range {v0 .. v6}, Lfp/v0;->g(Lfp/v0;Lvo/j0$e;Lvo/d2$a;Lip/l;Lls/g;Ljava/io/File;Lsn/v;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
