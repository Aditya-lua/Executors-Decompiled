/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9c9b0..0xa9c9fc (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a9c9b0(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, unsigned int a7, unsigned long a8, long long a9)
{
    long long v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]

    v1 = &a8;
    *(unsigned int *)&v0 = a7;
    return sub_a9c5d4(0, a0, a1, a2, a3, a4, a5, a6, v0, a8, a9);
}
