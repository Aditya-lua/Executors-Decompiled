.class public final La9/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public a:La9/k;

.field public b:Ljava/lang/String;

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La9/g;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, La9/g;

    iget-object v1, p0, La9/g$a;->a:La9/k;

    iget-object v2, p0, La9/g$a;->b:Ljava/lang/String;

    iget v3, p0, La9/g$a;->c:I

    invoke-direct {v0, v1, v2, v3}, La9/g;-><init>(La9/k;Ljava/lang/String;I)V

    return-object v0
.end method

.method public b(La9/k;)La9/g$a;
    .locals 0
    .param p1    # La9/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, La9/g$a;->a:La9/k;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)La9/g$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, La9/g$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final d(I)La9/g$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput p1, p0, La9/g$a;->c:I

    return-object p0
.end method
