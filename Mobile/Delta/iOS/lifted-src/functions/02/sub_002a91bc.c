/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a91bc..0x2a9218 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e7c9e8;

long long sub_2a91bc(char *a0)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x8

    v0 = *a0;
    v1 = 24;
    if (v0 == 2)
        v1 = 0;
    v2 = 8;
    if (v0 == 1)
        v1 = v2;
    goto *((void *)(*(long long *)((char *)&g_e7c9e8 + v1)));
}
