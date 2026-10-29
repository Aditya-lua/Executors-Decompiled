/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f5fa0..0x9f5fb8 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9f5fa0(unsigned long a0, unsigned long a1, unsigned long long *a2, unsigned long long *a3)
{
    unsigned long long *v0;  // x8

    v0 = a0 + a1 * 16;
    *a2 = *v0;
    *a3 = v0[1];
    return a0;
}
