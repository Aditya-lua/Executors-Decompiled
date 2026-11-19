.class public Lb1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/i4;
.implements Ln0/i2;
.implements Ls0/r;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln0/i4<",
        "Lb1/g;",
        ">;",
        "Ln0/i2;",
        "Ls0/r;"
    }
.end annotation


# static fields
.field public static final Q:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public final P:Ln0/c3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.streamSharing.captureTypes"

    const-class v1, Ljava/util/List;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lb1/i;->Q:Ln0/n1$a;

    return-void
.end method

.method public constructor <init>(Ln0/c3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/i;->P:Ln0/c3;

    return-void
.end method


# virtual methods
.method public h0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;"
        }
    .end annotation

    sget-object v0, Lb1/i;->Q:Ln0/n1$a;

    invoke-interface {p0, v0}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public n()Ln0/n1;
    .locals 1

    iget-object v0, p0, Lb1/i;->P:Ln0/c3;

    return-object v0
.end method
