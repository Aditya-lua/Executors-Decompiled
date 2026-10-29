package p281m0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import p140g0.C5883f1;
import p140g0.C5891h1;
import p347p0.C10091g;
import p480v0.C11988c;
import p531x0.AbstractC12578b0;
import p531x0.InterfaceC12576a0;

/* JADX INFO: renamed from: m0.f0 */
/* JADX INFO: loaded from: classes.dex */
public class C8288f0 implements InterfaceC12576a0<a, C5883f1.i> {

    /* JADX INFO: renamed from: m0.f0$a */
    public static abstract class a {
        /* JADX INFO: renamed from: c */
        public static a m33718c(AbstractC12578b0<byte[]> abstractC12578b0, C5883f1.h hVar) {
            return new C8284e(abstractC12578b0, hVar);
        }

        /* JADX INFO: renamed from: a */
        public abstract C5883f1.h mo33710a();

        /* JADX INFO: renamed from: b */
        public abstract AbstractC12578b0<byte[]> mo33711b();
    }

    /* JADX INFO: renamed from: b */
    public static void m33716b(File file, byte[] bArr) throws C5891h1 {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new C11988c().m44742b(bArr));
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new C5891h1(1, "Failed to write to temp file", e10);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p531x0.InterfaceC12576a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5883f1.i apply(a aVar) throws C5891h1 {
        AbstractC12578b0<byte[]> abstractC12578b0Mo33711b = aVar.mo33711b();
        C5883f1.h hVarMo33710a = aVar.mo33710a();
        File fileM33876e = C8334z.m33876e(hVarMo33710a);
        m33716b(fileM33876e, abstractC12578b0Mo33711b.mo46929c());
        C10091g c10091gMo46930d = abstractC12578b0Mo33711b.mo46930d();
        Objects.requireNonNull(c10091gMo46930d);
        C8334z.m33883l(fileM33876e, c10091gMo46930d, hVarMo33710a, abstractC12578b0Mo33711b.mo46932f());
        return new C5883f1.i(C8334z.m33881j(fileM33876e, hVarMo33710a), 256);
    }
}
