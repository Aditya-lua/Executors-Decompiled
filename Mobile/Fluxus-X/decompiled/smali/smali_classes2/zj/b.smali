.class public final synthetic Lzj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lcom/google/mlkit/vision/barcode/BarcodeScanner;

.field public final synthetic b:Lzj/c;


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/vision/barcode/BarcodeScanner;Lzj/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzj/b;->a:Lcom/google/mlkit/vision/barcode/BarcodeScanner;

    iput-object p2, p0, Lzj/b;->b:Lzj/c;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lzj/b;->a:Lcom/google/mlkit/vision/barcode/BarcodeScanner;

    iget-object v1, p0, Lzj/b;->b:Lzj/c;

    check-cast p1, Le1/c$a;

    invoke-static {v0, v1, p1}, Lzj/c;->b2(Lcom/google/mlkit/vision/barcode/BarcodeScanner;Lzj/c;Le1/c$a;)V

    return-void
.end method
