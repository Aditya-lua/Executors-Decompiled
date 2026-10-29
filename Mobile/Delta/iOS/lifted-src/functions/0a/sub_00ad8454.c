/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad8454..0xad85d0 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_ad8428;
extern long long g_ad8608;
extern long long g_ad8610;
extern long long g_f092c8;
extern long long g_f12fb0;
extern long long g_f12fb8;
extern long long g_f12fc0;

long long sub_ad8454(unsigned long a0)
{
    long long v9;  // x0
    long long v10;  // x1
    long long v11;  // x2
    long long v12;  // x0
    unsigned long v0;  // [bp-0x110]
    unsigned long v1;  // [bp-0x108]
    long long v2;  // [bp-0xf8]
    long long v3;  // [bp-0xd0]
    long long v4;  // [bp-0xc8]
    long long v5;  // [bp-0xb8]
    long long v6;  // [bp-0xb0]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = a0;
    v2 = 0;
    v3 = 0;
    v4 = 0;
    v5 = 0;
    v6 = 0;
    if (!sub_a7c208(&g_f092c8, &g_ad8428) || !(int)g_f12fb0)
    {
        sub_a368c8();
        sub_a369bc("crypto/store/store_register.c", 226, "ossl_store_get0_loader_int");
        sub_a36abc(44, 0x8000f, 0);
    }
    else if (sub_a7c198(g_f12fb8))
    {
        v9 = g_f12fc0;
        if (!g_f12fc0)
        {
            v9 = sub_a66520(sub_a66530(&g_ad8608, &g_ad8610), " ", "@", " ", "@");
            g_f12fc0 = v9;
            if (v9)
                goto LABEL_ad84fc;
            sub_a368c8();
            sub_a369bc("crypto/store/store_register.c", 233, "ossl_store_get0_loader_int");
            v10 = 786691;
            v11 = 0;
        }
        else
        {
LABEL_ad84fc:
            v12 = sub_a66b6c(v9, &v1);
            if (v12)
            {
                sub_a7c1b4(g_f12fb8);
                return v12;
            }
            sub_a368c8();
            sub_a369bc("crypto/store/store_register.c", 237, "ossl_store_get0_loader_int");
            v0 = a0;
            v11 = "scheme=%s";
            v10 = 105;
        }
        sub_a36abc(44, v10, v11);
        sub_a7c1b4(g_f12fb8);
        return 0;
    }
    return 0;
}
