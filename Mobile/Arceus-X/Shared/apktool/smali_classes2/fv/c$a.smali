.class public Lfv/c$a;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfv/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "Lfv/c$c;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lfv/c;


# direct methods
.method public constructor <init>(Lfv/c;)V
    .locals 0

    iput-object p1, p0, Lfv/c$a;->a:Lfv/c;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lfv/c$c;
    .locals 1

    new-instance v0, Lfv/c$c;

    invoke-direct {v0}, Lfv/c$c;-><init>()V

    return-object v0
.end method

.method public bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfv/c$a;->a()Lfv/c$c;

    move-result-object v0

    return-object v0
.end method
