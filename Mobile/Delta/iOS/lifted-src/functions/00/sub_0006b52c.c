/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6b52c..0x6b578 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_cbeb98;

long long sub_6b52c(unsigned int *a0, unsigned int *a1, unsigned int a2)
{
    unsigned int v0;  // w9
    unsigned int v1;  // w2
    unsigned long v2;  // x8

    v0 = (&g_cbeb98)[a2];
    if (*a0)
        v1 = a2 & 63 | __ROL__(*a1, 6) & 0xffffffc0;
    else
        v1 = 0xff >> ((char)v0 & 31) & a2;
    *a1 = v1;
    v2 = (&g_cbeb98)[0x100 + 16 * *a0 + v0];
    *a0 = v2;
    return v2;
}
