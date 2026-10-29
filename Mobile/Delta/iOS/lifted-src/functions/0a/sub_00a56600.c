/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa56600..0xa56e60 (2144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a56600_3 {
    char padding_0[4];
    char field_4;
    char padding_5[107];
    struct st_a56600_2 *field_70;
    char padding_78[8];
    struct st_a56600_2 *field_80;
} st_a56600_3;

typedef struct st_a56600_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
    char padding_18[16];
    struct st_a56600_1 *field_28;
    char padding_30[72];
    struct st_a56600_3 *field_78;
    char padding_80[32];
    char field_a0;
} st_a56600_0;

typedef struct st_a56600_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[128];
    unsigned long long field_90;
    char padding_98[24];
    struct st_a56600_2 *field_b0;
} st_a56600_1;

typedef struct st_a56600_4 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[24];
    struct st_a56600_0 *field_28;
    unsigned long long field_30;
    char padding_38[8];
    unsigned long long field_40;
} st_a56600_4;

typedef struct st_a56600_2 {
    unsigned long long field_0;
} st_a56600_2;

extern char g_a57e08;
extern unsigned long long g_c7c2eb;
extern char g_10002b0;

unsigned long long sub_a56600(st_a56600_4 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, long long a4, long long a5, unsigned long long a6, unsigned long long a7, unsigned int a8, unsigned long a9)
{
    long long v14;  // x25
    unsigned long long v15;  // x23
    unsigned long long v24;  // x0
    unsigned long long v25;  // x8
    unsigned long long v26;  // w0
    unsigned long v27;  // cc_dep1
    unsigned short v28;  // x9
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4102
    unsigned long long v31;  // 4112
    unsigned long long v32;  // 4102
    unsigned long long v16;  // x20
    unsigned long long v34;  // x0
    unsigned long long v35;  // x0
    long long v37;  // x1
    unsigned long long v38;  // x21
    unsigned long long v40;  // x0
    unsigned long v41;  // cc_op
    unsigned long v42;  // cc_dep1
    unsigned long v43;  // cc_dep2
    unsigned long long v17;  // x0
    unsigned long v44;  // cc_ndep
    unsigned long long v45;  // 4110
    unsigned long long v46;  // 4102
    unsigned long long v47;  // 4110
    unsigned long long v48;  // 4102
    st_a56600_0 *v18;  // x22
    unsigned long long v49;  // x0
    unsigned long long v50;  // x28
    unsigned long long v51;  // x24
    long long v52;  // x0
    long long v53;  // x0
    unsigned long long v54;  // x9
    long long v55;  // x0
    unsigned long long v19;  // w28
    unsigned long long v56;  // x0
    long long v57;  // x0
    unsigned long long v58;  // x27
    unsigned long long v60;  // w8
    long long v20;  // x0
    long long v63;  // x1
    st_a56600_3 *v64;  // x8
    unsigned long long v65;  // x22
    unsigned long long v66;  // w8
    st_a56600_0 *v67;  // x8
    st_a56600_0 *v21;  // x19
    st_a56600_0 *v68;  // x8
    unsigned long long v69;  // w0
    unsigned long long v22;  // w9
    st_a56600_1 *v23;  // x24
    unsigned long v0;  // [bp-0x100]
    unsigned long long v1;  // [bp-0xf8]
    unsigned long long v2;  // [bp-0xe8]
    unsigned int v3;  // [bp-0xe0]
    unsigned long long v4;  // [bp-0xdc]
    unsigned int v5;  // [bp-0xcc]
    unsigned long long v6;  // [bp-0xc8]
    unsigned long long v7;  // [bp-0xc0]
    unsigned long long v8;  // [bp-0xb0]
    unsigned long long v9;  // [bp-0xa0]
    unsigned long long v10;  // [bp-0x90]
    unsigned long long v11;  // [bp-0x80]
    unsigned long v12;  // [bp-0x68]
    char *v13;  // [bp-0x10]

    v13 = &a8;
    v14 = a5;
    v15 = a3;
    v16 = a2;
    v12 = *(long long *)&g_10002b0;
    v6 = 0;
    v10 = 0;
    v11 = 0;
    v8 = 0;
    v9 = 0;
    v7 = 0;
    v17 = sub_a3f7a4();
    if ((unsigned int)v17)
    {
        v18 = a0->field_28;
        if (!v18)
        {
            if (a6)
            {
                v17 = sub_a5d784(a7, a6);
                a0->field_28 = v17;
                if (!v17)
                {
                    if (*(long long *)&g_10002b0 == v12)
                        return v17;
                    ___stack_chk_fail();
                }
            }
            else
            {
                v17 = sub_a5d5a8(a4, a7, v14);
                a0->field_28 = v17;
                if (!v17)
                {
                    if (*(long long *)&g_10002b0 == v12)
                        return v17;
                    ___stack_chk_fail();
                }
            }
        }
        v19 = a8;
        v20 = sub_a50dd0(a0, 0x800);
        v21 = a0->field_28;
        sub_a36c8c(v20, 0x800);
        if (!*(long long *)&v21->padding_18[8])
        {
LABEL_a56a0c:
            sub_a36cd4();
            sub_a55830(v6);
            v6 = 0;
            if (!v16 && v15)
                v16 = sub_a58d6c(v21->field_8, v15);
            if (!a0->field_28->field_78)
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/m_sigver.c", 305, "do_sigver_init");
                v63 = 150;
                goto LABEL_a56af4;
            }
            if (!(a0->field_28->field_78->field_4 >> 2 & 1) && !v16)
            {
                if ((int)sub_a5b4d0(a7, &v5) > 0)
                {
                    v16 = sub_a58d60(sub_a9976c(v5));
                    if (v16)
                        goto LABEL_a56a74;
                }
                sub_a368c8();
                sub_a369bc("crypto/evp/m_sigver.c", 318, "do_sigver_init");
                v63 = 158;
LABEL_a56af4:
                sub_a36abc(6, v63, 0);
            }
            else
            {
LABEL_a56a74:
                v64 = a0->field_28->field_78;
                if (v19)
                {
                    if (v64->field_80)
                        v64->field_80();
                    v65 = a1;
                    if (*(long long *)&v64[1].padding_5[75])
                    {
                        v66 = 32;
                        goto LABEL_a56b50;
                    }
                    if (1 <= (int)sub_a5ffd0())
                        goto LABEL_a56b60;
                }
                else
                {
                    if (v64->field_70)
                        v64->field_70();
                    v65 = a1;
                    if (*(long long *)&v64[1].padding_5[67])
                    {
                        v66 = 16;
LABEL_a56b50:
                        *(unsigned int *)&a0->field_28->field_0 = v66;
                        a0->field_30 = &g_a57e08;
                        goto LABEL_a56b60;
                    }
                    else if (1 <= (int)sub_a5f634())
                    {
LABEL_a56b60:
                        if ((int)sub_a5e2fc(a0->field_28, v16) >= 1)
                        {
                            v67 = a0->field_28;
                            if (v65)
                                *(st_a56600_0 **)v65 = v67;
                            if (!(v67->field_78->field_4 >> 2 & 1))
                            {
                                v17 = sub_a3fe04(a0, v16, a6);
                                if ((unsigned int)v17)
                                {
                                    a0->field_28->field_a0 = a0->field_28->field_a0 & 254;
                                    v68 = a0->field_28;
                                    if (v68->field_78[1].field_70)
                                        v68->field_a0 = v68->field_a0 | 1;
                                    v69 = (unsigned int)sub_a5ec84(v21);
                                    sub_a55830(v6);
                                    if (*(long long *)&g_10002b0 == v12)
                                        return v69 > 0;
                                    ___stack_chk_fail();
                                }
                                else
                                {
                                    if (*(long long *)&g_10002b0 == v12)
                                        return v17;
                                    ___stack_chk_fail();
                                }
                            }
                            else
                            {
                                if (*(long long *)&g_10002b0 == v12)
                                    return 1;
                                ___stack_chk_fail();
                            }
                        }
                    }
                }
            }
LABEL_a56e18:
            if (*(long long *)&g_10002b0 == v12)
                return 0;
            ___stack_chk_fail();
        }
        if (!v18)
        {
            v23 = 0;
            if (!v14)
            {
LABEL_a56700:
                v14 = v21->field_10;
            }
        }
        else if (!a7)
        {
            if (!v19)
                v22 = 128;
            else
                v22 = 0x100;
            if ((int)v21->field_0 != v22)
                goto LABEL_a566f4;
            v23 = v21->field_28;
            if (!v23 || !*(long long *)&v21->padding_30[0])
                goto LABEL_a566f8;
            v18 = 1;
            if (!v14)
                goto LABEL_a56700;
        }
        else
        {
LABEL_a566f4:
            v23 = 0;
LABEL_a566f8:
            v18 = 0;
            if (!v14)
                goto LABEL_a56700;
        }
        if (!*(long long *)&v21->padding_80[8])
        {
            sub_a368c8(sub_a36e70());
            sub_a369bc("crypto/evp/m_sigver.c", 87, "do_sigver_init");
            goto LABEL_a56dfc;
        }
        if (!(v18 & 0x1))
        {
            v4 = v19;
            sub_a5d5bc(v21);
            v40 = *(long long *)&v21->padding_18[8];
            if (*(long long *)(*(long long *)&v21->padding_80[8] + 96))
            {
                v45 = arm64g_calculate_condition(v41 | 16, v42, v43, v44);
                v46 = arm64g_calculate_condition(20, (v45 & 1 ? *(long long *)(*(long long *)&v21->padding_80[8] + 96) : 0x40000000), (v45 & 1 ? v40 : 0), 0);
                if (v46 & 1)
                    goto LABEL_a56e54;
                goto LABEL_a567e0;
            }
            else
            {
                v47 = arm64g_calculate_condition(v41 | 16, v42, v43, v44);
                v48 = arm64g_calculate_condition(16, (v47 & 1 ? 0 : 0x40000000), (v47 & 1 ? v40 : 0), 0);
                if (!(v48 & 1))
                {
LABEL_a567e0:
                    v49 = sub_a551d4(v40, 12);
                    if (v49)
                    {
                        v50 = v49;
                        sub_a5ed84(v23);
                        sub_a55830(v6);
                        v6 = 0;
                        v51 = sub_a5ee08(v21->field_8, v50, v21->field_10);
                        v3 = (unsigned int)v18;
                        if (v51)
                        {
                            v52 = sub_9ffdd0(v51);
                            v53 = sub_c4ba8(*(long long *)&v21->padding_18[8]);
                            v6 = sub_a55240(v52, v53, v21->field_10);
                            if (v6)
                            {
                                v2 = sub_a5a1f8(*(long long *)&v21->padding_80[8], v21->field_8, &v6, v21->field_10);
                                if (v6)
                                    goto LABEL_a5694c;
                            }
                            else
                            {
                                v2 = 0;
                            }
                            sub_a55830(v6);
LABEL_a5694c:
                            v54 = v2;
                        }
                        else
                        {
                            v54 = 0;
                        }
                        if (v54)
                        {
                            v19 = v4;
                            goto LABEL_a56d6c;
                        }
                        else
                        {
                            sub_a5ed84(v51);
                            sub_a55830(v6);
                            v6 = 0;
                            v55 = sub_975ff4(*(long long *)&v21->padding_18[8]);
                            v56 = sub_a5f60c(v55, v50, v21->field_10);
                            v19 = v4;
                            if (!v56)
                                goto LABEL_a56a0c;
                            v51 = v56;
                            v57 = sub_c4ba8(*(long long *)&v21->padding_18[8]);
                            v6 = sub_a55240(v55, v57, v21->field_10);
                            if (v6)
                            {
                                v58 = sub_a5a1f8(*(long long *)&v21->padding_80[8], v21->field_8, &v6, v21->field_10);
                                if (v6)
                                    goto LABEL_a56d60;
                            }
                            else
                            {
                                v58 = 0;
                            }
                            sub_a55830(v6);
LABEL_a56d60:
                            if (!v58)
                            {
                                sub_a368c8(sub_a36e70(sub_a5ed84(v51)));
                                v37 = 0xbb;
                                goto LABEL_a56df0;
                            }
                            else
                            {
LABEL_a56d6c:
                                sub_a36cd4();
                                v21->field_28 = v51;
                                if (!v19)
                                    v60 = 128;
                                else
                                    v60 = 0x100;
                                *(unsigned int *)&v21->field_0 = v60;
                                sub_a79f54();
                                (*(long long *)(v51 + 40))();
                            }
                        }
                    }
                    else
                    {
                        sub_a368c8(sub_a36e70());
                        v37 = 112;
                        goto LABEL_a56df0;
                    }
                    goto LABEL_a56df0;
                }
                else
                {
LABEL_a56e54:
                    sub_c67880(v40);
LABEL_a56e04:
                    sub_a5d5bc(v21);
                    *(unsigned int *)&v21->field_0 = 0;
                    sub_a55830(v6);
                }
            }
            goto LABEL_a56e18;
        }
        if (!v16 && !v15)
        {
            v15 = sub_a50a58(a0->field_0);
            if (v15 && !_strcmp(v15, "UNDEF"))
                v15 = 0;
        }
        if (a1)
            *(st_a56600_0 **)a1 = v21;
        if (v16)
        {
            a0->field_0 = v16;
            if (v15 || (v24 = sub_a50a58(v16), !v24 || _strcmp(v24, "UNDEF")))
                goto LABEL_a56938;
        }
        else
        {
            if (!v15)
                v25 = v18 & 0xffffffff;
            else
                v25 = 1;
            if (v25 & 1)
            {
                if (v15)
                    goto LABEL_a56904;
                goto LABEL_a56938;
            }
            v26 = (unsigned int)sub_a55054(v6, 0, &v7, 80);
            v27 = v26;
            if (v26 >= 1)
            {
                v28 = *(unsigned short *)((void*)&v7 + 4);
                if ((unsigned int)v7 == 1162104405)
                {
                    v29 = arm64g_calculate_condition(3, v27, 1, 0);
                    v30 = arm64g_calculate_condition(3, (v29 & 1 ? v28 : 0), (v29 & 1 ? 70 : 0), 0);
                    if (!(v30 & 1))
                        goto LABEL_a56900;
                }
                else
                {
                    v31 = arm64g_calculate_condition(3, v27, 1, 0);
                    v32 = arm64g_calculate_condition(0, (v31 & 1 ? v28 : 0), (v31 & 1 ? 70 : 0), 0);
                    if (!(v32 & 1))
                    {
LABEL_a56900:
                        v15 = &v7;
LABEL_a56904:
                        sub_a36c8c(sub_a3f3d0(a0, 1, 0), 1, 0);
                        v34 = sub_a40ca8(v21->field_8, v15, v14);
                        a0->field_40 = v34;
                        if (v34)
                        {
                            a0->field_0 = v34;
                            a0->field_8 = v34;
                        }
                        else
                        {
                            v35 = sub_a58d60(v15);
                            a0->field_0 = v35;
                            a0->field_8 = v35;
                            if (!v35)
                            {
                                sub_a368c8(sub_a36e70());
                                v37 = 247;
LABEL_a56df0:
                                sub_a369bc("crypto/evp/m_sigver.c", v37, "do_sigver_init");
LABEL_a56dfc:
LABEL_a56e00:
                                sub_a36abc();
                                goto LABEL_a56e04;
                            }
                        }
                        sub_a36cd4();
                    }
                }
            }
        }
LABEL_a56938:
        if (!*(long long *)&v23->padding_10[0])
            v38 = &g_c7c2eb;
        else
            v38 = *(long long *)&v23->padding_10[0];
        if (v19)
        {
            if (!v23->field_b0)
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/m_sigver.c", 258, "do_sigver_init");
                v0 = v23->field_8;
                v1 = v38;
            }
            else
            {
                v23->field_b0();
            }
        }
        else
        {
            if (v23->field_90)
                v23->field_90();
            sub_a368c8();
            sub_a369bc("crypto/evp/m_sigver.c", 266, "do_sigver_init");
            v0 = v23->field_8;
            v1 = v38;
        }
        goto LABEL_a56e00;
    }
    else
    {
        if (*(long long *)&g_10002b0 == v12)
            return v17;
        ___stack_chk_fail();
    }
}
