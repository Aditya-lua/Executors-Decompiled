/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2e420..0x2e504 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2e420_1 {
    struct st_2e420_2 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
} st_2e420_1;

typedef struct st_2e420_2 {
    unsigned int field_0;
} st_2e420_2;

typedef struct st_2e420_3 {
    unsigned int field_0;
    unsigned short field_4;
} st_2e420_3;

typedef struct st_2e420_0 {
    char field_0;
} st_2e420_0;


long long sub_2e420(st_2e420_1 *a0)
{
    unsigned int *v6;  // x8
    unsigned long long v7;  // x9
    unsigned long long v8;  // x20
    unsigned long long v9;  // x21
    st_2e420_3 *v10;  // x0
    st_2e420_3 *v11;  // x10
    st_2e420_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_2e420_0 *v1;  // [bp-0x58]
    unsigned int *v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    sub_30acc();
    v6 = a0->field_0;
    v7 = a0->field_8;
    if (v7)
    {
        v8 = 0;
        v9 = 0;
        do
        {
            if (*(int *)((char *)v6 + v8) != a0->field_18)
            {
                v10 = sub_2d634(&v2, (char *)v6 + v8);
                v6 = a0->field_0;
                v7 = a0->field_8;
                v11 = (char *)v6 + v8;
                v10->field_0 = v11->field_0;
                v10->field_4 = v11->field_4;
            }
        } while ((v9 += 1, v8 += 8, v7 > v9));
        v6 = a0->field_0;
    }
    a0->field_0 = v2;
    a0->field_8 = v3;
    v2 = v6;
    v3 = v7;
    return sub_a070(&v2);
}
