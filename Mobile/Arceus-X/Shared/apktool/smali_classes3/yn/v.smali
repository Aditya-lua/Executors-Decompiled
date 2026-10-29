.class public final synthetic Lyn/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lyn/z;


# direct methods
.method public synthetic constructor <init>(Lyn/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyn/v;->a:Lyn/z;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyn/v;->a:Lyn/z;

    invoke-static {v0}, Lyn/z;->e(Lyn/z;)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method
