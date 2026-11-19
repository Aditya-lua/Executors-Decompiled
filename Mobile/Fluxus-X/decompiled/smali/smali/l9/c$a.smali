.class public final Ll9/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ll9/f;

.field public b:Z

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ll9/c$a;->b:Z

    return-void
.end method


# virtual methods
.method public a()Ll9/c;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ll9/c;

    iget-object v1, p0, Ll9/c$a;->a:Ll9/f;

    iget-boolean v2, p0, Ll9/c$a;->b:Z

    invoke-direct {v0, v1, v2}, Ll9/c;-><init>(Ll9/f;Z)V

    iget-boolean v1, p0, Ll9/c$a;->c:Z

    invoke-virtual {v0, v1}, Ll9/c;->C3(Z)V

    return-object v0
.end method

.method public b(Ll9/f;)Ll9/c$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Ll9/c$a;->a:Ll9/f;

    return-object p0
.end method

.method public final synthetic c(Z)Ll9/c$a;
    .locals 0

    iput-boolean p1, p0, Ll9/c$a;->c:Z

    return-object p0
.end method
