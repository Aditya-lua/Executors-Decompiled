/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa02de4..0xa02e44 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a02de4_1 {
    char padding_0[104];
    struct st_a02de4_0 *field_68;
    unsigned int field_70;
    char padding_74[36];
    struct st_a02de4_0 *field_98;
} st_a02de4_1;

typedef struct st_a02de4_0 {
    char padding_0[8];
    struct st_a02de4_0 *field_8;
    char field_10;
    char padding_11[7];
    struct st_a02de4_0 *field_18;
} st_a02de4_0;


double sub_a02de4(st_a02de4_1 *a0)
{
    st_a02de4_0 *v2;  // x0
    double v3;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(32, "crypto/dsa/dsa_pmeth.c", 40);
    if (!v2)
        return v3;
    *(double *)v2->padding_0 = 4.75327058188e-312;
    v2->field_8 = 0;
    v2->field_18 = 0;
    a0->field_98 = v2;
    a0->field_68 = &v2->field_10;
    a0->field_70 = 2;
    return 4.75327058188e-312;
}
