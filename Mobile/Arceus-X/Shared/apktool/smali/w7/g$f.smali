.class public Lw7/g$f;
.super Lw7/g$o0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# static fields
.field public static final b:Lw7/g$f;

.field public static final c:Lw7/g$f;


# instance fields
.field public a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw7/g$f;

    const/high16 v1, -0x1000000

    invoke-direct {v0, v1}, Lw7/g$f;-><init>(I)V

    sput-object v0, Lw7/g$f;->b:Lw7/g$f;

    new-instance v0, Lw7/g$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw7/g$f;-><init>(I)V

    sput-object v0, Lw7/g$f;->c:Lw7/g$f;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lw7/g$o0;-><init>()V

    iput p1, p0, Lw7/g$f;->a:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lw7/g$f;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "#%08x"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
