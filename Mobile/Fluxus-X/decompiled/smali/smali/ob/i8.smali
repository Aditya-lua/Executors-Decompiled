.class public final synthetic Lob/i8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/n8;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lob/ce;

.field public final synthetic d:Lob/o5;


# direct methods
.method public synthetic constructor <init>(Lob/n8;Ljava/lang/String;Lob/ce;Lob/o5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/i8;->a:Lob/n8;

    iput-object p2, p0, Lob/i8;->b:Ljava/lang/String;

    iput-object p3, p0, Lob/i8;->c:Lob/ce;

    iput-object p4, p0, Lob/i8;->d:Lob/o5;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    iget-object v0, p0, Lob/i8;->a:Lob/n8;

    iget-object v1, p0, Lob/i8;->b:Ljava/lang/String;

    iget-object v2, p0, Lob/i8;->c:Lob/ce;

    iget-object v3, p0, Lob/i8;->d:Lob/o5;

    invoke-virtual {v0, v1, v2, v3}, Lob/n8;->w2(Ljava/lang/String;Lob/ce;Lob/o5;)V

    return-void
.end method
