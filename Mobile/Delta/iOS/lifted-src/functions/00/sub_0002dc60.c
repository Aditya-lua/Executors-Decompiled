/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2dc60..0x2dcf4 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2dc60_1 {
    char padding_0[16];
    unsigned int field_10;
} st_2dc60_1;

typedef struct st_2dc60_0 {
    char padding_0[776];
    char field_308;
    char padding_309[15];
    unsigned int field_318;
    char padding_31c[28];
    char field_338;
    char padding_339[103];
    char field_3a0;
} st_2dc60_0;

typedef struct st_2dc60_2 {
    char field_0;
} st_2dc60_2;


long long sub_2dc60(st_2dc60_0 *a0, unsigned long a1, unsigned long long a2)
{
    st_2dc60_1 *v6;  // x0
    unsigned long v7;  // x8
    unsigned long v8;  // x8
    st_2dc60_2 **v0;  // [bp-0x40], Other Possible Types: char
    st_2dc60_2 *v1;  // [bp-0x38]
    unsigned long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    v3 = a2;
    sub_2ce6c(&a0->field_308, &v2);
    v6 = sub_2eac0(&a0->field_308, &v2);
    v7 = v6->field_10;
    if ((unsigned int)v7)
        return v7;
    v8 = a0->field_318;
    v6->field_10 = v8;
    if (a0->field_3a0 & 1)
    {
        sub_15cac(&a0->field_338, &v2);
        return v6->field_10;
    }
    return v8;
}
