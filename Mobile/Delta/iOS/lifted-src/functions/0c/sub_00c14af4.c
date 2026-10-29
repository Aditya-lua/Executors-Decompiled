/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc14af4..0xc14db8 (708 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c14af4_2 {
    char padding_0[120];
    unsigned long long field_78;
} st_c14af4_2;

typedef struct st_c14af4_0 {
    char padding_0[128];
    unsigned long long field_80;
} st_c14af4_0;

typedef struct st_c14af4_1 {
    char padding_0[8];
    struct st_c14af4_2 *field_8;
} st_c14af4_1;

typedef struct st_c14af4_5 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_c14af4_0 *field_10;
} st_c14af4_5;

typedef struct st_c14af4_4 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned int field_18;
} st_c14af4_4;

typedef struct st_c14af4_3 {
    struct st_c14af4_1 *field_0;
} st_c14af4_3;

extern st_c14af4_3 *g_f14408;

double sub_c14af4(uint128_t *a0)
{
    unsigned long long v2;  // x23
    st_c14af4_1 **v3;  // x21
    unsigned long v12;  // x9
    unsigned long long v13;  // x10
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    st_c14af4_4 *v18;  // x20
    st_c14af4_1 *v19;  // x21
    unsigned long long v20;  // x23
    st_c14af4_1 *iter;  // x9
    unsigned long long v4;  // x8
    st_c14af4_2 *v22;  // x10
    char v23;  // x11
    unsigned long v24;  // x12
    long long v25;  // x1
    unsigned long long v26;  // x13
    long long v27;  // x0
    st_c14af4_5 *v28;  // x14
    unsigned long v29;  // cc_dep1
    unsigned long v30;  // cc_dep2
    unsigned long v31;  // x8
    st_c14af4_1 *node;  // x20
    unsigned long long v32;  // x9
    unsigned long long v33;  // 4110
    unsigned long long v34;  // 4102
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4102
    unsigned long long v6;  // x26
    unsigned long long v7;  // x26
    st_c14af4_1 **v8;  // x8
    st_c14af4_1 *v9;  // x20
    unsigned long long v10;  // x21
    unsigned long v11;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v2 = (/* unsupported instruction */ + 1) * 3;
    while (1)
    {
        v3 = g_f14408;
        /* unsupported instruction */;
        if (g_f14408)
        {
            v4 = *(long long *)&g_f14408[1];
            if (v2 <= (unsigned long long)*(long long *)&g_f14408[1])
                break;
        }
        else
        {
            v3 = sub_c75bcc();
            v4 = v3[1];
            if (v3[1] >= v2)
                break;
        }
        if (v4)
        {
            node = *v3;
            v6 = v4 * 64;
            while (1)
            {
                v7 = v6;
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!/* unsupported instruction */)
                {
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                    {
                        node += 4;
                        v6 = v7 - 64;
                        if (v7 == 64)
                            break;
                        else
                            continue;
                    }
                }
                else
                {
                    /* unsupported instruction */;
                }
                sub_c75edc(node);
                node += 4;
                v6 = v7 - 64;
                if (v7 == 64)
                    break;
            }
        }
        v8 = g_f14408;
        if (g_f14408 != v3)
        {
            v9 = *v3;
            v10 = (char *)*v3 + 0x40 * v3[1];
            if (v3[1])
            {
                while (1)
                {
                    v11 = v9 + 4;
                    do
                    {
                        /* unsupported instruction */;
                        v12 = /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v13 = v12 & 2;
                    if (4 <= v12)
                    {
                        v14 = arm64g_calculate_condition(36, v8, v3, 0);
                        v15 = arm64g_calculate_condition(4, (v14 & 1 ? v13 : 0), 0, 0);
                        if (v15 & 1)
                            goto LABEL_c14bf0;
                        goto LABEL_c14be4;
                    }
                    else
                    {
                        v16 = arm64g_calculate_condition(36, v8, v3, 0);
                        v17 = arm64g_calculate_condition(0, (v16 & 1 ? v13 : 0), 0, 0);
                        if (!(v17 & 1))
                        {
LABEL_c14be4:
                            v9 = v11;
                            v8 = v11;
                            v3 = v10;
                            if (v9 == v3)
                                break;
                        }
                        else
                        {
LABEL_c14bf0:
                            sub_c75dc4(v9);
                            v9 = v11;
                            v8 = v11;
                            v3 = v10;
                            if (v9 == v3)
                                break;
                        }
                    }
                }
            }
        }
        else
        {
            v18 = sub_c14db8();
            if (v3[1])
            {
                v19 = *v3;
                v20 = (char *)v19 + 0x40 * v3[1];
                iter = v19;
                do
                {
                    v22 = iter->field_8;
                    if (v22)
                    {
                        v23 = (char)-v18->field_18 & 63;
                        v24 = v18->field_0;
                        v25 = v18->field_8;
                        while (1)
                        {
                            v26 = *(long long *)&v22[1].padding_0[0];
                            v27 = 11400714819323198485 * v22->field_78 >> (v23 & 63);
                            if ((unsigned long long)v25 <= (unsigned long long)v27)
                            {
                                sub_c73c94(v27);
                                __debugbreak();
                            }
                            v28 = v24 + v27 * 64;
                            if (v28->field_10)
                            {
                                v28->field_10->field_80 = v22;
                                v28->field_10 = v22;
                                *(unsigned long long *)&v22[1].padding_0[0] = 0;
                                v22 = v26;
                                if (!v26)
                                    break;
                            }
                            else
                            {
                                v28->field_8 = v22;
                                v28->field_10 = v22;
                                *(unsigned long long *)&v22[1].padding_0[0] = 0;
                                v22 = v26;
                                if (!v26)
                                    break;
                            }
                        }
                    }
                } while ((iter += 4, v29 = iter, v30 = v20, iter != v20));
                /* unsupported instruction */;
                g_f14408 = v18;
                while (1)
                {
                    v19 += 4;
                    do
                    {
                        /* unsupported instruction */;
                        v31 = /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v32 = v31 & 2;
                    if (4 <= v31)
                    {
                        v33 = arm64g_calculate_condition(36, v29, v30, 0);
                        v34 = arm64g_calculate_condition(4, (v33 & 1 ? v32 : 0), 0, 0);
                        if (v34 & 1)
                            goto LABEL_c14d0c;
                        goto LABEL_c14d00;
                    }
                    else
                    {
                        v35 = arm64g_calculate_condition(36, v29, v30, 0);
                        v36 = arm64g_calculate_condition(0, (v35 & 1 ? v32 : 0), 0, 0);
                        if (!(v36 & 1))
                        {
LABEL_c14d00:
                            v29 = v19;
                            v30 = v20;
                            if (v19 == v20)
                                break;
                        }
                        else
                        {
LABEL_c14d0c:
                            sub_c75dc4();
                            v29 = v19;
                            v30 = v20;
                            if (v19 == v20)
                                break;
                        }
                    }
                }
            }
            else
            {
                /* unsupported instruction */;
                g_f14408 = v18;
                break;
            }
        }
    }
    *a0 = 850045863;
    a0[1] = 0;
    a0[5] = 0;
    a0[6] = 0;
    a0[3] = 0;
    a0[4] = 1018212795;
    a0[2] = 0;
    *(unsigned short *)&a0[7] = 0;
    memset((char *)&a0[7] + 8, 0, 33);
    return 0;
}
