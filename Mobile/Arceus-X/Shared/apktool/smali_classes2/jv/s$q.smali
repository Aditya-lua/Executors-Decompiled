.class public final Ljv/s$q;
.super Ljv/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljv/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "q"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljv/s<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljv/s;-><init>()V

    iput-object p1, p0, Ljv/s$q;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public a(Ljv/v;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/v;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Ljv/s$q;->a:Ljava/lang/Class;

    invoke-virtual {p1, v0, p2}, Ljv/v;->h(Ljava/lang/Class;Ljava/lang/Object;)V

    return-void
.end method
