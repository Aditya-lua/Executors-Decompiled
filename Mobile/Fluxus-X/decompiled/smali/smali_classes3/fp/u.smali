.class public final synthetic Lfp/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lfp/m0;

.field public final synthetic b:Lls/g;

.field public final synthetic c:Lvo/d2$a;

.field public final synthetic d:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lfp/m0;Lls/g;Lvo/d2$a;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/u;->a:Lfp/m0;

    iput-object p2, p0, Lfp/u;->b:Lls/g;

    iput-object p3, p0, Lfp/u;->c:Lvo/d2$a;

    iput-object p4, p0, Lfp/u;->d:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lfp/u;->a:Lfp/m0;

    iget-object v1, p0, Lfp/u;->b:Lls/g;

    iget-object v2, p0, Lfp/u;->c:Lvo/d2$a;

    iget-object v3, p0, Lfp/u;->d:Lip/l;

    invoke-static {v0, v1, v2, v3}, Lfp/m0;->c(Lfp/m0;Lls/g;Lvo/d2$a;Lip/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
