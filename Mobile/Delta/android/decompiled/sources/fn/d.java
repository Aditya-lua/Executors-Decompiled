package fn;

import android.media.AudioRecord;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfn/c;", "a", "()Lfn/c;", "", "", "Ljava/util/List;", "SAMPLE_RATES", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<Integer> f16885a = kotlin.collections.p.n(48000, 44100, 22050, 16000, 11025, 8000);

    @Nullable
    public static final AudioConfiguration a() {
        Iterator<Integer> it = f16885a.iterator();
        while (true) {
            AudioRecord audioRecord = null;
            if (!it.hasNext()) {
                return null;
            }
            int iIntValue = it.next().intValue();
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(iIntValue, 16, 2);
                if (minBufferSize != -2) {
                    audioRecord = new AudioRecord(1, iIntValue, 16, 2, minBufferSize);
                    if (audioRecord.getState() == 1) {
                        audioRecord.release();
                        AudioConfiguration audioConfiguration = new AudioConfiguration(iIntValue, 16, 2, minBufferSize, 2);
                        audioRecord.release();
                        return audioConfiguration;
                    }
                    audioRecord.release();
                }
            } catch (IllegalArgumentException unused) {
                if (audioRecord != null) {
                }
            } catch (SecurityException unused2) {
                if (audioRecord != null) {
                }
            } catch (Throwable th2) {
                if (audioRecord != null) {
                    audioRecord.release();
                }
                throw th2;
            }
        }
    }
}
