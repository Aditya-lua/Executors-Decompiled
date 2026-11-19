.class public final synthetic Lfp/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lls/g;

.field public final synthetic b:Lvo/d2$a;

.field public final synthetic c:Lip/l;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lls/g;Lvo/d2$a;Lip/l;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/w;->a:Lls/g;

    iput-object p2, p0, Lfp/w;->b:Lvo/d2$a;

    iput-object p3, p0, Lfp/w;->c:Lip/l;

    iput-object p4, p0, Lfp/w;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lfp/w;->a:Lls/g;

    iget-object v1, p0, Lfp/w;->b:Lvo/d2$a;

    iget-object v2, p0, Lfp/w;->c:Lip/l;

    iget-object v3, p0, Lfp/w;->d:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, v3}, Lfp/m0;->g(Lls/g;Lvo/d2$a;Lip/l;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
