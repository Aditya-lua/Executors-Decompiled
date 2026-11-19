.class public final Lu3/h$a$b;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu3/h$a;->c(Ljava/util/List;Lu3/s;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lgu/d;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.datastore.core.DataMigrationInitializer$Companion"
    f = "DataMigrationInitializer.kt"
    l = {
        0x2a,
        0x39
    }
    m = "runMigrations"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lu3/h$a;

.field public x:I


# direct methods
.method public constructor <init>(Lu3/h$a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/h$a;",
            "Leu/b<",
            "-",
            "Lu3/h$a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu3/h$a$b;->w:Lu3/h$a;

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

    iput-object p1, p0, Lu3/h$a$b;->v:Ljava/lang/Object;

    iget p1, p0, Lu3/h$a$b;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lu3/h$a$b;->x:I

    iget-object p1, p0, Lu3/h$a$b;->w:Lu3/h$a;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lu3/h$a;->a(Lu3/h$a;Ljava/util/List;Lu3/s;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
