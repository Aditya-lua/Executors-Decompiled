/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc854..0xc8c4 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c854_0 {
    char field_0;
} st_c854_0;


unsigned long long sub_c854(unsigned long a0, unsigned long a1, char a2, unsigned long a3)
{
    unsigned long long v5;  // x0
    st_c854_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_c854_0 *v1;  // [bp-0x30]
    char v2;  // [bp-0x21]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = a2;
    if (a1 <= a3)
        return 0xffffffffffffffff;
    v5 = sub_ca18(a0 + a3);
    if (v5)
        return v5 - a0;
    return 0xffffffffffffffff;
}
