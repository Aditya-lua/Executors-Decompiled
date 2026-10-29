/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb45224..0xb45304 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b45224_0 {
    char padding_0[16];
    struct st_b45224_0 *field_10;
    unsigned long long field_18;
} st_b45224_0;


double sub_b45224(long long idx, st_b45224_0 *a1, unsigned long a2, long long a3)
{
    st_b45224_0 *v2;  // x0
    double v3;  // d0
    double v4;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return v4;
    v2 = sub_a6fbc4(a3, "key");
    if (v2)
    {
        if (!v2->field_10 || v2->field_18 != 32)
            goto LABEL_b452b4;
        sub_aa4d60(idx + 16);
        v3 = 2.121995791e-314;
        *(double *)(idx + 8) = 2.121995791e-314;
    }
    if (!a1)
    {
        return v3;
    }
    else if (a2 == 32)
    {
        sub_aa4d60(idx + 16, a1);
        *(double *)(idx + 8) = 2.121995791e-314;
        return 2.121995791e-314;
    }
LABEL_b452b4:
    sub_a368c8();
    sub_a369bc("providers/implementations/macs/poly1305_prov.c", 86, "poly1305_setkey");
    sub_a36abc(57, 105, 0);
    return v3;
}
