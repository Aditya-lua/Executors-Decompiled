/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb38120..0xb381a4 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b38120_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b38120_0;

typedef struct st_b38120_1 {
    unsigned long long field_0[2];
    struct st_b38120_1 *field_8;
    unsigned long long field_10;
} st_b38120_1;


double sub_b38120(st_b38120_0 *a0)
{
    st_b38120_1 *v2;  // x0
    uint128_t v3;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = sub_a6bffc(24, "providers/implementations/kem/rsa_kem.c", 117);
        if (v2 && (v3 = a0->field_0, *(uint128_t *)v2->field_0 = v3, v2->field_8 = a0->field_10, v2->field_0[1]) && !sub_ab146c(v2->field_0[1]))
        {
            sub_a6c2e4(v2, "providers/implementations/kem/rsa_kem.c", 123);
            goto LABEL_b38194;
        }
    }
    else
    {
LABEL_b38194:
    }
    return (unsigned long long)v3;
}
