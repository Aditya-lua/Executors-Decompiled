.class public final synthetic Lob/ed;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/gd;

.field public final synthetic b:Landroid/app/job/JobParameters;


# direct methods
.method public synthetic constructor <init>(Lob/gd;Landroid/app/job/JobParameters;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/ed;->a:Lob/gd;

    iput-object p2, p0, Lob/ed;->b:Landroid/app/job/JobParameters;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lob/ed;->a:Lob/gd;

    iget-object v1, p0, Lob/ed;->b:Landroid/app/job/JobParameters;

    invoke-virtual {v0, v1}, Lob/gd;->h(Landroid/app/job/JobParameters;)V

    return-void
.end method
