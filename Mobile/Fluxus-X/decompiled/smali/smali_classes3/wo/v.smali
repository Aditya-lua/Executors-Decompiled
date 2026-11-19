.class public final synthetic Lwo/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lwo/z;

.field public final synthetic b:Lqr/i2;

.field public final synthetic c:Lvo/y3$a;


# direct methods
.method public synthetic constructor <init>(Lwo/z;Lqr/i2;Lvo/y3$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwo/v;->a:Lwo/z;

    iput-object p2, p0, Lwo/v;->b:Lqr/i2;

    iput-object p3, p0, Lwo/v;->c:Lvo/y3$a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lwo/v;->a:Lwo/z;

    iget-object v1, p0, Lwo/v;->b:Lqr/i2;

    iget-object v2, p0, Lwo/v;->c:Lvo/y3$a;

    invoke-static {v0, v1, v2, p1}, Lwo/z;->h(Lwo/z;Lqr/i2;Lvo/y3$a;Landroid/view/View;)V

    return-void
.end method
