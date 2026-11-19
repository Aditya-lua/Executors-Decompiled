.class public final synthetic Lwo/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lvo/y3$a;


# direct methods
.method public synthetic constructor <init>(Lvo/y3$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwo/x;->a:Lvo/y3$a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lwo/x;->a:Lvo/y3$a;

    invoke-static {v0, p1}, Lwo/z;->j(Lvo/y3$a;Landroid/view/View;)V

    return-void
.end method
