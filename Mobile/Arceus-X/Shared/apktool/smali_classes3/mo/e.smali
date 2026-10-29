.class public final synthetic Lmo/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lmo/h;


# direct methods
.method public synthetic constructor <init>(Lmo/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo/e;->a:Lmo/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmo/e;->a:Lmo/h;

    invoke-static {v0}, Lmo/h;->b(Lmo/h;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
