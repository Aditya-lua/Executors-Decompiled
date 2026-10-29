/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3eb94..0xb3ec8c (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3eb94_1 {
    char padding_0[24];
    struct st_b3eb94_0 *field_18;
} st_b3eb94_1;

typedef struct st_b3eb94_2 {
    struct st_b3eb94_1 *field_0;
    char padding_8[56];
    struct st_b3eb94_0 *field_40;
} st_b3eb94_2;

typedef struct st_b3eb94_0 {
    struct st_b3eb94_0 *field_0;
} st_b3eb94_0;


st_b3eb94_0 ** sub_b3eb94(st_b3eb94_2 *a0, st_b3eb94_0 **a1)
{
    st_b3eb94_0 **v4;  // x2
    long long v5;  // x1
    st_b3eb94_0 **v0;  // [bp-0x30]
    st_b3eb94_0 **v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (!a1 || !*a1 || !sub_a6fbc4(a1, "encoded-pub-key"))
        return 1;
    if (sub_a71cdc() != 1 || v0 != a0->field_0->field_18)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/keymgmt/ml_kem_kmgmt.c", 668, "ml_kem_set_params");
        v5 = 158;
        v4 = 0;
    }
    else if (!v0)
    {
        return 1;
    }
    else if (a0->field_40)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/keymgmt/ml_kem_kmgmt.c", 677, "ml_kem_set_params");
        v4 = "ML-KEM keys cannot be mutated";
        v5 = 178;
    }
    else
    {
        return sub_a832c8(v1);
    }
    sub_a36abc(57, v5, v4);
    return 0;
    return 1;
}
