/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x77abc..0x77bd4 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_77abc_0 {
    char field_0;
} st_77abc_0;


long long sub_77abc(unsigned long long *a0)
{
    unsigned long long v4;  // x2
    st_77abc_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_77abc_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *a0;
    if (v4 < 32)
        return sub_77bd4(a0[3] + 2870177450012600261 + v4, a0 + 5);
    return sub_77bd4(..., a0 + 5);
}
