.class public final synthetic Lvo/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvo/y3$k;


# direct methods
.method public synthetic constructor <init>(Lvo/y3$k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/m0;->a:Lvo/y3$k;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvo/m0;->a:Lvo/y3$k;

    invoke-static {v0}, Lvo/o0;->d(Lvo/y3$k;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
