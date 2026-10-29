/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15a520..0x15a56c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_15a520_0 {
    char field_0;
} st_15a520_0;


long long sub_15a520(unsigned long long *a0)
{
    unsigned long long v4;  // x0
    st_15a520_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_15a520_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_1599a4();
    return a0[1] + v4 * 8 != a0[2];
}
