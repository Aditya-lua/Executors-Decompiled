/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d5ee0..0x9d6650 (1904 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_9d5ee0(long long a0, unsigned long long a1, char *a2, char *a3, unsigned long long a4, unsigned long long a5, unsigned long long a6, unsigned long long a7, double a8)
{
    unsigned long long v16;  // x25
    char *v17;  // x20
    unsigned long long v26;  // w9
    double v27;  // d1
    unsigned long long v28;  // 4109
    unsigned long long v29;  // 4109
    double v30;  // d2
    unsigned long long v31;  // 4151
    double v32;  // d1
    unsigned long long v33;  // 4102
    unsigned long long v34;  // 4102
    unsigned long long v35;  // 4127
    char *v18;  // x21
    unsigned long long v36;  // 4109
    unsigned long long v37;  // 4109
    unsigned long long v38;  // x5
    unsigned long long v39;  // w19
    unsigned long long v40;  // 4129
    unsigned long long v41;  // 4125
    double v42;  // d0
    unsigned long long v43;  // x9
    unsigned long long v44;  // x9
    unsigned long long v19;  // x22
    unsigned long long v46;  // 4125
    unsigned long long node;  // x26
    unsigned long long v48;  // 4125
    unsigned long long v49;  // 4141
    unsigned long long v50;  // 4125
    unsigned long long v51;  // 4141
    unsigned long long v52;  // x8
    unsigned long v53;  // x9
    unsigned long long v54;  // 4125
    unsigned long long v55;  // 4126
    unsigned long long v20;  // x8
    unsigned long long v56;  // x10
    unsigned int v57;  // w9
    double v58;  // d0
    unsigned int i;  // w11
    unsigned int v60;  // w11
    unsigned long long v64;  // 4160
    double v65;  // d0
    unsigned long long v21;  // w10
    unsigned int j;  // w13
    unsigned int v67;  // w13
    unsigned long long v69;  // x13
    unsigned long long v70;  // x12
    double v71;  // d0
    unsigned long long v72;  // x11
    unsigned long long v73;  // 4194
    unsigned long v74;  // cc_dep1
    unsigned long v75;  // cc_dep2
    unsigned long long v22;  // 4108
    unsigned long long v76;  // x14
    unsigned long long v77;  // 4104
    unsigned long long v78;  // 4104
    unsigned long long v79;  // x14
    unsigned long long v80;  // x1
    unsigned long long v81;  // x0
    unsigned long long v82;  // x28
    unsigned long long v83;  // x11
    unsigned long long v84;  // w17
    unsigned long long v85;  // x8
    unsigned long long v23;  // 4118
    unsigned int v86;  // w9
    unsigned long long v87;  // x14
    unsigned long long v88;  // x15
    unsigned long long k;  // x8
    char *iter;  // x12
    unsigned long long v91;  // x8
    unsigned long long v93;  // x27
    unsigned long v94;  // x0
    unsigned long long v95;  // x27
    unsigned long v24;  // cc_dep1
    unsigned long long v96;  // w14
    unsigned long long v97;  // w13
    unsigned long long v98;  // w10
    unsigned int v99;  // w8
    unsigned int v100;  // w8
    unsigned long long v101;  // x23
    unsigned long long v102;  // x23
    unsigned long long v103;  // x0
    unsigned long long v104;  // w19
    unsigned long long v105;  // w19
    unsigned long long v25;  // 4132
    unsigned long v106;  // x28
    unsigned long long v107;  // x22
    unsigned long long v108;  // w19
    unsigned long long v109;  // x9
    unsigned long v110;  // x23
    unsigned long long v111;  // 4114
    unsigned long long v0;  // [bp-0xc8]
    unsigned int v1;  // [bp-0xc4]
    unsigned long v2;  // [bp-0xc0]
    unsigned long long v3;  // [bp-0xb4]
    char *v4;  // [bp-0xb0]
    char v5;  // [bp-0xa5]
    char v6;  // [bp-0xa4], Other Possible Types: unsigned long long
    char v7;  // [bp-0xa4]
    char v8;  // [bp-0x91]
    char v9;  // [bp-0x90]
    char v10;  // [bp-0x8f]
    uint40_t v11;  // [bp-0x7e]
    uint40_t v12;  // [bp-0x7c]
    unsigned long long v13;  // [bp-0x68]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v16 = a6;
    v17 = a3;
    v18 = a2;
    v19 = a1;
    v13 = *(long long *)&g_10002b0;
    if (a5 < 0)
        v20 = 6;
    else
        v20 = a5;
    if ((unsigned int)a6 & 2)
        v21 = 43;
    else
        v21 = (unsigned int)a6 * 8 & 32;
    v22 = (isnan(a8) ? 2 : a8 == 0.0 ? 2 : 0) | a8 < 0.0;
    v23 = ((isnan(a8) ? 2 : a8 == 0.0 ? 2 : 0) | a8 < 0.0) & (isnan(a8) ? 1 : a8 == 0.0);
    v24 = (((v22 ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - (v23 & 1)) * 0x10000000;
    v25 = arm64g_calculate_condition(64, (((v22 ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - (v23 & 1)) * 0x10000000, 0, 0);
    if (v25 & 1)
    {
        v26 = 45;
        v27 = -a8;
        v28 = arm64g_calculate_condition(64, v24, 0, 0);
        if (!(v28 & 1))
            goto LABEL_9d5f56;
LABEL_9d5f55:
    }
    else
    {
        v26 = v21;
        v27 = -a8;
        v29 = arm64g_calculate_condition(64, v24, 0, 0);
        if (v29 & 1)
            goto LABEL_9d5f55;
LABEL_9d5f56:
        v27 = a8;
    }
    v30 = 0.0;
    v31 = arm64g_calculate_condition(192, (((((char)(CmpF(__double_as_longlong(v27), 0.0)) >> 5 & 3 | v27 < 0.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - (((char)(CmpF(__double_as_longlong(v27), 0.0)) >> 5 & 3 | v27 < 0.0) & ((char)(CmpF(__double_as_longlong(v27), 0.0)) >> 5 & 3 | v27 < 0.0) >> 1 & 1)) * 0x10000000, 0, 0);
    if (v31 & 1)
    {
        v32 = 0.0;
        v33 = arm64g_calculate_condition(0, (((((char)(CmpF(__double_as_longlong(v27 * 0.5), __double_as_longlong(v27))) >> 5 & 3 | v27 * 0.5 < v27) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v27 * 0.5, v27)) * 0x10000000, 0, 0);
        if (!(v33 & 1))
            goto LABEL_9d5f74;
    }
    else
    {
        v32 = 0.0;
        v34 = arm64g_calculate_condition(0, 0, 0, 0);
        if (!(v34 & 1))
        {
LABEL_9d5f74:
            v32 = v27;
            v35 = arm64g_calculate_condition(96, (((((char)(CmpF(__double_as_longlong(v27), __double_as_longlong(v27))) >> 5 & 3 | isnan(v27)) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v27)) * 0x10000000, 0, 0);
            if (v35 & 1)
                goto LABEL_9d6648;
        }
    }
    while (1)
    {
        if (v32 == 0.0)
        {
            v36 = arm64g_calculate_condition(16, (((((char)(CmpF(__double_as_longlong(a8), __double_as_longlong(v30))) >> 5 & 3 | a8 < v30) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(a8, v30)) * 0x10000000, 0, 0);
            if (!(v36 & 1))
                goto LABEL_9d5f8e;
            goto LABEL_9d5f8d;
        }
        v37 = arm64g_calculate_condition(16, 0x40000000, 0, 0);
        if (v37 & 1)
        {
LABEL_9d5f8d:
            v38 = 63;
            goto LABEL_9d5f90;
        }
LABEL_9d5f8e:
        v38 = v26;
LABEL_9d5f90:
        if (a7 == 2)
            v39 = 0;
        else
            v39 = a7;
        if (v32 != 0.0 && a7 == 2)
        {
            v40 = arm64g_calculate_condition(64, (((((char)(CmpF(__double_as_longlong(v32), 0.0001)) >> 5 & 3 | v32 < 0.0001) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v32)) * 0x10000000, 0, 0);
            if (v40 & 1 || !(unsigned int)v20 && (v41 = arm64g_calculate_condition(176, (((((char)(CmpF(__double_as_longlong(v32), 10.0)) >> 5 & 3 | v32 < 10.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v32)) * 0x10000000, 0, 0), !(v41 & 1)))
            {
                v39 = 1;
                goto LABEL_9d5ffc;
            }
            if (!(unsigned int)v20)
            {
LABEL_9d5ff4:
                v39 = 0;
                goto LABEL_9d5ff8;
            }
            v42 = 1.0;
            v30 = 10.0;
            v43 = v20;
            do
            {
                v44 = v43;
                v42 *= 10.0;
                v43 = (unsigned int)v44 - 1;
            } while ((unsigned int)v44 != 1);
            v46 = arm64g_calculate_condition(160, (((((char)(CmpF(__double_as_longlong(v32), __double_as_longlong(v42))) >> 5 & 3 | v32 < v42) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v32, v42)) * 0x10000000, 0, 0);
            if (!(v46 & 1))
                goto LABEL_9d5ff4;
            v39 = 1;
            if (a7)
                goto LABEL_9d5ffc;
LABEL_9d6098:
            node = 0;
LABEL_9d609c:
            a8 = 1.8446744073709552e+19;
            v55 = arm64g_calculate_condition(160, (((((char)(CmpF(__double_as_longlong(v32), 1.8446744073709552e+19)) >> 5 & 3 | v32 < 1.8446744073709552e+19) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v32)) * 0x10000000, 0, 0);
            if (!(v55 & 1))
            {
                v56 = (unsigned long long)v32;
                if ((int)v20 < 9)
                    v57 = v20;
                else
                    v57 = 9;
                v58 = 1.0;
                if ((unsigned int)v20)
                {
                    i = v57;
                    do
                    {
                        v60 = i;
                        v58 *= 10.0;
                        i = v60 - 1;
                    } while (i);
                    v64 = arm64g_calculate_condition(176, (((((char)(CmpF(__double_as_longlong(v58 - (double)(long long)v58), 0.5)) >> 5 & 3 | v58 - (double)(long long)v58 < 0.5) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v58 - (double)(long long)v58)) * 0x10000000, 0, 0);
                    v65 = 1.0;
                    j = v57;
                    do
                    {
                        v67 = j;
                        v65 *= 10.0;
                        j = v67 - 1;
                    } while (j);
                    v69 = !(v64 & 1) + (long long)v58;
                    v58 = v65;
                }
                else
                {
                    v69 = 1;
                }
                v70 = 0;
                v30 = (double)v56;
                v71 = (v32 - v30) * v58;
                v72 = (long long)v71;
                a8 = v71 - (double)(long long)v71;
                v73 = arm64g_calculate_condition(176, (((((char)(CmpF(__double_as_longlong(a8), 0.5)) >> 5 & 3 | a8 < 0.5) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(a8)) * 0x10000000, 0, 0);
                if (!(v73 & 1))
                    v72 += 1;
                v74 = v72;
                v75 = v69;
                if (v72 < v69)
                {
                    v76 = v56;
                    v77 = arm64g_calculate_condition(36, v74, v75, 0);
                    if (!(v77 & 1))
                        goto LABEL_9d614e;
                    goto LABEL_9d614d;
                }
                else
                {
                    v76 = v56 + 1;
                    v78 = arm64g_calculate_condition(36, v74, v75, 0);
                    if (v78 & 1)
                    {
LABEL_9d614d:
                        goto LABEL_9d6150;
                    }
                    else
                    {
LABEL_9d614e:
                        v69 = 0;
LABEL_9d6150:
                        v12 = v11;
                        do
                        {
                            v79 = v76;
                            v80 = v79 / 10;
                            v81 = v70 + 1;
                            *((char *)&v12 + v70) = *(char *)(v79 + -10 * v80 + 13098859);
                        } while (18 >= v70 && (v70 = v81, v76 = v80, 9 < v79));
                        if (v81 == 20)
                            v82 = v81 - 1;
                        else
                            v82 = v81;
                        *((char *)&v12 + v82) = 0;
                        v83 = v72 - v69;
                        v84 = (unsigned int)v20 & (int)((unsigned int)v20) >> 31;
                        v85 = 1 - v57;
                        do
                        {
                            v86 = v57;
                            if ((int)v86 >= 1)
                            {
                                v87 = v83 / 10;
                                v88 = v83 - 10 * v87;
                                if (a7 != 2 || v88 != 0.0)
                                {
                                    v9 = *(char *)(v88 + 13098859);
                                    if (v86 == 1)
                                    {
                                        v84 = 1;
                                        goto LABEL_9d6264;
                                    }
                                    else
                                    {
                                        k = -v85;
                                        iter = &v10;
                                        do
                                        {
                                            v91 = k;
                                            v83 /= 10;
                                            *iter = *(char *)(v83 + -10 * v83 / 10 + 13098859);
                                            iter += 1;
                                            k = v91 - 1;
                                        } while (k);
                                        v84 = v86;
                                        goto LABEL_9d6264;
                                    }
                                }
                            }
                            else
                            {
                                v86 = 0;
                                goto LABEL_9d6264;
                            }
                        } while ((v85 += 1, v83 = v87, v57 = v86 - 1, v86 != 1));
                        v84 = 0;
                        v86 = v57;
LABEL_9d6264:
                        v93 = 0;
                        v94 = v86;
                        (&v9)[v94] = 0;
                        if (v39 == 1)
                        {
                            v95 = 0;
                            if (0.0 <= (long long)node)
                                v96 = (unsigned int)node;
                            else
                                v96 = -(unsigned int)node;
                            v6 = v7;
                            do
                            {
                                v97 = v96;
                                (&v6)[v95] = *(char *)(v97 + -10 * ((long long)(v97 * 1717986919) >> 0x22) + -10 * (v97 * 1717986919 >> 63) + 13098859);
                                v93 = v95 + 1;
                            } while (18 >= v95 && (v96 = v97 / 10, v95 = v93, 9 < v97));
                            if (9 >= v97 && v93 == 1)
                            {
                                v6 = 48;
                                v93 = 2;
                                goto LABEL_9d62fc;
                            }
                        }
                        else
                        {
LABEL_9d62fc:
                            v2 = v94;
                            if (v39 == 1)
                                v98 = 0xfffffffe - (unsigned int)v93;
                            else
                                v98 = 0;
                            v3 = v84;
                            v99 = a4 - ((unsigned int)v38 != 0) - (v84 + v82) - (v84 > 0);
                            v100 = v99 + v98 & ~((long long)(v99 + v98) >> 31);
                            if (!(v16 & 1))
                                v101 = v100;
                            else
                                v101 = -v100;
                            v0 = v39;
                            v1 = v16;
                            if (v16 >> 4 & 1 && (int)v101 >= 1)
                            {
                                v102 = v101;
                                if (!(unsigned int)v38)
                                {
LABEL_9d6358:
                                    v104 = (unsigned int)v102 + 1;
                                    while (1)
                                    {
                                        a4 = 48;
                                        v103 = sub_c65cec(a0, v19, v18, v17, 48);
                                        if (!(unsigned int)v103)
                                            break;
                                        v104 -= 1;
                                        if (2 > v104)
                                        {
                                            v102 = 0;
                                            goto LABEL_9d63d0;
                                        }
                                    }
                                }
                                else
                                {
                                    a4 = v38;
                                    v103 = sub_c65cec(a0, v19, v18, v17, a4);
                                    if ((unsigned int)v103)
                                    {
                                        v102 = (unsigned int)v101 - 1;
                                        if ((unsigned int)v101 == 1)
                                            goto LABEL_9d63d0;
                                        goto LABEL_9d6358;
                                    }
                                }
                            }
                            else if ((int)v101 >= 1)
                            {
                                v16 = v38;
                                v105 = (unsigned int)v101 + 1;
                                while (1)
                                {
                                    a4 = 32;
                                    v103 = sub_c65cec(a0, v19, v18, v17, 32);
                                    if (!(unsigned int)v103)
                                        break;
                                    v105 -= 1;
                                    if (1 >= v105)
                                    {
                                        v101 = 0;
                                        v38 = v16;
                                        goto LABEL_9d63cc;
                                    }
                                }
                            }
                            else
                            {
LABEL_9d63cc:
                                v102 = v101;
                                if (!(unsigned int)v38 || (a4 = v38, v103 = sub_c65cec(a0, v19, v18, v17, a4), v102 = v101, (unsigned int)v103))
                                {
LABEL_9d63d0:
                                    v16 = v19;
                                    v4 = v18;
                                    v19 = v3 - v2;
                                    v18 = (char *)&v11 + v82 + 1;
                                    do
                                    {
                                        v106 = (unsigned int)v82 - 1;
                                        if ((int)v82 < 1)
                                        {
                                            v18 = v17;
                                            if (!(v1 >> 3 & 1) && 1 > v3)
                                            {
LABEL_9d6434:
                                                v17 = v4;
                                                v107 = v16;
                                                if ((int)v19 >= 1)
                                                {
                                                    v108 = ((unsigned int)v19 & ~((int)((unsigned int)v19) >> 31)) + 1;
                                                    do
                                                    {
                                                        a4 = 48;
                                                        v103 = sub_c65cec(a0, v107, v17, v18, 48);
                                                        v19 = v107;
                                                        if (!(unsigned int)v103)
                                                            goto LABEL_9d65c0;
                                                    } while ((v108 -= 1, 2 <= v108));
                                                }
                                                if (v0 != 1)
                                                {
LABEL_9d647c:
                                                    if (!(v102 >> 31 & 1))
                                                    {
                                                        v103 = 1;
                                                        v19 = v107;
                                                        break;
                                                    }
                                                    else
                                                    {
                                                        do
                                                        {
                                                            a4 = 32;
                                                            v103 = sub_c65cec(a0, v16, v4, v18, 32);
                                                            v19 = v107;
                                                            if (!(unsigned int)v103)
                                                                break;
                                                        } while ((v103 = 1, v110 = (unsigned int)v102 + 1, v111 = arm64g_calculate_condition(49, v102 & 0xffffffff, 1, 0), v102 = (unsigned int)v102 + 1, v19 = v107, v111 & 1));
                                                    }
                                                }
                                                else
                                                {
                                                    a4 = v1 & 32 ^ 101;
                                                    v103 = sub_c65cec(a0, v107, v17, v18, a4);
                                                    v19 = v107;
                                                    if ((unsigned int)v103)
                                                    {
                                                        if ((long long)node < 0.0)
                                                            a4 = 45;
                                                        else
                                                            a4 = 43;
                                                        v103 = sub_c65cec();
                                                        v19 = v107;
                                                        if ((unsigned int)v103)
                                                        {
                                                            v109 = v93 & 0xffffffff;
                                                            do
                                                            {
                                                                v17 = v109 - 1;
                                                                if ((long long)v109 < 1)
                                                                    goto LABEL_9d647c;
                                                            } while ((a4 = (&v5)[v109], v103 = 0, v109 = v17, v19 = v107, sub_c65cec(a0, v16)));
                                                        }
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                a4 = 46;
                                                v103 = sub_c65cec(a0, v16, v4, v18, 46);
                                                if ((unsigned int)v103)
                                                {
                                                    do
                                                    {
                                                        if ((int)v2 < 1)
                                                            goto LABEL_9d6434;
                                                    } while ((a4 = (&v8)[v2], v103 = 0, v2 -= 1, v18 = v17, sub_c65cec(a0, v16, v4, v17, a4)));
                                                }
                                            }
                                        }
                                    } while ((a4 = *v18, v18 -= 1, v103 = sub_c65cec(a0, v16, v4, v17, a4), v82 = v106, (unsigned int)v103));
                                }
                            }
                            goto LABEL_9d65c0;
                        }
                    }
                }
            }
LABEL_9d64b4:
            a4 = 0;
            sub_c65cec(a0, v19, v18, v17, 0);
            v103 = 0;
LABEL_9d65c0:
            v20 = v13;
            v26 = (int)*(long long *)&g_10002b0;
            if (*(long long *)&g_10002b0 == v20)
                break;
            ___stack_chk_fail();
LABEL_9d6648:
            v32 = 0.0;
        }
        else
        {
LABEL_9d5ff8:
            if (!a7)
                goto LABEL_9d6098;
LABEL_9d5ffc:
            if (v32 != 0.0)
            {
                node = 0;
                v48 = arm64g_calculate_condition(80, (((((char)(CmpF(__double_as_longlong(v32), 1.0)) >> 5 & 3 | v32 < 1.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v32)) * 0x10000000, 0, 0);
                if (!(v48 & 1))
                {
                    a8 = v32;
                    do
                    {
                        a8 *= 10.0;
                        node -= 1;
                        v49 = arm64g_calculate_condition(64, (((((char)(CmpF(__double_as_longlong(a8), 1.0)) >> 5 & 3 | a8 < 1.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(a8)) * 0x10000000, 0, 0);
                    } while (v49 & 1);
                }
                else
                {
                    a8 = v32;
                }
                v30 = 10.0;
                v50 = arm64g_calculate_condition(208, (((((char)(CmpF(__double_as_longlong(a8), 10.0)) >> 5 & 3 | a8 < 10.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(a8)) * 0x10000000, 0, 0);
                if (!(v50 & 1))
                {
                    do
                    {
                        a8 /= 10.0;
                        node += 1;
                        v51 = arm64g_calculate_condition(192, (((((char)(CmpF(__double_as_longlong(a8), 10.0)) >> 5 & 3 | a8 < 10.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(a8)) * 0x10000000, 0, 0);
                    } while (v51 & 1);
                }
            }
            else
            {
                node = 0;
                a8 = v32;
            }
            if (a7 == 2)
            {
                if (1 < (unsigned int)v20)
                    v52 = v20 & 0xffffffff;
                else
                    v52 = 1;
                if (v39)
                {
                    v20 = (unsigned int)v52 - 1;
                }
                else
                {
                    v53 = ~(unsigned int)node;
                    v20 = v52 + v53;
                    v54 = arm64g_calculate_condition(65, v52 & 0xffffffff, v53 & 0xffffffff, 0);
                    if (v54 & 1)
                        goto LABEL_9d64b4;
                }
            }
            if (v39 == 1)
                v32 = a8;
            goto LABEL_9d609c;
        }
    }
    return v103;
}
