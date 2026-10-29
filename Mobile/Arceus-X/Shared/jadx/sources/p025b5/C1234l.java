package p025b5;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041c5.C1525a;
import p041c5.C1528d;
import p145g5.InterfaceC6008c;
import p145g5.InterfaceC6009d;
import p209j5.C7031a;
import p535x4.C12654c;
import p535x4.InterfaceC12656d;

/* JADX INFO: renamed from: b5.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u001f\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010&R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u001a\u0010\u000e\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b#\u0010+R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, m31665d2 = {"Lb5/l;", "Lg5/d;", "Lx4/d;", "Landroid/content/Context;", "context", "", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "", "databaseVersion", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILg5/d;)V", "", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "Lx4/c;", "databaseConfiguration", "d", "(Lx4/c;)V", "writable", "e", "destinationFile", "b", "(Ljava/io/File;Z)V", "databaseFile", "c", "a", "Landroid/content/Context;", "Ljava/lang/String;", "Ljava/io/File;", "Ljava/util/concurrent/Callable;", "I", "f", "Lg5/d;", "()Lg5/d;", "g", "Lx4/c;", "h", "Z", "verified", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lg5/c;", "t2", "()Lg5/c;", "writableDatabase", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1234l implements InterfaceC6009d, InterfaceC12656d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String copyFromAssetPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final File copyFromFile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Callable<InputStream> copyFromInputStream;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int databaseVersion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6009d delegate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public C12654c databaseConfiguration;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean verified;

    public C1234l(@NotNull Context context, @Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, int i10, @NotNull InterfaceC6009d delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i10;
        this.delegate = delegate;
    }

    @Override // p535x4.InterfaceC12656d
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public InterfaceC6009d getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: b */
    public final void m6928b(File destinationFile, boolean writable) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.copyFromAssetPath != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(...)");
        } else if (this.copyFromFile != null) {
            readableByteChannelNewChannel = new FileInputStream(this.copyFromFile).getChannel();
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "getChannel(...)");
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
                Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(...)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        Intrinsics.checkNotNull(channel);
        C1528d.m8084a(readableByteChannelNewChannel, channel);
        File parentFile = destinationFile.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + destinationFile.getAbsolutePath());
        }
        Intrinsics.checkNotNull(fileCreateTempFile);
        m6929c(fileCreateTempFile, writable);
        if (fileCreateTempFile.renameTo(destinationFile)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + destinationFile.getAbsolutePath() + ").");
    }

    /* JADX INFO: renamed from: c */
    public final void m6929c(File databaseFile, boolean writable) {
        C12654c c12654c = this.databaseConfiguration;
        if (c12654c == null) {
            Intrinsics.m31998u("databaseConfiguration");
            c12654c = null;
        }
        c12654c.getClass();
    }

    @Override // p145g5.InterfaceC6009d, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m6930d(@NotNull C12654c databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    /* JADX INFO: renamed from: e */
    public final void m6931e(boolean writable) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.context.getDatabasePath(databaseName);
        C12654c c12654c = this.databaseConfiguration;
        C12654c c12654c2 = null;
        if (c12654c == null) {
            Intrinsics.m31998u("databaseConfiguration");
            c12654c = null;
        }
        C7031a c7031a = new C7031a(databaseName, this.context.getFilesDir(), c12654c.multiInstanceInvalidation);
        try {
            C7031a.m29712c(c7031a, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    Intrinsics.checkNotNull(databasePath);
                    m6928b(databasePath, writable);
                    c7031a.m29714d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                Intrinsics.checkNotNull(databasePath);
                int iM8068f = C1525a.m8068f(databasePath);
                if (iM8068f == this.databaseVersion) {
                    c7031a.m29714d();
                    return;
                }
                C12654c c12654c3 = this.databaseConfiguration;
                if (c12654c3 == null) {
                    Intrinsics.m31998u("databaseConfiguration");
                    c12654c3 = null;
                }
                if (c12654c3.migrationContainer.m47301d(iM8068f, this.databaseVersion) != null) {
                    c7031a.m29714d();
                    return;
                }
                C12654c c12654c4 = this.databaseConfiguration;
                if (c12654c4 == null) {
                    Intrinsics.m31998u("databaseConfiguration");
                } else {
                    c12654c2 = c12654c4;
                }
                if (c12654c2.m47162f(iM8068f, this.databaseVersion)) {
                    c7031a.m29714d();
                    return;
                }
                if (this.context.deleteDatabase(databaseName)) {
                    try {
                        m6928b(databasePath, writable);
                        Unit unit = Unit.f29331a;
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c7031a.m29714d();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                c7031a.m29714d();
                return;
            }
        } catch (Throwable th2) {
            c7031a.m29714d();
            throw th2;
        }
        c7031a.m29714d();
        throw th2;
    }

    @Override // p145g5.InterfaceC6009d
    @Nullable
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // p145g5.InterfaceC6009d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        getDelegate().setWriteAheadLoggingEnabled(enabled);
    }

    @Override // p145g5.InterfaceC6009d
    @NotNull
    /* JADX INFO: renamed from: t2 */
    public InterfaceC6008c mo6885t2() {
        if (!this.verified) {
            m6931e(true);
            this.verified = true;
        }
        return getDelegate().mo6885t2();
    }
}
