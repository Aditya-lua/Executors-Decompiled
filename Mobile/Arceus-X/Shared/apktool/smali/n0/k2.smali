.class public final Ln0/k2;
.super Ln0/u1;
.source "SourceFile"


# instance fields
.field public final o:Landroid/view/Surface;


# direct methods
.method public constructor <init>(Landroid/view/Surface;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ln0/u1;-><init>()V

    .line 4
    iput-object p1, p0, Ln0/k2;->o:Landroid/view/Surface;

    return-void
.end method

.method public constructor <init>(Landroid/view/Surface;Landroid/util/Size;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Ln0/u1;-><init>(Landroid/util/Size;I)V

    .line 2
    iput-object p1, p0, Ln0/k2;->o:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public o()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/k2;->o:Landroid/view/Surface;

    invoke-static {v0}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object v0

    return-object v0
.end method
