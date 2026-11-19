.class public final synthetic Lep/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvo/y3$g;


# direct methods
.method public synthetic constructor <init>(Lvo/y3$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/o;->a:Lvo/y3$g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lep/o;->a:Lvo/y3$g;

    invoke-static {v0}, Lep/p;->a(Lvo/y3$g;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
