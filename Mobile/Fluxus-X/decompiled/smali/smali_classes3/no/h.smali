.class public final synthetic Lno/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lno/j;


# direct methods
.method public synthetic constructor <init>(Lno/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/h;->a:Lno/j;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lno/h;->a:Lno/j;

    invoke-static {v0}, Lno/j;->d(Lno/j;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
