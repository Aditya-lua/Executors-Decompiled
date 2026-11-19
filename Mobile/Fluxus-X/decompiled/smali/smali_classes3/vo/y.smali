.class public final synthetic Lvo/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lvo/z;

.field public final synthetic b:Lvo/l;


# direct methods
.method public synthetic constructor <init>(Lvo/z;Lvo/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/y;->a:Lvo/z;

    iput-object p2, p0, Lvo/y;->b:Lvo/l;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lvo/y;->a:Lvo/z;

    iget-object v1, p0, Lvo/y;->b:Lvo/l;

    invoke-static {v0, v1, p1}, Lvo/z;->C(Lvo/z;Lvo/l;Landroid/view/View;)V

    return-void
.end method
