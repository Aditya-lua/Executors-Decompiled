package androidx.core.util;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class AtomicFile {
    private final File mBackupName;
    private final File mBaseName;

    public AtomicFile(@NonNull File baseName) {
        this.mBaseName = baseName;
        this.mBackupName = new File(baseName.getPath() + ".bak");
    }

    @NonNull
    public File getBaseFile() {
        return this.mBaseName;
    }

    public void delete() {
        this.mBaseName.delete();
        this.mBackupName.delete();
    }

    @NonNull
    public FileOutputStream startWrite() throws IOException {
        if (this.mBaseName.exists()) {
            if (!this.mBackupName.exists()) {
                if (!this.mBaseName.renameTo(this.mBackupName)) {
                    Log.w("AtomicFile", "Couldn't rename file " + this.mBaseName + " to backup file " + this.mBackupName);
                }
            } else {
                this.mBaseName.delete();
            }
        }
        try {
            FileOutputStream str = new FileOutputStream(this.mBaseName);
            return str;
        } catch (FileNotFoundException e10) {
            File parent = this.mBaseName.getParentFile();
            if (!parent.mkdirs()) {
                throw new IOException("Couldn't create directory " + this.mBaseName);
            }
            try {
                FileOutputStream str2 = new FileOutputStream(this.mBaseName);
                return str2;
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.mBaseName);
            }
        }
    }

    public void finishWrite(@Nullable FileOutputStream str) {
        if (str != null) {
            sync(str);
            try {
                str.close();
                this.mBackupName.delete();
            } catch (IOException e10) {
                Log.w("AtomicFile", "finishWrite: Got exception:", e10);
            }
        }
    }

    public void failWrite(@Nullable FileOutputStream str) {
        if (str != null) {
            sync(str);
            try {
                str.close();
                this.mBaseName.delete();
                this.mBackupName.renameTo(this.mBaseName);
            } catch (IOException e10) {
                Log.w("AtomicFile", "failWrite: Got exception:", e10);
            }
        }
    }

    @NonNull
    public FileInputStream openRead() {
        if (this.mBackupName.exists()) {
            this.mBaseName.delete();
            this.mBackupName.renameTo(this.mBaseName);
        }
        return new FileInputStream(this.mBaseName);
    }

    @NonNull
    public byte[] readFully() throws IOException {
        FileInputStream stream = openRead();
        int pos = 0;
        try {
            byte[] data = new byte[stream.available()];
            while (true) {
                int amt = stream.read(data, pos, data.length - pos);
                if (amt > 0) {
                    pos += amt;
                    int avail = stream.available();
                    if (avail > data.length - pos) {
                        byte[] newData = new byte[pos + avail];
                        System.arraycopy(data, 0, newData, 0, pos);
                        data = newData;
                    }
                } else {
                    stream.close();
                    return data;
                }
            }
        } catch (Throwable th2) {
            stream.close();
            throw th2;
        }
    }

    private static boolean sync(@NonNull FileOutputStream stream) {
        try {
            stream.getFD().sync();
            return true;
        } catch (IOException e10) {
            return false;
        }
    }
}
