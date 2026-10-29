/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96baa8..0x96c138 (1680 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96baa8_1 {
    char padding_0[1616];
    unsigned long long field_650;
    char padding_658[8];
    struct st_96baa8_0 *field_660;
} st_96baa8_1;

typedef struct st_96baa8_6 {
    unsigned short field_0;
} st_96baa8_6;

typedef struct st_96baa8_3 {
    int field_0;
    char padding_4[212];
    struct st_96baa8_2 *field_d8;
} st_96baa8_3;

typedef struct st_96baa8_4 {
    char padding_0[8];
    char field_8;
    char padding_9[7];
    long long field_10;
} st_96baa8_4;

typedef struct st_96baa8_7 {
    char padding_0[8];
    struct st_96baa8_1 *field_8;
    char padding_10[8];
    struct st_96baa8_3 *field_18;
    char padding_20[88];
    unsigned int field_78;
    char padding_7c[716];
    struct st_96baa8_8 *field_348;
    unsigned long long field_350;
    char padding_358[176];
    unsigned long long field_408;
    char padding_410[1136];
    struct st_96baa8_5 *field_880;
    char padding_888[712];
    char field_b50;
    char padding_b51[1];
    char field_b52;
} st_96baa8_7;

typedef struct st_96baa8_0 {
    char padding_0[16];
    unsigned short field_10;
    char padding_12[10];
    unsigned int field_1c;
} st_96baa8_0;

typedef struct st_96baa8_5 {
    struct st_96baa8_4 *field_0;
    char padding_8[20];
    unsigned int field_1c;
    unsigned long long field_20;
    char padding_28[24];
    struct st_96baa8_6 *field_40;
} st_96baa8_5;

typedef struct st_96baa8_2 {
    char padding_0[80];
    char field_50;
} st_96baa8_2;

typedef struct st_96baa8_8 {
    char field_0;
} st_96baa8_8;

extern unsigned int g_d282dc[4];

unsigned int sub_96baa8(st_96baa8_7 *a0, char a1, char a2, long long a3, unsigned long long a4)
{
    st_96baa8_5 *v4;  // x28
    unsigned int v5;  // w23
    char v14;  // x22
    long long v15;  // x20
    char v16;  // w10
    unsigned long v17;  // cc_dep1
    char v18;  // w10
    unsigned long v19;  // x8
    char v20;  // w26
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4102
    unsigned long long v23;  // 4110
    unsigned long long v6;  // 4180
    unsigned long long v24;  // 4102
    char v25;  // x27
    char v26;  // w25
    unsigned int v27;  // w23
    char v28;  // w27
    char v29;  // w0
    unsigned long v30;  // cc_dep1
    unsigned long long v31;  // 4112
    unsigned long long v32;  // 4102
    unsigned long long v33;  // 4112
    unsigned long long v7;  // x24
    unsigned long long v34;  // 4102
    char v35;  // w23
    unsigned long v36;  // x23
    unsigned short *v37;  // x10
    char v38;  // x8
    char v39;  // x9
    unsigned long v40;  // x13
    unsigned int *v41;  // x14
    unsigned long v42;  // x16
    unsigned long v43;  // x16
    unsigned long long v8;  // 4116
    unsigned int v44;  // w25
    char v45;  // x24
    char v47;  // x23
    char v48;  // w24
    char v49;  // w0
    unsigned int v50;  // w8
    unsigned long v51;  // cc_dep1
    unsigned long long v52;  // 4106
    unsigned long long v53;  // 4106
    st_96baa8_4 *v9;  // x10
    char v54;  // w8
    unsigned long v55;  // cc_op
    unsigned long v56;  // cc_dep1
    unsigned long v57;  // cc_dep2
    unsigned long v58;  // cc_ndep
    char v59;  // w8
    unsigned long v61;  // x9
    char *v62;  // x10
    char v63;  // w11
    unsigned long v10;  // x8
    unsigned long v64;  // cc_dep1
    char v65;  // x22
    char v66;  // w0
    char v67;  // x21
    long long v68;  // x0
    char v69;  // w0
    char v70;  // x24
    unsigned int v71;  // w0
    unsigned int i;  // w0
    unsigned long v73;  // 4112
    unsigned long v11;  // x9
    unsigned long v74;  // cc_dep1
    unsigned long long v75;  // 4105
    unsigned int v76;  // w8
    unsigned long long v77;  // 4117
    unsigned long v78;  // 4112
    unsigned long v79;  // cc_dep1
    unsigned long long v80;  // 4105
    unsigned long long v81;  // 4117
    unsigned int v82;  // w8
    unsigned int v83;  // w0
    unsigned int *v12;  // x25
    char v13;  // x21
    unsigned int *v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0->field_880;
    v5 = v4->field_1c;
    v6 = arm64g_calculate_condition(1, a4 & 0xffffffff, 1, 0);
    if (v6 & 1)
    {
        v13 = a1;
        if (!a1 || !(v14 = a2, a2 && (v15 = a3, sub_959f90(v14, &v1, a0->field_8))))
        {
LABEL_96befc:
            return 0;
        }
        v7 = v1;
        v0 = a0->field_408 + ((long long)(v7 * 0x100000000) >> 30);
        if (!(v4->field_1c & 196609))
            v20 = 80;
        else
            v20 = 1776;
        v26 = 1;
        if (v5 & 0x30000)
            goto LABEL_96bc04;
        goto LABEL_96bb70;
    }
    v7 = a4;
    v8 = arm64g_calculate_condition(0x11, a4 & 0xffffffff, 2, 0);
    if (!(v8 & 1))
    {
        v9 = v4->field_0;
        v10 = v4->field_20;
        v7 = 14757395258967641293 * (&v4->field_0->padding_0[-1 * v4->field_20] >> 3);
        v11 = (int)v7;
    }
    else
    {
        v10 = v4->field_20;
        v11 = (int)v7;
        v9 = v4->field_20 + (unsigned int)v7 * 40;
    }
    v12 = a0->field_408 + v11 * 4;
    v13 = (char)v9->padding_0;
    v14 = *(long long *)&v9->field_8;
    v15 = v9->field_10;
    if (a0->field_78)
    {
        v16 = a0->field_b52;
        v17 = v16 & 0xff;
        if (v16 == 2)
            goto LABEL_96bbc0;
    }
    else
    {
        v18 = a0->field_b50;
        v17 = v18 & 0xff;
        if (v18 == 2)
        {
LABEL_96bbc0:
            v19 = v10 + (unsigned int)v11 * 40;
            if (*(long long *)(v19 + 8) && !*(long long *)v19)
            {
                *v12 = 0x1000;
                return 0x1000;
            }
        }
    }
    v20 = 0;
    if (v13)
    {
        v21 = arm64g_calculate_condition(19, v17, 2, 0);
        v22 = arm64g_calculate_condition(20, (v21 & 1 ? v14 : 0x40000000), 0, 0);
        if (v22 & 1)
            goto LABEL_96bbf0;
        goto LABEL_96bbe8;
    }
    v23 = arm64g_calculate_condition(19, v17, 2, 0);
    v24 = arm64g_calculate_condition(16, (v23 & 1 ? v14 : 0x40000000), 0, 0);
    if (!(v24 & 1))
    {
LABEL_96bbe8:
        v25 = 0;
    }
    else
    {
LABEL_96bbf0:
        v0 = v12;
        v26 = v5 & 0x3ffff & 0xffff0001;
        if (!(v5 & 0x30000))
        {
LABEL_96bb70:
            v25 = 0;
            goto LABEL_96bc40;
        }
LABEL_96bc04:
        v27 = v20 | 0x800;
        if (v20)
            v28 = v27;
        else
            v28 = 0;
        v29 = sub_af1ff4();
        v30 = v29;
        if (v29)
            v28 = v27;
        if (v29)
        {
            v31 = arm64g_calculate_condition(19, v30, 0, 0);
            v32 = arm64g_calculate_condition(3, (v31 & 1 ? v20 : 0), 0, 0);
            if (v32 & 1)
                goto LABEL_96bce4;
            goto LABEL_96bc38;
        }
        v33 = arm64g_calculate_condition(19, v30, 0, 0);
        v34 = arm64g_calculate_condition(0, (v33 & 1 ? v20 : 0), 0, 0);
        if (!(v34 & 1))
        {
LABEL_96bc38:
            v25 = (!v29) * 0x800;
            v20 = v28;
LABEL_96bc40:
            if ((sub_962324(a0) & 0xffffff00) != 0x300)
            {
                v35 = v26 != 0;
LABEL_96bcd4:
                if (!v20)
                    v25 &= 0xffffffff;
                else
                    v25 |= 48;
                goto LABEL_96bd80;
            }
            v35 = v26 != 0;
            if ((int)sub_962324(a0) < 0x303 || !v26)
                goto LABEL_96bcd4;
            if (*(long long *)&a0->padding_358[144] || (v12 = v0, *(long long *)&a0->padding_358[0x88]))
            {
                v36 = 0;
                goto LABEL_96bc88;
            }
            else if (6 >= (unsigned int)v7 && 125 >> ((char)v7 & 31) & 1)
            {
                v36 = *(int *)(4 * (v7 & 0xffffffff) + 13796032);
                v37 = v4->field_40;
                if (!v4->field_40)
                    goto LABEL_96bc88;
                v38 = (char)v4[1].field_0;
                if (v38)
                {
                    v39 = 0;
                    v40 = a0->field_8->field_650;
                    do
                    {
                        if (!a0->field_8->field_650)
                            continue;
                        v41 = &a0->field_8->field_660->field_1c;
                        v42 = v40;
                        while (1)
                        {
                            v43 = v42;
                            if (*(short *)((char *)v41 - 12) == *v37)
                                break;
                            v41 += 18;
                            v42 = v43 - 1;
                        }
                        if (v41[4] && *(int *)((char *)v41 - 8) == 64 && *v41 == g_d282dc[v7 & 0xffffffff])
                            goto LABEL_96c124;
                    } while ((v39 += 1, v37 += 1, v39 != v38));
                    goto LABEL_96c12c;
                }
                v39 = 0;
LABEL_96c124:
                if (v39 != v38)
                    goto LABEL_96bc88;
LABEL_96c12c:
                if (v20)
                {
                    v35 = 1;
LABEL_96bd84:
                    if (sub_96c56c(a0, v13, 1))
                    {
                        v25 |= 64;
                        goto LABEL_96bda4;
                    }
                    if (v20)
                    {
LABEL_96bda4:
                        if (a0->field_78)
                        {
                            if (!v35)
                                goto LABEL_96be68;
                            v25 |= 128;
                            if ((int)sub_ad69e4(v15) < 1)
                                goto LABEL_96be34;
                            v47 = 0;
                            if (!v20)
                                v48 = 2;
                            else
                                v48 = 11;
                            while (1)
                            {
                                v49 = sub_96c56c(a0, sub_ad69f8(v15, v47), 0);
                                if (!v20)
                                    v50 = v25;
                                else
                                    v50 = v25 & 0xffffff7f;
                                v51 = v49;
                                if (!v49)
                                {
                                    v25 = v50;
                                    v52 = arm64g_calculate_condition(3, v51, 0, 0);
                                    if (!(v52 & 1))
                                        goto LABEL_96be0e;
                                    goto LABEL_96be0d;
                                }
                                else
                                {
                                    v25 &= 0xffffffff;
                                    v53 = arm64g_calculate_condition(3, v51, 0, 0);
                                    if (v53 & 1)
                                    {
LABEL_96be0d:
                                        goto LABEL_96be10;
                                    }
                                    else
                                    {
LABEL_96be0e:
                                        v48 = 0;
LABEL_96be10:
                                        switch (v48)
                                        {
                                        case 0:
                                            break;
                                        case 2:
                                            goto LABEL_96be80;
                                        case 11:
                                            goto LABEL_96be34;
                                        default:
                                            goto LABEL_96befc;
                                        }
                                        v47 += 1;
                                        if (v47 >= (int)sub_ad69e4(v15))
                                            break;
                                    }
                                }
                            }
                        }
                        else
                        {
                            v25 |= 128;
                        }
LABEL_96be34:
                        v54 = !a0->field_78 & v35;
                        v55 = 3;
                        v56 = v54;
                        v57 = 1;
                        v58 = 0;
                        if (v54 != 1)
                        {
LABEL_96be68:
                            v25 |= 0x600;
                            goto LABEL_96be6c;
                        }
                        if (sub_a5b3bc(v14, "RSA"))
                        {
                            v59 = 1;
                            goto LABEL_96c00c;
                        }
                        if (sub_a5b3bc(v14, "DSA"))
                        {
                            v59 = 2;
                            goto LABEL_96c00c;
                        }
                        else if (sub_a5b3bc(v14, "EC"))
                        {
                            v59 = 64;
LABEL_96c00c:
                            v61 = a0->field_350;
                            if (a0->field_350)
                            {
                                v62 = a0->field_348;
                                do
                                {
                                    v56 = v61;
                                    v63 = *v62;
                                    v55 = 3;
                                    v64 = v59;
                                    v57 = v63 & 0xff;
                                    v58 = 0;
                                    if (v59 == v63)
                                    {
                                        v25 |= 0x400;
                                        v56 = v64;
                                        break;
                                    }
                                } while ((v62 += 1, v61 = v56 - 1, v55 = 4, v57 = 1, v58 = 0, v56 != 1));
                            }
                            if (v25 & 0x400 || v20)
                            {
                                v65 = *(long long *)&a0->padding_358[0];
                                if (*(long long *)&a0->padding_358[0])
                                    goto LABEL_96c04c;
                                goto LABEL_96c068;
                            }
                        }
                        else
                        {
                            v25 |= 0x400;
                            v65 = *(long long *)&a0->padding_358[0];
                            if (*(long long *)&a0->padding_358[0])
                            {
LABEL_96c04c:
                                if (!sub_ad69e4(v65) || sub_96c6cc(v65, v13))
                                    goto LABEL_96c068;
                                v66 = sub_ad69e4(v15);
                                v55 = 3;
                                v56 = v66;
                                v57 = 1;
                                v58 = 0;
                                if (v66 >= 1)
                                {
                                    v67 = 0;
                                    do
                                    {
                                        v68 = sub_97725c(sub_ad69f8(v15, v67), v67);
                                        v69 = sub_ad69e4(v65);
                                        v56 = v69;
                                        v57 = 1;
                                        if (v69 >= 1)
                                        {
                                            v70 = 0;
                                            do
                                            {
                                                v55 = 3;
                                                v58 = 0;
                                                if (!sub_af1860(v68, sub_ad69f8(v65, v70)))
                                                    goto LABEL_96c068;
                                            } while ((v70 += 1, v71 = sub_ad69e4(v65), v56 = v70 & 0xffffffff, v57 = v71, v70 < (int)v71));
                                        }
                                        v67 += 1;
                                        i = sub_ad69e4(v15);
                                        v55 = 3;
                                        v56 = v67 & 0xffffffff;
                                        v57 = i;
                                        v58 = 0;
                                    } while ((int)i > v67);
                                }
LABEL_96c06c:
                                if (v20 || v25 & 0x200)
                                {
LABEL_96be6c:
                                    if (v20 & ~v25)
                                    {
                                        v73 = arm64g_calculate_condition(v55 | 16, v56, v57, v58);
                                        v74 = (v73 & 1 ? v20 : 0x40000000);
                                        v75 = arm64g_calculate_condition(19, v74, 0, 0);
                                        v76 = !(v75 & 1);
                                        v77 = arm64g_calculate_condition(3, v74, 0, 0);
                                        if (!(v77 & 1))
                                            goto LABEL_96be7a;
LABEL_96be79:
                                    }
                                    else
                                    {
                                        v78 = arm64g_calculate_condition(v55 | 16, v56, v57, v58);
                                        v79 = (v78 & 1 ? v20 : 0x40000000);
                                        v80 = arm64g_calculate_condition(16, v79, 0, 0);
                                        v76 = !(v80 & 1);
                                        v81 = arm64g_calculate_condition(0, v79, 0, 0);
                                        if (v81 & 1)
                                            goto LABEL_96be79;
LABEL_96be7a:
                                        v20 = 1;
                                    }
                                    v25 |= v76;
                                }
                                else
                                {
                                    v20 = 0;
                                }
                            }
                            else
                            {
LABEL_96c068:
                                v25 |= 0x200;
                                goto LABEL_96c06c;
                            }
                        }
                    }
                }
            }
            else
            {
                v36 = 0xffffffff;
LABEL_96bc88:
                if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
                {
                    if (!sub_96c138(a0, v13, v14))
                        v44 = v25;
                    else
                        v44 = v25 | 16;
                }
                else if (sub_96c3f0(a0, v13, v36))
                {
                    v44 = v25 | 16;
                }
                else
                {
                    if (!v20)
                        goto LABEL_96bf3c;
                    v44 = v25;
                }
                v25 = v44 | 32;
                if ((int)sub_ad69e4(v15) >= 1)
                {
                    v45 = 0;
                    while (sub_96c3f0(a0, sub_ad69f8(v15, v45), v36))
                    {
                        v45 += 1;
                        if (v45 >= (int)sub_ad69e4(v15))
                            goto LABEL_96bd7c;
                    }
                    if (v20)
                    {
                        v25 = v44 & 0xffffffdf;
                        goto LABEL_96bd7c;
                    }
                    else
                    {
LABEL_96bf3c:
                        v12 = v0;
                    }
                }
                else
                {
LABEL_96bd7c:
                    v35 = 1;
LABEL_96bd80:
                    v12 = v0;
                    goto LABEL_96bd84;
                }
            }
        }
        else
        {
LABEL_96bce4:
            v20 = 0;
            v25 = 0;
            v12 = v0;
        }
    }
LABEL_96be80:
    if ((sub_962324(a0) & 0xffffff00) == 0x300)
    {
        v82 = 258;
        if ((int)sub_962324(a0) >= 0x303)
            v82 = *v12 & 258;
        v83 = v82 | v25;
        if (v20)
            return v82 | v25;
    }
    else
    {
        v83 = 258 | v25;
        if (v20)
            return 258 | v25;
    }
    if (v25 & 1)
    {
        *v12 = v83;
        return v83;
    }
    *v12 = *v12 & 258;
    return 0;
}
