.class public final synthetic Leh/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljava/util/function/BooleanSupplier;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/BooleanSupplier;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leh/z;->a:Ljava/util/function/BooleanSupplier;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Leh/z;->a:Ljava/util/function/BooleanSupplier;

    invoke-static {v0}, Leh/a0;->c(Ljava/util/function/BooleanSupplier;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
