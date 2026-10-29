package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p410rf.C10867c;
import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;
import p410rf.InterfaceC10871g;

/* JADX INFO: loaded from: classes.dex */
final class zzcw implements InterfaceC10870f {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final C10868d zzb;
    private static final C10868d zzc;
    private static final InterfaceC10869e zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final InterfaceC10869e zzh;
    private final zzda zzi = new zzda(this);

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("key");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = bVarM41320a.m41325b(zzcqVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("value");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzcqVar2.zzb()).m41324a();
        zzd = new InterfaceC10869e() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzcv
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p410rf.InterfaceC10866b
            public final void encode(Object obj, InterfaceC10870f interfaceC10870f) {
                zzcw.zzg((Map.Entry) obj, interfaceC10870f);
            }
        };
    }

    public zzcw(OutputStream outputStream, Map map, Map map2, InterfaceC10869e interfaceC10869e) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = interfaceC10869e;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, InterfaceC10870f interfaceC10870f) {
        interfaceC10870f.add(zzb, entry.getKey());
        interfaceC10870f.add(zzc, entry.getValue());
    }

    private static int zzh(C10868d c10868d) {
        zzcu zzcuVar = (zzcu) c10868d.m41323c(zzcu.class);
        if (zzcuVar != null) {
            return zzcuVar.zza();
        }
        throw new C10867c("Field has no @Protobuf config");
    }

    private final long zzi(InterfaceC10869e interfaceC10869e, Object obj) throws IOException {
        zzcr zzcrVar = new zzcr();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzcrVar;
            try {
                interfaceC10869e.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzcrVar.zza();
                zzcrVar.close();
                return jZza;
            } catch (Throwable th2) {
                this.zze = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                zzcrVar.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    private static zzcu zzj(C10868d c10868d) {
        zzcu zzcuVar = (zzcu) c10868d.m41323c(zzcu.class);
        if (zzcuVar != null) {
            return zzcuVar;
        }
        throw new C10867c("Field has no @Protobuf config");
    }

    private final zzcw zzk(InterfaceC10869e interfaceC10869e, C10868d c10868d, Object obj, boolean z10) throws IOException {
        long jZzi = zzi(interfaceC10869e, obj);
        if (z10 && jZzi == 0) {
            return this;
        }
        zzn((zzh(c10868d) << 3) | 2);
        zzo(jZzi);
        interfaceC10869e.encode(obj, this);
        return this;
    }

    private final zzcw zzl(InterfaceC10871g interfaceC10871g, C10868d c10868d, Object obj, boolean z10) {
        this.zzi.zza(c10868d, z10);
        interfaceC10871g.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.zze.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.zze.write(i10 & 127);
    }

    private final void zzo(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.zze.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.zze.write(((int) j10) & 127);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NonNull
    public final InterfaceC10870f add(@NonNull C10868d c10868d, double d10) throws IOException {
        zza(c10868d, d10, true);
        return this;
    }

    @NonNull
    public final InterfaceC10870f inline(Object obj) {
        zzf(obj);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NonNull
    public final InterfaceC10870f nested(@NonNull C10868d c10868d) {
        throw new C10867c("nested() is not implemented for protobuf encoding.");
    }

    public final InterfaceC10870f zza(@NonNull C10868d c10868d, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        zzn((zzh(c10868d) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d10).array());
        return this;
    }

    public final InterfaceC10870f zzb(@NonNull C10868d c10868d, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        zzn((zzh(c10868d) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f10).array());
        return this;
    }

    public final InterfaceC10870f zzc(@NonNull C10868d c10868d, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    zzn((zzh(c10868d) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(c10868d, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzk(zzd, c10868d, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zza(c10868d, ((Double) obj).doubleValue(), z10);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(c10868d, ((Float) obj).floatValue(), z10);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(c10868d, ((Number) obj).longValue(), z10);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(c10868d, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    InterfaceC10869e interfaceC10869e = (InterfaceC10869e) this.zzf.get(obj.getClass());
                    if (interfaceC10869e != null) {
                        zzk(interfaceC10869e, c10868d, obj, z10);
                        return this;
                    }
                    InterfaceC10871g interfaceC10871g = (InterfaceC10871g) this.zzg.get(obj.getClass());
                    if (interfaceC10871g != null) {
                        zzl(interfaceC10871g, c10868d, obj, z10);
                        return this;
                    }
                    if (obj instanceof zzcs) {
                        zzd(c10868d, ((zzcs) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(c10868d, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, c10868d, obj, z10);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    zzn((zzh(c10868d) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final zzcw zzd(@NonNull C10868d c10868d, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            zzcu zzcuVarZzj = zzj(c10868d);
            zzct zzctVar = zzct.DEFAULT;
            int iOrdinal = zzcuVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzcuVarZzj.zza() << 3);
                zzn(i10);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzcuVarZzj.zza() << 3);
                zzn((i10 + i10) ^ (i10 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzcuVarZzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    public final zzcw zze(@NonNull C10868d c10868d, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            zzcu zzcuVarZzj = zzj(c10868d);
            zzct zzctVar = zzct.DEFAULT;
            int iOrdinal = zzcuVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzcuVarZzj.zza() << 3);
                zzo(j10);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzcuVarZzj.zza() << 3);
                zzo((j10 >> 63) ^ (j10 + j10));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzcuVarZzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    public final zzcw zzf(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC10869e interfaceC10869e = (InterfaceC10869e) this.zzf.get(obj.getClass());
        if (interfaceC10869e == null) {
            throw new C10867c("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        interfaceC10869e.encode(obj, this);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @NonNull
    public final InterfaceC10870f add(@NonNull C10868d c10868d, float f10) throws IOException {
        zzb(c10868d, f10, true);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @NonNull
    public final InterfaceC10870f nested(@NonNull String str) {
        return nested(C10868d.m41321d(str));
    }

    @Override // p410rf.InterfaceC10870f
    @NonNull
    public final /* synthetic */ InterfaceC10870f add(@NonNull C10868d c10868d, int i10) throws IOException {
        zzd(c10868d, i10, true);
        return this;
    }

    @Override // p410rf.InterfaceC10870f
    @NonNull
    public final /* synthetic */ InterfaceC10870f add(@NonNull C10868d c10868d, long j10) throws IOException {
        zze(c10868d, j10, true);
        return this;
    }

    @Override // p410rf.InterfaceC10870f
    @NonNull
    public final InterfaceC10870f add(@NonNull C10868d c10868d, Object obj) throws IOException {
        zzc(c10868d, obj, true);
        return this;
    }

    @NonNull
    public final /* synthetic */ InterfaceC10870f add(@NonNull C10868d c10868d, boolean z10) throws IOException {
        zzd(c10868d, z10 ? 1 : 0, true);
        return this;
    }

    @NonNull
    public final InterfaceC10870f add(@NonNull String str, double d10) throws IOException {
        zza(C10868d.m41321d(str), d10, true);
        return this;
    }

    @NonNull
    public final InterfaceC10870f add(@NonNull String str, int i10) throws IOException {
        zzd(C10868d.m41321d(str), i10, true);
        return this;
    }

    @NonNull
    public final InterfaceC10870f add(@NonNull String str, long j10) throws IOException {
        zze(C10868d.m41321d(str), j10, true);
        return this;
    }

    @NonNull
    public final InterfaceC10870f add(@NonNull String str, Object obj) throws IOException {
        zzc(C10868d.m41321d(str), obj, true);
        return this;
    }

    @NonNull
    public final InterfaceC10870f add(@NonNull String str, boolean z10) throws IOException {
        zzd(C10868d.m41321d(str), z10 ? 1 : 0, true);
        return this;
    }
}
