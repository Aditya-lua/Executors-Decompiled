/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x553e0..0x55498 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_553e0_1 {
    char padding_0[8];
    long long field_8;
} st_553e0_1;

typedef struct st_553e0_4 {
    char padding_0[16];
    long long field_10;
} st_553e0_4;

typedef struct st_553e0_3 {
    char padding_0[32];
    struct st_553e0_2 *field_20;
} st_553e0_3;

typedef struct st_553e0_2 {
    char padding_0[56];
    struct st_553e0_1 *field_38;
} st_553e0_2;

typedef struct st_553e0_0 {
    char field_0;
} st_553e0_0;


st_553e0_1 * sub_553e0(st_553e0_4 *a0, st_553e0_3 *a1)
{
    unsigned int v5;  // w0
    st_553e0_1 *v6;  // x0
    st_553e0_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_553e0_0 *v1;  // [bp-0x30]
    st_553e0_2 *v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = a1->field_20;
    if (a1->field_20->field_38)
    {
        v5 = sub_531a4(a0);
        if (v5 == 15)
            return 0;
    }
    else
    {
        v6 = sub_158b8(&a0[6].padding_0[8], &v2);
        if (!v6)
            return 0;
        v5 = sub_531a4(a0, a1, v6->field_8);
    }
    sub_53fd4(a0->field_10, &v2);
    *(unsigned int *)(sub_12484(a0->field_10, &v2) + 8) = v5;
    return 0;
}
