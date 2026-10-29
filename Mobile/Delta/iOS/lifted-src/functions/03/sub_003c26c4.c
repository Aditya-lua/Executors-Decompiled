/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c26c4..0x3c2768 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c26c4_1 {
    char padding_0[24];
    char field_18;
    char padding_19[15];
    long long field_28;
    char padding_30[16];
    char field_40;
    char padding_41[23];
    char field_58;
    char padding_59[15];
    long long field_68;
    char padding_70[16];
    char field_80;
    char padding_81[15];
    long long field_90;
    char padding_98[16];
    char field_a8;
    char padding_a9[15];
    long long field_b8;
} st_3c26c4_1;


st_3c26c4_1 * sub_3c26c4(st_3c26c4_1 *a0)
{
    long long *v0;  // [bp-0x28], Other Possible Types: st_3c26c4_1 *
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    sub_3be804(&a0->field_a8, a0->field_b8);
    sub_2219c(&a0->field_a8, 0);
    sub_3be718(&a0->field_80, a0->field_90);
    sub_2219c(&a0->field_80, 0);
    sub_43360(&a0->field_58, a0->field_68);
    sub_2219c(&a0->field_58, 0);
    v0 = &a0->field_40;
    sub_10344(&v0);
    sub_43360(&a0->field_18, a0->field_28);
    sub_2219c(&a0->field_18, 0);
    v0 = a0;
    sub_10344(&v0);
    return a0;
}
