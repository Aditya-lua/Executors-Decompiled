.class public final synthetic Lcr/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/f0;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object v0, p0, Lcr/f0;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;

    invoke-static {v0, p1, p2}, Lcr/i0;->a(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
