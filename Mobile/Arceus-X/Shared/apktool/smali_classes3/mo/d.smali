.class public final synthetic Lmo/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lno/c;


# direct methods
.method public synthetic constructor <init>(Lno/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo/d;->a:Lno/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmo/d;->a:Lno/c;

    invoke-static {v0}, Lmo/h;->f(Lno/c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
