/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa084a0..0xa084f8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a084a0(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    unsigned long long v3;  // 4122
    unsigned long long v0;  // [bp-0x20]
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp+0x0]

    v1 = &v2;
    v0 = v2;
    v3 = arm64g_calculate_condition(0x11, sub_a08254() & 0xffffffff, 1, 0);
    return !(v3 & 1);
}
