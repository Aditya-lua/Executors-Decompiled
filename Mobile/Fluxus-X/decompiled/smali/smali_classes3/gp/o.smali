.class public final synthetic Lgp/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvo/y3$j;


# direct methods
.method public synthetic constructor <init>(Lvo/y3$j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgp/o;->a:Lvo/y3$j;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lgp/o;->a:Lvo/y3$j;

    invoke-static {v0}, Lgp/p;->b(Lvo/y3$j;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
