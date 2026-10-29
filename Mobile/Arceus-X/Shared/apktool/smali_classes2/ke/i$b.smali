.class public final Lke/i$b;
.super Lke/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lke/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Lie/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/w<",
            "Lke/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public varargs constructor <init>(Ljava/io/File;[Lke/g;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lke/b;-><init>()V

    .line 3
    invoke-static {p1}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    iput-object p1, p0, Lke/i$b;->a:Ljava/io/File;

    .line 4
    invoke-static {p2}, Lie/w;->l([Ljava/lang/Object;)Lie/w;

    move-result-object p1

    iput-object p1, p0, Lke/i$b;->b:Lie/w;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;[Lke/g;Lke/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lke/i$b;-><init>(Ljava/io/File;[Lke/g;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/io/OutputStream;
    .locals 1

    invoke-virtual {p0}, Lke/i$b;->c()Ljava/io/FileOutputStream;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/io/FileOutputStream;
    .locals 4

    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v1, p0, Lke/i$b;->a:Ljava/io/File;

    iget-object v2, p0, Lke/i$b;->b:Lie/w;

    sget-object v3, Lke/g;->a:Lke/g;

    invoke-virtual {v2, v3}, Lie/r;->contains(Ljava/lang/Object;)Z

    move-result v2

    invoke-direct {v0, v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lke/i$b;->a:Ljava/io/File;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lke/i$b;->b:Lie/w;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x14

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Files.asByteSink("

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
