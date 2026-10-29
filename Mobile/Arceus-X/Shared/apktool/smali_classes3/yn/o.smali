.class public final synthetic Lyn/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lyn/p;


# direct methods
.method public synthetic constructor <init>(Lyn/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyn/o;->a:Lyn/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyn/o;->a:Lyn/p;

    invoke-static {v0}, Lyn/p;->c(Lyn/p;)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method
