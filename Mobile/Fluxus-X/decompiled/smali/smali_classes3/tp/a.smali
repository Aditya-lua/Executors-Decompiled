.class public final synthetic Ltp/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu7/e;


# instance fields
.field public final synthetic a:Ltp/f;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Ltp/f;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltp/a;->a:Ltp/f;

    iput-object p2, p0, Ltp/a;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final a(Lu7/b;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltp/a;->a:Ltp/f;

    iget-object v1, p0, Ltp/a;->b:Landroid/view/View;

    invoke-static {v0, v1, p1}, Ltp/f;->j2(Ltp/f;Landroid/view/View;Lu7/b;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
