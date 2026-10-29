.class public final synthetic Lyp/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/c;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/k;->a:Lcom/withpersona/sdk2/inquiry/selfie/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lyp/k;->a:Lcom/withpersona/sdk2/inquiry/selfie/c;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/selfie/c$a;->a(Lcom/withpersona/sdk2/inquiry/selfie/c;)V

    return-void
.end method
