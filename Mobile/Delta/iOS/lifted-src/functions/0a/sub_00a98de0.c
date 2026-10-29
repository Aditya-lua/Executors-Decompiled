/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa98de0..0xa98e90 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a9940c;
extern long long g_a9946c;
extern unsigned int g_f12ef8;
extern unsigned long long g_f12f00;
extern unsigned long long g_f12f10;

long long sub_a98de0(void)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long v8;  // x0
    unsigned int v9;  // w8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    g_f12f10 = 0;
    v8 = sub_a7c11c();
    g_f12f00 = v8;
    if (v8)
    {
        g_f12f10 = sub_a66520(sub_a66530(&g_a9940c, &g_a9946c), " ", "@", " ", "@");
        v8 = g_f12f00;
        if (!g_f12f10)
            goto LABEL_a98e5c;
LABEL_a98e4c:
        v9 = 1;
    }
    else
    {
        if (g_f12f10)
            goto LABEL_a98e4c;
LABEL_a98e5c:
        sub_a7c1d0();
        v8 = 0;
        g_f12f00 = 0;
        v9 = g_f12f10 != 0;
    }
    if (!v8)
        v9 = 0;
    g_f12ef8 = v9;
    return v8;
}
