.class public final synthetic Les/z2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Les/h4;

.field public final synthetic b:Lqr/x5;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;

.field public final synthetic d:Les/s6$d$a;

.field public final synthetic e:Lnn/z;


# direct methods
.method public synthetic constructor <init>(Les/h4;Lqr/x5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Les/s6$d$a;Lnn/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/z2;->a:Les/h4;

    iput-object p2, p0, Les/z2;->b:Lqr/x5;

    iput-object p3, p0, Les/z2;->c:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;

    iput-object p4, p0, Les/z2;->d:Les/s6$d$a;

    iput-object p5, p0, Les/z2;->e:Lnn/z;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    iget-object v0, p0, Les/z2;->a:Les/h4;

    iget-object v1, p0, Les/z2;->b:Lqr/x5;

    iget-object v2, p0, Les/z2;->c:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;

    iget-object v3, p0, Les/z2;->d:Les/s6$d$a;

    iget-object v4, p0, Les/z2;->e:Lnn/z;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Les/h4;->x(Les/h4;Lqr/x5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Les/s6$d$a;Lnn/z;Landroid/view/View;)V

    return-void
.end method
