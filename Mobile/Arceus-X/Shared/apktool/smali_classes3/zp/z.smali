.class public final synthetic Lzp/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lzp/k0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lzp/k0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp/z;->a:Lzp/k0;

    iput-object p2, p0, Lzp/z;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    iput p3, p0, Lzp/z;->c:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lzp/z;->a:Lzp/k0;

    iget-object v1, p0, Lzp/z;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    iget v2, p0, Lzp/z;->c:I

    invoke-static {v0, v1, v2}, Lzp/k0;->f(Lzp/k0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;I)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
