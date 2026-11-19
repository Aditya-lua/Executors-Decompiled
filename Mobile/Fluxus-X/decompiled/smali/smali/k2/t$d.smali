.class public final Lk2/t$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Landroid/os/Bundle;

.field public d:Ljava/lang/CharSequence;

.field public e:[Ljava/lang/CharSequence;

.field public f:Z

.field public g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lk2/t$d;->b:Ljava/util/Set;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lk2/t$d;->c:Landroid/os/Bundle;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk2/t$d;->f:Z

    const/4 v0, 0x0

    iput v0, p0, Lk2/t$d;->g:I

    if-eqz p1, :cond_0

    iput-object p1, p0, Lk2/t$d;->a:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Result key can\'t be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lk2/t;
    .locals 8

    new-instance v0, Lk2/t;

    iget-object v1, p0, Lk2/t$d;->a:Ljava/lang/String;

    iget-object v2, p0, Lk2/t$d;->d:Ljava/lang/CharSequence;

    iget-object v3, p0, Lk2/t$d;->e:[Ljava/lang/CharSequence;

    iget-boolean v4, p0, Lk2/t$d;->f:Z

    iget v5, p0, Lk2/t$d;->g:I

    iget-object v6, p0, Lk2/t$d;->c:Landroid/os/Bundle;

    iget-object v7, p0, Lk2/t$d;->b:Ljava/util/Set;

    invoke-direct/range {v0 .. v7}, Lk2/t;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZILandroid/os/Bundle;Ljava/util/Set;)V

    return-object v0
.end method

.method public b(Ljava/lang/CharSequence;)Lk2/t$d;
    .locals 0

    iput-object p1, p0, Lk2/t$d;->d:Ljava/lang/CharSequence;

    return-object p0
.end method
