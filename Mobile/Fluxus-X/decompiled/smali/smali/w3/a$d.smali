.class public final Lw3/a$d;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw3/a;->a(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.datastore.migrations.SharedPreferencesMigration"
    f = "SharedPreferencesMigration.android.kt"
    l = {
        0x97
    }
    m = "shouldMigrate"
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

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lw3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public w:I


# direct methods
.method public constructor <init>(Lw3/a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/a<",
            "TT;>;",
            "Leu/b<",
            "-",
            "Lw3/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw3/a$d;->v:Lw3/a;

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

    iput-object p1, p0, Lw3/a$d;->u:Ljava/lang/Object;

    iget p1, p0, Lw3/a$d;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw3/a$d;->w:I

    iget-object p1, p0, Lw3/a$d;->v:Lw3/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lw3/a;->a(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
