.class public final synthetic Lio/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lio/k;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;


# direct methods
.method public synthetic constructor <init>(Lio/k;Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/j;->a:Lio/k;

    iput-object p2, p0, Lio/j;->b:Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lio/j;->a:Lio/k;

    iget-object v1, p0, Lio/j;->b:Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;

    invoke-static {v0, v1, p1}, Lio/k;->C(Lio/k;Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;Landroid/view/View;)V

    return-void
.end method
