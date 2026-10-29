/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaff878..0xaff924 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aff878_0 {
    unsigned long long field_0[2];
    struct st_aff878_0 *field_8;
    struct st_aff878_0 *field_10;
    struct st_aff878_0 *field_18;
    struct st_aff878_0 *field_20;
} st_aff878_0;


st_aff878_0 * sub_aff878(uint128_t *a0)
{
    st_aff878_0 *v2;  // x0
    st_aff878_0 *v3;  // x21
    st_aff878_0 *v4;  // x21
    st_aff878_0 *v5;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(40, "providers/implementations/asymciphers/sm2_enc.c", 137);
    if (!v2)
        return v2;
    *(uint128_t *)v2->field_0 = *a0;
    v3 = v2;
    v3->field_8 = 0;
    v4 = &v3->field_8;
    v2->field_10 = 0;
    v2->field_18 = 0;
    v5 = v2;
    if (!v2->field_0[1] || sub_a18cf0(v2->field_0[1]))
    {
        if (sub_afe05c(v4, a0 + 1))
            return v5;
        sub_a18c08(v5->field_0[1]);
        sub_afe028(v4);
    }
    sub_a6c2e4(v5, "providers/implementations/asymciphers/sm2_enc.c");
    return 0;
}
