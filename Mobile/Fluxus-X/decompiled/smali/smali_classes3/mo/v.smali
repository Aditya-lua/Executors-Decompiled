.class public final synthetic Lmo/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lmo/z;


# direct methods
.method public synthetic constructor <init>(Lmo/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo/v;->a:Lmo/z;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmo/v;->a:Lmo/z;

    invoke-static {v0}, Lmo/z;->e(Lmo/z;)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method
