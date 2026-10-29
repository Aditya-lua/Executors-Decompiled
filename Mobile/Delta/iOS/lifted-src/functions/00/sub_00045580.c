/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x45580..0x455c8 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_45580_0 {
    char field_0;
} st_45580_0;

typedef struct st_45580_1 {
    char padding_0[8];
    unsigned int field_8;
} st_45580_1;


st_45580_1 * sub_45580(long long a0, unsigned long a1)
{
    st_45580_1 *v5;  // x0
    st_45580_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_45580_0 *v1;  // [bp-0x20]
    unsigned long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = a1;
    v5 = sub_3a7e0(a0 + 264, &v2);
    if (!v5)
        return v5;
    return v5->field_8 == 4;
}
