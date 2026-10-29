.class public Lxi/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxi/d;->d(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lxi/d;


# direct methods
.method public constructor <init>(Lxi/d;)V
    .locals 0

    iput-object p1, p0, Lxi/d$a;->a:Lxi/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lxi/d$a;->a:Lxi/d;

    invoke-virtual {p1}, Lxi/d;->e()V

    return-void
.end method
