.class public final Lv8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:I

.field public final c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lv8/f;->a:Z

    iput v0, p0, Lv8/f;->b:I

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lv8/f;->c:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/firebase/appindexing/internal/zzj;
    .locals 6

    new-instance v0, Lcom/google/firebase/appindexing/internal/zzj;

    iget-boolean v1, p0, Lv8/f;->a:Z

    iget v2, p0, Lv8/f;->b:I

    iget-object v4, p0, Lv8/f;->c:Landroid/os/Bundle;

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v3, ""

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/appindexing/internal/zzj;-><init>(ZILjava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V

    return-object v0
.end method
