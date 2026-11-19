.class public final Lcom/appsflyer/internal/AFg1cSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;
    }
.end annotation


# instance fields
.field private final AFKeystoreWrapper:Ljava/lang/String;

.field private AFLogger:Ljava/lang/StringBuilder;

.field private final unregisterClient:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFKeystoreWrapper:Ljava/lang/String;

    return-void
.end method

.method private AFLogger()V
    .locals 3

    .line 13
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1cSDK;->registerClient()Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    move-result-object v0

    .line 15
    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    if-ne v0, v1, :cond_1

    .line 16
    sget-object v0, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->registerClient:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    .line 17
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 18
    :cond_1
    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->registerClient:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    if-ne v0, v1, :cond_2

    .line 19
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    .line 20
    :cond_2
    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    if-ne v0, v1, :cond_3

    .line 21
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    sget-object v0, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->AFLogger:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    .line 23
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 24
    :cond_3
    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->force:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    if-ne v0, v1, :cond_4

    :goto_0
    return-void

    .line 25
    :cond_4
    new-instance v0, Lcom/appsflyer/internal/AFg1hSDK;

    const-string v1, "Nesting problem"

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private registerClient()Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    return-object v0

    :cond_0
    new-instance v0, Lcom/appsflyer/internal/AFg1hSDK;

    const-string v1, "Nesting problem"

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final AFKeystoreWrapper(Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;Ljava/lang/String;)Lcom/appsflyer/internal/AFg1cSDK;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/appsflyer/internal/AFg1hSDK;

    const-string p2, "Nesting problem: multiple top-level roots"

    invoke-direct {p1, p2}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger()V

    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final AFLogger(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    .line 3
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0xc

    if-eq v3, v4, :cond_3

    const/16 v4, 0xd

    if-eq v3, v4, :cond_2

    const/16 v4, 0x22

    const/16 v5, 0x5c

    if-eq v3, v4, :cond_1

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_1

    if-eq v3, v5, :cond_1

    packed-switch v3, :pswitch_data_0

    const/16 v4, 0x1f

    if-gt v3, v4, :cond_0

    .line 4
    iget-object v4, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v6, "\\u%04x"

    invoke-static {v5, v6, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 5
    :cond_0
    iget-object v4, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 6
    :pswitch_0
    iget-object v3, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    const-string v4, "\\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 7
    :pswitch_1
    iget-object v3, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    const-string v4, "\\t"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 8
    :pswitch_2
    iget-object v3, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    const-string v4, "\\b"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 9
    :cond_1
    iget-object v4, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 10
    :cond_2
    iget-object v3, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    const-string v4, "\\r"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 11
    :cond_3
    iget-object v3, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    const-string v4, "\\f"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 12
    :cond_4
    iget-object p1, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/Object;)Lcom/appsflyer/internal/AFg1cSDK;
    .locals 7

    const v0, -0x5c17f40d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    const/4 v1, 0x0

    invoke-static {v1, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v2

    int-to-char v2, v2

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int v3, v3, 0x13e

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v4

    add-int/lit8 v4, v4, 0x26

    invoke-static {v2, v3, v4}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :try_start_0
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v4

    int-to-char v4, v4

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    rsub-int v5, v5, 0x13e

    const-string v6, ""

    invoke-static {v6, v1}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x25

    invoke-static {v4, v5, v1}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    const-string v4, "AFLogger"

    const-class v5, Lcom/appsflyer/internal/AFg1cSDK;

    filled-new-array {v5}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    check-cast v4, Ljava/lang/reflect/Method;

    invoke-virtual {v4, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    throw v0

    :cond_1
    throw p1

    :cond_2
    instance-of v0, p1, Lcom/appsflyer/internal/AFg1gSDK;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/appsflyer/internal/AFg1gSDK;

    invoke-virtual {p1, p0}, Lcom/appsflyer/internal/AFg1gSDK;->registerClient(Lcom/appsflyer/internal/AFg1cSDK;)V

    return-object p0

    :cond_3
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger()V

    if-eqz p1, :cond_6

    instance-of v0, p1, Ljava/lang/Boolean;

    if-nez v0, :cond_6

    sget-object v0, Lcom/appsflyer/internal/AFg1gSDK;->d:Ljava/lang/Object;

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    check-cast p1, Ljava/lang/Number;

    invoke-static {p1}, Lcom/appsflyer/internal/AFg1gSDK;->AFKeystoreWrapper(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger(Ljava/lang/String;)V

    return-object p0

    :cond_6
    :goto_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-object p0

    :cond_7
    new-instance p1, Lcom/appsflyer/internal/AFg1hSDK;

    const-string v0, "Nesting problem"

    invoke-direct {p1, v0}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final unregisterClient(Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;Ljava/lang/String;)Lcom/appsflyer/internal/AFg1cSDK;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1cSDK;->registerClient()Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    move-result-object v0

    if-eq v0, p2, :cond_1

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Lcom/appsflyer/internal/AFg1hSDK;

    const-string p2, "Nesting problem"

    invoke-direct {p1, p2}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-interface {p1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 4
    iget-object p1, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final unregisterClient()V
    .locals 3

    .line 5
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1cSDK;->registerClient()Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    move-result-object v0

    .line 6
    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->AFLogger:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    if-ne v0, v1, :cond_0

    .line 7
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 8
    :cond_0
    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->d:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    if-ne v0, v1, :cond_1

    .line 9
    :goto_0
    sget-object v0, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    .line 10
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 11
    :cond_1
    new-instance v0, Lcom/appsflyer/internal/AFg1hSDK;

    const-string v1, "Nesting problem"

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    throw v0
.end method
