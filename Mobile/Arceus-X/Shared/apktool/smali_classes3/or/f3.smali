.class public final synthetic Lor/f3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/g;

.field public final synthetic b:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic c:Lcr/w1;

.field public final synthetic d:Lcr/w3;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w1;Lcr/w3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/f3;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    iput-object p2, p0, Lor/f3;->b:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p3, p0, Lor/f3;->c:Lcr/w1;

    iput-object p4, p0, Lor/f3;->d:Lcr/w3;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lor/f3;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    iget-object v1, p0, Lor/f3;->b:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, p0, Lor/f3;->c:Lcr/w1;

    iget-object v3, p0, Lor/f3;->d:Lcr/w3;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->C(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w1;Lcr/w3;Landroid/view/View;)V

    return-void
.end method
