.class public Lg0/v2$b;
.super Ln0/u1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg0/v2;-><init>(Landroid/util/Size;Ln0/p0;ZLg0/k0;ILandroid/util/Range;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Lg0/v2;


# direct methods
.method public constructor <init>(Lg0/v2;Landroid/util/Size;I)V
    .locals 0

    iput-object p1, p0, Lg0/v2$b;->o:Lg0/v2;

    invoke-direct {p0, p2, p3}, Ln0/u1;-><init>(Landroid/util/Size;I)V

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

    iget-object v0, p0, Lg0/v2$b;->o:Lg0/v2;

    iget-object v0, v0, Lg0/v2;->h:Lne/x;

    return-object v0
.end method
