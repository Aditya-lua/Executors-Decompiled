/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3da924..0x3da974 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_3da924(unsigned long a0, unsigned long long *a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v2;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1[1] - a1[2];
    if (v2 < a3)
        a3 = v2;
    _memcpy();
    a1[2] = a1[2] + a3;
    return a3;
}
