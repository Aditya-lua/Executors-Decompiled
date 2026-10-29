.class public Lg0/f1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg0/f1;


# direct methods
.method public constructor <init>(Lg0/f1;)V
    .locals 0

    iput-object p1, p0, Lg0/f1$a;->a:Lg0/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg0/f1$a;->a:Lg0/f1;

    invoke-virtual {v0, p1}, Lg0/f1;->S0(Ljava/util/List;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lg0/f1$a;->a:Lg0/f1;

    invoke-virtual {v0}, Lg0/f1;->K0()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lg0/f1$a;->a:Lg0/f1;

    invoke-virtual {v0}, Lg0/f1;->W0()V

    return-void
.end method
