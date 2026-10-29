/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ae0fc..0x9ae540 (1092 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ae0fc_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    struct st_9ae0fc_0 *field_18;
    char padding_20[88];
    unsigned int field_78;
    char padding_7c[76];
    int field_c8;
} st_9ae0fc_1;

typedef struct st_9ae0fc_0 {
    unsigned int field_0;
    char padding_4[212];
    void* field_d8;
} st_9ae0fc_0;

typedef struct st_9ae0fc_2 {
    unsigned int field_0;
    char padding_4[4];
    struct st_9ae0fc_3 *field_8;
    char padding_10[8];
    unsigned int field_18;
} st_9ae0fc_2;

typedef struct st_9ae0fc_4 {
    unsigned long long field_0;
    char padding_8[36];
    unsigned long long field_2c;
    unsigned long long field_34;
} st_9ae0fc_4;

typedef struct st_9ae0fc_3 {
    unsigned long long field_0;
} st_9ae0fc_3;

extern st_9ae0fc_2 g_e89520;
extern st_9ae0fc_2 g_e895b0;

unsigned long long sub_9ae0fc(st_9ae0fc_1 *a0)
{
    unsigned long v3;  // x27
    unsigned long long v4;  // w0
    unsigned long long v13;  // x21
    unsigned long long v14;  // w25
    st_9ae0fc_4 *v15;  // x0
    unsigned long v16;  // x9
    unsigned long v17;  // cc_dep1
    unsigned long long v18;  // w10
    unsigned long long v19;  // 4111
    unsigned long long v20;  // 4111
    unsigned long long v21;  // x8
    unsigned long long v22;  // w8
    st_9ae0fc_2 *v5;  // x8
    unsigned long v23;  // cc_dep1
    unsigned long v24;  // cc_dep2
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4102
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4102
    unsigned long long v29;  // w9
    unsigned long v30;  // x8
    unsigned long long v6;  // w21
    unsigned long long v7;  // w23
    unsigned int *v8;  // x24
    unsigned int *v9;  // x24
    unsigned long v10;  // x8
    unsigned long long v11;  // w9
    long long v12;  // x20
    unsigned long v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_8;
    v4 = (unsigned int)sub_954420();
    if (!v4)
        return v4;
    *(unsigned long long *)&a0[12].padding_20[80] = 0;
    *(uint128_t *)&a0[12].padding_20[64] = 0;
    *(unsigned long long *)&a0[12].padding_20[0x55] = 0;
    if (a0->field_18->field_0 == 0x10000)
    {
        v5 = &g_e89520.field_0;
        if (g_e89520.field_0)
        {
LABEL_9ae180:
            v6 = 0;
            v7 = 0;
            v8 = &v5->field_18;
            do
            {
                v9 = v8;
                if (*(long long *)((char *)v9 - 16))
                    (*(long long *)((char *)v9 - 16))();
                v8 = v9 + 6;
            } while (*v9);
        }
LABEL_9ae214:
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 155, "tls_setup_handshake");
        goto LABEL_9ae23c;
    }
    if (a0->field_18->field_0 == 0x1ffff)
    {
        v5 = &g_e895b0.field_0;
        if (g_e895b0.field_0)
            goto LABEL_9ae180;
        goto LABEL_9ae214;
    }
    v6 = *(int *)&a0->padding_20[40];
    v7 = v6;
    if (*(long long *)(v3 + 1464))
    {
LABEL_9ae254:
        if (a0->field_78)
        {
            v0 = v3;
            v12 = sub_96125c(a0);
            if ((int)sub_ad69e4(v12) >= 1)
            {
                v13 = 0;
                if (v7 == 0x100)
                    v14 = 0xff00;
                else
                    v14 = v7;
                do
                {
                    v15 = sub_ad69f8(v12, v13);
                    v16 = (int)a0->field_18->field_d8[80];
                    v17 = (unsigned int)v16 & 8;
                    if (!((unsigned int)v16 & 8))
                    {
                        v18 = *(int *)&(v15->padding_8)[1];
                        v19 = arm64g_calculate_condition(9, v17, 0, 0);
                        if (!(v19 & 1))
                            goto LABEL_9ae2e6;
                        goto LABEL_9ae2e5;
                    }
                    else
                    {
                        v18 = *(int *)((char *)&v15->field_2c + 4);
                        v20 = arm64g_calculate_condition(9, v17, 0, 0);
                        if (v20 & 1)
                        {
LABEL_9ae2e5:
                            v21 = 48;
                            goto LABEL_9ae2e8;
                        }
                        else
                        {
LABEL_9ae2e6:
                            v21 = 56;
LABEL_9ae2e8:
                            v22 = *(int *)((char *)v15 + v21);
                            v23 = v7;
                            v24 = v18;
                            if (v7 == v18)
                            {
                                if (v7 != v22)
                                {
                                    if (v16 >> 3 & 1)
                                        goto LABEL_9ae29c;
                                    if (v22 <= v7)
                                        continue;
                                }
                                goto LABEL_9ae338;
                            }
                            else if (!(v16 >> 3 & 1))
                            {
                                if (v18 <= v7)
                                {
                                    v25 = arm64g_calculate_condition(163, v23, v24, 0);
                                    v26 = arm64g_calculate_condition(195, (v25 & 1 ? v7 : 0), (v25 & 1 ? v22 : 0), 0);
                                    if (v26 & 1)
                                        continue;
                                }
                                else
                                {
                                    v27 = arm64g_calculate_condition(163, v23, v24, 0);
                                    v28 = arm64g_calculate_condition(192, (v27 & 1 ? v7 : 0), (v27 & 1 ? v22 : 0), 0);
                                    if (v28 & 1)
                                        continue;
                                }
LABEL_9ae338:
                                if (*(long long *)&a0[2].field_c8 && *(long long *)&a0[3].padding_7c[8])
                                {
                                    do
                                    {
                                        /* unsupported instruction */;
                                        /* unsupported instruction */;
                                    } while (/* unsupported instruction */ ^ 1);
                                    *(unsigned int *)&a0[4].padding_20[72] = 0;
                                    return 1;
                                }
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                return 1;
                            }
                            else
                            {
                                if (v18 == 0x100)
                                    v29 = 0xff00;
                                else
                                    v29 = v18;
                                if (v29 < v14)
                                    continue;
                                if (v7 == v22)
                                    goto LABEL_9ae338;
LABEL_9ae29c:
                                if (v22 == 0x100)
                                    v22 = 0xff00;
                                if (v22 < v14)
                                    goto LABEL_9ae338;
                            }
                        }
                    }
                } while ((v13 = (unsigned int)v13 + 1, (int)sub_ad69e4(v12) > (int)v13));
            }
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 216, "tls_setup_handshake");
        }
        else
        {
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v30 = &a0[1].padding_7c[64];
            *(uint128_t *)v30 = 0;
            *(uint128_t *)(v30 + 16) = 0;
            *(unsigned int *)&a0[6].padding_20[32] = 0;
            *(unsigned int *)&a0[4].padding_10[0] = 0;
            if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1))
                return 1;
            a0->field_c8 = 1;
            return 1;
        }
    }
    else
    {
        v10 = (int)a0->field_18->field_d8[80];
        if (!((unsigned int)v10 & 8))
            v11 = 770;
        else
            v11 = 0xfeff;
        if (v7 == v11)
        {
LABEL_9ae390:
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 168, "tls_setup_handshake");
        }
        else if (!(v10 >> 3 & 1))
        {
            if (v7 < 770)
                goto LABEL_9ae390;
            if (0x303 <= v6 || sub_95f0c4(a0, 123))
                goto LABEL_9ae254;
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 185, "tls_setup_handshake");
LABEL_9ae23c:
        }
        else
        {
            if (v7 != 0x100 && 0xff00 > v7)
                goto LABEL_9ae254;
            goto LABEL_9ae390;
        }
    }
    sub_9a58a4();
    return 0;
}
