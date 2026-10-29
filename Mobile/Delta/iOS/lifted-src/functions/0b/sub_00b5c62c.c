/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5c62c..0xb5c6b4 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

unsigned long long sub_b5c62c(unsigned long a0, unsigned long long *a1, unsigned long a2, unsigned long long *a3, unsigned long long *a4)
{
    unsigned long long v2;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2 - *a1;
    if (*a4 < v2)
        v2 = *a4;
    _memcpy();
    *a3 = *a3 + v2;
    *a4 = *a4 - v2;
    *a1 = *a1 + v2;
    return *a4 & -a2;
}
