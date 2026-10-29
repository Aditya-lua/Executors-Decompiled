/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a5b18..0x9a6620 (2824 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a5b18_3 {
    int field_0;
    char padding_4[212];
    struct st_9a5b18_1 *field_d8;
} st_9a5b18_3;

typedef struct st_9a5b18_4 {
    unsigned int field_0;
    char padding_4[4];
    struct st_9a5b18_0 *field_8;
    char padding_10[8];
    struct st_9a5b18_3 *field_18;
    char padding_20[32];
    unsigned long long field_40;
    unsigned int field_48;
    char padding_4c[44];
    unsigned long long field_78;
    char padding_80[24];
    unsigned int field_98;
    char padding_9c[16];
    unsigned int field_ac;
    char padding_b0[12];
    unsigned int field_bc;
    char padding_c0[56];
    unsigned long long field_f8;
    unsigned long long field_100;
    char padding_108[89];
    char field_161;
    char padding_162[2046];
    struct st_9a5b18_2 *field_960;
} st_9a5b18_4;

typedef struct st_9a5b18_0 {
    char padding_0[288];
    unsigned long long field_120;
} st_9a5b18_0;

typedef struct st_9a5b18_2 {
    unsigned long long field_0;
} st_9a5b18_2;

typedef struct st_9a5b18_1 {
    char padding_0[80];
    char field_50;
    char padding_51[23];
    struct st_9a5b18_2 *field_68;
} st_9a5b18_1;

extern unsigned long long g_9a6720;
extern unsigned long long g_9a6b28;
extern unsigned long long g_9a6ee0;
extern unsigned long long g_9a6ff4;
extern unsigned long long g_9a8a20;
extern unsigned long long g_9ab1d8;
extern unsigned long long g_9b2510;
extern unsigned long long g_9b2894;
extern unsigned long long g_9b2da8;
extern unsigned long long g_9b2fec;
extern unsigned long long g_9b52c8;
extern unsigned long long g_9b6ba8;

unsigned long long sub_9a5b18(st_9a5b18_4 *a0, unsigned long long a1)
{
    st_9a5b18_4 *v7;  // x21
    unsigned long v8;  // x20
    unsigned long long v17;  // x0
    unsigned long long v18;  // x23
    unsigned long v19;  // x8
    unsigned long long v20;  // x0
    unsigned long long *v21;  // x25
    unsigned long v22;  // cc_dep1
    unsigned long long *v23;  // x23
    unsigned long long v24;  // 4105
    unsigned long long v25;  // 4105
    unsigned long long *v26;  // x27
    unsigned long long *v9;  // x24
    unsigned long long v27;  // 4105
    unsigned long long v28;  // 4105
    unsigned long long v29;  // 4105
    unsigned long long v30;  // 4105
    unsigned long long *v31;  // x26
    unsigned long long v32;  // w8
    unsigned long v33;  // cc_op
    unsigned long v34;  // cc_dep1
    unsigned long v35;  // cc_dep2
    unsigned long v36;  // cc_ndep
    unsigned long v10;  // x8
    unsigned int v37;  // w8
    unsigned long long v38;  // 4112
    unsigned long long v39;  // 4102
    unsigned long long v40;  // 4112
    unsigned long long v41;  // 4102
    unsigned long long v42;  // w0
    unsigned long long v43;  // x0
    unsigned long long v44;  // x22
    unsigned long long *v45;  // x23
    unsigned long v46;  // cc_dep1
    unsigned long long v11;  // x0
    unsigned long long *v47;  // x25
    unsigned long long v48;  // 4105
    unsigned long long v49;  // 4105
    unsigned long long *v50;  // x26
    unsigned long long v51;  // 4105
    unsigned long long v52;  // 4105
    unsigned long long *v53;  // x27
    unsigned long long v54;  // 4105
    unsigned long long v55;  // 4105
    unsigned long long v56;  // w8
    unsigned long v12;  // x8
    unsigned long long v57;  // w0
    long long v58;  // x1
    unsigned long long v59;  // w0
    unsigned long long v13;  // x0
    unsigned int v14;  // w8
    long long v15;  // x1
    unsigned long v0;  // [bp-0xd0]
    unsigned long v1;  // [bp-0xc8]
    unsigned long long v2;  // [bp-0xc0]
    char v3;  // [bp-0x8c]
    unsigned long long v4;  // [bp-0x88]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (a0->field_98 == 1)
    {
LABEL_9a5b4c:
        return 0xffffffff;
    }
    v7 = a0;
    v8 = a0->field_40;
    *(unsigned int *)___error(sub_a35af4()) = 0;
    v9 = v7->field_960;
    if (!v7->field_960)
        v9 = v7->field_8->field_120;
    v7->field_bc = v7->field_bc + 1;
    v10 = v7->field_0;
    v11 = v7;
    if (!(unsigned int)v10 || v10 >> 7 & 1 && (v11 = sub_980dc8(v7), v11))
    {
        if (*(int *)(v11 + 180))
        {
            v12 = v7->field_0;
            v13 = v7;
            if ((unsigned int)v12 && (!(v12 >> 7 & 1) || !(v13 = sub_980dc8(v7), v13)))
                goto LABEL_9a5bec;
            if (*(int *)(v13 + 172) || *(int *)(v13 + 152))
                goto LABEL_9a5bec;
        }
    }
    if (!(v7->field_161 >> 3 & 1) && !sub_95e07c(v7))
        goto LABEL_9a5b4c;
LABEL_9a5bec:
    v14 = v7->field_98;
    switch (v14)
    {
    case 0:
        v7->field_ac = 0;
        *(unsigned int *)&v7->padding_b0[0] = 0;
    case 4:
        *(unsigned int *)&v7->field_78 = a1;
        if (v9 && (!*(long long *)&v7->padding_162[254] || !*(long long *)&v7->padding_162[390] || v7->field_18->field_d8->field_50 >> 3 & 1 || v7->field_18->field_0 < 772 || v7->field_18->field_0 == 0x10000))
            v9();
        if (!(v7->field_18->field_d8->field_50 >> 3 & 1))
        {
            if ((v7->field_48 & 0xffffff00) == 0x300)
                goto LABEL_9a5ca4;
            sub_a368c8();
            v15 = 422;
        }
        else if ((v7->field_48 & 0xff00) == 0xfe00 || !a1 && (v7->field_48 & 0xff00) == 0x100)
        {
LABEL_9a5ca4:
            if (!sub_959e54(v7, 9, 0))
            {
                sub_a368c8();
                v15 = 428;
            }
            else if (v7->field_f8)
            {
LABEL_9a5cc4:
                *(unsigned long long *)&v7->padding_108[0] = 0;
                *(unsigned int *)&v7->padding_162[86] = 0;
                if (sub_96295c(v7))
                {
                    v19 = v7->field_0;
                    v20 = v7;
                    if (!(unsigned int)v19 || v19 >> 7 & 1 && (v20 = sub_980dc8(v7), v20))
                    {
                        if (!*(int *)(v20 + 172) && !*(int *)(v20 + 152))
                            goto LABEL_9a5d0c;
                    }
                    if (!*(int *)&v7[1].padding_162[214])
                        goto LABEL_9a5d30;
LABEL_9a5d0c:
                    if (sub_9ae0fc(v7))
                    {
                        if (!*(long long *)&v7->padding_162[254] || !*(long long *)&v7->padding_162[390])
                            *(unsigned int *)&v7->padding_b0[8] = 1;
LABEL_9a5d30:
                        *(double *)&v7->field_98 = 1.5e-323;
                        v14 = 3;
                        goto LABEL_9a5d40;
                    }
                    goto LABEL_9a65b0;
                }
                else
                {
                    sub_a368c8();
                    v15 = 460;
                }
            }
            else
            {
                v17 = sub_9ebce0();
                if (v17)
                {
                    v18 = v17;
                    if (sub_9ebd68())
                    {
                        v7->field_f8 = v18;
                        goto LABEL_9a5cc4;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem.c", 438, "state_machine");
                        v44 = 0xffffffff;
                        sub_9a58a4(v7, 0xffffffff, 0xc0103, 0);
                        v43 = v18;
                        goto LABEL_9a65b8;
                    }
                    goto LABEL_9a65b8;
                }
                else
                {
                    sub_a368c8();
                    v15 = 434;
                }
            }
        }
        else
        {
            sub_a368c8();
            v15 = 417;
        }
        sub_a369bc("ssl/statem/statem.c", v15, "state_machine");
        v44 = 0xffffffff;
        sub_9a58a4(v7, 0xffffffff, 0xc0103, 0);
        v43 = 0;
LABEL_9a65b8:
        v7->field_bc = v7->field_bc - 1;
        sub_9ebcf4(v43);
        if (!v9)
            return v44;
        v9();
    default:
LABEL_9a5d40:
        if (v14 == 2)
        {
            v0 = v8;
            v4 = 0;
            v45 = v7->field_960;
            if (!v7->field_960)
                v45 = v7->field_8->field_120;
            v46 = (unsigned int)v7->field_78;
            if (!(int)v7->field_78)
            {
                v47 = &g_9a6720;
                v48 = arm64g_calculate_condition(3, v46, 0, 0);
                if (!(v48 & 1))
                    goto LABEL_9a60a6;
LABEL_9a60a5:
                v50 = &g_9a8a20;
                v51 = arm64g_calculate_condition(3, v46, 0, 0);
                if (!(v51 & 1))
                    goto LABEL_9a60aa;
LABEL_9a60a9:
                v53 = &g_9ab1d8;
                v54 = arm64g_calculate_condition(3, v46, 0, 0);
                if (!(v54 & 1))
                    goto LABEL_9a60ae;
LABEL_9a60ad:
            }
            else
            {
                v47 = &g_9b2510;
                v49 = arm64g_calculate_condition(3, v46, 0, 0);
                if (v49 & 1)
                    goto LABEL_9a60a5;
LABEL_9a60a6:
                v50 = &g_9b52c8;
                v52 = arm64g_calculate_condition(3, v46, 0, 0);
                if (v52 & 1)
                    goto LABEL_9a60a9;
LABEL_9a60aa:
                v53 = &g_9b6ba8;
                v55 = arm64g_calculate_condition(3, v46, 0, 0);
                if (v55 & 1)
                    goto LABEL_9a60ad;
LABEL_9a60ae:
            }
            if (*(int *)&v7->padding_b0[8])
            {
                *(unsigned int *)&v7[1].padding_4c[28] = 1;
                *(unsigned int *)&v7->padding_b0[8] = 0;
            }
            v56 = *(int *)&v7->padding_9c[8];
            if (v56 == 2)
                v53();
            if (v56 != 1)
            {
                if (!v56)
                {
                    if (!(v7->field_18->field_d8->field_50 >> 3 & 1))
                        v57 = (unsigned int)sub_9b0894(v7, &v3);
                    else
                        v57 = (unsigned int)sub_9aca88(v7, &v3);
                    if (v57)
                    {
                        if (v45)
                            v45();
                        v47();
                    }
                }
                else
                {
                    sub_a368c8();
                    v58 = 716;
LABEL_9a6418:
                    sub_a369bc("ssl/statem/statem.c", v58, "read_state_machine");
                    sub_9a58a4(v7, 80, 0xc0103, 0);
                }
            }
            else
            {
                if (!(v7->field_18->field_d8->field_50 >> 3 & 1))
                    v59 = (unsigned int)sub_9b0ae8(v7, &v4);
                else
                    v59 = (unsigned int)sub_9ad334(v7, &v4);
                if (v59)
                {
                    *(unsigned int *)&v7[1].padding_4c[28] = 0;
                    if ((long long)v4 >= 0)
                    {
                        v1 = v7->field_100;
                        v2 = v4;
                        v50();
                    }
                    sub_a368c8();
                    v58 = 660;
                    goto LABEL_9a6418;
                    goto LABEL_9a6418;
                }
            }
            v43 = 0;
            v44 = 0xffffffff;
            goto LABEL_9a65b8;
        }
        else if (v14 == 3)
        {
            v21 = v7->field_960;
            if (!v7->field_960)
                v21 = v7->field_8->field_120;
            v22 = (unsigned int)v7->field_78;
            if (!(int)v7->field_78)
            {
                v23 = &g_9a6ee0;
                v24 = arm64g_calculate_condition(3, v22, 0, 0);
                if (!(v24 & 1))
                    goto LABEL_9a5e12;
LABEL_9a5e11:
                v26 = &g_9a6ff4;
                v27 = arm64g_calculate_condition(3, v22, 0, 0);
                if (!(v27 & 1))
                    goto LABEL_9a5e16;
LABEL_9a5e15:
                v29 = arm64g_calculate_condition(3, v22, 0, 0);
                if (!(v29 & 1))
                    goto LABEL_9a5e1a;
LABEL_9a5e19:
                v31 = &g_9a6b28;
            }
            else
            {
                v23 = &g_9b2da8;
                v25 = arm64g_calculate_condition(3, v22, 0, 0);
                if (v25 & 1)
                    goto LABEL_9a5e11;
LABEL_9a5e12:
                v26 = &g_9b2fec;
                v28 = arm64g_calculate_condition(3, v22, 0, 0);
                if (v28 & 1)
                    goto LABEL_9a5e15;
LABEL_9a5e16:
                v30 = arm64g_calculate_condition(3, v22, 0, 0);
                if (v30 & 1)
                    goto LABEL_9a5e19;
LABEL_9a5e1a:
                v31 = &g_9b2894;
            }
            v32 = *(int *)&v7->padding_9c[0];
            if (1 >= v32)
            {
                if (v32)
                {
                    if (v32 == 1)
                        v23();
                }
                else
                {
                    if (v21)
                        v21();
                    v31();
                }
                goto LABEL_9a657c;
            }
            else
            {
                v33 = 3;
                v34 = v32;
                v35 = 2;
                v36 = 0;
                if (v32 != 2)
                {
                    if (v32 == 3)
                        v26();
LABEL_9a657c:
                    sub_c65438(936, v7, 0xc0103);
                }
                else
                {
                    if (v7->field_18->field_d8->field_50 >> 3 & 1 && *(int *)&v7->padding_c0[8])
                        sub_953b30(v7);
                    v37 = v7->field_ac;
                    if (v37 != 39)
                    {
                        v38 = arm64g_calculate_condition(v33 | 16, v34, v35, v36);
                        v39 = arm64g_calculate_condition(19, (v38 & 1 ? v37 : 0x40000000), (v38 & 1 ? 18 : 0), 0);
                        if (v39 & 1)
                            v7->field_18->field_d8->field_68();
                    }
                    else
                    {
                        v40 = arm64g_calculate_condition(v33 | 16, v34, v35, v36);
                        v41 = arm64g_calculate_condition(16, (v40 & 1 ? v37 : 0x40000000), (v40 & 1 ? 18 : 0), 0);
                        if (v41 & 1)
                            v7->field_18->field_d8->field_68();
                    }
                    if (!(v7->field_18->field_d8->field_50 >> 3 & 1))
                        v42 = (unsigned int)sub_9adec4(v7, 20);
                    else
                        v42 = (unsigned int)sub_c655dc(v7, 20);
                    if (v42 >= 1)
                    {
                        *(double *)&v7->padding_9c[0] = 8.4879831653e-314;
                        v26();
                    }
                }
            }
            goto LABEL_9a65b0;
        }
        else if (v14 == 4)
        {
            v43 = 0;
            v44 = 1;
            goto LABEL_9a65b8;
        }
        else
        {
            if (v14 != 1 || !*(int *)&v7->padding_b0[4])
                sub_c654fc(v7);
            sub_a368c8();
            sub_a369bc("ssl/statem/statem.c", 503, "state_machine");
            sub_a36abc(20, 0xc0101, 0);
LABEL_9a65b0:
            v43 = 0;
            v44 = 0xffffffff;
            goto LABEL_9a65b8;
        }
        goto LABEL_9a65b8;
    }
}
