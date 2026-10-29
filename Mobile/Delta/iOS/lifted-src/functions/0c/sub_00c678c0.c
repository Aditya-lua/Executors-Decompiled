/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc678c0..0xc67b5c (668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c678c0_0 {
    char padding_0[280];
    struct st_c678c0_1 *field_118;
    char padding_120[8];
    struct st_c678c0_2 *field_128;
} st_c678c0_0;

typedef struct st_c678c0_1 {
    unsigned long long field_0;
} st_c678c0_1;

typedef struct st_c678c0_3 {
    unsigned int field_0;
    char padding_4[28];
    struct st_c678c0_2 *field_20;
    char padding_28[56];
    struct st_c678c0_2 *field_60;
    struct st_c678c0_2 *field_68;
} st_c678c0_3;

typedef struct st_c678c0_2 {
    struct st_c678c0_2 *field_0;
    struct st_c678c0_0 *field_8;
    char padding_10[16];
    unsigned long long field_20;
    char padding_28[56];
    struct st_c678c0_2 *field_60;
    struct st_c678c0_2 *field_68;
} st_c678c0_2;


int sub_c678c0(st_c678c0_2 *a0, st_c678c0_3 *a1)
{
    unsigned long long v12;  // x26
    unsigned long long v13;  // x25
    st_c678c0_2 *v22;  // x23
    unsigned long v23;  // x24
    unsigned long long v24;  // x20
    unsigned long long v25;  // 4116
    st_c678c0_2 *v26;  // x2
    long long v27;  // x1
    st_c678c0_2 *v28;  // x25
    st_c678c0_2 *v29;  // x21
    st_c678c0_2 **v30;  // x21
    st_c678c0_2 *v31;  // x21
    unsigned long long v14;  // x24
    st_c678c0_2 *v32;  // x0
    long long v33;  // x0
    st_c678c0_2 *v34;  // x24
    unsigned long long v15;  // x23
    unsigned long long v16;  // x22
    unsigned long long v17;  // x21
    unsigned long long v18;  // x20
    unsigned long long v19;  // x19
    unsigned long long v20;  // x30
    st_c678c0_2 *v21;  // x22
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    if (!a0)
        return (unsigned int)a0;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = &v11;
    v10 = v20;
    if (!a1->field_20 && !a1->field_68 || !(v21 = a1->field_60, v21))
        return 0;
    v22 = a1->field_68;
    v23 = a1->field_0;
    v24 = sub_c4ba8(v21);
    v25 = arm64g_calculate_condition(1, v23 & 0xffffffff, 1, 0);
    if (!(v25 & 1))
    {
        if ((unsigned int)v23)
        {
            v24 = sub_a9976c(v23);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/p_lib.c", 2099, "evp_pkey_copy_downgraded");
            v0 = v24;
            v26 = "keymgmt key type = %s but legacy type = EVP_PKEY_NONE";
            v27 = 786691;
            goto LABEL_c67a44;
        }
    }
    v28 = a0->field_0;
    if (v28)
    {
        sub_a54a84(v28);
        sub_a5bd20(v28);
        v29 = v28;
        v30 = &v29->field_60;
        if (v29->field_60)
        {
            sub_a55970(v29->field_60, v28->field_68);
            sub_a55830(v28->field_60);
            *v30 = 0;
            v30[1] = 0;
        }
        v31 = 0;
        *(unsigned int *)&v28->field_0 = 0;
LABEL_c67980:
        if (sub_a5a8d8())
        {
            if (v22)
            {
                if (a0->field_0->field_8->field_128)
                {
                    v33 = sub_a7a42c(v21->field_20);
                    v34 = sub_a5d5a8(v33, a0->field_0, 0);
                    if (!v34)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/evp/p_lib.c", 2137, "evp_pkey_copy_downgraded");
                        sub_a5c2c0(6, 0x80006);
                    }
                    else if (sub_a55c1c(v21, v22, 135, a0->field_0->field_8->field_128, v34))
                    {
                        a0->field_0->field_8->field_118();
                    }
                    sub_a5d6b0(v34);
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/p_lib.c", 2126, "evp_pkey_copy_downgraded");
                    v0 = v24;
                    sub_a36abc(6, 206, "key type = %s");
                }
                sub_a368c8();
                sub_a369bc("crypto/evp/p_lib.c", 2153, "evp_pkey_copy_downgraded");
                v0 = v24;
                sub_a36abc(6, 205, "key type = %s");
            }
            else
            {
                return 1;
            }
        }
        if (v31)
        {
            sub_a5a4c8(v31);
            a0->field_0 = 0;
            return 0;
        }
    }
    else
    {
        v32 = sub_a5ba1c();
        a0->field_0 = v32;
        v31 = v32;
        if (v31)
            goto LABEL_c67980;
        sub_a368c8();
        sub_a369bc("crypto/evp/p_lib.c", 2113, "evp_pkey_copy_downgraded");
        v27 = 524294;
        v26 = 0;
LABEL_c67a44:
        sub_a36abc(6, v27, v26);
    }
    return 0;
}
