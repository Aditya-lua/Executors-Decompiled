/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x959de0..0x959e00 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_959de0(unsigned long long *a0, unsigned long long *a1, unsigned int a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9

    v0 = 112;
    v1 = 120;
    if (!a2)
        v0 = v1;
    *a1 = *(long long *)((char *)a0 + v0);
    return 1;
}
