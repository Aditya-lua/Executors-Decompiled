.class public Ltc/d$c;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltc/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Ltc/d;",
        "Ltc/d$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Ltc/d;",
            "Ltc/d$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltc/d$c;

    const-string v1, "circularReveal"

    invoke-direct {v0, v1}, Ltc/d$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Ltc/d$c;->a:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-class v0, Ltc/d$e;

    invoke-direct {p0, v0, p1}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ltc/d;)Ltc/d$e;
    .locals 0
    .param p1    # Ltc/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Ltc/d;->getRevealInfo()Ltc/d$e;

    move-result-object p1

    return-object p1
.end method

.method public b(Ltc/d;Ltc/d$e;)V
    .locals 0
    .param p1    # Ltc/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1, p2}, Ltc/d;->setRevealInfo(Ltc/d$e;)V

    return-void
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Ltc/d;

    invoke-virtual {p0, p1}, Ltc/d$c;->a(Ltc/d;)Ltc/d$e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Ltc/d;

    check-cast p2, Ltc/d$e;

    invoke-virtual {p0, p1, p2}, Ltc/d$c;->b(Ltc/d;Ltc/d$e;)V

    return-void
.end method
