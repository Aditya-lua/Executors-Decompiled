/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac3874..0xac39b4 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac3874_0 {
    char padding_0[12];
    unsigned int field_c;
    char padding_10[28];
    unsigned int field_2c;
    char padding_30[88];
    long long field_88;
    struct st_ac3874_0 *field_90;
    char padding_98[8];
    struct st_ac3874_0 *field_a0;
    unsigned long long field_a8;
    unsigned long long field_b0;
    struct st_ac3874_0 *field_b8;
    struct st_ac3874_0 *field_c0;
    struct st_ac3874_0 *field_c8;
} st_ac3874_0;


st_ac3874_0 * sub_ac3874(long long a0, st_ac3874_0 *a1, long long a2)
{
    st_ac3874_0 *v2;  // x0
    st_ac3874_0 *v3;  // x23
    st_ac3874_0 *v4;  // x19
    st_ac3874_0 *v5;  // x22
    unsigned long v6;  // x21
    unsigned int v7;  // w23
    st_ac3874_0 *v8;  // x0
    st_ac3874_0 *v9;  // x0
    st_ac3874_0 *v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ac5b7c(a2);
    if (!v2)
        return 0;
    v3 = v2;
    v4 = sub_a6bffc(208, "crypto/slh_dsa/slh_dsa_key.c", 106);
    if (!v4)
        return v4;
    v4->field_88 = a0;
    v4->field_a0 = v3;
    if (a1)
    {
        v5 = sub_a6d9b4(a1, "crypto/slh_dsa/slh_dsa_key.c", 111);
        v4->field_90 = v5;
        if (!v5)
            goto LABEL_ac3990;
    }
    else
    {
        v5 = v4->field_90;
    }
    v6 = v3->field_c;
    v7 = v3->field_2c;
    v8 = sub_a40ca8();
    v4->field_b8 = v8;
    if (v8)
    {
        if ((unsigned int)v6)
        {
            v4->field_a8 = sub_ac2c30(!(unsigned int)v6);
            v4->field_b0 = sub_ac4a0c(v6);
            return v4;
        }
        if (v7 == 1)
        {
            v4->field_c0 = v8;
LABEL_ac3954:
            v10 = sub_a58724(a0, "HMAC", v5);
            v4->field_c8 = v10;
            if (v10)
            {
                v4->field_a8 = sub_ac2c30(!(unsigned int)v6);
                v4->field_b0 = sub_ac4a0c(v6);
                return v4;
            }
        }
        else
        {
            v9 = sub_a40ca8(a0, "SHA2-512", v5);
            v4->field_c0 = v9;
            if (v9)
                goto LABEL_ac3954;
        }
    }
LABEL_ac3990:
    sub_ac39b4(v4);
    return 0;
}
