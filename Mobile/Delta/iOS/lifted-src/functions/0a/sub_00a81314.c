/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa81314..0xa8137c (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_7fe004;

int sub_a81314(unsigned int a0, unsigned int *a1)
{
    unsigned int v0;  // w8

    if (15 <= a0)
        return 0;
    v0 = a0 - (13109 * a0 >> 16) * 5;
    *a1 = ~((long long)((unsigned int)(2 - v0) & v0 - &g_7fe004) >> 31) & (unsigned int)(2 - v0) | (long long)((unsigned int)(2 - v0) & v0 - &g_7fe004) >> 31 & (unsigned int)(char *)(-1 * v0 + 0x7fe003);
    return 1;
}
