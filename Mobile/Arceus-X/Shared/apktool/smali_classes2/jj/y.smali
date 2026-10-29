.class public final synthetic Ljj/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljj/a0$b;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljj/a0$b;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljj/y;->a:Ljj/a0$b;

    iput-object p2, p0, Ljj/y;->b:Landroid/content/Context;

    iput-object p3, p0, Ljj/y;->c:Ljava/lang/String;

    iput-object p4, p0, Ljj/y;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ljj/y;->a:Ljj/a0$b;

    iget-object v1, p0, Ljj/y;->b:Landroid/content/Context;

    iget-object v2, p0, Ljj/y;->c:Ljava/lang/String;

    iget-object v3, p0, Ljj/y;->d:Ljava/lang/String;

    check-cast p1, Lmj/g0;

    invoke-static {v0, v1, v2, v3, p1}, Ljj/a0;->b(Ljj/a0$b;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lmj/g0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
