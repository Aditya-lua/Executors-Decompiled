/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d3a4..0x3d43c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d3a4_1 {
    char padding_0[152];
    unsigned long long field_98;
} st_3d3a4_1;

typedef struct st_3d3a4_5 {
    char padding_0[8];
    unsigned long long field_8;
} st_3d3a4_5;

typedef struct st_3d3a4_3 {
    char padding_0[8];
    char field_8;
    char padding_9[7];
    struct st_3d3a4_4 *field_10;
    struct st_3d3a4_4 *field_18;
} st_3d3a4_3;

typedef struct st_3d3a4_2 {
    char padding_0[32];
    unsigned long long field_20;
} st_3d3a4_2;

typedef struct st_3d3a4_4 {
    struct st_3d3a4_2 *field_0;
} st_3d3a4_4;

typedef struct st_3d3a4_0 {
    char field_0;
} st_3d3a4_0;


st_3d3a4_3 * sub_3d3a4(st_3d3a4_5 *a0, st_3d3a4_1 *a1)
{
    st_3d3a4_3 *v5;  // x0
    st_3d3a4_3 *v6;  // x8
    st_3d3a4_2 **i;  // x20
    st_3d3a4_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_3d3a4_0 *v1;  // [bp-0x40]
    st_3d3a4_1 *v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    v5 = sub_3b040(a0->field_8 + 104, &v2);
    v6 = &v5->field_8;
    if (!v5)
        v6 = 0;
    for (i = *(long long *)&v6->field_8; i != v6->field_10; i += 1)
    {
        if (*i->field_20 == v2->field_98 - 1)
            sub_394b8(a0);
    }
    return 0;
}
