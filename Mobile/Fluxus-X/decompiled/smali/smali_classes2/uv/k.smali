.class public final synthetic Luv/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Luv/o;

.field public final synthetic b:I

.field public final synthetic c:Lew/e;

.field public final synthetic d:I

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Luv/o;ILew/e;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luv/k;->a:Luv/o;

    iput p2, p0, Luv/k;->b:I

    iput-object p3, p0, Luv/k;->c:Lew/e;

    iput p4, p0, Luv/k;->d:I

    iput-boolean p5, p0, Luv/k;->e:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Luv/k;->a:Luv/o;

    iget v1, p0, Luv/k;->b:I

    iget-object v2, p0, Luv/k;->c:Lew/e;

    iget v3, p0, Luv/k;->d:I

    iget-boolean v4, p0, Luv/k;->e:Z

    invoke-static {v0, v1, v2, v3, v4}, Luv/o;->d(Luv/o;ILew/e;IZ)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
