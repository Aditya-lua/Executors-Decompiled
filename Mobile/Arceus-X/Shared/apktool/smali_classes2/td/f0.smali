.class public final Ltd/f0;
.super Lee/u0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ltd/n0;


# direct methods
.method public constructor <init>(Ltd/n0;Lsb/k;Landroid/content/Context;)V
    .locals 0

    iput-object p3, p0, Ltd/f0;->b:Landroid/content/Context;

    iput-object p1, p0, Ltd/f0;->c:Ltd/n0;

    invoke-direct {p0, p2}, Lee/u0;-><init>(Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Ltd/f0;->b:Landroid/content/Context;

    iget-object v1, p0, Ltd/f0;->c:Ltd/n0;

    invoke-static {v1}, Ltd/n0;->e(Ltd/n0;)Lsb/k;

    move-result-object v1

    invoke-static {v0}, Lee/j;->a(Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
