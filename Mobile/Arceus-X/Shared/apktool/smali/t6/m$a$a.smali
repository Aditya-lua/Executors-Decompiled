.class public final synthetic Lt6/m$a$a;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt6/m$a;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/content/Context;",
        "Lt6/d;",
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
.field public static final a:Lt6/m$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt6/m$a$a;

    invoke-direct {v0}, Lt6/m$a$a;-><init>()V

    sput-object v0, Lt6/m$a$a;->a:Lt6/m$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;"

    const/4 v5, 0x1

    const/4 v1, 0x1

    const-class v2, Lt6/f;

    const-string v3, "ConnectivityChecker"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/content/Context;)Lt6/d;
    .locals 0

    invoke-static {p1}, Lt6/f;->a(Landroid/content/Context;)Lt6/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Lt6/m$a$a;->d(Landroid/content/Context;)Lt6/d;

    move-result-object p1

    return-object p1
.end method
