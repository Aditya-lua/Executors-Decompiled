.class public final synthetic Le3/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Le3/p;


# direct methods
.method public synthetic constructor <init>(Le3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/b0;->a:Le3/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le3/b0;->a:Le3/p;

    invoke-static {v0}, Le3/d0;->b(Le3/p;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
