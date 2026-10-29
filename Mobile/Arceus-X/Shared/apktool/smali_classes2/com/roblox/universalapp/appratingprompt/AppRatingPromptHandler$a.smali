.class public final Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->d(Lj/b;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.universalapp.appratingprompt.AppRatingPromptHandler"
    f = "AppRatingPromptHandler.kt"
    l = {
        0x5d
    }
    m = "displayRatingPrompt"
    v = 0x1
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;

.field public w:I


# direct methods
.method public constructor <init>(Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;->v:Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;->u:Ljava/lang/Object;

    iget p1, p0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;->w:I

    iget-object p1, p0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;->v:Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->c(Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;Lj/b;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
