/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5ed84..0xb5ee0c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b5ed84(unsigned long long *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long long a6, unsigned long long a7)
{
    unsigned long long v4;  // x8
    unsigned long long v5;  // x9
    unsigned long long v6;  // x30
    unsigned long v7;  // x10
    unsigned long long v0;  // [bp-0x20]
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]
    char v3;  // [bp+0x0]

    v4 = a6 + 1;
    v5 = *a0;
    if (v4 <= v5)
    {
        v1 = &v3;
        v2 = v6;
        v7 = *(char *)(a2 + v5 - 1);
        *a0 = v5 - (~(unsigned int)((long long)((v5 - (v4 + v7) ^ v4 + v7 | v4 + v7 ^ v5) ^ v5 | a5 - (v7 + 1) & ~a5) >> 63) & v7 + 1);
        v0 = a7;
        return sub_c6b6ec();
    }
    return 0;
}
