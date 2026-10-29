.class public final synthetic Lyu/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lyu/m;


# direct methods
.method public synthetic constructor <init>(Lyu/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyu/k;->a:Lyu/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyu/k;->a:Lyu/m;

    invoke-static {v0}, Lyu/m;->b(Lyu/m;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
