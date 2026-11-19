.class public final Lob/lc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/ComponentName;

.field public final synthetic b:Lob/sc;


# direct methods
.method public constructor <init>(Lob/sc;Landroid/content/ComponentName;)V
    .locals 0

    iput-object p2, p0, Lob/lc;->a:Landroid/content/ComponentName;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/lc;->b:Lob/sc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lob/lc;->b:Lob/sc;

    iget-object v0, v0, Lob/sc;->c:Lob/yc;

    iget-object v1, p0, Lob/lc;->a:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Lob/yc;->K(Landroid/content/ComponentName;)V

    return-void
.end method
