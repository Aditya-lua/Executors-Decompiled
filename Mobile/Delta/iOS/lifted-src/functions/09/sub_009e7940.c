/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e7940..0x9e7dc8 (1160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9e7940(unsigned long long *a0, long long a1, long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5, long long a6)
{
    unsigned long long v8;  // x23
    long long v9;  // x19
    long long v18;  // x2
    unsigned long long v19;  // x3
    long long v20;  // x1
    long long v21;  // x0
    long long v22;  // x1
    unsigned long long v23;  // x3
    long long v24;  // x2
    unsigned long long v25;  // 4112
    unsigned long long *v26;  // x28
    unsigned long long v27;  // x24
    unsigned long long v10;  // x24
    unsigned long long v28;  // x27
    unsigned long long v29;  // x19
    long long v30;  // x27
    unsigned long long v31;  // x3
    unsigned long long v32;  // w28
    long long v33;  // x0
    unsigned long long v34;  // x8
    long long v35;  // x0
    unsigned long long v36;  // 4102
    long long v37;  // x24
    long long v11;  // x28
    unsigned long v38;  // x3
    unsigned long long v39;  // x24
    unsigned long long v40;  // x19
    unsigned int v41;  // w23
    long long v42;  // x0
    unsigned int v43;  // w22
    unsigned long long v44;  // x0
    int v45;  // w9
    unsigned long long v46;  // 4116
    unsigned long v47;  // x8
    unsigned int v12;  // w0
    unsigned long long v48;  // x10
    unsigned long long v49;  // 4135
    unsigned long long *iter;  // x8
    unsigned long v51;  // x9
    unsigned long long v52;  // 4115
    long long v13;  // x27
    unsigned int v14;  // w9
    unsigned long long v15;  // x22
    unsigned int v16;  // w8
    long long v17;  // x0
    unsigned long long v0;  // [bp-0x88]
    unsigned int v1;  // [bp-0x84]
    unsigned long long v2;  // [bp-0x80]
    unsigned long long v3;  // [bp-0x78]
    unsigned long long *v4;  // [bp-0x70]
    unsigned long long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a5;
    v9 = a2;
    if (7 >= (int)a3)
        return sub_9e77f0();
    v3 = (unsigned int)a3 * 2;
    v4 = a0;
    v10 = (a3 * 8 | a3 >> 61) & 0x7fffffff8 & 0x7ffffffff;
    v11 = a3 - a4;
    v5 = a3 & 0xffffffff;
    v12 = sub_9e58d0(a1, a1 + v10, a4, v11);
    v13 = v8 - a3;
    v14 = v12 * 3 + sub_9e58d0(v9 + v10, v9, v8, v13);
    v15 = 1;
    v16 = v14 + 3;
    if (7 < v16)
    {
        v25 = arm64g_calculate_condition(0x11, v14, 4, 0);
        if (v25 & 1)
            goto LABEL_9e7b0c;
        sub_9e7168(a6, a1 + v10, a1, a4, a4 - a3);
        v21 = a6 + v5 * 8;
        v13 = a3 - v8;
        v24 = v9 + v10;
        v23 = v8;
        v22 = v9;
        goto LABEL_9e7b08;
    }
    else if (1 << ((char)v16 & 31) & 60)
    {
        sub_9e7168(a6, a1, a1 + v10, a4, v11);
        v17 = a6 + v5 * 8;
        v13 = a3 - v8;
        v18 = v9 + v10;
        v19 = v8;
        v20 = v9;
        goto LABEL_9e7a90;
    }
    else if (1 << ((char)v16 & 31) & 3)
    {
        sub_9e7168(a6, a1 + v10, a1, a4, a4 - a3);
        v17 = a6 + v5 * 8;
        v20 = v9 + v10;
        v19 = v8;
        v18 = v9;
LABEL_9e7a90:
        sub_9e7168(v17, v20, v18, v19, v13);
        v15 = 0;
    }
    else
    {
        sub_9e7168(a6, a1, a1 + v10, a4, v11);
        v21 = a6 + v5 * 8;
        v22 = v9 + v10;
        v23 = v8;
        v24 = v9;
LABEL_9e7b08:
        sub_9e7168(v21, v22, v24, v23, v13);
    }
LABEL_9e7b0c:
    v2 = v10;
    v26 = v4;
    if ((unsigned int)a3 == 8)
    {
        v27 = v3;
        v28 = (v27 * 8 | v27 >> 61) & 0x7fffffff8 & 0x7ffffffff;
        sub_9dbcc4(a6 + v28, a6, a6 + v5 * 8);
        sub_9dbcc4(v26, a1, v9);
        sub_9e77f0((char *)v26 + v28, a1 + v2, a4, v9 + v2, v8);
        v29 = 16;
        _bzero(&v26[v27 + a4 + v8], (long long)((16 - (v8 + a4)) * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(16 - (v8 + a4), 3) & 0x7fffffff8 & 0x7ffffffff);
    }
    else
    {
        v1 = v15;
        v30 = a6 + (unsigned int)a3 * 4 * 8;
        v27 = v3;
        sub_9e7384(a6 + (v27 & 0xffffffff) * 8, a6, a6 + v5 * 8, a3, 0, 0, v30);
        sub_9e7384(v26, a1, v9, a3, 0, 0, v30);
        v31 = (unsigned int)a3 >> 1;
        if ((int)v8 < (int)a4)
            v32 = (unsigned int)a4;
        else
            v32 = (unsigned int)v8;
        v33 = &v26[v27];
        if (v32 == (unsigned int)v31)
        {
            sub_9e7384(v33, a1 + v2, v9 + v2, v31, a4 - v31, v8 - v31, v30);
            v34 = (unsigned int)a3 & 0x7ffffffe;
            v35 = &v26[v27 + v34 & 0xffffffff];
            goto LABEL_9e7c4c;
        }
        else
        {
            v36 = arm64g_calculate_condition(211, v32, v31 & 0xffffffff, 0);
            if (!(v36 & 1))
            {
                sub_9e7940(v33, a1 + v2, v9 + v2, v31, a4 - v31, v8 - v31, v30);
                v34 = v8 + a4;
                v35 = &v26[v27 + v34];
LABEL_9e7c4c:
                _bzero(v35, (long long)((v27 - v34) * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(v27 - v34, 3) & 0x7fffffff8 & 0x7ffffffff);
                v15 = v1;
                v29 = v27;
            }
            else
            {
                v0 = (unsigned int)v31;
                v37 = v33;
                _bzero();
                if (15 >= (int)a4)
                {
                    v38 = v0;
                    v15 = v1;
                    if (16 <= (int)v8)
                        goto LABEL_9e7cb8;
                    sub_9e77f0(v37, a1 + v2, a4, v9 + v2, v8);
                }
                else
                {
                    v38 = v0;
                    v15 = v1;
                    do
                    {
LABEL_9e7cb8:
                        v38 = (unsigned int)v38 >> 1;
                        if ((int)v38 < v32)
                        {
                            sub_9e7940(v37, a1 + v2, v9 + v2, v38, a4 - v38, v8 - v38, v30);
                            goto LABEL_9e7d04;
                        }
                    } while ((unsigned int)a4 != (unsigned int)v38 && (unsigned int)v8 != (unsigned int)v38);
                    sub_9e7384();
                }
LABEL_9e7d04:
                v27 = v3;
                v26 = v4;
                v29 = v27;
            }
        }
    }
    v39 = v27;
    v40 = v29 * 8;
    v41 = sub_9dbad4(a6, v26, (char *)v26 + v40, v39);
    v42 = a6 + v40;
    if (v15 & 1)
        v43 = sub_9dbad4(v42, a6 + v40, a6, v39) + v41;
    else
        v43 = v41 - sub_9dbbc8(v42, a6, a6 + v40, v39);
    v44 = sub_9dbad4(&v26[v5], &v26[v5], a6 + v40, v39);
    v45 = v43 + (unsigned int)v44;
    v46 = arm64g_calculate_condition(1, v43, v44 & 0xffffffff, 0);
    if (v46 & 1)
        return v44;
    v47 = (unsigned int)a3 * 3;
    v48 = v26[v47 & 0xffffffff];
    v26[v47 & 0xffffffff] = v48 + v45;
    v49 = arm64g_calculate_condition(50, v48, v45, 0);
    if (v49 & 1)
        return v44;
    iter = &v26[v47 + 1];
    do
    {
        v51 = *iter;
        *iter = v51 + 1;
        iter += 1;
        v52 = arm64g_calculate_condition(0x22, v51, 1, 0);
    } while (v52 & 1);
    return v44;
}
