.class public Lie/i$a;
.super Lie/i$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lie/i;->J()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lie/i<",
        "TK;TV;>.e<TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lie/i;


# direct methods
.method public constructor <init>(Lie/i;)V
    .locals 1

    iput-object p1, p0, Lie/i$a;->e:Lie/i;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lie/i$e;-><init>(Lie/i;Lie/i$a;)V

    return-void
.end method


# virtual methods
.method public d(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TK;"
        }
    .end annotation

    iget-object v0, p0, Lie/i$a;->e:Lie/i;

    invoke-static {v0, p1}, Lie/i;->b(Lie/i;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
