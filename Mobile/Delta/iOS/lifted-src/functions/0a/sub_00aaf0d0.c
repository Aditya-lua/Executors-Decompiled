/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaf0d0..0xaaf27c (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aaf0d0_0 {
    char padding_0[8];
    long long field_8;
} st_aaf0d0_0;

typedef struct st_aaf0d0_1 {
    unsigned long long field_0[2];
    struct st_aaf0d0_1 *field_8;
    unsigned int field_10;
    char padding_14[12];
    struct st_aaf0d0_1 *field_20;
} st_aaf0d0_1;


st_aaf0d0_1 * sub_aaf0d0(st_aaf0d0_1 *a0, st_aaf0d0_0 *a1)
{
    unsigned long long v11;  // 4118
    long long v12;  // x0
    st_aaf0d0_1 *v13;  // x20
    st_aaf0d0_1 *v14;  // x0
    st_aaf0d0_1 *v15;  // x0
    st_aaf0d0_1 *v16;  // x0
    st_aaf0d0_1 *v17;  // x21
    long long v18;  // x0
    long long v19;  // x0
    unsigned int v0;  // [bp-0x74]
    char v1;  // [bp-0x70]
    char v2;  // [bp-0x68]
    uint128_t v3;  // [bp-0x5c], Other Possible Types: char
    unsigned int v4;  // [bp-0x4c]
    unsigned int v5;  // [bp-0x48]
    unsigned int v6;  // [bp-0x44]
    st_aaf0d0_1 *v7;  // [bp-0x40]
    st_aaf0d0_1 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    sub_9cf830(&v2, &v0, &v1, a1);
    if (sub_a99eac(v2) != 912)
        return 1;
    v11 = arm64g_calculate_condition(1, v0, 1, 0);
    if (v11 & 1)
    {
        return 1;
    }
    else if (v0 == 16)
    {
        v12 = sub_aadf10();
        v13 = sub_9c5520(v12, a1->field_8);
        if (v13)
        {
            if (v13->field_0[1] && (v14 = sub_9cf9b4(v13->field_0[1]), *(st_aaf0d0_1 **)&v13->padding_14[4] = v14, !v14))
            {
                sub_aadf28(v13);
                v13 = 0;
            }
            else if (sub_ab1c68(a0, v13))
            {
                if (!a0)
                    return 1;
                v15 = sub_ab1c60(a0);
                if (!v15)
                    return 1;
                v16 = sub_ab1c98(a0);
                if (!v16)
                    return 1;
                v17 = v16;
                v7 = 0;
                v8 = 0;
                if (sub_aaf01c(v15, &v8, &v7, &v6, &v5))
                {
                    v18 = sub_9c7b68(v8);
                    v19 = sub_9c7b68(v7);
                    if (sub_ab8bf4(&v3) && sub_ab8c68(&v3, v18) && sub_ab8c78(&v3, v19) && sub_ab8c88(&v3, v6) && sub_ab8c98(&v3, v5))
                    {
                        *(unsigned int *)&v17->field_8 = v4;
                        *(uint128_t *)v17->field_0 = v3;
                        return 1;
                    }
                }
                goto LABEL_aaf274;
            }
        }
        sub_aadf28(v13);
LABEL_aaf274:
        return 0;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_backend.c", 665, "ossl_rsa_param_decode");
        sub_a36abc(4, 149, 0);
        return 0;
    }
}
