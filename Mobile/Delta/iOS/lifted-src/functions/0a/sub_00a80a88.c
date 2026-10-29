/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80a88..0xa80b50 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_7e6c7f;
extern char g_7fe001;
extern char g_800000;

long long sub_a80a88(unsigned int a0, unsigned int a1, unsigned int a2, unsigned int a3)
{
    unsigned int v0;  // w8
    int v1;  // w10
    unsigned int v10;  // w9
    unsigned long long v11;  // 4108
    unsigned long long v12;  // 4108
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v4;  // w10
    unsigned int v5;  // w9
    unsigned int v6;  // w8
    unsigned int v7;  // w14
    unsigned int v8;  // w8
    unsigned long v9;  // cc_dep1

    v0 = a3 - a1;
    v1 = (int)(v0 & (unsigned int)(0xff801ffe - v0)) >> 31;
    v2 = ~v1 & v0 | v1 & &(&g_7fe001)[v0];
    v3 = (v2 + a0 - &g_7fe001 & ~((long long)(v2 + a0 - &g_7fe001 & ~(v2 + a0)) >> 31) | v2 + a0 & (long long)(v2 + a0 - &g_7fe001 & ~(v2 + a0)) >> 31) + 127;
    v4 = v3 >> 7;
    if (&g_7e6c7f < v3)
        v5 = 0;
    else
        v5 = &(&g_800000)[11275 * v4] >> 24;
    v6 = v2 + 127;
    v7 = v6 >> 7;
    if (&g_7e6c7f < v6)
        v8 = 0;
    else
        v8 = &(&g_800000)[11275 * v7] >> 24;
    v9 = a2;
    if (a2 != 0x3ff00)
    {
        v10 = v5;
        v11 = arm64g_calculate_condition(19, v9, 0x3ff00, 0);
        if (!(v11 & 1))
            goto LABEL_a80b42;
LABEL_a80b41:
    }
    else
    {
        v10 = ((v4 * 1025 + 0x200000) * 0x400 | v4 * 1025 + 0x200000 >> 22) & 0xfffffc0f & 15;
        v12 = arm64g_calculate_condition(19, v9, 0x3ff00, 0);
        if (v12 & 1)
            goto LABEL_a80b41;
LABEL_a80b42:
        v8 = ((v7 * 1025 + 0x200000) * 0x400 | v7 * 1025 + 0x200000 >> 22) & 0xfffffc0f & 15;
    }
    return v10 != v8;
}
