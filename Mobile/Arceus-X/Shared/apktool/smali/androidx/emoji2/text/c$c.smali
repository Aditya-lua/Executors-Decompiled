.class public abstract Landroidx/emoji2/text/c$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field public final a:Landroidx/emoji2/text/c$h;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public b:Landroidx/emoji2/text/c$j;

.field public c:Z

.field public d:Z

.field public e:[I

.field public f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/emoji2/text/c$f;",
            ">;"
        }
    .end annotation
.end field

.field public g:Z

.field public h:I

.field public i:I

.field public j:Landroidx/emoji2/text/c$e;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/c$h;)V
    .locals 1
    .param p1    # Landroidx/emoji2/text/c$h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, -0xff0100

    iput v0, p0, Landroidx/emoji2/text/c$c;->h:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/emoji2/text/c$c;->i:I

    new-instance v0, Landroidx/emoji2/text/b;

    invoke-direct {v0}, Landroidx/emoji2/text/b;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/c$c;->j:Landroidx/emoji2/text/c$e;

    const-string v0, "metadataLoader cannot be null."

    invoke-static {p1, v0}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Landroidx/emoji2/text/c$c;->a:Landroidx/emoji2/text/c$h;

    return-void
.end method


# virtual methods
.method public final a()Landroidx/emoji2/text/c$h;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Landroidx/emoji2/text/c$c;->a:Landroidx/emoji2/text/c$h;

    return-object v0
.end method

.method public b(I)Landroidx/emoji2/text/c$c;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput p1, p0, Landroidx/emoji2/text/c$c;->i:I

    return-object p0
.end method
