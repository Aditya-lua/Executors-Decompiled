.class public final Lma/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Landroid/content/Intent;


# direct methods
.method public constructor <init>(ZLandroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lma/c;->a:Z

    iput-object p2, p0, Lma/c;->b:Landroid/content/Intent;

    return-void
.end method

.method public static a(Landroid/content/Intent;)Lma/c;
    .locals 2

    new-instance v0, Lma/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Lma/c;-><init>(ZLandroid/content/Intent;)V

    return-object v0
.end method

.method public static b(Landroid/content/Intent;)Lma/c;
    .locals 2

    new-instance v0, Lma/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lma/c;-><init>(ZLandroid/content/Intent;)V

    return-object v0
.end method


# virtual methods
.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lma/c;->a:Z

    return v0
.end method

.method public final d()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lma/c;->b:Landroid/content/Intent;

    return-object v0
.end method
