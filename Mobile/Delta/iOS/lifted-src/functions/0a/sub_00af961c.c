/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf961c..0xaf9978 (860 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;
extern char g_dfdcdc;
extern char g_10002b0;

unsigned int sub_af961c(unsigned long a0, unsigned long a1, unsigned int *a2, unsigned long long a3)
{
    unsigned long v6;  // x8
    unsigned int v7;  // w0
    unsigned long long v0;  // [bp-0xb0]
    unsigned long long v1;  // [bp-0xa8]
    unsigned long v2;  // [bp-0xa0]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v6 = *a2;
    if (26 >= (unsigned int)v6 - 1)
    {
        goto *((void *)(sub_af966c + *(&(&g_dfdcdc)[v6] - 1) * 4));
    }
    else
    {
        v2 = v6;
        v0 = a3;
        v1 = &g_c7c2eb;
        v7 = sub_9d524c();
        if (*(long long *)&g_10002b0 == v3)
            return ~v7 >> 31;
        ___stack_chk_fail();
    }
}
