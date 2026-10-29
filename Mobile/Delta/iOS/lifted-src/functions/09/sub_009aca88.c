/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9aca88..0x9ad334 (2220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9aca88_5 {
    char padding_0[24];
    struct st_9aca88_0 *field_18;
    char padding_20[88];
    unsigned int field_78;
    char padding_7c[48];
    unsigned int field_ac;
    char padding_b0[72];
    struct st_9aca88_2 *field_f8;
    unsigned long long field_100;
    char padding_108[496];
    unsigned int field_2f8;
    char padding_2fc[500];
    struct st_9aca88_4 *field_4f0;
    struct st_9aca88_6 *field_4f8;
} st_9aca88_5;

typedef struct st_9aca88_0 {
    char padding_0[128];
    struct st_9aca88_1 *field_80;
} st_9aca88_0;

typedef struct st_9aca88_2 {
    char padding_0[8];
    struct st_9aca88_3 *field_8;
} st_9aca88_2;

typedef struct st_9aca88_7 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    char field_10;
    char field_11;
} st_9aca88_7;

typedef struct st_9aca88_4 {
    char padding_0[272];
    unsigned short field_110;
    char padding_112[6];
    long long field_118;
    char padding_120[88];
    char field_178;
    char padding_179[7];
    unsigned long long field_180;
    char field_188;
    char field_189;
} st_9aca88_4;

typedef struct st_9aca88_6 {
    unsigned int field_0;
} st_9aca88_6;

typedef struct st_9aca88_1 {
    unsigned long long field_0;
} st_9aca88_1;

typedef struct st_9aca88_3 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
    char field_4;
    char field_5;
    char padding_6[3];
    char field_9;
    char field_a;
    char field_b;
} st_9aca88_3;

extern char g_10002b0;

unsigned int sub_9aca88(st_9aca88_5 *a0, unsigned int *a1)
{
    st_9aca88_7 *v7;  // x8
    unsigned int i;  // x0
    unsigned long long v17;  // 4112
    unsigned long v18;  // 4112
    unsigned long long v19;  // 4112
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4102
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4102
    unsigned int v24;  // x0
    unsigned int v25;  // w27
    unsigned int v26;  // x20
    unsigned long v9;  // x25
    unsigned int v27;  // w8
    char *v28;  // x3
    unsigned long long v29;  // x8
    char v30;  // x9
    char v31;  // x10
    unsigned int v32;  // x19
    unsigned int v10;  // w9
    unsigned int v11;  // w10
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // 4112
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned long long v0;  // [bp-0x1f8]
    st_9aca88_4 *v1;  // [bp-0x1f0]
    st_9aca88_7 *v2;  // [bp-0x1e8]
    unsigned long v3;  // [bp-0x178]
    unsigned long v4;  // [bp-0x70]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = a0->field_4f0;
    v7 = &a0->field_4f0->field_178;
    memset(v7, 0, 64);
    v2 = v7;
    v3 = sub_954340(a0->field_4f0->field_118);
    i = sub_9543a4(&v3);
    if (i)
    {
        do
        {
            v9 = *(long long *)(i + 8);
            v10 = *(short *)(v9 + 16);
            v11 = a0->field_4f0->field_110;
            v12 = v10 & 0xffff;
            v13 = v11 & 0xffff;
            if (v11 <= v10)
            {
                v25 = 0;
                if (*(long long *)(v9 + 72))
                    break;
LABEL_9acc44:
                if (!(a0->field_4f0->field_110 != *(short *)(v9 + 16) & ~(v25 & 1)))
                {
                    v26 = *(long long *)(v9 + 32);
                    sub_954348(a0->field_4f0->field_118);
                    if (sub_9add70(a0, v9))
                    {
                        if (*(long long *)(v9 + 32))
                            _memcpy(&(&a0->field_f8->field_8->field_0)[*(long long *)(v9 + 24) + 12], *(long long *)(v9 + 64));
                        sub_a6c2e4(*(long long *)(v9 + 64), "ssl/statem/statem_dtls.c", 109);
                        sub_a6c2e4(*(long long *)(v9 + 72), "ssl/statem/statem_dtls.c", 110);
                        sub_a6c2e4(v9, "ssl/statem/statem_dtls.c", 111);
                        sub_954264(i);
                        if (v25)
                            *(unsigned int *)&a0->field_4f0->padding_0[270] = 0;
                        *(unsigned long long *)&a0->padding_108[0] = v26;
                        v27 = a0->field_2f8;
                        *a1 = v27;
                        v28 = &a0->field_f8->field_8->field_0;
                        if (v27 != 0x101)
                        {
                            v29 = v1->field_180;
                            *v28 = v1->field_178;
                            v30 = v29 >> 16;
                            v28[1] = v30;
                            v31 = v29 >> 8;
                            v28[2] = v31;
                            v28[3] = v29;
                            v28[4] = v1->field_189;
                            v28[5] = v1->field_188;
                            *(unsigned short *)&v28[6] = 0;
                            v28[8] = 0;
                            v28[9] = v30;
                            v28[10] = v31;
                            v28[11] = v29;
                            memset(v2, 0, 64);
                            a0->field_4f0->field_110 = a0->field_4f0->field_110 + 1;
                            a0->field_100 = a0->field_f8->field_8 + 1;
                        }
                        else if (a0->field_4f8)
                        {
                            a0->field_4f8();
                        }
                        v32 = 1;
                    }
                    else
                    {
                        sub_a6c2e4(*(long long *)(v9 + 64), "ssl/statem/statem_dtls.c", 109);
                        sub_a6c2e4(*(long long *)(v9 + 72), "ssl/statem/statem_dtls.c", 110);
                        sub_a6c2e4(v9, "ssl/statem/statem_dtls.c", 111);
                        sub_954264(i);
                        *(unsigned long long *)&a0->padding_108[0] = 0;
                        v32 = 0;
                    }
                    if (*(long long *)&g_10002b0 == v4)
                        return v32;
                    ___stack_chk_fail();
                }
                break;
            }
            if (v11 == 1)
            {
                v14 = arm64g_calculate_condition(3, v12, v13, 0);
                v15 = 3;
                v16 = (v14 & 1 ? v10 & 0xffff : 0);
                v17 = arm64g_calculate_condition(3, v16, 0, 0);
                if (!(v17 & 1))
                    goto LABEL_9acb92;
                goto LABEL_9acb91;
            }
            else
            {
                v18 = arm64g_calculate_condition(3, v12, v13, 0);
                v15 = 0;
                v16 = (v18 & 1 ? v10 & 0xffff : 0);
                v19 = arm64g_calculate_condition(0, v16, 0, 0);
                if (v19 & 1)
                {
LABEL_9acb91:
                    v20 = arm64g_calculate_condition(v15, v16, 0, 0);
                    v21 = arm64g_calculate_condition(3, (v20 & 1 ? a0->field_78 : 0x40000000), 0, 0);
                    if (v21 & 1)
                        continue;
                    goto LABEL_9acb98;
                }
                else
                {
LABEL_9acb92:
                    v22 = arm64g_calculate_condition(v15, v16, 0, 0);
                    v23 = arm64g_calculate_condition(0, (v22 & 1 ? a0->field_78 : 0x40000000), 0, 0);
                    if (v23 & 1)
                        continue;
LABEL_9acb98:
                    if (a0->field_ac == 23)
                    {
                        v24 = sub_9543a4(&v3);
                        if (v24 && *(short *)(*(long long *)(v24 + 8) + 16) == a0->field_4f0->field_110)
                        {
                            v0 = v24;
                            sub_954348(a0->field_4f0->field_118);
                            sub_a6c2e4(*(long long *)(v9 + 64), "ssl/statem/statem_dtls.c", 109);
                            sub_a6c2e4(*(long long *)(v9 + 72), "ssl/statem/statem_dtls.c", 110);
                            sub_a6c2e4(v9, "ssl/statem/statem_dtls.c", 111);
                            sub_954264(i);
                            v25 = 0;
                            v9 = *(long long *)(v24 + 8);
                            i = v0;
                            if (*(long long *)(*(long long *)(v24 + 8) + 72))
                                break;
                            goto LABEL_9acc44;
                        }
                        else
                        {
                            v25 = 1;
                            if (*(long long *)(v9 + 72))
                                break;
                            goto LABEL_9acc44;
                        }
                    }
                }
            }
            sub_954348(a0->field_4f0->field_118);
            sub_a6c2e4(*(long long *)(v9 + 64), "ssl/statem/statem_dtls.c", 109);
            sub_a6c2e4(*(long long *)(v9 + 72), "ssl/statem/statem_dtls.c", 110);
            sub_a6c2e4(v9, "ssl/statem/statem_dtls.c", 111);
            sub_954264(i);
            i = sub_9543a4(&v3);
        } while (i);
    }
    a0->field_18->field_80();
}
