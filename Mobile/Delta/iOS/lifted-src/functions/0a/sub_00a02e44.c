/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa02e44..0xa02ec4 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a02e44_2 {
    char padding_0[152];
    struct st_a02e44_1 *field_98;
} st_a02e44_2;

typedef struct st_a02e44_3 {
    char padding_0[104];
    unsigned long long field_68;
    unsigned int field_70;
    char padding_74[36];
    struct st_a02e44_0 *field_98;
} st_a02e44_3;

typedef struct st_a02e44_1 {
    double field_0;
    struct st_a02e44_0 *field_8;
    char padding_10[8];
    struct st_a02e44_0 *field_18;
} st_a02e44_1;

typedef struct st_a02e44_0 {
    char padding_0[8];
    struct st_a02e44_0 *field_8;
    char field_10;
    char padding_11[7];
    struct st_a02e44_0 *field_18;
} st_a02e44_0;


double sub_a02e44(st_a02e44_3 *a0, st_a02e44_2 *a1)
{
    st_a02e44_0 *v2;  // x0
    st_a02e44_1 *v3;  // x8
    double v4;  // d0
    unsigned long v5;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(32, "crypto/dsa/dsa_pmeth.c", 40);
    if (!v2)
        return v5;
    *(double *)v2->padding_0 = 4.75327058188e-312;
    v2->field_8 = 0;
    v2->field_18 = 0;
    a0->field_98 = v2;
    a0->field_68 = &v2->field_10;
    a0->field_70 = 2;
    v3 = a1->field_98;
    v4 = v3->field_0;
    *(double *)v2->padding_0 = v4;
    v2->field_8 = v3->field_8;
    v2->field_18 = v3->field_18;
    return v4;
}
