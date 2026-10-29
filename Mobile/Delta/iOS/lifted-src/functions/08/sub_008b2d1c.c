/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b2d1c..0x8b2d7c (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b2d1c_0 {
    char field_0;
} st_8b2d1c_0;


long long sub_8b2d1c(unsigned long long *a0)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    st_8b2d1c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_8b2d1c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0[5];
    v3 = v2 + (a0[4] | ~v2) + (a0[4] | v2) + 1;
    if (a0[2] == a0[1])
        return a0[1] + (v3 >> 9) * 8;
    return a0[1] + (v3 >> 9) * 8;
}
