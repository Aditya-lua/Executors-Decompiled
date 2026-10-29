/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ffe2c..0x9ffe94 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ffe2c_1 {
    char padding_0[104];
    struct st_9ffe2c_0 *field_68;
    unsigned int field_70;
    char padding_74[36];
    struct st_9ffe2c_0 *field_98;
} st_9ffe2c_1;

typedef struct st_9ffe2c_0 {
    char padding_0[12];
    unsigned int field_c;
    char padding_10[20];
    char field_24;
    char padding_25[7];
    char field_2c;
} st_9ffe2c_0;


double sub_9ffe2c(st_9ffe2c_1 *a0)
{
    st_9ffe2c_0 *v2;  // x0
    st_9ffe2c_0 *v3;  // x8
    double v4;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(88, "crypto/dh/dh_pmeth.c", 58);
    if (!v2)
        return v4;
    v2->field_c = 0xffffffff;
    *(double *)&v2->padding_0[0] = 4.243992594e-314;
    v3 = v2;
    v3->field_2c = 1;
    a0->field_98 = v3;
    a0->field_68 = &v3->field_24;
    a0->field_70 = 2;
    return 4.243992594e-314;
}
