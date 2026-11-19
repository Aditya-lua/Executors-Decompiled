.class public final synthetic Lrj/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lrj/r$d;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lrj/r$d;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrj/o;->a:Lrj/r$d;

    iput-object p2, p0, Lrj/o;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lrj/o;->a:Lrj/r$d;

    iget-object v1, p0, Lrj/o;->b:Landroid/content/Context;

    check-cast p1, Luj/k0;

    invoke-static {v0, v1, p1}, Lrj/r;->a(Lrj/r$d;Landroid/content/Context;Luj/k0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
