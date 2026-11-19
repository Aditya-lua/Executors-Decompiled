.class public final synthetic Lob/dd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/gd;

.field public final synthetic b:Lob/b6;

.field public final synthetic c:Landroid/app/job/JobParameters;


# direct methods
.method public synthetic constructor <init>(Lob/gd;Lob/b6;Landroid/app/job/JobParameters;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/dd;->a:Lob/gd;

    iput-object p2, p0, Lob/dd;->b:Lob/b6;

    iput-object p3, p0, Lob/dd;->c:Landroid/app/job/JobParameters;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lob/dd;->a:Lob/gd;

    iget-object v1, p0, Lob/dd;->b:Lob/b6;

    iget-object v2, p0, Lob/dd;->c:Landroid/app/job/JobParameters;

    invoke-virtual {v0, v1, v2}, Lob/gd;->g(Lob/b6;Landroid/app/job/JobParameters;)V

    return-void
.end method
