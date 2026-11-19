.class public Ln0/l0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln0/l0;->m(II)Lpe/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ln0/l0;


# direct methods
.method public constructor <init>(Ln0/l0;)V
    .locals 0

    iput-object p1, p0, Ln0/l0$a;->a:Ln0/l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lpe/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpe/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Lr0/n;->p(Ljava/lang/Object;)Lpe/x;

    move-result-object v0

    return-object v0
.end method

.method public b()Lpe/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpe/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Lr0/n;->p(Ljava/lang/Object;)Lpe/x;

    move-result-object v0

    return-object v0
.end method
