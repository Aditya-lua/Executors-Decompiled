.class public final synthetic Lnb/yc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/bd;

.field public final synthetic b:Lnb/w5;

.field public final synthetic c:Landroid/app/job/JobParameters;


# direct methods
.method public synthetic constructor <init>(Lnb/bd;Lnb/w5;Landroid/app/job/JobParameters;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/yc;->a:Lnb/bd;

    iput-object p2, p0, Lnb/yc;->b:Lnb/w5;

    iput-object p3, p0, Lnb/yc;->c:Landroid/app/job/JobParameters;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lnb/yc;->a:Lnb/bd;

    iget-object v1, p0, Lnb/yc;->b:Lnb/w5;

    iget-object v2, p0, Lnb/yc;->c:Landroid/app/job/JobParameters;

    invoke-virtual {v0, v1, v2}, Lnb/bd;->g(Lnb/w5;Landroid/app/job/JobParameters;)V

    return-void
.end method
