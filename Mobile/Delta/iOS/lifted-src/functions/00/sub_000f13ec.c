/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf13ec..0xf1438 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f13ec_0 {
    char field_0;
} st_f13ec_0;


long long sub_f13ec(unsigned long long *a0)
{
    unsigned long long v4;  // x0
    st_f13ec_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_f13ec_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_f0b0c();
    return a0[1] + v4 * 16 != a0[2];
}
