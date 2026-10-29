.class public final synthetic Lnb/zc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/bd;

.field public final synthetic b:Landroid/app/job/JobParameters;


# direct methods
.method public synthetic constructor <init>(Lnb/bd;Landroid/app/job/JobParameters;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/zc;->a:Lnb/bd;

    iput-object p2, p0, Lnb/zc;->b:Landroid/app/job/JobParameters;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lnb/zc;->a:Lnb/bd;

    iget-object v1, p0, Lnb/zc;->b:Landroid/app/job/JobParameters;

    invoke-virtual {v0, v1}, Lnb/bd;->h(Landroid/app/job/JobParameters;)V

    return-void
.end method
