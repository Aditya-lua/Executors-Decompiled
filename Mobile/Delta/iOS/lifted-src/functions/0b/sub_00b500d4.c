/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb500d4..0xb5018c (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b500d4_0 {
    unsigned long long field_0;
    struct st_b500d4_0 *field_8;
    char padding_10[12];
    char field_1c;
} st_b500d4_0;


double sub_b500d4(long long a0, st_b500d4_0 *a1)
{
    st_b500d4_0 *v2;  // x20
    st_b500d4_0 *v3;  // x0
    st_b500d4_0 *v4;  // x21
    unsigned long long v5;  // x0
    double v6;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    if (!sub_a2f9e0())
        return v6;
    v3 = sub_a6bffc(208, "providers/implementations/signature/rsa_sig.c", 235);
    if (v3 && (!v2 || !(v2 = sub_a6d9b4(v2, "providers/implementations/signature/rsa_sig.c", 237), !v2)))
    {
        v4 = v3;
        v5 = sub_9f2aec(a0);
        v4->field_1c = v4->field_1c | 2;
        v4->field_0 = v5;
        v4->field_8 = v2;
        *(double *)((char *)&v4[6].field_0 + 2) = nan;
        return nan;
    }
    sub_a6c2e4();
    return v6;
}
