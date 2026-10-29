.class public final synthetic Le/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le/p$f;

.field public final synthetic b:I

.field public final synthetic c:Landroid/content/IntentSender$SendIntentException;


# direct methods
.method public synthetic constructor <init>(Le/p$f;ILandroid/content/IntentSender$SendIntentException;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/s;->a:Le/p$f;

    iput p2, p0, Le/s;->b:I

    iput-object p3, p0, Le/s;->c:Landroid/content/IntentSender$SendIntentException;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Le/s;->a:Le/p$f;

    iget v1, p0, Le/s;->b:I

    iget-object v2, p0, Le/s;->c:Landroid/content/IntentSender$SendIntentException;

    invoke-static {v0, v1, v2}, Le/p$f;->s(Le/p$f;ILandroid/content/IntentSender$SendIntentException;)V

    return-void
.end method
