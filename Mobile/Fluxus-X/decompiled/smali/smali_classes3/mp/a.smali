.class public final synthetic Lmp/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lmp/c;


# direct methods
.method public synthetic constructor <init>(Lmp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp/a;->a:Lmp/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmp/a;->a:Lmp/c;

    invoke-static {v0}, Lmp/c;->j2(Lmp/c;)Lnn/z;

    move-result-object v0

    return-object v0
.end method
