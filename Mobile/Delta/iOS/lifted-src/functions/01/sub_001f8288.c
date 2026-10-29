/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f8288..0x1f83bc (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f8288_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    char field_18;
    char padding_19[7];
    unsigned long long field_20;
} st_1f8288_1;

typedef struct st_1f8288_0 {
    char field_0;
} st_1f8288_0;


st_1f8288_1 * sub_1f8288(st_1f8288_1 *a0)
{
    st_1f8288_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1f8288_0 *v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned int v5;  // [bp-0x28]
    unsigned int v6;  // [bp-0x24]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_20)
    {
        v2 = 0;
        v3 = 0;
        v4 = 0;
        sub_1ebdf8(&v2, "A", 684);
        sub_1ebdf8(&v2, "$", 2);
        v5 = a0->field_8;
        v6 = v3;
        sub_1fd094(&a0->field_18, &v5);
        sub_1eebe8(a0, &v2);
        v3 = 0;
        sub_1ebdf8(&v2, "0", 799);
        sub_1ebdf8(&v2, "$", 3);
        v5 = a0->field_8;
        v6 = v3;
        sub_1fd094(&a0->field_18, &v5);
        sub_1eebe8(a0, &v2);
        return sub_1eccac(&v2);
    }
    return a0;
}
