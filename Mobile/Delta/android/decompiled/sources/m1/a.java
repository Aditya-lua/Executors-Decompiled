package m1;

import android.media.MediaFormat;
import java.util.Objects;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements n {

    /* JADX INFO: renamed from: m1.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0418a {
        public abstract a a();

        public a b() {
            a aVarA = a();
            if (Objects.equals(aVarA.b(), "audio/mp4a-latm") && aVarA.i() == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return aVarA;
        }

        public abstract AbstractC0418a c(int i10);

        public abstract AbstractC0418a d(int i10);

        public abstract AbstractC0418a e(int i10);

        public abstract AbstractC0418a f(int i10);

        public abstract AbstractC0418a g(a4 a4Var);

        public abstract AbstractC0418a h(String str);

        public abstract AbstractC0418a i(int i10);
    }

    public static AbstractC0418a d() {
        return new c.b().i(-1);
    }

    @Override // m1.n
    public MediaFormat a() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(b(), h(), g());
        mediaFormatCreateAudioFormat.setInteger("bitrate", e());
        if (i() != -1) {
            if (b().equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", i());
                return mediaFormatCreateAudioFormat;
            }
            mediaFormatCreateAudioFormat.setInteger("profile", i());
        }
        return mediaFormatCreateAudioFormat;
    }

    @Override // m1.n
    public abstract String b();

    @Override // m1.n
    public abstract a4 c();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();
}
