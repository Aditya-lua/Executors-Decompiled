/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9eaf10..0x9eb0e4 (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9eaf10(unsigned long long *a0, long long a1, unsigned long long a2, long long a3)
{
    long long v2;  // x20
    long long v3;  // x21
    unsigned long long v12;  // x26
    unsigned long long v13;  // x23
    unsigned int v14;  // w0
    unsigned int v15;  // w22
    unsigned long long v16;  // x0
    int v17;  // w9
    unsigned long long v18;  // 4116
    unsigned long long v19;  // x8
    unsigned long long v20;  // x10
    unsigned long long v21;  // 4135
    long long v4;  // x22
    unsigned long long *iter;  // x8
    unsigned long v23;  // x9
    unsigned long long v24;  // 4115
    long long v5;  // x23
    unsigned long long v6;  // x0
    long long v7;  // x2
    long long v8;  // x0
    long long v9;  // x1
    long long v10;  // x24
    unsigned long long v11;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((unsigned int)a2 != 8 && (unsigned int)a2 != 4)
    {
        v2 = a3;
        if (15 < (int)a2)
        {
            v3 = (unsigned int)a2 / 2;
            v4 = a1 + (v3 & 0xffffffff) * 8;
            v5 = a1;
            v6 = sub_9e5878(a1, v4, v3);
            if ((int)v6 >= 1)
            {
                v7 = v4;
                v8 = v2;
                v9 = v5;
                goto LABEL_9eafd0;
            }
            else if (!(v6 >> 31 & 1))
            {
                v10 = v2 + (unsigned int)a2 * 2 * 8;
                v11 = (a2 * 8 | a2 >> 61) & 0x7fffffff8 & 0x7ffffffff;
                v12 = a2 & 0xffffffff;
                _bzero(v2 + v11, v11);
            }
            else
            {
                v7 = v5;
                v8 = v2;
                v9 = v4;
LABEL_9eafd0:
                sub_9dbbc8(v8, v9, v7, v3);
                v10 = v2 + (unsigned int)a2 * 2 * 8;
                v12 = a2 & 0xffffffff;
                sub_9eaf10(v2 + (a2 & 0xffffffff) * 8, v2, v3, v10);
            }
            sub_9eaf10(a0, v5, v3, v10);
            v13 = v12 * 8;
            sub_9eaf10((char *)a0 + v13, v4, v3, v10);
            v14 = sub_9dbad4(v2, a0, (char *)a0 + v13, a2);
            v15 = v14 - sub_9dbbc8(v2 + v13, v2, v2 + v13, a2);
            v16 = sub_9dbad4(&a0[v3], &a0[v3], v2 + v13, a2);
            v17 = v15 + (unsigned int)v16;
            v18 = arm64g_calculate_condition(1, v15, v16 & 0xffffffff, 0);
            if (v18 & 1)
                return v16;
            v19 = v3 + a2;
            v20 = a0[v19 & 0xffffffff];
            a0[v19 & 0xffffffff] = v20 + v17;
            v21 = arm64g_calculate_condition(50, v20, v17, 0);
            if (v21 & 1)
                return v16;
            iter = &a0[v19 + 1];
            do
            {
                v23 = *iter;
                *iter = v23 + 1;
                iter += 1;
                v24 = arm64g_calculate_condition(0x22, v23, 1, 0);
            } while (v24 & 1);
            return v16;
        }
    }
}
