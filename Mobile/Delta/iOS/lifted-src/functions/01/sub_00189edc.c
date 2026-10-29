/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x189edc..0x189f7c (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_189edc_2 {
    char padding_0[8];
    long long field_8;
} st_189edc_2;

typedef struct st_189edc_0 {
    char padding_0[8];
    struct st_189edc_1 *field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned int field_1c;
} st_189edc_0;

typedef struct st_189edc_1 {
    unsigned int field_0;
} st_189edc_1;

typedef struct st_189edc_4 {
    char field_0;
} st_189edc_4;

typedef struct st_189edc_3 {
    struct st_189edc_2 *field_0;
    unsigned int field_8;
} st_189edc_3;


st_189edc_0 * sub_189edc(st_189edc_0 *a0, st_189edc_2 *a1)
{
    unsigned int v4;  // w20
    unsigned int *v5;  // x21
    unsigned long long v6;  // x22
    unsigned int v7;  // w23
    char v8;  // x24
    unsigned long long v9;  // 4121
    st_189edc_3 *v10;  // x25
    st_189edc_4 **v0;  // [bp-0x60], Other Possible Types: char
    st_189edc_4 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = 0;
    v1 = &v0;
    v0 = &v1;
    v5 = a0->field_8;
    v6 = a0->field_10;
    v7 = a0->field_18;
    v8 = a0->field_1c;
    do
    {
        v9 = arm64g_calculate_condition(1, v5[v4], 1, 0);
        if (!(v9 & 1))
        {
            v10 = v6 + (v5[v4] & v7) * 16;
            if (!v10->field_8)
            {
                a0 = sub_20b98(v10->field_0->field_8, a1->field_8);
                if ((unsigned int)a0)
                    v10->field_0 = a1;
            }
        }
    } while ((v4 += 1, !(v4 >> (v8 & 31))));
    return a0;
}
