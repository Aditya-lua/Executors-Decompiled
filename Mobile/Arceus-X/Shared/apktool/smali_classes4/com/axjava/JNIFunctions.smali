.class public Lcom/axjava/JNIFunctions;
.super Ljava/lang/Object;
.source "JNIFunctions.java"


# static fields
.field private static final INSTANCE:Lcom/axjava/JNIFunctions;

.field private static activityRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field static clipboardHistory:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static clipboardService:Lcom/axjava/ClipboardService;

.field private static isClipboardServiceStarted:Z

.field private static final sUiHandler:Landroid/os/Handler;

.field private static sUpdateDialog:Landroid/app/AlertDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 74
    nop

    .line 181
    new-instance v0, Lcom/axjava/JNIFunctions;

    invoke-direct {v0}, Lcom/axjava/JNIFunctions;-><init>()V

    sput-object v0, Lcom/axjava/JNIFunctions;->INSTANCE:Lcom/axjava/JNIFunctions;

    .line 184
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/axjava/JNIFunctions;->activityRef:Ljava/lang/ref/WeakReference;

    .line 292
    const/4 v0, 0x0

    sput-boolean v0, Lcom/axjava/JNIFunctions;->isClipboardServiceStarted:Z

    .line 293
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/axjava/JNIFunctions;->clipboardHistory:Ljava/util/List;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/axjava/JNIFunctions;->sUiHandler:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static AX_UpdatePopupAndMaybeInstall(Landroid/content/Context;ILjava/lang/String;)V
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "mode"    # I
    .param p2, "textOrPath"    # Ljava/lang/String;

    .line 678
    const-string v0, "ArceusX"

    .line 680
    .local v0, "TAG":Ljava/lang/String;
    new-instance v1, Lcom/axjava/c;

    invoke-direct {v1, p0, p1, p2}, Lcom/axjava/c;-><init>(Landroid/content/Context;ILjava/lang/String;)V

    .line 777
    .local v1, "task":Ljava/lang/Runnable;
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-ne v2, v3, :cond_0

    .line 778
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 780
    :cond_0
    sget-object v2, Lcom/axjava/JNIFunctions;->sUiHandler:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 782
    :goto_0
    return-void
.end method

.method public static File_WriteFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "fileName"    # Ljava/lang/String;
    .param p2, "text"    # Ljava/lang/String;

    .line 282
    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/axjava/JNIFunctions;->getInternalStorageDirectoryPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Arceus X"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    .local v0, "arceusXDirectory":Ljava/io/File;
    new-instance v1, Ljava/io/File;

    const-string v2, "Workspace"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 284
    .local v1, "dir":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 286
    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 287
    .local v2, "realFile":Ljava/io/File;
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 288
    .local v3, "writer":Ljava/io/FileOutputStream;
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/FileOutputStream;->write([B)V

    .line 289
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 292
    .end local v2    # "realFile":Ljava/io/File;
    .end local v3    # "writer":Ljava/io/FileOutputStream;
    goto :goto_0

    .line 290
    :catch_0
    move-exception v2

    .line 291
    .local v2, "e":Ljava/io/IOException;
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    .line 293
    .end local v2    # "e":Ljava/io/IOException;
    :goto_0
    return-void
.end method

.method public static File_createFolder(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "fileName"    # Ljava/lang/String;

    .line 217
    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/axjava/JNIFunctions;->getInternalStorageDirectoryPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Arceus X"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .local v0, "arceusXDirectory":Ljava/io/File;
    new-instance v1, Ljava/io/File;

    const-string v2, "Workspace"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 219
    .local v1, "dir":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 220
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 221
    .local v2, "theFile":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    move-result v3

    return v3
.end method

.method public static File_delete(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 8
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "fileName"    # Ljava/lang/String;

    .line 305
    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/axjava/JNIFunctions;->getInternalStorageDirectoryPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Arceus X"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    .local v0, "arceusXDirectory":Ljava/io/File;
    new-instance v1, Ljava/io/File;

    const-string v2, "Workspace"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 307
    .local v1, "dir":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 308
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 309
    .local v2, "theFile":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 310
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 311
    .local v3, "contents":[Ljava/io/File;
    if-eqz v3, :cond_1

    .line 312
    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 313
    .local v6, "file":Ljava/io/File;
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 314
    invoke-static {v6}, Lcom/axjava/JNIFunctions;->deleteDirectory(Ljava/io/File;)V

    goto :goto_1

    .line 316
    :cond_0
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 312
    .end local v6    # "file":Ljava/io/File;
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 320
    .end local v3    # "contents":[Ljava/io/File;
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v3

    return v3
.end method

.method public static File_doesFileOrFolderExist(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "fileName"    # Ljava/lang/String;

    .line 246
    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/axjava/JNIFunctions;->getInternalStorageDirectoryPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Arceus X"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    .local v0, "arceusXDirectory":Ljava/io/File;
    new-instance v1, Ljava/io/File;

    const-string v2, "Workspace"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 248
    .local v1, "dir":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 249
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 250
    .local v2, "theFile":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    return v3
.end method

.method public static File_getArceusFolder(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "folder_name"    # Ljava/lang/String;

    .line 594
    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/axjava/JNIFunctions;->getInternalStorageDirectoryPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 595
    .local v0, "arceusXDirectory":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 596
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public static File_isFile(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "fileName"    # Ljava/lang/String;

    .line 274
    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/axjava/JNIFunctions;->getInternalStorageDirectoryPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Arceus X"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    .local v0, "arceusXDirectory":Ljava/io/File;
    new-instance v1, Ljava/io/File;

    const-string v2, "Workspace"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 276
    .local v1, "dir":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 277
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 278
    .local v2, "theFile":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v3

    return v3
.end method

.method public static File_listFiles(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "path"    # Ljava/lang/String;

    .line 102
    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/axjava/JNIFunctions;->getInternalStorageDirectoryPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Arceus X"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .local v0, "arceusXDirectory":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 104
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 105
    .local v1, "dir":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public static File_listFiles2(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "fileName"    # Ljava/lang/String;

    .line 225
    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/axjava/JNIFunctions;->getInternalStorageDirectoryPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Arceus X"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    .local v0, "arceusXDirectory":Ljava/io/File;
    new-instance v1, Ljava/io/File;

    const-string v2, "Workspace"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 227
    .local v1, "dir":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 228
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 229
    .local v2, "theFile":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method

.method public static File_readAutoExec(Landroid/content/Context;)[Ljava/lang/String;
    .locals 11
    .param p0, "context"    # Landroid/content/Context;

    .line 296
    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/axjava/JNIFunctions;->getInternalStorageDirectoryPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Arceus X"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    .local v0, "arceusXDirectory":Ljava/io/File;
    new-instance v1, Ljava/io/File;

    const-string v2, "autoexec"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 298
    .local v1, "dir":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 299
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-nez v2, :cond_0

    .line 300
    const-string v2, "An error occured while reading autoExec"

    const/4 v3, 0x1

    invoke-static {p0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 303
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 304
    .local v2, "files":[Ljava/io/File;
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 306
    .local v3, "scripts":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz v2, :cond_2

    .line 307
    array-length v4, v2

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v2, v5

    .line 308
    .local v6, "file":Ljava/io/File;
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 310
    .local v7, "text":Ljava/lang/StringBuilder;
    :try_start_0
    new-instance v8, Ljava/io/BufferedReader;

    new-instance v9, Ljava/io/FileReader;

    invoke-virtual {v6}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v8, v9}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 312
    .local v8, "br":Ljava/io/BufferedReader;
    :goto_1
    invoke-virtual {v8}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v9

    move-object v10, v9

    .local v10, "line":Ljava/lang/String;
    if-eqz v9, :cond_1

    .line 313
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    const/16 v9, 0xa

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 316
    :cond_1
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 317
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 320
    .end local v8    # "br":Ljava/io/BufferedReader;
    .end local v10    # "line":Ljava/lang/String;
    goto :goto_2

    .line 318
    :catch_0
    move-exception v8

    .line 319
    .local v8, "e":Ljava/io/IOException;
    invoke-virtual {v8}, Ljava/io/IOException;->printStackTrace()V

    .line 307
    .end local v6    # "file":Ljava/io/File;
    .end local v7    # "text":Ljava/lang/StringBuilder;
    .end local v8    # "e":Ljava/io/IOException;
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 323
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    new-array v4, v4, [Ljava/lang/String;

    .line 324
    .local v4, "heyBro":[Ljava/lang/String;
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_3
    array-length v6, v4

    if-ge v5, v6, :cond_3

    .line 325
    invoke-interface {v3}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v6

    aget-object v6, v6, v5

    check-cast v6, Ljava/lang/String;

    aput-object v6, v4, v5

    .line 324
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 327
    .end local v5    # "i":I
    :cond_3
    return-object v4
.end method

.method public static File_readFile(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "fileName"    # Ljava/lang/String;

    .line 393
    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/axjava/JNIFunctions;->getInternalStorageDirectoryPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Arceus X"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    .local v0, "arceusXDirectory":Ljava/io/File;
    new-instance v1, Ljava/io/File;

    const-string v2, "Workspace"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 395
    .local v1, "dir":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 396
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 398
    .local v2, "theFile":Ljava/io/File;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 399
    .local v3, "text":Ljava/lang/StringBuilder;
    :try_start_0
    new-instance v4, Ljava/io/BufferedReader;

    new-instance v5, Ljava/io/FileReader;

    invoke-direct {v5, v2}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 401
    .local v4, "br":Ljava/io/BufferedReader;
    const/4 v5, 0x1

    .line 402
    .local v5, "firstLine":Z
    :goto_0
    :try_start_1
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    move-object v7, v6

    .local v7, "line":Ljava/lang/String;
    if-eqz v6, :cond_1

    .line 403
    if-nez v5, :cond_0

    .line 404
    const/16 v6, 0xa

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 406
    :cond_0
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 407
    const/4 v5, 0x0

    goto :goto_0

    .line 409
    .end local v5    # "firstLine":Z
    .end local v7    # "line":Ljava/lang/String;
    :cond_1
    :try_start_2
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 411
    .end local v4    # "br":Ljava/io/BufferedReader;
    goto :goto_2

    .line 399
    .restart local v4    # "br":Ljava/io/BufferedReader;
    :catchall_0
    move-exception v5

    :try_start_3
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v6

    :try_start_4
    invoke-virtual {v5, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .end local v0    # "arceusXDirectory":Ljava/io/File;
    .end local v1    # "dir":Ljava/io/File;
    .end local v2    # "theFile":Ljava/io/File;
    .end local v3    # "text":Ljava/lang/StringBuilder;
    .end local p0    # "context":Landroid/content/Context;
    .end local p1    # "fileName":Ljava/lang/String;
    :goto_1
    throw v5
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 409
    .end local v4    # "br":Ljava/io/BufferedReader;
    .restart local v0    # "arceusXDirectory":Ljava/io/File;
    .restart local v1    # "dir":Ljava/io/File;
    .restart local v2    # "theFile":Ljava/io/File;
    .restart local v3    # "text":Ljava/lang/StringBuilder;
    .restart local p0    # "context":Landroid/content/Context;
    .restart local p1    # "fileName":Ljava/lang/String;
    :catch_0
    move-exception v4

    .line 410
    .local v4, "e":Ljava/io/IOException;
    invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V

    .line 412
    .end local v4    # "e":Ljava/io/IOException;
    :goto_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4
.end method

.method public static Http_request(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/Map;
    .locals 10
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "Method"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 260
    .local p3, "Headers":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 261
    .local v0, "website":Ljava/net/URL;
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    check-cast v1, Ljava/net/HttpURLConnection;

    .line 262
    .local v1, "connection":Ljava/net/HttpURLConnection;
    invoke-virtual {v1, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 263
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    invoke-virtual {p3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 265
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v5

    aget-object v5, v5, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object v5

    aget-object v5, v5, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 266
    invoke-virtual {p3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, v2

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object v4

    aget-object v4, v4, v2

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 268
    .end local v2    # "i":I
    :cond_0
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    .line 269
    .local v2, "responseCode":I
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    .line 271
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 272
    .local v3, "in":Ljava/io/BufferedReader;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    .local v4, "response":Ljava/lang/StringBuilder;
    :goto_1
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v5

    move-object v6, v5

    .local v6, "inputLine":Ljava/lang/String;
    if-eqz v5, :cond_1

    .line 275
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 276
    :cond_1
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 277
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v5

    .line 278
    .local v5, "headerFields":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 279
    .local v7, "result":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "statusCode"

    invoke-interface {v7, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "body"

    invoke-interface {v7, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    const-string v8, "headers"

    invoke-interface {v7, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    return-object v7
.end method

.method public static JAVA_Test(ZIIZI)V
    .locals 0
    .param p0, "isGang"    # Z
    .param p1, "getScanCode"    # I
    .param p2, "getKeyCode"    # I
    .param p3, "getRepeatCount"    # Z
    .param p4, "event"    # I

    .prologue
    .line 29
    invoke-static {p0, p1, p2, p3, p4}, Lcom/axjava/JNIFunctions;->SendParamsToArceus(ZIIZI)V

    .line 30
    return-void
.end method

.method public static JAVA_Test2(Landroid/view/MotionEvent;)V
    .locals 4
    .param p0, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 33
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lcom/axjava/JNIFunctions;->SendParamsToArceusTouch(IFFI)V

    .line 34
    return-void
.end method

.method public static ReCallerMouseBtn(IFFII)V
    .locals 8
    .param p0, "id"    # I
    .param p1, "x"    # F
    .param p2, "y"    # F
    .param p3, "windowWidth"    # I
    .param p4, "windowHeight"    # I

    .line 145
    const/4 v6, 0x0

    const/4 v7, 0x1

    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 174
    :pswitch_0
    const/4 v0, 0x0

    const/4 v3, 0x0

    move v1, p1

    move v2, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInput(IFFIII)V

    .line 175
    invoke-static {p1, p2, v6, v7}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseButton(FFZI)V

    .line 176
    const/4 v3, 0x2

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInput(IFFIII)V

    goto/16 :goto_0

    .line 169
    :pswitch_1
    const/4 v0, 0x0

    const/4 v3, 0x0

    move v1, p1

    move v2, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInput(IFFIII)V

    .line 170
    invoke-static {p1, p2, v7, v7}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseButton(FFZI)V

    .line 171
    const/4 v3, 0x2

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInput(IFFIII)V

    .line 172
    goto :goto_0

    .line 163
    :pswitch_2
    const/4 v0, 0x0

    const/4 v3, 0x0

    move v1, p1

    move v2, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInput(IFFIII)V

    .line 164
    invoke-static {p1, p2, v7, v7}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseButton(FFZI)V

    .line 165
    invoke-static {p1, p2, v6, v7}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseButton(FFZI)V

    .line 166
    const/4 v3, 0x2

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInput(IFFIII)V

    .line 167
    goto :goto_0

    .line 158
    :pswitch_3
    const/4 v0, 0x0

    const/4 v3, 0x0

    move v1, p1

    move v2, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInput(IFFIII)V

    .line 159
    invoke-static {p1, p2, v6, v6}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseButton(FFZI)V

    .line 160
    const/4 v3, 0x2

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInput(IFFIII)V

    .line 161
    goto :goto_0

    .line 153
    :pswitch_4
    const/4 v0, 0x0

    const/4 v3, 0x0

    move v1, p1

    move v2, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInput(IFFIII)V

    .line 154
    invoke-static {p1, p2, v7, v6}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseButton(FFZI)V

    .line 155
    const/4 v3, 0x2

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInput(IFFIII)V

    .line 156
    goto :goto_0

    .line 147
    :pswitch_5
    const/4 v0, 0x0

    const/4 v3, 0x0

    move v1, p1

    move v2, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInput(IFFIII)V

    .line 148
    invoke-static {p1, p2, v7, v6}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseButton(FFZI)V

    .line 149
    invoke-static {p1, p2, v6, v6}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseButton(FFZI)V

    .line 150
    const/4 v3, 0x2

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInput(IFFIII)V

    .line 151
    nop

    .line 179
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static native SendButton()Z
.end method

.method public static native SendParamsToArceus(ZIIZI)V
.end method

.method public static native SendParamsToArceusTouch(IFFI)V
.end method

.method public static synthetic a(Landroid/app/Activity;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/axjava/JNIFunctions;->lambda$openWebsite$0(Landroid/app/Activity;Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic access$000()Lcom/axjava/ClipboardService;
    .locals 1

    .line 53
    sget-object v0, Lcom/axjava/JNIFunctions;->clipboardService:Lcom/axjava/ClipboardService;

    return-object v0
.end method

.method static synthetic access$002(Lcom/axjava/ClipboardService;)Lcom/axjava/ClipboardService;
    .locals 0
    .param p0, "x0"    # Lcom/axjava/ClipboardService;

    .line 53
    sput-object p0, Lcom/axjava/JNIFunctions;->clipboardService:Lcom/axjava/ClipboardService;

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/axjava/JNIFunctions;->lambda$openWebsite$1(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic c(Landroid/content/Context;ILjava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/axjava/JNIFunctions;->lambda$AX_UpdatePopupAndMaybeInstall$2(Landroid/content/Context;ILjava/lang/String;)V

    return-void
.end method

.method public static copyText(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "text"    # Ljava/lang/String;

    .line 165
    :try_start_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 166
    .local v0, "mHandler":Landroid/os/Handler;
    new-instance v1, Lcom/axjava/JNIFunctions$c;

    invoke-direct {v1, p0, p1}, Lcom/axjava/JNIFunctions$c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    const/4 v1, 0x1

    return v1

    .line 179
    .end local v0    # "mHandler":Landroid/os/Handler;
    :catch_0
    move-exception v0

    .line 180
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 181
    const/4 v1, 0x0

    return v1
.end method

.method public static deleteDirectory(Ljava/io/File;)V
    .locals 5
    .param p0, "theFile"    # Ljava/io/File;

    .line 291
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 292
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    .line 293
    .local v0, "contents":[Ljava/io/File;
    if-eqz v0, :cond_1

    .line 294
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 295
    .local v3, "file":Ljava/io/File;
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 296
    invoke-static {v3}, Lcom/axjava/JNIFunctions;->deleteDirectory(Ljava/io/File;)V

    goto :goto_1

    .line 298
    :cond_0
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 294
    .end local v3    # "file":Ljava/io/File;
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 301
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 303
    .end local v0    # "contents":[Ljava/io/File;
    :cond_2
    return-void
.end method

.method public static displayKeyboard(Landroid/content/Context;)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 66
    const-string v1, "input_method"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    move-object v0, v1

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 67
    .local v0, "keyboard":Landroid/view/inputmethod/InputMethodManager;
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 68
    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 69
    return-void
.end method

.method public static ez(Landroid/content/Context;Landroid/view/KeyEvent;)Z
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "event"    # Landroid/view/KeyEvent;

    .line 416
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0x32

    if-ne v0, v2, :cond_0

    .line 417
    invoke-static {p0}, Lcom/axjava/JNIFunctions;->handlePasteEvent(Landroid/content/Context;)V

    .line 418
    return v1

    .line 420
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0x117

    if-ne v0, v2, :cond_1

    .line 421
    invoke-static {p0}, Lcom/axjava/JNIFunctions;->handlePasteEvent(Landroid/content/Context;)V

    .line 422
    return v1

    .line 425
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    if-nez v0, :cond_2

    .line 426
    invoke-static {p0}, Lcom/axjava/JNIFunctions;->handlePasteEvent(Landroid/content/Context;)V

    .line 427
    return v1

    .line 429
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static generate(Landroid/content/Context;)Ljava/lang/String;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .line 191
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getActivityOrNull()Landroid/app/Activity;
    .locals 1

    .line 192
    sget-object v0, Lcom/axjava/JNIFunctions;->activityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    return-object v0
.end method

.method public static getAllPreferences(Landroid/content/Context;)Ljava/util/Map;
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 98
    const-string v0, "keys"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 99
    .local v0, "settings":Landroid/content/SharedPreferences;
    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    .line 102
    .local v1, "allPrefs":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;*>;"
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 103
    .local v2, "stringPrefs":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 104
    .local v4, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;*>;"
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    instance-of v5, v5, Ljava/lang/String;

    if-eqz v5, :cond_0

    .line 105
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .end local v4    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;*>;"
    :cond_0
    goto :goto_0

    .line 109
    :cond_1
    return-object v2
.end method

.method public static getBatteryPercentage(Landroid/content/Context;)I
    .locals 6
    .param p0, "context"    # Landroid/content/Context;

    .line 616
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 617
    .local v0, "intentFilter":Landroid/content/IntentFilter;
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v1

    .line 618
    .local v1, "batteryStatus":Landroid/content/Intent;
    if-eqz v1, :cond_0

    .line 619
    const-string v2, "level"

    const/4 v3, -0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 620
    .local v2, "level":I
    const-string v4, "scale"

    invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 622
    .local v3, "scale":I
    int-to-float v4, v2

    int-to-float v5, v3

    div-float/2addr v4, v5

    const/high16 v5, 0x42c80000    # 100.0f

    mul-float v4, v4, v5

    .line 623
    .local v4, "batteryPercentage":F
    float-to-int v5, v4

    return v5

    .line 618
    .end local v2    # "level":I
    .end local v3    # "scale":I
    .end local v4    # "batteryPercentage":F
    :cond_0
    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2
.end method

.method public static getDisplayDensity(Landroid/content/Context;)F
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 59
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 60
    .local v0, "dm":Landroid/util/DisplayMetrics;
    const-string v2, "window"

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    .line 61
    .local v1, "windowManager":Landroid/view/WindowManager;
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 62
    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    return v2
.end method

.method public static getDisplaySize_x(Landroid/content/Context;)F
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .line 196
    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 197
    .local v0, "windowManager":Landroid/view/WindowManager;
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 198
    .local v1, "metrics":Landroid/util/DisplayMetrics;
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 199
    iget v2, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v2, v2

    return v2
.end method

.method public static getDisplaySize_y(Landroid/content/Context;)F
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .line 203
    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 204
    .local v0, "windowManager":Landroid/view/WindowManager;
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 205
    .local v1, "metrics":Landroid/util/DisplayMetrics;
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 206
    iget v2, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v2, v2

    return v2
.end method

.method public static getFileClipboardHistory(Landroid/content/Context;)[Ljava/lang/String;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .line 296
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/axjava/JNIFunctions$d;

    invoke-direct {v1, p0}, Lcom/axjava/JNIFunctions$d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 320
    sget-object v0, Lcom/axjava/JNIFunctions;->clipboardHistory:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public static getInstance()Lcom/axjava/JNIFunctions;
    .locals 1

    .line 182
    sget-object v0, Lcom/axjava/JNIFunctions;->INSTANCE:Lcom/axjava/JNIFunctions;

    return-object v0
.end method

.method public static getInternalStorageDirectoryPath(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .line 73
    const-string v0, ""

    .line 75
    .local v0, "storageDirectoryPath":Ljava/lang/String;
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_1

    .line 76
    const-string v1, "storage"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/storage/StorageManager;

    .line 77
    .local v1, "storageManager":Landroid/os/storage/StorageManager;
    if-nez v1, :cond_0

    .line 78
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {v1}, Landroid/os/storage/StorageManager;->getPrimaryStorageVolume()Landroid/os/storage/StorageVolume;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/storage/StorageVolume;->getDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 82
    .end local v1    # "storageManager":Landroid/os/storage/StorageManager;
    :goto_0
    goto :goto_1

    .line 83
    :cond_1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 86
    :goto_1
    return-object v0
.end method

.method public static getMaxRefreshRate(Landroid/content/Context;)F
    .locals 4
    .param p0, "context"    # Landroid/content/Context;

    .line 602
    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 603
    .local v0, "windowManager":Landroid/view/WindowManager;
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    .line 604
    .local v1, "display":Landroid/view/Display;
    invoke-virtual {v1}, Landroid/view/Display;->getMode()Landroid/view/Display$Mode;

    move-result-object v2

    .line 605
    .local v2, "mode":Landroid/view/Display$Mode;
    invoke-virtual {v2}, Landroid/view/Display$Mode;->getRefreshRate()F

    move-result v3

    return v3
.end method

.method public static getTextClipboard(Landroid/content/Context;)Ljava/lang/String;
    .locals 5
    .param p0, "context"    # Landroid/content/Context;

    .line 85
    :try_start_0
    const-string v0, "clipboard"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 86
    .local v0, "clipboard":Landroid/content/ClipboardManager;
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    .line 87
    .local v1, "text":Ljava/lang/CharSequence;
    const-string v2, "Arceus X"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "text is %s"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    .line 89
    .end local v0    # "clipboard":Landroid/content/ClipboardManager;
    .end local v1    # "text":Ljava/lang/CharSequence;
    :catch_0
    move-exception v0

    .line 90
    .local v0, "e":Ljava/lang/Exception;
    const-string v1, "Error: AX-1!"

    return-object v1
.end method

.method public static getWifiSignalStrength(Landroid/content/Context;)I
    .locals 4
    .param p0, "context"    # Landroid/content/Context;

    .line 609
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 610
    .local v0, "wifi":Landroid/net/wifi/WifiManager;
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v1

    .line 611
    .local v1, "wifiInfo":Landroid/net/wifi/WifiInfo;
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getRssi()I

    move-result v2

    const/16 v3, 0x65

    invoke-static {v2, v3}, Landroid/net/wifi/WifiManager;->calculateSignalLevel(II)I

    move-result v2

    .line 612
    .local v2, "level":I
    return v2
.end method

.method public static handlePasteEvent(Landroid/content/Context;)V
    .locals 5
    .param p0, "context"    # Landroid/content/Context;

    .line 404
    const-string v0, "PasteEvent"

    const-string v1, "Handling paste event"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 405
    const-string v0, "clipboard"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 407
    .local v0, "clipboard":Landroid/content/ClipboardManager;
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    .line 408
    .local v2, "text":Ljava/lang/CharSequence;
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/axjava/JNIFunctions;->handleTextInput(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 412
    .end local v2    # "text":Ljava/lang/CharSequence;
    goto :goto_0

    .line 409
    :catch_0
    move-exception v2

    .line 410
    .local v2, "e":Ljava/lang/Exception;
    const-string v3, "Arceus X"

    const-string v4, "Error while copying."

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 411
    const-string v3, "Error while pasting..."

    invoke-static {p0, v3, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 413
    .end local v2    # "e":Ljava/lang/Exception;
    :goto_0
    return-void
.end method

.method public static native handleTextInput(Ljava/lang/String;)V
.end method

.method public static hideKeyboard(Landroid/content/Context;)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v2, 0x0

    .line 72
    const-string v1, "input_method"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    move-object v0, v1

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 73
    .local v0, "keyboard":Landroid/view/inputmethod/InputMethodManager;
    invoke-virtual {v0, v2, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 74
    return-void
.end method

.method public static isPermissionGood(Landroid/content/Context;)Z
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .line 137
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 138
    return v1

    .line 139
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_1

    invoke-static {}, Landroid/os/Environment;->isExternalStorageManager()Z

    move-result v0

    if-nez v0, :cond_1

    .line 140
    return v1

    .line 142
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private static synthetic lambda$AX_UpdatePopupAndMaybeInstall$2(Landroid/content/Context;ILjava/lang/String;)V
    .locals 10
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "mode"    # I
    .param p2, "textOrPath"    # Ljava/lang/String;

    .line 682
    const-string v0, "ArceusX"

    :try_start_0
    invoke-static {}, Lcom/axjava/JNIFunctions;->getActivityOrNull()Landroid/app/Activity;

    move-result-object v1

    .line 683
    .local v1, "act":Landroid/app/Activity;
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_0

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object v2, p0

    .line 684
    .local v2, "ctx":Landroid/content/Context;
    :goto_0
    if-nez v2, :cond_1

    .line 685
    const-string v3, "AX_UpdatePopupAndMaybeInstall: ctx is null"

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 686
    return-void

    .line 689
    :cond_1
    if-nez p1, :cond_4

    .line 691
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 692
    move-object v3, p2

    goto :goto_1

    .line 693
    :cond_2
    const-string v3, "Downloading update..."

    :goto_1
    nop

    .line 695
    .local v3, "msg":Ljava/lang/String;
    sget-object v4, Lcom/axjava/JNIFunctions;->sUpdateDialog:Landroid/app/AlertDialog;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 696
    sget-object v4, Lcom/axjava/JNIFunctions;->sUpdateDialog:Landroid/app/AlertDialog;

    invoke-virtual {v4, v3}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 697
    return-void

    .line 700
    :cond_3
    new-instance v4, Landroid/app/AlertDialog$Builder;

    invoke-direct {v4, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 701
    .local v4, "builder":Landroid/app/AlertDialog$Builder;
    const-string v5, "Update"

    invoke-virtual {v4, v5}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 702
    invoke-virtual {v4, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 703
    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 705
    invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v5

    sput-object v5, Lcom/axjava/JNIFunctions;->sUpdateDialog:Landroid/app/AlertDialog;

    .line 706
    invoke-virtual {v5}, Landroid/app/AlertDialog;->show()V

    .line 707
    return-void

    .line 710
    .end local v3    # "msg":Ljava/lang/String;
    .end local v4    # "builder":Landroid/app/AlertDialog$Builder;
    :cond_4
    const/4 v3, 0x1

    if-ne p1, v3, :cond_7

    .line 712
    sget-object v3, Lcom/axjava/JNIFunctions;->sUpdateDialog:Landroid/app/AlertDialog;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 713
    sget-object v3, Lcom/axjava/JNIFunctions;->sUpdateDialog:Landroid/app/AlertDialog;

    if-eqz p2, :cond_5

    move-object v4, p2

    goto :goto_2

    :cond_5
    const-string v4, ""

    :goto_2
    invoke-virtual {v3, v4}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 715
    :cond_6
    return-void

    .line 718
    :cond_7
    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ne p1, v3, :cond_9

    .line 720
    sget-object v3, Lcom/axjava/JNIFunctions;->sUpdateDialog:Landroid/app/AlertDialog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v3, :cond_8

    .line 722
    :try_start_1
    invoke-virtual {v3}, Landroid/app/AlertDialog;->dismiss()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    .line 723
    :catchall_0
    move-exception v3

    :goto_3
    nop

    .line 724
    :try_start_2
    sput-object v4, Lcom/axjava/JNIFunctions;->sUpdateDialog:Landroid/app/AlertDialog;

    .line 726
    :cond_8
    return-void

    .line 729
    :cond_9
    const/4 v3, 0x3

    if-ne p1, v3, :cond_12

    .line 731
    sget-object v3, Lcom/axjava/JNIFunctions;->sUpdateDialog:Landroid/app/AlertDialog;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-eqz v3, :cond_a

    .line 733
    :try_start_3
    invoke-virtual {v3}, Landroid/app/AlertDialog;->dismiss()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    .line 734
    :catchall_1
    move-exception v3

    :goto_4
    nop

    .line 735
    sput-object v4, Lcom/axjava/JNIFunctions;->sUpdateDialog:Landroid/app/AlertDialog;

    .line 738
    :cond_a
    move-object v3, p2

    .line 739
    .local v3, "apkAbsPath":Ljava/lang/String;
    if-eqz v3, :cond_11

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_b

    goto/16 :goto_8

    .line 744
    :cond_b
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 745
    .local v4, "apk":Ljava/io/File;
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-nez v9, :cond_c

    goto :goto_7

    .line 754
    :cond_c
    :try_start_4
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x18

    if-lt v5, v6, :cond_d

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const-string v6, ".fileprovider"

    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6, v4}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v5

    goto :goto_5

    :cond_d
    invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v5

    .line 759
    .local v5, "uri":Landroid/net/Uri;
    :goto_5
    new-instance v6, Landroid/content/Intent;

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x18

    if-lt v7, v8, :cond_e

    const-string v7, "android.intent.action.INSTALL_PACKAGE"

    goto :goto_6

    :cond_e
    const-string v7, "android.intent.action.VIEW"

    :goto_6
    invoke-direct {v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 762
    .local v6, "intent":Landroid/content/Intent;
    const-string v7, "application/vnd.android.package-archive"

    invoke-virtual {v6, v5, v7}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 763
    const/high16 v7, 0x10000000

    invoke-virtual {v6, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x18

    if-lt v7, v8, :cond_f

    const-string v7, "android.intent.extra.NOT_UNKNOWN_SOURCE"

    const/4 v8, 0x1

    invoke-virtual {v6, v7, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 764
    :cond_f
    const-string v7, "Choose how to install"

    invoke-static {v6, v7}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v8

    const/high16 v7, 0x10000000

    invoke-virtual {v8, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v2, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 768
    .end local v5    # "uri":Landroid/net/Uri;
    .end local v6    # "intent":Landroid/content/Intent;
    goto :goto_9

    .line 766
    :catchall_2
    move-exception v5

    .line 767
    .local v5, "t":Ljava/lang/Throwable;
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "INSTALL: failed to start installer: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_9

    .line 746
    .end local v5    # "t":Ljava/lang/Throwable;
    :cond_10
    :goto_7
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "INSTALL: apk missing/empty: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 747
    return-void

    .line 740
    .end local v4    # "apk":Ljava/io/File;
    :cond_11
    :goto_8
    const-string v4, "INSTALL: empty apk path"

    invoke-static {v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 741
    return-void

    .line 773
    .end local v1    # "act":Landroid/app/Activity;
    .end local v2    # "ctx":Landroid/content/Context;
    .end local v3    # "apkAbsPath":Ljava/lang/String;
    :cond_12
    :goto_9
    goto :goto_a

    .line 771
    :catchall_3
    move-exception v1

    .line 772
    .local v1, "t":Ljava/lang/Throwable;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AX_UpdatePopupAndMaybeInstall failed: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 774
    .end local v1    # "t":Ljava/lang/Throwable;
    :goto_a
    return-void
.end method

.method private static synthetic lambda$openWebsite$0(Landroid/app/Activity;Landroid/content/Intent;)V
    .locals 3
    .param p0, "act"    # Landroid/app/Activity;
    .param p1, "intent"    # Landroid/content/Intent;

    .line 202
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 205
    goto :goto_0

    .line 203
    :catch_0
    move-exception v0

    .line 204
    .local v0, "e":Ljava/lang/Exception;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to open website: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ArceusX"

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    return-void
.end method

.method private static synthetic lambda$openWebsite$1(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "intent"    # Landroid/content/Intent;

    .line 214
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 217
    goto :goto_0

    .line 215
    :catch_0
    move-exception v0

    .line 216
    .local v0, "e":Ljava/lang/Exception;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to open website: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ArceusX"

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 218
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    return-void
.end method

.method public static loseFocus(Landroid/content/Context;)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .line 151
    new-instance v0, Landroid/widget/EditText;

    invoke-direct {v0, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 152
    .local v0, "editText":Landroid/widget/EditText;
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setVisibility(I)V

    .line 153
    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 154
    return-void
.end method

.method public static openURL(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "url"    # Ljava/lang/String;

    .line 73
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/axjava/JNIFunctions$b;

    invoke-direct {v1, p1, p0}, Lcom/axjava/JNIFunctions$b;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 81
    return-void
.end method

.method public static openWebsite(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "url"    # Ljava/lang/String;

    .line 196
    new-instance v0, Landroid/content/Intent;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 198
    .local v0, "intent":Landroid/content/Intent;
    invoke-static {}, Lcom/axjava/JNIFunctions;->getActivityOrNull()Landroid/app/Activity;

    move-result-object v1

    .line 199
    .local v1, "act":Landroid/app/Activity;
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_0

    .line 200
    new-instance v2, Lcom/axjava/a;

    invoke-direct {v2, v1, v0}, Lcom/axjava/a;-><init>(Landroid/app/Activity;Landroid/content/Intent;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 207
    return-void

    .line 211
    :cond_0
    const/high16 v2, 0x10000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 212
    new-instance v2, Lcom/axjava/b;

    invoke-direct {v2, p0, v0}, Lcom/axjava/b;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    .line 219
    .local v2, "launch":Ljava/lang/Runnable;
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    if-ne v3, v4, :cond_1

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 220
    :cond_1
    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v3, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 221
    :goto_0
    return-void
.end method

.method public static requestPermission(Landroid/content/Context;)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .line 121
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_0

    .line 122
    move-object v1, p0

    check-cast v1, Landroid/app/Activity;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x70

    invoke-static {v1, v0, v2}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 123
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    invoke-static {}, Landroid/os/Environment;->isExternalStorageManager()Z

    move-result v0

    if-nez v0, :cond_1

    .line 125
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "package:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 126
    .local v0, "uri":Landroid/net/Uri;
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 127
    .local v1, "intent":Landroid/content/Intent;
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    .end local v0    # "uri":Landroid/net/Uri;
    .end local v1    # "intent":Landroid/content/Intent;
    goto :goto_0

    .line 128
    :catch_0
    move-exception v0

    .line 129
    .local v0, "ex":Ljava/lang/Exception;
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 130
    .restart local v1    # "intent":Landroid/content/Intent;
    const-string v2, "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 134
    .end local v0    # "ex":Ljava/lang/Exception;
    .end local v1    # "intent":Landroid/content/Intent;
    :cond_1
    :goto_0
    return-void
.end method

.method public static savePreference(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .line 113
    const-string v0, "keys"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 114
    .local v0, "settings":Landroid/content/SharedPreferences;
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 115
    .local v1, "editor":Landroid/content/SharedPreferences$Editor;
    invoke-interface {v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 116
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 117
    return-void
.end method

.method public static setActivity(Landroid/app/Activity;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/axjava/JNIFunctions;->activityRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static showAlert(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "length"    # I

    .line 150
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/axjava/JNIFunctions$b;

    invoke-direct {v1, p0, p1}, Lcom/axjava/JNIFunctions$b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 167
    return-void
.end method

.method public static vibratePhone(Landroid/content/Context;II)V
    .locals 5
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "durationMilliseconds"    # I
    .param p2, "type"    # I

    .line 39
    const-string v0, "vibrator"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    .line 40
    .local v0, "vibrator":Landroid/os/Vibrator;
    const-string v1, "Arceus X"

    const-string v2, "Vibrating..."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_2

    .line 42
    const/4 v2, 0x0

    .line 43
    .local v2, "vibrationEffect1":Landroid/os/VibrationEffect;
    const/4 v3, -0x1

    if-ne p2, v3, :cond_0

    .line 44
    int-to-long v3, p1

    invoke-static {v3, v4, p2}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    move-result-object v2

    goto :goto_0

    .line 45
    :cond_0
    const/16 v3, 0x1d

    if-lt v1, v3, :cond_1

    .line 46
    invoke-static {p2}, Landroid/os/VibrationEffect;->createPredefined(I)Landroid/os/VibrationEffect;

    move-result-object v2

    .line 48
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/os/Vibrator;->cancel()V

    .line 49
    invoke-virtual {v0, v2}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    .line 50
    .end local v2    # "vibrationEffect1":Landroid/os/VibrationEffect;
    goto :goto_1

    .line 51
    :cond_2
    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V

    .line 53
    :goto_1
    return-void
.end method
