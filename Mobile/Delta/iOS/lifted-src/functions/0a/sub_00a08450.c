/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa08450..0xa084a0 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a08450(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long long a7, char a8, unsigned long long a9)
{
    unsigned long long v3;  // 4122
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]

    v2 = &a8;
    v0 = a7;
    v1 = a9;
    v3 = arm64g_calculate_condition(0x11, sub_a07e44() & 0xffffffff, 1, 0);
    return !(v3 & 1);
}
