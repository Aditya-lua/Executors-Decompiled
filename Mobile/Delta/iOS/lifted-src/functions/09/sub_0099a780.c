/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99a780..0x99af14 (1940 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99a780_2 {
    char padding_0[136];
    unsigned long long field_88;
} st_99a780_2;

typedef struct st_99a780_0 {
    unsigned short *field_0;
    unsigned long long field_8;
} st_99a780_0;

typedef struct st_99a780_1 {
    int field_0;
    char padding_4[212];
    void* field_d8;
} st_99a780_1;

typedef struct st_99a780_3 {
    char padding_0[24];
    struct st_99a780_1 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[2100];
    struct st_99a780_2 *field_880;
    char padding_888[360];
    char field_9f0;
    char padding_9f1[31];
    struct st_99a780_4 *field_a10;
} st_99a780_3;

typedef struct st_99a780_4 {
    unsigned long long field_0;
} st_99a780_4;

typedef struct st_99a780_5 {
    char padding_0[4];
    unsigned int field_4;
} st_99a780_5;

extern char g_d28741;
extern st_99a780_5 g_e88ec8;
extern void g_e88ed0;
extern st_99a780_5 g_e89088;
extern st_99a780_5 g_e893d0;

unsigned long long sub_99a780(st_99a780_3 *a0, st_99a780_0 *a1, unsigned long long a2, unsigned long a3, unsigned long long a4, unsigned long long a5)
{
    unsigned short *v8;  // x21
    unsigned long long v9;  // x25
    unsigned long v18;  // x8
    unsigned long v19;  // x26
    unsigned long v20;  // x8
    unsigned long v21;  // x8
    unsigned int v22;  // w27
    unsigned long v23;  // x28
    unsigned long long v24;  // w9
    st_99a780_5 *v25;  // x8
    st_99a780_2 *v26;  // x22
    unsigned long long v27;  // x24
    st_99a780_2 *v10;  // x24
    unsigned long long v28;  // x0
    unsigned long v29;  // x8
    unsigned long long idx;  // x8
    unsigned long v31;  // x8
    unsigned long long v32;  // x9
    unsigned long long v33;  // w21
    unsigned long long v34;  // x22
    void* v35;  // x26
    unsigned long long v36;  // x22
    unsigned long v37;  // x9
    unsigned long v11;  // x27
    unsigned long v38;  // cc_dep1
    unsigned long long v39;  // w10
    int v40;  // w10
    unsigned long long v41;  // 4112
    unsigned long long v42;  // 4105
    unsigned long long v43;  // 4112
    unsigned long long v44;  // 4105
    unsigned long long v45;  // w11
    unsigned long long v12;  // x0
    unsigned long long v13;  // x20
    unsigned long long v14;  // x11
    unsigned long long v15;  // x1
    unsigned long long v16;  // w12
    char *v17;  // x13
    unsigned long v0;  // [bp-0xa8]
    char *v1;  // [bp-0xa0]
    unsigned int v2;  // [bp-0x94], Other Possible Types: unsigned long long
    st_99a780_2 *v3;  // [bp-0x90], Other Possible Types: unsigned long long
    unsigned long v4;  // [bp-0x70]
    unsigned long long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a1->field_0;
    v9 = a1->field_8;
    v10 = a0->field_880;
    *(unsigned long long *)a3 = 0;
    if (a2 >> 7 & 1)
        sub_9a0728(&a0->field_880->padding_0[128]);
    v11 = v10->field_88 + 29;
    v12 = sub_a6bffc(v11 * 40, "ssl/statem/extensions.c", 579);
    if (v12)
    {
        v13 = v12;
        v4 = v11;
        v14 = v12 + 1160;
        if (!((unsigned int)a2 & 128))
            v15 = 2 & ~((unsigned int)a2 >> 7);
        else
            v15 = 1;
        v16 = (unsigned int)a2 & 24704;
        v17 = &a0->field_9f0;
        v0 = 0;
        while (1)
        {
            if (!v9)
            {
                if (a5)
                {
                    v33 = __ROL__((unsigned int)a2, 21) & 0xffe00001 & 1;
                    v34 = 29;
                    v35 = &g_e88ed0;
                    do
                    {
                        v36 = v34;
                        if (!*(long long *)v35 || !(v37 = *(int *)((char *)v35 - 4), v38 = (unsigned int)v37 & (unsigned int)a2, (unsigned int)v37 & (unsigned int)a2))
                            continue;
                        if ((unsigned int)a2 & 0x800 || (int)a0->field_18->field_d8[80] & 8)
                        {
                            v39 = v33;
                            if (v37 >> 2 & 1 && !(v39 = v33, !((int)a0->field_18->field_d8[80] & 8) & (unsigned int)a2 >> 11))
                                continue;
                        }
                        else
                        {
                            v40 = a0->field_18->field_0;
                            if (0x303 < v40)
                            {
                                v41 = arm64g_calculate_condition(201, v38, 0, 0);
                                v42 = arm64g_calculate_condition(3, (v41 & 1 ? v40 : 0x40000000), (v41 & 1 ? 0x10000 : 0), 0);
                                v39 = (unsigned int)!(v42 & 1);
                            }
                            else
                            {
                                v43 = arm64g_calculate_condition(201, v38, 0, 0);
                                v44 = arm64g_calculate_condition(0, (v43 & 1 ? v40 : 0x40000000), (v43 & 1 ? 0x10000 : 0), 0);
                                v39 = (unsigned int)!(v44 & 1);
                            }
                        }
                        if ((v37 >> 3 & 1 || a0->field_48 != 0x300) && !(v39 & 1 & (unsigned int)v37 >> 4 & 1))
                        {
                            if ((unsigned int)v37 & 32)
                                v45 = __ROL__((unsigned int)a2, 25) & 4261412865 & 1;
                            else
                                v45 = 1;
                            if ((v45 | v39) == 1)
                            {
                                if (!*(int *)&a0->padding_4c[44])
                                    v39 = 1;
                                if ((!(v37 >> 5 & 1) || v39) && (!(v37 >> 6 & 1) || !*(int *)&a0->padding_4c[1212]))
                                    (*(long long *)v35)();
                            }
                        }
                    } while ((v35 += 56, v34 = v36 - 1, v36 != 1));
                }
                *(unsigned long long *)a3 = v13;
                if (!a4)
                    return 1;
                *(unsigned long *)a4 = v4;
                return 1;
            }
            if (v9 == 1 || (v9 & 0xfffffffffffffffe) == 2 || (v18 = v8[1], v19 = (unsigned int)((v18 & 0xff00) >> 8) | (unsigned int)v18 * 0x100 & 0xff00ff00, v20 = v9 - 4, v9 = v20 - v19, v20 < v19))
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/extensions.c", 592, "tls_collect_extensions");
                goto LABEL_99ad98;
            }
            v21 = *v8;
            v22 = (unsigned int)((v21 & 0xff00) >> 8) | (unsigned int)v21 * 0x100 & 0xff00ff00;
            v23 = v8 + 2;
            v8 = v23 + v19;
            if (13171 >= (int)v22 && 0x33 >= v22)
                goto *((void *)(sub_99a8cc + (&g_d28741)[v22] * 4));
            switch (v22)
            {
            case 13172:
                v25 = &g_e89088.padding_0[0];
                v24 = 8;
                goto LABEL_99aaa4;
            case 65000:
                v25 = &g_e893d0.padding_0[0];
                v24 = 23;
LABEL_99aaa4:
                v31 = v25->field_4;
                if (!((unsigned int)v31 & (unsigned int)a2))
                    goto LABEL_99ad74;
                if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1))
                {
                    if (v31 >> 1 & 1)
                        goto LABEL_99ad74;
                }
                else
                {
                    if (v31 & 1)
                        goto LABEL_99ad74;
                }
                idx = v13 + v24 * 40;
                if (idx)
                    goto LABEL_99abf8;
                goto LABEL_99aad4;
            case 65281:
                v24 = 0;
                v25 = &g_e88ec8.padding_0[0];
                goto LABEL_99aaa4;
            default:
                v1 = v17;
                v2 = v16;
                v3 = v14;
                v5 = 0;
                v26 = v10;
                v27 = v15;
                v28 = sub_9a06cc(&v10->padding_0[128]);
                if (v28)
                {
                    v29 = *(int *)(v28 + 8);
                    v14 = v3;
                    v16 = v2;
                    v17 = v1;
                    if (!((unsigned int)v29 & (unsigned int)a2))
                        goto LABEL_99ad74;
                    v15 = v27;
                    v10 = v26;
                    if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1))
                    {
                        if (v29 >> 1 & 1)
                            goto LABEL_99ad74;
                    }
                    else
                    {
                        if (v29 & 1)
                            goto LABEL_99ad74;
                    }
                    idx = v14 + 40 * v5;
                    if (idx)
                    {
LABEL_99abf8:
                        if (*(int *)(idx + 16) != 1 && (!(a2 >> 7 & 1) || v22 != 41 || !v9))
                        {
                            if (v16 || (v32 = 3435973837 * (idx - v13 >> 3), 28 < v32 || v22 == 18 || v22 == 44 || v22 == 0xff01 || v17[v32] >> 1 & 1 || v22 == 65000 & (unsigned int)a2 >> 8 & 1))
                            {
                                *(unsigned long *)idx = v23;
                                *(unsigned long *)(idx + 8) = v19;
                                *(unsigned int *)(idx + 16) = 1;
                                *(unsigned int *)(idx + 24) = v22;
                                *(unsigned long *)(idx + 32) = v0;
                                if (a0->field_a10)
                                {
                                    v3 = v10;
                                    v2 = v15;
                                    a0->field_a10();
                                }
                                v0 += 1;
                                continue;
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("ssl/statem/extensions.c", 640, "tls_collect_extensions");
                                goto LABEL_99ad9c;
                            }
                            goto LABEL_99ad9c;
                        }
                    }
LABEL_99aad4:
                    if (!(a2 >> 7 & 1))
                        continue;
                }
                else
                {
                    v14 = v3;
                    v15 = v27;
                    v10 = v26;
                    v16 = v2;
                    v17 = v1;
                    if (!(a2 >> 7 & 1))
                        continue;
                }
            }
            if (v22 == 41 && v9)
            {
LABEL_99ad74:
                sub_a368c8();
                sub_a369bc("ssl/statem/extensions.c", 605, "tls_collect_extensions");
LABEL_99ad98:
LABEL_99ad9c:
                sub_9a58a4();
                sub_a6c2e4(v13, "ssl/statem/extensions.c", 676);
                break;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions.c", 581, "tls_collect_extensions");
        sub_9a58a4(a0, 80, 0x8000f, 0);
    }
    return 0;
}
