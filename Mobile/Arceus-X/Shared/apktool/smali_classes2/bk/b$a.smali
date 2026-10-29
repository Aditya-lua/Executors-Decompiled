.class public final synthetic Lbk/b$a;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbk/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
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
.field public static final a:Lbk/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbk/b$a;

    invoke-direct {v0}, Lbk/b$a;-><init>()V

    sput-object v0, Lbk/b$a;->a:Lbk/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "screenTimeStartByGuac()V"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Lcom/roblox/engine/jni/NativeGLInterface;

    const-string v3, "screenTimeStartByGuac"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 0

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->screenTimeStartByGuac()V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbk/b$a;->d()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method
