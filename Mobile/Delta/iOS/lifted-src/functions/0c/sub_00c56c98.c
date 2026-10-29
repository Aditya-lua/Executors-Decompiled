/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc56c98..0xc57374 (1756 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c56c98_1 {
    char padding_0[4];
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
} st_c56c98_1;

typedef struct st_c56c98_2 {
    unsigned int field_0;
    char field_4;
    char padding_5[3];
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
} st_c56c98_2;

typedef struct st_c56c98_0 {
    char field_0;
    char padding_1[7];
    struct st_c56c98_1 *field_8;
    char field_9;
    char padding_a[2];
    unsigned int field_c;
    char padding_10[8];
    struct st_c56c98_1 *field_18;
    char padding_20[8];
    struct st_c56c98_1 *field_28;
    char padding_30[8];
    struct st_c56c98_1 *field_38;
    char padding_40[8];
    unsigned int field_48;
    unsigned int field_4c;
    unsigned int field_50;
    unsigned short field_54;
} st_c56c98_0;

extern char g_e0e838;
extern unsigned long long g_e0e878;
extern char g_e0e8b8;
extern unsigned long long g_e0e8f8;
extern char _NSHomeDirectory;

st_c56c98_0 * sub_c56c98(st_c56c98_0 *a0, unsigned int *a1, unsigned long a2)
{
    unsigned int v4;  // w16
    unsigned int v5;  // x8
    unsigned long long v14;  // x17
    unsigned int *v15;  // x13
    unsigned long long v16;  // x15
    unsigned int v17;  // x2
    unsigned long long v18;  // x22
    unsigned long long v19;  // x21
    unsigned long long v20;  // x20
    unsigned long long v21;  // x19
    unsigned int *iter;  // x1
    unsigned int v23;  // x21
    unsigned int v6;  // x10
    unsigned int *v24;  // x5
    unsigned int v25;  // w20
    unsigned int *v26;  // x5
    unsigned long v27;  // x16
    unsigned long v28;  // x16
    unsigned int v29;  // w17
    unsigned int v30;  // x17
    unsigned int v31;  // w3
    unsigned int v32;  // x3
    unsigned int v33;  // w4
    unsigned int *v7;  // x8
    unsigned int v34;  // w4
    unsigned int v35;  // w6
    unsigned int v36;  // x6
    unsigned int v37;  // w7
    unsigned int v38;  // x7
    unsigned int v39;  // w22
    unsigned int v40;  // x19
    unsigned int v41;  // w5
    unsigned long long v42;  // x20
    unsigned int v8;  // w9
    st_c56c98_2 *v44;  // x5
    unsigned long v45;  // x16
    unsigned int v46;  // w17
    unsigned int v47;  // w3
    unsigned int v48;  // w4
    unsigned int v49;  // w6
    unsigned int v50;  // w7
    unsigned int v51;  // w22
    unsigned int v52;  // x20
    unsigned int v53;  // x5
    unsigned int v9;  // w10
    unsigned int *v54;  // x2
    unsigned long v10;  // x11
    unsigned int v11;  // x13
    unsigned int *v12;  // x12
    unsigned int v13;  // x14
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    unsigned long long v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]

    if (!a2)
    {
        *(unsigned long long *)&a0->field_0 = 0;
        a0->field_8 = a1;
        *(unsigned long long *)&a0->field_9 = 0;
        *(unsigned int **)a0->padding_10 = a1;
        a0->field_18 = 0;
        *(unsigned int **)a0->padding_20 = a1;
        a0->field_28 = 0;
        *(unsigned int **)a0->padding_30 = a1;
        a0->field_38 = 0;
        *(unsigned long long *)a0->padding_40 = 0;
        *(unsigned long long *)&a0->padding_40[6] = 0;
        return a0;
    }
    else if (a2 > 3)
    {
        v4 = *a1;
        if (v4 == 2)
        {
            v5 = 2;
        }
        else
        {
            v5 = v4 & 0xffff;
            if (v5 != 5)
            {
                *(char *)&a0->field_8 = 0x11;
                *(unsigned long long *)&a0->field_9 = v5;
                a0->field_0 = 10;
                return a0;
            }
        }
        switch (v6)
        {
        case 4:
            *(char *)&a0->field_8 = 19;
            memset((char *)&a0->field_8 + 1, 0, 7);
            *(unsigned int **)&a0->field_9 = a1 + 1;
            a0->field_0 = 10;
            return a0;
        case 8:
            *(char *)&a0->field_8 = 19;
            v7 = a1 + 2;
            break;
        case 12:
            *(char *)&a0->field_8 = 19;
            v7 = a1 + 3;
            break;
        default:
            v8 = a1[1];
            v9 = a1[2];
            v10 = a1[3];
            if ((unsigned int)v10 && ((unsigned int)v10 <= v9 || (unsigned int)v10 & (unsigned int)v10 - 1))
            {
                *(char *)&a0->field_8 = 75;
                a0->field_0 = 10;
                return a0;
            }
            v11 = a2 - 16;
            v12 = a1 + 4;
            v13 = v10 * 8;
            v14 = v11 - v13;
            if (v13 > v11)
            {
                a0->field_8 = 19;
                *(unsigned int **)&a0->field_9 = v12;
                a0->field_0 = 10;
                return a0;
            }
            v15 = (char *)v12 + v13;
            v16 = v10 * 4;
            v17 = v14 - v16;
            if (v16 > v14)
            {
                a0->field_8 = 19;
                *(unsigned int **)&a0->field_9 = v15;
                a0->field_0 = 10;
                return a0;
            }
            else if (v8 > 8)
            {
                *(char *)&a0->field_8 = 74;
                a0->field_0 = 10;
                return a0;
            }
            else
            {
                v0 = v18;
                v1 = v19;
                v2 = v20;
                v3 = v21;
                iter = (char *)v15 + v16;
                if (!v8)
                {
                    v52 = 0;
                    v40 = 0;
                    v38 = 0;
                    v36 = 0;
                    v34 = 0;
                    v32 = 0;
                    v30 = 0;
                    v28 = 0;
                    goto LABEL_c56ff4;
                }
                if (v4 == 2)
                {
                    v23 = v17 - 4;
                    if (v17 < 4)
                    {
                        *(char *)&a0->field_8 = 19;
                        memset((char *)&a0->field_8 + 1, 0, 7);
                        *(unsigned int **)&a0->field_9 = iter;
                        a0->field_0 = 10;
                        return a0;
                    }
                    v24 = (char *)v15 + v16;
                    v25 = *v24;
                    v26 = v24 + 1;
                    v27 = *v24 - 1;
                    if (7 >= (unsigned int)v27)
                    {
                        v28 = (&g_e0e838)[(v27 * 8 | v27 >> 61) & 0x7fffffff8 & 0x7ffffffff];
                        if (v8 == 1)
                            goto LABEL_c57058;
                        if (v23 < 4)
                        {
                            *(char *)&a0->field_8 = 19;
                            memset((char *)&a0->field_8 + 1, 0, 7);
                            *(unsigned int **)&a0->field_9 = v26;
                            a0->field_0 = 10;
                            return a0;
                        }
                        v25 = iter[1];
                        v29 = iter[1] - 1;
                        if (7 >= v29)
                        {
                            v23 = v17 - 8;
                            v26 = iter + 2;
                            v30 = 433761748122601729 >> ((char)v29 * 8 & 63);
                            if (v8 == 2)
                                goto LABEL_c57180;
                            if (v23 < 4)
                            {
                                *(char *)&a0->field_8 = 19;
                                memset((char *)&a0->field_8 + 1, 0, 7);
                                *(unsigned int **)&a0->field_9 = v26;
                                a0->field_0 = 10;
                                return a0;
                            }
                            v25 = iter[2];
                            v31 = iter[2] - 1;
                            if (7 >= v31)
                            {
                                v23 = v17 - 12;
                                v26 = iter + 3;
                                v32 = 433761748122601729 >> ((char)v31 * 8 & 63);
                                if (v8 == 3)
                                    goto LABEL_c571dc;
                                if (v23 < 4)
                                {
                                    *(char *)&a0->field_8 = 19;
                                    memset((char *)&a0->field_8 + 1, 0, 7);
                                    *(unsigned int **)&a0->field_9 = v26;
                                    a0->field_0 = 10;
                                    return a0;
                                }
                                v25 = iter[3];
                                v33 = iter[3] - 1;
                                if (7 >= v33)
                                {
                                    v23 = v17 - 16;
                                    v26 = iter + 4;
                                    v34 = 433761748122601729 >> ((char)v33 * 8 & 63);
                                    if (v8 == 4)
                                        goto LABEL_c57234;
                                    if (v23 < 4)
                                    {
                                        *(char *)&a0->field_8 = 19;
                                        memset((char *)&a0->field_8 + 1, 0, 7);
                                        *(unsigned int **)&a0->field_9 = v26;
                                        a0->field_0 = 10;
                                        return a0;
                                    }
                                    v25 = iter[4];
                                    v35 = iter[4] - 1;
                                    if (7 >= v35)
                                    {
                                        v23 = v17 - 20;
                                        v26 = iter + 5;
                                        v36 = 433761748122601729 >> ((char)v35 * 8 & 63);
                                        if (v8 == 5)
                                            goto LABEL_c57288;
                                        if (v23 < 4)
                                        {
                                            *(char *)&a0->field_8 = 19;
                                            memset((char *)&a0->field_8 + 1, 0, 7);
                                            *(unsigned int **)&a0->field_9 = v26;
                                            a0->field_0 = 10;
                                            return a0;
                                        }
                                        v25 = iter[5];
                                        v37 = iter[5] - 1;
                                        if (7 >= v37)
                                        {
                                            v23 = v17 - 24;
                                            v26 = iter + 6;
                                            v38 = 433761748122601729 >> ((char)v37 * 8 & 63);
                                            if (v8 == 6)
                                                goto LABEL_c572d8;
                                            if (v23 < 4)
                                            {
                                                *(char *)&a0->field_8 = 19;
                                                memset((char *)&a0->field_8 + 1, 0, 7);
                                                *(unsigned int **)&a0->field_9 = v26;
                                                a0->field_0 = 10;
                                                return a0;
                                            }
                                            v25 = iter[6];
                                            v39 = iter[6] - 1;
                                            if (7 >= v39)
                                            {
                                                v23 = v17 - 28;
                                                v26 = iter + 7;
                                                v40 = 433761748122601729 >> ((char)v39 * 8 & 63);
                                                if (v8 == 7)
                                                    goto LABEL_c57324;
                                                if (v23 < 4)
                                                {
                                                    *(char *)&a0->field_8 = 19;
                                                    memset((char *)&a0->field_8 + 1, 0, 7);
                                                    *(unsigned int **)&a0->field_9 = v26;
                                                    a0->field_0 = 10;
                                                    return a0;
                                                }
                                                v25 = *v26;
                                                v41 = *v26 - 1;
                                                if (8 > v41)
                                                {
                                                    v42 = &g_e0e878;
                                                    goto LABEL_c5735c;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    *(char *)&a0->field_8 = 78;
                    *(unsigned int *)((char *)&a0->field_8 + 4) = v25;
                    a0->field_0 = 10;
                    return a0;
                }
                if (v17 <= 3)
                {
                    v26 = iter;
                    *(char *)&a0->field_8 = 19;
                    memset((char *)&a0->field_8 + 1, 0, 7);
                    *(unsigned int **)&a0->field_9 = v26;
                    a0->field_0 = 10;
                    return a0;
                }
                v44 = (char *)v15 + v16;
                v25 = v44->field_0;
                v26 = &v44->field_4;
                v45 = v25 - 1;
                if (7 < (unsigned int)v45)
                {
                    *(char *)&a0->field_8 = 77;
                    *(unsigned int *)((char *)&a0->field_8 + 4) = v25;
                    a0->field_0 = 10;
                    return a0;
                }
                if (253 >> ((char)v45 & 31) & 1)
                {
                    v23 = v17 - 4;
                    v28 = (&g_e0e8b8)[(v45 * 8 | v45 >> 61) & 0x7fffffff8 & 0x7ffffffff];
                    if (v8 == 1)
                    {
LABEL_c57058:
                        v40 = 0;
                        v38 = 0;
                        v36 = 0;
                        v34 = 0;
                        v32 = 0;
                        v30 = 0;
                        goto LABEL_c57074;
                    }
                    if (v23 < 4)
                    {
                        *(char *)&a0->field_8 = 19;
                        memset((char *)&a0->field_8 + 1, 0, 7);
                        *(unsigned int **)&a0->field_9 = v26;
                        a0->field_0 = 10;
                        return a0;
                    }
                    v25 = iter[1];
                    v46 = v25 - 1;
                    if (7 < v46)
                    {
                        *(char *)&a0->field_8 = 77;
                        *(unsigned int *)((char *)&a0->field_8 + 4) = v25;
                        a0->field_0 = 10;
                        return a0;
                    }
                    if (253 >> ((char)v46 & 31) & 1)
                    {
                        v23 = v17 - 8;
                        v26 = iter + 2;
                        v30 = 506100821432205313 >> ((char)v46 * 8 & 63);
                        if (v8 == 2)
                        {
LABEL_c57180:
                            v40 = 0;
                            v38 = 0;
                            v36 = 0;
                            v34 = 0;
                            v32 = 0;
                            goto LABEL_c57074;
                        }
                        if (v23 < 4)
                        {
                            *(char *)&a0->field_8 = 19;
                            memset((char *)&a0->field_8 + 1, 0, 7);
                            *(unsigned int **)&a0->field_9 = v26;
                            a0->field_0 = 10;
                            return a0;
                        }
                        v25 = iter[2];
                        v47 = v25 - 1;
                        if (7 >= v47 && 253 >> ((char)v47 & 31) & 1)
                        {
                            v23 = v17 - 12;
                            v26 = iter + 3;
                            v32 = 506100821432205313 >> ((char)v47 * 8 & 63);
                            if (v8 == 3)
                            {
LABEL_c571dc:
                                v40 = 0;
                                v38 = 0;
                                v36 = 0;
                                v34 = 0;
                                goto LABEL_c57074;
                            }
                            if (v23 < 4)
                            {
                                *(char *)&a0->field_8 = 19;
                                memset((char *)&a0->field_8 + 1, 0, 7);
                                *(unsigned int **)&a0->field_9 = v26;
                                a0->field_0 = 10;
                                return a0;
                            }
                            v25 = iter[3];
                            v48 = v25 - 1;
                            if (7 >= v48 && 253 >> ((char)v48 & 31) & 1)
                            {
                                v23 = v17 - 16;
                                v26 = iter + 4;
                                v34 = 506100821432205313 >> ((char)v48 * 8 & 63);
                                if (v8 == 4)
                                {
LABEL_c57234:
                                    v40 = 0;
                                    v38 = 0;
                                    v36 = 0;
                                    goto LABEL_c57074;
                                }
                                if (v23 < 4)
                                {
                                    *(char *)&a0->field_8 = 19;
                                    memset((char *)&a0->field_8 + 1, 0, 7);
                                    *(unsigned int **)&a0->field_9 = v26;
                                    a0->field_0 = 10;
                                    return a0;
                                }
                                v25 = iter[4];
                                v49 = v25 - 1;
                                if (7 >= v49 && 253 >> ((char)v49 & 31) & 1)
                                {
                                    v23 = v17 - 20;
                                    v26 = iter + 5;
                                    v36 = 506100821432205313 >> ((char)v49 * 8 & 63);
                                    if (v8 == 5)
                                    {
LABEL_c57288:
                                        v40 = 0;
                                        v38 = 0;
                                        goto LABEL_c57074;
                                    }
                                    if (v23 < 4)
                                    {
                                        *(char *)&a0->field_8 = 19;
                                        memset((char *)&a0->field_8 + 1, 0, 7);
                                        *(unsigned int **)&a0->field_9 = v26;
                                        a0->field_0 = 10;
                                        return a0;
                                    }
                                    v25 = iter[5];
                                    v50 = v25 - 1;
                                    if (7 >= v50 && 253 >> ((char)v50 & 31) & 1)
                                    {
                                        v23 = v17 - 24;
                                        v26 = iter + 6;
                                        v38 = 506100821432205313 >> ((char)v50 * 8 & 63);
                                        if (v8 == 6)
                                        {
LABEL_c572d8:
                                            v40 = 0;
                                            goto LABEL_c57074;
                                        }
                                        else
                                        {
                                            if (v23 < 4)
                                            {
                                                *(char *)&a0->field_8 = 19;
                                                memset((char *)&a0->field_8 + 1, 0, 7);
                                                *(unsigned int **)&a0->field_9 = v26;
                                                a0->field_0 = 10;
                                                return a0;
                                            }
                                            v25 = iter[6];
                                            v51 = v25 - 1;
                                            if (7 >= v51 && 253 >> ((char)v51 & 31) & 1)
                                            {
                                                v23 = v17 - 28;
                                                v26 = iter + 7;
                                                v40 = 506100821432205313 >> ((char)v51 * 8 & 63);
                                                if (v8 == 7)
                                                {
LABEL_c57324:
                                                    v52 = 0;
LABEL_c57074:
                                                    goto LABEL_c56ff4;
                                                }
                                                else
                                                {
                                                    if (v23 < 4)
                                                    {
                                                        *(char *)&a0->field_8 = 19;
                                                        memset((char *)&a0->field_8 + 1, 0, 7);
                                                        *(unsigned int **)&a0->field_9 = v26;
                                                        a0->field_0 = 10;
                                                        return a0;
                                                    }
                                                    v25 = *v26;
                                                    v41 = v25 - 1;
                                                    if (7 >= v41 && 253 >> ((char)v41 & 31) & 1)
                                                    {
                                                        v42 = &g_e0e8f8;
LABEL_c5735c:
                                                        iter += 8;
                                                        v17 -= 32;
                                                        v52 = *(char *)(v42 + v41 * 8 + 7) * 0x100000000000000;
LABEL_c56ff4:
                                                        v53 = v8 * v9 * 4;
                                                        if (v53 > v17)
                                                        {
                                                            a0->field_8 = 19;
                                                            *(unsigned int **)&a0->field_9 = iter;
                                                            a0->field_0 = 10;
                                                            return a0;
                                                        }
                                                        v54 = (char *)iter + v53;
                                                        if (v53 <= v17 - v53)
                                                        {
                                                            *(unsigned long *)&a0->field_0 = v52 | (v40 * 0x1000000000000 | v40 >> 16) & 0xff000000000000 & 0xffffffffffffff | (v38 * 0x10000000000 | v38 >> 24) & 0xff0000000000 & 0xffffffffffff | (v36 * 0x100000000 | v36 >> 32) & 0xff00000000 & 0xffffffffff | v34 * &_NSHomeDirectory | (v32 * 0x10000 | v32 >> 48) & 0xff0000 & 0xffffff | (v30 * 0x100 | v30 >> 56) & 0xff00 & 0xffff | v28;
                                                            a0->field_8 = v12;
                                                            *(unsigned long long *)&a0->field_9 = v13;
                                                            *(unsigned int **)a0->padding_10 = v15;
                                                            a0->field_18 = v16;
                                                            *(unsigned int **)a0->padding_20 = iter;
                                                            a0->field_28 = v53;
                                                            *(unsigned int **)a0->padding_30 = v54;
                                                            a0->field_38 = v53;
                                                            *(unsigned int *)&a0->padding_40[0] = v8;
                                                            *(unsigned int *)&a0->padding_40[4] = v9;
                                                            a0->field_48 = v10;
                                                            *(unsigned short *)&a0->field_4c = v5;
                                                            return a0;
                                                        }
                                                        a0->field_8 = 19;
                                                        *(unsigned int **)&a0->field_9 = v54;
                                                        a0->field_0 = 10;
                                                        return a0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                *(char *)&a0->field_8 = 77;
                *(unsigned int *)((char *)&a0->field_8 + 4) = v25;
                a0->field_0 = 10;
                return a0;
            }
        }
        memset((char *)&a0->field_8 + 1, 0, 7);
        *(unsigned int **)&a0->field_9 = v7;
        a0->field_0 = 10;
        return a0;
    }
    else
    {
        *(char *)&a0->field_8 = 19;
        memset((char *)&a0->field_8 + 1, 0, 7);
        *(unsigned int **)&a0->field_9 = a1;
        a0->field_0 = 10;
        return a0;
    }
}
