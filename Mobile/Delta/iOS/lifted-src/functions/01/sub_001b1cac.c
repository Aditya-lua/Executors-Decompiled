/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b1cac..0x1b1d1c (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b1cac_0 {
    char field_0;
} st_1b1cac_0;


long long sub_1b1cac(unsigned long long *a0)
{
    unsigned long v2;  // x9
    st_1b1cac_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1b1cac_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = (a0[4] + a0[5] >> 1) / 21;
    if (a0[2] == a0[1])
        return a0[1] + v2 * 8;
    return a0[1] + v2 * 8;
}
