package j1;

import android.media.MediaMuxer;
import java.io.FileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static MediaMuxer a(FileDescriptor fileDescriptor, int i10) {
        return new MediaMuxer(fileDescriptor, i10);
    }
}
