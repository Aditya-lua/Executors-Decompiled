.class public final Lam/a$d;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lam/a;->c(Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.protocols.systemdialog.BlockingDialog"
    f = "BlockingDialog.kt"
    l = {
        0x64
    }
    m = "executeTimer"
    v = 0x1
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


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lam/a;

.field public w:I


# direct methods
.method public constructor <init>(Lam/a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lam/a;",
            "Leu/b<",
            "-",
            "Lam/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lam/a$d;->v:Lam/a;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

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

    iput-object p1, p0, Lam/a$d;->u:Ljava/lang/Object;

    iget p1, p0, Lam/a$d;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lam/a$d;->w:I

    iget-object p1, p0, Lam/a$d;->v:Lam/a;

    invoke-virtual {p1, p0}, Lam/a;->c(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
