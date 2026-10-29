/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5dc14..0xb5df34 (800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5dc14_0 {
    char field_0[13];
    char field_5;
} st_b5dc14_0;

typedef struct st_b5dc14_1 {
    char padding_0[8];
    struct st_b5dc14_2 *field_8;
} st_b5dc14_1;

typedef struct st_b5dc14_6 {
    char padding_0[128];
    char field_80[13];
    unsigned short field_85[4];
    char field_8b;
    char padding_8c[7];
    unsigned long long field_93;
    struct st_b5dc14_1 *field_9b;
} st_b5dc14_6;

typedef struct st_b5dc14_3 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[16];
    unsigned long long field_28;
    char padding_30[32];
    int field_50;
    char field_54;
    char field_55;
    char padding_56[127];
    char field_d5[13];
    unsigned short field_da[4];
    unsigned short field_e0;
    char padding_e2[6];
    long long field_e8;
    struct st_b5dc14_1 *field_f0;
} st_b5dc14_3;

typedef struct st_b5dc14_4 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_b5dc14_0 *field_10;
    unsigned long long field_18;
} st_b5dc14_4;

typedef struct st_b5dc14_5 {
    char field_0[13];
    unsigned short field_5[4];
    unsigned short field_b;
    char padding_d[6];
    long long field_13;
    struct st_b5dc14_1 *field_1b;
} st_b5dc14_5;

typedef struct st_b5dc14_2 {
    unsigned long long field_0;
} st_b5dc14_2;


unsigned long long sub_b5dc14(st_b5dc14_3 *a0, st_b5dc14_4 *a1)
{
    st_b5dc14_4 *v4;  // x20
    st_b5dc14_6 *ptr;  // x22
    unsigned long long v14;  // w0
    unsigned long v15;  // x8
    unsigned long v16;  // x8
    unsigned long v17;  // x8
    unsigned long long v18;  // x9
    unsigned long long v19;  // x8
    long long v20;  // x19
    long long v21;  // x20
    st_b5dc14_5 *v6;  // x24
    st_b5dc14_4 *v7;  // x20
    unsigned int v8;  // w0
    unsigned long long v9;  // x8
    unsigned long long v10;  // 4113
    unsigned long v11;  // x23
    unsigned long long v12;  // 4114
    unsigned long v13;  // x8
    st_b5dc14_5 *v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a1)
        return 1;
    v4 = a1;
    if (!a1->padding_0)
        return 1;
    ptr = &a0->field_55;
    v6 = a0->field_d5;
    do
    {
        v7 = v4;
        v8 = sub_a722b0();
        if ((int)v8 > 41)
        {
            if (v8 != 42)
            {
                if (v8 != 43)
                {
                    if (v8 != 53)
                        continue;
                    if (sub_a70ef8(v7, &v1))
                    {
                        v9 = v1;
                        v10 = arm64g_calculate_condition(50, v9 - 129, 128, 0);
                        if (!(v10 & 1))
                        {
                            if (a0->field_10 != v9)
                            {
                                if (a0->field_50)
                                    a0->field_50 = 3;
                                a0->field_10 = v9;
                                goto LABEL_b5dc7c;
                            }
                        }
                        else
                        {
                            v20 = 109;
                            v21 = 280;
                            goto LABEL_b5dee0;
                        }
                    }
                    else
                    {
                        v20 = 103;
                        v21 = 276;
                        goto LABEL_b5dee0;
                    }
                }
                else
                {
                    if (!v7->field_10)
                        return 0;
                    if (v7->field_8 == 5 && (a0->field_54 & 21) == 20)
                    {
                        _memcpy(&ptr->padding_0[a0->field_10 + -1 * v7->field_18]);
                        (*(long long *)(*(long long *)&a0->padding_e2[4] + 8))();
                    }
                    goto LABEL_b5df0c;
                }
                goto LABEL_b5dee0;
            }
            if (v7->field_8 != 5)
            {
                v20 = 103;
                v21 = 306;
LABEL_b5dee0:
                sub_a368c8();
                sub_a369bc("providers/implementations/ciphers/ciphercommon_gcm.c", v21, "ossl_gcm_set_ctx_params");
                sub_a36abc(57, v20, 0);
LABEL_b5df0c:
                return 0;
            }
            v11 = v7->field_18;
            v12 = arm64g_calculate_condition(2, v11, 1, 0);
            if (!(v12 & 1))
            {
                if (v11 >= 4 && a0->field_10 - (int)v11 >= 8)
                {
                    _memcpy(ptr);
                    v13 = a0->field_54;
                    if (!(v13 & 1))
                        goto LABEL_b5de68;
                    if ((int)sub_aa8658(*(long long *)&a0->field_da[3], &ptr->padding_0[v11], a0->field_10 - v11, 0) >= 1)
                    {
                        v13 = a0->field_54 | 8;
                        goto LABEL_b5de68;
                    }
                }
                v20 = 103;
                v21 = 310;
                goto LABEL_b5dee0;
            }
            else
            {
                _memcpy(ptr);
                v13 = a0->field_54;
LABEL_b5de68:
                a0->field_54 = (char)v13 | 16;
                a0->field_50 = 1;
                continue;
            }
        }
        else if (v8 != 37)
        {
            if (v8 != 39)
                continue;
            if (v7->field_8 != 5)
            {
                v20 = 103;
                v21 = 293;
                goto LABEL_b5dee0;
            }
            v14 = (unsigned int)sub_a2f9e0();
            if (v7->field_18 == 13 && v14)
            {
                v15 = *(long long *)&v7->field_10->field_0[0];
                *(long long *)&v6->field_0[5] = *(long long *)&v7->field_10->field_0[5];
                *(unsigned long *)&v6->field_0[0] = v15;
                a0->field_28 = 13;
                v16 = *(short *)&a0->field_d5[11];
                v17 = (unsigned int)((v16 & 0xff00) >> 8) | (unsigned int)v16 * 0x100 & 0xff00ff00;
                if ((unsigned int)v17 < 8)
                    goto LABEL_b5de80;
                v18 = v17 - 8;
                if (!(a0->field_54 & 1))
                {
                    if (16 > v18)
                        goto LABEL_b5de80;
                    v18 = v17 - 24;
                }
                *(unsigned short *)&a0->field_d5[11] = (((((v18 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v18 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v18 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v18 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                v1 = 16;
                *(unsigned long long *)&a0->padding_18[8] = 16;
                continue;
            }
            else
            {
LABEL_b5de80:
                v1 = 0;
                v20 = 108;
                v21 = 298;
                goto LABEL_b5dee0;
            }
        }
        else
        {
            v0 = v6;
            if (sub_a71440(v7, &v0, 16, &v1))
            {
                v19 = v1;
                if (v19 && !(a0->field_54 & 1))
                {
                    *(unsigned long long *)&a0->padding_18[0] = v19;
                }
                else
                {
                    v20 = 110;
                    v21 = 268;
                    goto LABEL_b5dee0;
                }
            }
            else
            {
                v20 = 103;
                v21 = 264;
                goto LABEL_b5dee0;
            }
        }
LABEL_b5dc7c:
    } while ((v4 = &v7[1].field_8, *(long long *)&v7[1].field_8));
    return 1;
}
