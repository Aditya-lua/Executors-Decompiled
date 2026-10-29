/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7e688..0xa7e86c (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7e688_0 {
    unsigned short field_0;
    char field_2;
} st_a7e688_0;

extern char g_700000;
extern char g_7e0000;
extern char g_7fe003;

unsigned long long sub_a7e688(unsigned long a0, long long a1)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x9
    unsigned int v14;  // w0
    unsigned int v15;  // w16
    unsigned int v16;  // w17
    unsigned int v17;  // w15
    unsigned int v18;  // w1
    unsigned int v19;  // w2
    unsigned long long v6;  // x9
    unsigned int *v7;  // x15
    unsigned int v8;  // w16
    unsigned int v9;  // w17
    unsigned int v10;  // w1
    unsigned int v11;  // w17
    unsigned int v12;  // w0
    unsigned int v13;  // w17
    st_a7e688_0 *v0;  // [bp-0x28], Other Possible Types: char
    st_a7e688_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a6e830(a1, 96, &v0);
    if (!(unsigned int)v4)
        return v4;
    v5 = 0;
    do
    {
        v6 = v5;
        v7 = a0 + 16 + v6;
        v8 = *(int *)((char *)v7 - 16);
        v9 = *(int *)((char *)v7 - 12);
        v10 = 2 - v9;
        v11 = *(int *)((char *)v7 - 8);
        v12 = *(int *)((char *)v7 - 4);
        v13 = *v7;
        v14 = v7[1];
        v15 = ~((int)((unsigned int)(2 - v8) & v8 + 0xff801ffc) >> 31) & (unsigned int)(2 - v8) | (int)((unsigned int)(2 - v8) & v8 + 0xff801ffc) >> 31 & (unsigned int)&(&g_7fe003)[-1 * v8] | (~((int)(v10 & v9 + 0xff801ffc) >> 31) & (unsigned int)(2 - v9) | (int)((unsigned int)(2 - v9) & v9 + 0xff801ffc) >> 31 & (unsigned int)&(&g_7fe003)[-1 * v9]) * 8 | (~((int)((unsigned int)(2 - v11) & v11 + 0xff801ffc) >> 31) & (unsigned int)(2 - v11) | (int)((unsigned int)(2 - v11) & v11 + 0xff801ffc) >> 31 & (unsigned int)&(&g_7fe003)[-1 * v11]) * 64 | (~((int)((unsigned int)(2 - v12) & v12 + 0xff801ffc) >> 31) & (unsigned int)(2 - v12) | (int)((unsigned int)(2 - v12) & v12 + 0xff801ffc) >> 31 & (unsigned int)&(&g_7fe003)[-1 * v12]) * 0x200 | (~((int)((unsigned int)(2 - v13) & v13 + 0xff801ffc) >> 31) & (unsigned int)(2 - v13) | (int)((unsigned int)(2 - v13) & v13 + 0xff801ffc) >> 31 & &(&g_7fe003)[-1 * v13] - &g_700000) * 0x1000 | (~((int)((unsigned int)(2 - v14) & v14 + 0xff801ffc) >> 31) & (unsigned int)(2 - v14) | (int)((unsigned int)(2 - v14) & v14 + 0xff801ffc) >> 31 & &(&g_7fe003)[-1 * v14] - &g_7e0000) * 0x8000;
        v16 = v7[2];
        v17 = v7[3];
        v18 = 2 - v16;
        v19 = 2 - v17;
        v0->field_0 = v15;
    } while ((v1 = v0 + 1, v0->field_2 = ((~((int)(v18 & v16 + 0xff801ffc) >> 31) & (unsigned int)(2 - v16) | (int)(v18 & v16 + 0xff801ffc) >> 31 & (unsigned int)(8195 - v16)) * 0x40000 | (~((int)(v19 & v17 + 0xff801ffc) >> 31) & (unsigned int)(2 - v17) | (int)(v19 & v17 + 0xff801ffc) >> 31 & (unsigned int)(3 - v17)) * 0x200000 | v15) >> 16, v5 = v6 + 32, v0 = v1, v6 < 992));
    return 1;
}
