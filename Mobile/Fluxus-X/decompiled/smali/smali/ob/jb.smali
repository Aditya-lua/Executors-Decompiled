.class public final Lob/jb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/ob;


# direct methods
.method public constructor <init>(Lob/ob;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/jb;->a:Lob/ob;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lob/jb;->a:Lob/ob;

    invoke-virtual {v0}, Lob/ob;->D()Lob/gb;

    move-result-object v1

    iput-object v1, v0, Lob/ob;->e:Lob/gb;

    return-void
.end method
