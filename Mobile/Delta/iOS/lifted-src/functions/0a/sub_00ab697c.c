/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab697c..0xab6a08 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab697c_1 {
    char padding_0[104];
    unsigned long long field_68;
    unsigned int field_70;
    char padding_74[4];
    struct st_ab697c_2 *field_78;
    char padding_80[24];
    struct st_ab697c_0 *field_98;
} st_ab697c_1;

typedef struct st_ab697c_2 {
    unsigned int field_0;
} st_ab697c_2;

typedef struct st_ab697c_0 {
    unsigned int field_0;
    char padding_4[12];
    unsigned int field_10;
    char field_14;
    char padding_15[7];
    unsigned int field_1c;
    char padding_20[48];
    unsigned int field_50;
} st_ab697c_0;


st_ab697c_0 * sub_ab697c(st_ab697c_1 *a0)
{
    st_ab697c_0 *v2;  // x0
    unsigned int v3;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(88, "crypto/rsa/rsa_pmeth.c", 64);
    if (!v2)
        return 0;
    v2->field_0 = 0x800;
    v2->field_10 = 2;
    if (*(int *)a0->field_78 == 912)
        v3 = 6;
    else
        v3 = 1;
    v2->field_1c = v3;
    *(double *)&v2->padding_20[16] = nan;
    v2->field_50 = 1;
    a0->field_98 = v2;
    a0->field_68 = &v2->field_14;
    a0->field_70 = 2;
    return 1;
}
