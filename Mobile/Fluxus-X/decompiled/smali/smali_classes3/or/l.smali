.class public final synthetic Lor/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lor/s;


# direct methods
.method public synthetic constructor <init>(Lor/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/l;->a:Lor/s;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lor/l;->a:Lor/s;

    invoke-static {v0}, Lor/s;->f(Lor/s;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
