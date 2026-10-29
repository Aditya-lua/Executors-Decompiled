.class public Lnf/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnf/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnf/p;-><init>(Lnf/p$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnf/p$b<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lnf/p;


# direct methods
.method public constructor <init>(Lnf/p;)V
    .locals 0

    iput-object p1, p0, Lnf/p$a;->a:Lnf/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lnf/p$a;->a:Lnf/p;

    invoke-static {v0, p1}, Lnf/p;->C(Lnf/p;Ljava/lang/Throwable;)Z

    return-void
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    iget-object v0, p0, Lnf/p$a;->a:Lnf/p;

    invoke-static {v0, p1}, Lnf/p;->B(Lnf/p;Ljava/lang/Object;)Z

    return-void
.end method
