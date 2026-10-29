/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3a3bc..0xc3a72c (880 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3a3bc_0 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
} st_c3a3bc_0;

extern long long g_efcef0;
extern long long g_efcf08;
extern long long g_efcf20;

void sub_c3a3bc(void* a0, void* a1)
{
    char i;  // x12
    unsigned long v3;  // x8
    unsigned long long v12;  // x2
    unsigned long long v13;  // x4
    unsigned long long v14;  // x16
    char *v15;  // x5
    unsigned long v16;  // x19
    unsigned long v17;  // x10
    unsigned long long v18;  // 4109
    unsigned long v19;  // x11
    unsigned long v20;  // x21
    unsigned long v21;  // x20
    char *v4;  // x13
    unsigned long long v22;  // 4114
    char v23;  // x11
    unsigned long long v24;  // 4108
    char v25;  // x20
    char v26;  // x11
    unsigned long long v27;  // 4118
    unsigned long long v28;  // 4114
    unsigned long long *v29;  // x9
    unsigned long long *v30;  // x11
    unsigned long long v31;  // 4110
    unsigned long v5;  // x9
    unsigned long v33;  // x0
    unsigned long v35;  // x9
    unsigned long long v36;  // x2
    unsigned long v37;  // x3
    unsigned long long v38;  // 4119
    unsigned long long v39;  // 4102
    unsigned long v40;  // x14
    unsigned long long v41;  // 4119
    unsigned long v6;  // x14
    unsigned long long v43;  // 4106
    st_c3a3bc_0 *v44;  // x10
    unsigned long v45;  // x11
    unsigned int v46;  // w8
    unsigned int v47;  // w12
    unsigned int v48;  // w11
    unsigned int v49;  // w12
    unsigned int v50;  // w8
    char v51;  // x8
    char v7;  // x11
    unsigned long long v52;  // x8
    unsigned long v8;  // x10
    unsigned long v9;  // x15
    unsigned long long v10;  // x17
    unsigned long v11;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(long long *)a1 == 1)
    {
        i = (long long)a1[40];
        v3 = (long long)a1[80];
        if (i == v3)
        {
            *(unsigned long long *)a0 = 2;
            return;
        }
        v4 = (long long)a1[72];
        v5 = (long long)a1[96];
        v6 = v5 - 1;
        v8 = v3;
        if (v3 > i + v6)
        {
            v9 = (long long)a1[56];
            v10 = (long long)a1[8];
            v11 = (long long)a1[24];
            v12 = (long long)a1[32];
            v13 = (long long)a1[24] + i;
            v14 = i + v5;
            v15 = (long long)a1[88];
            v16 = v9;
            v8 = i;
            while (i == v8)
            {
                if (v12 >> (v4[v7] & 63) & 1)
                {
                    if (v10 < v16)
                        v17 = v16;
                    else
                        v17 = v10;
                    v18 = arm64g_calculate_condition(2, v9, 1, 0);
                    if (v18 & 1)
                        v17 = v10;
                    if (v5 < v17)
                        v19 = v17;
                    else
                        v19 = v5;
                    v20 = v17;
                    do
                    {
                        if (v19 == v20)
                        {
                            v24 = arm64g_calculate_condition(2, v9, 1, 0);
                            if (v24 & 1)
                                v25 = 0;
                            else
                                v25 = v16;
                            v17 = v10;
                            do
                            {
                                if (v17 <= v25)
                                {
                                    *(unsigned long long *)&a1[40] = v14;
                                    v31 = arm64g_calculate_condition(2, v9, 1, 0);
                                    if (!(v31 & 1))
                                        *(unsigned long long *)&a1[56] = 0;
                                    *(unsigned long long *)&a0[8] = i;
                                    *(unsigned long long *)&a0[16] = v14;
                                    *(unsigned long long *)a0 = 0;
                                    return;
                                }
                                v17 -= 1;
                                if (v5 <= v17)
                                    sub_c73c94(v17, v5, &g_efcef0);
                                v26 = v17 + i;
                                if (v3 <= v26)
                                {
                                    sub_c73c94(v26, v3, &g_efcf08);
                                    sub_c73c94(v17, v5, &g_efcef0);
                                }
                            } while (v15[v17] == v4[v26]);
                            *(unsigned long long *)&a1[40] = v13;
                            v23 = v5 - v11;
                            v8 = v13;
                            v27 = arm64g_calculate_condition(2, v9, 1, 0);
                            if (v27 & 1)
                                goto LABEL_c3a520;
                            goto LABEL_c3a518;
                        }
                        v21 = v20;
                        if (v3 <= i + v20)
                        {
                            v5 = v17 + i;
                            if (v5 < v3)
                                v33 = v3;
                            else
                                v33 = v5;
                            sub_c73c94(v33, v3, &g_efcf20);
                            sub_c73c94(v17, v5, &g_efcef0);
                        }
                        v20 = v21 + 1;
                    } while (v15[v21] == v4[v21 + i]);
                    v8 = i - v10 + 1 + v21;
                    *(unsigned long *)&a1[40] = v8;
                    v22 = arm64g_calculate_condition(2, v9, 1, 0);
                    if (v22 & 1)
                        goto LABEL_c3a520;
                    v23 = 0;
                }
                else
                {
                    *(unsigned long long *)&a1[40] = v14;
                    v8 = i + v5;
                    v28 = arm64g_calculate_condition(2, v9, 1, 0);
                    if (v28 & 1)
                        goto LABEL_c3a520;
                    v23 = 0;
                    v8 = i + v5;
                }
LABEL_c3a518:
                *(unsigned long long *)&a1[56] = v23;
                v16 = v23;
LABEL_c3a520:
                if (v8 + v6 >= v3)
                {
                    v29 = a0 + 8;
                    v30 = a0 + 16;
                    v8 = v3;
                    goto LABEL_c3a598;
                }
            }
        }
        goto LABEL_c3a58c;
    }
    else
    {
        if ((char)a1[26] & 1)
        {
            *(unsigned long long *)a0 = 2;
            return;
        }
        v35 = (char)a1[24];
        *(char *)&a1[24] = (char)v35 ^ 1;
        v36 = (long long)a1[8];
        v3 = (long long)a1[72];
        v37 = (long long)a1[80];
        if (v36)
        {
            if (v37 > v36)
            {
                v8 = *(char *)(v3 + v36);
                v38 = arm64g_calculate_condition(161, v8 & 0xffffffff, 64, 0);
                if (!(v38 & 1))
                    goto LABEL_c3a578;
            }
            else
            {
                v39 = arm64g_calculate_condition(20, v36, v37, 0);
                if (v39 & 1)
                {
LABEL_c3a578:
                    a1 = v37;
                    a0 = sub_c73cc8(v3, a1);
LABEL_c3a58c:
                    v29 = a0 + 8;
                    v30 = a0 + 16;
                    if (v8)
                    {
LABEL_c3a598:
                        v40 = v8;
                        do
                        {
                            if (v3 > v40)
                            {
                                v41 = arm64g_calculate_condition(209, v4[v40], 65, 0);
                                if (v41 & 1)
                                    continue;
                                v3 = v40;
                                goto LABEL_c3a668;
                            }
                            else
                            {
                                continue;
                                if (v3 == v40)
                                    goto LABEL_c3a668;
                            }
                        } while ((v43 = arm64g_calculate_condition(50, v40, 1, 0), v40 += 1, v43 & 1));
                    }
                    v3 = 0;
LABEL_c3a668:
                    if (v3 >= v8)
                        v8 = v3;
                    *(unsigned long *)&a1[40] = v8;
                    *v29 = i;
                    *v30 = v3;
                    *(unsigned long long *)a0 = 1;
                    return;
                }
            }
        }
        if (v36 != v37)
        {
            v44 = v3 + v36;
            v45 = v44->field_0;
            v46 = (unsigned int)v45 & 0xff;
            if (!(v45 >> 31 & 1))
            {
                if (!(v35 & 1))
                    goto LABEL_c3a68c;
            }
            else
            {
                v47 = v44->field_1 & 63;
                if (v46 >= 224)
                {
                    v48 = v46 & 31;
                    v49 = v44->field_2 & 63 | v47 * 64;
                    if (v46 >= 240)
                    {
                        v50 = v44->field_3 & 63 | v49 * 64;
                        v46 = v50 & 0xffe00000 | (v50 & 0xffe3ffff | __ROL__(v48, 18) & 0x1c0000) & 0x1fffff;
                        if (!(v35 & 1))
                            goto LABEL_c3a68c;
                    }
                    else
                    {
                        v46 = v49 | v48 * 0x1000;
                        if (!(v35 & 1))
                            goto LABEL_c3a68c;
                    }
                }
                else
                {
                    v46 = (v47 & 63 | __ROL__(v46, 6) & 1984) & 0x7ff;
                    if (!(v35 & 1))
                    {
LABEL_c3a68c:
                        if (128 > v46)
                        {
                            v51 = 1;
                        }
                        else
                        {
                            if (0x800 > v46)
                            {
                                v51 = 2;
                            }
                            else
                            {
                                v51 = 3;
                                if (v46 >= 0x10000)
                                    v51 = 4;
                            }
                        }
LABEL_c3a6b8:
                        v52 = v51 + v36;
                        *(unsigned long long *)&a1[8] = v52;
                        *(unsigned long long *)&a0[8] = v36;
                        *(unsigned long long *)&a0[16] = v52;
                        goto LABEL_c3a6b8;
                        *(unsigned long long *)a0 = 1;
                        return;
                    }
                }
            }
        }
        else if (!(v35 & 1))
        {
            *(char *)&a1[26] = 1;
            *(unsigned long long *)a0 = 2;
            return;
        }
        *(unsigned long long *)&a0[8] = v36;
        *(unsigned long long *)&a0[16] = v36;
        *(unsigned long long *)a0 = 0;
        return;
    }
}
