/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f76f0..0x1f7778 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f76f0_0 {
    char field_0;
} st_1f76f0_0;


unsigned long long * sub_1f76f0(unsigned long long *a0, unsigned long long *a1, unsigned long a2, unsigned long a3)
{
    st_1f76f0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1f76f0_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a3)
        return a0;
    sub_1ec7e8(a0, a0[1] + a3);
    _memmove(*a0 + 40 * a0[1], *a1 + 40 * a2, a3 * 40);
    return a0;
}
