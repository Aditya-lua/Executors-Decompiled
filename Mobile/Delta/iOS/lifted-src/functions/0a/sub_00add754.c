/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadd754..0xaddb20 (972 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_add754_0 {
    unsigned long long field_0;
    long long field_8;
} st_add754_0;

typedef struct st_add754_2 {
    char padding_0[16];
    unsigned long long field_10;
} st_add754_2;

typedef struct st_add754_1 {
    char padding_0[232];
    unsigned int field_e8;
    char padding_ec[28];
    struct st_add754_0 *field_108;
    char padding_110[72];
    long long field_158;
} st_add754_1;

extern long long g_addb60;
extern long long g_ae5938;

unsigned long long * sub_add754(st_add754_1 *a0)
{
    unsigned long long idx;  // x0
    unsigned long long *v4;  // x20
    unsigned long long v13;  // x21
    st_add754_0 *v14;  // x28
    unsigned long long v15;  // w0
    long long v16;  // x22
    unsigned long long v17;  // x0
    unsigned long long v18;  // x26
    unsigned long long v19;  // x0
    unsigned long long v20;  // x23
    unsigned long long v21;  // w22
    long long v22;  // x23
    st_add754_2 *v5;  // x27
    unsigned long long v23;  // x24
    unsigned long long v24;  // x0
    unsigned long long v25;  // 4118
    unsigned long long v26;  // 4122
    unsigned long long v27;  // 4112
    unsigned long long index;  // x0
    unsigned long long v7;  // x8
    unsigned long long v8;  // x8
    unsigned long long v9;  // 4118
    unsigned long long v10;  // x21
    unsigned long long v11;  // x0
    unsigned long v12;  // x24
    char v0;  // [bp-0x64], Other Possible Types: unsigned int, unsigned long long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0->field_108)
    {
        return a0->field_108;
    }
    else if (!sub_a7c198(a0->field_158))
    {
        return 0;
    }
    else if (!a0->field_108)
    {
        idx = sub_a6bf4c(40, "crypto/x509/pcy_cache.c", 94);
        if (!idx)
        {
            sub_a7c1b4(a0->field_158);
            return a0->field_108;
        }
        v4 = idx;
        v5 = idx;
        v5->field_10 = 0xffffffffffffffff;
        *(unsigned long long *)idx = 0;
        *(unsigned long long *)(idx + 8) = 0;
        *(unsigned long *)(idx + 24) = 0xffffffffffffffff;
        *(unsigned long *)(idx + 32) = 0xffffffffffffffff;
        a0->field_108 = idx;
        index = sub_af2750(a0, 401, &v0, 0);
        if (index)
        {
            v7 = *(long long *)index;
            if (!v7)
            {
                v8 = *(long long *)(index + 8);
                if (v8)
                {
LABEL_add838:
                    if (*(int *)(v8 + 4) != 258)
                    {
                        v4[4] = sub_9c1a94(v8);
LABEL_add864:
                        v11 = sub_af2750(a0, 89, &v0, 0);
                        v12 = v0;
                        if (!v11)
                        {
                            v27 = arm64g_calculate_condition(0x11, v12 & 0xffffffff, 1, 0);
                            if (!(v27 & 1))
                            {
                                sub_aea388(index);
                                sub_a7c1b4(a0->field_158);
                                return a0->field_108;
                            }
                            goto LABEL_addaa8;
                        }
                        v13 = v11;
                        v14 = a0->field_108;
                        v15 = (unsigned int)sub_ad69e4();
                        if (v15 >= 1)
                        {
                            v16 = 524303;
                            v17 = sub_ad6270(&g_addb60);
                            v14->field_8 = v17;
                            if (v17)
                            {
                                v18 = 0;
                            }
                            else
                            {
                                v22 = 38;
                                goto LABEL_add988;
                            }
                            while (1)
                            {
                                v19 = sub_addbd8(sub_ad69f8(v13, v18), 0, v12);
                                if (!v19)
                                {
                                    v16 = 524299;
                                    v22 = 45;
LABEL_add988:
                                    sub_a368c8();
                                    sub_a369bc("crypto/x509/pcy_cache.c", v22, "policy_cache_create");
                                    sub_a36abc(0x22, v16, 0);
                                    sub_ad6958(v13, &g_ae5938);
                                    v21 = 0;
                                    goto LABEL_add9fc;
                                }
                                v20 = v19;
                                if (sub_a99eac(*(long long *)(v19 + 8)) == 746)
                                {
                                    if (v14->field_0)
                                        goto LABEL_add9cc;
                                    v14->field_0 = v20;
                                    goto LABEL_add8cc;
                                }
                                if (sub_ad66d4(v14->field_8, v20) >> 31 & 1)
                                {
                                    if (sub_ad68a0(v14->field_8, v20))
                                    {
LABEL_add8cc:
                                        v18 = (unsigned int)v18 + 1;
                                        if (v15 == (unsigned int)v18)
                                        {
                                            sub_ad6ae4(v14->field_8);
                                            v20 = 0;
                                            v23 = 0;
                                            v21 = 1;
LABEL_add9e0:
                                            sub_addb74(v20);
                                            sub_ad6958(v13, &g_ae5938);
                                            if (v23 & 1)
                                            {
LABEL_add9fc:
                                                sub_ad6958(v14->field_8, sub_addb74);
                                                v14->field_8 = 0;
                                                v0 = v21;
                                                if (0 >= v21)
                                                {
                                                    sub_aea388(index);
                                                    sub_a7c1b4(a0->field_158);
                                                    return a0->field_108;
                                                }
                                                goto LABEL_adda30;
                                            }
                                            v0 = 1;
LABEL_adda30:
                                            v24 = sub_af2750(a0, 747, &v0, 0);
                                            if (v24)
                                            {
                                                v0 = (unsigned int)sub_addd10(a0, v24);
                                                if (v0 >= 1)
                                                    goto LABEL_adda60;
                                            }
                                            else
                                            {
                                                v25 = arm64g_calculate_condition(1, v0, 1, 0);
                                                if (v25 & 1)
                                                {
LABEL_adda60:
                                                    v10 = sub_af2750(a0, 748, &v0, 0);
                                                    if (v10)
                                                    {
                                                        if (*(int *)(v10 + 4) == 258)
                                                            goto LABEL_addaac;
                                                        v5->field_10 = sub_9c1a94(v10);
                                                        goto LABEL_addabc;
                                                    }
                                                    else
                                                    {
                                                        v26 = arm64g_calculate_condition(0x11, v0, 1, 0);
                                                        if (!(v26 & 1))
                                                            goto LABEL_addabc;
                                                        goto LABEL_addab0;
                                                    }
                                                    goto LABEL_addab0;
                                                }
                                            }
LABEL_addaa8:
                                            v10 = 0;
LABEL_addaac:
LABEL_addab0:
                                            a0->field_e8 = a0->field_e8 | 0x800;
LABEL_addabc:
                                            sub_aea388();
                                            sub_9cf124(v10);
                                            sub_a7c1b4(a0->field_158);
                                            return a0->field_108;
                                        }
                                    }
                                    else
                                    {
                                        sub_a368c8();
                                        sub_a369bc("crypto/x509/pcy_cache.c", 61, "policy_cache_create");
                                        sub_a36abc(0x22, 0x8000f, 0);
                                        v21 = 0;
                                        break;
                                    }
                                }
                                else
                                {
LABEL_add9cc:
                                    a0->field_e8 = a0->field_e8 | 0x800;
                                    v21 = 0xffffffff;
                                    break;
                                }
                            }
                        }
                        else
                        {
                            v20 = 0;
                            v21 = 0;
                        }
                        v23 = 1;
                        goto LABEL_add9e0;
                    }
                }
            }
            else if (*(int *)(v7 + 4) != 258)
            {
                v4[3] = sub_9c1a94(v7);
                v8 = *(long long *)(index + 8);
                if (v8)
                    goto LABEL_add838;
                goto LABEL_add864;
            }
        }
        else
        {
            v9 = arm64g_calculate_condition(0x11, v0, 1, 0);
            if (!(v9 & 1))
                goto LABEL_add864;
        }
        v10 = 0;
        goto LABEL_addab0;
    }
    else
    {
        sub_a7c1b4(a0->field_158);
        return a0->field_108;
    }
}
