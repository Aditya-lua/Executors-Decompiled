.class public final Ltu/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzt/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltu/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ltu/m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltu/m$a;

    invoke-direct {v0}, Ltu/m$a;-><init>()V

    sput-object v0, Ltu/m$a;->a:Ltu/m$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Void;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ltu/m$a;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
