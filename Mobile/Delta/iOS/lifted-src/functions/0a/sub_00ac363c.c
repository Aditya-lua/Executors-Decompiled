/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac363c..0xac3738 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac363c_1 {
    char padding_0[184];
    struct st_ac363c_0 *field_b8;
    struct st_ac363c_0 *field_c0;
    struct st_ac363c_0 *field_c8;
} st_ac363c_1;

typedef struct st_ac363c_0 {
    struct st_ac363c_1 *field_0;
    struct st_ac363c_0 *field_8;
    struct st_ac363c_0 *field_10;
    struct st_ac363c_0 *field_18;
} st_ac363c_0;


st_ac363c_0 * sub_ac363c(st_ac363c_0 **a0)
{
    st_ac363c_0 *v2;  // x19
    st_ac363c_0 *v3;  // x21
    st_ac363c_0 *v4;  // x0
    st_ac363c_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(168, "crypto/slh_dsa/slh_dsa_hash_ctx.c", 28);
    if (!v2)
        return v2;
    v2->field_0 = a0;
    v3 = sub_a3f728();
    v2->field_8 = v3;
    if (v3 && sub_a3f7f0(v3, a0[23], 0) == 1)
    {
        if (!a0[24])
            return v2;
        if (a0[24] != a0[23])
        {
            v4 = sub_a3f728();
            v2->field_10 = v4;
            if (v4 && sub_a3f7f0() == 1)
                goto LABEL_ac36d4;
        }
        else
        {
            v2->field_10 = v3;
LABEL_ac36d4:
            if (!a0[25])
                return v2;
            v5 = sub_a57e48(a0[25]);
            v2->field_18 = v5;
            if (v5)
                return v2;
        }
    }
    sub_a3f73c(v3);
    if (v2->field_10 != v3)
        sub_a3f73c(v2->field_10);
    sub_a57f0c(v2->field_18);
    sub_a6c4e8(v2, 168, "crypto/slh_dsa/slh_dsa_hash_ctx.c", 113);
    return 0;
}
