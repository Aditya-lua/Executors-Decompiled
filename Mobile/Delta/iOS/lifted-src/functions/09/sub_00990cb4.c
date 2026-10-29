/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x990cb4..0x9911fc (1352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_990cb4_0 {
    void* field_0;
    unsigned long long field_8;
} st_990cb4_0;

typedef struct st_990cb4_2 {
    char padding_0[6];
    void* field_6;
    unsigned long long field_e;
    unsigned long long field_16;
    void* field_1e;
} st_990cb4_2;

typedef struct st_990cb4_1 {
    unsigned int field_0;
    unsigned long long field_4;
    char field_8;
    char field_9;
    char padding_a[19];
    char field_1d;
    char field_1e;
    char padding_1f[19];
    char field_32;
    char padding_33[5];
    void* field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    void* field_50;
} st_990cb4_1;

extern unsigned int g_fffffffffffffffc;

unsigned long long sub_990cb4(st_990cb4_0 *a0, unsigned long long n, unsigned long long a2, unsigned long long a3, st_990cb4_1 *a4, unsigned long long a5, unsigned long long a6)
{
    unsigned long long v3;  // x28
    unsigned long v4;  // x10
    st_990cb4_1 *v13;  // x8
    st_990cb4_0 *v14;  // x0
    unsigned long long v15;  // x10
    st_990cb4_1 *v16;  // x1
    st_990cb4_2 *v17;  // x1
    void* v18;  // x20
    unsigned long v19;  // x9
    void* v20;  // x10
    unsigned long v21;  // x8
    unsigned long long v22;  // x9
    unsigned int v5;  // w24
    unsigned long long v23;  // x9
    unsigned long long v24;  // x11
    unsigned long v25;  // cc_dep1
    void* v26;  // x12
    unsigned long v27;  // x13
    unsigned long long v28;  // w22
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4105
    unsigned long v31;  // x12
    unsigned long long v32;  // 4112
    unsigned int v6;  // w9
    unsigned long long v33;  // 4105
    unsigned long long v34;  // x20
    unsigned long long v35;  // x8
    unsigned long long v36;  // x9
    void* v37;  // x8
    unsigned long long v38;  // x9
    unsigned long long v39;  // x21
    st_990cb4_1 *v40;  // x8
    unsigned int v41;  // w10
    unsigned int v42;  // w11
    unsigned long long v7;  // 4110
    unsigned long long v43;  // x10
    unsigned long long v44;  // x8
    void* v45;  // x10
    unsigned long long v46;  // w11
    unsigned long long v47;  // w11
    unsigned long long v48;  // w12
    unsigned int v49;  // w10
    unsigned long long v50;  // x9
    unsigned long long v51;  // x10
    void* v52;  // x12
    unsigned long long v8;  // 4102
    unsigned long long v53;  // x11
    unsigned long long v54;  // w9
    unsigned long long v55;  // x21
    unsigned long long v56;  // x8
    unsigned long long v57;  // x9
    unsigned long v58;  // x8
    void* v59;  // x9
    unsigned long long v60;  // x10
    void* v61;  // x8
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    unsigned int v11;  // w8
    unsigned long long idx;  // x21
    unsigned long long v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_8;
    if (a6)
        *(unsigned long long *)a6 = 1;
    if (a5)
    {
        *(void* *)a5 = a0->field_0;
        memset(a5 + 8, 0, 24);
    }
    if (v3 < 7)
        return 0;
    v4 = *(char *)a0->field_0;
    v5 = (unsigned int)v4 & 0xff;
    a0->field_0 = a0->field_0 + 1;
    a0->field_8 = v3 - 1;
    v6 = a4->field_0 & 0xffc0bfff & 0xffff8000 | (a4->field_0 & 0xffc0bfff & 0xffffbfff | __ROL__(a2, 14) & 0x4000) & 0x7fff;
    a4->field_0 = v6;
    if (v4 >> 31 & 1)
    {
        v23 = a0->field_8;
        v24 = v23 - 4;
        v25 = v23;
        if (v23 < 4)
            return 0;
        v26 = a0->field_0;
        v27 = *(int *)v26;
        v28 = (unsigned int)((((((v27 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v27 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v27 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v27 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
        a0->field_0 = v26 + 4;
        a0->field_8 = v24;
        if (!(v5 & 64))
        {
            v29 = arm64g_calculate_condition(4, v25, 4, 0);
            v30 = arm64g_calculate_condition(3, (v29 & 1 ? v28 : 0x40000000), 0, 0);
            v31 = !(v30 & 1);
            if (!v24)
                return 0;
        }
        else
        {
            v32 = arm64g_calculate_condition(4, v25, 4, 0);
            v33 = arm64g_calculate_condition(0, (v32 & 1 ? v28 : 0x40000000), 0, 0);
            v31 = !(v33 & 1);
            if (!v24)
                return 0;
        }
        if (v31 & 1)
            return 0;
        v34 = (char)v26[4];
        v35 = v23 - 5;
        a0->field_0 = v26 + 5;
        a0->field_8 = v35;
        if (20 >= v34 && v35 >= v34)
        {
            _memcpy((char *)&a4->field_4 + 1);
            v36 = a0->field_8;
            v37 = a0->field_0 + v34;
            v38 = v36 - v34;
            a0->field_0 = v37;
            a0->field_8 = v38;
            if (v36 != v34 && (v39 = *(char *)v37, a0->field_0 = v37 + 1, a0->field_8 = v38 - 1, 20 >= v39 && sub_9911fc(a0, &a4->padding_a[12], v39)))
            {
                v40 = a4;
                (&a4->field_0)[1] = v28;
                *(char *)&a4->field_4 = v34;
                a4->padding_a[11] = v39;
                if (v28 != 1)
                {
                    v22 = a6;
                    if (v28)
                    {
                        if (!v22)
                            return 0;
                        *(unsigned long long *)v22 = *(long long *)v22 | 2;
                        return 0;
                    }
                    v14 = a0;
                    v41 = v40->field_0 & 0xffff7f00;
                    v42 = v41 & 0xffff0000 | (v41 & 0xffff7fff | ((v5 >> 6) * 0x8000 | v5 >> 23) & 0x8000) & 0xffff | 6;
                    v40->field_0 = v42;
                    v40->field_48 = a0->field_0;
                    v43 = a0->field_8;
                    v40->field_40 = v43;
                    if (!(v43 & 3))
                    {
                        v40->field_0 = v42 & 0xffff8006;
                        *(unsigned long long *)&v40->padding_1f[0x11] = 0;
                        v40->field_38 = 0;
                        *(unsigned int *)&v40->padding_1f[11] = 0;
                        v44 = v14->field_8 - v43;
                        if (v14->field_8 >= v43)
                        {
                            v45 = v14->field_0 + v43;
                            goto LABEL_991108;
                        }
                    }
                }
                else
                {
                    if (21 <= v3)
                    {
                        v22 = a6;
                        v14 = a0;
                        v46 = (v5 * 0x10000000 | v5 >> 4) & 4026531843 & 3;
                        if (1 >= v46)
                        {
                            if (!v46)
                            {
                                v47 = 1;
                                v48 = 1;
                            }
                            else
                            {
                                v47 = 0;
                                v48 = 2;
                            }
                        }
                        else
                        {
                            if (v46 == 2)
                            {
                                v47 = 0;
                                v48 = 3;
                            }
                            else
                            {
                                v47 = 0;
                                v48 = 4;
                            }
                        }
                        v49 = v40->field_0 & 0xffff4000 | v48 | 0x8000;
                        v40->field_0 = v49;
                        if (v47)
                        {
                            if (sub_98ecc8() && (v50 = v0, v51 = a0->field_8 - v50, a0->field_8 >= v50))
                            {
                                v52 = a0->field_0;
                                v40 = a4;
                                *(void* *)&a4->padding_1f[0x11] = v52;
                                a0->field_0 = v52 + v50;
                                a0->field_8 = a0->field_8 - v50;
                                a4->field_38 = v50;
                                if (!v50)
                                    *(unsigned long long *)&v40->padding_1f[0x11] = 0;
                                v49 = v40->field_0;
                                v22 = a6;
                                v14 = a0;
                                goto LABEL_9910bc;
                            }
                        }
                        else
                        {
                            *(unsigned long long *)&v40->padding_1f[0x11] = 0;
                            v40->field_38 = 0;
LABEL_9910bc:
                            if ((char)v49 == 4)
                            {
                                v40->field_48 = v14->field_0;
                                v53 = v14->field_8;
                                v40->field_40 = v53;
                                v40->field_0 = v49 & 0xfff0bf04 & 0xfff00000 | (v49 & 0xfff0bf04 & 0xfff0ffff | (v5 * 0x10000 | v5 >> 16) & 0xf0000) & 0xfffff;
                                *(unsigned int *)&v40->padding_1f[11] = 0;
                                v44 = v14->field_8 - v53;
                                if (v14->field_8 >= v53)
                                {
                                    v45 = v14->field_0 + v53;
                                    v18 = 0;
LABEL_991108:
                                    v14->field_0 = v45;
                                    v14->field_8 = v44;
                                    goto LABEL_99110c;
                                }
                            }
                            else
                            {
                                if (!a2)
                                    v54 = ((v5 * 0x40000 | v5 * 0x400) & 0x3ffc00 & 0xfff00fff) + 0x400;
                                else
                                    v54 = 0;
                                v40->field_0 = v54 | v49 & 0xffcfc3ff;
                                if (sub_98ecc8() && (v55 = v0, v56 = v55 - 4, v55 >= 4 && (a3 || a0->field_8 >= v55)))
                                {
                                    v18 = a0->field_0;
                                    *(unsigned int *)&a4->padding_1f[11] = 0;
                                    if (a2)
                                    {
                                        v57 = a0->field_8 - 4;
                                        if (a0->field_8 >= 4)
                                        {
                                            a0->field_0 = a0->field_0 + 4;
                                            a0->field_8 = v57;
                                            goto LABEL_9911b8;
                                        }
                                    }
                                    else
                                    {
                                        if (sub_9911fc(a0))
                                        {
                                            v58 = a4->field_0;
                                            v56 = v55 - ((v58 * 0x40000000000000 | v58 >> 10) & 0xffc000000000000f & 15);
LABEL_9911b8:
                                            a4->field_40 = v56;
                                            if (a3)
                                            {
                                                a4->field_48 = 0;
                                                v22 = a6;
                                                idx = a5;
                                                v14 = a0;
                                                goto LABEL_990f80;
                                            }
                                            else
                                            {
                                                v59 = a0->field_0;
                                                a4->field_48 = v59;
                                                v60 = a0->field_8 - v56;
                                                if (a0->field_8 >= v56)
                                                {
                                                    v14 = a0;
                                                    a0->field_0 = v59 + v56;
                                                    a0->field_8 = v60;
                                                    v22 = a6;
LABEL_99110c:
                                                    idx = a5;
LABEL_990f80:
                                                    if (idx)
                                                    {
                                                        *(void* *)(idx + 24) = v18;
                                                        if (v18)
                                                        {
                                                            v61 = v18 + 4;
                                                            *(void* *)(idx + 8) = v61;
                                                            *(unsigned long *)(idx + 16) = v14->field_0 + v14->field_8 - v61;
                                                        }
                                                    }
                                                    if (!v22)
                                                        return 1;
                                                    *(unsigned long *)v22 = *(long long *)v22 & (char *)&g_fffffffffffffffc + 2;
                                                    return 1;
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
        }
    }
    else if (20 >= n)
    {
        if (64 <= v5)
        {
            v7 = arm64g_calculate_condition(36, n, 20, 0);
            v8 = arm64g_calculate_condition(52, (v7 & 1 ? v3 : 0), (v7 & 1 ? 21 : 0), 0);
            if (!(v8 & 1))
                goto LABEL_990d44;
        }
        else
        {
            v9 = arm64g_calculate_condition(36, n, 20, 0);
            v10 = arm64g_calculate_condition(48, (v9 & 1 ? v3 : 0), (v9 & 1 ? 21 : 0), 0);
            if (!(v10 & 1))
            {
LABEL_990d44:
                v11 = (v6 & 0xfffffe00 & 0xffc07fff & 0xfffffe00 | (v6 & 0xfffffe00 & 0xffc07fff & 0xfffffeff | ((v5 >> 5) * 0x100 | v5 >> 29) & 0x100) & 0x1ff | 32773) & 0xffc0c105;
                if (!a2)
                    v11 = ((v5 * 0x400 | v5 >> 22) & 0xc00 & 0xfff) + (v5 * 0x20000 & 0x300000) + (v5 * 128 & 0x200 | v11) + 0x400;
                a4->field_0 = v11;
                if (a0->field_8 >= n)
                {
                    idx = a5;
                    _memcpy((char *)&a4->field_4 + 1, a0->field_0, n);
                    v13 = a4;
                    v14 = a0;
                    v15 = a0->field_8 - n;
                    a0->field_0 = a0->field_0 + n;
                    a0->field_8 = v15;
                    v16 = a4;
                    *(unsigned int *)&v16->padding_1f[11] = 0;
                    v17 = &v16->padding_1f[11];
                    *(&v17->padding_0[0] - 42) = n;
                    v18 = a0->field_0;
                    if (a2)
                    {
                        v19 = v14->field_8 - 4;
                        if (v14->field_8 >= 4)
                        {
                            v20 = v18 + 4;
                            goto LABEL_990f64;
                        }
                    }
                    else
                    {
                        v21 = v13->field_0;
                        if (sub_9911fc(v14, v17, (v21 * 0x40000000000000 | v21 >> 10) & 0xffc000000000000f & 15))
                        {
                            v14 = a0;
                            v20 = a0->field_0;
                            v19 = a0->field_8;
                            v13 = a4;
LABEL_990f64:
                            (&v13->field_0)[1] = 0;
                            v13->padding_a[11] = 0;
                            *(unsigned long long *)&v13->padding_1f[0x11] = 0;
                            v13->field_38 = 0;
                            v13->field_40 = v19;
                            v13->field_48 = v20;
                            v14->field_0 = v20 + v19;
                            v14->field_8 = 0;
                            v22 = a6;
                            goto LABEL_990f80;
                        }
                    }
                }
            }
        }
    }
    return 0;
}
