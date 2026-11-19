.class public final synthetic Lip/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lip/v;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Lvo/d2$a;


# direct methods
.method public synthetic constructor <init>(Lip/v;Lln/k$a;Lvo/d2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lip/s;->a:Lip/v;

    iput-object p2, p0, Lip/s;->b:Lln/k$a;

    iput-object p3, p0, Lip/s;->c:Lvo/d2$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lip/s;->a:Lip/v;

    iget-object v1, p0, Lip/s;->b:Lln/k$a;

    iget-object v2, p0, Lip/s;->c:Lvo/d2$a;

    invoke-static {v0, v1, v2}, Lip/v;->h(Lip/v;Lln/k$a;Lvo/d2$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
