.class public final synthetic Ljj/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljj/r$d;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ljj/r$d;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljj/o;->a:Ljj/r$d;

    iput-object p2, p0, Ljj/o;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ljj/o;->a:Ljj/r$d;

    iget-object v1, p0, Ljj/o;->b:Landroid/content/Context;

    check-cast p1, Lmj/k0;

    invoke-static {v0, v1, p1}, Ljj/r;->a(Ljj/r$d;Landroid/content/Context;Lmj/k0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
