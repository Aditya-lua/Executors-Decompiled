/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3527c..0xc35614 (920 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e06c6c;

unsigned long long * sub_c3527c(unsigned long long *a0)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // 4122
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (10 >= *a0)
    {
        goto *((void *)(sub_c352b8 + (&g_e06c6c)[*a0] * 4));
    }
    else
    {
        v2 = 2;
        v3 = arm64g_calculate_condition(0x44, a0[1], 0, 0);
        if (v3 & 1)
            v2 = a0[1] ^ 0x8000000000000000;
        if (!v2)
            return a0 + 1;
    }
}
