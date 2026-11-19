.class public final synthetic Lgp/j$a$b;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgp/j$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function1<",
        "Lap/a;",
        "Lgp/j;",
        ">;"
    }
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


# static fields
.field public static final a:Lgp/j$a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgp/j$a$b;

    invoke-direct {v0}, Lgp/j$a$b;-><init>()V

    sput-object v0, Lgp/j$a$b;->a:Lgp/j$a$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2ErrorBinding;)V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lgp/j;

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final d(Lap/a;)Lgp/j;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgp/j;

    invoke-direct {v0, p1}, Lgp/j;-><init>(Lap/a;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lap/a;

    invoke-virtual {p0, p1}, Lgp/j$a$b;->d(Lap/a;)Lgp/j;

    move-result-object p1

    return-object p1
.end method
