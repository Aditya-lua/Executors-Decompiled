.class public final synthetic Lul/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroid/graphics/Bitmap;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lul/l;->a:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lul/l;->a:Landroid/graphics/Bitmap;

    check-cast p1, Lul/a;

    invoke-static {v0, p1}, Lcom/roblox/protocols/calling/CallingHandler;->r(Landroid/graphics/Bitmap;Lul/a;)Lul/a;

    move-result-object p1

    return-object p1
.end method
