.class public final synthetic Ltm/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ltm/d;


# direct methods
.method public synthetic constructor <init>(Ltm/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltm/c;->a:Ltm/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltm/c;->a:Ltm/d;

    invoke-static {v0}, Ltm/d;->b(Ltm/d;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
