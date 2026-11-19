.class public interface abstract Ln0/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/l3;


# static fields
.field public static final j:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final l:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Lg0/k0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.imageInput.inputFormat"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/h2;->j:Ln0/n1$a;

    const-string v0, "camerax.core.imageInput.secondaryInputFormat"

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/h2;->k:Ln0/n1$a;

    const-string v0, "camerax.core.imageInput.inputDynamicRange"

    const-class v1, Lg0/k0;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/h2;->l:Ln0/n1$a;

    return-void
.end method


# virtual methods
.method public M()Lg0/k0;
    .locals 2

    sget-object v0, Ln0/h2;->l:Ln0/n1$a;

    sget-object v1, Lg0/k0;->c:Lg0/k0;

    invoke-interface {p0, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/k0;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/k0;

    return-object v0
.end method

.method public Q()Z
    .locals 1

    sget-object v0, Ln0/h2;->l:Ln0/n1$a;

    invoke-interface {p0, v0}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result v0

    return v0
.end method

.method public Z()I
    .locals 2

    sget-object v0, Ln0/h2;->k:Ln0/n1$a;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public p()I
    .locals 1

    sget-object v0, Ln0/h2;->j:Ln0/n1$a;

    invoke-interface {p0, v0}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method
