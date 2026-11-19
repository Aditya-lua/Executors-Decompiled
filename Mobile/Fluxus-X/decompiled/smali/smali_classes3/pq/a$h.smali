.class public final Lpq/a$h;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpq/a;->k(Ljava/lang/String;Ljava/lang/String;ZLeu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader"
    f = "DirectFileUploader.kt"
    l = {
        0xdc
    }
    m = "uploadImageInternal-XenoRnc"
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
.field public A:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Z

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lpq/a;


# direct methods
.method public constructor <init>(Lpq/a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpq/a;",
            "Leu/b<",
            "-",
            "Lpq/a$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpq/a$h;->z:Lpq/a;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lpq/a$h;->y:Ljava/lang/Object;

    iget p1, p0, Lpq/a$h;->A:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lpq/a$h;->A:I

    iget-object p1, p0, Lpq/a$h;->z:Lpq/a;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v0, v1, p0}, Lpq/a;->e(Lpq/a;Ljava/lang/String;Ljava/lang/String;ZLeu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
