/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a9b4..0x3aa00 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a9b4_0 {
    char field_0;
} st_3a9b4_0;

typedef struct st_3a9b4_1 {
    char padding_0[8];
    unsigned int field_8;
} st_3a9b4_1;


st_3a9b4_1 * sub_3a9b4(long long a0, unsigned long a1)
{
    st_3a9b4_1 *v5;  // x0
    st_3a9b4_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_3a9b4_0 *v1;  // [bp-0x20]
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
    return 2 > v5->field_8 - 5;
}
