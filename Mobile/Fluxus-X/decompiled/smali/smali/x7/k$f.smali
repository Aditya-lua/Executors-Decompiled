.class public Lx7/k$f;
.super Lorg/xml/sax/ext/DefaultHandler2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:Lx7/k;


# direct methods
.method public constructor <init>(Lx7/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx7/k$f;->a:Lx7/k;

    invoke-direct {p0}, Lorg/xml/sax/ext/DefaultHandler2;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lx7/k;Lx7/k$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lx7/k$f;-><init>(Lx7/k;)V

    return-void
.end method


# virtual methods
.method public characters([CII)V
    .locals 2

    iget-object v0, p0, Lx7/k$f;->a:Lx7/k;

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    invoke-static {v0, v1}, Lx7/k;->c(Lx7/k;Ljava/lang/String;)V

    return-void
.end method

.method public endDocument()V
    .locals 1

    iget-object v0, p0, Lx7/k$f;->a:Lx7/k;

    invoke-static {v0}, Lx7/k;->e(Lx7/k;)V

    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lx7/k$f;->a:Lx7/k;

    invoke-static {v0, p1, p2, p3}, Lx7/k;->d(Lx7/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public processingInstruction(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lx7/k$i;

    invoke-direct {v0, p2}, Lx7/k$i;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, Lx7/k$f;->a:Lx7/k;

    invoke-static {p2, v0}, Lx7/k;->f(Lx7/k;Lx7/k$i;)Ljava/util/Map;

    move-result-object p2

    iget-object v0, p0, Lx7/k$f;->a:Lx7/k;

    invoke-static {v0, p1, p2}, Lx7/k;->g(Lx7/k;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public startDocument()V
    .locals 1

    iget-object v0, p0, Lx7/k$f;->a:Lx7/k;

    invoke-static {v0}, Lx7/k;->a(Lx7/k;)V

    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 1

    iget-object v0, p0, Lx7/k$f;->a:Lx7/k;

    invoke-static {v0, p1, p2, p3, p4}, Lx7/k;->b(Lx7/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    return-void
.end method
