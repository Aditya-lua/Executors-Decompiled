.class public abstract Lw7/g$l0;
.super Lw7/g$n0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "l0"
.end annotation


# instance fields
.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Boolean;

.field public e:Lw7/g$e0;

.field public f:Lw7/g$e0;

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lw7/g$n0;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lw7/g$l0;->c:Ljava/lang/String;

    iput-object v0, p0, Lw7/g$l0;->d:Ljava/lang/Boolean;

    iput-object v0, p0, Lw7/g$l0;->e:Lw7/g$e0;

    iput-object v0, p0, Lw7/g$l0;->f:Lw7/g$e0;

    iput-object v0, p0, Lw7/g$l0;->g:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lw7/g$n0;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
