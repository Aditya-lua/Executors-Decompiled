.class public final Lml/a$d;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lml/a;->c(Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.protocols.systemdialog.BlockingDialog"
    f = "BlockingDialog.kt"
    l = {
        0x64
    }
    m = "executeTimer"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lml/a;

.field public w:I


# direct methods
.method public constructor <init>(Lml/a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lml/a;",
            "Lnt/b<",
            "-",
            "Lml/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lml/a$d;->v:Lml/a;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lml/a$d;->u:Ljava/lang/Object;

    iget p1, p0, Lml/a$d;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lml/a$d;->w:I

    iget-object p1, p0, Lml/a$d;->v:Lml/a;

    invoke-virtual {p1, p0}, Lml/a;->c(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
