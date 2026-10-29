/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e4dbc..0x9e5174 (952 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;

char sub_9e4dbc(char *a0, unsigned long long a1, char a2, unsigned long long a3, unsigned long long a4)
{
    char idx;  // x19
    char v3;  // x21
    char v12;  // x9
    unsigned long long v13;  // 4105
    unsigned long long v14;  // 4105
    char *iter;  // x23
    char v16;  // w24
    char v17;  // w26
    char v18;  // w10
    char v19;  // x1
    char v20;  // w10
    unsigned long v21;  // x25
    char *v4;  // x10
    unsigned int v22;  // w8
    unsigned long v23;  // x20
    unsigned long v24;  // x8
    char i;  // w9
    char v26;  // x10
    char node;  // x10
    char v28;  // w9
    char v29;  // x12
    char v30;  // x11
    unsigned long v31;  // x13
    unsigned long v5;  // cc_dep1
    unsigned long long v32;  // x14
    unsigned long long v33;  // x12
    unsigned long long v34;  // x15
    unsigned long v35;  // x12
    unsigned long long v36;  // x14
    unsigned long long v37;  // x13
    unsigned long long v38;  // x15
    unsigned long long v39;  // x14
    unsigned long long v40;  // x12
    unsigned long long v41;  // x15
    char v6;  // x22
    unsigned long long v42;  // x14
    unsigned long long v43;  // x13
    unsigned long long v44;  // x15
    unsigned long long v45;  // x14
    unsigned long long v46;  // x12
    unsigned long long v47;  // x15
    unsigned long long v48;  // x13
    unsigned long long v49;  // x15
    unsigned long long v50;  // x14
    unsigned long long v51;  // x12
    unsigned long long v7;  // 4105
    unsigned long long v52;  // x13
    unsigned long v53;  // x8
    unsigned long v54;  // x20
    unsigned long long v8;  // 4105
    char *v9;  // x8
    unsigned long long v10;  // 4106
    unsigned long long v11;  // 4106
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 >> 31 & 1)
        return 0;
    idx = a2;
    if (a2)
    {
        v3 = 0;
        if (!(unsigned int)a1)
            goto LABEL_9e4e6c;
    }
    else
    {
        a3 = a3;
        a0 = a0;
        a4 = a4;
        idx = sub_a6bffc(24, "crypto/bn/bn_lib.c", 246);
        if (!idx)
            return idx;
        *(unsigned int *)(idx + 20) = 1;
        v3 = idx;
        if (!(unsigned int)a1)
        {
LABEL_9e4e6c:
            if (*(long long *)idx)
                sub_a66ec0(*(long long *)idx, *(int *)(idx + 12) * 8);
            *(unsigned int *)(idx + 16) = 0;
            *(unsigned int *)(idx + 8) = 0;
            return idx;
        }
    }
    v4 = &a0[a1 & 0xffffffff] - 1;
    v5 = a3 & 0xffffffff;
    if ((unsigned int)a3 == 1)
    {
        v6 = 1;
        v7 = arm64g_calculate_condition(3, v5, 1, 0);
        if (!(v7 & 1))
            goto LABEL_9e4e02;
LABEL_9e4e01:
        v9 = v4;
        v10 = arm64g_calculate_condition(3, v5, 1, 0);
        if (!(v10 & 1))
            goto LABEL_9e4e0a;
LABEL_9e4e09:
        v12 = 0xffffffffffffffff;
        v13 = arm64g_calculate_condition(3, v5, 1, 0);
        if (!(v13 & 1))
            goto LABEL_9e4e0e;
LABEL_9e4e0d:
        iter = a0;
    }
    else
    {
        v6 = 0xfffffffffffffffe;
        v8 = arm64g_calculate_condition(3, v5, 1, 0);
        if (v8 & 1)
            goto LABEL_9e4e01;
LABEL_9e4e02:
        v9 = a0;
        v11 = arm64g_calculate_condition(3, v5, 1, 0);
        if (v11 & 1)
            goto LABEL_9e4e09;
LABEL_9e4e0a:
        v12 = 0;
        v14 = arm64g_calculate_condition(3, v5, 1, 0);
        if (v14 & 1)
            goto LABEL_9e4e0d;
LABEL_9e4e0e:
        iter = v4;
    }
    if ((unsigned int)a4)
    {
        v16 = 0;
        v17 = 0;
    }
    else
    {
        v18 = *v9;
        v17 = v18 >> 7;
        v16 = ((long long)(v18 * &_NSHomeDirectory) >> 31 & 0xfffffffe | (v18 * 0x2000000 | v18 >> 7) & 4261412865 & 1) & 0xff;
    }
    while (1)
    {
        v19 = a1;
        v20 = *v9;
        if (v16 != v20)
            break;
        v9 = &v9[v12];
        a1 = v19 - 1;
        if (1 >= v19)
        {
            if (v16 == 0xff)
            {
                v19 = 0;
                goto LABEL_9e4ed8;
            }
            else
            {
                *(unsigned int *)(idx + 8) = 0;
                return idx;
            }
        }
    }
    if (v16 != 0xff || (char)v20 < 0)
        goto LABEL_9e4edc;
LABEL_9e4ed8:
    v19 += 1;
LABEL_9e4edc:
    v21 = v19 - 1;
    v22 = (unsigned int)v21 >> 3;
    v23 = v22 + 1;
    if ((int)v22 < *(int *)(idx + 12) || sub_9e49b8(idx, v23))
    {
        *(unsigned int *)(idx + 8) = v23;
        *(unsigned int *)(idx + 16) = v17;
        i = v23;
        v26 = *(long long *)idx;
        node = v26;
        do
        {
            v28 = i;
            if (v19 >= 1)
            {
                v29 = v16 ^ *iter;
                v30 = v29 + v17 & 0xff;
                v17 = v29 > v30;
                iter = &iter[v6];
                v31 = v19 - 1;
                if (v19 != 1)
                {
                    v32 = v16 ^ *iter;
                    if (v29 <= v30)
                        v33 = v32 & 0xffffffff;
                    else
                        v33 = (unsigned int)v32 + 1;
                    v34 = v33 & 0xff;
                    v17 = v32 > v34;
                    v30 = v30 & 0xffffffffffff0000 | (v30 & 0xffffffffffff00ff | (v33 * 0x100 | v33 >> 56) & 0xff00) & 0xffff;
                    v35 = v19 - 2;
                    iter = &iter[v6];
                    if ((unsigned int)v31 >= 2)
                    {
                        v36 = v16 ^ *iter;
                        if (v32 <= v34)
                            v37 = v36 & 0xffffffff;
                        else
                            v37 = (unsigned int)v36 + 1;
                        v38 = v37 & 0xff;
                        v17 = v36 > v38;
                        v30 = v30 & 0xffffffffff000000 | (v30 & 0xffffffffff00ffff | (v37 * 0x10000 | v37 >> 48) & 0xff0000) & 0xffffff;
                        v31 = v19 - 3;
                        iter = &iter[v6];
                        if ((unsigned int)v35 >= 2)
                        {
                            v39 = v16 ^ *iter;
                            if (v36 <= v38)
                                v40 = v39 & 0xffffffff;
                            else
                                v40 = (unsigned int)v39 + 1;
                            v41 = v40 & 0xff;
                            v17 = v39 > v41;
                            v30 = v30 & 0xffffffff00000000 | (v30 & 0xffffffff00ffffff | (v40 * &_NSHomeDirectory | v40 >> 40) & 0xff000000) & 0xffffffff;
                            v35 = v19 - 4;
                            iter = &iter[v6];
                            if ((unsigned int)v31 < 2)
                                goto LABEL_9e50ac;
                            v42 = v16 ^ *iter;
                            if (v39 <= v41)
                                v43 = v42 & 0xffffffff;
                            else
                                v43 = (unsigned int)v42 + 1;
                            v44 = v43 & 0xff;
                            v17 = v42 > v44;
                            v30 = v30 & 0xffffff0000000000 | (v30 & 0xffffff00ffffffff | (v43 * 0x100000000 | v43 >> 32) & 0xff00000000) & 0xffffffffff;
                            v31 = v19 - 5;
                            iter = &iter[v6];
                            if ((unsigned int)v35 >= 2)
                            {
                                v45 = v16 ^ *iter;
                                if (v42 <= v44)
                                    v46 = v45 & 0xffffffff;
                                else
                                    v46 = (unsigned int)v45 + 1;
                                v47 = v46 & 0xff;
                                v17 = v45 > v47;
                                v30 = v30 & 0xffff000000000000 | (v30 & 0xffff00ffffffffff | (v46 * 0x10000000000 | v46 >> 24) & 0xff0000000000) & 0xffffffffffff;
                                v35 = v19 - 6;
                                iter = &iter[v6];
                                if ((unsigned int)v31 >= 2)
                                {
                                    v48 = v16 ^ *iter;
                                    if (v45 <= v47)
                                        v49 = v48 & 0xffffffff;
                                    else
                                        v49 = (unsigned int)v48 + 1;
                                    v50 = v49 & 0xff;
                                    v17 = v48 > v50;
                                    v30 = v30 & 0xff00000000000000 | (v30 & 0xff00ffffffffffff | (v49 * 0x1000000000000 | v49 >> 16) & 0xff000000000000) & 0xffffffffffffff;
                                    iter = &iter[v6];
                                    if ((unsigned int)v35 >= 2)
                                    {
                                        v51 = v16 ^ *iter;
                                        if (v48 <= v50)
                                            v52 = v51 & 0xffffffff;
                                        else
                                            v52 = (unsigned int)v51 + 1;
                                        v17 = v51 > (v52 & 0xff);
                                        v30 |= v52 * 0x100000000000000;
                                        v19 -= 8;
                                        iter = &iter[v6];
                                        goto LABEL_9e4f28;
                                    }
                                    else
                                    {
                                        v19 -= 7;
                                        goto LABEL_9e4f28;
                                    }
                                }
                                goto LABEL_9e50ac;
                            }
                        }
                    }
                    else
                    {
LABEL_9e50ac:
                        v19 = v35;
                        continue;
                    }
                }
                v19 = v31;
                continue;
            }
            else
            {
                v30 = 0;
            }
LABEL_9e4f28:
            *(unsigned long long *)node = v30;
            node += 8;
            i = v28 - 1;
        } while (i);
        v53 = v26 + (v21 & 0xfffffff8);
        do
        {
            v54 = v23;
            if (*(long long *)v53)
            {
                *(unsigned int *)(idx + 8) = v54;
                if ((unsigned int)v54)
                    return idx;
            }
        } while ((v23 = (unsigned int)v54 - 1, v53 -= 8, 1 < (int)v54));
        *(unsigned int *)(idx + 8) = 0;
        *(unsigned int *)(idx + 16) = 0;
        return idx;
    }
    else if (v3)
    {
        v24 = *(int *)(v3 + 20);
        if (!(v24 >> 1 & 1))
        {
            if (!(v24 >> 3 & 1))
                sub_a6c2e4(*(long long *)v3, "crypto/bn/bn_lib.c", 209);
            else
                sub_a6d4c0(*(long long *)v3, *(int *)(v3 + 12) * 8, "crypto/bn/bn_lib.c", 205);
        }
        if (*(char *)(v3 + 20) & 1)
        {
            sub_a6c2e4(v3, "crypto/bn/bn_lib.c", 231);
            return 0;
        }
    }
    return 0;
}
