/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf5208..0xaf55d0 (968 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_af3248;
extern void g_af3410;
extern void g_af486c;
extern char g_af55d0;
extern void g_af55f0;
extern void g_af55f4;
extern void g_af5844;
extern void g_af5b40;
extern void g_af5bf0;
extern void g_c6a478;

void* sub_af5208(void* a0, void* a1, unsigned long a2, unsigned long a3)
{
    void* v3;  // x8
    unsigned long v4;  // x9
    unsigned long v13;  // x10
    void* v14;  // x0
    void* v15;  // x0
    void* v16;  // x0
    void* v17;  // w0
    void* v5;  // x10
    void* v6;  // x9
    void* v7;  // x10
    void* v8;  // x9
    unsigned long v9;  // x11
    void* v10;  // x9
    void* v11;  // x10
    void* v12;  // x9
    long long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_vfy.c", 2515, "X509_STORE_CTX_init");
        sub_a36abc(11, 0xc0102, 0);
        return 0;
    }
    else if ((long long)a0[0x88])
    {
        (long long)a0[0x88]();
    }
    else
    {
        if ((long long)a0[32])
        {
            if (!(long long)a0[216])
                sub_af82fc();
            *(unsigned long long *)&a0[32] = 0;
        }
        sub_ade218((long long)a0[160]);
        *(unsigned long long *)&a0[160] = 0;
        sub_aded90((long long)a0[152]);
        *(unsigned long long *)&a0[152] = 0;
        sub_a6a9e8(5, a0, a0 + 224);
        *(unsigned long long *)&a0[232] = 0;
        *(unsigned long long *)&a0[240] = 0;
        *(void* *)a0 = a1;
        *(unsigned long *)&a0[8] = a2;
        *(unsigned long *)&a0[16] = a3;
        *(unsigned long long *)&a0[24] = 0;
        *(unsigned long long *)&a0[40] = 0;
        *(unsigned int *)&a0[248] = 0;
        *(unsigned long long *)&a0[0x100] = 0;
        memset(a0 + 144, 0, 36);
        memset(a0 + 184, 0, 48);
        if (a1)
        {
            v3 = (long long)a1[112];
            *(long long *)&a0[0x88] = (long long)a1[120];
            v4 = &g_af55d0;
            if ((long long)a1[56])
                v4 = (long long)a1[56];
            v5 = &g_af486c;
            if ((long long)a1[48])
                v5 = (long long)a1[48];
            *(void* *)&a0[64] = v5;
            *(unsigned long *)&a0[72] = v4;
            v6 = &g_af55f0;
            if ((long long)a1[40])
                v6 = (long long)a1[40];
            v7 = &g_af55f4;
            if ((long long)a1[32])
                v7 = (long long)a1[32];
            *(void* *)&a0[48] = v7;
            *(void* *)&a0[56] = v6;
            v8 = &g_af5844;
            v9 = (long long)a1[72];
            if ((long long)a1[64])
                v8 = (long long)a1[64];
            *(void* *)&a0[80] = v8;
            *(unsigned long *)&a0[88] = v9;
            v10 = &g_c6a478;
            if ((long long)a1[80])
                v10 = (long long)a1[80];
            v11 = &g_af5b40;
            if ((long long)a1[88])
                v11 = (long long)a1[88];
            *(void* *)&a0[96] = v10;
            *(void* *)&a0[104] = v11;
            v12 = &g_af5bf0;
            if ((long long)a1[96])
                v12 = (long long)a1[96];
            v13 = &g_af3248;
            if ((long long)a1[104])
                v13 = (long long)a1[104];
            *(void* *)&a0[112] = v12;
            *(unsigned long *)&a0[120] = v13;
            if (!v3)
                goto LABEL_af5428;
            *(void* *)&a0[128] = v3;
            v14 = sub_af82c4();
            *(void* *)&a0[32] = v14;
            if (!v14)
                goto LABEL_af5454;
LABEL_af5444:
            if (!sub_af8398())
                goto LABEL_af5530;
        }
        else
        {
            *(unsigned long long *)&a0[0x88] = 0;
            *(void **)&a0[64] = &g_af486c;
            *(char **)&a0[72] = &g_af55d0;
            *(void **)&a0[48] = &g_af55f4;
            *(void **)&a0[56] = &g_af55f0;
            *(void **)&a0[80] = &g_af5844;
            *(unsigned long long *)&a0[88] = 0;
            *(void **)&a0[96] = &g_c6a478;
            *(void **)&a0[104] = &g_af5b40;
            *(void **)&a0[112] = &g_af5bf0;
            *(char **)&a0[120] = &g_af3248;
LABEL_af5428:
            *(void **)&a0[128] = &g_af3410;
            v15 = sub_af82c4();
            *(void* *)&a0[32] = v15;
            if (!v15)
            {
LABEL_af5454:
                sub_a368c8();
                sub_a369bc("crypto/x509/x509_vfy.c", 2607, "X509_STORE_CTX_init");
                goto LABEL_af547c;
            }
            if (a1)
                goto LABEL_af5444;
            *(unsigned int *)&v15[16] = (int)v15[16] | 0x11;
        }
        v16 = sub_af8b00("default");
        if (!v16)
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/x509_vfy.c", 2838, "X509_STORE_CTX_set_default");
            v0 = "default";
LABEL_af552c:
            sub_a36abc();
        }
        else if (sub_af8398((long long)a0[32], v16))
        {
            if (!*(int *)((long long)a0[32] + 36) && sub_aeb138(sub_aeb0e4(*(int *)((long long)a0[32] + 32))))
            {
                v17 = (void*)(unsigned int)sub_aeb174();
                *(unsigned int *)((long long)a0[32] + 36) = (unsigned int)v17;
            }
            if (sub_a6a660(5, a0, a0 + 224))
                return 1;
            sub_a368c8();
            sub_a369bc("crypto/x509/x509_vfy.c", 2635, "X509_STORE_CTX_init");
LABEL_af547c:
            goto LABEL_af552c;
        }
LABEL_af5530:
        if ((long long)a0[0x88])
            (long long)a0[0x88]();
        if ((long long)a0[32])
        {
            if (!(long long)a0[216])
                sub_af82fc();
            *(unsigned long long *)&a0[32] = 0;
        }
        sub_ade218((long long)a0[160]);
        *(unsigned long long *)&a0[160] = 0;
        sub_aded90((long long)a0[152]);
        *(unsigned long long *)&a0[152] = 0;
        sub_a6a9e8(5, a0, a0 + 224);
        *(unsigned long long *)&a0[224] = 0;
        *(unsigned long long *)&a0[232] = 0;
        return 0;
    }
}
