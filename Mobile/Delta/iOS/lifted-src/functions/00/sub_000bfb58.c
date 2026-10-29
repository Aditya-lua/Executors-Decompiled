/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfb58..0xbfccc (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfb58_0 {
    char field_0;
} st_bfb58_0;

extern unsigned long long g_e6ca10;

unsigned long long sub_bfb58(unsigned long long a0, long long a1, long long a2, unsigned long a3, unsigned long long a4, unsigned long long a5, unsigned long a6, unsigned long a7)
{
    unsigned long v5;  // x22
    unsigned long long v6;  // w28
    unsigned long long v15;  // x0
    unsigned long long v7;  // x9
    unsigned long long v8;  // x26
    unsigned long long v9;  // x8
    unsigned int *v10;  // x23
    unsigned int *v11;  // x24
    unsigned long long i;  // x25
    unsigned long long v13;  // x25
    unsigned int *v14;  // x24
    st_bfb58_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_bfb58_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]
    unsigned short v4;  // [bp+0x4]

    v2 = &v3;
    v5 = v4;
    v1 = &v0;
    v0 = &v1;
    if ((int)a4 >= 2)
    {
        v6 = (int)(a1 - a2) & 31;
        sub_c448c(v5, a2, 0, 1);
        v7 = 8;
        if (v6 == 1)
            v7 = 16;
        if (v6 == 2)
            v7 = 64;
        goto *((void *)(*(long long *)((char *)&g_e6ca10 + v7)));
    }
    else if (a5 > (int)a4)
    {
        v8 = v3 + a2 - a4;
        v9 = (long long)(a4 * 0x100000000) >> 63 & 0xfffffffc00000000 | __ROL__(a4, 2) & 0x3fffffffc & 0x3ffffffff;
        v10 = v9 + a7 + 4;
        v11 = a3 + v9;
        i = a5 - (int)a4;
        do
        {
            v13 = i;
            v14 = v11 + 1;
            v15 = sub_bfccc(a0 + *v11 * 4, a6 + *(int *)((char *)v10 - 4), a6 + *v10, v8, a1, v5, 2);
            v10 += 1;
            v8 = (unsigned int)v8 - 1;
            i = v13 - 1;
            v11 = v14;
        } while (i);
        return v15;
    }
    else
    {
        return a0;
    }
}
