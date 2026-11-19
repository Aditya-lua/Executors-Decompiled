.class public final synthetic Lvo/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvo/y3$e;


# direct methods
.method public synthetic constructor <init>(Lvo/y3$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/t;->a:Lvo/y3$e;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvo/t;->a:Lvo/y3$e;

    invoke-static {v0}, Lvo/w;->e(Lvo/y3$e;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
