package p282m1;

import android.media.MediaFormat;
import java.util.Objects;
import p296n0.EnumC8723a4;

/* JADX INFO: renamed from: m1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8336a implements InterfaceC8375n {

    /* JADX INFO: renamed from: m1.a$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC8336a mo33897a();

        /* JADX INFO: renamed from: b */
        public AbstractC8336a m33898b() {
            AbstractC8336a abstractC8336aMo33897a = mo33897a();
            if (Objects.equals(abstractC8336aMo33897a.mo33890b(), "audio/mp4a-latm") && abstractC8336aMo33897a.mo33896i() == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return abstractC8336aMo33897a;
        }

        /* JADX INFO: renamed from: c */
        public abstract a mo33899c(int i10);

        /* JADX INFO: renamed from: d */
        public abstract a mo33900d(int i10);

        /* JADX INFO: renamed from: e */
        public abstract a mo33901e(int i10);

        /* JADX INFO: renamed from: f */
        public abstract a mo33902f(int i10);

        /* JADX INFO: renamed from: g */
        public abstract a mo33903g(EnumC8723a4 enumC8723a4);

        /* JADX INFO: renamed from: h */
        public abstract a mo33904h(String str);

        /* JADX INFO: renamed from: i */
        public abstract a mo33905i(int i10);
    }

    /* JADX INFO: renamed from: d */
    public static a m33888d() {
        return new C8342c.b().mo33905i(-1);
    }

    @Override // p282m1.InterfaceC8375n
    /* JADX INFO: renamed from: a */
    public MediaFormat mo33889a() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(mo33890b(), mo33895h(), mo33894g());
        mediaFormatCreateAudioFormat.setInteger("bitrate", mo33892e());
        if (mo33896i() != -1) {
            if (mo33890b().equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", mo33896i());
                return mediaFormatCreateAudioFormat;
            }
            mediaFormatCreateAudioFormat.setInteger("profile", mo33896i());
        }
        return mediaFormatCreateAudioFormat;
    }

    @Override // p282m1.InterfaceC8375n
    /* JADX INFO: renamed from: b */
    public abstract String mo33890b();

    @Override // p282m1.InterfaceC8375n
    /* JADX INFO: renamed from: c */
    public abstract EnumC8723a4 mo33891c();

    /* JADX INFO: renamed from: e */
    public abstract int mo33892e();

    /* JADX INFO: renamed from: f */
    public abstract int mo33893f();

    /* JADX INFO: renamed from: g */
    public abstract int mo33894g();

    /* JADX INFO: renamed from: h */
    public abstract int mo33895h();

    /* JADX INFO: renamed from: i */
    public abstract int mo33896i();
}
