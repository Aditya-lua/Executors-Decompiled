/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb33e88..0xb33fb8 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b33e88_1 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
    long long field_40;
    long long field_48;
    long long field_50;
    long long field_58;
    long long field_60;
    long long field_68;
    long long field_70;
    long long field_78;
    uint128_t field_80;
    unsigned long long field_90;
    unsigned int field_98;
} st_b33e88_1;

typedef struct st_b33e88_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    char field_20;
    char padding_21[7];
    char field_28;
    char padding_29[7];
    char field_30;
    char padding_31[7];
    char field_38;
    char padding_39[7];
    char field_40;
    char padding_41[7];
    char field_48;
    char padding_49[7];
    char field_50;
    char padding_51[7];
    char field_58;
    char padding_59[7];
    char field_60;
    char padding_61[7];
    char field_68;
    char padding_69[7];
    char field_70;
    char padding_71[7];
    char field_78;
    char padding_79[7];
    uint128_t field_80;
    unsigned long long field_90;
    unsigned int field_98;
} st_b33e88_0;


st_b33e88_0 * sub_b33e88(st_b33e88_1 *a0)
{
    st_b33e88_0 *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(160, "providers/implementations/kdfs/x942kdf.c", 340);
    if (!v2)
        return v2;
    v2->field_0 = a0->field_0;
    v2->field_98 = 1;
    if (sub_afe694(a0->field_20, a0->field_28, &v2->field_20, &v2->field_28) && sub_afe694(a0->field_30, a0->field_38, &v2->field_30, &v2->field_38) && sub_afe694(a0->field_40, a0->field_60, &v2->field_40, &v2->field_60) && sub_afe694(a0->field_48, a0->field_68, &v2->field_48, &v2->field_68) && sub_afe694(a0->field_50, a0->field_70, &v2->field_50, &v2->field_70) && sub_afe694(a0->field_58, a0->field_78, &v2->field_58, &v2->field_78) && sub_afe05c(&v2->field_8, &a0->field_8))
    {
        v2->field_90 = a0->field_90;
        v2->field_80 = a0->field_80;
        v2->field_98 = a0->field_98;
        return v2;
    }
    sub_b33ff0(v2);
    sub_a6c2e4(v2, "providers/implementations/kdfs/x942kdf.c", 373);
    return 0;
}
