/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb445b0..0xb44688 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b445b0_1 {
    long long field_0;
    long long field_8;
    char field_10;
    char padding_11[23];
    unsigned long long field_28;
    long long field_30;
    long long field_38;
    unsigned int field_40;
} st_b445b0_1;

typedef struct st_b445b0_0 {
    char padding_0[8];
    long long field_8;
    char field_10;
    char padding_11[23];
    unsigned long long field_28;
    long long field_30;
    long long field_38;
    unsigned int field_40;
} st_b445b0_0;


st_b445b0_0 * sub_b445b0(st_b445b0_1 *a0)
{
    st_b445b0_0 *v2;  // x19
    long long n;  // x2
    long long n1;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_b44e0c(a0->field_0);
    if (!v2)
        return v2;
    if (sub_a40a34(v2->field_8, a0->field_8) && sub_afe05c(&v2->field_10, &a0->field_10))
    {
        n = a0->field_30;
        v2->field_28 = a0->field_28;
        v2->field_30 = n;
        n1 = a0->field_38;
        v2->field_38 = n1;
        v2->field_40 = a0->field_40;
        _memcpy(v2 + 1, a0 + 1, n);
        _memcpy((char *)&v2[10].field_38 + 4, (char *)&a0[10].field_38 + 4, n1);
        return v2;
    }
    sub_a3f73c(v2->field_8);
    sub_afe028(&v2->field_10);
    sub_a66ec0(v2 + 1, v2->field_30);
    sub_a66ec0((char *)&v2[10].field_38 + 4, v2->field_38);
    sub_a6c2e4(v2, "providers/implementations/macs/kmac_prov.c", 163);
    return 0;
}
