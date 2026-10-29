/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e7384..0x9e77f0 (1132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9e7384(unsigned long long *a0, long long a1, long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5, long long a6)
{
    unsigned long long v4;  // x24
    long long v5;  // x23
    unsigned long long v14;  // x26
    unsigned long long v15;  // 4131
    unsigned long long v16;  // 4102
    unsigned long long v17;  // w8
    unsigned long long v18;  // x27
    unsigned long long v19;  // x27
    long long v20;  // x0
    unsigned long long v21;  // x4
    long long v22;  // x2
    long long v23;  // x3
    unsigned int v6;  // w28
    long long v24;  // x1
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4113
    unsigned long long v28;  // x26
    unsigned long long v29;  // x26
    unsigned int v30;  // w9
    unsigned long long v31;  // x28
    unsigned long v32;  // x0
    unsigned long v33;  // x0
    unsigned long long v7;  // x0
    long long v34;  // x26
    long long v35;  // x0
    unsigned long long v36;  // x24
    unsigned int v37;  // w23
    long long v38;  // x0
    unsigned int v39;  // w23
    unsigned long long v40;  // x0
    int v41;  // w9
    unsigned long long v42;  // 4116
    unsigned long long v43;  // x8
    unsigned long long v8;  // 4116
    unsigned long long v44;  // x10
    unsigned long long v45;  // 4135
    unsigned long long *iter;  // x8
    unsigned long v47;  // x9
    unsigned long long v48;  // 4115
    unsigned long long v9;  // x26
    unsigned long long v10;  // x22
    unsigned int v11;  // w0
    unsigned long long v12;  // x22
    unsigned int v13;  // w9
    unsigned int v0;  // [bp-0x74]
    unsigned long long v1;  // [bp-0x70]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a5;
    v5 = a2;
    v6 = (unsigned int)a5 | (unsigned int)a4;
    if ((unsigned int)a3 == 8 && !v6)
        return sub_9dbcc4();
    if (15 >= (int)a3)
    {
        v7 = sub_9e77f0(a0);
        v8 = arm64g_calculate_condition(81, v4 & 0xffffffff, a4 & 0xffffffff, 0);
        if (v8 & 1)
            return v7;
        return _bzero();
    }
    else
    {
        v9 = (unsigned int)a3 / 2;
        v10 = (v9 * 8 | v9 >> 61) & 0x7fffffff8 & 0x7ffffffff;
        v0 = -(unsigned int)a4;
        v11 = sub_9e58d0(a1, a1 + v10, v9 + a4, v0);
        v1 = v10;
        v12 = v9;
        v13 = v11 * 3 + sub_9e58d0(v5 + v10, v5, v12 + v4, v4);
        v14 = 1;
        v15 = arm64g_calculate_condition(209, v13, 2, 0);
        if (v15 & 1)
        {
            v25 = arm64g_calculate_condition(1, v13, 4, 0);
            if (v25 & 1)
            {
                v29 = v12;
                sub_9e7168(a6, a1 + v1, a1, v29 + a4, a4);
                v12 = v29;
                sub_9e7168(a6 + v12 * 8, v5, v5 + v1, v12 + v4, -(unsigned int)v4);
                v14 = 1;
                goto LABEL_9e75dc;
            }
            v26 = arm64g_calculate_condition(1, v13, 3, 0);
            if (v26 & 1)
                goto LABEL_9e7558;
            v17 = 1;
            v27 = arm64g_calculate_condition(0x11, v13, 2, 0);
            if (v27 & 1)
                goto LABEL_9e75e0;
            v28 = v12;
            sub_9e7168(a6, a1 + v1, a1, v28 + a4, a4);
            v20 = a6 + v28 * 8;
            v24 = v5 + v1;
            v12 = v28;
            v23 = v12 + v4;
            v21 = v4;
            v22 = v5;
            goto LABEL_9e75d4;
        }
        else if ((int)v13 >= 2)
        {
            v16 = arm64g_calculate_condition(3, v13, 2, 0);
            if (!(v16 & 1))
            {
                if (v13 == 3)
                    goto LABEL_9e7558;
                v17 = 1;
                if (v13 == 4)
                {
                    v18 = v12;
                    sub_9e7168(a6, a1, a1 + v1, v18 + a4, v0);
                    v12 = v18;
                    sub_9e7168(a6 + v12 * 8, v5 + v1, v5, v12 + v4, v4);
LABEL_9e75dc:
                    v17 = 1;
                }
            }
            else
            {
                v19 = v12;
                sub_9e7168(a6, a1, a1 + v1, v19 + a4, v0);
                v20 = a6 + v19 * 8;
                v21 = -(unsigned int)v4;
                v22 = v5 + v1;
                v12 = v19;
                v23 = v12 + v4;
                v24 = v5;
LABEL_9e75d4:
                sub_9e7168(v20, v24, v22, v23, v21);
                v14 = 0;
                goto LABEL_9e75dc;
            }
        }
        else
        {
LABEL_9e7558:
            v17 = 0;
        }
LABEL_9e75e0:
        v30 = (unsigned int)a3 & 0x7ffffffe;
        if (v30 == 8 && !v6)
        {
            v31 = a3 & 0xffffffff;
            v32 = a6 + (a3 & 0xffffffff) * 8;
            if (v17)
                sub_9dc418(v32, a6, a6 + v12 * 8);
            else
                memset(v32, 0, 64);
            sub_9dc418(a0, a1, v5);
            sub_9dc418(&a0[v31], a1 + v1, v5 + v1);
        }
        else if (v30 == 16 && !v6)
        {
            v31 = a3 & 0xffffffff;
            v33 = a6 + (a3 & 0xffffffff) * 8;
            if (v17)
                sub_9dbcc4(v33, a6, a6 + v12 * 8);
            else
                memset(v33, 0, 128);
            sub_9dbcc4(a0, a1, v5);
            sub_9dbcc4(&a0[v31], a1 + v1, v5 + v1);
        }
        else
        {
            v0 = v14;
            v34 = a6 + (unsigned int)a3 * 2 * 8;
            v31 = a3 & 0xffffffff;
            v35 = a6 + (a3 & 0xffffffff) * 8;
            if (v17)
                sub_9e7384(v35, a6, a6 + v12 * 8, v12, 0, 0, v34);
            else
                _bzero(v35, v31 * 8);
            sub_9e7384(a0, a1, v5, v12, 0, 0, v34);
            sub_9e7384(&a0[v31], a1 + v1, v5 + v1, v12, a4, v4, v34);
            v14 = v0;
        }
        v36 = v31 * 8;
        v37 = sub_9dbad4(a6, a0, (char *)a0 + v36, a3);
        v38 = a6 + v36;
        if (v14 & 1)
            v39 = sub_9dbad4(v38, a6 + v36, a6, a3) + v37;
        else
            v39 = v37 - sub_9dbbc8(v38, a6, a6 + v36, a3);
        v40 = sub_9dbad4(&a0[v12], &a0[v12], a6 + v36, a3);
        v41 = v39 + (unsigned int)v40;
        v42 = arm64g_calculate_condition(1, v39, v40 & 0xffffffff, 0);
        if (v42 & 1)
            return v40;
        v43 = v12 + a3;
        v44 = a0[v43 & 0xffffffff];
        a0[v43 & 0xffffffff] = v44 + v41;
        v45 = arm64g_calculate_condition(50, v44, v41, 0);
        if (v45 & 1)
            return v40;
        iter = &a0[v43 + 1];
        do
        {
            v47 = *iter;
            *iter = v47 + 1;
            iter += 1;
            v48 = arm64g_calculate_condition(0x22, v47, 1, 0);
        } while (v48 & 1);
        return v40;
    }
}
