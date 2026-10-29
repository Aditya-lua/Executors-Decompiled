.class public final Le7/h0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le7/h0;
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


# static fields
.field public static final a:Le7/h0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le7/h0$a;

    invoke-direct {v0}, Le7/h0$a;-><init>()V

    sput-object v0, Le7/h0$a;->a:Le7/h0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lx6/g;)Ljava/lang/Void;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx6/g;

    invoke-virtual {p0, p1}, Le7/h0$a;->a(Lx6/g;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
