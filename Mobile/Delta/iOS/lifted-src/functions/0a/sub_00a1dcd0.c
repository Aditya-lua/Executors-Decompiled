/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1dcd0..0xa1dd9c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1dcd0_1 {
    char padding_0[152];
    struct st_a1dcd0_0 *field_98;
} st_a1dcd0_1;

typedef struct st_a1dcd0_2 {
    struct st_a1dcd0_0 *field_0;
    unsigned long long field_8;
    struct st_a1dcd0_0 *field_10;
    char padding_18[1];
    char field_19;
    char padding_1a[6];
    unsigned long long field_20;
    struct st_a1dcd0_0 *field_28;
    long long field_30;
    unsigned long long field_38;
} st_a1dcd0_2;

typedef struct st_a1dcd0_0 {
    struct st_a1dcd0_0 *field_0;
    unsigned long long field_8;
    struct st_a1dcd0_0 *field_10;
    char field_18[2];
    char field_19;
    char padding_1a[6];
    unsigned long long field_20;
    struct st_a1dcd0_0 *field_28;
    unsigned long long field_30;
    unsigned long long field_38;
} st_a1dcd0_0;


st_a1dcd0_0 * sub_a1dcd0(st_a1dcd0_1 *a0, st_a1dcd0_1 *a1)
{
    st_a1dcd0_0 *v2;  // x0
    st_a1dcd0_0 *v3;  // x19
    st_a1dcd0_2 *v4;  // x20
    st_a1dcd0_0 *v5;  // x0
    st_a1dcd0_0 *v6;  // x0
    st_a1dcd0_0 *v7;  // x0
    st_a1dcd0_0 *v8;  // x0
    st_a1dcd0_0 *v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(64, "crypto/ec/ec_pmeth.c", 0x33);
    if (!v2)
        return v2;
    v3 = v2;
    *(unsigned short *)v2->field_18 = 0x1ff;
    a0->field_98 = v2;
    v4 = a1->field_98;
    if (v4->field_0)
    {
        v5 = sub_a1a70c(v4->field_0);
        v3->field_0 = v5;
        if (!v5)
            return v5;
    }
    v6 = v4->field_10;
    v3->field_8 = v4->field_8;
    if (v6)
    {
        v7 = sub_a18ce8(v6);
        v3->field_10 = v7;
        if (!v7)
            return v7;
    }
    v3->field_18[1] = v4->field_19;
    v8 = v4->field_28;
    *(unsigned long long *)&v3->padding_1a[5] = v4->field_20;
    v3->field_30 = v4->field_38;
    if (v8)
    {
        v9 = sub_a6dac4(v8, v4->field_30, "crypto/ec/ec_pmeth.c", 83);
        v3->field_20 = v9;
        if (!v9)
            return v9;
    }
    else
    {
        v3->field_20 = 0;
    }
    v3->field_28 = v4->field_30;
    return 1;
}
