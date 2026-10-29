/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d37fc..0x3d386c (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d37fc_1 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[4];
    unsigned int field_18;
} st_3d37fc_1;

typedef struct st_3d37fc_0 {
    char field_0;
} st_3d37fc_0;


unsigned int sub_3d37fc(st_3d37fc_1 *a0, unsigned int a1)
{
    unsigned int v4;  // w8
    unsigned int v5;  // w9
    st_3d37fc_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d37fc_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_10;
    if ((int)a1 > (int)a0->field_10)
    {
        sub_3d4760(a0);
        v4 = a0->field_10;
    }
    v5 = a0->field_18;
    a0->field_18 = v5 >> ((char)a1 & 31);
    a0->field_10 = v4 - a1;
    return v5 & ~(0xffffffff << ((char)a1 & 31));
}
