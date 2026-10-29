.class public final Lw2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public c:Lw2/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Lw2/a;->e(Ljava/util/Locale;)Z

    move-result v0

    invoke-virtual {p0, v0}, Lw2/a$a;->c(Z)V

    return-void
.end method

.method public static b(Z)Lw2/a;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, Lw2/a;->h:Lw2/a;

    return-object p0

    :cond_0
    sget-object p0, Lw2/a;->g:Lw2/a;

    return-object p0
.end method


# virtual methods
.method public a()Lw2/a;
    .locals 4

    iget v0, p0, Lw2/a$a;->b:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lw2/a$a;->c:Lw2/f;

    sget-object v1, Lw2/a;->d:Lw2/f;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lw2/a$a;->a:Z

    invoke-static {v0}, Lw2/a$a;->b(Z)Lw2/a;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lw2/a;

    iget-boolean v1, p0, Lw2/a$a;->a:Z

    iget v2, p0, Lw2/a$a;->b:I

    iget-object v3, p0, Lw2/a$a;->c:Lw2/f;

    invoke-direct {v0, v1, v2, v3}, Lw2/a;-><init>(ZILw2/f;)V

    return-object v0
.end method

.method public final c(Z)V
    .locals 0

    iput-boolean p1, p0, Lw2/a$a;->a:Z

    sget-object p1, Lw2/a;->d:Lw2/f;

    iput-object p1, p0, Lw2/a$a;->c:Lw2/f;

    const/4 p1, 0x2

    iput p1, p0, Lw2/a$a;->b:I

    return-void
.end method
