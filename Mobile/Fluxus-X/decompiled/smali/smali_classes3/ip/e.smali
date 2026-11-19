.class public final synthetic Lip/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lvo/j0$e;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Lvo/d2$a;

.field public final synthetic d:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lvo/j0$e;Lln/k$a;Lvo/d2$a;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lip/e;->a:Lvo/j0$e;

    iput-object p2, p0, Lip/e;->b:Lln/k$a;

    iput-object p3, p0, Lip/e;->c:Lvo/d2$a;

    iput-object p4, p0, Lip/e;->d:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lip/e;->a:Lvo/j0$e;

    iget-object v1, p0, Lip/e;->b:Lln/k$a;

    iget-object v2, p0, Lip/e;->c:Lvo/d2$a;

    iget-object v3, p0, Lip/e;->d:Lip/l;

    move-object v4, p1

    check-cast v4, Ljava/io/File;

    move-object v5, p2

    check-cast v5, Lsn/v;

    invoke-static/range {v0 .. v5}, Lip/j;->f(Lvo/j0$e;Lln/k$a;Lvo/d2$a;Lip/l;Ljava/io/File;Lsn/v;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
