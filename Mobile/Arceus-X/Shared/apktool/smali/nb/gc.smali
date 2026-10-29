.class public final Lnb/gc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/ComponentName;

.field public final synthetic b:Lnb/nc;


# direct methods
.method public constructor <init>(Lnb/nc;Landroid/content/ComponentName;)V
    .locals 0

    iput-object p2, p0, Lnb/gc;->a:Landroid/content/ComponentName;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/gc;->b:Lnb/nc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnb/gc;->b:Lnb/nc;

    iget-object v0, v0, Lnb/nc;->c:Lnb/tc;

    iget-object v1, p0, Lnb/gc;->a:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Lnb/tc;->K(Landroid/content/ComponentName;)V

    return-void
.end method
