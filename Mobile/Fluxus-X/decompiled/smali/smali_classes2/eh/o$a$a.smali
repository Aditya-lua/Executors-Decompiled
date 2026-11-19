.class public final Leh/o$a$a;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leh/o$a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.analytics.EventUploadJob$eventUploader$1"
    f = "EventUploadJob.kt"
    l = {
        0x38
    }
    m = "upload"
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
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Leh/o$a;

.field public y:I


# direct methods
.method public constructor <init>(Leh/o$a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leh/o$a;",
            "Leu/b<",
            "-",
            "Leh/o$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Leh/o$a$a;->x:Leh/o$a;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Leh/o$a$a;->w:Ljava/lang/Object;

    iget p1, p0, Leh/o$a$a;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Leh/o$a$a;->y:I

    iget-object p1, p0, Leh/o$a$a;->x:Leh/o$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Leh/o$a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
