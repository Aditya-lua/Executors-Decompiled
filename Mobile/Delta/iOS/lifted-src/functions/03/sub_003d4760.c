/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d4760..0x3d47e8 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d4760_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    int field_10;
    char padding_14[4];
    unsigned int field_18;
} st_3d4760_1;

typedef struct st_3d4760_0 {
    char field_0;
} st_3d4760_0;


st_3d4760_1 * sub_3d4760(st_3d4760_1 *a0)
{
    unsigned int v4;  // w8
    unsigned int v5;  // w9
    st_3d4760_1 *v6;  // x0
    unsigned int v7;  // w10
    st_3d4760_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d4760_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_18;
    v5 = a0->field_10;
    v6 = a0;
    while (!(v4 >> ((char)v5 & 31)))
    {
        v6 = sub_3cedc4(a0);
        v7 = a0->field_10;
        v4 = a0->field_18 | (unsigned int)v6 << ((char)v7 & 31);
        a0->field_18 = v4;
        v5 = v7 + 8;
        a0->field_10 = v5;
        if ((int)v7 >= 0x11)
            return v6;
    }
    a0->field_0 = a0->field_8;
    return v6;
}
