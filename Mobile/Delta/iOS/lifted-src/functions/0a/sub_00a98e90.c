/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa98e90..0xa9908c (508 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a98de0;
extern long long g_f09020;
extern char g_f12ef8;
extern long long g_f12f00;
extern long long g_f12f10;

unsigned long long sub_a98e90(unsigned long long a0, unsigned long long a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v14;  // x0
    unsigned long long idx;  // x0
    unsigned int v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x40], Other Possible Types: unsigned long
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0)
        return a0;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v14 = 0;
    if (sub_a7c208(&g_f09020, &g_a98de0) && *(int *)&g_f12ef8)
    {
        if (sub_a7c17c(g_f12f00))
        {
            v1 = a0;
            v0 = (unsigned int)a1 & 0xffff7fff;
            idx = sub_a66b6c(g_f12f10, &v0);
            if (...)
                v14 = 0;
            else
                v14 = *(long long *)(idx + 16);
            sub_a7c1b4(g_f12f00);
        }
        else
        {
            v14 = 0;
        }
    }
    return v14;
}
