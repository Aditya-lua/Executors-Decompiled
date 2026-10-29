.class public final synthetic Lnm/a$n;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnm/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/String;",
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
.field public static final a:Lnm/a$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnm/a$n;

    invoke-direct {v0}, Lnm/a$n;-><init>()V

    sput-object v0, Lnm/a$n;->a:Lnm/a$n;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "getMagicLoginMethodName()Ljava/lang/String;"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Lcom/roblox/universalapp/account/JNIAccountProtocol;

    const-string v3, "getMagicLoginMethodName"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/universalapp/account/JNIAccountProtocol;->getMagicLoginMethodName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnm/a$n;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
