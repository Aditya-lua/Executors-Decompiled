/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb44e0c..0xb44eac (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b44e0c_0 {
    unsigned long long field_0;
    struct st_b44e0c_0 *field_8;
    char field_10;
    char padding_11[31];
    long long field_30;
    long long field_38;
} st_b44e0c_0;


st_b44e0c_0 * sub_b44e0c(unsigned long a0)
{
    st_b44e0c_0 *v2;  // x0
    st_b44e0c_0 *v3;  // x8
    st_b44e0c_0 *v4;  // x0
    st_b44e0c_0 *v5;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(1256, "providers/implementations/macs/kmac_prov.c", 179);
    if (!v2)
        return v2;
    v3 = sub_a3f728();
    v4 = v2;
    v4->field_8 = v3;
    if (v3)
    {
        v4->field_0 = a0;
        return v4;
    }
    v5 = v4;
    sub_a3f73c(0);
    sub_afe028(&v5->field_10);
    sub_a66ec0((char *)&v5[1].field_0 + 4, v5->field_30);
    sub_a66ec0(&v5[11].padding_11[19], v5->field_38);
    sub_a6c2e4(v5, "providers/implementations/macs/kmac_prov.c", 163);
    return 0;
}
