.class public final synthetic Lep/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lep/m;

.field public final synthetic b:Lvo/y3;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lep/m;Lvo/y3;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/f;->a:Lep/m;

    iput-object p2, p0, Lep/f;->b:Lvo/y3;

    iput-object p3, p0, Lep/f;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lep/f;->a:Lep/m;

    iget-object v1, p0, Lep/f;->b:Lvo/y3;

    iget-object v2, p0, Lep/f;->c:Landroid/content/Context;

    invoke-static {v0, v1, v2}, Lep/m;->i2(Lep/m;Lvo/y3;Landroid/content/Context;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
