/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15a4d0..0x15a520 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_15a4d0_0 {
    char field_0;
} st_15a4d0_0;


long long sub_15a4d0(unsigned long long *a0)
{
    unsigned long long v2;  // x8
    st_15a4d0_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_15a4d0_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0[4] + a0[5];
    if (a0[2] == a0[1])
        return a0[1] + (v2 >> 6) * 8;
    return a0[1] + (v2 >> 6) * 8;
}
