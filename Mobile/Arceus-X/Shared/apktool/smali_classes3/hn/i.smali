.class public final synthetic Lhn/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lkotlin/jvm/internal/a0;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lhn/l0;


# direct methods
.method public synthetic constructor <init>(ZLkotlin/jvm/internal/a0;Ljava/lang/String;Lhn/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lhn/i;->a:Z

    iput-object p2, p0, Lhn/i;->b:Lkotlin/jvm/internal/a0;

    iput-object p3, p0, Lhn/i;->c:Ljava/lang/String;

    iput-object p4, p0, Lhn/i;->d:Lhn/l0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-boolean v0, p0, Lhn/i;->a:Z

    iget-object v1, p0, Lhn/i;->b:Lkotlin/jvm/internal/a0;

    iget-object v2, p0, Lhn/i;->c:Ljava/lang/String;

    iget-object v3, p0, Lhn/i;->d:Lhn/l0;

    invoke-static {v0, v1, v2, v3}, Lhn/s;->h(ZLkotlin/jvm/internal/a0;Ljava/lang/String;Lhn/l0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
