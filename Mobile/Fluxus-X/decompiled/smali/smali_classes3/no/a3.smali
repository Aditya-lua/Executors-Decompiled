.class public final synthetic Lno/a3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lno/y2$b;


# direct methods
.method public synthetic constructor <init>(Lno/y2$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/a3;->a:Lno/y2$b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lno/a3;->a:Lno/y2$b;

    invoke-static {v0}, Lno/y2$b;->a(Lno/y2$b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
