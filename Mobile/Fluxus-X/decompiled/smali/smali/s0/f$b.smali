.class public Ls0/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ln0/i4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/i4<",
            "*>;"
        }
    .end annotation
.end field

.field public b:Ln0/i4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/i4<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln0/i4;Ln0/i4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/i4<",
            "*>;",
            "Ln0/i4<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/f$b;->a:Ln0/i4;

    iput-object p2, p0, Ls0/f$b;->b:Ln0/i4;

    return-void
.end method
