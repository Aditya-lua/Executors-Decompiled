/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x30d24..0x30d84 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_30d24_0 {
    char field_0;
} st_30d24_0;


int sub_30d24(unsigned long long *a0)
{
    st_30d24_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_30d24_0 *v1;  // [bp-0x30]
    unsigned int v2;  // [bp-0x24]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = a0[7] - a0[6] >> 2;
    sub_a390(a0 + 27, &v2);
    return (unsigned int)(a0[28] - a0[27] >> 2) - 1;
}
