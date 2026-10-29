/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe8df8..0xbe8f00 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e07c8d;
extern unsigned int g_e0881c;

unsigned int sub_be8df8(unsigned int a0)
{
    unsigned long long iter;  // x8
    unsigned long long v1;  // x9
    unsigned long long v10;  // x9
    unsigned long long v11;  // 4113
    unsigned long long v12;  // 4125
    unsigned long long v13;  // x10
    unsigned int v2;  // w12
    unsigned long long v3;  // x9
    unsigned long long v4;  // x9
    unsigned int v5;  // w9
    unsigned long long v6;  // x9
    unsigned long long v7;  // x11
    unsigned int *v8;  // x10
    unsigned long long v9;  // x8

    iter = 16;
    if (a0 < 69291)
        iter = 0;
    v1 = iter | 8;
    v2 = a0 * 0x800;
    if (v2 >= (&g_e0881c)[v1] * 0x800)
        iter = v1;
    v3 = iter | 4;
    if (v2 >= (&g_e0881c)[v3] * 0x800)
        iter = v3;
    v4 = iter | 2;
    if (v2 >= (&g_e0881c)[v4] * 0x800)
        iter = v4;
    if (v2 >= (&g_e0881c)[1 + iter] * 0x800)
        iter += 1;
    if (v2 >= (&g_e0881c)[1 + iter] * 0x800)
        iter += 1;
    v5 = (&g_e0881c)[iter] * 0x800;
    v6 = v5 == v2;
    if (v2 > v5)
        v6 += 1;
    v7 = v6 + iter;
    v8 = &(&g_e0881c)[v7];
    v9 = *v8 >> 21;
    if (31 >= v7)
    {
        v10 = v8[1] >> 21;
        if (v7)
            goto LABEL_be8eb4;
        v11 = arm64g_calculate_condition(18, v10, ~v9, 0);
        if (v11 & 1)
            goto LABEL_be8ec8;
    }
    else
    {
        v10 = 0x2ff;
LABEL_be8eb4:
        v7 = *(int *)((char *)v8 - 4) & 0x1fffff;
        v12 = arm64g_calculate_condition(2, v10, ~v9, 0);
        if (!(v12 & 1))
        {
LABEL_be8ec8:
            v13 = 0;
            do
            {
                v13 += (&g_e07c8d)[v9];
            } while ((unsigned int)(a0 - v7) >= (unsigned int)v13 && (v9 += 1, v10 - 1 != v9));
        }
    }
    return (unsigned int)v9 & 1;
}
