.class public interface abstract Ln0/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/l3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/h0$a;
    }
.end annotation


# static fields
.field public static final a:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/j4;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/e2;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/q3;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/h0$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Ln0/h0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "camerax.core.camera.useCaseConfigFactory"

    const-class v1, Ln0/j4;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/h0;->a:Ln0/n1$a;

    const-string v0, "camerax.core.camera.compatibilityId"

    const-class v1, Ln0/e2;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/h0;->b:Ln0/n1$a;

    const-string v0, "camerax.core.camera.useCaseCombinationRequiredRule"

    const-class v1, Ljava/lang/Integer;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/h0;->c:Ln0/n1$a;

    const-string v0, "camerax.core.camera.SessionProcessor"

    const-class v1, Ln0/q3;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/h0;->d:Ln0/n1$a;

    const-string v0, "camerax.core.camera.isZslDisabled"

    const-class v1, Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/h0;->e:Ln0/n1$a;

    const-string v0, "camerax.core.camera.isPostviewSupported"

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/h0;->f:Ln0/n1$a;

    const-string v0, "camerax.core.camera.PostviewFormatSelector"

    const-class v2, Ln0/h0$a;

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/h0;->g:Ln0/n1$a;

    const-string v0, "camerax.core.camera.isCaptureProcessProgressSupported"

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/h0;->h:Ln0/n1$a;

    new-instance v0, Ln0/g0;

    invoke-direct {v0}, Ln0/g0;-><init>()V

    sput-object v0, Ln0/h0;->i:Ln0/h0$a;

    return-void
.end method

.method public static synthetic O(ILjava/util/List;)I
    .locals 1

    const/16 p0, 0x23

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return p0

    :cond_0
    const/16 p0, 0x100

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return p0

    :cond_1
    const/16 p0, 0x1005

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public I()Ln0/h0$a;
    .locals 2

    sget-object v0, Ln0/h0;->g:Ln0/n1$a;

    sget-object v1, Ln0/h0;->i:Ln0/h0$a;

    invoke-interface {p0, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/h0$a;

    return-object v0
.end method

.method public U()Z
    .locals 2

    sget-object v0, Ln0/h0;->f:Ln0/n1$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public abstract b0()Ln0/e2;
.end method

.method public c0()Z
    .locals 2

    sget-object v0, Ln0/h0;->h:Ln0/n1$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public k()Ln0/j4;
    .locals 2

    sget-object v0, Ln0/h0;->a:Ln0/n1$a;

    sget-object v1, Ln0/j4;->a:Ln0/j4;

    invoke-interface {p0, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/j4;

    return-object v0
.end method

.method public v()I
    .locals 2

    sget-object v0, Ln0/h0;->c:Ln0/n1$a;

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

.method public w(Ln0/q3;)Ln0/q3;
    .locals 1

    sget-object v0, Ln0/h0;->d:Ln0/n1$a;

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/q3;

    return-object p1
.end method
