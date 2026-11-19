.class public final synthetic Lgp/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvo/y3$d;


# direct methods
.method public synthetic constructor <init>(Lvo/y3$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgp/g;->a:Lvo/y3$d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lgp/g;->a:Lvo/y3$d;

    invoke-static {v0}, Lgp/j;->d(Lvo/y3$d;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
