/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e80bc..0x9e8734 (1656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e80bc_0 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_9e80bc_0;

extern st_9e80bc_0 g_d311c8;
extern unsigned short g_d311ca;

char * sub_9e80bc(long long a0, unsigned long long a1, char *a2, char *a3, char *a4, char *a5, long long a6)
{
    char *v15;  // w21
    char *v25;  // x11
    unsigned long long v26;  // 4106
    unsigned long long v27;  // 4106
    char *v28;  // w9
    char *v29;  // x8
    char *v30;  // x27
    char *v31;  // x27
    unsigned short *v32;  // x20
    unsigned short *iter;  // x21
    char *v34;  // x26
    long long v17;  // x19
    char *v35;  // x26
    unsigned long long v37;  // x0
    unsigned long long v38;  // 4106
    unsigned long v39;  // cc_dep2
    char *i;  // x27
    unsigned long long v41;  // x8
    unsigned long v42;  // 4110
    unsigned long v43;  // cc_op
    unsigned long v44;  // cc_dep1
    char *v18;  // x28
    unsigned long v45;  // 4110
    unsigned long long v46;  // 4112
    unsigned short *v47;  // x21
    char *v48;  // x28
    unsigned short *v49;  // x26
    char *v50;  // x28
    unsigned long v51;  // x22
    char *v52;  // x8
    char *v53;  // x8
    char *v54;  // w0
    char *v19;  // x0
    unsigned short *v55;  // x20
    unsigned short *node;  // x21
    char *v57;  // x26
    char *v58;  // x26
    unsigned long long v60;  // x0
    unsigned long long v61;  // 4106
    unsigned long v62;  // cc_dep2
    char *v63;  // x28
    unsigned long long v64;  // x8
    char *v20;  // x22
    unsigned long v65;  // 4110
    unsigned long v66;  // cc_op
    unsigned long v67;  // cc_dep1
    unsigned long v68;  // 4110
    unsigned long long v69;  // 4112
    unsigned short *v70;  // x27
    unsigned short *v71;  // x26
    char *v72;  // x21
    char *v73;  // x21
    unsigned long v74;  // x22
    char *v21;  // x0
    char *v75;  // x8
    char *v76;  // x8
    char *v77;  // x8
    char *v79;  // w27
    char *v80;  // w28
    char *v81;  // w28
    char *v82;  // w0
    unsigned long long v83;  // 4112
    char *v84;  // w0
    char *v22;  // w8
    unsigned long long v85;  // 4112
    char *v86;  // w0
    unsigned long long v87;  // 4112
    unsigned long v23;  // cc_dep1
    char *v24;  // x9
    char *v0;  // [bp-0xe0]
    char *v1;  // [bp-0xd0]
    char *v2;  // [bp-0xc8]
    char *v3;  // [bp-0xbc]
    char *v4;  // [bp-0xb8]
    char *v5;  // [bp-0xa8]
    char *v6;  // [bp-0xa0]
    long long v7;  // [bp-0x98]
    char *v8;  // [bp-0x90]
    char *v9;  // [bp-0x88]
    char *v10;  // [bp-0x7c]
    unsigned short *v11;  // [bp-0x70]
    char *v12;  // [bp-0x68]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    if (0x800 < (int)a1)
        v15 = (char *)128;
    else
        v15 = (char *)64;
    if (1 >= (int)a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_prime.c", 135, "BN_generate_prime_ex2");
        sub_a36abc(3, 118, 0);
        return 0;
    }
    v17 = a6;
    v18 = a3;
    if (5 >= (unsigned int)a1 && (unsigned int)a1 != 3 && a2 && !v18)
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_prime.c", 143, "BN_generate_prime_ex2");
        sub_a36abc(3, 118, 0);
        return 0;
    }
    v19 = sub_a6bffc(0x1000, "crypto/bn/bn_prime.c", 147);
    if (!v19)
        return v19;
    v20 = v19;
    sub_9de064(v17);
    v21 = sub_9de208(v17);
    if (!v21)
    {
        sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
        sub_9de17c(v17);
        return 0;
    }
    v10 = (char *)0;
    if ((unsigned int)a1 <= 0x1000)
        v22 = (char *)0x400;
    else
        v22 = (char *)0x800;
    v23 = a2;
    v24 = 3;
    if (a2)
    {
        v25 = 3;
        v26 = arm64g_calculate_condition(3, v23, 0, 0);
        if (!(v26 & 1))
            goto LABEL_9e81ea;
LABEL_9e81e9:
    }
    else
    {
        v25 = 1;
        v27 = arm64g_calculate_condition(3, v23, 0, 0);
        if (v27 & 1)
            goto LABEL_9e81e9;
LABEL_9e81ea:
        v24 = 5;
    }
    v5 = v24;
    if ((unsigned int)a1 < 513)
        v28 = (char *)64;
    else
        v28 = (char *)128;
    if ((unsigned int)a1 < 2049)
        v22 = (char *)384;
    if ((int)a1 < 1025)
        v29 = v28;
    else
        v29 = v22;
    v8 = *(short *)((char *)&g_d311c8.field_0 + 0x2 * v29 - 2);
    v1 = ~v8;
    v2 = v25;
    v11 = v20 + 2;
    v12 = v29 - 1;
    v4 = v21;
    v3 = v15;
LABEL_9e8244:
    if (v18)
    {
        sub_9de064(v17);
        v9 = sub_9de208(v17);
        if (!v9)
        {
LABEL_9e86e4:
            sub_9de17c(v17);
            sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
            sub_9de17c(v17);
            return 0;
        }
        v30 = v8;
        if (sub_9e4d2c(v18) > v30)
            v30 = sub_9e4d2c(v18);
        if (!sub_9e8ecc(a0, a1, 0, 1, 0, v17))
            goto LABEL_9e86e4;
        v31 = ~v30;
        while (1)
        {
            if (!sub_9de520(0, v9, a0, v18, v17) || !sub_9db58c(a0, a0, v9))
                goto LABEL_9e86e4;
            if (a4)
            {
                if (!sub_9db29c(a0, a0))
                    goto LABEL_9e86e4;
            }
            else
            {
                if (!sub_9eb9e0(a0, v2))
                    goto LABEL_9e86e4;
            }
            if (((int)sub_9e46a8(a0) < (int)a1 || v5 > sub_9e4d2c(a0)) && !sub_9db29c(a0, a0, v18))
                goto LABEL_9e86e4;
            v32 = &g_d311ca;
            iter = v11;
            v34 = v12;
            do
            {
                v35 = v34;
                v37 = sub_9eb810(a0, *v32);
                v38 = arm64g_calculate_condition(2, v37, 1, 0);
                if (v38 & 1)
                    goto LABEL_9e86e4;
            } while ((*iter = v37, iter += 1, v34 = v35 - 1, v39 = 1, v32 += 1, v35 != 1));
            v0 = v31;
            v6 = v20;
            v7 = v17;
            i = 0;
            do
            {
                v41 = i >> 31;
                if ((unsigned int)a1 < 32)
                {
                    v42 = arm64g_calculate_condition(52, v35, v39, 0);
                    v43 = 4;
                    v44 = (v42 & 1 ? v41 : 0);
                }
                else
                {
                    v45 = arm64g_calculate_condition(52, v35, v39, 0);
                    v43 = 0;
                    v44 = (v45 & 1 ? v41 : 0);
                }
                v46 = arm64g_calculate_condition(v43 | 16, v44, 0, 0);
                v47 = &g_d311ca;
                v48 = v12;
                v49 = v11;
                while (1)
                {
                    v50 = v48;
                    v51 = *v47;
                    v47 += 1;
                    if (v46 & 1 || &i[sub_9e4d2c(a0)] >= (unsigned int)v51 * (unsigned int)v51)
                    {
                        v52 = &i[*v49];
                        v53 = &v52[-1 * v51 * v52 / v51];
                        if (!a2)
                        {
                            if (!v53)
                                break;
                            goto LABEL_9e8398;
                        }
                        if (2 > v53)
                            break;
LABEL_9e8398:
                        v49 += 1;
                        v48 = v50 - 1;
                        if (v50 == 1)
                            goto LABEL_9e8574;
                    }
                    else
                    {
LABEL_9e8574:
                        v54 = (char *)(unsigned int)sub_9eb9e0(a0, i);
                        v17 = v7;
                        sub_9de17c(v17);
                        v20 = v6;
                        if (!v54)
                        {
                            sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
                            sub_9de17c(v17);
                            return 0;
                        }
LABEL_9e8598:
                        if (a5)
                        {
                            if (*(int *)a5 != 2)
                            {
                                if (*(int *)a5 == 1)
                                {
                                    if (*(long long *)&a5[16])
                                        (*(long long *)&a5[16])();
                                }
                                else
                                {
                                    sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
                                    sub_9de17c(v17);
                                    return 0;
                                }
                            }
                            else
                            {
                                (*(long long *)&a5[16])();
                            }
                        }
                        v79 = v10 + 1;
                        if (a2)
                        {
                            if (sub_9ea50c(v4, a0))
                            {
                                v80 = v3;
                                while (1)
                                {
                                    v81 = v80;
                                    v82 = (char *)(unsigned int)sub_9e8734(a0, 1, v17, 0, a5);
                                    v83 = arm64g_calculate_condition(1, (unsigned long long)v82, 1, 0);
                                    if (v83 & 1)
                                    {
                                        sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
                                        sub_9de17c(v17);
                                        return 0;
                                    }
                                    if (!v82)
                                        break;
                                    v84 = (char *)(unsigned int)sub_9e8734(v4, 1, v17, 0, a5);
                                    v85 = arm64g_calculate_condition(1, (unsigned long long)v84, 1, 0);
                                    if (v85 & 1)
                                    {
                                        sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
                                        sub_9de17c(v17);
                                        return 0;
                                    }
                                    if (!v84)
                                        break;
                                    if (a5)
                                    {
                                        if (*(int *)a5 == 2)
                                            (*(long long *)&a5[16])();
                                        if (*(int *)a5 == 1)
                                        {
                                            if (*(long long *)&a5[16])
                                                (*(long long *)&a5[16])();
                                        }
                                        else
                                        {
                                            sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
                                            sub_9de17c(v17);
                                            return 0;
                                        }
                                    }
                                    v80 = v81 - 1;
                                    if (v81 == 1)
                                    {
                                        sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
                                        sub_9de17c(v17);
                                        return 1;
                                    }
                                }
                                v10 = v79;
                                goto LABEL_9e8244;
                            }
                            else
                            {
                                sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
                                sub_9de17c(v17);
                                return 0;
                            }
                        }
                        else
                        {
                            v86 = (char *)(unsigned int)sub_9e8734(a0, v3, v17, 0, a5);
                            v10 = v79;
                            if (v86)
                            {
                                v87 = arm64g_calculate_condition(1, (unsigned long long)v86, 1, 0);
                                if (!(v87 & 1))
                                {
                                    sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
                                    sub_9de17c(v17);
                                    return 1;
                                }
                                sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
                                sub_9de17c(v17);
                                return 0;
                            }
                        }
                    }
                }
                v18 = v18;
                i = &i[sub_9e4d2c(v18)];
                v35 = i;
                v39 = v0;
            } while (i <= v0);
            v17 = v7;
            v20 = v6;
            v31 = v0;
            goto LABEL_9e86e4;
        }
    }
    else if (sub_9e9188(a0, a1, 1, 1, 0, v17))
    {
        v18 = 0;
    }
    else
    {
        sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
        sub_9de17c(v17);
        return 0;
    }
    while (1)
    {
        if (a2 && !sub_9e55d4(a0, 1))
        {
            sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
            sub_9de17c(v17);
            return 0;
        }
        v55 = &g_d311ca;
        node = v11;
        v57 = v12;
        do
        {
            v58 = v57;
            v60 = sub_9eb810(a0, *v55);
            v61 = arm64g_calculate_condition(2, v60, 1, 0);
            if (v61 & 1)
            {
                sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
                sub_9de17c(v17);
                return 0;
            }
        } while ((*node = v60, node += 1, v57 = v58 - 1, v62 = 1, v55 += 1, v58 != 1));
        v63 = 0;
        v6 = v20;
        v7 = v17;
LABEL_9e8498:
        v64 = v63 >> 31;
        if ((unsigned int)a1 < 32)
        {
            v65 = arm64g_calculate_condition(52, v58, v62, 0);
            v66 = 4;
            v67 = (v65 & 1 ? v64 : 0);
        }
        else
        {
            v68 = arm64g_calculate_condition(52, v58, v62, 0);
            v66 = 0;
            v67 = (v68 & 1 ? v64 : 0);
        }
        v69 = arm64g_calculate_condition(v66 | 16, v67, 0, 0);
        v70 = &g_d311ca;
        v71 = v11;
        v72 = v12;
        while (1)
        {
            v73 = v72;
            v74 = *v70;
            v70 += 1;
            if (v69 & 1 || &v63[sub_9e4d2c(a0)] >= (unsigned int)v74 * (unsigned int)v74)
            {
                v75 = &v63[*v71];
                v76 = &v75[-1 * v74 * v75 / v74];
                if (!a2)
                {
                    if (v76)
                        goto LABEL_9e84bc;
                    v77 = 2;
LABEL_9e8510:
                    v20 = v6;
                    v17 = v7;
                    v63 += v77;
                    v58 = v63;
                    v62 = v1;
                    if (v63 > v1)
                        goto LABEL_9e854c;
                    goto LABEL_9e8498;
                }
                else
                {
                    if (2 > v76)
                    {
                        v77 = 4;
                        goto LABEL_9e8510;
                    }
LABEL_9e84bc:
                    v71 += 1;
                    v72 = v73 - 1;
                    if (v73 == 1)
                        goto LABEL_9e8528;
                }
            }
            else
            {
LABEL_9e8528:
                if (!sub_9eb9e0(a0, v63))
                {
                    sub_a6c2e4(v6, "crypto/bn/bn_prime.c", 0xcc);
                    sub_9de17c(v7);
                    return 0;
                }
                v20 = v6;
                v17 = v7;
                if (sub_9e46a8(a0) == (unsigned int)a1)
                    goto LABEL_9e8598;
LABEL_9e854c:
                if (!sub_9e9188(a0, a1, 1, 1, 0, v17))
                {
                    sub_a6c2e4(v20, "crypto/bn/bn_prime.c", 0xcc);
                    sub_9de17c(v17);
                    return 0;
                }
                break;
            }
        }
    }
}
