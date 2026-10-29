/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7f9e4..0xa7fabc (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7f9e4_0 {
    long long field_0;
    struct st_a7f9e4_0 *field_8;
    struct st_a7f9e4_0 *field_10;
    struct st_a7f9e4_0 *field_18;
    char padding_20[152];
    unsigned int field_b8;
} st_a7f9e4_0;


st_a7f9e4_0 * sub_a7f9e4(long long a0, long long a1, long long a2)
{
    st_a7f9e4_0 *v2;  // x0
    st_a7f9e4_0 *v3;  // x0
    st_a7f9e4_0 *v4;  // x22
    st_a7f9e4_0 *v5;  // x21
    st_a7f9e4_0 *v6;  // x19
    st_a7f9e4_0 *v7;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a80fd4(a2);
    if (!v2)
        return v2;
    v3 = sub_a6bffc(0x100, "crypto/ml_dsa/ml_dsa_key.c", 87);
    if (!v3)
        return v3;
    v3->field_0 = a0;
    v3->field_8 = v2;
    v3->field_b8 = 3;
    v4 = v3;
    v5 = sub_a40ca8(a0, "SHAKE-128", a1);
    v4->field_10 = v5;
    v6 = sub_a40ca8(a0, "SHAKE-256", a1);
    v4->field_18 = v6;
    if (v5 && v6)
        return v4;
    v7 = v4;
    sub_a3f52c(v5);
    sub_a3f52c(v6);
    sub_a7fbd8(v7);
    sub_a6c2e4(v7, "crypto/ml_dsa/ml_dsa_key.c", 138);
    return 0;
}
