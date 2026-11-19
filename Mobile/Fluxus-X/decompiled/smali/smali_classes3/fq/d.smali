.class public final synthetic Lfq/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lfq/h;


# direct methods
.method public synthetic constructor <init>(Lfq/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/d;->a:Lfq/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfq/d;->a:Lfq/h;

    invoke-static {v0}, Lfq/h;->a(Lfq/h;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
