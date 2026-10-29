/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e5c4..0x1e64c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e5c4_2 {
    unsigned long long field_0;
    char field_4;
    char padding_5[3];
    unsigned int field_8;
} st_1e5c4_2;

typedef struct st_1e5c4_1 {
    char padding_0[128];
    unsigned int field_80;
    unsigned int field_84;
    unsigned int field_88;
    char padding_8c[172];
    unsigned long long field_138;
    char field_13c;
    char padding_13d[3];
    unsigned int field_140;
} st_1e5c4_1;

typedef struct st_1e5c4_0 {
    char field_0;
} st_1e5c4_0;


int sub_1e5c4(st_1e5c4_1 *a0, unsigned int a1, st_1e5c4_2 *a2)
{
    unsigned long long v4;  // x8
    st_1e5c4_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1e5c4_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_80 != a1)
        return sub_f590();
    if (a0->field_84 != *(int *)((char *)&a2->field_0 + 4) && a0->field_88 != *(int *)&a2->field_4 && (unsigned int)*(int *)((char *)&a2->field_0 + 4) > (unsigned int)*(int *)((char *)&a0->field_138 + 4))
    {
        v4 = a2->field_0;
        *(int *)&a0->field_13c = *(int *)&a2->field_4;
        a0->field_138 = v4;
    }
    sub_f8d0();
    return 1;
}
