/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96cc84..0x96d378 (1780 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96cc84_0 {
    char padding_0[1640];
    unsigned long long field_668;
} st_96cc84_0;

typedef struct st_96cc84_2 {
    int field_0;
    char padding_4[212];
    struct st_96cc84_1 *field_d8;
} st_96cc84_2;

typedef struct st_96cc84_4 {
    unsigned long long field_0;
    struct st_96cc84_0 *field_8;
    char padding_10[8];
    struct st_96cc84_2 *field_18;
    char padding_20[88];
    unsigned int field_78;
    char padding_7c[156];
    unsigned int field_118;
    char padding_11c[484];
    void* field_300;
    char padding_308[200];
    struct st_96cc84_3 *field_3d0;
    unsigned long long field_3d8;
    char padding_3e0[40];
    struct st_96cc84_5 *field_408;
    char padding_410[1136];
    void* field_880;
    char padding_888[712];
    char field_b50;
    char padding_b51[1];
    char field_b52;
} st_96cc84_4;

typedef struct st_96cc84_3 {
    char padding_0[16];
    unsigned short field_10;
    char padding_12[6];
    unsigned int field_18;
    unsigned int field_1c;
    unsigned int field_20;
} st_96cc84_3;

typedef struct st_96cc84_5 {
    unsigned int field_0;
} st_96cc84_5;

typedef struct st_96cc84_1 {
    char padding_0[80];
    unsigned int field_50;
} st_96cc84_1;

extern unsigned long long g_d282a4;
extern unsigned long long g_d282a6;
extern char g_10002b0;

unsigned long long sub_96cc84(st_96cc84_4 *a0, unsigned long long a1)
{
    unsigned long v5;  // x21
    unsigned long long v6;  // x0
    unsigned long idx;  // x24
    unsigned long long v16;  // x0
    unsigned int v17;  // w8
    unsigned long long v18;  // w9
    unsigned long v19;  // cc_dep1
    unsigned long long v20;  // w9
    unsigned long v21;  // x9
    unsigned long long v22;  // w9
    unsigned int v23;  // w9
    unsigned long long v24;  // 4142
    long long v7;  // x1
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4102
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4102
    unsigned long long v29;  // x9
    unsigned long long v30;  // 4112
    unsigned long long v31;  // x9
    unsigned long long ptr;  // x0
    void* v33;  // x8
    long long *v34;  // x8
    long long *v8;  // x22
    unsigned long v35;  // x9
    unsigned long long v36;  // x0
    unsigned int v37;  // w0
    unsigned long long v38;  // 4112
    unsigned long long v39;  // x8
    unsigned long long v40;  // x0
    unsigned long long v41;  // 4112
    unsigned long long v42;  // x0
    void* v43;  // x8
    unsigned long long v44;  // w9
    unsigned long long v9;  // x23
    unsigned long long v45;  // x22
    unsigned long v46;  // x8
    unsigned long long v47;  // x23
    unsigned long long v48;  // x24
    unsigned long v49;  // x28
    unsigned long long v50;  // x9
    unsigned long long ptr1;  // x0
    void* v52;  // x8
    long long *v53;  // x8
    unsigned long v54;  // x9
    unsigned long v10;  // x8
    void* v55;  // x8
    unsigned long long v56;  // x9
    unsigned long long v57;  // w0
    st_96cc84_3 *v11;  // x21
    unsigned long long v12;  // w23
    unsigned long long index;  // x26
    unsigned long long v14;  // x27
    unsigned long long v0;  // [bp-0xa8]
    char v1;  // [bp-0x9a]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    *(uint128_t *)&a0->field_3d0 = 0;
    v5 = a0->field_18->field_d8->field_50;
    if (!(v5 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
    {
        v6 = sub_96c138(a0, 0, 0);
        if (v6)
            goto LABEL_96cd4c;
        if (a1)
        {
            sub_a368c8();
            v7 = 0x1200;
            goto LABEL_96d210;
        }
        goto LABEL_96cd70;
    }
    if (!((char)a0->field_300[32] & 171))
        goto LABEL_96cd70;
    if (!a0->field_78)
    {
        v8 = (long long)a0->field_880[32];
        v9 = 14757395258967641293 * (*(long long *)a0->field_880 - (char *)v8 >> 3);
        if (!(v9 >> 31 & 1) && (int)a0->field_118 > (int)v9)
        {
            if (*(long long *)&a0[1].padding_888[445] && _memchr(*(long long *)&a0[1].padding_888[445], 2, *(long long *)&a0[1].padding_888[453]))
            {
                v10 = (char *)v8 + ((unsigned int)v9 & 0x7fffffff) * 40;
                goto LABEL_96cef0;
            }
            else
            {
                v10 = (char *)v8 + ((unsigned int)v9 & 0x7fffffff) * 40;
                if (*(long long *)v10)
                {
LABEL_96cef0:
                    if (*(long long *)(v10 + 8))
                        goto LABEL_96cd38;
                    goto LABEL_96cd70;
                }
            }
        }
        goto LABEL_96cd70;
    }
LABEL_96cd38:
    if (!(v5 >> 1 & 1))
    {
        v6 = sub_9694fc(a0, 0xffffffff);
        if (v6)
        {
LABEL_96cd4c:
            v11 = v6;
            goto LABEL_96cd50;
        }
        else if (a1)
        {
            sub_a368c8();
            sub_a369bc("ssl/t1_lib.c", 0x1275, "tls_choose_sigalg");
            goto LABEL_96d21c;
        }
        goto LABEL_96cd70;
    }
    if (*(long long *)&a0->padding_3e0[0])
    {
        if (!((char)a0->field_880[30] & 3))
        {
            v12 = 0xffffffff;
            if (*(long long *)&a0[1].padding_888[437])
                goto LABEL_96cf0c;
        }
        else if ((int)sub_a5b508(*(long long *)((long long)a0->field_880[32] + 128), &v1, 50, 0) >= 1)
        {
            v12 = (unsigned int)sub_a99eb4(&v1);
            if (*(long long *)&a0[1].padding_888[437])
                goto LABEL_96cf0c;
        }
        else
        {
            v12 = 0;
            if (*(long long *)&a0[1].padding_888[437])
            {
LABEL_96cf0c:
                index = 0;
                v14 = 0xffffffff;
                do
                {
                    v11 = *(long long *)(*(long long *)&a0[1].padding_888[429] + index * 8);
                    if (!sub_969d00(a0, v11))
                        continue;
                    if (a0->field_78)
                    {
                        v14 = v11->field_20;
                        idx = (int)v14;
                        v16 = sub_95a098(idx, a0->field_8);
                        if (!v16 || !((int)a0->field_300[32] & *(int *)(v16 + 4)) || *(int *)v16 == 912 && (char)a0->field_300[28] & 1)
                            goto LABEL_96cf24;
                        v17 = a0->field_78;
                        if (v17)
                        {
                            v18 = a0->field_b52;
                            v19 = v18 & 0xff;
                            if (v18 != 2)
                                goto LABEL_96d010;
                        }
                        else
                        {
                            v20 = a0->field_b50;
                            v19 = v20 & 0xff;
                            if (v20 != 2)
                                goto LABEL_96d010;
                        }
                        v21 = (long long)a0->field_880[32] + (unsigned int)idx * 40;
                        if (*(long long *)(v21 + 8) && !*(long long *)v21)
                        {
                            v22 = 0x1000;
LABEL_96d014:
                            v23 = *(int *)&a0->field_408[idx] & v22;
                            v24 = arm64g_calculate_condition(0x11, v14 & 0xffffffff, 1, 0);
                            if (v24 & 1)
                            {
                                v25 = arm64g_calculate_condition(19, v19, 2, 0);
                                v26 = arm64g_calculate_condition(3, (v25 & 1 ? v23 : 0x40000000), 0, 0);
                                if (!(v26 & 1))
                                    goto LABEL_96d02c;
                            }
                            else
                            {
                                v27 = arm64g_calculate_condition(19, v19, 2, 0);
                                v28 = arm64g_calculate_condition(0, (v27 & 1 ? v23 : 0x40000000), 0, 0);
                                if (!(v28 & 1))
                                    goto LABEL_96d02c;
                            }
LABEL_96cf24:
                            v14 = 0xffffffff;
                            continue;
                        }
LABEL_96d010:
                        v22 = 1;
                        goto LABEL_96d014;
                    }
                    else
                    {
                        v29 = 3435973837 * ((unsigned long long)(*(long long *)a0->field_880 - (long long)a0->field_880[32]) >> 3);
                        v14 = v11->field_20;
                        if ((unsigned int)v14 != (unsigned int)v29)
                            continue;
                        v30 = arm64g_calculate_condition(1, v29 & 0xffffffff, 1, 0);
                        if (v30 & 1)
                            goto LABEL_96cf24;
                        v17 = 0;
                        v14 = v29;
LABEL_96d02c:
                        if (v14 >> 31 & 1 || (int)a0->field_118 <= (int)v14)
                            continue;
                        v31 = 5544;
                        if (!v17)
                            v31 = 5528;
                        if (*(long long *)((char *)a0 + v31))
                        {
                            ptr = _memchr();
                            v33 = a0->field_880;
                            if (ptr)
                            {
                                v34 = (long long)v33[32];
                                v35 = (char *)v34 + (unsigned int)v14 * 40;
                                goto LABEL_96d098;
                            }
                        }
                        else
                        {
                            v33 = a0->field_880;
                        }
                        v34 = (long long)v33[32];
                        v35 = (char *)v34 + (unsigned int)v14 * 40;
                        if (!*(long long *)v35)
                            continue;
LABEL_96d098:
                        if (*(long long *)(v35 + 8) && sub_96e9a4(a0, v11, *(long long *)((char *)v34 + (unsigned int)v14 * 40), *(long long *)((char *)v34 + (unsigned int)v14 * 40 + 8)) && (v11->field_1c != 912 || *(long long *)((long long)a0->field_880[32] + (unsigned int)v14 * 40 + 8) && *(int *)&v11->padding_12[2] && !(v36 = sub_95a688(a0->field_8, v11->field_18), !v36 || (v0 = v36, (int)sub_a50ac8() < 1 || (v37 = sub_a5bdac(*(long long *)((long long)a0->field_880[32] + (unsigned int)v14 * 40 + 8)), (int)sub_a5bdac(*(long long *)((long long)a0->field_880[32] + (unsigned int)v14 * 40 + 8)) < (int)(sub_a50ac8(v0) * 2 + 2))))) && !(v38 = arm64g_calculate_condition(1, v12, 1, 0), !(v38 & 1) && *(int *)&v11[1].padding_0[4] != v12))
                            break;
                    }
                } while ((index += 1, (unsigned long long)*(long long *)&a0[1].padding_888[437] > index));
                v39 = *(long long *)&a0[1].padding_888[437];
                if (index != v39)
                    goto LABEL_96d18c;
            }
        }
        if (!((char)a0->field_300[32] & 160))
            goto LABEL_96d194;
        v40 = sub_9694fc(a0, 0xffffffff);
        if (v40)
        {
            v11 = v40;
            index = 0;
            v14 = *(int *)(v40 + 32);
            v39 = *(long long *)&a0[1].padding_888[437];
LABEL_96d18c:
            if (index == v39)
            {
LABEL_96d194:
                if (a1)
                {
                    sub_a368c8();
                    v7 = 4687;
                    goto LABEL_96d210;
                }
            }
            else
            {
                v41 = arm64g_calculate_condition(0x11, v14 & 0xffffffff, 1, 0);
                if (!(v41 & 1))
                {
LABEL_96cd50:
                    v14 = v11->field_20;
                    goto LABEL_96cd54;
                }
                else
                {
LABEL_96cd54:
                    v55 = a0->field_880;
                    v56 = (long long)v55[32] + (unsigned int)v14 * 40;
                    a0->field_3d8 = v56;
                    *(unsigned long long *)v55 = v56;
                    a0->field_3d0 = v11;
                    goto LABEL_96cd70;
                }
            }
        }
        else if (a1)
        {
            sub_a368c8();
            v7 = 4675;
LABEL_96d210:
            sub_a369bc("ssl/t1_lib.c", v7, "tls_choose_sigalg");
LABEL_96d21c:
            goto LABEL_96d220;
        }
        goto LABEL_96cd70;
    }
    else
    {
        v42 = sub_9694fc(a0, 0xffffffff);
        if (v42)
        {
            v11 = v42;
            v43 = a0->field_880;
            v44 = (short)v43[30] & 3;
            if (1 < v44)
            {
                if (v44 == 2)
                {
                    v45 = &g_d282a6;
                    goto LABEL_96d238;
                }
                else
                {
                    v45 = &g_d282a4;
                    v47 = 2;
                    goto LABEL_96d274;
                }
                goto LABEL_96d274;
            }
            if (v44)
            {
                v45 = &g_d282a4;
LABEL_96d238:
                v47 = 1;
LABEL_96d274:
                v48 = 0;
                do
                {
                    if (v11->field_10 != *(short *)(v45 + v48 * 2) || !(v49 = v11->field_20, !(v49 >> 31 & 1) && (int)a0->field_118 > (int)v49))
                        continue;
                    if (!a0->field_78)
                        v50 = 5528;
                    else
                        v50 = 5544;
                    if (*(long long *)((char *)a0 + v50))
                    {
                        ptr1 = _memchr();
                        v52 = a0->field_880;
                        if (ptr1)
                        {
                            v53 = (long long)v52[32];
                            v54 = (char *)v53 + (unsigned int)v49 * 40;
                            goto LABEL_96d310;
                        }
                    }
                    else
                    {
                        v52 = a0->field_880;
                    }
                    v53 = (long long)v52[32];
                    v54 = (char *)v53 + (unsigned int)v49 * 40;
                    if (!*(long long *)v54)
                        continue;
LABEL_96d310:
                    if (*(long long *)(v54 + 8) && sub_96e9a4(a0, v11, *(long long *)((char *)v53 + (unsigned int)v49 * 40), *(long long *)((char *)v53 + (unsigned int)v49 * 40 + 8)))
                        goto LABEL_96d33c;
                } while ((v48 += 1, v47 != v48));
                goto LABEL_96d344;
            }
            if (a0->field_78 == 1 && !(v45 = (long long)v43[80], !v45))
            {
                v46 = v43 + 88;
            }
            else
            {
                v45 = (long long)v43[64];
                if (v45)
                {
                    v46 = v43 + 72;
                }
                else
                {
                    v45 = a0->field_8->field_668;
                    v46 = &a0->field_8->padding_0[1624];
                }
            }
            v47 = *(long long *)v46;
            if (v47)
                goto LABEL_96d274;
            v48 = 0;
LABEL_96d33c:
            if (v48 != v47)
                goto LABEL_96cd50;
LABEL_96d344:
            if (!a1)
                goto LABEL_96cd70;
            sub_a368c8();
            sub_a369bc("ssl/t1_lib.c", 0x126c, "tls_choose_sigalg");
LABEL_96d220:
            sub_9a58a4();
            v57 = 0;
        }
        else
        {
            if (a1)
            {
                sub_a368c8();
                v7 = 4701;
                goto LABEL_96d210;
            }
LABEL_96cd70:
            v57 = 1;
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return v57;
    ___stack_chk_fail();
}
