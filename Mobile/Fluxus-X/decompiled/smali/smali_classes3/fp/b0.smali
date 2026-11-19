.class public final synthetic Lfp/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lks/a;

.field public final synthetic b:Lls/g;


# direct methods
.method public synthetic constructor <init>(Lks/a;Lls/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/b0;->a:Lks/a;

    iput-object p2, p0, Lfp/b0;->b:Lls/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfp/b0;->a:Lks/a;

    iget-object v1, p0, Lfp/b0;->b:Lls/g;

    invoke-static {v0, v1}, Lfp/m0;->q(Lks/a;Lls/g;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
