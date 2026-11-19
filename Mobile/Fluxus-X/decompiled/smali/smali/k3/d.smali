.class public final synthetic Lk3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lkotlin/jvm/internal/c0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/d;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lk3/d;->b:Lkotlin/jvm/internal/c0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk3/d;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lk3/d;->b:Lkotlin/jvm/internal/c0;

    invoke-static {v0, v1}, Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion;->$r8$lambda$L3A61OiqsxEKaG1rAmKPE4eGsQY(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/c0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
