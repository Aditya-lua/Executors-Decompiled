/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaea7f4..0xaeb0e4 (2288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aea7f4_0 {
    char padding_0[8];
    struct st_aea7f4_1 *field_8;
} st_aea7f4_0;

typedef struct st_aea7f4_1 {
    char field_0;
    char field_1;
} st_aea7f4_1;

typedef struct st_aea7f4_2 {
    char padding_0[8];
    struct st_aea7f4_0 *field_8;
    long long field_10;
    unsigned int field_18;
} st_aea7f4_2;

extern long long g_9c3580;
extern long long g_aeba10;
extern unsigned int g_dfdc7c[4];

unsigned long long sub_aea7f4(void* a0)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v15;  // x0
    unsigned long long v16;  // w9
    char *v17;  // x8
    unsigned int v18;  // w10
    unsigned long long v19;  // 4118
    unsigned long long v20;  // x0
    unsigned long long v21;  // x20
    unsigned int v22;  // w0
    unsigned long long v23;  // w8
    unsigned long long v24;  // 4118
    unsigned long long v7;  // x8
    unsigned long long v25;  // x0
    unsigned long long v26;  // w8
    unsigned long long v27;  // 4118
    unsigned long long v28;  // x0
    unsigned long long v29;  // 4118
    unsigned long long v30;  // x0
    unsigned long long v31;  // 4118
    long long v32;  // x0
    unsigned long long v33;  // x0
    unsigned long long v34;  // 4118
    unsigned long long v8;  // w8
    unsigned long long v35;  // x0
    unsigned long long v36;  // 4118
    unsigned long long v37;  // x0
    unsigned long long v38;  // 4118
    st_aea7f4_2 *v39;  // x20
    st_aea7f4_0 *v40;  // x8
    unsigned long long v41;  // w10
    char *v42;  // x9
    unsigned int v43;  // w8
    unsigned long long v44;  // x8
    unsigned long long v9;  // 4118
    unsigned long long v45;  // x21
    unsigned long v46;  // x0
    unsigned long long v47;  // x0
    unsigned long long v48;  // 4118
    unsigned long long v49;  // x0
    unsigned long long v50;  // 4118
    unsigned long v51;  // x1
    long long v52;  // x23
    unsigned int v53;  // w0
    unsigned int v54;  // w8
    unsigned long long v10;  // x0
    long long v55;  // x0
    unsigned long long v11;  // x20
    unsigned long long v12;  // x0
    unsigned long long v13;  // w8
    unsigned long long v14;  // 4118
    char iter;  // [bp-0x5c], Other Possible Types: unsigned long long
    char v1;  // [bp-0x58], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x54]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    /* unsupported instruction */;
    if ((int)a0[352])
        return 1 & ~((unsigned int)((int)a0[232]) >> 7);
    v5 = sub_a7c198((long long)a0[344]);
    if (!(unsigned int)v5)
        return v5;
    if (!((char)a0[233] & 1))
    {
        if (!sub_af9318(a0, sub_a5609c(sub_a36c8c()), a0 + 312, 0))
            *(unsigned int *)&a0[232] = (int)a0[232] | 0x100000;
        if (!sub_af3ae0(a0))
            *(unsigned int *)&a0[232] = (int)a0[232] | 64;
        *(unsigned long long *)&a0[216] = 0xffffffffffffffff;
        v6 = sub_af2750(a0, 87, &iter, 0);
        if (v6)
        {
            if (*(int *)v6)
                *(unsigned int *)&a0[232] = (int)a0[232] | 16;
            v7 = *(long long *)(v6 + 8);
            if (v7)
            {
                if (*(int *)(v7 + 4) == 258)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_purp.c", 484, "ossl_x509v3_cache_extensions");
                    sub_a36abc(0x22, 168, 0);
                    *(unsigned int *)&a0[232] = (int)a0[232] | 128;
                }
                else
                {
                    *(unsigned long long *)&a0[216] = sub_9c1a94(v7);
                }
            }
            sub_ae4804();
            v8 = 1;
        }
        else
        {
            v9 = arm64g_calculate_condition(1, iter, 1, 0);
            if (v9 & 1)
                goto LABEL_aea96c;
            v8 = 128;
        }
        *(unsigned int *)&a0[232] = (int)a0[232] | v8;
LABEL_aea96c:
        v10 = sub_af2750(a0, 663, &iter, 0);
        if (v10)
        {
            v11 = v10;
            if ((char)((char)a0[232]) >> 4 & 1 || !(sub_af26f0(a0, 0x55, 0xffffffff) >> 31 & 1) || !(sub_af26f0(a0, 86, 0xffffffff) >> 31 & 1))
                *(unsigned int *)&a0[232] = (int)a0[232] | 128;
            if (*(long long *)v11)
                v12 = sub_9c1a94(*(long long *)v11);
            else
                v12 = 0xffffffffffffffff;
            *(unsigned long long *)&a0[224] = v12;
            sub_aea17c(v11);
            v13 = 0x400;
        }
        else
        {
            v14 = arm64g_calculate_condition(1, iter, 1, 0);
            if (v14 & 1)
                goto LABEL_aeaa08;
            v13 = 128;
        }
        *(unsigned int *)&a0[232] = (int)a0[232] | v13;
LABEL_aeaa08:
        v15 = sub_af2750(a0, 83, &iter, 0);
        if (v15)
        {
            *(unsigned int *)&a0[236] = 0;
            v16 = *(int *)v15;
            if (v16 >= 1)
            {
                v17 = *(long long *)(v15 + 8);
                v18 = *v17;
                *(unsigned int *)&a0[236] = v18;
                if (v16 != 1)
                    *(unsigned int *)&a0[236] = v18 | v17[1] * 0x100;
            }
            *(unsigned int *)&a0[232] = (int)a0[232] | 2;
            sub_9cf0f4();
            if (!(int)a0[236])
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_purp.c", 525, "ossl_x509v3_cache_extensions");
                sub_a36abc(0x22, 169, 0);
LABEL_aeaaa4:
                *(unsigned int *)&a0[232] = (int)a0[232] | 128;
            }
        }
        else
        {
            v19 = arm64g_calculate_condition(1, iter, 1, 0);
            if (!(v19 & 1))
                goto LABEL_aeaaa4;
        }
        *(unsigned int *)&a0[240] = 0;
        v20 = sub_af2750(a0, 126, &iter, 0);
        if (v20)
        {
            v21 = v20;
            *(unsigned int *)&a0[232] = (int)a0[232] | 4;
            iter = 0;
            if ((int)sub_ad69e4() >= 1)
            {
                do
                {
                    v22 = sub_a99eac(sub_ad69f8(v21, iter), iter);
                    if (0x88 >= (int)v22)
                    {
                        if ((int)v22 > 130)
                        {
                            if (v22 == 131)
                            {
                                v23 = 8;
                            }
                            else if (v22 != 132)
                            {
                                if (v22 != 133)
                                    continue;
                                v23 = 64;
                            }
                            else
                            {
                                v23 = 4;
                            }
                        }
                        else
                        {
                            if (v22 != 129)
                            {
                                if (v22 != 130)
                                    continue;
                                v23 = 2;
                            }
                            else
                            {
                                v23 = 1;
                            }
                        }
                    }
                    else
                    {
                        if ((int)v22 <= 179)
                        {
                            if (v22 != 137 && v22 != 139)
                                continue;
                            v23 = 16;
                        }
                        else if (v22 == 180)
                        {
                            v23 = 32;
                        }
                        else if (v22 != 297)
                        {
                            if (v22 != 910)
                                continue;
                            v23 = 0x100;
                        }
                        else
                        {
                            v23 = 128;
                        }
                    }
                    *(unsigned int *)&a0[240] = (int)a0[240] | v23;
                } while ((iter += 1, iter < (int)sub_ad69e4(v21)));
            }
            sub_ad6958(v21, &g_9c3580);
        }
        else
        {
            v24 = arm64g_calculate_condition(1, iter, 1, 0);
            if (!(v24 & 1))
                *(unsigned int *)&a0[232] = (int)a0[232] | 128;
        }
        v25 = sub_af2750(a0, 71, &iter, 0);
        if (v25)
        {
            if (*(int *)v25 >= 1)
                v26 = *(char *)*(long long *)(v25 + 8);
            else
                v26 = 0;
            *(unsigned int *)&a0[244] = v26;
            *(unsigned int *)&a0[232] = (int)a0[232] | 8;
            sub_9cf0f4();
        }
        else
        {
            v27 = arm64g_calculate_condition(1, iter, 1, 0);
            if (!(v27 & 1))
                *(unsigned int *)&a0[232] = (int)a0[232] | 128;
        }
        v28 = sub_af2750(a0, 82, &iter, 0);
        *(unsigned long long *)&a0[248] = v28;
        if (!v28)
        {
            v29 = arm64g_calculate_condition(1, iter, 1, 0);
            if (!(v29 & 1))
                *(unsigned int *)&a0[232] = (int)a0[232] | 128;
        }
        v30 = sub_af2750(a0, 90, &iter, 0);
        *(unsigned long long *)&a0[0x100] = v30;
        if (!v30)
        {
            v31 = arm64g_calculate_condition(1, iter, 1, 0);
            if (!(v31 & 1))
                *(unsigned int *)&a0[232] = (int)a0[232] | 128;
        }
        v32 = sub_ab1c50(a0);
        if (!sub_af1860(v32, sub_97725c(a0)))
        {
            *(unsigned int *)&a0[232] = (int)a0[232] | 32;
            if (!sub_aeb17c(a0, (long long)a0[0x100]) && !sub_aeb264(sub_af1e94(a0), a0))
                *(unsigned int *)&a0[232] = (int)a0[232] | 0x2000;
        }
        v33 = sub_af2750(a0, 0x55, &iter, 0);
        *(unsigned long long *)&a0[280] = v33;
        if (!v33)
        {
            v34 = arm64g_calculate_condition(1, iter, 1, 0);
            if (!(v34 & 1))
                *(unsigned int *)&a0[232] = (int)a0[232] | 128;
        }
        v35 = sub_af2750(a0, 666, &iter, 0);
        *(unsigned long long *)&a0[288] = v35;
        if (!v35)
        {
            v36 = arm64g_calculate_condition(1, iter, 1, 0);
            if (!(v36 & 1))
                *(unsigned int *)&a0[232] = (int)a0[232] | 128;
        }
        v37 = sub_af2750(a0, 103, &v1, 0);
        *(unsigned long long *)&a0[272] = v37;
        if (!v37 && (v38 = arm64g_calculate_condition(1, v1, 1, 0), !(v38 & 1)))
        {
LABEL_aeadb8:
            *(unsigned int *)&a0[232] = (int)a0[232] | 128;
        }
        else
        {
            v1 = 0;
            if ((int)sub_ad69e4() < 1)
                goto LABEL_aeaef0;
            while (1)
            {
                v39 = sub_ad69f8((long long)a0[272], v1);
                if (!v39->padding_0 && (int)sub_ad69e4(v39->field_10) <= 0)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_purp.c", 355, "setup_dp");
                    sub_a36abc(11, 143, 0);
                    goto LABEL_aeadb8;
                }
                v40 = v39->field_8;
                if (v40)
                {
                    v41 = *(int *)&v40->padding_0[0];
                    if (v41 > 0)
                    {
                        v42 = &v40->field_8->field_0;
                        v43 = *v42;
                        v39->field_18 = v43;
                        if (v41 != 1)
                            v43 |= v42[1] * 0x100;
                    }
                    else
                    {
                        v43 = v39->field_18;
                    }
                    v39->field_18 = v43 & 32895;
                    v44 = (unsigned long long)v39->padding_0;
                    if (v44)
                        goto LABEL_aeae94;
                }
                else
                {
                    v39->field_18 = 32895;
                    v44 = (unsigned long long)v39->padding_0;
                    if (v44)
                    {
LABEL_aeae94:
                        if (*(int *)v44 == 1)
                        {
                            if ((int)sub_ad69e4(v39->field_10) >= 1)
                            {
                                v45 = 0;
                                while (1)
                                {
                                    v46 = sub_ad69f8(v39->field_10, v45);
                                    if (*(int *)v46 == 4)
                                        break;
                                    v45 = (unsigned int)v45 + 1;
                                    if ((int)v45 >= (int)sub_ad69e4(v39->field_10))
                                        goto LABEL_aeade0;
                                }
                                if (*(long long *)(v46 + 8))
                                    goto LABEL_aeadec;
                            }
LABEL_aeade0:
                            sub_97725c(a0);
LABEL_aeadec:
                            if (!sub_ae65f0(v39->padding_0))
                                break;
                        }
                    }
                }
                v1 += 1;
                if ((int)sub_ad69e4((long long)a0[272]) <= v1)
                    break;
            }
        }
LABEL_aeaef0:
        v47 = sub_af2750(a0, 290, &iter, 0);
        *(unsigned long long *)&a0[296] = v47;
        if (!v47)
        {
            v48 = arm64g_calculate_condition(1, iter, 1, 0);
            if (!(v48 & 1))
                *(unsigned int *)&a0[232] = (int)a0[232] | 128;
        }
        v49 = sub_af2750(a0, 291, &iter, 0);
        *(unsigned long long *)&a0[304] = v49;
        if (!v49)
        {
            v50 = arm64g_calculate_condition(1, iter, 1, 0);
            if (!(v50 & 1))
                *(unsigned int *)&a0[232] = (int)a0[232] | 128;
        }
        iter = 0;
        if ((int)sub_af26e8(a0) >= 1)
        {
            do
            {
                v51 = iter;
                v52 = sub_af26f8(a0, v51);
                v53 = sub_a99eac(sub_a2d030(v52, v51));
                if (v53 == 857)
                    *(unsigned int *)&a0[232] = (int)a0[232] | 0x1000;
                if (!sub_af4068(v52))
                    continue;
                v2 = (unsigned int)sub_a99eac(sub_a2d030(v52));
                if (v2 && sub_a99ef4(&v2, "G", 15, 4, &g_aeba10))
                {
                    v54 = v53 - 82;
                    if (9 > v54 && 297 >> ((char)v54 & 31) & 1)
                        *(unsigned int *)&a0[232] = (int)a0[232] | g_dfdc7c[v54];
                }
                else
                {
                    *(unsigned int *)&a0[232] = (int)a0[232] | 0x200;
                    break;
                }
            } while ((iter += 1, (int)sub_af26e8(a0) > iter));
        }
        v55 = sub_af3bc4(a0);
        *(unsigned int *)&a0[232] = (int)a0[232] | 0x100;
        /* unsupported instruction */;
        *(unsigned int *)&a0[352] = 1;
        sub_a36cd4(v55);
        sub_a7c1b4((long long)a0[344]);
        if ((unsigned int)((int)a0[232]) >> 7 & 1)
        {
            sub_a368c8(1);
            sub_a369bc("crypto/x509/v3_purp.c", 677, "ossl_x509v3_cache_extensions");
            sub_a36abc(0x22, 158, 0);
            return 0;
        }
        return 1;
    }
    sub_a7c1b4((long long)a0[344]);
    return 1 & ~((unsigned int)((int)a0[232]) >> 7);
}
