/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4b494..0xb4b778 (740 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4b494_0 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_b4b494_0;

extern st_b4b494_0 g_eeeb08;
extern long long g_f0a5c4;
extern void g_f14390;

long long sub_b4b494(long long a0)
{
    long long v10;  // x0
    long long v11;  // w22
    unsigned long v20;  // x0
    unsigned long long v21;  // 4123
    unsigned long long v22;  // 4112
    unsigned int v23;  // w0
    unsigned long long v24;  // 4117
    unsigned long long v25;  // 4112
    unsigned long v26;  // x21
    unsigned long long v27;  // 4118
    long long v28;  // w26
    long long count;  // x22
    long long v12;  // w22
    long long v30;  // w26
    unsigned long v31;  // x0
    unsigned long long v32;  // 4118
    unsigned long long v33;  // 4112
    long long v34;  // x0
    long long v13;  // x21
    long long v14;  // x0
    long long v15;  // x0
    long long v16;  // x20
    long long v17;  // x23
    long long v18;  // x23
    void* v19;  // x27
    unsigned int v0;  // [bp-0x188]
    unsigned short v1;  // [bp-0x184]
    unsigned long v2;  // [bp-0x180]
    unsigned int v3;  // [bp-0x170]
    unsigned int v4;  // [bp-0xf8]
    unsigned short v5;  // [bp-0xf4]
    unsigned long v6;  // [bp-0xf0]
    unsigned int v7;  // [bp-0xe0]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = sub_aa9854();
    if (v10)
    {
        v11 = 3;
        do
        {
            v12 = v11 - 1;
            if (v11 < 1)
                break;
            if (!_CCRandomGenerateBytes(sub_aa9bbc(a0, v10), v10))
                v13 = v10;
            else
                v13 = -0x1;
            if (1 <= v13)
            {
                sub_aa9c70(a0, v13, v13 * 8);
                v10 -= v13;
                v12 = 3;
                continue;
            }
            else if (*(int *)___error() != 4)
            {
                break;
            }
        } while ((v11 = v12, v10));
    }
    v14 = sub_aa982c(a0);
    if (v14)
        return v14;
    v15 = sub_aa9854(a0, 1);
    if (v15)
    {
        v16 = v15;
        v17 = 0;
        do
        {
            v18 = v17;
            v19 = &(&g_f14390)[24 * v18];
            v20 = *(int *)v19;
            v21 = arm64g_calculate_condition(1, v20 & 0xffffffff, 1, 0);
            if (v21 & 1 || !(v22 = arm64g_calculate_condition(1, _fstat(v20, &v4) & 0xffffffff, 1, 0), !(v22 & 1) && (int)v19[4] == v4 && (long long)v19[8] == v6 && 0x200 > (v5 ^ (short)v19[16]) && (int)v19[20] == v7))
            {
                v23 = _open((&g_eeeb08.field_0)[v18], 0);
                *(unsigned int *)v19 = v23;
                v24 = arm64g_calculate_condition(1, v23, 1, 0);
                if (v24 & 1)
                    goto LABEL_b4b718;
                v25 = arm64g_calculate_condition(1, _fstat() & 0xffffffff, 1, 0);
                if (!(v25 & 1))
                {
                    *(unsigned int *)&v19[4] = v0;
                    *(unsigned long *)&v19[8] = v2;
                    *(unsigned short *)&v19[16] = v1;
                    *(unsigned int *)&v19[20] = v3;
                }
                else
                {
                    _close(*(int *)v19);
                    *(unsigned int *)v19 = 0xffffffff;
                    if (!v16)
                        break;
                    else
                        goto LABEL_b4b71c;
                }
            }
            v26 = *(int *)v19;
            v27 = arm64g_calculate_condition(1, v26 & 0xffffffff, 1, 0);
            if (!(v27 & 1))
            {
                v28 = 2;
                do
                {
                    count = _read(v26, sub_aa9bbc(a0, v16), v16);
                    if (count >= 1)
                    {
                        sub_aa9c70(a0, count, count * 8);
                        v16 -= count;
                        v30 = 3;
                        continue;
                    }
                    else
                    {
                        v30 = v28;
                        if (count < 0 && (v30 = v28, *(int *)___error() != 4))
                            goto LABEL_b4b698;
                        else
                            goto LABEL_b4b674;
                    }
LABEL_b4b674:
                } while (v16 && (v28 = v30 - 1, 0 < v30));
                if (count < 0 || !(int)g_f0a5c4)
                {
LABEL_b4b698:
                    v31 = *(int *)v19;
                    v32 = arm64g_calculate_condition(1, v31 & 0xffffffff, 1, 0);
                    if (!(v32 & 1))
                    {
                        v33 = arm64g_calculate_condition(1, _fstat(v31, &v4) & 0xffffffff, 1, 0);
                        if (!(v33 & 1) && (int)v19[4] == v4 && (long long)v19[8] == v6 && 0x200 > (v5 ^ (short)v19[16]) && (int)v19[20] == v7)
                            _close(*(int *)v19);
                    }
                    *(unsigned int *)v19 = 0xffffffff;
                }
                v16 = sub_aa9854(a0, 1);
            }
LABEL_b4b718:
            if (!v16)
                break;
LABEL_b4b71c:
        } while ((v17 = v18 + 1, (unsigned long long)v18 < 3));
    }
    v34 = sub_aa982c(a0);
    if (v34)
        return v34;
    return sub_aa982c(a0);
}
