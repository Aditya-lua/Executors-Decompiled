.class public final synthetic Lfp/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lfp/m0;

.field public final synthetic b:Lvo/j0$n;

.field public final synthetic c:Lls/g;


# direct methods
.method public synthetic constructor <init>(Lfp/m0;Lvo/j0$n;Lls/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/t;->a:Lfp/m0;

    iput-object p2, p0, Lfp/t;->b:Lvo/j0$n;

    iput-object p3, p0, Lfp/t;->c:Lls/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfp/t;->a:Lfp/m0;

    iget-object v1, p0, Lfp/t;->b:Lvo/j0$n;

    iget-object v2, p0, Lfp/t;->c:Lls/g;

    invoke-static {v0, v1, v2}, Lfp/m0;->j(Lfp/m0;Lvo/j0$n;Lls/g;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
