.class public Lke/i$c;
.super Lke/i$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lke/i;->Z()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lke/i<",
        "TK;TV;>.e<TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lke/i;


# direct methods
.method public constructor <init>(Lke/i;)V
    .locals 1

    iput-object p1, p0, Lke/i$c;->e:Lke/i;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lke/i$e;-><init>(Lke/i;Lke/i$a;)V

    return-void
.end method


# virtual methods
.method public d(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    iget-object v0, p0, Lke/i$c;->e:Lke/i;

    invoke-static {v0, p1}, Lke/i;->j(Lke/i;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
