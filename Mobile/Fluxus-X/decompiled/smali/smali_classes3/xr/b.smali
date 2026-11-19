.class public final synthetic Lxr/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lir/a;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxr/b;->a:Lir/a;

    iput-object p2, p0, Lxr/b;->b:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lxr/b;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lxr/b;->a:Lir/a;

    iget-object v1, p0, Lxr/b;->b:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lxr/b;->c:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2}, Lxr/c;->a(Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
