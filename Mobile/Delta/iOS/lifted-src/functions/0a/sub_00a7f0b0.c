/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7f0b0..0xa7f1e4 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7f0b0_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned short field_8;
} st_a7f0b0_0;

extern char g_87e001;

unsigned long long sub_a7f0b0(unsigned long a0, long long a1)
{
    unsigned long long v3;  // x22
    unsigned long long v4;  // x22
    unsigned long long v5;  // x0
    unsigned int *v6;  // x8
    unsigned int v7;  // w9
    unsigned int v8;  // w10
    unsigned int v9;  // w10
    unsigned int v10;  // w11
    unsigned int v11;  // w8
    unsigned int v12;  // w8
    st_a7f0b0_0 *idx;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = 0;
    while (1)
    {
        v4 = v3;
        v5 = sub_a6e830(a1, 10, &idx);
        if (!(unsigned int)v5)
            return v5;
        v6 = a0 + v4;
        v7 = *v6;
        v8 = v6[1];
        v9 = ~((int)((unsigned int)(0x80000 - v8) & v8 + 0xff781ffe) >> 31) & (unsigned int)(0x80000 - v8) | (int)((unsigned int)(0x80000 - v8) & v8 + 0xff781ffe) >> 31 & (unsigned int)&(&g_87e001)[-1 * v8];
        v10 = v6[2];
        v11 = v6[3];
        v3 = v4 + 16;
        v12 = ~((int)((unsigned int)(0x80000 - v11) & v11 + 0xff781ffe) >> 31) & (unsigned int)(0x80000 - v11) | (int)((unsigned int)(0x80000 - v11) & v11 + 0xff781ffe) >> 31 & (unsigned int)&(&g_87e001)[-1 * v11];
        idx->field_0 = ~((int)((unsigned int)(0x80000 - v7) & v7 + 0xff781ffe) >> 31) & (unsigned int)(0x80000 - v7) | (int)((unsigned int)(0x80000 - v7) & v7 + 0xff781ffe) >> 31 & (unsigned int)&(&g_87e001)[-1 * v7] | v9 * 0x100000;
        idx->field_4 = (~((int)((unsigned int)(0x80000 - v10) & v10 + 0xff781ffe) >> 31) & (unsigned int)(0x80000 - v10) | (int)((unsigned int)(0x80000 - v10) & v10 + 0xff781ffe) >> 31 & (unsigned int)&(&g_87e001)[-1 * v10]) * 0x100 | v9 >> 12 | v12 * 0x10000000;
        idx->field_8 = v12 >> 4;
        if (v4 >= 1008)
            return 1;
    }
}
