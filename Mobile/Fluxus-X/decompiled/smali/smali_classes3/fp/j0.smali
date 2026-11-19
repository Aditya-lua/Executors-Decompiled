.class public final synthetic Lfp/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lls/g;

.field public final synthetic b:Lvo/j0$d;

.field public final synthetic c:Lvo/d2$a;

.field public final synthetic d:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lls/g;Lvo/j0$d;Lvo/d2$a;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/j0;->a:Lls/g;

    iput-object p2, p0, Lfp/j0;->b:Lvo/j0$d;

    iput-object p3, p0, Lfp/j0;->c:Lvo/d2$a;

    iput-object p4, p0, Lfp/j0;->d:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lfp/j0;->a:Lls/g;

    iget-object v1, p0, Lfp/j0;->b:Lvo/j0$d;

    iget-object v2, p0, Lfp/j0;->c:Lvo/d2$a;

    iget-object v3, p0, Lfp/j0;->d:Lip/l;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, v3, p1}, Lfp/m0;->b(Lls/g;Lvo/j0$d;Lvo/d2$a;Lip/l;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
