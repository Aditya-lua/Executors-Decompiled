.class public final synthetic Lfp/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt7/e;


# instance fields
.field public final synthetic a:Lfp/f;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lfp/f;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/b;->a:Lfp/f;

    iput-object p2, p0, Lfp/b;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final a(Lt7/b;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfp/b;->a:Lfp/f;

    iget-object v1, p0, Lfp/b;->b:Landroid/view/View;

    invoke-static {v0, v1, p1}, Lfp/f;->g2(Lfp/f;Landroid/view/View;Lt7/b;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
