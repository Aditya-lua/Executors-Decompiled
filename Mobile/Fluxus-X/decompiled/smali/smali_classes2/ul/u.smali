.class public final synthetic Lul/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroid/graphics/Bitmap;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lul/u;->a:Ljava/lang/String;

    iput-object p2, p0, Lul/u;->b:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lul/u;->a:Ljava/lang/String;

    iget-object v1, p0, Lul/u;->b:Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Lcom/roblox/protocols/calling/CallingHandler;->h(Ljava/lang/String;Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
