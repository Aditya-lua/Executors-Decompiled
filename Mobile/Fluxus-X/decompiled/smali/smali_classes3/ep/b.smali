.class public final synthetic Lep/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lls/g;

.field public final synthetic b:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lls/g;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/b;->a:Lls/g;

    iput-object p2, p0, Lep/b;->b:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lep/b;->a:Lls/g;

    iget-object v1, p0, Lep/b;->b:Lip/l;

    invoke-static {v0, v1}, Lep/e;->a(Lls/g;Lip/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
