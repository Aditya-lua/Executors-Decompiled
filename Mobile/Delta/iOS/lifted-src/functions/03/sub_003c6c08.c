/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c6c08..0x3c6c58 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c6c08_0 {
    char field_0;
} st_3c6c08_0;


long long sub_3c6c08(unsigned long long *a0)
{
    unsigned long long v2;  // x8
    st_3c6c08_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_3c6c08_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0[4] + a0[5];
    if (a0[2] == a0[1])
        return a0[1] + (v2 >> 9) * 8;
    return a0[1] + (v2 >> 9) * 8;
}
