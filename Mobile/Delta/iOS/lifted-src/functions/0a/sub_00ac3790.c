/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac3790..0xac3874 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac3790_0 {
    unsigned long long field_0;
    struct st_ac3790_0 *field_8;
    struct st_ac3790_0 *field_10;
    struct st_ac3790_0 *field_18;
    unsigned int field_20;
} st_ac3790_0;


st_ac3790_0 * sub_ac3790(st_ac3790_0 *a0)
{
    st_ac3790_0 *v2;  // x19
    st_ac3790_0 *v3;  // x0
    st_ac3790_0 *v4;  // x0
    st_ac3790_0 *v5;  // x0
    st_ac3790_0 *v6;  // x0
    st_ac3790_0 *v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(168, "crypto/slh_dsa/slh_dsa_hash_ctx.c", 70);
    if (!v2)
        return v2;
    v2->field_20 = a0->field_20;
    v3 = a0->field_8;
    v2->field_0 = a0->field_0;
    if (!v3 || !(v4 = sub_a40484(v3), v2->field_8 = v4, !v4))
    {
        if (!a0->field_10)
        {
LABEL_ac37fc:
            v6 = a0->field_18;
            if (!v6)
                return v2;
            goto LABEL_ac3818;
        }
        else if (a0->field_10 != a0->field_8)
        {
            v5 = sub_a40484();
            v2->field_10 = v5;
            if (v5)
                goto LABEL_ac37fc;
        }
        else
        {
            v2->field_10 = v2->field_8;
            v6 = a0->field_18;
            if (!v6)
                return v2;
LABEL_ac3818:
            v7 = sub_a57f5c(v6);
            v2->field_18 = v7;
            if (v7)
                return v2;
        }
    }
    sub_a3f73c(v2->field_8);
    if (v2->field_10 != v2->field_8)
        sub_a3f73c(v2->field_10);
    sub_a57f0c(v2->field_18);
    sub_a6c4e8(v2, 168, "crypto/slh_dsa/slh_dsa_hash_ctx.c", 113);
    return 0;
}
