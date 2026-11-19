.class public final La9/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Z

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La9/e;
    .locals 7
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, La9/e;

    iget-object v1, p0, La9/e$a;->a:Ljava/lang/String;

    iget-object v2, p0, La9/e$a;->b:Ljava/lang/String;

    iget-object v3, p0, La9/e$a;->c:Ljava/lang/String;

    iget-object v4, p0, La9/e$a;->d:Ljava/lang/String;

    iget-boolean v5, p0, La9/e$a;->e:Z

    iget v6, p0, La9/e$a;->f:I

    invoke-direct/range {v0 .. v6}, La9/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)La9/e$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, La9/e$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)La9/e$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, La9/e$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public d(Z)La9/e$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-boolean p1, p0, La9/e$a;->e:Z

    return-object p0
.end method

.method public e(Ljava/lang/String;)La9/e$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, La9/e$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final f(Ljava/lang/String;)La9/e$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, La9/e$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final g(I)La9/e$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput p1, p0, La9/e$a;->f:I

    return-object p0
.end method
