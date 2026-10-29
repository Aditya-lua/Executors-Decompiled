/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb45dd0..0xb46178 (936 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b45dd0_1 {
    char padding_0[8];
    long long field_8;
    struct st_b45dd0_2 *field_10;
    char padding_18[24];
    struct st_b45dd0_0 *field_30;
    char padding_38[32];
    struct st_b45dd0_0 *field_58;
    char padding_60[24];
    unsigned int field_78;
    char padding_7c[12];
    unsigned long long field_88;
    unsigned long long field_90;
    struct st_b45dd0_0 *field_98;
    struct st_b45dd0_0 *field_a0;
    unsigned long long field_a8;
    char padding_b0[32];
    struct st_b45dd0_0 *field_d0;
    struct st_b45dd0_0 *field_d4;
    char padding_dc[12];
    struct st_b45dd0_0 *field_e8;
} st_b45dd0_1;

typedef struct st_b45dd0_2 {
    unsigned long long field_0;
} st_b45dd0_2;

typedef struct st_b45dd0_0 {
    struct st_b45dd0_0 *field_0;
} st_b45dd0_0;


long long sub_b45dd0(st_b45dd0_1 *a0, unsigned int a1, unsigned long a2, st_b45dd0_0 **a3, unsigned long long a4)
{
    long long v4;  // x1
    unsigned long long v5;  // x21
    st_b45dd0_0 **v14;  // w9
    st_b45dd0_0 **v15;  // w8
    unsigned long long v16;  // x0
    unsigned long long v6;  // 4108
    unsigned long long v7;  // 4108
    unsigned long long v8;  // x25
    unsigned long long v9;  // x24
    st_b45dd0_0 **v10;  // x3
    st_b45dd0_0 **v11;  // x0
    long long v12;  // x1
    st_b45dd0_0 **v13;  // w8
    st_b45dd0_0 **v0;  // [bp-0x60]
    st_b45dd0_0 **v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (a1 > a0->field_78)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/rands/drbg.c", 358, "ossl_prov_drbg_instantiate");
        v4 = 181;
    }
    else
    {
        if (!a3)
        {
            v5 = 29;
            v6 = arm64g_calculate_condition(4, a3, 0, 0);
            if (!(v6 & 1))
                goto LABEL_b45e3e;
LABEL_b45e3d:
        }
        else
        {
            v5 = a4;
            v7 = arm64g_calculate_condition(4, a3, 0, 0);
            if (v7 & 1)
                goto LABEL_b45e3d;
LABEL_b45e3e:
        }
        if (v5 > a0->field_a8)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 370, "ossl_prov_drbg_instantiate");
            v4 = 195;
        }
        else if (!*(int *)&a0->padding_dc[8])
        {
            v8 = a0->field_88;
            v9 = a0->field_90;
            *(unsigned int *)&a0->padding_dc[8] = 2;
            v10 = a0->field_98;
            if (v10)
            {
                if (a0->field_58)
                    a0->field_58();
                if (a0->field_30)
                {
                    v8 += (char *)v10;
                    v9 += (char *)a0->field_a0;
                }
                else
                {
                    v11 = sub_b46178(a0, &v1, v10, a0->field_a0);
                    if (v11 < a0->field_98 || v11 > a0->field_a0)
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/rands/drbg.c", 422, "ossl_prov_drbg_instantiate");
                        v12 = 190;
LABEL_b46160:
                        sub_a36abc(57, v12, 0);
                        if (!v1)
                            return *(int *)&a0->padding_dc[8] == 1;
                        sub_afdd8c(a0->field_8);
                        return *(int *)&a0->padding_dc[8] == 1;
                    }
                }
            }
            v13 = (st_b45dd0_0 **)(int)a0->field_d0;
            if ((char *)v13 + 1 <= 1)
                v14 = (st_b45dd0_0 **)1;
            else
                v14 = (char *)v13 + 1;
            if (!v13)
                v15 = (st_b45dd0_0 **)0;
            else
                v15 = v14;
            *(unsigned int *)((char *)&a0->field_d0 + 4) = (unsigned int)v15;
            v16 = sub_b462ac();
            if (v16 >= v8 && v9 >= v16)
                a0->field_10();
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 441, "ossl_prov_drbg_instantiate");
            v12 = 189;
            goto LABEL_b46160;
        }
        else if (*(int *)&a0->padding_dc[8] == 2)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 376, "ossl_prov_drbg_instantiate");
            v4 = 192;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 378, "ossl_prov_drbg_instantiate");
            v4 = 185;
        }
    }
    sub_a36abc(57, v4, 0);
    if (!v1)
        return *(int *)&a0->padding_dc[8] == 1;
    sub_afdd8c(a0->field_8);
    return *(int *)&a0->padding_dc[8] == 1;
}
