/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5ae1c..0xb5ae74 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_dfe752;

unsigned long long sub_b5ae1c(long long a0, long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c68640();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_c68354(a0, 0xffffffff, &g_dfe752, 5);
    if (!(unsigned int)v3)
        return v3;
    return sub_a69b58(a0, a1) != 0;
}
